package com.omega.commons.constants;
/**
 * Type of action taken on a User. Applies to UserActionLog.
 *
 */


public enum LoginType {
    LOGIN ("LOGIN","Login"),
    LOGOUT ("LOGOUT","Logout");

    private final String code;
    private final String description;

    LoginType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static LoginType fromCode(String code) {
        for (LoginType element : LoginType.values()) {
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
