package com.bvan.common;

import java.util.GregorianCalendar;

/**
 * @author bvanchuhov
 */
public final class DateUtils {

    private DateUtils() {
    }

    public static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }
}
