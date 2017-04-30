package com.omega.commons.constants;
/** 
 * The players kyc status
 *
 * @author Zheng Chen
 *
 */


public enum KycStatus {

    CHECK_NAME_ON_CARD("CHECK_NAME_ON_CARD", "Check Name On Card"),
    EXPERIAN_ERROR("EXPERIAN_ERROR", "Experian Error"),
    EXPERIAN_FAILED("EXPERIAN_FAILED", "Experian Failed"),
    EXPERIAN_PASS("EXPERIAN_PASS", "Experian Pass"),
    EXPERIAN_REFER("EXPERIAN_REFER", "Experian Refer"),
    FAILED("FAILED", "Failed"),
    OPEN ("OPEN", "Open"),
    PASS ("PASS", "Pass"),
    REQUESTED("REQUESTED", "Requested"),
    UNKNOWN ("N/A", "N/A");


    private final String code;
    private final String description;

    KycStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }

    public static boolean isKycRestricted(KycStatus status) {
        boolean isRestricted = false;
        if (status != null && status != UNKNOWN && status != PASS && status != EXPERIAN_PASS) {
            isRestricted =  true;
        }
        return isRestricted;
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static KycStatus fromCode(String code) {
        for (KycStatus activeStatus : KycStatus.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus; 
            }
        }
        return null; 
    }

    public static KycStatus fromDescription(String description) {
        for (KycStatus activeStatus : KycStatus.values()) {
            if (activeStatus.getDescription().equalsIgnoreCase(description)) {
                return activeStatus;
            }
        }
        return null;
    }

    public String toString() {
        return code;
    }

}
