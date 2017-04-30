package com.omega.commons.constants;

/**
 * The status of a payment (pending, completed, ....). Maps in database to a single letter code.
 * <p> 
 * @author Daryl Handley
 *
 */


public enum PaymentStatus {


    PENDING ("PENDING","Pending"),
    COMPLETED ("COMPLETED","Completed"),
    FAILED ("FAILED","Failed"),
    CANCELLED ("CANCELLED","Cancelled"),
    REJECTED ("REJECTED","Rejected"),
    BATCHED ("BATCHED","Batched"),
    BATCH_SENT ("BATCH_SENT","Batch Sent"),
    RUNNING("RUNNING", "Running"),
    SENT_TO_AGENT("SENT_TO_AGENT", "Sent to Agent");


    private final String code;
    private final String description;

    PaymentStatus(String code, String description) {
        this.code = code; 
        this.description = description;         
    }
    
    public String getCode() {
        return code; 
    }
    
    public String getDescription() {
        return description; 
    }   
    
    public static PaymentStatus fromCode(String code) {
        for (PaymentStatus element : PaymentStatus.values()) {
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
