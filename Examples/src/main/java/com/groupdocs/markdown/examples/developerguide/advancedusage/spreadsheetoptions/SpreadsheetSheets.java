package com.groupdocs.markdown.examples.developerguide.advancedusage.spreadsheetoptions;

import com.groupdocs.markdown.*;

public class SpreadsheetSheets {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setSheetSeparator("\n---\n");     // Separator between worksheets
        options.setIncludeHiddenSheets(false);    // Skip hidden worksheets (default)

        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx")) {
            DocumentConvertResult result = converter.convert("spreadsheet-sheets.md", options);

            for (String warning : result.getWarnings()) {
                System.out.println("Warning: " + warning);
            }
            // e.g. "Worksheet 'Data' truncated at 50 rows."
        }
    }
}
