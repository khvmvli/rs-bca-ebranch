package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
/* loaded from: classes2-dex2jar.jar:org/joda/time/field/SkipDateTimeField.class */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue - 1;
        } else if (minimumValue == i) {
            this.iMinValue = i + 1;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public final int get(long j) {
        int i = get(j);
        int i2 = i;
        if (i <= this.iSkip) {
            i2 = i - 1;
        }
        return i2;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public final int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public final long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, this.iMinValue, getMaximumValue());
        int i2 = this.iSkip;
        int i3 = i;
        if (i <= i2) {
            if (i != i2) {
                i3 = i + 1;
            } else {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i), (Number) null, (Number) null);
            }
        }
        return set(j, i3);
    }
}
