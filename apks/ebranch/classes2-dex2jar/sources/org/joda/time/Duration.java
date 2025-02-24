package org.joda.time;

import java.io.Serializable;
import java.math.RoundingMode;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Duration.class */
public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID;

    public Duration(long j) {
        super(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public static Duration millis(long j) {
        return j == 0 ? ZERO : new Duration(j);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j) {
        return j == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j) {
        return j == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j) {
        return j == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j) {
        return j == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j, (int) DateTimeConstants.MILLIS_PER_SECOND));
    }

    public final Duration dividedBy(long j) {
        return j == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j));
    }

    public final Duration dividedBy(long j, RoundingMode roundingMode) {
        return j == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j, roundingMode));
    }

    public final long getStandardDays() {
        return getMillis() / 86400000;
    }

    public final long getStandardHours() {
        return getMillis() / 3600000;
    }

    public final long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public final long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public final Duration minus(long j) {
        return withDurationAdded(j, -1);
    }

    public final Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public final Duration multipliedBy(long j) {
        return j == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j));
    }

    public final Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public final Duration plus(long j) {
        return withDurationAdded(j, 1);
    }

    public final Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public final Duration toDuration() {
        return this;
    }

    public final Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public final Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public final Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public final Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public final Duration withDurationAdded(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j, i)));
    }

    public final Duration withDurationAdded(ReadableDuration readableDuration, int i) {
        return (readableDuration == null || i == 0) ? this : withDurationAdded(readableDuration.getMillis(), i);
    }

    public final Duration withMillis(long j) {
        return j == getMillis() ? this : new Duration(j);
    }
}
