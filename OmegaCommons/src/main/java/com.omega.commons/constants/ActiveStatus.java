package com.omega.commons.constants;
/** 
 * The players active status (active, inactive, dormant, test account, ...) 
 * <p> 
 * @author Daryl Handley
 *
 */


public enum ActiveStatus {
    
    ACTIVE ("1", "Active"), 
    INACTIVE ("0", "Suspended");  

    
    private final String code;   
    private final String description; 
    
    ActiveStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static ActiveStatus fromCode(String code) {
        for (ActiveStatus activeStatus : ActiveStatus.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus; 
            }
        }
        return null; 
    }

    public static ActiveStatus fromDescription(String description) {
        for (ActiveStatus activeStatus : ActiveStatus.values()) {
            if (activeStatus.getDescription().equalsIgnoreCase(description)) {
                return activeStatus;
            }
        }
        return null;
    }

    public String toString() {
        return description; 
    }

}
