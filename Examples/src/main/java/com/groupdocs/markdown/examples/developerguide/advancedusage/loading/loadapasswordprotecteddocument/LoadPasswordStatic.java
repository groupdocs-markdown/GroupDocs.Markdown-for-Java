package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadapasswordprotecteddocument;

import com.groupdocs.markdown.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoadPasswordStatic {
    public static void run() throws Exception {
        LoadOptions loadOptions = new LoadOptions(FileFormat.DOCX);
        loadOptions.setPassword("secret");

        // Static one-liner
        String markdown = MarkdownConverter.toMarkdown("protected.docx", loadOptions);
        Files.write(Paths.get("load-password-static.md"), markdown.getBytes(StandardCharsets.UTF_8));
    }
}
