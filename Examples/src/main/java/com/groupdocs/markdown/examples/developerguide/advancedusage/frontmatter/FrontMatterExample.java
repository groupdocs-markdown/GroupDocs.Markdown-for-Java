package com.groupdocs.markdown.examples.developerguide.advancedusage.frontmatter;

import com.groupdocs.markdown.*;

public class FrontMatterExample {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setIncludeFrontMatter(true);

        MarkdownConverter.toFile("business-plan.docx", "front-matter-example.md", options);
        // Output:
        // ---
        // title: "Q3 Report"
        // author: "Jane Doe"
        // format: Docx
        // pages: 12
        // ---
        //
        // # Q3 Report
        // ...
    }
}
