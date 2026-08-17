package com.groupdocs.markdown.examples.developerguide.advancedusage.markdownflavor;

import com.groupdocs.markdown.*;

public class FlavorGfm {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setFlavor(MarkdownFlavor.GITHUB);

        MarkdownConverter.toFile("business-plan.docx", "flavor-gfm.md", options);

        // Tables are rendered as:
        // | Column A | Column B |
        // | --- | --- |
        // | value1 | value2 |
    }
}
