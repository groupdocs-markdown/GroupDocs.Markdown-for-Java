package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadfromastream;

import com.groupdocs.markdown.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadStreamExample {
    public static void run() throws Exception {
        try (InputStream stream = new FileInputStream("business-plan.docx");
             MarkdownConverter converter = new MarkdownConverter(stream)) {

            converter.convert("load-stream-example.md");
        }
    }
}
