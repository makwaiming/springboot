package com.omega.commons.constants;

/**
 * Author: Zheng Chen
 * Date: 01/10/12
 * Time: 4:26 PM
 */
public enum ResultType {
    FULL_TIME(0, "FULL_TIME"),
    OVERTIME(14, "OVERTIME"),
    PENALTY(16, "PENALTY"),
    UNKNOWN(-999, "UNKNOWN");


    private final int code;
    private final String description;

    ResultType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ResultType fromCode(int code) {
        for (ResultType element : ResultType.values()) {
            if (element.getCode() == code) {
                return element;
            }
        }
        return ResultType.UNKNOWN;
    }

    public String toString() {
        return description;
    }
}
