package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Minutes.class */
public final class Minutes extends BaseSingleFieldPeriod {
    private static final long serialVersionUID;
    public static final Minutes ZERO = new Minutes(0);
    public static final Minutes ONE = new Minutes(1);
    public static final Minutes TWO = new Minutes(2);
    public static final Minutes THREE = new Minutes(3);
    public static final Minutes MAX_VALUE = new Minutes(Integer.MAX_VALUE);
    public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());

    private Minutes(int i) {
        super(i);
    }

    public static Minutes minutes(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Minutes(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Minutes minutesBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return minutes(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.minutes()));
    }

    public static Minutes minutesBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return (!(readablePartial instanceof LocalTime) || !(readablePartial2 instanceof LocalTime)) ? minutes(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO)) : minutes(DateTimeUtils.getChronology(readablePartial.getChronology()).minutes().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()));
    }

    public static Minutes minutesIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : minutes(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.minutes()));
    }

    @FromString
    public static Minutes parseMinutes(String str) {
        return str == null ? ZERO : minutes(PARSER.parsePeriod(str).getMinutes());
    }

    private Object readResolve() {
        return minutes(getValue());
    }

    public static Minutes standardMinutesIn(ReadablePeriod readablePeriod) {
        return minutes(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 60000));
    }

    public final Minutes dividedBy(int i) {
        return i == 1 ? this : minutes(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType getFieldType() {
        return DurationFieldType.minutes();
    }

    public final int getMinutes() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public final PeriodType getPeriodType() {
        return PeriodType.minutes();
    }

    public final boolean isGreaterThan(Minutes minutes) {
        boolean z = false;
        boolean z2 = false;
        if (minutes == null) {
            if (getValue() > 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() > minutes.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isLessThan(Minutes minutes) {
        boolean z = false;
        boolean z2 = false;
        if (minutes == null) {
            if (getValue() < 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() < minutes.getValue()) {
            z = true;
        }
        return z;
    }

    public final Minutes minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public final Minutes minus(Minutes minutes) {
        return minutes == null ? this : minus(minutes.getValue());
    }

    public final Minutes multipliedBy(int i) {
        return minutes(FieldUtils.safeMultiply(getValue(), i));
    }

    public final Minutes negated() {
        return minutes(FieldUtils.safeNegate(getValue()));
    }

    public final Minutes plus(int i) {
        return i == 0 ? this : minutes(FieldUtils.safeAdd(getValue(), i));
    }

    public final Minutes plus(Minutes minutes) {
        return minutes == null ? this : plus(minutes.getValue());
    }

    public final Days toStandardDays() {
        return Days.days(getValue() / DateTimeConstants.MINUTES_PER_DAY);
    }

    public final Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 60000);
    }

    public final Hours toStandardHours() {
        return Hours.hours(getValue() / 60);
    }

    public final Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 60));
    }

    public final Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.MINUTES_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod, java.lang.Object
    @ToString
    public final String toString() {
        StringBuilder sb = new StringBuilder("PT");
        sb.append(String.valueOf(getValue()));
        sb.append("M");
        return sb.toString();
    }
}
