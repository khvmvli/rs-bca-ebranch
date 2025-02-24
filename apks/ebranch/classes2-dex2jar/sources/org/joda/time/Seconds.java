package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Seconds.class */
public final class Seconds extends BaseSingleFieldPeriod {
    private static final long serialVersionUID;
    public static final Seconds ZERO = new Seconds(0);
    public static final Seconds ONE = new Seconds(1);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
    public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());

    private Seconds(int i) {
        super(i);
    }

    @FromString
    public static Seconds parseSeconds(String str) {
        return str == null ? ZERO : seconds(PARSER.parsePeriod(str).getSeconds());
    }

    private Object readResolve() {
        return seconds(getValue());
    }

    public static Seconds seconds(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Seconds(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Seconds secondsBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return seconds(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.seconds()));
    }

    public static Seconds secondsBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return (!(readablePartial instanceof LocalTime) || !(readablePartial2 instanceof LocalTime)) ? seconds(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO)) : seconds(DateTimeUtils.getChronology(readablePartial.getChronology()).seconds().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()));
    }

    public static Seconds secondsIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : seconds(BaseSingleFieldPeriod.between((ReadableInstant) readableInterval.getStart(), (ReadableInstant) readableInterval.getEnd(), DurationFieldType.seconds()));
    }

    public static Seconds standardSecondsIn(ReadablePeriod readablePeriod) {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 1000));
    }

    public final Seconds dividedBy(int i) {
        return i == 1 ? this : seconds(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType getFieldType() {
        return DurationFieldType.seconds();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public final PeriodType getPeriodType() {
        return PeriodType.seconds();
    }

    public final int getSeconds() {
        return getValue();
    }

    public final boolean isGreaterThan(Seconds seconds) {
        boolean z = false;
        boolean z2 = false;
        if (seconds == null) {
            if (getValue() > 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() > seconds.getValue()) {
            z = true;
        }
        return z;
    }

    public final boolean isLessThan(Seconds seconds) {
        boolean z = false;
        boolean z2 = false;
        if (seconds == null) {
            if (getValue() < 0) {
                z2 = true;
            }
            return z2;
        }
        if (getValue() < seconds.getValue()) {
            z = true;
        }
        return z;
    }

    public final Seconds minus(int i) {
        return plus(FieldUtils.safeNegate(i));
    }

    public final Seconds minus(Seconds seconds) {
        return seconds == null ? this : minus(seconds.getValue());
    }

    public final Seconds multipliedBy(int i) {
        return seconds(FieldUtils.safeMultiply(getValue(), i));
    }

    public final Seconds negated() {
        return seconds(FieldUtils.safeNegate(getValue()));
    }

    public final Seconds plus(int i) {
        return i == 0 ? this : seconds(FieldUtils.safeAdd(getValue(), i));
    }

    public final Seconds plus(Seconds seconds) {
        return seconds == null ? this : plus(seconds.getValue());
    }

    public final Days toStandardDays() {
        return Days.days(getValue() / DateTimeConstants.SECONDS_PER_DAY);
    }

    public final Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 1000);
    }

    public final Hours toStandardHours() {
        return Hours.hours(getValue() / DateTimeConstants.SECONDS_PER_HOUR);
    }

    public final Minutes toStandardMinutes() {
        return Minutes.minutes(getValue() / 60);
    }

    public final Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.SECONDS_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod, java.lang.Object
    @ToString
    public final String toString() {
        StringBuilder sb = new StringBuilder("PT");
        sb.append(String.valueOf(getValue()));
        sb.append("S");
        return sb.toString();
    }
}
