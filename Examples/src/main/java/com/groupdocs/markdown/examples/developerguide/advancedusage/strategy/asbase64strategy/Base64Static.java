package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.asbase64strategy;

import com.groupdocs.markdown.*;

public class Base64Static {
    public static void run() throws Exception {
        // Default behavior -- images are embedded as Base64
        MarkdownConverter.toFile("business-plan.pdf", "base64-static.md");
    }
}
