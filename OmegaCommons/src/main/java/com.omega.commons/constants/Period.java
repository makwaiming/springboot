package com.omega.commons.constants;

/**
 * Type of Period for Dashboard activity
 * <p> 
 * @author Zheng Chen
 *
 */


public enum Period {

    TODAY("TODAY", "today"),
    YESTERDAY("YESTERDAY", "Yesterday"),
    WTD("WTD", "Week to Date"),
    MTD("MTD", "Month to Date");

    private final String code;
    private final String description;

    Period(String code, String description) {
        this.code = code.toLowerCase();
        this.description = description;         
    }
    
    public static Period fromCode(String code) {
        for (Period element : Period.values()) {
            if (element.getCode().equalsIgnoreCase(code)) {
                return element;
            }
        }
        return null;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String toString() {
        return description; 
    }

}
