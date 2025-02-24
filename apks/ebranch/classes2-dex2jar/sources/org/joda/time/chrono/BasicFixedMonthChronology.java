package org.joda.time.chrono;

import org.joda.time.Chronology;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/BasicFixedMonthChronology.class */
abstract class BasicFixedMonthChronology extends BasicChronology {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicFixedMonthChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    int getDayOfMonth(long j) {
        return ((getDayOfYear(j) - 1) % 30) + 1;
    }

    int getDaysInMonthMax() {
        return 30;
    }

    int getDaysInMonthMax(int i) {
        return i != 13 ? 30 : 6;
    }

    int getDaysInYearMonth(int i, int i2) {
        return i2 != 13 ? 30 : isLeapYear(i) ? 6 : 5;
    }

    int getMaxMonth() {
        return 13;
    }

    int getMonthOfYear(long j) {
        return ((getDayOfYear(j) - 1) / 30) + 1;
    }

    int getMonthOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / MILLIS_PER_MONTH)) + 1;
    }

    long getTotalMillisByYearMonth(int i, int i2) {
        return ((long) (i2 - 1)) * MILLIS_PER_MONTH;
    }

    long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        long yearMillis = getYearMillis(year);
        long yearMillis2 = getYearMillis(year2);
        int i = year - year2;
        int i2 = i;
        if (j - yearMillis < j2 - yearMillis2) {
            i2 = i - 1;
        }
        return (long) i2;
    }

    boolean isLeapYear(int i) {
        return (i & 3) == 3;
    }

    long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        int i2 = dayOfYear;
        if (dayOfYear > 365) {
            i2 = dayOfYear;
            if (!isLeapYear(i)) {
                i2 = dayOfYear - 1;
            }
        }
        return getYearMonthDayMillis(i, 1, i2) + ((long) millisOfDay);
    }
}
