package com.omega.commons.constants;

/**
 * Created by songleo on 2017-02-22.
 */
public enum IovationRuleType {
    DEPOSIT("DEPOSIT", "Deposit"),
    WITHDRAWAL("WITHDRAWAL", "Withdrawal"),
    LOGIN("LOGIN", "Login"),
    SIGNUP("SIGNUP", "Signup");

    private final String code;
    private final String description;

    IovationRuleType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static AlertCode fromCode(String code) {
        for (AlertCode element : AlertCode.values()) {
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
