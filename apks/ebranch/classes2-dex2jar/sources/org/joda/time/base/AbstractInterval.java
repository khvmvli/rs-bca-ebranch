package org.joda.time.base;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes2-dex2jar.jar:org/joda/time/base/AbstractInterval.class */
public abstract class AbstractInterval implements ReadableInterval {
    protected void checkInterval(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException("The end instant must be greater than the start instant");
        }
    }

    public boolean contains(long j) {
        return j >= getStartMillis() && j < getEndMillis();
    }

    @Override // org.joda.time.ReadableInterval
    public boolean contains(ReadableInstant readableInstant) {
        return readableInstant == null ? containsNow() : contains(readableInstant.getMillis());
    }

    @Override // org.joda.time.ReadableInterval
    public boolean contains(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return containsNow();
        }
        long startMillis = readableInterval.getStartMillis();
        long endMillis = readableInterval.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        return startMillis2 <= startMillis && startMillis < endMillis2 && endMillis <= endMillis2;
    }

    public boolean containsNow() {
        return contains(DateTimeUtils.currentTimeMillis());
    }

    @Override // org.joda.time.ReadableInterval
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableInterval)) {
            return false;
        }
        ReadableInterval readableInterval = (ReadableInterval) obj;
        if (!(getStartMillis() == readableInterval.getStartMillis() && getEndMillis() == readableInterval.getEndMillis() && FieldUtils.equals(getChronology(), readableInterval.getChronology()))) {
            z = false;
        }
        return z;
    }

    @Override // org.joda.time.ReadableInterval
    public DateTime getEnd() {
        return new DateTime(getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public DateTime getStart() {
        return new DateTime(getStartMillis(), getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public int hashCode() {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        return ((((((int) (startMillis ^ (startMillis >>> 32))) + 3007) * 31) + ((int) (endMillis ^ (endMillis >>> 32)))) * 31) + getChronology().hashCode();
    }

    public boolean isAfter(long j) {
        return getStartMillis() > j;
    }

    @Override // org.joda.time.ReadableInterval
    public boolean isAfter(ReadableInstant readableInstant) {
        return readableInstant == null ? isAfterNow() : isAfter(readableInstant.getMillis());
    }

    @Override // org.joda.time.ReadableInterval
    public boolean isAfter(ReadableInterval readableInterval) {
        return getStartMillis() >= (readableInterval == null ? DateTimeUtils.currentTimeMillis() : readableInterval.getEndMillis());
    }

    public boolean isAfterNow() {
        return isAfter(DateTimeUtils.currentTimeMillis());
    }

    public boolean isBefore(long j) {
        return getEndMillis() <= j;
    }

    @Override // org.joda.time.ReadableInterval
    public boolean isBefore(ReadableInstant readableInstant) {
        return readableInstant == null ? isBeforeNow() : isBefore(readableInstant.getMillis());
    }

    @Override // org.joda.time.ReadableInterval
    public boolean isBefore(ReadableInterval readableInterval) {
        return readableInterval == null ? isBeforeNow() : isBefore(readableInterval.getStartMillis());
    }

    public boolean isBeforeNow() {
        return isBefore(DateTimeUtils.currentTimeMillis());
    }

    public boolean isEqual(ReadableInterval readableInterval) {
        return getStartMillis() == readableInterval.getStartMillis() && getEndMillis() == readableInterval.getEndMillis();
    }

    @Override // org.joda.time.ReadableInterval
    public boolean overlaps(ReadableInterval readableInterval) {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        if (readableInterval == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            boolean z = false;
            if (startMillis < currentTimeMillis) {
                z = currentTimeMillis < endMillis;
            }
            return z;
        }
        long startMillis2 = readableInterval.getStartMillis();
        boolean z2 = false;
        if (startMillis < readableInterval.getEndMillis()) {
            z2 = false;
            if (startMillis2 < endMillis) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // org.joda.time.ReadableInterval
    public Duration toDuration() {
        long durationMillis = toDurationMillis();
        return durationMillis == 0 ? Duration.ZERO : new Duration(durationMillis);
    }

    @Override // org.joda.time.ReadableInterval
    public long toDurationMillis() {
        return FieldUtils.safeSubtract(getEndMillis(), getStartMillis());
    }

    @Override // org.joda.time.ReadableInterval
    public Interval toInterval() {
        return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public MutableInterval toMutableInterval() {
        return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public Period toPeriod() {
        return new Period(getStartMillis(), getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public Period toPeriod(PeriodType periodType) {
        return new Period(getStartMillis(), getEndMillis(), periodType, getChronology());
    }

    @Override // org.joda.time.ReadableInterval
    public String toString() {
        DateTimeFormatter withChronology = ISODateTimeFormat.dateTime().withChronology(getChronology());
        StringBuffer stringBuffer = new StringBuffer(48);
        withChronology.printTo(stringBuffer, getStartMillis());
        stringBuffer.append('/');
        withChronology.printTo(stringBuffer, getEndMillis());
        return stringBuffer.toString();
    }
}
