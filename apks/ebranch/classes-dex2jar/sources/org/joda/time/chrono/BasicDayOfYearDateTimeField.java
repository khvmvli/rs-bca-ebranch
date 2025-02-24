package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicDayOfYearDateTimeField.class */
final class BasicDayOfYearDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -6821236822336841037L;
    private final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicDayOfYearDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfYear(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int get(long j) {
        return this.iChronology.getDayOfYear(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(long j) {
        return this.iChronology.getDaysInYear(this.iChronology.getYear(j));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial) {
        if (!readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInYearMax();
        }
        return this.iChronology.getDaysInYear(readablePartial.get(DateTimeFieldType.year()));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            if (readablePartial.getFieldType(i) == DateTimeFieldType.year()) {
                return this.iChronology.getDaysInYear(iArr[i]);
            }
        }
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public final int getMaximumValueForSet(long j, int i) {
        int daysInYearMax = this.iChronology.getDaysInYearMax() - 1;
        if (i > daysInYearMax || i <= 0) {
            daysInYearMax = getMaximumValue(j);
        }
        return daysInYearMax;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final boolean isLeap(long j) {
        return this.iChronology.isLeapDay(j);
    }
}
