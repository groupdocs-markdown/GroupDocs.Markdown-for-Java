package com.groupdocs.markdown.examples.gettingstarted.licensingandsubscription;

import com.groupdocs.markdown.Metered;

public class LicenseMetered {
    public static void run() throws Exception {
        String publicKey = "";   // Your public license key
        String privateKey = "";  // Your private license key

        Metered metered = new Metered();
        metered.setMeteredKey(publicKey, privateKey);

        // Get amount (MB) consumed
        Double amountConsumed = Metered.getConsumptionQuantity();
        System.out.println("Amount (MB) consumed: " + amountConsumed);

        // Get count of credits consumed
        Double creditsConsumed = Metered.getConsumptionCredit();
        System.out.println("Credits consumed: " + creditsConsumed);
    }
}
