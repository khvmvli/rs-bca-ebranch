package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;
@Deprecated
/* loaded from: classes2-dex2jar.jar:org/joda/time/YearMonthDay.class */
public final class YearMonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    @Deprecated
    /* loaded from: classes2-dex2jar.jar:org/joda/time/YearMonthDay$Property.class */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        Property(YearMonthDay yearMonthDay, int i) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i;
        }

        public YearMonthDay addToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().add(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay addWrapFieldToCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().addWrapField(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay() {
            return this.iYearMonthDay;
        }

        public YearMonthDay setCopy(int i) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i));
        }

        public YearMonthDay setCopy(String str) {
            return setCopy(str, null);
        }

        public YearMonthDay setCopy(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), str, locale));
        }

        public YearMonthDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public YearMonthDay() {
    }

    public YearMonthDay(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public YearMonthDay(int i, int i2, int i3, Chronology chronology) {
        super(new int[]{i, i2, i3}, chronology);
    }

    public YearMonthDay(long j) {
        super(j);
    }

    public YearMonthDay(long j, Chronology chronology) {
        super(j, chronology);
    }

    public YearMonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(Chronology chronology) {
        super(chronology);
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super((Chronology) ISOChronology.getInstance(dateTimeZone));
    }

    YearMonthDay(YearMonthDay yearMonthDay, Chronology chronology) {
        super((BasePartial) yearMonthDay, chronology);
    }

    YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super(yearMonthDay, iArr);
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonthDay fromDateFields(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public final Property dayOfMonth() {
        return new Property(this, 2);
    }

    public final int getDayOfMonth() {
        return getValue(2);
    }

    public final DateTimeField getField(int i, Chronology chronology) {
        if (i == 0) {
            return chronology.year();
        }
        if (i == 1) {
            return chronology.monthOfYear();
        }
        if (i == 2) {
            return chronology.dayOfMonth();
        }
        StringBuilder sb = new StringBuilder("Invalid index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    public final DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public final int getMonthOfYear() {
        return getValue(1);
    }

    public final int getYear() {
        return getValue(0);
    }

    public final YearMonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public final YearMonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i));
    }

    public final YearMonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public final YearMonthDay minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i));
    }

    public final Property monthOfYear() {
        return new Property(this, 1);
    }

    public final YearMonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public final YearMonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public final YearMonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public final YearMonthDay plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public final Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public final int size() {
        return 3;
    }

    public final DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    public final DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(dateTimeZone));
    }

    public final DateTime toDateTime(TimeOfDay timeOfDay) {
        return toDateTime(timeOfDay, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final org.joda.time.DateTime toDateTime(org.joda.time.TimeOfDay r7, org.joda.time.DateTimeZone r8) {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.Chronology r0 = r0.getChronology()
            r1 = r8
            org.joda.time.Chronology r0 = r0.withZone(r1)
            r8 = r0
            r0 = r8
            r1 = r6
            long r2 = org.joda.time.DateTimeUtils.currentTimeMillis()
            long r0 = r0.set(r1, r2)
            r9 = r0
            r0 = r9
            r11 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0021
            r0 = r8
            r1 = r7
            r2 = r9
            long r0 = r0.set(r1, r2)
            r11 = r0
        L_0x0021:
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            r1 = r0
            r2 = r11
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.YearMonthDay.toDateTime(org.joda.time.TimeOfDay, org.joda.time.DateTimeZone):org.joda.time.DateTime");
    }

    public final DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public final DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(dateTimeZone);
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    public final DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public final DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(dateTimeZone));
    }

    public final Interval toInterval() {
        return toInterval(null);
    }

    public final Interval toInterval(DateTimeZone dateTimeZone) {
        return toDateMidnight(DateTimeUtils.getZone(dateTimeZone)).toInterval();
    }

    public final LocalDate toLocalDate() {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // java.lang.Object
    public final String toString() {
        return ISODateTimeFormat.yearMonthDay().print(this);
    }

    public final YearMonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, withUTC);
        withUTC.validate(yearMonthDay, getValues());
        return yearMonthDay;
    }

    public final YearMonthDay withDayOfMonth(int i) {
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, getValues(), i));
    }

    public final YearMonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(indexOfSupported)) {
            return this;
        }
        return new YearMonthDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i));
    }

    public final YearMonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i));
    }

    public final YearMonthDay withMonthOfYear(int i) {
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public final YearMonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i) {
        if (readablePeriod == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < readablePeriod.size(); i2++) {
            int indexOf = indexOf(readablePeriod.getFieldType(i2));
            values = values;
            if (indexOf >= 0) {
                values = getField(indexOf).add(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i2), i));
            }
        }
        return new YearMonthDay(this, values);
    }

    public final YearMonthDay withYear(int i) {
        return new YearMonthDay(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public final Property year() {
        return new Property(this, 0);
    }
}
