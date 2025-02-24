package org.joda.time.tz;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
/* loaded from: classes2-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$Transition.class */
final class DateTimeZoneBuilder$Transition {
    private final long iMillis;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeZoneBuilder$Transition(long j, String str, int i, int i2) {
        this.iMillis = j;
        this.iNameKey = str;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeZoneBuilder$Transition(long j, DateTimeZoneBuilder$Rule dateTimeZoneBuilder$Rule, int i) {
        this.iMillis = j;
        this.iNameKey = dateTimeZoneBuilder$Rule.getNameKey();
        this.iWallOffset = dateTimeZoneBuilder$Rule.getSaveMillis() + i;
        this.iStandardOffset = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeZoneBuilder$Transition(long j, DateTimeZoneBuilder$Transition dateTimeZoneBuilder$Transition) {
        this.iMillis = j;
        this.iNameKey = dateTimeZoneBuilder$Transition.iNameKey;
        this.iWallOffset = dateTimeZoneBuilder$Transition.iWallOffset;
        this.iStandardOffset = dateTimeZoneBuilder$Transition.iStandardOffset;
    }

    public final long getMillis() {
        return this.iMillis;
    }

    public final String getNameKey() {
        return this.iNameKey;
    }

    public final int getSaveMillis() {
        return this.iWallOffset - this.iStandardOffset;
    }

    public final int getStandardOffset() {
        return this.iStandardOffset;
    }

    public final int getWallOffset() {
        return this.iWallOffset;
    }

    public final boolean isTransitionFrom(DateTimeZoneBuilder$Transition dateTimeZoneBuilder$Transition) {
        boolean z;
        if (dateTimeZoneBuilder$Transition == null) {
            return true;
        }
        if (this.iMillis > dateTimeZoneBuilder$Transition.iMillis) {
            z = true;
            if (this.iWallOffset == dateTimeZoneBuilder$Transition.iWallOffset) {
                z = true;
                if (this.iStandardOffset == dateTimeZoneBuilder$Transition.iStandardOffset) {
                    if (!this.iNameKey.equals(dateTimeZoneBuilder$Transition.iNameKey)) {
                        z = true;
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new DateTime(this.iMillis, DateTimeZone.UTC));
        sb.append(" ");
        sb.append(this.iStandardOffset);
        sb.append(" ");
        sb.append(this.iWallOffset);
        return sb.toString();
    }

    public final DateTimeZoneBuilder$Transition withMillis(long j) {
        return new DateTimeZoneBuilder$Transition(j, this.iNameKey, this.iWallOffset, this.iStandardOffset);
    }
}
