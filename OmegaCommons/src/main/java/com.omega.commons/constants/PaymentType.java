package com.omega.commons.constants;
/**
 * <p> 
 * @author Daryl Handley
 *
 */


public enum PaymentType {
    DEPOSIT ("DEPOSIT","Deposit"),
    WITHDRAWAL ("WITHDRAWAL","Withdrawal");
    
    private final String code;   
    private final String description; 
    
    PaymentType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static PaymentType fromCode(String code) {
        for (PaymentType element : PaymentType.values()) {
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
