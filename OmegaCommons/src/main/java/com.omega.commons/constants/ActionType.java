package com.omega.commons.constants;

/**
 * Type of action taken on a User. Applies to UserActionLog.
 */


public enum ActionType {
    DATA_EDIT("DATA_EDIT", "Data Edit"),
    SSW_UPDATE("SSW_UPDATE", "Seamless Wallet Data Update"),
    IC_LOGIN("IC_LOGIN", "Integrated Cashier Login"),
    MAN_BONUS("MAN_BONUS", "Manual Bonus"),
    CREATE_BONUS("CREATE_BONUS", "Create Bonus"),
    EXPIRE_BONUS("EXPIRE_BONUS", "Expire Bonus"),
    CANCEL_BONUS("CANCEL_BONUS", "Cancel Bonus"),
    RELEASE_BONUS("RELEASE_BONUS", "Release Bonus"),
    PLAYER_DATA_EDIT("PLAYER_DATA_EDIT", "Data Edit By Player"),
    MAN_ADJUST("MAN_ADJUST", "Manual Adjustment"),
    CHARGE_BCK("CHARGE_BCK", "Charge Back"),
    MAN_DEPOSIT("MAN_DEPOSIT", "Manual Deposit"),
    LOCK_STATUS_CHANGE("LOCK_STATUS_CHANGE", "Lock Status Change"),
    ACC_STATUS_CHANGE("ACC_STATUS_CHANGE", "Account Status Change"),
    BONUS_PREF_CHANGE("BONUS_PREF_CHANGE", "Bonus Preference Change"),
    SUBSCRIPTION_CHANGE("SUBSCRIPTION_CHANGE", "Subscription Change"),
    REGISTRATION_CHANGE("REGISTRATION_CHANGE", "Registration Status Change"),
    CODEDBONUS_TRIGGERED("CODEDBONUS_TRIGGERED", "Coded Bonus Triggered"),
    MANUAL_DEPOSITBONUS_TRIGGERED("MAN_DEPBON_TRIG", "Deposit Bonus Triggered Manually"),
    LOYALTY_ADJUST("LOYALTY_ADJUST", "Loyalty Adjustment"),
    RESET_PASSWORD("RESET_PASSWORD", "Reset Password"),
    CONFIRM_EMAIL_SENT("CONFIRM_EMAIL_SENT", "Confirmation Email Sent"),
    REFERRAL_EMAIL_SENT("REFERRAL_EMAIL_SENT", "Referral Email Sent"),
    DEPOSIT_REMINDER_EMAIL_SENT("DEP_REM_EMAIL_SENT", "Deposit Reminder Email Sent"),
    CONVERT_LOYALTY("CONVERT_LOYALTY", "Convert Loyalty Point"),
    CHANGE_LOSS_LIMIT("CHANGE_LOSS_LIMIT", "Change Loss Limit"),
    CHANGE_WAGER_LIMIT("CHANGE_WAGER_LIMIT", "Change Wager Limit"),
    CHANGE_DEPOSIT_LIMIT("CHANGE_DEPOSIT_LIMIT", "Change Deposit Limit"),
    REMOVE_LOSS_LIMIT("REMOVE_LOSS_LIMIT", "Remove Loss Limit"),
    REMOVE_WAGER_LIMIT("REMOVE_WAGER_LIMIT", "Remove Wager Limit"),
    QUICK_OPEN("QUICK_OPEN", "Quick player register"),
    QUICK_REGISTER("QUICK_REGISTER", "Quick player register"),
    REGISTER("REGISTER", "Player Register"),
    COMPLETE_QUICK_REG("COMPLETE_QUICK_REG", "Complete quick player register"),
    SEND_REGISTER_EMAIL("SEND_REGISTER_EMAIL", "Send Register Email"),
    CHANGE_VIP_STATUS("CHANGE_VIP_STATUS", "Change Vip Status"),
    LOYALTY_BUY("LOYALTY_BUY", "Loyalty Point buy"),
    CANCEL_BONUS_INC("CANCEL_BONUS_INC", "Cancel Bonus incremental"),
    INSTALL_GAME("INSTALL_GAME", "Install Game"),
    CHECK_SCAN("CHECK_SCAN", "Check Scan"),
    USE_ITEM("USE_ITEM", "Use Item"),
    KYC_OPEN("KYC_OPEN", "Kyc Open"),
    KYC_STATUS_CHANGE("KYC_STATUS_CHANGE", "Kyc Status Change"),
    IOVATION_STATUS_CHANGE("IOVATION_STATUS_CHANGE", "Iovation Status Change"),
    REMOVE_CARD("REMOVE_CARD", "Remove stored card"),
    KILL_USER_SESSIONS("KILL_USER_SESSIONS", "Kill User Sessions"),
    CCLEVEL_CHANGE("CCLEVEL_CHANGE", "CCLEVEL Change"),
    CCLEVEL_MSG("CCLEVEL_MSG", "CCLEVEL Message"),
    WHITELIST_MSG("WHITELIST_MSG", "WhiteList Message"),
    LP_EXPIRED("LP_EXPIRED", "Loyalty Point Expired"),
    CHANGE_SESSION_LIMIT("CHANGE_SESSION_LIMIT", "Change Session Limit"),
    REMOVE_SESSION_LIMIT("REMOVE_SESSION_LIMIT", "Remove Session Limit"),
    APPLY_FREESPIN("APPLY_FREESPIN", "Apply Free spin"),
    EXCLUDE_EMAIL_SENT("EXCLUDE_EMAIL_SENT", "Exclude Email Sent"),
    VERIFY_WITHDRAWAL_THRESHOLD("VERIFY_WITHDRAWAL_THRESHOLD", "Verify Withdrawal Threshold"),
    DEPOSIT_LIMIT_REACHED("DEPOSIT_LIMIT_REACHED", "Deposit limit reached"),
    KYC_FIRST_DEPOSIT("KYC_FIRST_DEPOSIT", "Kyc Check - First Deposit"),
    KYC_DEPOSIT_THRESHOLD("KYC_DEPOSIT_THRESHOLD", "Kyc Check - Reach Deposit Threshold"),
    SEND_KYC_DOCUMENT_REQUEST("SEND_KYC_DOCUMENT_REQUEST", "Send KYC Document Request"),
    SEND_KYC_DOCUMENT_REMINDER("SEND_KYC_DOCUMENT_REMINDER", "Send KYC Document Reminder"),
    SEND_KYC_FAILED_LOCK_NOTIFICATION("SEND_KYC_FAILED_LOCK_NOTIFICATION", "Send KYC Fail Account Locked Notification");

    private final String code;
    private final String description;

    ActionType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static ActionType fromCode(String code) {
        for (ActionType element : ActionType.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return description;
    }

}
