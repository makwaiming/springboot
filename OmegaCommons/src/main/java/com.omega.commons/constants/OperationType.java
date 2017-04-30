package com.omega.commons.constants;

/**
 * Created by songleo on 2017-01-31.
 */
public enum OperationType {
    SIGNUP ("SIGNUP", "Signup"),
    LOGIN ("LOGIN", "Login"),
    DEPOSIT ("DEPOSIT", "Deposit"),
    WITHDRAWAL("WITHDRAWAL", "Withdrawal");


    private final String code;
    private final String description;

    OperationType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static OperationType fromCode(String code) {
        for (OperationType activeType : OperationType.values()) {
            if (activeType.getCode().equals(code)) {
                return activeType;
            }
        }
        return null;
    }

    public static OperationType fromDescription(String description) {
        for (OperationType activeType : OperationType.values()) {
            if (activeType.getDescription().equalsIgnoreCase(description)) {
                return activeType;
            }
        }
        return null;
    }

    public String toString() {
        return code;
    }


}
