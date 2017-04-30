package com.omega.commons.constants;

/**
 * Status of bonus plan.
 * <p>
 * @author Daryl Handley
 *
 */


public enum BonusPlanStatus {

    NOT_ACTIVE  ("NOT_ACTIVE","Not Active"),
    CANCELED  ("CANCELED","Canceled"),
    ACTIVE("ACTIVE", "Active"),
    EXPIRED("EXPIRED", "Expired");


    private final String code;
    private final String description;

    BonusPlanStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BonusPlanStatus fromCode(String code) {
        for (BonusPlanStatus element : BonusPlanStatus.values()) {
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
