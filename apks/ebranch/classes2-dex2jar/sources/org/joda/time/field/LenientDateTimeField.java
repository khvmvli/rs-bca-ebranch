package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/field/LenientDateTimeField.class */
public class LenientDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID;
    private final Chronology iBase;

    protected LenientDateTimeField(DateTimeField dateTimeField, Chronology chronology) {
        super(dateTimeField);
        this.iBase = chronology;
    }

    public static DateTimeField getInstance(DateTimeField dateTimeField, Chronology chronology) {
        if (dateTimeField == null) {
            return null;
        }
        DateTimeField dateTimeField2 = dateTimeField;
        if (dateTimeField instanceof StrictDateTimeField) {
            dateTimeField2 = ((StrictDateTimeField) dateTimeField).getWrappedField();
        }
        return dateTimeField2.isLenient() ? dateTimeField2 : new LenientDateTimeField(dateTimeField2, chronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public final boolean isLenient() {
        return true;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField
    public long set(long j, int i) {
        return this.iBase.getZone().convertLocalToUTC(getType().getField(this.iBase.withUTC()).add(this.iBase.getZone().convertUTCToLocal(j), FieldUtils.safeSubtract((long) i, (long) get(j))), false, j);
    }
}
