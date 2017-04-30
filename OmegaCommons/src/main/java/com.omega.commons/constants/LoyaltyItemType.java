package com.omega.commons.constants;

/**
 * Created by volcanohong on AD 2017-03-06.
 */
public enum LoyaltyItemType {
    FREE_SPIN("FREE_SPIN", "Free Spin"),
    BONUS_PLAN("BONUS_PLAN", "Bonus Plan"),
    NORMAL_ITEM("NORMAL_ITEM", "Normal Item");

    private final String code;
    private final String description;

    LoyaltyItemType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static LoyaltyItemType fromCode(String code) {
        for (LoyaltyItemType activeStatus : LoyaltyItemType.values()) {
            if (activeStatus.getCode().equalsIgnoreCase(code)) {
                return activeStatus;
            }
        }
        return null;
    }

    public static LoyaltyItemType fromDescription(String description) {
        for (LoyaltyItemType activeStatus : LoyaltyItemType.values()) {
            if (activeStatus.getDescription().equalsIgnoreCase(description)) {
                return activeStatus;
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
