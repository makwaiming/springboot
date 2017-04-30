package com.omega.commons.constants;
/**
 * <p>
 * @author Waiming Mak
 *
 */


public enum WagerRequirementAction {
    RELEASE ("RELEASE","Release"),
    QUALIFY ("QUALIFY","Qualify");

    private final String code;
    private final String description;

    WagerRequirementAction(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static WagerRequirementAction fromCode(String code) {
        for (WagerRequirementAction element : WagerRequirementAction.values()) {
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
