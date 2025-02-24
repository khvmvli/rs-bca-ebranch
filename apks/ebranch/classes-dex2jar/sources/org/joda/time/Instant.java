package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes-dex2jar.jar:org/joda/time/Instant.class */
public final class Instant extends AbstractInstant implements ReadableInstant, Serializable {
    private static final long serialVersionUID;
    private final long iMillis;

    public Instant() {
        this.iMillis = DateTimeUtils.currentTimeMillis();
    }

    public Instant(long j) {
        this.iMillis = j;
    }

    public Instant(Object obj) {
        this.iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now() {
        return new Instant();
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser());
    }

    public static Instant parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toInstant();
    }

    @Override // org.joda.time.ReadableInstant
    public final Chronology getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    @Override // org.joda.time.ReadableInstant
    public final long getMillis() {
        return this.iMillis;
    }

    public final Instant minus(long j) {
        return withDurationAdded(j, -1);
    }

    public final Instant minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public final Instant plus(long j) {
        return withDurationAdded(j, 1);
    }

    public final Instant plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public final DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public final DateTime toDateTimeISO() {
        return toDateTime();
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableInstant
    public final Instant toInstant() {
        return this;
    }

    @Override // org.joda.time.base.AbstractInstant
    public final MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public final MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public final Instant withDurationAdded(long j, int i) {
        return (j == 0 || i == 0) ? this : withMillis(getChronology().add(getMillis(), j, i));
    }

    public final Instant withDurationAdded(ReadableDuration readableDuration, int i) {
        return (readableDuration == null || i == 0) ? this : withDurationAdded(readableDuration.getMillis(), i);
    }

    public final Instant withMillis(long j) {
        return j == this.iMillis ? this : new Instant(j);
    }
}
