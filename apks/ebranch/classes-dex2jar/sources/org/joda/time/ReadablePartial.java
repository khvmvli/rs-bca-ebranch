package org.joda.time;
/* loaded from: classes-dex2jar.jar:org/joda/time/ReadablePartial.class */
public interface ReadablePartial extends Comparable<ReadablePartial> {
    @Override // java.lang.Object
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    DateTimeField getField(int i);

    DateTimeFieldType getFieldType(int i);

    int getValue(int i);

    @Override // java.lang.Object
    int hashCode();

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();

    DateTime toDateTime(ReadableInstant readableInstant);

    @Override // java.lang.Object
    String toString();
}
