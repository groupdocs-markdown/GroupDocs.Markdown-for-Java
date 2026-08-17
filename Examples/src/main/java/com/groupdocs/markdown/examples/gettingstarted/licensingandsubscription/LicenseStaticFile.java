package com.groupdocs.markdown.examples.gettingstarted.licensingandsubscription;

import com.groupdocs.markdown.License;
import java.io.File;

public class LicenseStaticFile {
    public static void run() throws Exception {
        // Set the license using the static method
        if (new File("GroupDocs.Markdown.lic").exists()) {
            License.set("GroupDocs.Markdown.lic");
        }
    }
}
