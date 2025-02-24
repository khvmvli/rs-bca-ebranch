package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/GJYearOfEraDateTimeField.class */
final class GJYearOfEraDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = -5961050944769862059L;
    private final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GJYearOfEraDateTimeField(DateTimeField dateTimeField, BasicChronology basicChronology) {
        super(dateTimeField, DateTimeFieldType.yearOfEra());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.yearOfEra();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long add(long j, int i) {
        return getWrappedField().add(j, i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long addWrapField(long j, int i) {
        return getWrappedField().addWrapField(j, i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int[] addWrapField(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(readablePartial, i, iArr, i2);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int get(long j) {
        int i = getWrappedField().get(j);
        int i2 = i;
        if (i <= 0) {
            i2 = 1 - i;
        }
        return i2;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return this.iChronology.eras();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long remainder(long j) {
        return getWrappedField().remainder(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundCeiling(long j) {
        return getWrappedField().roundCeiling(j);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundFloor(long j) {
        return getWrappedField().roundFloor(j);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, getMaximumValue());
        int i2 = i;
        if (this.iChronology.getYear(j) <= 0) {
            i2 = 1 - i;
        }
        return set(j, i2);
    }
}
