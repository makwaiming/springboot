package com.omega.commons.constants;

/**
 * The status of a Loyalty Item
 * <p> 
 * @author Waiming Mak
 *
 */


public enum LoyaltyItemStatus {


    AVAILABLE ("AVAILABLE","Available"),
    NOT_AVAILABLE ("NOT_AVAILABLE","Not Available");


    private final String code;
    private final String description;

    LoyaltyItemStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static LoyaltyItemStatus fromCode(String code) {
        for (LoyaltyItemStatus element : LoyaltyItemStatus.values()) {
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
