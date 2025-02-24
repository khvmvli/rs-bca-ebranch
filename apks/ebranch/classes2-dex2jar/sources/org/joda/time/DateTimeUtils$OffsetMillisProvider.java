package org.joda.time;

import org.joda.time.DateTimeUtils;
/* loaded from: classes2-dex2jar.jar:org/joda/time/DateTimeUtils$OffsetMillisProvider.class */
class DateTimeUtils$OffsetMillisProvider implements DateTimeUtils.MillisProvider {
    private final long iMillis;

    DateTimeUtils$OffsetMillisProvider(long j) {
        this.iMillis = j;
    }

    public long getMillis() {
        return System.currentTimeMillis() + this.iMillis;
    }
}
