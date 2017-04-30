package com.omega.commons.constants;

/**
 * Type for playable
 */
public enum PlayableType {
    PLAYABLE ("PLAYABLE","Playable"),
    FREEBET ("FREEBET","Free Bet"),
    NOTPLAYABLE ("NOTPLAYABLE", "Not Playable");


    private final String code;
    private final String description;

    PlayableType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    /**
     * Get type from code
     * */
    public static PlayableType fromCode(String code) {
        for (PlayableType element : PlayableType.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }
    /**
     * Get type from description
     * */
    public static PlayableType fromDes(String code) {
        for (PlayableType element : PlayableType.values()) {
            if (element.getDescription().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }
}
