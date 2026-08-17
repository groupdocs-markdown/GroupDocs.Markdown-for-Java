package com.groupdocs.markdown.examples.developerguide.advancedusage.strategy.customstrategy;

import com.groupdocs.markdown.*;
import com.groupdocs.markdown.imageexport.IImageSavingHandler;

public class CustomStrategyRename {

    // Implement the IImageSavingHandler interface
    static class RenameHandler implements IImageSavingHandler {

        private int index;

        @Override
        public void handle(CustomImageSavingArgs args) {
            args.setOutputImageFileName("img_" + index + "_" + args.getImageFileName());
            index++;
        }
    }

    public static void run() throws Exception {
        // Use the handler with CustomImagesStrategy
        RenameHandler handler = new RenameHandler();

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new CustomImagesStrategy("output/images", handler));

        MarkdownConverter.toFile("business-plan.docx", "output/document.md", options);
    }
}
