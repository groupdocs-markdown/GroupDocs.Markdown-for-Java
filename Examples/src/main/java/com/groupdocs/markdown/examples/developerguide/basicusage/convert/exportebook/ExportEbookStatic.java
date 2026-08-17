package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportebook;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportEbookStatic {
    public static void run() throws Exception {
        // Set license (optional)
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        // Convert EPUB to Markdown string
        String markdown = MarkdownConverter.toMarkdown("business-plan.epub");

        // Or save directly to a file
        MarkdownConverter.toFile("business-plan.epub", "export-ebook-static.md");
    }
}
