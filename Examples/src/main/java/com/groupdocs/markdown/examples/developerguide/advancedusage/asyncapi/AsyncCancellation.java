package com.groupdocs.markdown.examples.developerguide.advancedusage.asyncapi;

import com.groupdocs.markdown.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncCancellation {
    public static void run() throws Exception {
        CompletableFuture<Void> future = MarkdownConverterAsync.toFileAsync(
                "professional-services.pdf",
                "async-cancellation.md",
                null);

        try {
            future.get(30, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            future.cancel(true);   // interrupt the running conversion
            System.out.println("Conversion timed out.");
        }
    }
}
