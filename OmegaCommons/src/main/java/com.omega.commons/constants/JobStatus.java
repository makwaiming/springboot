package com.omega.commons.constants;
/** 
 * The players active status (active, inactive, dormant, test account, ...) 
 * <p> 
 * @author Daryl Handley
 *
 */


public enum JobStatus {
    PENDING ("PENDING", "Pending"),
    SUCCESS ("SUCCESS", "Success"),
    FAILED ("FAILED", "Failed");


    private final String code;
    private final String description;

    JobStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public static JobStatus fromCode(String code) {
        for (JobStatus activeStatus : JobStatus.values()) {
            if (activeStatus.getCode().equalsIgnoreCase(code)) {
                return activeStatus;
            }
        }
        return null;
    }
    
    public static JobStatus fromDescription(String description) {
        for (JobStatus activeStatus : JobStatus.values()) {
            if (activeStatus.getDescription().equalsIgnoreCase(description)) {
                return activeStatus;
            }
        }
        return null;
    }
    
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return description; 
    }

}
