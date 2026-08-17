package com.groupdocs.markdown.examples.developerguide.basicusage.getdocumentinfo;

import com.groupdocs.markdown.*;

public class GetInfoInstance {
    public static void run() throws Exception {
        try (MarkdownConverter converter = new MarkdownConverter("cost-analysis.xlsx")) {
            DocumentInfo info = converter.getDocumentInfo();

            System.out.println("Format:    " + info.getFileFormat());
            System.out.println("Pages:     " + info.getPageCount());
            System.out.println("Title:     " + info.getTitle());
            System.out.println("Author:    " + info.getAuthor());
            System.out.println("Encrypted: " + info.isEncrypted());
        }
    }
}
