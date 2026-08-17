package com.groupdocs.markdown.examples.developerguide.usecases.staticsitegenerator;

import com.groupdocs.markdown.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SsgBatchHugo {

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
        String outputDir = "content/docs";

        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setIncludeFrontMatter(true);
        options.setHeadingLevelOffset(1);
        options.setImageExportStrategy(new SkipImagesStrategy());   // or file system

        File[] files = new File(inputDir).listFiles();
        if (files == null) {
            files = new File[0];
        }

        for (File file : files) {
            if (!EXTENSIONS.contains(extension(file.getName()))) {
                continue;
            }

            try {
                String outputPath =
                        new File(outputDir, baseName(file.getName()) + ".md").getPath();

                MarkdownConverter.toFile(file.getPath(), outputPath, options);
                System.out.println("Converted: " + file.getName());
            } catch (Exception e) {
                System.out.println("Skipped: " + file.getName() + " — " + e.getMessage());
            }
        }
    }
}
