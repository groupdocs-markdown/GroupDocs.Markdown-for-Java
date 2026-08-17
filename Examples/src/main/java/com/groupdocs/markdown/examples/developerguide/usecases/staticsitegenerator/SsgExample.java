package com.groupdocs.markdown.examples.developerguide.usecases.staticsitegenerator;

import com.groupdocs.markdown.*;

public class SsgExample {
    public static void run() throws Exception {
        ExportImagesToFileSystemStrategy imageStrategy =
                new ExportImagesToFileSystemStrategy("content/posts/images");
        imageStrategy.setImagesRelativePath("images");

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setIncludeFrontMatter(true);
        options.setHeadingLevelOffset(1);   // Reserve H1 for the page title
        options.setImageExportStrategy(imageStrategy);

        MarkdownConverter.toFile("annual-report.docx", "content/posts/annual-report.md", options);

        // Output file starts with:
        // ---
        // title: "Annual Report 2025"
        // author: "Finance Team"
        // format: Docx
        // pages: 24
        // ---
        //
        // ## Executive Summary
        // ...
    }
}
