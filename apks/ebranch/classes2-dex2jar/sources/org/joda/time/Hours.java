package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Hours.class */
public final class Hours extends BaseSingleFieldPeriod {
    private static final long serialVersionUID;
    public static final Hours ZERO = new Hours(0);
    public static final Hours ONE = new Hours(1);
    public static final Hours TWO = new Hours(2);
    public static final Hours THREE = new Hours(3);
    public static final Hours FOUR = new Hours(4);
    public static final Hours FIVE = new Hours(5);
    public static final Hours SIX = new Hours(6);
    public static final Hours SEVEN = new Hours(7);
    public static final Hours EIGHT = new Hours(8);
    public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());

    private Hours(int i) {
        super(i);
    }

    public static Hours hours(int i) {
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
            case 8:
                return EIGHT;
            default:
                return new Hours(i);
        }
    }

    public static Hours hoursBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return hours(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.hours()));
    }

    public static Hours hoursBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return (!(readablePartial instanceof LocalTime) || !(readablePartial2 instanceof LocalTime)) ? hours(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO)) : hours(DateTimeUtils.getChronology(readablePartial.getChronology()).hours().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()));
    }

    public static Hours hoursIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : hours(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.hours()));
    }

    @FromString
    public static Hours parseHours(String str) {
        return str == null ? ZERO : hours(PARSER.parsePeriod(str).getHours());
    }

    private Object readResolve() {
        return hours(getValue());
    }

    public static Hours standardHoursIn(ReadablePeriod readablePeriod) {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 3600000));
    }

    public final Hours dividedBy(int i) {
        return i == 1 ? this : hours(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType getFieldType() {
        return DurationFieldType.hours();
    }

    public final int getHours() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public final PeriodType getPeriodType() {
        return PeriodType.hours();
    }

    public final boolean isGreaterThan(Hours hours) {
        boolean z = false;
        boolean z2 = false;
        if (hours == null) {
            if (getValue() > 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() > hours.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isLessThan(Hours hours) {
        boolean z = false;
        boolean z2 = false;
        if (hours == null) {
            if (getValue() < 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() < hours.getValue()) {
            z = true;
        }
        return z;
    }

    public final Hours minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public final Hours minus(Hours hours) {
        return hours == null ? this : minus(hours.getValue());
    }

    public final Hours multipliedBy(int i) {
        return hours(FieldUtils.safeMultiply(getValue(), i));
    }

    public final Hours negated() {
        return hours(FieldUtils.safeNegate(getValue()));
    }

    public final Hours plus(int i) {
        return i == 0 ? this : hours(FieldUtils.safeAdd(getValue(), i));
    }

    public final Hours plus(Hours hours) {
        return hours == null ? this : plus(hours.getValue());
    }

    public final Days toStandardDays() {
        return Days.days(getValue() / 24);
    }

    public final Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 3600000);
    }

    public final Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
    }

    public final Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.SECONDS_PER_HOUR));
    }

    public final Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.HOURS_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod, java.lang.Object
    @ToString
    public final String toString() {
        StringBuilder sb = new StringBuilder("PT");
        sb.append(String.valueOf(getValue()));
        sb.append("H");
        return sb.toString();
    }
}
