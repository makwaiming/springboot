package com.omega.commons.constants;

/**
 * Direction of wallet transfer.
 * IN = into the Omega system.
 * OUT = out of the Omega system.
 */
public enum WalletTransferDirection {

    IN ("IN","In"),
    OUT ("OUT","Out");

    private final String code;
    private final String description;

    WalletTransferDirection(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static WalletTransferDirection fromCode(String code) {
        for (WalletTransferDirection element : WalletTransferDirection.values()) {
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
