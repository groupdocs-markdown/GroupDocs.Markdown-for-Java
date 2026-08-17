package com.groupdocs.markdown.examples.gettingstarted.quickstartguide;

import com.groupdocs.markdown.*;

public class QsPdfWithImages {
    public static void run() throws Exception {
        ExportImagesToFileSystemStrategy strategy =
                new ExportImagesToFileSystemStrategy("output/images");
        strategy.setImagesRelativePath("images");

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(strategy);

        MarkdownConverter.toFile("business-plan.pdf", "output/report.md", options);

        // Images saved to output/images/
        // Markdown references: ![](images/img-001.png)
    }
}
