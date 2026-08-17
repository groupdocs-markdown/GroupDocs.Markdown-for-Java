package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadapasswordprotecteddocument;

import com.groupdocs.markdown.*;

public class LoadPasswordInstance {
    public static void run() throws Exception {
        LoadOptions loadOptions = new LoadOptions(FileFormat.XLSX);
        loadOptions.setPassword("secret");

        try (MarkdownConverter converter = new MarkdownConverter("protected.xlsx", loadOptions)) {
            converter.convert("load-password-instance.md");
        }
    }
}
