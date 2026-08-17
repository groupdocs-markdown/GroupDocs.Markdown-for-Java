package com.groupdocs.markdown.examples.developerguide.advancedusage.markdownflavor;

import com.groupdocs.markdown.*;

public class FlavorCommonmark {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setFlavor(MarkdownFlavor.COMMON_MARK);

        MarkdownConverter.toFile("business-plan.docx", "flavor-commonmark.md", options);
    }
}
