package org.joda.time.field;

import org.joda.time.DateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/field/StrictDateTimeField.class */
public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    protected StrictDateTimeField(DateTimeField dateTimeField) {
        super(dateTimeField);
    }

    public static DateTimeField getInstance(DateTimeField dateTimeField) {
        if (dateTimeField == null) {
            return null;
        }
        DateTimeField dateTimeField2 = dateTimeField;
        if (dateTimeField instanceof LenientDateTimeField) {
            dateTimeField2 = ((LenientDateTimeField) dateTimeField).getWrappedField();
        }
        return !dateTimeField2.isLenient() ? dateTimeField2 : new StrictDateTimeField(dateTimeField2);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(j), getMaximumValue(j));
        return set(j, i);
    }
}
