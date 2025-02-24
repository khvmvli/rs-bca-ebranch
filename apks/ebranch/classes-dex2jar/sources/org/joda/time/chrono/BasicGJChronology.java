package org.joda.time.chrono;

import org.joda.time.Chronology;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicGJChronology.class */
public abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final long serialVersionUID = 538276888268L;
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

    static {
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (i < 11) {
            j += ((long) MIN_DAYS_PER_MONTH_ARRAY[i]) * 86400000;
            int i2 = i + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j;
            j2 += ((long) MAX_DAYS_PER_MONTH_ARRAY[i]) * 86400000;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j2;
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicGJChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i) {
        return MAX_DAYS_PER_MONTH_ARRAY[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMaxForSet(long j, int i) {
        int i2 = 28;
        if (i > 28 || i <= 0) {
            i2 = getDaysInMonthMax(j);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i, int i2) {
        return isLeapYear(i) ? MAX_DAYS_PER_MONTH_ARRAY[i2 - 1] : MIN_DAYS_PER_MONTH_ARRAY[i2 - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r0 < 5062500) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r0 < 12825000) goto L_0x00ba;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r0 < 20587500) goto L_0x00e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r0 < 28265625) goto L_0x0100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r0 < 4978125) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
        if (r0 < 12740625) goto L_0x00ba;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
        if (r0 < 20503125) goto L_0x00e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r8 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r8 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (r0 < 28181250) goto L_0x0100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
        r8 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
        r8 = 12;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int getMonthOfYear(long r6, int r8) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.getMonthOfYear(long, int):int");
    }

    @Override // org.joda.time.chrono.BasicChronology
    long getTotalMillisByYearMonth(int i, int i2) {
        return isLeapYear(i) ? MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1] : MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // org.joda.time.chrono.BasicChronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long getYearDifference(long r6, long r8) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.getYear(r1)
            r10 = r0
            r0 = r5
            r1 = r8
            int r0 = r0.getYear(r1)
            r11 = r0
            r0 = r6
            r1 = r5
            r2 = r10
            long r1 = r1.getYearMillis(r2)
            long r0 = r0 - r1
            r12 = r0
            r0 = r8
            r1 = r5
            r2 = r11
            long r1 = r1.getYearMillis(r2)
            long r0 = r0 - r1
            r14 = r0
            r0 = r12
            r6 = r0
            r0 = r14
            r8 = r0
            r0 = r14
            r1 = 5097600000(0x12fd73400, double:2.518549036E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r0 = r5
            r1 = r11
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x0056
            r0 = r12
            r6 = r0
            r0 = r14
            r8 = r0
            r0 = r5
            r1 = r10
            boolean r0 = r0.isLeapYear(r1)
            if (r0 != 0) goto L_0x007e
            r0 = r14
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r1
            r8 = r0
            r0 = r12
            r6 = r0
            goto L_0x007e
        L_0x0056:
            r0 = r12
            r6 = r0
            r0 = r14
            r8 = r0
            r0 = r12
            r1 = 5097600000(0x12fd73400, double:2.518549036E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r0 = r12
            r6 = r0
            r0 = r14
            r8 = r0
            r0 = r5
            r1 = r10
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x007e
            r0 = r12
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r1
            r6 = r0
            r0 = r14
            r8 = r0
        L_0x007e:
            r0 = r10
            r1 = r11
            int r0 = r0 - r1
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r6
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            r0 = r11
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L_0x0095:
            r0 = r10
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.getYearDifference(long, long):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j) {
        return dayOfMonth().get(j) == 29 && monthOfYear().isLeap(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j, int i) {
        int year = getYear(j);
        int dayOfYear = getDayOfYear(j, year);
        int millisOfDay = getMillisOfDay(j);
        int i2 = dayOfYear;
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                i2 = dayOfYear;
                if (!isLeapYear(i)) {
                    i2 = dayOfYear - 1;
                }
            } else {
                i2 = dayOfYear;
                if (isLeapYear(i)) {
                    i2 = dayOfYear + 1;
                }
            }
        }
        return getYearMonthDayMillis(i, 1, i2) + ((long) millisOfDay);
    }
}
