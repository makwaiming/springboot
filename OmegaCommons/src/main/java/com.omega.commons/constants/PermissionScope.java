package com.omega.commons.constants;

/**
 * The status of a payment (pending, completed, ....). Maps in database to a single letter code.
 * <p> 
 * @author Daryl Handley
 *
 */


public enum PermissionScope {


    TABLE ("TABLE","Table"),
    PAGE("PAGE", "Page");


    private final String code;
    private final String description;

    PermissionScope(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static PermissionScope fromCode(String code) {
        for (PermissionScope element : PermissionScope.values()) {
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
