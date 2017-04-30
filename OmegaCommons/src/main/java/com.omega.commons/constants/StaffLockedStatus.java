package com.omega.commons.constants;
/** 
 * The staff locked status
 * <p> 
 * @author Zheng Chen
 *
 */


public enum StaffLockedStatus {

    NOT_LOCKED("NOT_LOCKED", "Not Locked"),
    PASSWORD_FAIL_LOCKED("PASSWORD_FAIL_LOCKED", "Locked since wrong password attempted too many times"),
    LOCKED_BY_STAFF("LOCKED_BY_STAFF", "Locked By Staff");

    private final String code;
    private final String description;

    StaffLockedStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static StaffLockedStatus fromCode(String code) {
        for (StaffLockedStatus lockedStatus : StaffLockedStatus.values()) {
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
