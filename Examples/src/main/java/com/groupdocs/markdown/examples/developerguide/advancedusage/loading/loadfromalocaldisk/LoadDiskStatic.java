package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadfromalocaldisk;

import com.groupdocs.markdown.*;

public class LoadDiskStatic {
    public static void run() throws Exception {
        // Convert a local file to Markdown in one call
        String markdown = MarkdownConverter.toMarkdown("business-plan.docx");

        // Or save the result directly to a file
        MarkdownConverter.toFile("business-plan.docx", "load-disk-static.md");
    }
}
