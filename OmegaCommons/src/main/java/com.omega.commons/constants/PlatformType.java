package com.omega.commons.constants;

/**
 * Created by IntelliJ IDEA.
 * User: Song Leo
 * Date: 10/23/12
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public enum PlatformType {
    CASINO ("CASINO","Casino"),
    POKER ("POKER","Poker"),
    SPORTSBOOK ("SPORTSBOOK","Sportsbook"),
    BINGO ("BINGO","Bingo"),
    SSW("SSW", "Seamless Secondary Wallet");

    private final String code;
    private final String description;

    PlatformType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static ActionType fromCode(String code) {
        for (ActionType element : ActionType.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return description;
    }

}