package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/UnsupportedDurationField.class */
public final class UnsupportedDurationField extends DurationField implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        UnsupportedDurationField unsupportedDurationField2;
        synchronized (UnsupportedDurationField.class) {
            try {
                HashMap<DurationFieldType, UnsupportedDurationField> hashMap = cCache;
                if (hashMap == null) {
                    cCache = new HashMap<>(7);
                    unsupportedDurationField = null;
                } else {
                    unsupportedDurationField = hashMap.get(durationFieldType);
                }
                unsupportedDurationField2 = unsupportedDurationField;
                if (unsupportedDurationField == null) {
                    unsupportedDurationField2 = new UnsupportedDurationField(durationFieldType);
                    cCache.put(durationFieldType, unsupportedDurationField2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unsupportedDurationField2;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iType);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    @Override // org.joda.time.DurationField
    public final long add(long j, int i) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long add(long j, long j2) {
        throw unsupported();
    }

    public final int compareTo(DurationField durationField) {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() != null) {
            return unsupportedDurationField.getName().equals(getName());
        }
        if (getName() != null) {
            z = false;
        }
        return z;
    }

    @Override // org.joda.time.DurationField
    public final int getDifference(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getDifferenceAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(int i) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(int i, long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getMillis(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return 0;
    }

    @Override // org.joda.time.DurationField
    public final int getValue(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final int getValue(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getValueAsLong(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public final long getValueAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return getName().hashCode();
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public final boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DurationField, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("UnsupportedDurationField[");
        sb.append(getName());
        sb.append(']');
        return sb.toString();
    }
}
