package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
/* loaded from: classes2-dex2jar.jar:org/joda/time/Interval.class */
public final class Interval extends BaseInterval implements ReadableInterval, Serializable {
    private static final long serialVersionUID;

    public Interval(long j, long j2) {
        super(j, j2, null);
    }

    public Interval(long j, long j2, Chronology chronology) {
        super(j, j2, chronology);
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(Object obj) {
        super(obj, (Chronology) null);
    }

    public Interval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }

    public Interval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public Interval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public Interval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Interval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public Interval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    public static Interval parseWithOffset(String str) {
        Period period;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    DateTimeFormatter withOffsetParsed = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
                    PeriodFormatter standard = ISOPeriodFormat.standard();
                    char charAt = substring.charAt(0);
                    DateTime dateTime = null;
                    if (charAt == 'P' || charAt == 'p') {
                        period = standard.withParseType(PeriodType.standard()).parsePeriod(substring);
                    } else {
                        dateTime = withOffsetParsed.parseDateTime(substring);
                        period = null;
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime parseDateTime = withOffsetParsed.parseDateTime(substring2);
                        return period != null ? new Interval((ReadablePeriod) period, (ReadableInstant) parseDateTime) : new Interval((ReadableInstant) dateTime, (ReadableInstant) parseDateTime);
                    } else if (period == null) {
                        return new Interval((ReadableInstant) dateTime, (ReadablePeriod) standard.withParseType(PeriodType.standard()).parsePeriod(substring2));
                    } else {
                        StringBuilder sb = new StringBuilder("Interval composed of two durations: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Format invalid: ");
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Format invalid: ");
                sb3.append(str);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder("Format requires a '/' separator: ");
            sb4.append(str);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean abuts(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            boolean z = true;
            if (getStartMillis() != currentTimeMillis) {
                z = getEndMillis() == currentTimeMillis;
            }
            return z;
        }
        boolean z2 = true;
        if (readableInterval.getEndMillis() != getStartMillis()) {
            z2 = getEndMillis() == readableInterval.getStartMillis();
        }
        return z2;
    }

    public final Interval gap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        long startMillis = readableInterval2.getStartMillis();
        long endMillis = readableInterval2.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            return new Interval(endMillis, startMillis2, getChronology());
        }
        if (startMillis > endMillis2) {
            return new Interval(endMillis2, startMillis, getChronology());
        }
        return null;
    }

    public final Interval overlap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        if (!overlaps(readableInterval2)) {
            return null;
        }
        return new Interval(Math.max(getStartMillis(), readableInterval2.getStartMillis()), Math.min(getEndMillis(), readableInterval2.getEndMillis()), getChronology());
    }

    @Override // org.joda.time.base.AbstractInterval, org.joda.time.ReadableInterval
    public final Interval toInterval() {
        return this;
    }

    public final Interval withChronology(Chronology chronology) {
        return getChronology() == chronology ? this : new Interval(getStartMillis(), getEndMillis(), chronology);
    }

    public final Interval withDurationAfterStart(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(startMillis, durationMillis, 1), chronology);
    }

    public final Interval withDurationBeforeEnd(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(endMillis, durationMillis, -1), endMillis, chronology);
    }

    public final Interval withEnd(ReadableInstant readableInstant) {
        return withEndMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public final Interval withEndMillis(long j) {
        return j == getEndMillis() ? this : new Interval(getStartMillis(), j, getChronology());
    }

    public final Interval withPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationAfterStart(null);
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(readablePeriod, startMillis, 1), chronology);
    }

    public final Interval withPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationBeforeEnd(null);
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(readablePeriod, endMillis, -1), endMillis, chronology);
    }

    public final Interval withStart(ReadableInstant readableInstant) {
        return withStartMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public final Interval withStartMillis(long j) {
        return j == getStartMillis() ? this : new Interval(j, getEndMillis(), getChronology());
    }
}
