package com.omega.commons.constants;

/**
 * Type of EGame Request. Used to determine whether the egame token is acquired or released.
 * <p>
 * @author Zheng Chen
 *
 */
public enum EGameRequestType {
    ACQUIRE ("ACQUIRE", "Acquire"),
    RELEASE ("RELEASE", "Release"),
    REGISTER("REGISTER", "Register"),
// v2
//    REGISTER ("REGISTER", "Register"),
    QUERY ("QUERY", "Query"),
    DEPOSIT ("DEPOSIT", "Deposit"),
    WITHDRAW ("WITHDRAW", "Withdraw"),
    VALIDATE ("VALIDATE", "Validate"),
    GAMEMODECHANGE ("GAMEMODECHANGE", "GameModeChange"),
    STATUSSERVICE("STATUSSERVICE", "StatusService");



    private final String code;
    private final String description;

    EGameRequestType (String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static EGameRequestType fromCode(String code){
        for(EGameRequestType element : EGameRequestType.values()){
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
