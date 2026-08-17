package com.groupdocs.markdown.examples.productoverview;

import com.groupdocs.markdown.*;

public class QuickExample {
    public static void run() throws Exception {
        // One-liner
        String md = MarkdownConverter.toMarkdown("business-plan.docx");
        // # Quarterly Report
        //
        // ## Executive Summary
        //
        // This report covers the key initiatives...

        // With options
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setFlavor(MarkdownFlavor.GITHUB);
        options.setIncludeFrontMatter(true);
        options.setHeadingLevelOffset(1);

        MarkdownConverter.toFile("business-plan.docx", "quick-example.md", options);
    }
}
