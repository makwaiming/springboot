package com.omega.commons.constants;

/**
 *
 */


public enum PermissionType {


    ENABLE_EXPORT ("ENABLE_EXPORT","Enable export"),
    HIDE_DATA("HIDE_DATA", "Hide Data");


    private final String code;
    private final String description;

    PermissionType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static PermissionType fromCode(String code) {
        for (PermissionType element : PermissionType.values()) {
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
