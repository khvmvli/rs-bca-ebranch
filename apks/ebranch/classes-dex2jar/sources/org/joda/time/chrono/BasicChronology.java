package org.joda.time.chrono;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicChronology.class */
public abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK;
    private static final int CACHE_SIZE;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final long serialVersionUID;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache = new YearInfo[CACHE_SIZE];
    private static final DurationField cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000);
    private static final DateTimeField cHalfdayOfDayField = new HalfdayField();

    /* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicChronology$HalfdayField.class */
    static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID;

        HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j, String str, Locale locale) {
            return set(j, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicChronology$YearInfo.class */
    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        YearInfo(int i, long j) {
            this.iYear = i;
            this.iFirstDayMillis = j;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), 86400000);
        cDaysField = preciseDurationField5;
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
    }

    public BasicChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj);
        if (i <= 0 || i > 7) {
            StringBuilder sb = new StringBuilder("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.iMinDaysInFirstWeek = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private long getDateTimeMillis0(int r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r0 = r0.getDateMidnightMillis(r1, r2, r3)
            r11 = r0
            r0 = r11
            r13 = r0
            r0 = r10
            r15 = r0
            r0 = r11
            r1 = -9223372036854775808
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1
            int r3 = r3 + r4
            long r0 = r0.getDateMidnightMillis(r1, r2, r3)
            r13 = r0
            r0 = r10
            r1 = 86400000(0x5265c00, float:7.82218E-36)
            int r0 = r0 - r1
            r15 = r0
        L_0x002c:
            r0 = r15
            long r0 = (long) r0
            r1 = r13
            long r0 = r0 + r1
            r11 = r0
            r0 = r11
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto L_0x0048
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L_0x0048:
            r0 = r7
            if (r0 <= 0) goto L_0x0057
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r0 = -9223372036854775808
            return r0
        L_0x0057:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicChronology.getDateTimeMillis0(int, int, int, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0.iYear != r7) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private org.joda.time.chrono.BasicChronology.YearInfo getYearInfo(int r7) {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.chrono.BasicChronology$YearInfo[] r0 = r0.iYearInfoCache
            r8 = r0
            r0 = r7
            r1 = 1023(0x3ff, float:1.434E-42)
            r0 = r0 & r1
            r9 = r0
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L_0x0021
            r0 = r10
            r8 = r0
            r0 = r10
            int r0 = r0.iYear
            r1 = r7
            if (r0 == r1) goto L_0x0036
        L_0x0021:
            org.joda.time.chrono.BasicChronology$YearInfo r0 = new org.joda.time.chrono.BasicChronology$YearInfo
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = r7
            long r3 = r3.calculateFirstDayOfYearMillis(r4)
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            org.joda.time.chrono.BasicChronology$YearInfo[] r0 = r0.iYearInfoCache
            r1 = r9
            r2 = r8
            r0[r1] = r2
        L_0x0036:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicChronology.getYearInfo(int):org.joda.time.chrono.BasicChronology$YearInfo");
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        fields.year = new BasicYearDateTimeField(this);
        fields.yearOfEra = new GJYearOfEraDateTimeField(fields.year, this);
        fields.centuryOfEra = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuries = fields.centuryOfEra.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    abstract long calculateFirstDayOfYearMillis(int i);

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        if (getMinimumDaysInFirstWeek() != basicChronology.getMinimumDaysInFirstWeek() || !getZone().equals(basicChronology.getZone())) {
            z = false;
        }
        return z;
    }

    abstract long getApproxMillisAtEpochDividedByTwo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getAverageMillisPerMonth();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getAverageMillisPerYear();

    abstract long getAverageMillisPerYearDividedByTwo();

    long getDateMidnightMillis(int i, int i2, int i3) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i, getMinYear() - 1, getMaxYear() + 1);
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i2, 1, getMaxMonth(i));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), i3, 1, getDaysInYearMonth(i, i2));
        long yearMonthDayMillis = getYearMonthDayMillis(i, i2, i3);
        int i4 = (yearMonthDayMillis > 0 ? 1 : (yearMonthDayMillis == 0 ? 0 : -1));
        if (i4 < 0 && i == getMaxYear() + 1) {
            return Long.MAX_VALUE;
        }
        if (i4 <= 0 || i != getMinYear() - 1) {
            return yearMonthDayMillis;
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i4, 0, 86399999);
        return getDateTimeMillis0(i, i2, i3, i4);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i4, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i5, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i6, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i7, 0, 999);
        return getDateTimeMillis0(i, i2, i3, (int) ((long) ((i4 * 3600000) + (i5 * 60000) + (i6 * CloseCodes.NORMAL_CLOSURE) + i7)));
    }

    public int getDayOfMonth(long j) {
        int year = getYear(j);
        return getDayOfMonth(j, year, getMonthOfYear(j, year));
    }

    public int getDayOfMonth(long j, int i) {
        return getDayOfMonth(j, i, getMonthOfYear(j, i));
    }

    public int getDayOfMonth(long j, int i, int i2) {
        return ((int) ((j - (getYearMillis(i) + getTotalMillisByYearMonth(i, i2))) / 86400000)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int getDayOfWeek(long r6) {
        /*
            r5 = this;
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            r0 = r6
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r1
            r6 = r0
            goto L_0x0031
        L_0x000f:
            r0 = r6
            r1 = 86399999(0x5265bff, double:4.26872713E-316)
            long r0 = r0 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r1
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = -3
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            r0 = r8
            r1 = 4
            long r0 = r0 + r1
            r1 = 7
            long r0 = r0 % r1
            int r0 = (int) r0
            r1 = 7
            int r0 = r0 + r1
            return r0
        L_0x0031:
            r0 = r6
            r1 = 3
            long r0 = r0 + r1
            r1 = 7
            long r0 = r0 % r1
            int r0 = (int) r0
            r1 = 1
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicChronology.getDayOfWeek(long):int");
    }

    public int getDayOfYear(long j) {
        return getDayOfYear(j, getYear(j));
    }

    int getDayOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / 86400000)) + 1;
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getDaysInMonthMax(int i);

    public int getDaysInMonthMax(long j) {
        int year = getYear(j);
        return getDaysInYearMonth(year, getMonthOfYear(j, year));
    }

    public int getDaysInMonthMaxForSet(long j, int i) {
        return getDaysInMonthMax(j);
    }

    public int getDaysInYear(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getDaysInYearMonth(int i, int i2);

    long getFirstWeekOfYearMillis(int i) {
        long yearMillis = getYearMillis(i);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? yearMillis + (((long) (8 - dayOfWeek)) * 86400000) : yearMillis - (((long) (dayOfWeek - 1)) * 86400000);
    }

    public int getMaxMonth() {
        return 12;
    }

    int getMaxMonth(int i) {
        return getMaxMonth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getMaxYear();

    public int getMillisOfDay(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j) {
        return getMonthOfYear(j, getYear(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getMonthOfYear(long j, int i);

    abstract long getTotalMillisByYearMonth(int i, int i2);

    public int getWeekOfWeekyear(long j) {
        return getWeekOfWeekyear(j, getYear(j));
    }

    int getWeekOfWeekyear(long j, int i) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i);
        if (j < firstWeekOfYearMillis) {
            return getWeeksInYear(i - 1);
        }
        if (j >= getFirstWeekOfYearMillis(i + 1)) {
            return 1;
        }
        return ((int) ((j - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    public int getWeeksInYear(int i) {
        return (int) ((getFirstWeekOfYearMillis(i + 1) - getFirstWeekOfYearMillis(i)) / 604800000);
    }

    public int getWeekyear(long j) {
        int year = getYear(j);
        int weekOfWeekyear = getWeekOfWeekyear(j, year);
        return weekOfWeekyear == 1 ? getYear(j + 604800000) : weekOfWeekyear > 51 ? getYear(j - 1209600000) : year;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [long] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int getYear(long r6) {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.getAverageMillisPerYearDividedByTwo()
            r8 = r0
            r0 = r6
            r1 = 1
            long r0 = r0 >> r1
            r1 = r5
            long r1 = r1.getApproxMillisAtEpochDividedByTwo()
            long r0 = r0 + r1
            r10 = r0
            r0 = r10
            r12 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0022
            r0 = r10
            r1 = r8
            long r0 = r0 - r1
            r1 = 1
            long r0 = r0 + r1
            r12 = r0
        L_0x0022:
            r0 = r12
            r1 = r8
            long r0 = r0 / r1
            int r0 = (int) r0
            r14 = r0
            r0 = r5
            r1 = r14
            long r0 = r0.getYearMillis(r1)
            r10 = r0
            r0 = r6
            r1 = r10
            long r0 = r0 - r1
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0045
            r0 = r14
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            goto L_0x0078
        L_0x0045:
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            r12 = r0
            r0 = r14
            r15 = r0
            r0 = r8
            r1 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r0 = r5
            r1 = r14
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x0064
            r0 = 31622400000(0x75cd78800, double:1.5623541479E-313)
            r12 = r0
        L_0x0064:
            r0 = r14
            r15 = r0
            r0 = r10
            r1 = r12
            long r0 = r0 + r1
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            r0 = r14
            r1 = 1
            int r0 = r0 + r1
            r15 = r0
        L_0x0078:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicChronology.getYear(long):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getYearDifference(long j, long j2);

    public long getYearMillis(int i) {
        return getYearInfo(i).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i, int i2, int i3) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2) + (((long) (i3 - 1)) * 86400000);
    }

    public long getYearMonthMillis(int i, int i2) {
        return getYearMillis(i) + getTotalMillisByYearMonth(i, i2);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isLeapYear(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long setYear(long j, int i);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology, java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        String str = name;
        if (lastIndexOf >= 0) {
            str = name.substring(lastIndexOf + 1);
        }
        sb.append(str);
        sb.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb.append(",mdfw=");
            sb.append(getMinimumDaysInFirstWeek());
        }
        sb.append(']');
        return sb.toString();
    }
}
