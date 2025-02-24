package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/BasicSingleEraDateTimeField.class */
final class BasicSingleEraDateTimeField extends BaseDateTimeField {
    private static final int ERA_VALUE = 1;
    private final String iEraText;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicSingleEraDateTimeField(String str) {
        super(DateTimeFieldType.era());
        this.iEraText = str;
    }

    public final int get(long j) {
        return 1;
    }

    public final String getAsText(int i, Locale locale) {
        return this.iEraText;
    }

    public final DurationField getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public final int getMaximumTextLength(Locale locale) {
        return this.iEraText.length();
    }

    public final int getMaximumValue() {
        return 1;
    }

    public final int getMinimumValue() {
        return 1;
    }

    public final DurationField getRangeDurationField() {
        return null;
    }

    public final boolean isLenient() {
        return false;
    }

    public final long roundCeiling(long j) {
        return Long.MAX_VALUE;
    }

    public final long roundFloor(long j) {
        return Long.MIN_VALUE;
    }

    public final long roundHalfCeiling(long j) {
        return Long.MIN_VALUE;
    }

    public final long roundHalfEven(long j) {
        return Long.MIN_VALUE;
    }

    public final long roundHalfFloor(long j) {
        return Long.MIN_VALUE;
    }

    public final long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, 1);
        return j;
    }

    public final long set(long j, String str, Locale locale) {
        if (this.iEraText.equals(str) || "1".equals(str)) {
            return j;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }
}
