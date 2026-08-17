package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportspreadsheet;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportSpreadsheetStatic {
    public static void run() throws Exception {
        // Set license (optional)
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        // Convert XLSX to Markdown string
        String markdown = MarkdownConverter.toMarkdown("cost-analysis.xlsx");

        // Or save directly to a file
        MarkdownConverter.toFile("cost-analysis.xlsx", "export-spreadsheet-static.md");
    }
}
