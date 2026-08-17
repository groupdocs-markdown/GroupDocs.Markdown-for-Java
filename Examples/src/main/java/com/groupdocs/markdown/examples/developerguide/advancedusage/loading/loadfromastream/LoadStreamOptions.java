package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadfromastream;

import com.groupdocs.markdown.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadStreamOptions {
    public static void run() throws Exception {
        LoadOptions loadOptions = new LoadOptions(FileFormat.DOCX);

        try (InputStream stream = new FileInputStream("document");
             MarkdownConverter converter = new MarkdownConverter(stream, loadOptions)) {

            converter.convert("load-stream-options.md");
        }
    }
}
