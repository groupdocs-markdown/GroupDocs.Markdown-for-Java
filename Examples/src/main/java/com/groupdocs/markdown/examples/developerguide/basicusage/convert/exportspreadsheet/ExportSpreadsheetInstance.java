package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportspreadsheet;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportSpreadsheetInstance {
    public static void run() throws Exception {
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx")) {
            DocumentConvertOptions options = new DocumentConvertOptions();
            options.setMaxColumns(10);
            options.setMaxRows(100);
            options.setHeadingLevelOffset(1);

            converter.convert("export-spreadsheet-instance.md", options);
        }
    }
}
