package com.omega.commons.constants;
/** 
 * Initially written to be used for a drop down list where yes maps to 
 * true and no maps to false. 
 * <p> 
 * @author Daryl Handley
 *
 */


public enum YesNo {
    
    YES ("true", "Yes"), 
    NO ("false", "No"); 

    
    private final String id;   
    private final String description; 
    
    YesNo(String id, String description) {
        this.id = id; 
        this.description = description;         
    }
    
    public String getId() {
        return id; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static YesNo fromId(String id) {
        for (YesNo yesNo  : YesNo.values()) {
            if (yesNo .getId() == id) {
                return yesNo ; 
            }
        }
        return null; 
    }    

}