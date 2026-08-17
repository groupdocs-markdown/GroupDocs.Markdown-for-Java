package com.groupdocs.markdown.examples.developerguide.basicusage.getdocumentinfo;

import com.groupdocs.markdown.*;

public class GetInfoStatic {
    public static void run() throws Exception {
        DocumentInfo info = MarkdownConverter.getInfo("business-plan.docx");

        System.out.println("Format:    " + info.getFileFormat());   // Docx
        System.out.println("Pages:     " + info.getPageCount());    // 42
        System.out.println("Title:     " + info.getTitle());        // "Q3 Report"
        System.out.println("Author:    " + info.getAuthor());       // "Jane Doe"
        System.out.println("Encrypted: " + info.isEncrypted());     // false
    }
}
