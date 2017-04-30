package com.omega.commons.constants;
/**
 * Type of action taken on a User. Applies to UserActionLog.
 *
 */


public enum LoginExecutedBy {
    PLAYER ("PLAYER","Player"),
    SYSTEM ("SYSTEM","System");

    private final String code;
    private final String description;

    LoginExecutedBy(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static LoginExecutedBy fromCode(String code) {
        for (LoginExecutedBy element : LoginExecutedBy.values()) {
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
