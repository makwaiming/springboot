package com.omega.commons.constants;

/**
 * Type of Excel Cell
 * <p> 
 * @author Zheng Chen
 *
 */


public enum CellType {

    DATE ("DATE","Date"),
    MONTH("MONTH","Month"),
    MONEY("MONEY", "Money"),
    PERCENT("PERCENT", "Percent"),
    PERCENT_INT("PERCENT_INT","Percent_Int"),
    NUMBER("NUMBER", "Number"),
    TEXT("TEXT","Text");


    private final String code;
    private final String description;

    CellType(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static CellType fromCode(String code) {
        for (CellType element : CellType.values()) {
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
