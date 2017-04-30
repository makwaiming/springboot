package com.omega.commons.constants;
/** 
 * The players active status (active, inactive, dormant, test account, ...) 
 * <p> 
 * @author Daryl Handley
 *
 */


public enum RegistrationStatus {
    
    OPEN ("OPEN", "Open"),
    REGISTERED ("REGISTERED", "Registered"),
    PLAYER ("PLAYER", "Player"), 
    KYCFAILED ("KYCFAILED", "Kyc Failed"), 
    GEO_IP_FAILED("GEOIP_FAIL", "Geo Ip Failed"),
    BGC_FAILED ("BGC_FAILED", "BGC Failed"),
    QUICK_OPEN ("QUICK_OPEN", "Quick Open"),
    QUICK_REG ("QUICK_REG", "Quick Registered");

    
    private final String code;   
    private final String description; 
    
    RegistrationStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static RegistrationStatus fromCode(String code) {
        for (RegistrationStatus activeStatus : RegistrationStatus.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus; 
            }
        }
        return null; 
    }

    public static boolean isValidStatusForConfirmationEmail(RegistrationStatus status) {
        return status != null &&
                (status == RegistrationStatus.OPEN ||
                 status == RegistrationStatus.QUICK_OPEN ||
                 status == RegistrationStatus.QUICK_REG ||
                 status == RegistrationStatus.REGISTERED ||
                 status == RegistrationStatus.PLAYER);
    }

    public static boolean isConfirmedStatus(RegistrationStatus status){
        return status != null &&
                (status == RegistrationStatus.QUICK_REG ||
                        status == RegistrationStatus.PLAYER);
    }
    
    public String toString() {
        return description; 
    }

}
