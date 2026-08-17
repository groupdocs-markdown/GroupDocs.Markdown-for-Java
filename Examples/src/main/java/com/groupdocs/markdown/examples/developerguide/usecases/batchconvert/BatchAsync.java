package com.groupdocs.markdown.examples.developerguide.usecases.batchconvert;

import com.groupdocs.markdown.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class BatchAsync {

    private static final List<String> EXTENSIONS =
            Arrays.asList(".docx", ".pdf", ".xlsx", ".epub");


    private static String extension(String fileName) {
        int dot = fileName.lastIndexOf('.');
        return dot < 0 ? "" : fileName.substring(dot).toLowerCase();
    }


    private static String baseName(String fileName) {
        int dot = fileName.lastIndexOf('.');
        return dot < 0 ? fileName : fileName.substring(0, dot);
    }

    public static void run() throws Exception {
        String inputDir = "documents";
        String outputDir = "output";

        Files.createDirectories(Paths.get(outputDir));

        File[] files = new File(inputDir).listFiles(
                (dir, name) -> EXTENSIONS.contains(extension(name)));
        if (files == null) {
            files = new File[0];
        }

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new SkipImagesStrategy());

        // toFileAsync already runs off the calling thread — do not wrap in a parallel stream
        List<CompletableFuture<Void>> futures = Arrays.stream(files)
                .map(file -> {
                    String outputPath =
                            new File(outputDir, baseName(file.getName()) + ".md").getPath();

                    return MarkdownConverterAsync.toFileAsync(file.getPath(), outputPath, options)
                            .thenRun(() -> System.out.println("OK: " + file.getName()))
                            .exceptionally(e -> {
                                System.out.println("SKIP: " + file.getName() + " — " + e.getMessage());
                                return null;
                            });
                })
                .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture<?>[0])).join();
    }
}
