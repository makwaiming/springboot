package com.omega.commons.constants;

/**
 * <p>
 * @author Daryl Handley
 *
 */


public enum TranType {
    // varchar(10)

    DEPOSIT ("DEPOSIT" , "Deposit"),
    WITHDRAWAL ("WITHDRAWAL" , "Withdrawal"),
    WD_REJECT ("WD_REJECT","Withdrawal Rejected"),
    WD_CANCEL ("WD_CANCEL","Withdrawal Cancelled"),
    GAME_PLAY ("GAME_PLAY","Game Play"),
    GAME_WIN ("GAME_WIN", "Game Win"),
    GAME_BET ("GAME_BET", "Game Bet"),
    GAME_ADJ ("GAME_ADJ","Game Adjustment"),
    BONUS_REL ("BONUS_REL","Bonus Release"),
    MAN_ADJUST ("MAN_ADJUST","Manual Adjustment"),
    // Chargeback is almost the same as Manual Adjustment, but we added this due to the requirement from NetRefer
    // check JIRA Case http://jira.omegagaming.com:8080/browse/RPW-434 for details
    CHARGE_BCK ("CHARGE_BCK","Charge Back"),
    MAN_BONUS ("MAN_BONUS","Manual Bonus"),
    EXP_BONUS("EXP_BONUS", "Expire Bonus"),
    CANC_BONUS("CANC_BONUS", "Cancel Bonus"),
    CRE_BONUS("CRE_BONUS", "Create Bonus"),
    TRANSFER_OUT("TRANSF_OUT", "Transfer Out"),
    TRANSFER_IN("TRANSF_IN", "Transfer In"),
    TRANSFER_OUT2("TXFER_OUT2", "Transfer Out from 2ndary"),
    TRANSFER_IN2("TXFER_IN2", "Transfer In to 2ndary"),
    TRANSFER_ROLLBACK("TRANSF_RB", "Transfer Rollback"),
    LOYALTY_AD("LOYALTY_AD", "Loyalty Adjustment"),
    LP_CONVERT("LP_CONVERT", "Loyalty Conversion"),
    PLTFRM_BON("PLTFRM_BON", "Platform Bonus"),
    TOURN_WIN("TOURN_WIN", "Tournament Win"),
    PAYMNT_FEE ("PAYMNT_FEE" , "Payment Fee"),
    LP_BUY("LP_BUY", "Loyalty Purchase"),
    ROLLBACK("ROLLBACK","Rollback"),
    TIPS("TIPS", "Tips"),
    CHAT_BONUS("CHAT_BONUS","Chat Bonus");



    private final String code;
    private final String description;

    TranType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static TranType fromCode(String code) {
        for (TranType element : TranType.values()) {
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
