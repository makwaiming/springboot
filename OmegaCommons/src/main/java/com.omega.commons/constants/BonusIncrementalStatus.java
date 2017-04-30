package com.omega.commons.constants;

/**
 * Status of bonus incremental
 *
 */


public enum BonusIncrementalStatus {

    CANCELED  ("CANCELED","Canceled"),
    ACTIVE ("ACTIVE","Active"),
    COMPLETED ("COMPLETED","Completed");

    private final String code;
    private final String description;

    BonusIncrementalStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BonusIncrementalStatus fromCode(String code) {
        for (BonusIncrementalStatus element : BonusIncrementalStatus.values()) {
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
