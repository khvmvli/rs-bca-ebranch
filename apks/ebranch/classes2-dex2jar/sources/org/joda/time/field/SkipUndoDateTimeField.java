package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/field/SkipUndoDateTimeField.class */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue + 1;
        } else if (minimumValue == i + 1) {
            this.iMinValue = i;
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
        if (i < this.iSkip) {
            i2 = i + 1;
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
        int i2 = i;
        if (i <= this.iSkip) {
            i2 = i - 1;
        }
        return set(j, i2);
    }
}
