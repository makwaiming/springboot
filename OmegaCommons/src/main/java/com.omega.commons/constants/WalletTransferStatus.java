package com.omega.commons.constants;
/**
 * Status of wallet transfer. Initiated, failed, success....
 *
 */


public enum WalletTransferStatus {
    CONNECT_FAIL ("CONNECT_FAIL","Connection Failure"),
    FAILED ("FAIL","Failed"),
    INITIATED ("INITIATED","Initiated"),
    TIMED_OUT ("TIMED_OUT","Timed Out"),
    SUCCESS ("SUCCESS","Success");

    private final String code;
    private final String description;

    WalletTransferStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static WalletTransferStatus fromCode(String code) {
        for (WalletTransferStatus element : WalletTransferStatus.values()) {
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
