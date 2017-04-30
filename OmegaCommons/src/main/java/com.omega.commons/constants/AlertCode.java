package com.omega.commons.constants;

/**
 * The code for alert.
 * <p/>
 *
 * @author Zheng Chen
 */


public enum AlertCode {


    CMS_UNCAUGHT("CMS_UNCAUGHT", "UncaughtCMS"),
    PS_UNCAUGHT("PS_UNCAUGHT", "UncaughtPS"),
    BONUS_ERROR("BONUS_ERROR", "BonusError"),
    MG_POKER_BONUS_ERROR("MGP_BONUS_ERROR", "Poker Bonus Error"),
    MAIL_ERROR("MAIL_ERROR", "Mail error");


    private final String code;
    private final String description;

    AlertCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static AlertCode fromCode(String code) {
        for (AlertCode element : AlertCode.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }

}
