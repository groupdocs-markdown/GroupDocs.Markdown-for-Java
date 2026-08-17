package com.groupdocs.markdown.examples.developerguide.usecases.convertforrag;

import com.groupdocs.markdown.*;
import java.util.regex.Pattern;

public class RagBasic {

    // Matches a newline followed by a level-1 or level-2 heading marker
    private static final Pattern HEADING = Pattern.compile("\\n#{1,2} ");

    public static void run() throws Exception {
        // Convert document to Markdown — skip images for text-only RAG
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setImageExportStrategy(new SkipImagesStrategy());
        options.setFlavor(MarkdownFlavor.COMMON_MARK);

        String markdown = MarkdownConverter.toMarkdown("professional-services.pdf", options);

        // Split into chunks by headings
        String[] chunks = HEADING.split(markdown);

        for (String chunk : chunks) {
            if (chunk.isEmpty()) {
                continue;
            }
            // Send each chunk to your embedding model
            String preview = chunk.substring(0, Math.min(80, chunk.length()));
            System.out.println("Chunk (" + chunk.length() + " chars): " + preview + "...");
        }
    }
}
