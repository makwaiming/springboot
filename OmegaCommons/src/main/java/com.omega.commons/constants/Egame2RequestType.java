package com.omega.commons.constants;

/**
 * Type of EGame Request. Used to determine whether the egame token is acquired or released.
 */


public enum Egame2RequestType {
    REGISTER ("REGISTER", "Register"),
    QUERY ("QUERY", "Query"),
    DEPOSIT ("DEPOSIT", "Deposit"),
    WITHDRAW ("WITHDRAW", "Withdraw"),
    VALIDATE ("VALIDATE", "Validate");


    private final String code;
    private final String description;

    Egame2RequestType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Egame2RequestType fromCode(String code){
        for(Egame2RequestType element : Egame2RequestType.values()){
            if(element.getCode().equals(code)){
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }
}
