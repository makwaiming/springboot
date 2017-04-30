package com.omega.commons.constants;
/** 
 * Search type. I.e. equals, contains, starts with, ...  
 * <p> 
 * @author Daryl Handley
 *
 */


public enum SearchType {
    EQUALS("Equals"), 
    CONTAINS("Contains"),
    STARTS_WITH("Starts With"); 
    
    private final String description;
    
    private SearchType(String description) {
        this.description = description; 
    }
    
    public String getDescription() {
        return description; 
    }

}
