package com.groupdocs.markdown.examples.gettingstarted.licensingandsubscription;

import com.groupdocs.markdown.License;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LicenseInstanceStream {
    public static void run() throws Exception {
        try (InputStream stream = new FileInputStream("GroupDocs.Markdown.lic")) {
            License license = new License();
            license.setLicense(stream);
        }
    }
}
