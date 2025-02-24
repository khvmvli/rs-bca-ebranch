package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/BaseDateTimeField.class */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.iType = dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        DateTimeField dateTimeField;
        int[] iArr2;
        int i3;
        if (i2 == 0) {
            return iArr;
        }
        DateTimeField dateTimeField2 = null;
        while (true) {
            dateTimeField = dateTimeField2;
            iArr2 = iArr;
            i3 = i2;
            if (i2 <= 0) {
                break;
            }
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j = (long) (iArr[i] + i2);
            if (j <= ((long) maximumValue)) {
                iArr[i] = (int) j;
                dateTimeField = dateTimeField2;
                iArr2 = iArr;
                i3 = i2;
                break;
            }
            DateTimeField dateTimeField3 = dateTimeField2;
            if (dateTimeField2 == null) {
                if (i != 0) {
                    dateTimeField3 = readablePartial.getField(i - 1);
                    if (getRangeDurationField().getType() != dateTimeField3.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i2 -= (maximumValue + 1) - iArr[i];
            iArr = dateTimeField3.add(readablePartial, i - 1, iArr, 1);
            iArr[i] = getMinimumValue(readablePartial, iArr);
            dateTimeField2 = dateTimeField3;
        }
        while (true) {
            if (i3 >= 0) {
                break;
            }
            int minimumValue = getMinimumValue(readablePartial, iArr2);
            long j2 = (long) (iArr2[i] + i3);
            if (j2 >= ((long) minimumValue)) {
                iArr2[i] = (int) j2;
                break;
            }
            DateTimeField dateTimeField4 = dateTimeField;
            if (dateTimeField == null) {
                if (i != 0) {
                    dateTimeField4 = readablePartial.getField(i - 1);
                    if (getRangeDurationField().getType() != dateTimeField4.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i3 -= (minimumValue - 1) - iArr2[i];
            iArr2 = dateTimeField4.add(readablePartial, i - 1, iArr2, -1);
            iArr2[i] = getMaximumValue(readablePartial, iArr2);
            dateTimeField = dateTimeField4;
        }
        return set(readablePartial, i, iArr2, iArr2[i]);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, getMinimumValue(j), getMaximumValue(j)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return set(readablePartial, i, iArr, FieldUtils.getWrappedValue(iArr[i], i2, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0179, code lost:
        return set(r8, r9, r14, r14[r9]);
     */
    @Override // org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] addWrapPartial(org.joda.time.ReadablePartial r8, int r9, int[] r10, int r11) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.addWrapPartial(org.joda.time.ReadablePartial, int, int[], int):int[]");
    }

    protected int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j);

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j) {
        return getAsShortText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j, Locale locale) {
        return getAsShortText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsShortText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j) {
        return getAsText(j, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j, Locale locale) {
        return getAsText(get(j), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long roundCeiling(long r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            long r0 = r0.roundFloor(r1)
            r8 = r0
            r0 = r6
            r10 = r0
            r0 = r8
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0017
            r0 = r5
            r1 = r8
            r2 = 1
            long r0 = r0.add(r1, r2)
            r10 = r0
        L_0x0017:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.roundCeiling(long):long");
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return roundCeiling - j <= j - roundFloor ? roundCeiling : roundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        long j2 = j - roundFloor;
        long j3 = roundCeiling - j;
        if (j2 < j3) {
            return roundFloor;
        }
        if (j3 >= j2 && (get(roundCeiling) & 1) != 0) {
            return roundFloor;
        }
        return roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j) {
        long roundFloor = roundFloor(j);
        long roundCeiling = roundCeiling(j);
        return j - roundFloor <= roundCeiling - j ? roundFloor : roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j, int i);

    @Override // org.joda.time.DateTimeField
    public final long set(long j, String str) {
        return set(j, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j, String str, Locale locale) {
        return set(j, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        FieldUtils.verifyValueBounds(this, i2, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i] = i2;
        while (true) {
            int i3 = i + 1;
            if (i3 >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i3);
            if (iArr[i3] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i3] = field.getMaximumValue(readablePartial, iArr);
            }
            i = i3;
            if (iArr[i3] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i3] = field.getMinimumValue(readablePartial, iArr);
                i = i3;
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i, iArr, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        StringBuilder sb = new StringBuilder("DateTimeField[");
        sb.append(getName());
        sb.append(']');
        return sb.toString();
    }
}
