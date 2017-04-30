package com.omega.commons.constants;
/**
 * Type of action taken on a User. Applies to UserActionLog.
 *
 */


public enum GameMessageType {
    HIT_LOSS_LIMIT ("HIT_LOSS_LIMIT","Hit Loss Limit"),
    HIT_WAGER_LIMIT ("HIT_WAGER_LIMIT","Hit Wager Limit");

    private final String code;
    private final String description;

    GameMessageType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static GameMessageType fromCode(String code) {
        for (GameMessageType element : GameMessageType.values()) {
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
