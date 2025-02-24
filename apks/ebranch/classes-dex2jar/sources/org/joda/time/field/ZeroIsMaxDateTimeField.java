package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
/* loaded from: classes-dex2jar.jar:org/joda/time/field/ZeroIsMaxDateTimeField.class */
public final class ZeroIsMaxDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 961749798233026866L;

    public ZeroIsMaxDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeField, dateTimeFieldType);
        if (dateTimeField.getMinimumValue() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
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
        if (i == 0) {
            i2 = getMaximumValue();
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

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return getWrappedField().getMaximumValue() + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(long j) {
        return getWrappedField().getMaximumValue(j) + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial) {
        return getWrappedField().getMaximumValue(readablePartial) + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getWrappedField().getMaximumValue(readablePartial, iArr) + 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue(long j) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue(ReadablePartial readablePartial) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final boolean isLeap(long j) {
        return getWrappedField().isLeap(j);
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

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfCeiling(long j) {
        return getWrappedField().roundHalfCeiling(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfEven(long j) {
        return getWrappedField().roundHalfEven(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfFloor(long j) {
        return getWrappedField().roundHalfFloor(j);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long set(long j, int i) {
        int maximumValue = getMaximumValue();
        FieldUtils.verifyValueBounds(this, i, 1, maximumValue);
        int i2 = i;
        if (i == maximumValue) {
            i2 = 0;
        }
        return getWrappedField().set(j, i2);
    }
}
