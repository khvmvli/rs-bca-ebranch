package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicWeekOfWeekyearDateTimeField.class */
final class BasicWeekOfWeekyearDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -1587436826395135328L;
    private final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicWeekOfWeekyearDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.weekOfWeekyear(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.weekOfWeekyear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int get(long j) {
        return this.iChronology.getWeekOfWeekyear(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return 53;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(long j) {
        return this.iChronology.getWeeksInYear(this.iChronology.getWeekyear(j));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.weekyear())) {
            return 53;
        }
        return this.iChronology.getWeeksInYear(readablePartial.get(DateTimeFieldType.weekyear()));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.weekyear()) {
                return this.iChronology.getWeeksInYear(iArr[i]);
            }
        }
        return 53;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public final int getMaximumValueForSet(long j, int i) {
        int i2 = 52;
        if (i > 52) {
            i2 = getMaximumValue(j);
        }
        return i2;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return this.iChronology.weekyears();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long remainder(long j) {
        return remainder(j + 259200000);
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundCeiling(long j) {
        return roundCeiling(j + 259200000) - 259200000;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundFloor(long j) {
        return roundFloor(j + 259200000) - 259200000;
    }
}
