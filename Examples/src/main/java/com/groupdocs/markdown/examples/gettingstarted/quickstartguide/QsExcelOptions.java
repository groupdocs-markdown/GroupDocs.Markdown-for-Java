package com.groupdocs.markdown.examples.gettingstarted.quickstartguide;

import com.groupdocs.markdown.*;

public class QsExcelOptions {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setMaxColumns(8);
        options.setMaxRows(50);
        options.setIncludeFrontMatter(true);
        options.setFlavor(MarkdownFlavor.GITHUB);

        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx")) {

            // Inspect before converting
            DocumentInfo info = converter.getDocumentInfo();
            System.out.println("Worksheets: " + info.getPageCount());

            // Convert
            DocumentConvertResult result = converter.convert("qs-excel-options.md", options);

            // Check warnings
            for (String w : result.getWarnings()) {
                System.out.println("Warning: " + w);
            }
        }
    }
}
