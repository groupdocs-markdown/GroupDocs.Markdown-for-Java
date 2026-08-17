package com.groupdocs.markdown.examples.developerguide.advancedusage.asyncapi;

import com.groupdocs.markdown.*;
import java.util.concurrent.CompletableFuture;

public class AsyncConcurrent {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setHeadingLevelOffset(1);

        CompletableFuture<Void> word =
                MarkdownConverterAsync.toFileAsync("business-plan.docx", "async-word.md", options);
        CompletableFuture<Void> pdf =
                MarkdownConverterAsync.toFileAsync("business-plan.pdf", "async-pdf.md", options);

        // Wait for both to finish
        CompletableFuture.allOf(word, pdf).join();

        System.out.println("Both conversions complete.");
    }
}
