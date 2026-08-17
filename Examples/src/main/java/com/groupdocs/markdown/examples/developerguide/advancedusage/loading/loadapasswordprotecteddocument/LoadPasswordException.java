package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadapasswordprotecteddocument;

import com.groupdocs.markdown.*;

public class LoadPasswordException {
    public static void run() throws Exception {
        try {
            String markdown = MarkdownConverter.toMarkdown("protected.docx");
        } catch (GroupDocsMarkdownException e) {
            System.out.println("Cannot open document: " + e.getMessage());
        }
    }
}
