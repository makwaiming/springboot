package com.omega.commons.constants;

/**
 * Created by chenzheng on 2014-09-18.
 */
public enum EmailOption {
    None(""),
    Email("email"),
    EmailPrefix("emailPrefix");

    EmailOption(String code) {
        this.code = code;

    }

    private String code;

    public String toString() {
        return code;
    }

    public static EmailOption fromCode(String code) {
        if (code == null) return EmailOption.None;
        if (code.equalsIgnoreCase("email")) {
            return EmailOption.Email;
        }
        if (code.equalsIgnoreCase("emailPrefix")) {
            return EmailOption.EmailPrefix;
        }
        return EmailOption.None;
    }

}
