# GroupDocs.Markdown for Java - Code Examples

[![banner](https://raw.githubusercontent.com/groupdocs/groupdocs.github.io/master/img/banners/groupdocs-markdown-java-banner.png)](https://releases.groupdocs.com/markdown/java/)

[Product Page](https://products.groupdocs.com/markdown/java/) | [Docs](https://docs.groupdocs.com/markdown/java/) | [Demos](https://products.groupdocs.app/markdown/family) | [API Reference](https://reference.groupdocs.com/markdown/java/) | [Blog](https://blog.groupdocs.com/categories/groupdocs.markdown-product-family/) | [Free Support](https://forum.groupdocs.com/c/markdown) | [Temporary License](https://purchase.groupdocs.com/temporary-license)

[GroupDocs.Markdown for Java](https://products.groupdocs.com/markdown/java/) is a document-processing library that exports PDF, Word, Excel, EPUB and 20+ other formats to clean, structured Markdown -- built for AI/LLM pipelines, static site generators and document-processing workflows.

Each example is a small, self-contained class that opens a sample file, does one thing, and
writes an output — the same code published on the [developer guide](https://docs.groupdocs.com/markdown/java/developer-guide/).

## Features

- **20+ input formats**: PDF, Word, Excel, EPUB, MOBI, TXT, CHM and more.
- **Markdown flavor control**: GitHub Flavored Markdown or strict CommonMark.
- **Flexible image handling**: embed as Base64, export to the file system, skip, or supply a custom handler.
- **YAML front matter**: auto-extract document metadata for Jekyll, Hugo and Docusaurus.
- **No external dependencies**: no Microsoft Office or Adobe software required.

## Get Started

1. **Set Up Environment**: Ensure that JDK 8 or later and [Apache Maven](https://maven.apache.org/) are installed.

2. **Get the Code**: Clone or download this repository.

   ```bash
   git clone git@github.com:groupdocs-markdown/GroupDocs.Markdown-for-Java.git
   cd ./GroupDocs.Markdown-for-Java/Examples
   ```

3. **Configure License (Optional)**: If you have a license file, set the `GROUPDOCS_LIC_PATH`
   environment variable to its path, or drop a `*.lic` file next to where you run the examples.
   By default GroupDocs.Markdown runs in evaluation mode and adds trial watermarks. You can
   [get a temporary license](https://purchase.groupdocs.com/temporary-license) to test all features.

4. **Run the Examples**: from the repository root,

   ```bash
   ./run_all_examples.sh          # macOS / Linux
   run_all_examples.bat           # Windows
   ```

   Each example reads its sample files by bare relative name from its own folder, so the
   script runs every one with the working directory set accordingly. Running
   `mvn exec:java` straight from `Examples/` compiles fine but cannot find any input.

   To run a single example, `cd` to the folder holding its `.java` file first:

   ```bash
   cd Examples
   mvn -q -B compile
   mvn -q -B org.apache.maven.plugins:maven-dependency-plugin:3.6.1:build-classpath -Dmdep.outputFile=target/cp.txt
   CP="$(pwd)/target/classes:$(cat target/cp.txt)"

   java -cp "$CP" com.groupdocs.markdown.examples.Main --list          # every example name
   cd "$(dirname "$(find src/main/java -name 'QuickExample.java')")"
   java -cp "$CP" com.groupdocs.markdown.examples.Main --example QuickExample
   ```

   The package is served from the [GroupDocs Java repository](https://releases.groupdocs.com/markdown/java/), declared in `pom.xml`
   (it is not on Maven Central).

## More Resources

Find additional details and examples in the [GroupDocs.Markdown for Java documentation](https://docs.groupdocs.com/markdown/java/).

We also offer **GroupDocs.Markdown** packages for other platforms:
* [**GroupDocs.Markdown for .NET**](https://products.groupdocs.com/markdown/net/)
* [**GroupDocs.Markdown for Python via .NET**](https://products.groupdocs.com/markdown/python-net/)

---

[Product Page](https://products.groupdocs.com/markdown/java/) | [Docs](https://docs.groupdocs.com/markdown/java/) | [Demos](https://products.groupdocs.app/markdown/family) | [API Reference](https://reference.groupdocs.com/markdown/java/) | [Blog](https://blog.groupdocs.com/categories/groupdocs.markdown-product-family/) | [Free Support](https://forum.groupdocs.com/c/markdown) | [Temporary License](https://purchase.groupdocs.com/temporary-license)
