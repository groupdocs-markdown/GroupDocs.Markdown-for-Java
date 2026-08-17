package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exporttext;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportTextStatic {
    public static void run() throws Exception {
        // Set license (optional)
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        // Convert XML to Markdown string
        String markdown = MarkdownConverter.toMarkdown("llms-tech.xml");

        // Or save directly to a file
        MarkdownConverter.toFile("llms-tech.xml", "export-text-static.md");
    }
}
