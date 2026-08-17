@echo off
setlocal enabledelayedexpansion
echo Running GroupDocs.Markdown for Java Examples...
cd Examples

call mvn -q -B clean compile || exit /b 1
call mvn -q -B org.apache.maven.plugins:maven-dependency-plugin:3.6.1:build-classpath ^
    -Dmdep.outputFile=target\cp.txt || exit /b 1
set /p DEPS=<target\cp.txt
set CP=target\classes;!DEPS!

set PASS=0
set FAIL=0
for /f "delims=" %%N in ('java -cp "!CP!" com.groupdocs.markdown.examples.Main --list') do (
    for /f "delims=" %%D in ('dir /s /b /a-d src\main\java\%%N.java 2^>nul') do (
        pushd "%%~dpD"
        java -Djava.awt.headless=true -cp "!CP!" com.groupdocs.markdown.examples.Main --example %%N >nul 2>&1
        if errorlevel 1 (set /a FAIL+=1 & echo   FAIL %%N) else (set /a PASS+=1 & echo   ok   %%N)
        popd
    )
)
echo.
echo Done. !PASS! succeeded, !FAIL! failed.
if !FAIL! gtr 0 exit /b 1
