package com.omega.commons.constants;

/**
 */
public enum ManualBankFieldType {
    TEXT ("TEXT", "TEXT"),
    DATE ("DATE", "DATE"),
    SELECT("SELECT", "SELECT"),
    PHONENUMBER ("PHONENUMBER", "PHONENUMBER");

    private final String code;
    private final String description;

    ManualBankFieldType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ManualBankFieldType fromCode(String code) {
        for (ManualBankFieldType element : ManualBankFieldType.values()) {
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
