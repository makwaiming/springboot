package com.omega.commons.constants;
/**
 * Type of action taken on a User. Applies to UserActionLog.
 *
 */


public enum FundType {
    REAL ("REAL","Real(Deposited Funds)"),
    RELEASED_BONUS ("RELEASED_BONUS","Released Bonus"),
    PLAYABLE_BONUS ("PLAYABLE_BONUS","Playable Bonus");


    private final String code;
    private final String description;

    FundType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static FundType fromCode(String code) {
        for (FundType element : FundType.values()) {
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
