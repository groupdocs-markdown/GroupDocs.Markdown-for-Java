package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.imageskipstrategy;

import com.groupdocs.markdown.*;

public class SkipImagesStatic {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new SkipImagesStrategy());

        MarkdownConverter.toFile("business-plan.pdf", "skip-images-static.md", options);
    }
}
