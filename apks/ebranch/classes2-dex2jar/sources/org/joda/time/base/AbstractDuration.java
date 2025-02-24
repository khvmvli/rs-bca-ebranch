package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;
/* loaded from: classes2-dex2jar.jar:org/joda/time/base/AbstractDuration.class */
public abstract class AbstractDuration implements ReadableDuration {
    public int compareTo(ReadableDuration readableDuration) {
        int i = (getMillis() > readableDuration.getMillis() ? 1 : (getMillis() == readableDuration.getMillis() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @Override // org.joda.time.ReadableDuration, java.lang.Object
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadableDuration)) {
            return false;
        }
        if (getMillis() != ((ReadableDuration) obj).getMillis()) {
            z = false;
        }
        return z;
    }

    @Override // org.joda.time.ReadableDuration, java.lang.Object
    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isEqual(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) == 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isLongerThan(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) > 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isShorterThan(ReadableDuration readableDuration) {
        ReadableDuration readableDuration2 = readableDuration;
        if (readableDuration == null) {
            readableDuration2 = Duration.ZERO;
        }
        return compareTo(readableDuration2) < 0;
    }

    @Override // org.joda.time.ReadableDuration
    public Duration toDuration() {
        return new Duration(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    public Period toPeriod() {
        return new Period(getMillis());
    }

    @Override // org.joda.time.ReadableDuration, java.lang.Object
    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z = millis < 0;
        FormatUtils.appendUnpaddedInteger(stringBuffer, millis);
        while (true) {
            int length = stringBuffer.length();
            int i = 3;
            if (length >= (z ? 7 : 6)) {
                break;
            }
            if (!z) {
                i = 2;
            }
            stringBuffer.insert(i, "0");
        }
        if ((millis / 1000) * 1000 == millis) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
