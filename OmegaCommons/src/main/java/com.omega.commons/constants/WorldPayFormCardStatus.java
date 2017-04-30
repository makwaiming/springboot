package com.omega.commons.constants;

/**
 * The WorldPay Form Card status
 * <p> 
 * @author Waiming Mak
 *
 */


public enum WorldPayFormCardStatus {

    PENDING   ("PENDING",   "Pending"),
    READY     ("READY",     "Ready"),
    CANCELLED ("CANCELLED", "Cancelled");



    private final String code;
    private final String description;

    WorldPayFormCardStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static WorldPayFormCardStatus fromCode(String code) {
        for (WorldPayFormCardStatus lockedStatus : WorldPayFormCardStatus.values()) {
            if (lockedStatus.getCode().equals(code)) {
                return lockedStatus; 
            }
        }
        return null; 
    }    
    
    public String toString() {
        return description; 
    }

}
