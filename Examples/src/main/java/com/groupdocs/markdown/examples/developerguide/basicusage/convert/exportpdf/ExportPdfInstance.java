package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exportpdf;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportPdfInstance {
    public static void run() throws Exception {
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        try (MarkdownConverter converter = new MarkdownConverter("business-plan.pdf")) {
            ExportImagesToFileSystemStrategy strategy = new ExportImagesToFileSystemStrategy("images");
            strategy.setImagesRelativePath("images");

            DocumentConvertOptions options = new DocumentConvertOptions();
            options.setImageExportStrategy(strategy);
            options.setHeadingLevelOffset(1);

            converter.convert("export-pdf-instance.md", options);
        }
    }
}
