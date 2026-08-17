package com.groupdocs.markdown.examples.developerguide.basicusage.convert.exporttext;

import com.groupdocs.markdown.*;
import java.io.File;

public class ExportTextInstance {
    public static void run() throws Exception {
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }

        try (MarkdownConverter converter = new MarkdownConverter("llms-tech.xml")) {
            DocumentConvertOptions options = new DocumentConvertOptions();
            options.setHeadingLevelOffset(1);

            converter.convert("export-text-instance.md", options);
        }
    }
}
