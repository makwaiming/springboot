package com.omega.commonsUtil.util;

import java.util.UUID;

/**
 * Created by songleo on 2016-07-11.
 */
public class UUIDUtil {

    /**
     *     Normal UUID length=36. This will 27 characters on average, at most 28 character.
     */
    public static String getCustomUUID() {
        UUID uuid = UUID.randomUUID();
        String s = Long.toString(uuid.getMostSignificantBits(), 36) + '-' + Long.toString(uuid.getLeastSignificantBits(), 36);
        return s;
    }
}
