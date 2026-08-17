package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadfromalocaldisk;

import com.groupdocs.markdown.*;

public class LoadDiskInstance {
    public static void run() throws Exception {
        try (MarkdownConverter converter = new MarkdownConverter("business-plan.docx")) {
            // Retrieve document metadata
            DocumentInfo info = converter.getDocumentInfo();
            System.out.println("Format: " + info.getFileFormat() + ", Pages: " + info.getPageCount());

            // Convert to Markdown
            converter.convert("load-disk-instance.md");
        }
    }
}
