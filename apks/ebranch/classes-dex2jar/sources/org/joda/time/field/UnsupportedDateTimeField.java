package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/UnsupportedDateTimeField.class */
public final class UnsupportedDateTimeField extends DateTimeField implements Serializable {
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache;
    private static final long serialVersionUID = -1934618396111902255L;
    private final DurationField iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        if (dateTimeFieldType == null || durationField == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = durationField;
    }

    public static UnsupportedDateTimeField getInstance(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            try {
                HashMap<DateTimeFieldType, UnsupportedDateTimeField> hashMap = cCache;
                UnsupportedDateTimeField unsupportedDateTimeField2 = null;
                if (hashMap == null) {
                    cCache = new HashMap<>(7);
                } else {
                    UnsupportedDateTimeField unsupportedDateTimeField3 = hashMap.get(dateTimeFieldType);
                    if (unsupportedDateTimeField3 == null || unsupportedDateTimeField3.getDurationField() == durationField) {
                        unsupportedDateTimeField2 = unsupportedDateTimeField3;
                    }
                }
                unsupportedDateTimeField = unsupportedDateTimeField2;
                if (unsupportedDateTimeField2 == null) {
                    unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, durationField);
                    cCache.put(dateTimeFieldType, unsupportedDateTimeField);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return getInstance(this.iType, this.iDurationField);
    }

    private UnsupportedOperationException unsupported() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iType);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    @Override // org.joda.time.DateTimeField
    public final long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    @Override // org.joda.time.DateTimeField
    public final long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public final int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long addWrapField(long j, int i) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int[] addWrapPartial(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int get(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(int i, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, int i, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(int i, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, int i, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public final long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.DateTimeField
    public final int getLeapAmount(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumShortTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumValue() {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumValue(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMinimumValue() {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMinimumValue(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMinimumValue(ReadablePartial readablePartial) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isLeap(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final long remainder(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long roundCeiling(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long roundFloor(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long roundHalfCeiling(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long roundHalfEven(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long roundHalfFloor(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j, int i) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j, String str) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j, String str, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public final String toString() {
        return "UnsupportedDateTimeField";
    }
}
