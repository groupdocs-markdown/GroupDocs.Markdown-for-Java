package com.groupdocs.markdown.examples.developerguide.usecases.convertforrag;

import com.groupdocs.markdown.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RagBatch {

    /** Java has no Path.ChangeExtension equivalent. */
    private static String changeExtension(String path, String newExtension) {
        int dot = path.lastIndexOf('.');
        return (dot < 0 ? path : path.substring(0, dot)) + newExtension;
    }

    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new SkipImagesStrategy());

        File[] files = new File("documents").listFiles(
                (dir, name) -> name.toLowerCase().endsWith(".pdf"));
        if (files == null) {
            files = new File[0];
        }

        for (File file : files) {
            try {
                String markdown = MarkdownConverter.toMarkdown(file.getPath(), options);
                String outputPath = changeExtension(file.getPath(), ".md");
                Files.write(Paths.get(outputPath), markdown.getBytes(StandardCharsets.UTF_8));
                System.out.println("Converted: " + file.getPath());
            } catch (GroupDocsMarkdownException e) {
                System.out.println("Skipped " + file.getPath() + ": " + e.getMessage());
            }
        }
    }
}
