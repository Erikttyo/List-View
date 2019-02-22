package com.firman.belajar.palmerahapps;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Firman on 2/5/2019.
 */
public class Utils {

    public static String formatIDR(String currencySymbol, long idr) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(currencySymbol);
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIDR.setDecimalFormatSymbols(formatRp);

        return kursIDR.format(idr);
    }
}
