package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BasicMonthOfYearDateTimeField.class */
public class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long millisOfDay = (long) this.iChronology.getMillisOfDay(j);
        int year = this.iChronology.getYear(j);
        int monthOfYear = this.iChronology.getMonthOfYear(j, year);
        int i7 = monthOfYear - 1;
        int i8 = i7 + i;
        if (monthOfYear <= 0 || i8 >= 0) {
            i2 = year;
            i3 = i8;
        } else {
            if (Math.signum((float) (this.iMax + i)) == Math.signum((float) i)) {
                i2 = year - 1;
                i6 = i + this.iMax;
            } else {
                i2 = year + 1;
                i6 = i - this.iMax;
            }
            i3 = i6 + i7;
        }
        if (i3 >= 0) {
            int i9 = this.iMax;
            i5 = i2 + (i3 / i9);
            i4 = (i3 % i9) + 1;
        } else {
            int i10 = (i2 + (i3 / this.iMax)) - 1;
            int abs = Math.abs(i3);
            int i11 = this.iMax;
            int i12 = abs % i11;
            int i13 = i12;
            if (i12 == 0) {
                i13 = i11;
            }
            int i14 = (i11 - i13) + 1;
            i4 = i14;
            i5 = i10;
            if (i14 == 1) {
                i5 = i10 + 1;
                i4 = i14;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i5, i4);
        int i15 = dayOfMonth;
        if (dayOfMonth > daysInYearMonth) {
            i15 = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i5, i4, i15) + millisOfDay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [long] */
    /* JADX WARN: Type inference failed for: r0v62, types: [long] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [long] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long add(long r8, long r10) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(long, long):long");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(readablePartial, 0, iArr, ((((iArr[0] - 1) + (i2 % 12)) + 12) % 12) + 1);
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            return add(readablePartial, i, iArr, i2);
        }
        int size = readablePartial.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j = readablePartial.getFieldType(i3).getField(this.iChronology).set(j, iArr[i3]);
        }
        return this.iChronology.get(readablePartial, add(j, i2));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j, int i) {
        return set(j, FieldUtils.getWrappedValue(get(j), i, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j) {
        return this.iChronology.getMonthOfYear(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long getDifferenceAsLong(long r9, long r11) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong(long, long):long");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j) {
        int year = this.iChronology.getYear(j);
        boolean z = false;
        if (this.iChronology.isLeapYear(year)) {
            z = false;
            if (this.iChronology.getMonthOfYear(j, year) == this.iLeapMonth) {
                z = true;
            }
        }
        return z;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j) {
        int year = this.iChronology.getYear(j);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j, int i) {
        FieldUtils.verifyValueBounds(this, i, 1, this.iMax);
        int year = this.iChronology.getYear(j);
        int dayOfMonth = this.iChronology.getDayOfMonth(j, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i);
        int i2 = dayOfMonth;
        if (dayOfMonth > daysInYearMonth) {
            i2 = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i, i2) + ((long) this.iChronology.getMillisOfDay(j));
    }
}
