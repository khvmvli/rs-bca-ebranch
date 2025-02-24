package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Weeks.class */
public final class Weeks extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380866L;
    public static final Weeks ZERO = new Weeks(0);
    public static final Weeks ONE = new Weeks(1);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
    public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());

    private Weeks(int i) {
        super(i);
    }

    @FromString
    public static Weeks parseWeeks(String str) {
        return str == null ? ZERO : weeks(PARSER.parsePeriod(str).getWeeks());
    }

    private Object readResolve() {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(ReadablePeriod readablePeriod) {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 604800000));
    }

    public static Weeks weeks(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Weeks(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Weeks weeksBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return weeks(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.weeks()));
    }

    public static Weeks weeksBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return (!(readablePartial instanceof LocalDate) || !(readablePartial2 instanceof LocalDate)) ? weeks(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO)) : weeks(DateTimeUtils.getChronology(readablePartial.getChronology()).weeks().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()));
    }

    public static Weeks weeksIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : weeks(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.weeks()));
    }

    public final Weeks dividedBy(int i) {
        return i == 1 ? this : weeks(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType getFieldType() {
        return DurationFieldType.weeks();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public final PeriodType getPeriodType() {
        return PeriodType.weeks();
    }

    public final int getWeeks() {
        return getValue();
    }

    public final boolean isGreaterThan(Weeks weeks) {
        boolean z = false;
        boolean z2 = false;
        if (weeks == null) {
            if (getValue() > 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() > weeks.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isLessThan(Weeks weeks) {
        boolean z = false;
        boolean z2 = false;
        if (weeks == null) {
            if (getValue() < 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() < weeks.getValue()) {
            z = true;
        }
        return z;
    }

    public final Weeks minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public final Weeks minus(Weeks weeks) {
        return weeks == null ? this : minus(weeks.getValue());
    }

    public final Weeks multipliedBy(int i) {
        return weeks(FieldUtils.safeMultiply(getValue(), i));
    }

    public final Weeks negated() {
        return weeks(FieldUtils.safeNegate(getValue()));
    }

    public final Weeks plus(int i) {
        return i == 0 ? this : weeks(FieldUtils.safeAdd(getValue(), i));
    }

    public final Weeks plus(Weeks weeks) {
        return weeks == null ? this : plus(weeks.getValue());
    }

    public final Days toStandardDays() {
        return Days.days(FieldUtils.safeMultiply(getValue(), 7));
    }

    public final Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 604800000);
    }

    public final Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.HOURS_PER_WEEK));
    }

    public final Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.MINUTES_PER_WEEK));
    }

    public final Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), (int) DateTimeConstants.SECONDS_PER_WEEK));
    }

    @Override // org.joda.time.ReadablePeriod, java.lang.Object
    @ToString
    public final String toString() {
        StringBuilder sb = new StringBuilder("P");
        sb.append(String.valueOf(getValue()));
        sb.append("W");
        return sb.toString();
    }
}
