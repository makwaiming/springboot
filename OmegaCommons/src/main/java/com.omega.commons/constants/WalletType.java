package com.omega.commons.constants;

/**
 * Wallet Type enumeration.
 * <p>
 * @author Zheng Chen
 *
 */


public enum WalletType {


    GAME_PLAY("GAME_PLAY", "game play"),
    TRANSFER("TRANSFER", "transfer");

    private final String code;
    private final String description;

    WalletType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static WalletType fromCode(String code) {
        for (WalletType element : WalletType.values()) {
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
