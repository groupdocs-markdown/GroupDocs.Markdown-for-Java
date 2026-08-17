package com.groupdocs.markdown.examples.developerguide.advancedusage.errorhandling;

import com.groupdocs.markdown.*;

public class WarningsExample {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setMaxRows(10);

        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx")) {
            DocumentConvertResult result = converter.convert("warnings-example.md", options);

            for (String warning : result.getWarnings()) {
                System.out.println("Warning: " + warning);
            }
        }
    }
}
