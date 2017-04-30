package com.omega.commons.constants;

/**
 * The status of a payment (pending, completed, ....). Maps in database to a single letter code.
 * <p> 
 * @author Daryl Handley
 *
 */


public enum PermissionSubtype {


    EMAIL ("EMAIL","Email"),
    PHONE ("PHONE","Phone"),
    MOBILEPHONE ("MOBILEPHONE","MobilePhone");


    private final String code;
    private final String description;

    PermissionSubtype(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static PermissionSubtype fromCode(String code) {
        for (PermissionSubtype element : PermissionSubtype.values()) {
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
