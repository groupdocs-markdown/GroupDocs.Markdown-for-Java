package com.groupdocs.markdown.examples.gettingstarted.quickstartguide;

import com.groupdocs.markdown.*;

public class QsWordToMd {
    public static void run() throws Exception {
        // Convert a Word document to Markdown
        String markdown = MarkdownConverter.toMarkdown("business-plan.docx");

        // Or save directly to a file
        MarkdownConverter.toFile("business-plan.docx", "qs-word-to-md.md");
    }
}
