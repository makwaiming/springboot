package com.omega.commons.constants;


public enum UserServiceReturnCode {
    SUCCESS("SUCCESS", "Success"),
    DUPLICATE_EMAIL("DUPLICATE_EMAIL", "Duplicate Email"),
    DUPLICATE_USERID("DUPLICATE_USERID", "Duplicate UserId");

    private final String code;
    private final String description;

    UserServiceReturnCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static UserServiceReturnCode fromCode(String code) {
        for (UserServiceReturnCode element : UserServiceReturnCode.values()) {
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
