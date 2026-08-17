package com.groupdocs.markdown.examples.developerguide.advancedusage.frontmatter;

import com.groupdocs.markdown.*;

public class FrontMatterCombined {
    public static void run() throws Exception {
        DocumentConvertOptions options = new DocumentConvertOptions();
        options.setIncludeFrontMatter(true);
        options.setHeadingLevelOffset(1);

        MarkdownConverter.toFile("annual-report.docx", "front-matter-combined.md", options);
    }
}
