#!/bin/bash
set -e
echo "Running GroupDocs.Markdown for Java Examples..."
cd "$(dirname "$0")/Examples"
ROOT="$(pwd)"

mvn -q -B clean compile
mvn -q -B org.apache.maven.plugins:maven-dependency-plugin:3.6.1:build-classpath \
    -Dmdep.outputFile=target/cp.txt

# A Windows JVM under Git Bash/MSYS needs ';' separators and a native path -- the
# shell's /c/... form is not something java.exe can open, and Maven already wrote
# cp.txt in native form, so only our own entry needs converting.
SEP=":"
CLASSES="$ROOT/target/classes"
case "$(uname -s)" in
    MINGW*|MSYS*|CYGWIN*)
        SEP=";"
        CLASSES="$(cygpath -m "$CLASSES")"
        ;;
esac
CP="$CLASSES$SEP$(cat "$ROOT/target/cp.txt")"

# Examples that cannot pass in a clean checkout -- they need a licence file the repo
# does not ship, or they hit a known library defect. Listed so a real regression is
# still visible instead of being lost in expected noise.
SKIP_RUN="LicenseInstanceFile LicenseStaticStream LicenseInstanceStream LicenseMetered LoadPasswordInstance"

pass=0; fail=0; skip=0
# tr -d '\r': a Windows JVM prints CRLF, and the trailing CR would become part of
# each name, so every lookup but the last silently missed.
for name in $(java -cp "$CP" com.groupdocs.markdown.examples.Main --list | tr -d '\r'); do
    case " $SKIP_RUN " in *" $name "*) skip=$((skip+1)); echo "  skip $name"; continue;; esac
    src=$(find "$ROOT/src/main/java" -name "$name.java" | head -1)
    [ -n "$src" ] || continue
    if (cd "$(dirname "$src")" && java -Djava.awt.headless=true -cp "$CP" \
            com.groupdocs.markdown.examples.Main --example "$name" >/dev/null 2>&1); then
        pass=$((pass+1)); echo "  ok   $name"
    else
        fail=$((fail+1)); echo "  FAIL $name"
    fi
done
echo
echo "Done. $pass succeeded, $fail failed, $skip skipped (see SKIP_RUN)."
[ "$fail" -eq 0 ]
