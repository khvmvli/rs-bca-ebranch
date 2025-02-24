package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/ImpreciseDateTimeField.class */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID;
    private final DurationField iDurationField;
    final long iUnitMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/field/ImpreciseDateTimeField$LinkedDurationField.class */
    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
            ImpreciseDateTimeField.this = r4;
        }

        @Override // org.joda.time.DurationField
        public final long add(long j, int i) {
            return ImpreciseDateTimeField.this.add(j, i);
        }

        @Override // org.joda.time.DurationField
        public final long add(long j, long j2) {
            return ImpreciseDateTimeField.this.add(j, j2);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public final int getDifference(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifference(j, j2);
        }

        @Override // org.joda.time.DurationField
        public final long getDifferenceAsLong(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j, j2);
        }

        @Override // org.joda.time.DurationField
        public final long getMillis(int i, long j) {
            return ImpreciseDateTimeField.this.add(j, i) - j;
        }

        @Override // org.joda.time.DurationField
        public final long getMillis(long j, long j2) {
            return ImpreciseDateTimeField.this.add(j2, j) - j2;
        }

        @Override // org.joda.time.DurationField
        public final long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public final int getValue(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifference(j + j2, j2);
        }

        @Override // org.joda.time.DurationField
        public final long getValueAsLong(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j + j2, j2);
        }

        @Override // org.joda.time.DurationField
        public final boolean isPrecise() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.iUnitMillis = j;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j, int i);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j, long j2);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j, long j2) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j, j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [long] */
    /* JADX WARN: Type inference failed for: r13v4, types: [long] */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long getDifferenceAsLong(long r7, long r9) {
        /*
            r6 = this;
            r0 = r7
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x000e
            r0 = r6
            r1 = r9
            r2 = r7
            long r0 = r0.getDifferenceAsLong(r1, r2)
            long r0 = -r0
            return r0
        L_0x000e:
            r0 = r7
            r1 = r9
            long r0 = r0 - r1
            r1 = r6
            long r1 = r1.iUnitMillis
            long r0 = r0 / r1
            r11 = r0
            r0 = r6
            r1 = r9
            r2 = r11
            long r0 = r0.add(r1, r2)
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0043
        L_0x0024:
            r0 = r11
            r1 = 1
            long r0 = r0 + r1
            r13 = r0
            r0 = r13
            r11 = r0
            r0 = r6
            r1 = r9
            r2 = r13
            long r0 = r0.add(r1, r2)
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r0 = r13
            r1 = 1
            long r0 = r0 - r1
            r13 = r0
            goto L_0x0069
        L_0x0043:
            r0 = r11
            r13 = r0
            r0 = r6
            r1 = r9
            r2 = r11
            long r0 = r0.add(r1, r2)
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
        L_0x0053:
            r0 = r11
            r1 = 1
            long r0 = r0 - r1
            r13 = r0
            r0 = r13
            r11 = r0
            r0 = r6
            r1 = r9
            r2 = r13
            long r0 = r0.add(r1, r2)
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0053
        L_0x0069:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.ImpreciseDateTimeField.getDifferenceAsLong(long, long):long");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    protected final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j, int i);
}
