package com.omega.commons.constants;

public class BonusPlanHelper {

    public static String getManualBonusName(String brandName){
        return brandName.replaceAll(" ","")+"_ManualBonusPlan";
    }

    public static String getManualBonusBonusCode(String brandName){
        String result = getManualBonusName(brandName);
        return result.length() > 50 ? result.substring(0,50) : result;
    }

}
