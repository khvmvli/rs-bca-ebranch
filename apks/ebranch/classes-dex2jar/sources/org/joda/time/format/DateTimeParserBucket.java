package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
/* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeParserBucket.class */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeParserBucket$SavedField.class */
    public static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        SavedField() {
        }

        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int compareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return compareReverse != 0 ? compareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        void init(DateTimeField dateTimeField, int i) {
            this.iField = dateTimeField;
            this.iValue = i;
            this.iText = null;
            this.iLocale = null;
        }

        void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v4 */
        long set(long j, boolean z) {
            String str = this.iText;
            long extended = str == null ? this.iField.setExtended(j, this.iValue) : this.iField.set(j, str, this.iLocale);
            boolean z2 = extended == 1 ? 1 : 0;
            if (z) {
                z2 = this.iField.roundFloor(extended == 1 ? 1 : 0);
            }
            return z2 == true ? 1 : 0;
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/format/DateTimeParserBucket$SavedState.class */
    public class SavedState {
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        final DateTimeZone iZone;

        SavedState() {
            DateTimeParserBucket.this = r4;
            this.iZone = r4.iZone;
            this.iOffset = r4.iOffset;
            this.iSavedFields = r4.iSavedFields;
            this.iSavedFieldsCount = r4.iSavedFieldsCount;
        }

        boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale) {
        this(j, chronology, locale, null, 2000);
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num) {
        this(j, chronology, locale, num, 2000);
    }

    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num, int i) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r6.iSavedFieldsShared != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private org.joda.time.format.DateTimeParserBucket.SavedField obtainSaveField() {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.format.DateTimeParserBucket$SavedField[] r0 = r0.iSavedFields
            r7 = r0
            r0 = r6
            int r0 = r0.iSavedFieldsCount
            r8 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 == r1) goto L_0x0019
            r0 = r7
            r9 = r0
            r0 = r6
            boolean r0 = r0.iSavedFieldsShared
            if (r0 == 0) goto L_0x0043
        L_0x0019:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 != r1) goto L_0x0027
            r0 = r8
            r1 = 1
            int r0 = r0 << r1
            r10 = r0
            goto L_0x002b
        L_0x0027:
            r0 = r7
            int r0 = r0.length
            r10 = r0
        L_0x002b:
            r0 = r10
            org.joda.time.format.DateTimeParserBucket$SavedField[] r0 = new org.joda.time.format.DateTimeParserBucket.SavedField[r0]
            r9 = r0
            r0 = r7
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.iSavedFields = r1
            r0 = r6
            r1 = 0
            r0.iSavedFieldsShared = r1
        L_0x0043:
            r0 = r6
            r1 = 0
            r0.iSavedState = r1
            r0 = r9
            r1 = r8
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r7 = r0
            r0 = r11
            if (r0 != 0) goto L_0x0061
            org.joda.time.format.DateTimeParserBucket$SavedField r0 = new org.joda.time.format.DateTimeParserBucket$SavedField
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r9
            r1 = r8
            r2 = r7
            r0[r1] = r2
        L_0x0061:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r0.iSavedFieldsCount = r1
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeParserBucket.obtainSaveField():org.joda.time.format.DateTimeParserBucket$SavedField");
    }

    private static void sort(SavedField[] savedFieldArr, int i) {
        if (i > 10) {
            Arrays.sort(savedFieldArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (savedFieldArr[i4].compareTo(savedFieldArr[i3]) > 0) {
                    SavedField savedField = savedFieldArr[i3];
                    savedFieldArr[i3] = savedFieldArr[i4];
                    savedFieldArr[i4] = savedField;
                }
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long computeMillis(boolean z) {
        return computeMillis(z, (CharSequence) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.joda.time.DateTimeZone] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long computeMillis(boolean r6, java.lang.CharSequence r7) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeParserBucket.computeMillis(boolean, java.lang.CharSequence):long");
    }

    public long computeMillis(boolean z, String str) {
        return computeMillis(z, (CharSequence) str);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int i;
        int parseInto = internalParser.parseInto(this, charSequence, 0);
        if (parseInto >= 0) {
            i = parseInto;
            if (parseInto >= charSequence.length()) {
                return computeMillis(true, charSequence);
            }
        } else {
            i = parseInto ^ -1;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), i));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        return num != null ? num.intValue() : 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i) {
        obtainSaveField().init(dateTimeField, i);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }
}
