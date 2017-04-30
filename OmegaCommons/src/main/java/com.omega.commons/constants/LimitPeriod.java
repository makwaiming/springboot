package com.omega.commons.constants;

/**
 * Limit Period (Daily, Weekly, Monthly, etc)
 * <p> 
 * @author Waiming Mak
 *
 */


public enum LimitPeriod {

    DAILY("DAILY", "Daily"),
    WEEKLY("WEEKLY", "Weekly"),
    MONTHLY("MONTHLY", "Monthly"),
    MINUTE("MINUTE", "Minutes");


    private final String code;
    private final String description;

    LimitPeriod(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static LimitPeriod fromCode(String code) {
        for (LimitPeriod element : LimitPeriod.values()) {
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
