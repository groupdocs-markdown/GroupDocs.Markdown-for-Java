package com.groupdocs.markdown.examples.gettingstarted.licensingandsubscription;

import com.groupdocs.markdown.License;

public class LicenseInstanceFile {
    public static void run() throws Exception {
        String licensePath = "GroupDocs.Markdown.lic";

        License license = new License();
        license.setLicense(licensePath);
    }
}
