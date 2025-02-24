package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/IslamicChronology.class */
public final class IslamicChronology extends BasicChronology {
    public static final int AH = 1;
    private static final int CYCLE = 30;
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    /* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/IslamicChronology$LeapYearPatternType.class */
    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        LeapYearPatternType(int i, int i2) {
            this.index = (byte) ((byte) i);
            this.pattern = i2;
        }

        private Object readResolve() {
            byte b = this.index;
            return b != 0 ? b != 1 ? b != 2 ? b != 3 ? this : IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB : IslamicChronology.LEAP_YEAR_INDIAN : IslamicChronology.LEAP_YEAR_16_BASED : IslamicChronology.LEAP_YEAR_15_BASED;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof LeapYearPatternType) {
                z = false;
                if (this.index == ((LeapYearPatternType) obj).index) {
                    z = true;
                }
            }
            return z;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this.index;
        }

        boolean isLeapYear(int i) {
            boolean z = true;
            if (((1 << (i % 30)) & this.pattern) <= 0) {
                z = false;
            }
            return z;
        }
    }

    IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapYearPatternType) {
        super(chronology, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, IslamicChronology[]> concurrentHashMap = cCache;
        IslamicChronology[] islamicChronologyArr = concurrentHashMap.get(dateTimeZone2);
        IslamicChronology[] islamicChronologyArr2 = islamicChronologyArr;
        if (islamicChronologyArr == null) {
            islamicChronologyArr2 = new IslamicChronology[4];
            IslamicChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, islamicChronologyArr2);
            if (putIfAbsent != null) {
                islamicChronologyArr2 = putIfAbsent;
            }
        }
        IslamicChronology islamicChronology = islamicChronologyArr2[leapYearPatternType.index];
        IslamicChronology islamicChronology2 = islamicChronology;
        if (islamicChronology == null) {
            synchronized (islamicChronologyArr2) {
                IslamicChronology islamicChronology3 = islamicChronologyArr2[leapYearPatternType.index];
                islamicChronology2 = islamicChronology3;
                if (islamicChronology3 == null) {
                    if (dateTimeZone2 == DateTimeZone.UTC) {
                        IslamicChronology islamicChronology4 = new IslamicChronology(null, null, leapYearPatternType);
                        islamicChronology2 = new IslamicChronology(LimitChronology.getInstance(islamicChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, islamicChronology4), null), null, leapYearPatternType);
                    } else {
                        islamicChronology2 = new IslamicChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, leapYearPatternType), dateTimeZone2), null, leapYearPatternType);
                    }
                    islamicChronologyArr2[leapYearPatternType.index] = islamicChronology2;
                }
            }
        }
        return islamicChronology2;
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    protected final void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            assemble(fields);
            fields.era = ERA_FIELD;
            fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 12);
            fields.months = fields.monthOfYear.getDurationField();
        }
    }

    final long calculateFirstDayOfYearMillis(int i) {
        if (i > MAX_YEAR) {
            StringBuilder sb = new StringBuilder("Year is too large: ");
            sb.append(i);
            sb.append(" > 292271022");
            throw new ArithmeticException(sb.toString());
        } else if (i >= MIN_YEAR) {
            int i2 = i - 1;
            long j = (((long) (i2 / 30)) * MILLIS_PER_CYCLE) - 42521587200000L;
            for (int i3 = 1; i3 < (i2 % 30) + 1; i3++) {
                j += isLeapYear(i3) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
            }
            return j;
        } else {
            StringBuilder sb2 = new StringBuilder("Year is too small: ");
            sb2.append(i);
            sb2.append(" < -292269337");
            throw new ArithmeticException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IslamicChronology)) {
            return false;
        }
        if (getLeapYearPatternType().index != ((IslamicChronology) obj).getLeapYearPatternType().index || !equals(obj)) {
            z = false;
        }
        return z;
    }

    final long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
    }

    final long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    final long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    final long getAverageMillisPerYearDividedByTwo() {
        return 15308640144L;
    }

    final int getDayOfMonth(long j) {
        int dayOfYear = getDayOfYear(j) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % 59) % 30) + 1;
    }

    final int getDaysInMonthMax() {
        return 30;
    }

    final int getDaysInMonthMax(int i) {
        int i2 = 30;
        if (i == 12) {
            return 30;
        }
        if ((i - 1) % 2 != 0) {
            i2 = 29;
        }
        return i2;
    }

    final int getDaysInYear(int i) {
        return isLeapYear(i) ? 355 : 354;
    }

    final int getDaysInYearMax() {
        return 355;
    }

    final int getDaysInYearMonth(int i, int i2) {
        int i3 = 30;
        if (i2 == 12 && isLeapYear(i)) {
            return 30;
        }
        if ((i2 - 1) % 2 != 0) {
            i3 = 29;
        }
        return i3;
    }

    public final LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    final int getMaxYear() {
        return MAX_YEAR;
    }

    final int getMinYear() {
        return 1;
    }

    final int getMonthOfYear(long j, int i) {
        int yearMillis = (int) ((j - getYearMillis(i)) / 86400000);
        if (yearMillis == 354) {
            return 12;
        }
        return ((yearMillis << 1) / 59) + 1;
    }

    final long getTotalMillisByYearMonth(int i, int i2) {
        int i3 = i2 - 1;
        return i3 % 2 == 1 ? (((long) (i3 / 2)) * MILLIS_PER_MONTH_PAIR) + MILLIS_PER_LONG_MONTH : ((long) (i3 / 2)) * MILLIS_PER_MONTH_PAIR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Type inference failed for: r0v17, types: [long] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final int getYear(long r6) {
        /*
            r5 = this;
            r0 = r6
            r1 = 42521587200000(0x26ac5419b000, double:2.1008455442163E-310)
            long r0 = r0 + r1
            r6 = r0
            r0 = r6
            r1 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r0 = r0 / r1
            r8 = r0
            r0 = r6
            r1 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r0 = r0 % r1
            r6 = r0
            r0 = r8
            r1 = 30
            long r0 = r0 * r1
            r1 = 1
            long r0 = r0 + r1
            int r0 = (int) r0
            r10 = r0
            r0 = r5
            r1 = r10
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x002b
            r0 = r5
            r11 = r0
            goto L_0x0060
        L_0x002b:
            r0 = r5
            r12 = r0
        L_0x002e:
            r0 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            r8 = r0
            r0 = r12
            r11 = r0
        L_0x0036:
            r0 = r6
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0067
            r0 = r6
            r1 = r8
            long r0 = r0 - r1
            r8 = r0
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r10 = r0
            r0 = r11
            r12 = r0
            r0 = r8
            r6 = r0
            r0 = r11
            r1 = r13
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x002e
            r0 = r8
            r6 = r0
            r0 = r13
            r10 = r0
        L_0x0060:
            r0 = 30672000000(0x724319400, double:1.5153981489E-313)
            r8 = r0
            goto L_0x0036
        L_0x0067:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
    }

    final long getYearDifference(long j, long j2) {
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

    public final int hashCode() {
        return (hashCode() * 13) + getLeapYearPatternType().hashCode();
    }

    final boolean isLeapYear(int i) {
        return this.iLeapYears.isLeapYear(i);
    }

    final long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        int i2 = dayOfYear;
        if (dayOfYear > 354) {
            i2 = dayOfYear;
            if (!isLeapYear(i)) {
                i2 = dayOfYear - 1;
            }
        }
        return getYearMonthDayMillis(i, 1, i2) + ((long) millisOfDay);
    }

    public final Chronology withUTC() {
        return INSTANCE_UTC;
    }

    public final Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2);
    }
}
