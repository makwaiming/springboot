package com.omega.commons.service;


/**
 */
public interface ConfigService {

    /**
     * Gets the specified value by key. defVal is returned if
     * the key is not found.
     */
    String getValue(String key, String defVal);

    /**
     * Gets the specified value by brandId and key. defVal is returned if
     * the key is not found.
     */
    String getValue(Integer brandId, String key, String defVal);

    /**
     * Gets the specified value by key. null is returned if
     * the key is not found.
     */
    String getValue(String key);

    /**
     * Gets the specified value by brandId and key. null is returned if
     * the key is not found.
     */
    String getValue(Integer brandId, String key);




    /**
     * Gets the specified value and converts to an integer. defVal is returned if
     * the key is not found.
     */
    Integer getIntValue(String key, Integer defVal);

    /**
     * Gets the specified value and converts to an integer. defVal is returned if
     * the key is not found.
     */
    Integer getIntValue(Integer brandId, String key, Integer defVal);

    /**
     * Gets the specified value and converts to an integer. null is returned if
     * the key is not found.
     */
    Integer getIntValue(String key);

    /**
     * Gets the specified value and converts to an integer. null is returned if
     * the key is not found.
     */
    Integer getIntValue(Integer brandId, String key);

    /**
     * Gets the specified value and converts to a boolean. defVal is returned if
     * the key is not found.
     */
    Boolean getBooleanValue(String key, Boolean defVal);

    /**
     * Gets the specified value and converts to a boolean. defVal is returned if
     * the key is not found.
     */
    Boolean getBooleanValue(Integer brandId, String key, Boolean defVal);

    /**
     * Gets the specified value and converts to an boolean. null is returned if
     * the key is not found.
     */
    Boolean getBooleanValue(String key);

    /**
     * Gets the specified value and converts to an boolean. null is returned if
     * the key is not found.
     */
    Boolean getBooleanValue(Integer brandId, String key);

    /**
     * Update or insert for brandRegistry. delete if value is null
     */
    void upsert(String key, String value);

    /**
     * Update or insert for regHash. delete if value is null
     */
    void upsert(Integer brandId, String key, String value);

    void upsert(Integer brandId, String languageCode, String key, String value);

    /**
     * Convenience method to check if EGame is enabled.
     */
    Boolean getIsEgameEnabled();

    Boolean getIsEmailVisible(Integer brandId);

    Boolean getIsEmailVisible();

    Boolean getIsEgameEnabled(Integer brandId);

    Boolean getIsKycEnabled(Integer brandId, String countryCode);

    Boolean getIsExperianEnabled(Integer brandId);

    Boolean getIsExperianAutoKycReminderEnabled(Integer brandId);

    Boolean getIsKycAndExperianEnabled(Integer brandId, String countryCode);

    Boolean getIsAutoExperianFirstDepositCheckEnabled(Integer brandId);

    Boolean getIsAutoExperianDepositThresholdCheckEnabled(Integer brandId);

    Boolean getIsExperianDepositThresholdCheckEnabled(Integer brandId);

    int getEgameVersion();

    /**
     * Gets the brand content for the brand and language passed in. If not found then it
     * will look for content in the default language. If still not found it returns the default
     * passed in.
     */
    String getBrandContent(Integer brandId, String key, String languageCode, String defVal);

    /**
     * Gets the brand content for the brand and language passed in. If not found then it
     * will look for content in the default language. If still not found it returns null.
     */
    String getBrandContent(Integer brandId, String key, String languageCode);

    /**
     * Get the BaseLink in http(s)://domainName(:port)
     */
    String getBaseLink(Integer brandId);

    Boolean getIsJackpotsUpdateEnabled();

    Boolean getIsMicrogamingJackpotsUpdateEnabled();

    Boolean getSignupDefaultWinnerList(Integer brandId);

    Boolean getIsQuickRegistrationEnabled();

    Boolean getIsReferAFriendEnabled();

    Boolean getIsUserLimitsEnabled();

    Boolean getIsMicrogamingPlayCheckEnabled();

    /* checks if the site is currently in shutdown mode */
    boolean inShutdownMode(Integer brandId);

    boolean isSessionKeyIPValidationEnabled(Integer brandId);

    void refreshRegistryStores();

    String getCacheExpire();


    Boolean getCacheService();

    Boolean getIncludeInGameRelease();



}
