package com.omega.commons.constants;

/**
 * Type of player limit
 * <p> 
 * @author Zheng Chen
 *
 */


public enum LimitType {

//    DAILY_LIMIT("DAILY_LIMIT", "Daily Limit"),    // This should go to LimitPeriod
//    WEEKLY_LIMIT("WEEKLY_LIMIT", "Weekly Limit"), // This should go to LimitPeriod
    DEPOSIT_LIMIT("DEPOSIT_LIMIT", "Deposit Limit"),
    LOSS_LIMIT("LOSS_LIMIT", "Loss Limit"),
    WAGER_LIMIT("WAGER_LIMIT", "Wager Limit"),
    SESSION_LIMIT("SESSION_LIMIT", "Session Limit"),
    REMOVE_SESSION_LIMIT("REMOVE_SESSION_LIMIT", "Remove Session Limit"),
    REMOVE_LOSS_LIMIT("REMOVE_LOSS_LIMIT", "Remove Loss Limit"),
    REMOVE_WAGER_LIMIT("REMOVE_WAGER_LIMIT", "Remove Wager Limit");


    private final String code;
    private final String description;

    LimitType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static LimitType fromCode(String code) {
        for (LimitType element : LimitType.values()) {
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
