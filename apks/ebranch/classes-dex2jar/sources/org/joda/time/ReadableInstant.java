package org.joda.time;
/* loaded from: classes-dex2jar.jar:org/joda/time/ReadableInstant.class */
public interface ReadableInstant extends Comparable<ReadableInstant> {
    @Override // java.lang.Object
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    long getMillis();

    DateTimeZone getZone();

    @Override // java.lang.Object
    int hashCode();

    boolean isAfter(ReadableInstant readableInstant);

    boolean isBefore(ReadableInstant readableInstant);

    boolean isEqual(ReadableInstant readableInstant);

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    Instant toInstant();

    @Override // java.lang.Object
    String toString();
}
