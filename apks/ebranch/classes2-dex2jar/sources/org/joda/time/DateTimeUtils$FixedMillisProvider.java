package org.joda.time;

import org.joda.time.DateTimeUtils;
/* loaded from: classes2-dex2jar.jar:org/joda/time/DateTimeUtils$FixedMillisProvider.class */
class DateTimeUtils$FixedMillisProvider implements DateTimeUtils.MillisProvider {
    private final long iMillis;

    DateTimeUtils$FixedMillisProvider(long j) {
        this.iMillis = j;
    }

    public long getMillis() {
        return this.iMillis;
    }
}
