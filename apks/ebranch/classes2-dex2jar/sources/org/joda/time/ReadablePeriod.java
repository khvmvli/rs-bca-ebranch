package org.joda.time;
/* loaded from: classes2-dex2jar.jar:org/joda/time/ReadablePeriod.class */
public interface ReadablePeriod {
    boolean equals(Object obj);

    int get(DurationFieldType durationFieldType);

    DurationFieldType getFieldType(int i);

    PeriodType getPeriodType();

    int getValue(int i);

    int hashCode();

    boolean isSupported(DurationFieldType durationFieldType);

    int size();

    MutablePeriod toMutablePeriod();

    Period toPeriod();

    @Override // java.lang.Object
    String toString();
}
