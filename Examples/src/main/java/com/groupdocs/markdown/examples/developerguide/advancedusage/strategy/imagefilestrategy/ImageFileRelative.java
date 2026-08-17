package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.imagefilestrategy;

import com.groupdocs.markdown.*;

public class ImageFileRelative {
    public static void run() throws Exception {
        ExportImagesToFileSystemStrategy strategy =
                new ExportImagesToFileSystemStrategy("output/images");
        strategy.setImagesRelativePath("images");

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(strategy);

        MarkdownConverter.toFile("business-plan.pdf", "output/document.md", options);

        // Markdown output contains: ![](images/img-001.png)
        // Image file saved to:     output/images/img-001.png
    }
}
