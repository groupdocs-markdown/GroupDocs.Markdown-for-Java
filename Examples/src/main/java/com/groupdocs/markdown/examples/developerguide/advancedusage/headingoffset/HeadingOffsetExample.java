package com.groupdocs.markdown.examples.developerguide.advancedusage.headingoffset;

import com.groupdocs.markdown.*;

public class HeadingOffsetExample {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setHeadingLevelOffset(2);

        MarkdownConverter.toFile("annual-report.docx", "heading-offset-example.md", options);

        // Source: # Title     → Output: ### Title
        // Source: ## Section  → Output: #### Section
        // Heading levels are clamped to the range 1-6.
    }
}
