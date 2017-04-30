package com.omega.commons.constants;

/**
 * The type (purpose) of the email template. (confirmation, lost password, ....)
 * <p/>
 */


public enum EmailTemplateType {
    SYSTEM_ALERT("SYSTEM_ALERT", "System Failure Alert"),
    BONUS_INCONSISTENCY("BONUS_INCONSISTENCY", "Bonus Inconsistency Alert"),
    CONFIRMATION("CONFIRMATION", "Confirmation"),
    REFERRAL("REFERRAL", "Referral"),
    RESET_PASSWORD("RESET_PASSWORD", "Reset Password"),
    DEPOSIT_CONFIRM("DEPOSIT_CONFIRM", "Deposit Confirmation"),
    WITHDRAWAL_CONFIRM("WITHDRAWAL_CONFIRM", "Withdrawal Confirmation"),
    ISSUED_VOUCHER("ISSUED_VOUCHER", "Issued Voucher Notification to Player"),
    ISSUED_CARD_OTOPAY("ISSUED_CARD_OTOPAY", "Issued Otopay Card Notification to Player"),
    WITHDRAWAL_REQUEST("WITHDRAWAL_REQUEST", "Withdrawal Request Confirmation"),
    TEST_TEMPLATE("TEST_TEMPLATE", "Template Test"),
    DEPOSIT_FAILED("DEPOSIT_FAILED", "Deposit Failed"),
    DEPOSIT_FAILED_TO_ADMIN("DEPOSIT_FAILED_TO_ADMIN", "Deposit Failed to Admin"),
    DEPOSIT_FAILED_TO_USER("DEPOSIT_FAILED_TO_USER", "Deposit Failed to User"),
    WELCOME_REGISTRATION("WELCOME_REGISTRATION", "Welcome Registration"),
    BANKWIRE_TO_ADMIN("BANKWIRE_TO_ADMIN", "BankWire Notification to Admin"),
    BANKWIRE_CONFIRM("BANKWIRE_CONFIRM", "BankWire Confirmation to User"),
    DEPOSIT_REMINDER("DEPOSIT_REMINDER", "Deposit Reminder"),
    QUICK_SIGNUP_REMIND("QUICK_SIGNUP_REMIND", "Quick Signup Reminder"),
    SELF_EXCLUSION("SELF_EXCLUSION", "Self Exclusion Notification"),
    SENT_TO_AGENT("SENT_TO_AGENT", "Sent To Agent"),
    MANUAL_BANK_DEPOSIT_REQUEST_CONFIRM("MB_REQ_DEPOSIT_CFM", "Manual Bank Deposit Request Confirmation"),
    MANUAL_BANK_WITHDRAWAL_REQUEST_CONFIRM("MB_REQ_WITHDRAW_CFM", "Manual Bank Withdrawal Request Confirmation"),
    MANUAL_BANK_REJECT("MANUAL_BANK_REJECT", "Manual Bank Reject"),
    PEND_DEP_NOTIF("PEND_DEP_NOTIF", "Pending Deposit Notification to User"),
    WITH_LOCK_PLAYER("WITH_LOCK_PLAYER", "Withdrawal Locked Player"),
    SELF_EXCLUSION_EXPIRE_NOTIFY("SELF_EXCLUSION_EXPIRE_NOTIFY", "Self Exclusion Expire Notify Player"),
    KYC_DOCUMENT_REQUEST("KYC_DOCUMENT_REQUEST", "Kyc Request Document"),
    KYC_DOCUMENT_REMINDER("KYC_DOCUMENT_REMINDER", "Kyc Document Reminder"),
    KYC_DOCUMENT_REQUEST_FAILED_LOCK("KYC_DOCUMENT_REQUEST_FAILED_LOCK", "Account Suspended - KYC Document Required");

    private final String code;
    private final String description;

    EmailTemplateType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static EmailTemplateType fromCode(String code) {
        for (EmailTemplateType activeStatus : EmailTemplateType.values()) {
            if (activeStatus.getCode().equals(code)) {
                return activeStatus;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }

}
