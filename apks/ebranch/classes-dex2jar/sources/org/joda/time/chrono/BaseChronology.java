package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/BaseChronology.class */
public abstract class BaseChronology extends Chronology implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.Chronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long add(long r7, long r9, int r11) {
        /*
            r6 = this;
            r0 = r7
            r12 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            r0 = r11
            if (r0 != 0) goto L_0x0014
            r0 = r7
            r12 = r0
            goto L_0x0020
        L_0x0014:
            r0 = r7
            r1 = r9
            r2 = r11
            long r1 = org.joda.time.field.FieldUtils.safeMultiply(r1, r2)
            long r0 = org.joda.time.field.FieldUtils.safeAdd(r0, r1)
            r12 = r0
        L_0x0020:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BaseChronology.add(long, long, int):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.Chronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long add(org.joda.time.ReadablePeriod r9, long r10, int r12) {
        /*
            r8 = this;
            r0 = r10
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L_0x005a
            r0 = r10
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L_0x005a
            r0 = r9
            int r0 = r0.size()
            r15 = r0
            r0 = 0
            r16 = r0
        L_0x001a:
            r0 = r10
            r13 = r0
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L_0x005a
            r0 = r9
            r1 = r16
            int r0 = r0.getValue(r1)
            long r0 = (long) r0
            r17 = r0
            r0 = r10
            r13 = r0
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r0 = r9
            r1 = r16
            org.joda.time.DurationFieldType r0 = r0.getFieldType(r1)
            r1 = r8
            org.joda.time.DurationField r0 = r0.getField(r1)
            r1 = r10
            r2 = r17
            r3 = r12
            long r3 = (long) r3
            long r2 = r2 * r3
            long r0 = r0.add(r1, r2)
            r13 = r0
        L_0x0051:
            int r16 = r16 + 1
            r0 = r13
            r10 = r0
            goto L_0x001a
        L_0x005a:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BaseChronology.add(org.joda.time.ReadablePeriod, long, int):long");
    }

    @Override // org.joda.time.Chronology
    public DurationField centuries() {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField centuryOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfMonth() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfWeek() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    @Override // org.joda.time.Chronology
    public DurationField days() {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField era() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    @Override // org.joda.time.Chronology
    public DurationField eras() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePartial readablePartial, long j) {
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readablePartial.getFieldType(i).getField(this).get(j);
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.Chronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] get(org.joda.time.ReadablePeriod r7, long r8) {
        /*
            r6 = this;
            r0 = r7
            int r0 = r0.size()
            r10 = r0
            r0 = r10
            int[] r0 = new int[r0]
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            r0 = 0
            r14 = r0
        L_0x001a:
            r0 = r14
            r1 = r10
            if (r0 >= r1) goto L_0x0061
            r0 = r7
            r1 = r14
            org.joda.time.DurationFieldType r0 = r0.getFieldType(r1)
            r1 = r6
            org.joda.time.DurationField r0 = r0.getField(r1)
            r15 = r0
            r0 = r12
            r16 = r0
            r0 = r15
            boolean r0 = r0.isPrecise()
            if (r0 == 0) goto L_0x0057
            r0 = r15
            r1 = r8
            r2 = r12
            int r0 = r0.getDifference(r1, r2)
            r18 = r0
            r0 = r15
            r1 = r12
            r2 = r18
            long r0 = r0.add(r1, r2)
            r16 = r0
            r0 = r11
            r1 = r14
            r2 = r18
            r0[r1] = r2
        L_0x0057:
            int r14 = r14 + 1
            r0 = r16
            r12 = r0
            goto L_0x001a
        L_0x0061:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BaseChronology.get(org.joda.time.ReadablePeriod, long):int[]");
    }

    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v2, types: [long] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // org.joda.time.Chronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int[] get(org.joda.time.ReadablePeriod r7, long r8, long r10) {
        /*
            r6 = this;
            r0 = r7
            int r0 = r0.size()
            r12 = r0
            r0 = r12
            int[] r0 = new int[r0]
            r13 = r0
            r0 = r8
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            r0 = 0
            r14 = r0
        L_0x0018:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L_0x0059
            r0 = r7
            r1 = r14
            org.joda.time.DurationFieldType r0 = r0.getFieldType(r1)
            r1 = r6
            org.joda.time.DurationField r0 = r0.getField(r1)
            r15 = r0
            r0 = r15
            r1 = r10
            r2 = r8
            int r0 = r0.getDifference(r1, r2)
            r16 = r0
            r0 = r8
            r17 = r0
            r0 = r16
            if (r0 == 0) goto L_0x0049
            r0 = r15
            r1 = r8
            r2 = r16
            long r0 = r0.add(r1, r2)
            r17 = r0
        L_0x0049:
            r0 = r13
            r1 = r14
            r2 = r16
            r0[r1] = r2
            int r14 = r14 + 1
            r0 = r17
            r8 = r0
            goto L_0x0018
        L_0x0059:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BaseChronology.get(org.joda.time.ReadablePeriod, long, long):int[]");
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return millisOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0, i), i2), i3), i4);
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0, i), i2), i3), i4), i5), i6), i7);
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(j, i), i2), i3), i4);
    }

    @Override // org.joda.time.Chronology
    public abstract DateTimeZone getZone();

    @Override // org.joda.time.Chronology
    public DateTimeField halfdayOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    @Override // org.joda.time.Chronology
    public DurationField halfdays() {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField hours() {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField millis() {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfSecond() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfHour() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DurationField minutes() {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField monthOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    @Override // org.joda.time.Chronology
    public DurationField months() {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfMinute() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DurationField seconds() {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    @Override // org.joda.time.Chronology
    public long set(ReadablePartial readablePartial, long j) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            j = readablePartial.getFieldType(i).getField(this).set(j, readablePartial.getValue(i));
        }
        return j;
    }

    @Override // org.joda.time.Chronology, java.lang.Object
    public abstract String toString();

    @Override // org.joda.time.Chronology
    public void validate(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i = 0; i < size; i++) {
            int i2 = iArr[i];
            DateTimeField field = readablePartial.getField(i);
            if (i2 < field.getMinimumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i2), Integer.valueOf(field.getMinimumValue()), (Number) null);
            } else if (i2 > field.getMaximumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i2), (Number) null, Integer.valueOf(field.getMaximumValue()));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            DateTimeField field2 = readablePartial.getField(i3);
            if (i4 < field2.getMinimumValue(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i4), Integer.valueOf(field2.getMinimumValue(readablePartial, iArr)), (Number) null);
            } else if (i4 > field2.getMaximumValue(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i4), (Number) null, Integer.valueOf(field2.getMaximumValue(readablePartial, iArr)));
            }
        }
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekOfWeekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    @Override // org.joda.time.Chronology
    public DurationField weeks() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DurationField weekyears() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    @Override // org.joda.time.Chronology
    public abstract Chronology withUTC();

    @Override // org.joda.time.Chronology
    public abstract Chronology withZone(DateTimeZone dateTimeZone);

    @Override // org.joda.time.Chronology
    public DateTimeField year() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    @Override // org.joda.time.Chronology
    public DurationField years() {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }
}
