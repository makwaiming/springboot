package com.omega.commons.constants;

/**
 * Type of multiplier for a bonus plan. Determines whether the wager requirement is based on
 * the amount of the deposit or the amount of the bonus. 
 * <p>
 * @author Daryl Handley
 *
 */


public enum BonusMultiplier {


    DEPOSIT ("DEPOSIT","Deposit"),
    BONUS ("BONUS","Bonus");

    private final String code;
    private final String description;

    BonusMultiplier(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static BonusMultiplier fromCode(String code) {
        for (BonusMultiplier element : BonusMultiplier.values()) {
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
