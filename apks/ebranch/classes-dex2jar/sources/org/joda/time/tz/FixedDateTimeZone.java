package org.joda.time.tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/FixedDateTimeZone.class */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i, int i2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    @Override // org.joda.time.DateTimeZone, java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        if (!(getID().equals(fixedDateTimeZone.getID()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset)) {
            z = false;
        }
        return z;
    }

    @Override // org.joda.time.DateTimeZone
    public final String getNameKey(long j) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    public final int getOffset(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final int getOffsetFromLocal(long j) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final int getStandardOffset(long j) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone, java.lang.Object
    public final int hashCode() {
        return getID().hashCode() + (this.iStandardOffset * 37) + (this.iWallOffset * 31);
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean isFixed() {
        return true;
    }

    @Override // org.joda.time.DateTimeZone
    public final long nextTransition(long j) {
        return j;
    }

    @Override // org.joda.time.DateTimeZone
    public final long previousTransition(long j) {
        return j;
    }

    @Override // org.joda.time.DateTimeZone
    public final TimeZone toTimeZone() {
        String id = getID();
        if (id.length() != 6 || (!id.startsWith("+") && !id.startsWith("-"))) {
            return new SimpleTimeZone(this.iWallOffset, getID());
        }
        StringBuilder sb = new StringBuilder("GMT");
        sb.append(getID());
        return TimeZone.getTimeZone(sb.toString());
    }
}
