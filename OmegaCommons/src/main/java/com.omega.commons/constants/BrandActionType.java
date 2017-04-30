package com.omega.commons.constants;

/**
 * Created by chenzheng on 2016-03-18.
 */
public enum BrandActionType {
    TRANSACTION_DATA_FEED("TRANSACTION_DATA_FEED", 60);
    private final String code;
    private final Integer coolDownInterval;

    BrandActionType(String code, Integer coolDownInterval) {
        this.code = code;
        this.coolDownInterval = coolDownInterval;
    }

    public static BrandActionType fromCode(String code) {
        for (BrandActionType element : BrandActionType.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public Integer getCoolDownInterval() {
        return coolDownInterval;
    }

    public String toString() {
        return code;
    }


}
