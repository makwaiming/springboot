package com.omega.commons.constants;

/**
 * Status of bonus. 
 * <p>
 * @author Daryl Handley
 *
 */


public enum BonusStatus {

    EXPIRED ("EXPIRED","Expired"),
    QUEUED ("QUEUED","Queued"),
    RELEASED ("RELEASED","Released"),
    CANCELED  ("CANCELED","Canceled"),
    ACTIVE ("ACTIVE","Active"),
    SPENT ("SPENT","Spent"),
    SPENT_ACTIVE("SPENT_ACTIVE", "Spent Active"),
    QUALIFIED ("QUALIFIED","Qualified");

    private final String code;
    private final String description;

    BonusStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BonusStatus fromCode(String code) {
        for (BonusStatus element : BonusStatus.values()) {
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
