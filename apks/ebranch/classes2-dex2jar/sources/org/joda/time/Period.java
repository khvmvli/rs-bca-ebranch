package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Period.class */
public final class Period extends BasePeriod implements ReadablePeriod, Serializable {
    public static final Period ZERO = new Period();
    private static final long serialVersionUID;

    public Period() {
        super(0, (PeriodType) null, (Chronology) null);
    }

    public Period(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public Period(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public Period(long j) {
        super(j);
    }

    public Period(long j, long j2) {
        super(j, j2, null, null);
    }

    public Period(long j, long j2, Chronology chronology) {
        super(j, j2, null, chronology);
    }

    public Period(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, null);
    }

    public Period(long j, long j2, PeriodType periodType, Chronology chronology) {
        super(j, j2, periodType, chronology);
    }

    public Period(long j, Chronology chronology) {
        super(j, (PeriodType) null, chronology);
    }

    public Period(long j, PeriodType periodType) {
        super(j, periodType, (Chronology) null);
    }

    public Period(long j, PeriodType periodType, Chronology chronology) {
        super(j, periodType, chronology);
    }

    public Period(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public Period(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public Period(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public Period(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public Period(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public Period(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        super(readablePartial, readablePartial2, (PeriodType) null);
    }

    public Period(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        super(readablePartial, readablePartial2, periodType);
    }

    private Period(int[] iArr, PeriodType periodType) {
        super(iArr, periodType);
    }

    private void checkYearsAndMonths(String str) {
        if (getMonths() != 0) {
            StringBuilder sb = new StringBuilder("Cannot convert to ");
            sb.append(str);
            sb.append(" as this period contains months and months vary in length");
            throw new UnsupportedOperationException(sb.toString());
        } else if (getYears() != 0) {
            StringBuilder sb2 = new StringBuilder("Cannot convert to ");
            sb2.append(str);
            sb2.append(" as this period contains years and years vary in length");
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    public static Period days(int i) {
        return new Period(new int[]{0, 0, 0, i, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period fieldDifference(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (readablePartial.size() == readablePartial2.size()) {
            DurationFieldType[] durationFieldTypeArr = new DurationFieldType[readablePartial.size()];
            int[] iArr = new int[readablePartial.size()];
            int size = readablePartial.size();
            for (int i = 0; i < size; i++) {
                if (readablePartial.getFieldType(i) == readablePartial2.getFieldType(i)) {
                    DurationFieldType durationType = readablePartial.getFieldType(i).getDurationType();
                    durationFieldTypeArr[i] = durationType;
                    if (i <= 0 || durationFieldTypeArr[i - 1] != durationType) {
                        iArr[i] = readablePartial2.getValue(i) - readablePartial.getValue(i);
                    } else {
                        throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields");
                    }
                } else {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            return new Period(iArr, PeriodType.forFields(durationFieldTypeArr));
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    public static Period hours(int i) {
        return new Period(new int[]{0, 0, 0, 0, i, 0, 0, 0}, PeriodType.standard());
    }

    public static Period millis(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, 0, i}, PeriodType.standard());
    }

    public static Period minutes(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, i, 0, 0}, PeriodType.standard());
    }

    public static Period months(int i) {
        return new Period(new int[]{0, i, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    @FromString
    public static Period parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    public static Period parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str);
    }

    public static Period seconds(int i) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i, 0}, PeriodType.standard());
    }

    public static Period weeks(int i) {
        return new Period(new int[]{0, 0, i, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public static Period years(int i) {
        return new Period(new int[]{i, 0, 0, 0, 0, 0, 0, 0, 0}, PeriodType.standard());
    }

    public final int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public final int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public final int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public final int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public final int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public final int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public final int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public final int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    public final Period minus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public final Period minusDays(int i) {
        return plusDays(-i);
    }

    public final Period minusHours(int i) {
        return plusHours(-i);
    }

    public final Period minusMillis(int i) {
        return plusMillis(-i);
    }

    public final Period minusMinutes(int i) {
        return plusMinutes(-i);
    }

    public final Period minusMonths(int i) {
        return plusMonths(-i);
    }

    public final Period minusSeconds(int i) {
        return plusSeconds(-i);
    }

    public final Period minusWeeks(int i) {
        return plusWeeks(-i);
    }

    public final Period minusYears(int i) {
        return plusYears(-i);
    }

    public final Period multipliedBy(int i) {
        if (this == ZERO || i == 1) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < values.length; i2++) {
            values[i2] = FieldUtils.safeMultiply(values[i2], i);
        }
        return new Period(values, getPeriodType());
    }

    public final Period negated() {
        return multipliedBy(-1);
    }

    public final Period normalizedStandard() {
        return normalizedStandard(PeriodType.standard());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
        if (r0 != 0) goto L_0x0060;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final org.joda.time.Period normalizedStandard(org.joda.time.PeriodType r10) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.Period.normalizedStandard(org.joda.time.PeriodType):org.joda.time.Period");
    }

    public final Period plus(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, readablePeriod.get(DurationFieldType.YEARS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, readablePeriod.get(DurationFieldType.MONTHS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, readablePeriod.get(DurationFieldType.WEEKS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, readablePeriod.get(DurationFieldType.DAYS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, readablePeriod.get(DurationFieldType.HOURS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, readablePeriod.get(DurationFieldType.MINUTES_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, readablePeriod.get(DurationFieldType.SECONDS_TYPE));
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, readablePeriod.get(DurationFieldType.MILLIS_TYPE));
        return new Period(values, getPeriodType());
    }

    public final Period plusDays(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusHours(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusMillis(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusMinutes(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusMonths(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusSeconds(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusWeeks(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period plusYears(int i) {
        if (i == 0) {
            return this;
        }
        int[] values = getValues();
        getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    @Override // org.joda.time.base.AbstractPeriod, org.joda.time.ReadablePeriod
    public final Period toPeriod() {
        return this;
    }

    public final Days toStandardDays() {
        checkYearsAndMonths("Days");
        return Days.days(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) / 86400000, (long) getDays()), ((long) getWeeks()) * 7)));
    }

    public final Duration toStandardDuration() {
        checkYearsAndMonths("Duration");
        return new Duration(((long) getMillis()) + (((long) getSeconds()) * 1000) + (((long) getMinutes()) * 60000) + (((long) getHours()) * 3600000) + (((long) getDays()) * 86400000) + (((long) getWeeks()) * 604800000));
    }

    public final Hours toStandardHours() {
        checkYearsAndMonths("Hours");
        return Hours.hours(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) / 3600000, (long) getHours()), ((long) getDays()) * 24), ((long) getWeeks()) * 168)));
    }

    public final Minutes toStandardMinutes() {
        checkYearsAndMonths("Minutes");
        return Minutes.minutes(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((((long) getMillis()) + (((long) getSeconds()) * 1000)) / 60000, (long) getMinutes()), ((long) getHours()) * 60), ((long) getDays()) * 1440), ((long) getWeeks()) * 10080)));
    }

    public final Seconds toStandardSeconds() {
        checkYearsAndMonths("Seconds");
        return Seconds.seconds(FieldUtils.safeToInt(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd(FieldUtils.safeAdd((long) (getMillis() / DateTimeConstants.MILLIS_PER_SECOND), (long) getSeconds()), ((long) getMinutes()) * 60), ((long) getHours()) * 3600), ((long) getDays()) * 86400), ((long) getWeeks()) * 604800)));
    }

    public final Weeks toStandardWeeks() {
        checkYearsAndMonths("Weeks");
        return Weeks.weeks(FieldUtils.safeToInt(((long) getWeeks()) + (((((((long) getMillis()) + (((long) getSeconds()) * 1000)) + (((long) getMinutes()) * 60000)) + (((long) getHours()) * 3600000)) + (((long) getDays()) * 86400000)) / 604800000)));
    }

    public final Period withDays(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withField(DurationFieldType durationFieldType, int i) {
        if (durationFieldType != null) {
            int[] values = getValues();
            setFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
        throw new IllegalArgumentException("Field must not be null");
    }

    public final Period withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        } else if (i == 0) {
            return this;
        } else {
            int[] values = getValues();
            addFieldInto(values, durationFieldType, i);
            return new Period(values, getPeriodType());
        }
    }

    public final Period withFields(ReadablePeriod readablePeriod) {
        return readablePeriod == null ? this : new Period(mergePeriodInto(getValues(), readablePeriod), getPeriodType());
    }

    public final Period withHours(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withMillis(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withMinutes(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withMonths(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withPeriodType(PeriodType periodType) {
        PeriodType periodType2 = DateTimeUtils.getPeriodType(periodType);
        return periodType2.equals(getPeriodType()) ? this : new Period(this, periodType2);
    }

    public final Period withSeconds(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withWeeks(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, i);
        return new Period(values, getPeriodType());
    }

    public final Period withYears(int i) {
        int[] values = getValues();
        getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, i);
        return new Period(values, getPeriodType());
    }
}
