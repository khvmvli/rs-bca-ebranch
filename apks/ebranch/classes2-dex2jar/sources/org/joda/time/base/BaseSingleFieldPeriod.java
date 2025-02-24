package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
/* loaded from: classes2-dex2jar.jar:org/joda/time/base/BaseSingleFieldPeriod.class */
public abstract class BaseSingleFieldPeriod implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public BaseSingleFieldPeriod(int i) {
        this.iPeriod = i;
    }

    public static int between(ReadableInstant readableInstant, ReadableInstant readableInstant2, DurationFieldType durationFieldType) {
        if (readableInstant != null && readableInstant2 != null) {
            return durationFieldType.getField(DateTimeUtils.getInstantChronology(readableInstant)).getDifference(readableInstant2.getMillis(), readableInstant.getMillis());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }

    public static int between(ReadablePartial readablePartial, ReadablePartial readablePartial2, ReadablePeriod readablePeriod) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        } else if (readablePartial.size() == readablePartial2.size()) {
            int size = readablePartial.size();
            for (int i = 0; i < size; i++) {
                if (readablePartial.getFieldType(i) != readablePartial2.getFieldType(i)) {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            if (DateTimeUtils.isContiguous(readablePartial)) {
                Chronology withUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
                return withUTC.get(readablePeriod, withUTC.set(readablePartial, (long) START_1972), withUTC.set(readablePartial2, (long) START_1972))[0];
            }
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
    }

    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int standardPeriodIn(org.joda.time.ReadablePeriod r6, long r7) {
        /*
            r0 = 0
            r9 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            org.joda.time.chrono.ISOChronology r0 = org.joda.time.chrono.ISOChronology.getInstanceUTC()
            r10 = r0
            r0 = 0
            r11 = r0
        L_0x0010:
            r0 = r9
            r1 = r6
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0092
            r0 = r6
            r1 = r9
            int r0 = r0.getValue(r1)
            r13 = r0
            r0 = r11
            r14 = r0
            r0 = r13
            if (r0 == 0) goto L_0x0088
            r0 = r6
            r1 = r9
            org.joda.time.DurationFieldType r0 = r0.getFieldType(r1)
            r1 = r10
            org.joda.time.DurationField r0 = r0.getField(r1)
            r16 = r0
            r0 = r16
            boolean r0 = r0.isPrecise()
            if (r0 == 0) goto L_0x0056
            r0 = r11
            r1 = r16
            long r1 = r1.getUnitMillis()
            r2 = r13
            long r1 = org.joda.time.field.FieldUtils.safeMultiply(r1, r2)
            long r0 = org.joda.time.field.FieldUtils.safeAdd(r0, r1)
            r14 = r0
            goto L_0x0088
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Cannot convert period to duration as "
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r16
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = " is not precise in the period "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x0088:
            int r9 = r9 + 1
            r0 = r14
            r11 = r0
            goto L_0x0010
        L_0x0092:
            r0 = r11
            r1 = r7
            long r0 = r0 / r1
            int r0 = org.joda.time.field.FieldUtils.safeToInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(org.joda.time.ReadablePeriod, long):int");
    }

    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass());
        sb.append(" cannot be compared to ");
        sb.append(baseSingleFieldPeriod.getClass());
        throw new ClassCastException(sb.toString());
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (!(readablePeriod.getPeriodType() == getPeriodType() && readablePeriod.getValue(0) == getValue())) {
            z = false;
        }
        return z;
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    public abstract DurationFieldType getFieldType();

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i) {
        if (i == 0) {
            return getFieldType();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // org.joda.time.ReadablePeriod
    public abstract PeriodType getPeriodType();

    protected int getValue() {
        return this.iPeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i) {
        if (i == 0) {
            return getValue();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        return ((getValue() + 459) * 27) + getFieldType().hashCode();
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    protected void setValue(int i) {
        this.iPeriod = i;
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return 1;
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }
}
