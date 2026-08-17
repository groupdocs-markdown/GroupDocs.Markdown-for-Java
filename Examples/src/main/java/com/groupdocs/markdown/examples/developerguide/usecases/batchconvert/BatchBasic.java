package com.groupdocs.markdown.examples.developerguide.usecases.batchconvert;

import com.groupdocs.markdown.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class BatchBasic {

    /** Java has no Path.GetExtension / GetFileNameWithoutExtension, so define them once. */
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

        // Get supported extensions
        Set<String> supported = new HashSet<>();
        for (FileFormat format : MarkdownConverter.getSupportedFormats()) {
            supported.add("." + format.toString().toLowerCase());
        }

        int converted = 0;
        int skipped = 0;

        File[] files = new File(inputDir).listFiles();
        if (files == null) {
            files = new File[0];
        }

        for (File file : files) {
            String ext = extension(file.getName());
            if (!supported.contains(ext)) {
                continue;
            }

            String outputPath = new File(outputDir, baseName(file.getName()) + ".md").getPath();

            try {
                MarkdownConverter.toFile(file.getPath(), outputPath);
                converted++;
                System.out.println("OK: " + file.getName());
            } catch (Exception e) {
                skipped++;
                System.out.println("SKIP: " + file.getName() + " — " + e.getMessage());
            }
        }

        System.out.println("Done: " + converted + " converted, " + skipped + " skipped");
    }
}
