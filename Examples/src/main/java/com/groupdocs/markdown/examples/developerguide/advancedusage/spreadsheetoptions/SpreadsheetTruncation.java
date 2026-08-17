package com.groupdocs.markdown.examples.developerguide.advancedusage.spreadsheetoptions;

import com.groupdocs.markdown.*;

public class SpreadsheetTruncation {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setMaxColumns(8);   // Only first 8 columns
        options.setMaxRows(50);     // Only first 50 data rows per sheet

        MarkdownConverter.toFile("cost-analysis.xlsx", "spreadsheet-truncation.md", options);

        // Truncated columns/rows show "..." indicators.
        // Warnings are reported by DocumentConvertResult.getWarnings().
    }
}
