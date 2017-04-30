package com.omega.commons.constants;

/**
 * Type of award for a bonus plan. Used to determine whether the bonus is a flat amount or a percentage of the
 * deposit. 
 * <p>
 * @author Daryl Handley
 *
 */


public enum BonusAwardType {


    FLAT ("FLAT","Flat Amount"),
    PERCENT ("PERCENT","Percent");

    private final String code;
    private final String description;
    
    BonusAwardType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BonusAwardType fromCode(String code) {
        for (BonusAwardType element : BonusAwardType.values()) {
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
