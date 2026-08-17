package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.customstrategy;

import com.groupdocs.markdown.*;
import com.groupdocs.markdown.imageexport.IImageSavingHandler;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomStrategyReplace {

    static class WatermarkHandler implements IImageSavingHandler {

        @Override
        public void handle(CustomImageSavingArgs args) {
            try {
                // Replace the original image with a custom placeholder
                InputStream placeholder = new FileInputStream("placeholder.png");
                args.setReplacementImage(placeholder);
                args.setOutputImageFileName("placeholder.png");
            } catch (IOException e) {
                throw new IllegalStateException("placeholder.png not found", e);
            }
        }
    }

    public static void run() throws Exception {
        WatermarkHandler handler = new WatermarkHandler();

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new CustomImagesStrategy("output/images", handler));

        MarkdownConverter.toFile("business-plan.docx", "output/document.md", options);
    }
}
