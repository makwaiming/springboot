package com.omega.commons.constants;

/**
 * Author: Zheng Chen
 * Date: 01/10/12
 * Time: 4:26 PM
 */
public enum WinStatus {
    NO_PAYOUT(0, "NO_PAYOUT"),
    PAYOUT_READY(1, "PAYOUT_READY"),
    PAID_OUT(2, "PAID_OUT"),
    PAYOUT_BLOCKED(3,"PAYOUT_BLOCKED"),
    UNKNOWN(4,"UNKNOWN");

    private final int code;
    private final String description;

    WinStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static WinStatus fromCode(int code) {
        for (WinStatus element : WinStatus.values()) {
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
