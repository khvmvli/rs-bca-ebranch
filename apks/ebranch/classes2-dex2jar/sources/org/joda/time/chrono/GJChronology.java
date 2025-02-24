package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/GJChronology.class */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    /* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/GJChronology$CutoverField.class */
    class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        final boolean iConvertByWeekyear;
        final long iCutover;
        protected DurationField iDurationField;
        final DateTimeField iGregorianField;
        final DateTimeField iJulianField;
        protected DurationField iRangeDurationField;

        CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(gJChronology, dateTimeField, dateTimeField2, j, false);
        }

        CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j, boolean z) {
            this(dateTimeField, dateTimeField2, null, j, z);
        }

        CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j;
            this.iConvertByWeekyear = z;
            this.iDurationField = dateTimeField2.getDurationField();
            DurationField durationField2 = durationField;
            if (durationField == null) {
                DurationField rangeDurationField = dateTimeField2.getRangeDurationField();
                durationField2 = rangeDurationField;
                if (rangeDurationField == null) {
                    durationField2 = dateTimeField.getRangeDurationField();
                }
            }
            this.iRangeDurationField = durationField2;
        }

        public long add(long j, int i) {
            return this.iGregorianField.add(j, i);
        }

        public long add(long j, long j2) {
            return this.iGregorianField.add(j, j2);
        }

        public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
            if (i2 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return add(readablePartial, i, iArr, i2);
            }
            int size = readablePartial.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = readablePartial.getFieldType(i3).getField(GJChronology.this).set(j, iArr[i3]);
            }
            return GJChronology.this.get(readablePartial, add(j, i2));
        }

        public int get(long j) {
            return j >= this.iCutover ? this.iGregorianField.get(j) : this.iJulianField.get(j);
        }

        public String getAsShortText(int i, Locale locale) {
            return this.iGregorianField.getAsShortText(i, locale);
        }

        public String getAsShortText(long j, Locale locale) {
            return j >= this.iCutover ? this.iGregorianField.getAsShortText(j, locale) : this.iJulianField.getAsShortText(j, locale);
        }

        public String getAsText(int i, Locale locale) {
            return this.iGregorianField.getAsText(i, locale);
        }

        public String getAsText(long j, Locale locale) {
            return j >= this.iCutover ? this.iGregorianField.getAsText(j, locale) : this.iJulianField.getAsText(j, locale);
        }

        public int getDifference(long j, long j2) {
            return this.iGregorianField.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.iGregorianField.getDifferenceAsLong(j, j2);
        }

        public DurationField getDurationField() {
            return this.iDurationField;
        }

        public int getLeapAmount(long j) {
            return j >= this.iCutover ? this.iGregorianField.getLeapAmount(j) : this.iJulianField.getLeapAmount(j);
        }

        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        public int getMaximumValue(long j) {
            if (j >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j);
            long j2 = this.iJulianField.set(j, maximumValue);
            long j3 = this.iCutover;
            if (j2 >= j3) {
                DateTimeField dateTimeField = this.iJulianField;
                maximumValue = dateTimeField.get(dateTimeField.add(j3, -1));
            }
            return maximumValue;
        }

        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0));
        }

        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v2, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int getMaximumValue(org.joda.time.ReadablePartial r7, int[] r8) {
            /*
                r6 = this;
                org.joda.time.chrono.GJChronology r0 = org.joda.time.chrono.GJChronology.getInstanceUTC()
                r9 = r0
                r0 = r7
                int r0 = r0.size()
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = 0
                r13 = r0
            L_0x0012:
                r0 = r13
                r1 = r10
                if (r0 >= r1) goto L_0x0050
                r0 = r7
                r1 = r13
                org.joda.time.DateTimeFieldType r0 = r0.getFieldType(r1)
                r1 = r9
                org.joda.time.DateTimeField r0 = r0.getField(r1)
                r14 = r0
                r0 = r11
                r15 = r0
                r0 = r8
                r1 = r13
                r0 = r0[r1]
                r1 = r14
                r2 = r11
                int r1 = r1.getMaximumValue(r2)
                if (r0 > r1) goto L_0x0046
                r0 = r14
                r1 = r11
                r2 = r8
                r3 = r13
                r2 = r2[r3]
                long r0 = r0.set(r1, r2)
                r15 = r0
            L_0x0046:
                int r13 = r13 + 1
                r0 = r15
                r11 = r0
                goto L_0x0012
            L_0x0050:
                r0 = r6
                r1 = r11
                int r0 = r0.getMaximumValue(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.CutoverField.getMaximumValue(org.joda.time.ReadablePartial, int[]):int");
        }

        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        public int getMinimumValue(long j) {
            if (j < this.iCutover) {
                return this.iJulianField.getMinimumValue(j);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j);
            long j2 = this.iGregorianField.set(j, minimumValue);
            long j3 = this.iCutover;
            if (j2 < j3) {
                minimumValue = this.iGregorianField.get(j3);
            }
            return minimumValue;
        }

        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        protected long gregorianToJulian(long j) {
            return this.iConvertByWeekyear ? GJChronology.this.gregorianToJulianByWeekyear(j) : GJChronology.this.gregorianToJulianByYear(j);
        }

        public boolean isLeap(long j) {
            return j >= this.iCutover ? this.iGregorianField.isLeap(j) : this.iJulianField.isLeap(j);
        }

        public boolean isLenient() {
            return false;
        }

        protected long julianToGregorian(long j) {
            return this.iConvertByWeekyear ? GJChronology.this.julianToGregorianByWeekyear(j) : GJChronology.this.julianToGregorianByYear(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [long] */
        /* JADX WARN: Type inference failed for: r5v0, types: [org.joda.time.chrono.GJChronology$CutoverField] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public long roundCeiling(long r6) {
            /*
                r5 = this;
                r0 = r6
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0015
                r0 = r5
                org.joda.time.DateTimeField r0 = r0.iGregorianField
                r1 = r6
                long r0 = r0.roundCeiling(r1)
                r6 = r0
                goto L_0x0042
            L_0x0015:
                r0 = r5
                org.joda.time.DateTimeField r0 = r0.iJulianField
                r1 = r6
                long r0 = r0.roundCeiling(r1)
                r8 = r0
                r0 = r8
                r6 = r0
                r0 = r8
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0042
                r0 = r8
                r6 = r0
                r0 = r8
                r1 = r5
                org.joda.time.chrono.GJChronology r1 = org.joda.time.chrono.GJChronology.this
                long r1 = org.joda.time.chrono.GJChronology.access$000(r1)
                long r0 = r0 - r1
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0042
                r0 = r5
                r1 = r8
                long r0 = r0.julianToGregorian(r1)
                r6 = r0
            L_0x0042:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.CutoverField.roundCeiling(long):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [long] */
        /* JADX WARN: Type inference failed for: r5v0, types: [org.joda.time.chrono.GJChronology$CutoverField] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public long roundFloor(long r6) {
            /*
                r5 = this;
                r0 = r6
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0039
                r0 = r5
                org.joda.time.DateTimeField r0 = r0.iGregorianField
                r1 = r6
                long r0 = r0.roundFloor(r1)
                r8 = r0
                r0 = r8
                r6 = r0
                r0 = r8
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0042
                r0 = r8
                r6 = r0
                r0 = r5
                org.joda.time.chrono.GJChronology r0 = org.joda.time.chrono.GJChronology.this
                long r0 = org.joda.time.chrono.GJChronology.access$000(r0)
                r1 = r8
                long r0 = r0 + r1
                r1 = r5
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0042
                r0 = r5
                r1 = r8
                long r0 = r0.gregorianToJulian(r1)
                r6 = r0
                goto L_0x0042
            L_0x0039:
                r0 = r5
                org.joda.time.DateTimeField r0 = r0.iJulianField
                r1 = r6
                long r0 = r0.roundFloor(r1)
                r6 = r0
            L_0x0042:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.CutoverField.roundFloor(long):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [long] */
        /* JADX WARN: Type inference failed for: r7v0, types: [org.joda.time.chrono.GJChronology$CutoverField, org.joda.time.DateTimeField] */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public long set(long r8, int r10) {
            /*
                r7 = this;
                r0 = r8
                r1 = r7
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x005e
                r0 = r7
                org.joda.time.DateTimeField r0 = r0.iGregorianField
                r1 = r8
                r2 = r10
                long r0 = r0.set(r1, r2)
                r11 = r0
                r0 = r11
                r8 = r0
                r0 = r11
                r1 = r7
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x00b3
                r0 = r11
                r8 = r0
                r0 = r7
                org.joda.time.chrono.GJChronology r0 = org.joda.time.chrono.GJChronology.this
                long r0 = org.joda.time.chrono.GJChronology.access$000(r0)
                r1 = r11
                long r0 = r0 + r1
                r1 = r7
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x003d
                r0 = r7
                r1 = r11
                long r0 = r0.gregorianToJulian(r1)
                r8 = r0
            L_0x003d:
                r0 = r7
                r1 = r8
                int r0 = r0.get(r1)
                r1 = r10
                if (r0 != r1) goto L_0x0049
                goto L_0x00b3
            L_0x0049:
                org.joda.time.IllegalFieldValueException r0 = new org.joda.time.IllegalFieldValueException
                r1 = r0
                r2 = r7
                org.joda.time.DateTimeField r2 = r2.iGregorianField
                org.joda.time.DateTimeFieldType r2 = r2.getType()
                r3 = r10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                throw r0
            L_0x005e:
                r0 = r7
                org.joda.time.DateTimeField r0 = r0.iJulianField
                r1 = r8
                r2 = r10
                long r0 = r0.set(r1, r2)
                r11 = r0
                r0 = r11
                r8 = r0
                r0 = r11
                r1 = r7
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x00b3
                r0 = r11
                r8 = r0
                r0 = r11
                r1 = r7
                org.joda.time.chrono.GJChronology r1 = org.joda.time.chrono.GJChronology.this
                long r1 = org.joda.time.chrono.GJChronology.access$000(r1)
                long r0 = r0 - r1
                r1 = r7
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0092
                r0 = r7
                r1 = r11
                long r0 = r0.julianToGregorian(r1)
                r8 = r0
            L_0x0092:
                r0 = r7
                r1 = r8
                int r0 = r0.get(r1)
                r1 = r10
                if (r0 != r1) goto L_0x009e
                goto L_0x00b3
            L_0x009e:
                org.joda.time.IllegalFieldValueException r0 = new org.joda.time.IllegalFieldValueException
                r1 = r0
                r2 = r7
                org.joda.time.DateTimeField r2 = r2.iJulianField
                org.joda.time.DateTimeFieldType r2 = r2.getType()
                r3 = r10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r5 = 0
                r1.<init>(r2, r3, r4, r5)
                throw r0
            L_0x00b3:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.CutoverField.set(long, int):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [long] */
        /* JADX WARN: Type inference failed for: r6v0, types: [org.joda.time.chrono.GJChronology$CutoverField] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public long set(long r7, java.lang.String r9, java.util.Locale r10) {
            /*
                r6 = this;
                r0 = r7
                r1 = r6
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0042
                r0 = r6
                org.joda.time.DateTimeField r0 = r0.iGregorianField
                r1 = r7
                r2 = r9
                r3 = r10
                long r0 = r0.set(r1, r2, r3)
                r11 = r0
                r0 = r11
                r7 = r0
                r0 = r11
                r1 = r6
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0078
                r0 = r11
                r7 = r0
                r0 = r6
                org.joda.time.chrono.GJChronology r0 = org.joda.time.chrono.GJChronology.this
                long r0 = org.joda.time.chrono.GJChronology.access$000(r0)
                r1 = r11
                long r0 = r0 + r1
                r1 = r6
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0078
                r0 = r6
                r1 = r11
                long r0 = r0.gregorianToJulian(r1)
                r7 = r0
                goto L_0x0078
            L_0x0042:
                r0 = r6
                org.joda.time.DateTimeField r0 = r0.iJulianField
                r1 = r7
                r2 = r9
                r3 = r10
                long r0 = r0.set(r1, r2, r3)
                r11 = r0
                r0 = r11
                r7 = r0
                r0 = r11
                r1 = r6
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0078
                r0 = r11
                r7 = r0
                r0 = r11
                r1 = r6
                org.joda.time.chrono.GJChronology r1 = org.joda.time.chrono.GJChronology.this
                long r1 = org.joda.time.chrono.GJChronology.access$000(r1)
                long r0 = r0 - r1
                r1 = r6
                long r1 = r1.iCutover
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0078
                r0 = r6
                r1 = r11
                long r0 = r0.julianToGregorian(r1)
                r7 = r0
            L_0x0078:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.CutoverField.set(long, java.lang.String, java.util.Locale):long");
        }
    }

    /* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/GJChronology$ImpreciseCutoverField.class */
    final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j, false);
        }

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
        }

        ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j, boolean z) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j, z);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j) {
            this(dateTimeField, dateTimeField2, durationField, j, false);
            this.iRangeDurationField = durationField2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [long] */
        /* JADX WARN: Type inference failed for: r5v0, types: [org.joda.time.chrono.GJChronology$ImpreciseCutoverField] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Unknown variable types count: 4 */
        @Override // org.joda.time.chrono.GJChronology.CutoverField
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long add(long r6, int r8) {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.ImpreciseCutoverField.add(long, int):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [long] */
        /* JADX WARN: Type inference failed for: r6v0, types: [org.joda.time.chrono.GJChronology$ImpreciseCutoverField] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Unknown variable types count: 4 */
        @Override // org.joda.time.chrono.GJChronology.CutoverField
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long add(long r7, long r9) {
            /*
            // Method dump skipped, instructions count: 186
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.ImpreciseCutoverField.add(long, long):long");
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField
        public final int getDifference(long j, long j2) {
            if (j >= this.iCutover) {
                if (j2 >= this.iCutover) {
                    return this.iGregorianField.getDifference(j, j2);
                }
                return this.iJulianField.getDifference(gregorianToJulian(j), j2);
            } else if (j2 < this.iCutover) {
                return this.iJulianField.getDifference(j, j2);
            } else {
                return this.iGregorianField.getDifference(julianToGregorian(j), j2);
            }
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField
        public final long getDifferenceAsLong(long j, long j2) {
            if (j >= this.iCutover) {
                if (j2 >= this.iCutover) {
                    return this.iGregorianField.getDifferenceAsLong(j, j2);
                }
                return this.iJulianField.getDifferenceAsLong(gregorianToJulian(j), j2);
            } else if (j2 < this.iCutover) {
                return this.iJulianField.getDifferenceAsLong(j, j2);
            } else {
                return this.iGregorianField.getDifferenceAsLong(julianToGregorian(j), j2);
            }
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField
        public final int getMaximumValue(long j) {
            return j >= this.iCutover ? this.iGregorianField.getMaximumValue(j) : this.iJulianField.getMaximumValue(j);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField
        public final int getMinimumValue(long j) {
            return j >= this.iCutover ? this.iGregorianField.getMinimumValue(j) : this.iJulianField.getMinimumValue(j);
        }
    }

    /* loaded from: classes2-dex2jar.jar:org/joda/time/chrono/GJChronology$LinkedDurationField.class */
    static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        public long add(long j, int i) {
            return this.iField.add(j, i);
        }

        public long add(long j, long j2) {
            return this.iField.add(j, j2);
        }

        public int getDifference(long j, long j2) {
            return this.iField.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return this.iField.getDifferenceAsLong(j, j2);
        }
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super((Chronology) null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0, chronology.weekyear().get(j)), chronology.weekOfWeekyear().get(j)), chronology.dayOfWeek().get(j)), chronology.millisOfDay().get(j));
    }

    private static long convertByYear(long j, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j), chronology.monthOfYear().get(j), chronology.dayOfMonth().get(j), chronology.millisOfDay().get(j));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j, int i) {
        return getInstance(dateTimeZone, j == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j), i);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i) {
        Instant instant;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), (Chronology) GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology = concurrentHashMap.get(gJCacheKey);
        GJChronology gJChronology2 = gJChronology;
        if (gJChronology == null) {
            if (zone == DateTimeZone.UTC) {
                gJChronology2 = new GJChronology(JulianChronology.getInstance(zone, i), GregorianChronology.getInstance(zone, i), instant);
            } else {
                GJChronology instance = getInstance(DateTimeZone.UTC, (ReadableInstant) instant, i);
                gJChronology2 = new GJChronology(ZonedChronology.getInstance(instance, zone), instance.iJulianChronology, instance.iGregorianChronology, instance.iCutoverInstant);
            }
            GJChronology putIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology2);
            if (putIfAbsent != null) {
                gJChronology2 = putIfAbsent;
            }
        }
        return gJChronology2;
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, (ReadableInstant) DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), (ReadableInstant) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    protected final void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() == null) {
            if (julianChronology.getMinimumDaysInFirstWeek() == gregorianChronology.getMinimumDaysInFirstWeek()) {
                long j = this.iCutoverMillis;
                this.iGapDuration = j - julianToGregorianByYear(j);
                fields.copyFieldsFrom(gregorianChronology);
                if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
                    fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
                    fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
                    fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
                    fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
                    fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
                    fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
                    fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
                    fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
                    fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
                    fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
                    fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
                }
                fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
                fields.year = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
                fields.years = fields.year.getDurationField();
                fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
                fields.centuryOfEra = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
                fields.centuries = fields.centuryOfEra.getDurationField();
                fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
                fields.monthOfYear = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
                fields.months = fields.monthOfYear.getDurationField();
                fields.weekyear = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
                fields.weekyears = fields.weekyear.getDurationField();
                fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
                fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
                fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
                CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
                cutoverField.iRangeDurationField = fields.months;
                fields.dayOfMonth = cutoverField;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (!(this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone()))) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long getDateTimeMillis(int r7, int r8, int r9, int r10) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.Chronology r0 = r0.getBase()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L_0x0016
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r0 = r0.getDateTimeMillis(r1, r2, r3, r4)
            return r0
        L_0x0016:
            r0 = r6
            org.joda.time.chrono.GregorianChronology r0 = r0.iGregorianChronology
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r0 = r0.getDateTimeMillis(r1, r2, r3, r4)
            r12 = r0
            r0 = r12
            r14 = r0
            r0 = r12
            r1 = r6
            long r1 = r1.iCutoverMillis
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r0 = r6
            org.joda.time.chrono.JulianChronology r0 = r0.iJulianChronology
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            long r0 = r0.getDateTimeMillis(r1, r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = r6
            long r1 = r1.iCutoverMillis
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            goto L_0x0058
        L_0x004d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Specified date does not exist"
            r1.<init>(r2)
            throw r0
        L_0x0058:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GJChronology.getDateTimeMillis(int, int, int, int):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v4 */
    public final long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        long j;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.iGregorianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
        } catch (IllegalFieldValueException e) {
            if (i2 == 2 && i3 == 29) {
                j = this.iGregorianChronology.getDateTimeMillis(i, i2, 28, i4, i5, i6, i7);
                if (j >= this.iCutoverMillis) {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        boolean z = j == 1 ? 1 : 0;
        if ((j == 1 ? 1 : 0) < this.iCutoverMillis) {
            long dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7);
            int i8 = (dateTimeMillis > this.iCutoverMillis ? 1 : (dateTimeMillis == this.iCutoverMillis ? 0 : -1));
            z = dateTimeMillis;
            if (i8 >= 0) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return z == true ? 1 : 0;
    }

    public final Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public final int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    public final DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    final long gregorianToJulianByWeekyear(long j) {
        return convertByWeekyear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    final long gregorianToJulianByYear(long j) {
        return convertByYear(j, this.iGregorianChronology, this.iJulianChronology);
    }

    public final int hashCode() {
        return getZone().hashCode() + 25025 + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    final long julianToGregorianByWeekyear(long j) {
        return convertByWeekyear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    final long julianToGregorianByYear(long j) {
        return convertByYear(j, this.iJulianChronology, this.iGregorianChronology);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public final Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public final Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2, (ReadableInstant) this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }
}
