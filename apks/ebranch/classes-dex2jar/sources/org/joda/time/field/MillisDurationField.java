package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/MillisDurationField.class */
public final class MillisDurationField extends DurationField implements Serializable {
    public static final DurationField INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.joda.time.DurationField
    public final long add(long j, int i) {
        return FieldUtils.safeAdd(j, (long) i);
    }

    @Override // org.joda.time.DurationField
    public final long add(long j, long j2) {
        return FieldUtils.safeAdd(j, j2);
    }

    public final int compareTo(DurationField durationField) {
        int i = (getUnitMillis() > durationField.getUnitMillis() ? 1 : (getUnitMillis() == durationField.getUnitMillis() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof MillisDurationField) {
            z = false;
            if (getUnitMillis() == ((MillisDurationField) obj).getUnitMillis()) {
                z = true;
            }
        }
        return z;
    }

    @Override // org.joda.time.DurationField
    public final int getDifference(long j, long j2) {
        return FieldUtils.safeToInt(FieldUtils.safeSubtract(j, j2));
    }

    @Override // org.joda.time.DurationField
    public final long getDifferenceAsLong(long j, long j2) {
        return FieldUtils.safeSubtract(j, j2);
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(int i) {
        return (long) i;
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(int i, long j) {
        return (long) i;
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(long j) {
        return j;
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(long j, long j2) {
        return j;
    }

    @Override // org.joda.time.DurationField
    public final String getName() {
        return "millis";
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return DurationFieldType.millis();
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return 1;
    }

    @Override // org.joda.time.DurationField
    public final int getValue(long j) {
        return FieldUtils.safeToInt(j);
    }

    @Override // org.joda.time.DurationField
    public final int getValue(long j, long j2) {
        return FieldUtils.safeToInt(j);
    }

    @Override // org.joda.time.DurationField
    public final long getValueAsLong(long j) {
        return j;
    }

    @Override // org.joda.time.DurationField
    public final long getValueAsLong(long j, long j2) {
        return j;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return (int) getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DurationField, java.lang.Object
    public final String toString() {
        return "DurationField[millis]";
    }
}
