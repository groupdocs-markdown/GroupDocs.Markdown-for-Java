package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.asbase64strategy;

import com.groupdocs.markdown.*;

public class Base64Explicit {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new ExportImagesAsBase64Strategy());

        try (MarkdownConverter converter = new MarkdownConverter("business-plan.pdf")) {
            converter.convert("base64-explicit.md", options);
        }
    }
}
