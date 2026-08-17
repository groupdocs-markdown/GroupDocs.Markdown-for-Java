package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportpdf;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportPdfStatic {
    public static void run() throws Exception {
        // Set license (optional)
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        // Convert PDF to Markdown string
        String markdown = MarkdownConverter.toMarkdown("business-plan.pdf");

        // Or save directly to a file
        MarkdownConverter.toFile("business-plan.pdf", "export-pdf-static.md");
    }
}
