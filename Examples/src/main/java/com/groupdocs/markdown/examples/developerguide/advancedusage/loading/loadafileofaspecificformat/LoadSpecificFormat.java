package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadafileofaspecificformat;

import com.groupdocs.markdown.*;

public class LoadSpecificFormat {
    public static void run() throws Exception {
        // Explicitly specify the format to skip auto-detection
        LoadOptions loadOptions = new LoadOptions(FileFormat.XLSX);

        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx", loadOptions)) {
            converter.convert("load-specific-format.md");
        }
    }
}
