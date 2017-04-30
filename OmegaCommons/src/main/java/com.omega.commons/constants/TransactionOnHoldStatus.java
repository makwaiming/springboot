package com.omega.commons.constants;

/**
 *
 */


public enum TransactionOnHoldStatus {


    ON_HOLD ("ON_HOLD","On Hold"),
    CLEARED ("CLEARED","Cleared"),
    CANCELLED ("CANCELLED","Cancelled");

    private final String code;
    private final String description;

    TransactionOnHoldStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static TransactionOnHoldStatus fromCode(String code) {
        for (TransactionOnHoldStatus element : TransactionOnHoldStatus.values()) {
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
