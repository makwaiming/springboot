package com.omega.commonsUtil.util;


import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * Borrow form OmegaTron. The one in OmegaTron should be removed later.
 */
public class WeekUtil {

    /** Returns the start of the week for the date passed in, which is monday at 00:00:00.000  */
//    Converting to java-time to joda-time is not that straight forward. Need more time.
//    The following change is not tested !
    public static ZonedDateTime startOfWeek(ZonedDateTime dt) {
        return dt.minusDays(dt.getDayOfWeek().ordinal()).
                with(LocalTime.of ( 0 , 0 ));

    }

    /** Returns the end of the week for the date passe in which is,
     * ? sunday at 23:59:59.999
     * ? monday at 00:00:00.000
     */
//    public static ZonedDateTime endOfWeek(ZonedDateTime dt) {
//        return startOfWeek(dt).plusWeeks(1);
//    }
//
//    /** Returns the start of the current week, which is monday at 00:00:00.000  */
//    public static ZonedDateTime startOfCurrentWeek() {
//        return startOfWeek(new ZonedDateTime());
//    }
//
//    /** Returns the end of the current week which is,
//     * ? sunday at 23:59:59.999
//     * ? monday at 00:00:00.000
//     */
//    public static ZonedDateTime endOfCurrentWeek() {
//        return endOfWeek(new ZonedDateTime());
//    }
}
