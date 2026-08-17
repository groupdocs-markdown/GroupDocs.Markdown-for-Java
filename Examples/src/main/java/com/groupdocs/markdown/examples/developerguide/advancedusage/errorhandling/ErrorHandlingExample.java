package com.groupdocs.markdown.examples.developerguide.advancedusage.errorhandling;

import com.groupdocs.markdown.*;

public class ErrorHandlingExample {
    public static void run() throws Exception {
        try {
            MarkdownConverter.toFile("annual-report.docx", "error-handling-example.md");
        } catch (GroupDocsMarkdownException e) {
            System.out.println("Conversion failed: " + e.getMessage());
        }
    }
}
