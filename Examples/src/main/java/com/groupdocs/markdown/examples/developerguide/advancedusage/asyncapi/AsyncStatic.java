package com.groupdocs.markdown.examples.developerguide.advancedusage.asyncapi;

import com.groupdocs.markdown.*;

public class AsyncStatic {
    public static void run() throws Exception {
        // Convert to string
        String md = MarkdownConverterAsync.toMarkdownAsync("business-plan.docx").join();

        // Convert to file — options are required, pass null for the defaults
        MarkdownConverterAsync.toFileAsync("business-plan.docx", "report.md", null).join();

        // With options
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setIncludeFrontMatter(true);
        String withFrontMatter =
                MarkdownConverterAsync.toMarkdownAsync("business-plan.docx", null, options).join();

        // Get document info
        DocumentInfo info = MarkdownConverterAsync.getInfoAsync("business-plan.docx", null).join();
        System.out.println(info.getFileFormat() + ", " + info.getPageCount() + " pages");
    }
}
