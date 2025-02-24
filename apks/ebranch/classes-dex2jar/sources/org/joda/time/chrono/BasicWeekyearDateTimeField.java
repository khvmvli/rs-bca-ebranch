package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicWeekyearDateTimeField.class */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {
    private static final long WEEK_53 = 31449600000L;
    private static final long serialVersionUID = 6215066916806820644L;
    private final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicWeekyearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.weekyear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long add(long j, int i) {
        return i == 0 ? j : set(j, get(j) + i);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long add(long j, long j2) {
        return add(j, FieldUtils.safeToInt(j2));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long addWrapField(long j, int i) {
        return add(j, i);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int get(long j) {
        return this.iChronology.getWeekyear(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long getDifferenceAsLong(long r7, long r9) {
        /*
            r6 = this;
            r0 = r7
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x000f
            r0 = r6
            r1 = r9
            r2 = r7
            int r0 = r0.getDifference(r1, r2)
            int r0 = -r0
            long r0 = (long) r0
            return r0
        L_0x000f:
            r0 = r6
            r1 = r7
            int r0 = r0.get(r1)
            r11 = r0
            r0 = r6
            r1 = r9
            int r0 = r0.get(r1)
            r12 = r0
            r0 = r6
            r1 = r7
            long r0 = r0.remainder(r1)
            r13 = r0
            r0 = r6
            r1 = r9
            long r0 = r0.remainder(r1)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = 31449600000(0x7528ad000, double:1.55381669354E-313)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004a
            r0 = r9
            r7 = r0
            r0 = r6
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r11
            int r0 = r0.getWeeksInYear(r1)
            r1 = 52
            if (r0 > r1) goto L_0x004a
            r0 = r9
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r1
            r7 = r0
        L_0x004a:
            r0 = r11
            r1 = r12
            int r0 = r0 - r1
            r11 = r0
            r0 = r11
            r12 = r0
            r0 = r13
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            r0 = r11
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
        L_0x0062:
            r0 = r12
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicWeekyearDateTimeField.getDifferenceAsLong(long, long):long");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getLeapAmount(long j) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) - 52;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getLeapDurationField() {
        return this.iChronology.weeks();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final boolean isLeap(long j) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j)) > 52;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long remainder(long j) {
        return j - roundFloor(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [org.joda.time.chrono.BasicChronology] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long roundFloor(long r8) {
        /*
            r7 = this;
            r0 = r7
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            org.joda.time.DateTimeField r0 = r0.weekOfWeekyear()
            r1 = r8
            long r0 = r0.roundFloor(r1)
            r10 = r0
            r0 = r7
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r10
            int r0 = r0.getWeekOfWeekyear(r1)
            r12 = r0
            r0 = r10
            r8 = r0
            r0 = r12
            r1 = 1
            if (r0 <= r1) goto L_0x002a
            r0 = r10
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            long r1 = (long) r1
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            long r1 = r1 * r2
            long r0 = r0 - r1
            r8 = r0
        L_0x002a:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicWeekyearDateTimeField.roundFloor(long):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0, types: [org.joda.time.chrono.BasicWeekyearDateTimeField, org.joda.time.DateTimeField] */
    /* JADX WARN: Type inference failed for: r9v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long set(long r9, int r11) {
        /*
            r8 = this;
            r0 = r8
            r1 = r11
            int r1 = java.lang.Math.abs(r1)
            r2 = r8
            org.joda.time.chrono.BasicChronology r2 = r2.iChronology
            int r2 = r2.getMinYear()
            r3 = r8
            org.joda.time.chrono.BasicChronology r3 = r3.iChronology
            int r3 = r3.getMaxYear()
            org.joda.time.field.FieldUtils.verifyValueBounds(r0, r1, r2, r3)
            r0 = r8
            r1 = r9
            int r0 = r0.get(r1)
            r12 = r0
            r0 = r12
            r1 = r11
            if (r0 != r1) goto L_0x0025
            r0 = r9
            return r0
        L_0x0025:
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r9
            int r0 = r0.getDayOfWeek(r1)
            r13 = r0
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r12
            int r0 = r0.getWeeksInYear(r1)
            r14 = r0
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r11
            int r0 = r0.getWeeksInYear(r1)
            r15 = r0
            r0 = r14
            r12 = r0
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L_0x0053
            r0 = r15
            r12 = r0
        L_0x0053:
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r9
            int r0 = r0.getWeekOfWeekyear(r1)
            r15 = r0
            r0 = r12
            r14 = r0
            r0 = r15
            r1 = r12
            if (r0 > r1) goto L_0x006c
            r0 = r15
            r14 = r0
        L_0x006c:
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r9
            r2 = r11
            long r0 = r0.setYear(r1, r2)
            r16 = r0
            r0 = r8
            r1 = r16
            int r0 = r0.get(r1)
            r12 = r0
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L_0x008f
            r0 = r16
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r1
            r9 = r0
            goto L_0x009f
        L_0x008f:
            r0 = r16
            r9 = r0
            r0 = r12
            r1 = r11
            if (r0 <= r1) goto L_0x009f
            r0 = r16
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r1
            r9 = r0
        L_0x009f:
            r0 = r14
            r1 = r8
            org.joda.time.chrono.BasicChronology r1 = r1.iChronology
            r2 = r9
            int r1 = r1.getWeekOfWeekyear(r2)
            int r0 = r0 - r1
            long r0 = (long) r0
            r16 = r0
            r0 = r8
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            org.joda.time.DateTimeField r0 = r0.dayOfWeek()
            r1 = r9
            r2 = r16
            r3 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 * r3
            long r1 = r1 + r2
            r2 = r13
            long r0 = r0.set(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicWeekyearDateTimeField.set(long, int):long");
    }
}
