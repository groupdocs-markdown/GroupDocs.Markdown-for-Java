package com.groupdocs.markdown.examples.developerguide.advancedusage.convertspecificpages;

import com.groupdocs.markdown.*;

public class SpecificPagesInstance {
    public static void run() throws Exception {
        try (MarkdownConverter converter = new MarkdownConverter("business-plan.docx")) {
            DocumentConvertOptions options = new DocumentConvertOptions();
            options.setPageNumbers(new int[] { 1, 3 });

            converter.convert("specific-pages-instance.md", options);
        }
    }
}
