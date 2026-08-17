package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportwordprocessing;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportWordStatic {
    public static void run() throws Exception {
        // Set license (optional)
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        // Convert DOCX to Markdown string
        String markdown = MarkdownConverter.toMarkdown("business-plan.docx");

        // Or save directly to a file
        MarkdownConverter.toFile("business-plan.docx", "export-word-static.md");
    }
}
