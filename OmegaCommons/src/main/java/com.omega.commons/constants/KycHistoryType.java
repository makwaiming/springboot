package com.omega.commons.constants;
/** 
 * The players active status (active, inactive, dormant, test account, ...) 
 * <p> 
 * @author Daryl Handley
 *
 */


public enum KycHistoryType {
    
    PASSED ("PASSED", "Passed"), 
    FAILED ("FAILED", "Failed"),
    REFER ("REFER",  "Refer"),
    ERROR ("ERROR",  "Error"), //That is when the underlying service is out of server.
    DOCUMENT_UPLOAD ("DOCUMENT_UPLOAD", "Document Upload");  

    
    private final String code;   
    private final String description; 
    
    KycHistoryType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static KycHistoryType fromCode(String code) {
        for (KycHistoryType activeStatus : KycHistoryType.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus; 
            }
        }
        return null; 
    }    
    
    public String toString() {
        return description; 
    }

}
