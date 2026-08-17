package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.imageskipstrategy;

import com.groupdocs.markdown.*;

public class SkipImagesInstance {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new SkipImagesStrategy());

        try (MarkdownConverter converter = new MarkdownConverter("business-plan.pdf")) {
            converter.convert("skip-images-instance.md", options);
        }
    }
}
