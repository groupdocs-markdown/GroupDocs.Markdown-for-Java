package com.groupdocs.markdown.examples.developerguide.advancedusage.convertspecificpages;

import com.groupdocs.markdown.*;

public class SpecificPagesStatic {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setPageNumbers(new int[] { 1, 3 });

        // Convert only pages 1 and 3
        MarkdownConverter.toFile("business-plan.docx", "specific-pages-static.md", options);
    }
}
