package com.omega.commons.constants;

/**
 * Author: Zheng Chen
 * Date: 01/10/12
 * Time: 4:26 PM
 */
public enum BettingStatus {
    OPEN(0, "OPEN"),
    FINISHED(1, "FINISHED"),
    CANCELLED(2, "CANCELLED"),
    ROLLBACKED(3,"ROLLBACKED"),
    HOTLINE_CANCELLED(4,"HOTLINE_CANCELLED"),
    NOT_CONFIRMED(5,"NOT_CONFIRMED"),
    PENDING(6,"PENDING"),
    PENDING_RELEASED(7,"PENDING_RELEASED"),
    PENDING_CHANGED(8,"PENDING_CHANGED"),
    PENDING_REJECTED(9,"PENDING_REJECTED");

    private final int code;
    private final String description;

    BettingStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static BettingStatus fromCode(int code) {
        for (BettingStatus element : BettingStatus.values()) {
            if (element.getCode() == code) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }
}
