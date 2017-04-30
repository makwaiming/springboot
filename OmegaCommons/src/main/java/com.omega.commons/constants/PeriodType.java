package com.omega.commons.constants;

/**
 * Type of Period for IPS
 * <p> 
 * @author Zheng Chen
 *
 */


public enum PeriodType {

    DAILY("daily", "Daily"),
    HOURLY("hourly", "Hourly");

    private final String code;
    private final String description;

    PeriodType(String code, String description) {
        this.code = code.toLowerCase();
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static PeriodType fromCode(String code) {
        for (PeriodType element : PeriodType.values()) {
            if (element.getCode().equalsIgnoreCase(code)) {
                return element; 
            }
        }
        return null; 
    }    
    
    public String toString() {
        return description; 
    }

}
