package com.omega.commons.constants;

/**
 * Type of trigger for a bonus plan. Determines what the event is that triggers the bonus on a players account
 * (Deposit, Manual by admin, Player enters code,, ...)
 * <p>
 * @author Daryl Handley
 *
 */


public enum BonusTriggerType {


    CODED ("CODED","Coded"),
    // MANUAL ("MANUAL","Manual"),
    DEPOSIT ("DEPOSIT","Deposit"),
    COUPON ("COUPON", "Coupon"),
    TOURN_WIN("TOURN_WIN", "Tournament Win"),
    // FB_WIN ("FB_WIN", "Free Bet Win"),
    PLTFRM_BON ("PLTFRM_BON", "Platform Bonus"),
    CHAT ("CHAT", "Chat Bonus"),
    LOYALTY ("LOYALTY", "Loyalty"),
    LINKED ("LINKED", "Linked Bonus");


    private final String code;
    private final String description;

    BonusTriggerType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static BonusTriggerType fromCode(String code) {
        for (BonusTriggerType element : BonusTriggerType.values()) {
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
