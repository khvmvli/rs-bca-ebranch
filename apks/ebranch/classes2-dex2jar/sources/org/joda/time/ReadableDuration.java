package org.joda.time;
/* loaded from: classes2-dex2jar.jar:org/joda/time/ReadableDuration.class */
public interface ReadableDuration extends Comparable<ReadableDuration> {
    @Override // java.lang.Object
    boolean equals(Object obj);

    long getMillis();

    @Override // java.lang.Object
    int hashCode();

    boolean isEqual(ReadableDuration readableDuration);

    boolean isLongerThan(ReadableDuration readableDuration);

    boolean isShorterThan(ReadableDuration readableDuration);

    Duration toDuration();

    Period toPeriod();

    @Override // java.lang.Object
    String toString();
}
