package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Days.class */
public final class Days extends BaseSingleFieldPeriod {
    private static final long serialVersionUID;
    public static final Days ZERO = new Days(0);
    public static final Days ONE = new Days(1);
    public static final Days TWO = new Days(2);
    public static final Days THREE = new Days(3);
    public static final Days FOUR = new Days(4);
    public static final Days FIVE = new Days(5);
    public static final Days SIX = new Days(6);
    public static final Days SEVEN = new Days(7);
    public static final Days MAX_VALUE = new Days(Integer.MAX_VALUE);
    public static final Days MIN_VALUE = new Days(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.days());

    private Days(int i) {
        super(i);
    }

    public static Days days(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        switch (i) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            default:
                return new Days(i);
        }
    }

    public static Days daysBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return days(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.days()));
    }

    public static Days daysBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return (!(readablePartial instanceof LocalDate) || !(readablePartial2 instanceof LocalDate)) ? days(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO)) : days(DateTimeUtils.getChronology(readablePartial.getChronology()).days().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()));
    }

    public static Days daysIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : days(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.days()));
    }

    @FromString
    public static Days parseDays(String str) {
        return str == null ? ZERO : days(PARSER.parsePeriod(str).getDays());
    }

    private Object readResolve() {
        return days(getValue());
    }

    public static Days standardDaysIn(ReadablePeriod readablePeriod) {
        return days(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 86400000));
    }

    public final Days dividedBy(int i) {
        return i == 1 ? this : days(getValue() / i);
    }

    public final int getDays() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType getFieldType() {
        return DurationFieldType.days();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public final PeriodType getPeriodType() {
        return PeriodType.days();
    }

    public final boolean isGreaterThan(Days days) {
        boolean z = false;
        boolean z2 = false;
        if (days == null) {
            if (getValue() > 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() > days.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isLessThan(Days days) {
        boolean z = false;
        boolean z2 = false;
        if (days == null) {
            if (getValue() < 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() < days.getValue()) {
            z = true;
        }
        return z;
    }

    public final Days minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public final Days minus(Days days) {
        return days == null ? this : minus(days.getValue());
    }

    public final Days multipliedBy(int i) {
        return days(FieldUtils.safeMultiply(getValue(), i));
    }

    public final Days negated() {
        return days(FieldUtils.safeNegate(getValue()));
    }

    public final Days plus(int i) {
        return i == 0 ? this : days(FieldUtils.safeAdd(getValue(), i));
    }

    public final Days plus(Days days) {
        return days == null ? this : plus(days.getValue());
    }

    public final Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 86400000);
    }

    public final Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), 24));
    }

    public final Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.MINUTES_PER_DAY));
    }

    public final Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.SECONDS_PER_DAY));
    }

    public final Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 7);
    }

    @Override // org.joda.time.ReadablePeriod, java.lang.Object
    @ToString
    public final String toString() {
        StringBuilder sb = new StringBuilder("P");
        sb.append(String.valueOf(getValue()));
        sb.append("D");
        return sb.toString();
    }
}
