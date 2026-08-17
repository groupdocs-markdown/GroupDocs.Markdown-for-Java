package com.groupdocs.markdown.examples.developerguide.advancedusage.convertspecificpages;

import com.groupdocs.markdown.*;

public class SpecificPagesFile {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setPageNumbers(new int[] { 2, 4, 5 });

        MarkdownConverter.toFile("business-plan.pdf", "specific-pages-file.md", options);
    }
}
