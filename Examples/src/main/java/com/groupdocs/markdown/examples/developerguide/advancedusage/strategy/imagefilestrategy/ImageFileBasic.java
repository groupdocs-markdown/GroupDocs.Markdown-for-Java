package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.imagefilestrategy;

import com.groupdocs.markdown.*;

public class ImageFileBasic {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new ExportImagesToFileSystemStrategy("output/images"));

        MarkdownConverter.toFile("business-plan.pdf", "output/document.md", options);
    }
}
