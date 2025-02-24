package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicYearDateTimeField.class */
class BasicYearDateTimeField extends ImpreciseDateTimeField {
    private static final long serialVersionUID = -98628754872287L;
    protected final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicYearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.year(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.year();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        return i == 0 ? j : set(j, FieldUtils.safeAdd(get(j), i));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, long j2) {
        return add(j, FieldUtils.safeToInt(j2));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return i == 0 ? j : set(j, FieldUtils.getWrappedValue(this.iChronology.getYear(j), i, this.iChronology.getMinYear(), this.iChronology.getMaxYear()));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.iChronology.getYear(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j, long j2) {
        return j < j2 ? -this.iChronology.getYearDifference(j2, j) : this.iChronology.getYearDifference(j, j2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return this.iChronology.isLeapYear(get(j)) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        return this.iChronology.isLeapYear(get(j));
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long roundCeiling(long r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.get(r1)
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r6
            r1 = r5
            org.joda.time.chrono.BasicChronology r1 = r1.iChronology
            r2 = r8
            long r1 = r1.getYearMillis(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            r0 = r5
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            long r0 = r0.getYearMillis(r1)
            r9 = r0
        L_0x0022:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicYearDateTimeField.roundCeiling(long):long");
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        return this.iChronology.getYearMillis(get(j));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, this.iChronology.getMinYear(), this.iChronology.getMaxYear());
        return this.iChronology.setYear(j, i);
    }

    @Override // org.joda.time.DateTimeField
    public long setExtended(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, this.iChronology.getMinYear() - 1, this.iChronology.getMaxYear() + 1);
        return this.iChronology.setYear(j, i);
    }
}
