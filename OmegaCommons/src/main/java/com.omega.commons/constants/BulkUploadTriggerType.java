package com.omega.commons.constants;

/**
 * Type of trigger for a bonus plan. Determines what the event is that triggers the bonus on a players account
 * (Deposit, Manual by admin, Player enters code,, ...) 
 * <p> 
 * @author Song Leo
 *
 */


public enum BulkUploadTriggerType {


    BONUS ("BONUS","Bonus"),
    ADJUMENT ("ADJUSTMENT","Adjustment"),
    FREESPIN ("FREESPIN","Freespin");


    private final String code;
    private final String description;

    BulkUploadTriggerType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BulkUploadTriggerType fromCode(String code) {
        for (BulkUploadTriggerType element : BulkUploadTriggerType.values()) {
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
