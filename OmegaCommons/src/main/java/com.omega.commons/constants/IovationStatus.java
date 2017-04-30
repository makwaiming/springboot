package com.omega.commons.constants;

/**
 * Created by songleo on 2017-01-31.
 */
public enum IovationStatus {

    UNKNOWN ("N/A", "N/A"),
    ALLOW ("ALLOW", "Allow"),
    DENY ("DENY", "Deny"),
    REVIEW("REVIEW", "Review");


    private final String code;
    private final String description;

    IovationStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static IovationStatus fromCode(String code) {
        for (IovationStatus activeStatus : IovationStatus.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus;
            }
        }
        return null;
    }

    public static IovationStatus fromDescription(String description) {
        for (IovationStatus activeStatus : IovationStatus.values()) {
            if (activeStatus.getDescription().equalsIgnoreCase(description)) {
                return activeStatus;
            }
        }
        return null;
    }

    public String toString() {
        return code;
    }
}
