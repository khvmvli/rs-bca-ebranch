package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/GJEraDateTimeField.class */
final class GJEraDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 4240986525305515528L;
    private final BasicChronology iChronology;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GJEraDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.era());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.era();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int get(long j) {
        return this.iChronology.getYear(j) <= 0 ? 0 : 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final String getAsText(int i, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).eraValueToText(i);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMaximumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundCeiling(long j) {
        if (get(j) == 0) {
            return this.iChronology.setYear(0, 1);
        }
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundFloor(long j) {
        if (get(j) == 1) {
            return this.iChronology.setYear(0, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfCeiling(long j) {
        return roundFloor(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfEven(long j) {
        return roundFloor(j);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long roundHalfFloor(long j) {
        return roundFloor(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long set(long r6, int r8) {
        /*
            r5 = this;
            r0 = r5
            r1 = r8
            r2 = 0
            r3 = 1
            org.joda.time.field.FieldUtils.verifyValueBounds(r0, r1, r2, r3)
            r0 = r6
            r9 = r0
            r0 = r5
            r1 = r6
            int r0 = r0.get(r1)
            r1 = r8
            if (r0 == r1) goto L_0x0028
            r0 = r5
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r6
            int r0 = r0.getYear(r1)
            r8 = r0
            r0 = r5
            org.joda.time.chrono.BasicChronology r0 = r0.iChronology
            r1 = r6
            r2 = r8
            int r2 = -r2
            long r0 = r0.setYear(r1, r2)
            r9 = r0
        L_0x0028:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJEraDateTimeField.set(long, int):long");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final long set(long j, String str, Locale locale) {
        return set(j, GJLocaleSymbols.forLocale(locale).eraTextToValue(str));
    }
}
