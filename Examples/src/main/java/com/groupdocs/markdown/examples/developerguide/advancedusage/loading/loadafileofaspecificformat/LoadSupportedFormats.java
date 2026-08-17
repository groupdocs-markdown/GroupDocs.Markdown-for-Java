package com.groupdocs.markdown.examples.developerguide.advancedusage.loading.loadafileofaspecificformat;

import com.groupdocs.markdown.*;
import java.util.List;

public class LoadSupportedFormats {
    public static void run() throws Exception {
        List<FileFormat> formats = MarkdownConverter.getSupportedFormats();
        for (FileFormat fmt : formats) {
            System.out.println(fmt);
        }
    }
}
