package org.joda.time.tz;

import io.realm.internal.Property;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder.class */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    /* loaded from: classes-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$DSTZone.class */
    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        DSTZone(String str, int i, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private org.joda.time.tz.DateTimeZoneBuilder.Recurrence findMatchingRecurrence(long r7) {
            /*
                r6 = this;
                r0 = r6
                int r0 = r0.iStandardOffset
                r9 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iStartRecurrence
                r10 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iEndRecurrence
                r11 = r0
                r0 = r10
                r1 = r7
                r2 = r9
                r3 = r11
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x0022
                long r0 = r0.next(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x0022
                r12 = r0
                goto L_0x0027
            L_0x0022:
                r14 = move-exception
                r0 = r7
                r12 = r0
            L_0x0027:
                r0 = r11
                r1 = r7
                r2 = r9
                r3 = r10
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x003b
                long r0 = r0.next(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x003b
                r15 = r0
                r0 = r15
                r7 = r0
                goto L_0x003d
            L_0x003b:
                r14 = move-exception
            L_0x003d:
                r0 = r12
                r1 = r7
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x0048
                r0 = r11
                r10 = r0
            L_0x0048:
                r0 = r10
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.findMatchingRecurrence(long):org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        }

        static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone, java.lang.Object
        public final boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (!getID().equals(dSTZone.getID()) || this.iStandardOffset != dSTZone.iStandardOffset || !this.iStartRecurrence.equals(dSTZone.iStartRecurrence) || !this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                z = false;
            }
            return z;
        }

        @Override // org.joda.time.DateTimeZone
        public final String getNameKey(long j) {
            return findMatchingRecurrence(j).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public final int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public final int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean isFixed() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
            if (r0 < 0) goto L_0x0034;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        /* JADX WARN: Type inference failed for: r0v12, types: [long] */
        /* JADX WARN: Type inference failed for: r0v20, types: [long] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [long] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r14v0, types: [long] */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Unknown variable types count: 4 */
        @Override // org.joda.time.DateTimeZone
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long nextTransition(long r7) {
            /*
                r6 = this;
                r0 = r6
                int r0 = r0.iStandardOffset
                r9 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iStartRecurrence
                r10 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iEndRecurrence
                r11 = r0
                r0 = r10
                r1 = r7
                r2 = r9
                r3 = r11
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x006b
                long r0 = r0.next(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x006b
                r12 = r0
                r0 = r12
                r14 = r0
                r0 = r7
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0037
                r0 = r12
                r14 = r0
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0037
            L_0x0034:
                r0 = r7
                r14 = r0
            L_0x0037:
                r0 = r11
                r1 = r7
                r2 = r9
                r3 = r10
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x0058
                long r0 = r0.next(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x0058
                r12 = r0
                r0 = r7
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0052
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x005a
            L_0x0052:
                r0 = r12
                r7 = r0
                goto L_0x005a
            L_0x0058:
                r10 = move-exception
            L_0x005a:
                r0 = r14
                r12 = r0
                r0 = r14
                r1 = r7
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0068
                r0 = r7
                r12 = r0
            L_0x0068:
                r0 = r12
                return r0
            L_0x006b:
                r16 = move-exception
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.nextTransition(long):long");
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
            if (r0 > 0) goto L_0x0038;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARN: Type inference failed for: r0v15, types: [long] */
        /* JADX WARN: Type inference failed for: r0v23, types: [long] */
        /* JADX WARN: Type inference failed for: r0v5, types: [org.joda.time.tz.DateTimeZoneBuilder$Recurrence] */
        /* JADX WARN: Type inference failed for: r0v7, types: [org.joda.time.tz.DateTimeZoneBuilder$Recurrence] */
        /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [long] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r7v1, types: [long] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r9v0, types: [long] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Unknown variable types count: 7 */
        @Override // org.joda.time.DateTimeZone
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long previousTransition(long r7) {
            /*
                r6 = this;
                r0 = r7
                r1 = 1
                long r0 = r0 + r1
                r9 = r0
                r0 = r6
                int r0 = r0.iStandardOffset
                r11 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iStartRecurrence
                r12 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iEndRecurrence
                r13 = r0
                r0 = r12
                r1 = r9
                r2 = r11
                r3 = r13
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x006f
                long r0 = r0.previous(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x006f
                r14 = r0
                r0 = r14
                r7 = r0
                r0 = r9
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x003a
                r0 = r14
                r7 = r0
                r0 = r14
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
            L_0x0038:
                r0 = r9
                r7 = r0
            L_0x003a:
                r0 = r13
                r1 = r9
                r2 = r11
                r3 = r12
                int r3 = r3.getSaveMillis()     // Catch: IllegalArgumentException | ArithmeticException -> 0x005c
                long r0 = r0.previous(r1, r2, r3)     // Catch: IllegalArgumentException | ArithmeticException -> 0x005c
                r14 = r0
                r0 = r9
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0056
                r0 = r14
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x005e
            L_0x0056:
                r0 = r14
                r9 = r0
                goto L_0x005e
            L_0x005c:
                r13 = move-exception
            L_0x005e:
                r0 = r7
                r14 = r0
                r0 = r7
                r1 = r9
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L_0x006a
                r0 = r9
                r14 = r0
            L_0x006a:
                r0 = r14
                r1 = 1
                long r0 = r0 - r1
                return r0
            L_0x006f:
                r16 = move-exception
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.previousTransition(long):long");
        }

        public final void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$OfYear.class */
    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        OfYear(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.iMode = c;
                this.iMonthOfYear = i;
                this.iDayOfMonth = i2;
                this.iDayOfWeek = i3;
                this.iAdvance = z;
                this.iMillisOfDay = i4;
                return;
            }
            StringBuilder sb = new StringBuilder("Unknown mode: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }

        static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j) {
            long j2;
            if (this.iDayOfMonth >= 0) {
                j2 = chronology.dayOfMonth().set(j, this.iDayOfMonth);
            } else {
                j2 = chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j, 1), 1), this.iDayOfMonth);
            }
            return j2;
        }

        private long setDayOfMonthNext(Chronology chronology, long j) {
            long j2;
            try {
                j2 = setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, 1);
                    }
                    j2 = setDayOfMonth(chronology, j);
                } else {
                    throw e;
                }
            }
            return j2;
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j) {
            long j2;
            try {
                j2 = setDayOfMonth(chronology, j);
            } catch (IllegalArgumentException e) {
                if (this.iMonthOfYear == 2 && this.iDayOfMonth == 29) {
                    while (!chronology.year().isLeap(j)) {
                        j = chronology.year().add(j, -1);
                    }
                    j2 = setDayOfMonth(chronology, j);
                } else {
                    throw e;
                }
            }
            return j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private long setDayOfWeek(org.joda.time.Chronology r6, long r7) {
            /*
                r5 = this;
                r0 = r6
                org.joda.time.DateTimeField r0 = r0.dayOfWeek()
                r1 = r7
                int r0 = r0.get(r1)
                r9 = r0
                r0 = r5
                int r0 = r0.iDayOfWeek
                r1 = r9
                int r0 = r0 - r1
                r10 = r0
                r0 = r7
                r11 = r0
                r0 = r10
                if (r0 == 0) goto L_0x0051
                r0 = r5
                boolean r0 = r0.iAdvance
                if (r0 == 0) goto L_0x0035
                r0 = r10
                r9 = r0
                r0 = r10
                if (r0 >= 0) goto L_0x0045
                r0 = r10
                r1 = 7
                int r0 = r0 + r1
                r9 = r0
                goto L_0x0045
            L_0x0035:
                r0 = r10
                r9 = r0
                r0 = r10
                if (r0 <= 0) goto L_0x0045
                r0 = r10
                r1 = 7
                int r0 = r0 - r1
                r9 = r0
            L_0x0045:
                r0 = r6
                org.joda.time.DateTimeField r0 = r0.dayOfWeek()
                r1 = r7
                r2 = r9
                long r0 = r0.add(r1, r2)
                r11 = r0
            L_0x0051:
                r0 = r11
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.OfYear.setDayOfWeek(org.joda.time.Chronology, long):long");
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            if (!(this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay)) {
                z = false;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [long] */
        /* JADX WARN: Type inference failed for: r0v21, types: [long] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r9v0, types: [org.joda.time.tz.DateTimeZoneBuilder$OfYear] */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long next(long r10, int r12, int r13) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.OfYear.next(long, int, int):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [long] */
        /* JADX WARN: Type inference failed for: r0v21, types: [long] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r9v0, types: [org.joda.time.tz.DateTimeZoneBuilder$OfYear] */
        /* JADX WARN: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long previous(long r10, int r12, int r13) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.OfYear.previous(long, int, int):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [long] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r7v0, types: [org.joda.time.tz.DateTimeZoneBuilder$OfYear] */
        /* JADX WARN: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long setInstant(int r8, int r9, int r10) {
            /*
                r7 = this;
                r0 = r7
                char r0 = r0.iMode
                r11 = r0
                r0 = r11
                r1 = 119(0x77, float:1.67E-43)
                if (r0 != r1) goto L_0x0014
                r0 = r9
                r1 = r10
                int r0 = r0 + r1
                r9 = r0
                goto L_0x001d
            L_0x0014:
                r0 = r11
                r1 = 115(0x73, float:1.61E-43)
                if (r0 == r1) goto L_0x001d
                r0 = 0
                r9 = r0
            L_0x001d:
                org.joda.time.chrono.ISOChronology r0 = org.joda.time.chrono.ISOChronology.getInstanceUTC()
                r12 = r0
                r0 = r12
                org.joda.time.DateTimeField r0 = r0.year()
                r1 = 0
                r2 = r8
                long r0 = r0.set(r1, r2)
                r13 = r0
                r0 = r12
                org.joda.time.DateTimeField r0 = r0.monthOfYear()
                r1 = r13
                r2 = r7
                int r2 = r2.iMonthOfYear
                long r0 = r0.set(r1, r2)
                r13 = r0
                r0 = r7
                r1 = r12
                r2 = r12
                org.joda.time.DateTimeField r2 = r2.millisOfDay()
                r3 = r13
                r4 = r7
                int r4 = r4.iMillisOfDay
                long r2 = r2.set(r3, r4)
                long r0 = r0.setDayOfMonth(r1, r2)
                r15 = r0
                r0 = r15
                r13 = r0
                r0 = r7
                int r0 = r0.iDayOfWeek
                if (r0 == 0) goto L_0x0069
                r0 = r7
                r1 = r12
                r2 = r15
                long r0 = r0.setDayOfWeek(r1, r2)
                r13 = r0
            L_0x0069:
                r0 = r13
                r1 = r9
                long r1 = (long) r1
                long r0 = r0 - r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.OfYear.setInstant(int, int, int):long");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[OfYear]\nMode: ");
            sb.append(this.iMode);
            sb.append("\nMonthOfYear: ");
            sb.append(this.iMonthOfYear);
            sb.append("\nDayOfMonth: ");
            sb.append(this.iDayOfMonth);
            sb.append("\nDayOfWeek: ");
            sb.append(this.iDayOfWeek);
            sb.append("\nAdvanceDayOfWeek: ");
            sb.append(this.iAdvance);
            sb.append("\nMillisOfDay: ");
            sb.append(this.iMillisOfDay);
            sb.append('\n');
            return sb.toString();
        }

        public final void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iMillisOfDay);
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$PrecalculatedZone.class */
    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        static PrecalculatedZone create(String str, boolean z, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                Transition transition = null;
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Transition transition2 = arrayList.get(i2);
                    if (transition2.isTransitionFrom(transition)) {
                        jArr[i2] = transition2.getMillis();
                        iArr[i2] = transition2.getWallOffset();
                        iArr2[i2] = transition2.getStandardOffset();
                        strArr[i2] = transition2.getNameKey();
                        i2++;
                        transition = transition2;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                Object[] objArr = new String[5];
                Object[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                for (Object[] objArr2 : zoneStrings) {
                    objArr = objArr;
                    if (objArr2 != null) {
                        objArr = objArr;
                        if (objArr2.length == 5) {
                            objArr = objArr;
                            if (str.equals(objArr2[0])) {
                                objArr = objArr2;
                            }
                        }
                    }
                }
                ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
                while (i < size - 1) {
                    String str2 = strArr[i];
                    int i3 = i + 1;
                    String str3 = strArr[i3];
                    long j = (long) iArr[i];
                    long j2 = (long) iArr[i3];
                    long j3 = (long) iArr2[i];
                    long j4 = (long) iArr2[i3];
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.yearMonthDay(), instanceUTC);
                    int i4 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    int i5 = i;
                    if (i4 != 0) {
                        i5 = i;
                        if (j3 == j4) {
                            i5 = i;
                            if (str2.equals(str3)) {
                                i5 = i;
                                if (period.getYears() == 0) {
                                    i5 = i;
                                    if (period.getMonths() > 4) {
                                        i5 = i;
                                        if (period.getMonths() < 8) {
                                            i5 = i;
                                            if (str2.equals(objArr[2])) {
                                                i5 = i;
                                                if (str2.equals(objArr[4])) {
                                                    if (ZoneInfoLogger.verbose()) {
                                                        PrintStream printStream = System.out;
                                                        StringBuilder sb = new StringBuilder("Fixing duplicate name key - ");
                                                        sb.append(str3);
                                                        printStream.println(sb.toString());
                                                        PrintStream printStream2 = System.out;
                                                        StringBuilder sb2 = new StringBuilder("     - ");
                                                        sb2.append(new DateTime(jArr[i], instanceUTC));
                                                        sb2.append(" - ");
                                                        sb2.append(new DateTime(jArr[i3], instanceUTC));
                                                        printStream2.println(sb2.toString());
                                                    }
                                                    if (i4 > 0) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(str2);
                                                        sb3.append("-Summer");
                                                        strArr[i] = sb3.toString().intern();
                                                        i5 = i;
                                                    } else {
                                                        i5 = i;
                                                        if (i4 < 0) {
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append(str3);
                                                            sb4.append("-Summer");
                                                            strArr[i3] = sb4.toString().intern();
                                                            i5 = i3;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i = i5 + 1;
                }
                if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                    dSTZone2 = dSTZone;
                } else {
                    if (ZoneInfoLogger.verbose()) {
                        PrintStream printStream3 = System.out;
                        StringBuilder sb5 = new StringBuilder("Fixing duplicate recurrent name key - ");
                        sb5.append(dSTZone.iStartRecurrence.getNameKey());
                        printStream3.println(sb5.toString());
                    }
                    dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
                }
                if (!z) {
                    str = "";
                }
                return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr, dSTZone2);
            }
            throw new IllegalArgumentException();
        }

        static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int readUnsignedByte;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                jArr[i2] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i2] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i2] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    readUnsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i2] = strArr[readUnsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone, java.lang.Object
        public final boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                return dSTZone != null ? z : z;
            }
            z = false;
        }

        @Override // org.joda.time.DateTimeZone
        public final String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i < jArr.length) {
                return i > 0 ? this.iNameKeys[i - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i - 1] : dSTZone.getNameKey(j);
        }

        @Override // org.joda.time.DateTimeZone
        public final int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i - 1] : dSTZone.getOffset(j);
            } else if (i > 0) {
                return this.iWallOffsets[i - 1];
            } else {
                return 0;
            }
        }

        @Override // org.joda.time.DateTimeZone
        public final int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i - 1] : dSTZone.getStandardOffset(j);
            } else if (i > 0) {
                return this.iStandardOffsets[i - 1];
            } else {
                return 0;
            }
        }

        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v2, types: [double] */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final boolean isCachable() {
            /*
                r6 = this;
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$DSTZone r0 = r0.iTailZone
                if (r0 == 0) goto L_0x0009
                r0 = 1
                return r0
            L_0x0009:
                r0 = r6
                long[] r0 = r0.iTransitions
                r7 = r0
                r0 = r7
                int r0 = r0.length
                r1 = 1
                if (r0 > r1) goto L_0x0016
                r0 = 0
                return r0
            L_0x0016:
                r0 = 0
                r8 = r0
                r0 = 1
                r10 = r0
                r0 = 0
                r11 = r0
            L_0x001e:
                r0 = r10
                r1 = r7
                int r1 = r1.length
                if (r0 >= r1) goto L_0x005c
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                r1 = r7
                r2 = r10
                r3 = 1
                int r2 = r2 - r3
                r1 = r1[r2]
                long r0 = r0 - r1
                r12 = r0
                r0 = r8
                r14 = r0
                r0 = r11
                r16 = r0
                r0 = r12
                r1 = 63158400000(0xeb488b400, double:3.12043956863E-313)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x004f
                r0 = r8
                r1 = r12
                double r1 = (double) r1
                double r0 = r0 + r1
                r14 = r0
                r0 = r11
                r1 = 1
                int r0 = r0 + r1
                r16 = r0
            L_0x004f:
                int r10 = r10 + 1
                r0 = r14
                r8 = r0
                r0 = r16
                r11 = r0
                goto L_0x001e
            L_0x005c:
                r0 = r11
                if (r0 <= 0) goto L_0x0073
                r0 = r8
                r1 = r11
                double r1 = (double) r1
                double r0 = r0 / r1
                r1 = 4725570615333879808(0x4194997000000000, double:8.64E7)
                double r0 = r0 / r1
                r1 = 4627730092099895296(0x4039000000000000, double:25.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0073
                r0 = 1
                return r0
            L_0x0073:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.isCachable():boolean");
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean isFixed() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // org.joda.time.DateTimeZone
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long nextTransition(long r6) {
            /*
                r5 = this;
                r0 = r5
                long[] r0 = r0.iTransitions
                r8 = r0
                r0 = r8
                r1 = r6
                int r0 = java.util.Arrays.binarySearch(r0, r1)
                r9 = r0
                r0 = r9
                if (r0 < 0) goto L_0x0017
                int r9 = r9 + 1
                goto L_0x001d
            L_0x0017:
                r0 = r9
                r1 = -1
                r0 = r0 ^ r1
                r9 = r0
            L_0x001d:
                r0 = r9
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L_0x0029
                r0 = r8
                r1 = r9
                r0 = r0[r1]
                return r0
            L_0x0029:
                r0 = r5
                org.joda.time.tz.DateTimeZoneBuilder$DSTZone r0 = r0.iTailZone
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L_0x0036
                r0 = r6
                return r0
            L_0x0036:
                r0 = r8
                r1 = r8
                int r1 = r1.length
                r2 = 1
                int r1 = r1 - r2
                r0 = r0[r1]
                r11 = r0
                r0 = r6
                r13 = r0
                r0 = r6
                r1 = r11
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x004c
                r0 = r11
                r13 = r0
            L_0x004c:
                r0 = r10
                r1 = r13
                long r0 = r0.nextTransition(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.nextTransition(long):long");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r6v0, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // org.joda.time.DateTimeZone
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long previousTransition(long r6) {
            /*
                r5 = this;
                r0 = r5
                long[] r0 = r0.iTransitions
                r8 = r0
                r0 = r8
                r1 = r6
                int r0 = java.util.Arrays.binarySearch(r0, r1)
                r9 = r0
                r0 = r9
                if (r0 < 0) goto L_0x0024
                r0 = r6
                r10 = r0
                r0 = r6
                r1 = -9223372036854775808
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0021
                r0 = r6
                r1 = 1
                long r0 = r0 - r1
                r10 = r0
            L_0x0021:
                r0 = r10
                return r0
            L_0x0024:
                r0 = r9
                r1 = -1
                r0 = r0 ^ r1
                r9 = r0
                r0 = r9
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L_0x004e
                r0 = r9
                if (r0 <= 0) goto L_0x004c
                r0 = r8
                r1 = r9
                r2 = 1
                int r1 = r1 - r2
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                r1 = -9223372036854775808
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x004c
                r0 = r10
                r1 = 1
                long r0 = r0 - r1
                return r0
            L_0x004c:
                r0 = r6
                return r0
            L_0x004e:
                r0 = r5
                org.joda.time.tz.DateTimeZoneBuilder$DSTZone r0 = r0.iTailZone
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L_0x006b
                r0 = r12
                r1 = r6
                long r0 = r0.previousTransition(r1)
                r10 = r0
                r0 = r10
                r1 = r6
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x006b
                r0 = r10
                return r0
            L_0x006b:
                r0 = r8
                r1 = r9
                r2 = 1
                int r1 = r1 - r2
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                r1 = -9223372036854775808
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0081
                r0 = r10
                r1 = 1
                long r0 = r0 - r1
                return r0
            L_0x0081:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.PrecalculatedZone.previousTransition(long):long");
        }

        public final void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (!strArr[i5].equals(str2)) {
                            i5++;
                        } else if (size < 256) {
                            dataOutput.writeByte(i5);
                        } else {
                            dataOutput.writeShort(i5);
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.writeTo(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
    }

    /* loaded from: classes-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$Recurrence.class */
    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        Recurrence(OfYear ofYear, String str, int i) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i;
        }

        static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            if (this.iSaveMillis != recurrence.iSaveMillis || !this.iNameKey.equals(recurrence.iNameKey) || !this.iOfYear.equals(recurrence.iOfYear)) {
                z = false;
            }
            return z;
        }

        public final String getNameKey() {
            return this.iNameKey;
        }

        public final OfYear getOfYear() {
            return this.iOfYear;
        }

        public final int getSaveMillis() {
            return this.iSaveMillis;
        }

        public final long next(long j, int i, int i2) {
            return this.iOfYear.next(j, i, i2);
        }

        public final long previous(long j, int i, int i2) {
            return this.iOfYear.previous(j, i, i2);
        }

        final Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        final Recurrence renameAppend(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iNameKey);
            sb.append(str);
            return rename(sb.toString().intern());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.iOfYear);
            sb.append(" named ");
            sb.append(this.iNameKey);
            sb.append(" at ");
            sb.append(this.iSaveMillis);
            return sb.toString();
        }

        public final void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, (long) this.iSaveMillis);
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        while (true) {
            int size = arrayList.size();
            if (size == 0) {
                arrayList.add(transition);
                return true;
            }
            int i = size - 1;
            Transition transition2 = arrayList.get(i);
            int i2 = 0;
            if (!transition.isTransitionFrom(transition2)) {
                return false;
            }
            if (size >= 2) {
                i2 = arrayList.get(size - 2).getWallOffset();
            }
            if (transition.getMillis() + ((long) transition2.getWallOffset()) != transition2.getMillis() + ((long) i2)) {
                arrayList.add(transition);
                return true;
            }
            transition = transition.withMillis(arrayList.remove(i).getMillis());
        }
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i, int i2) {
        return (!"UTC".equals(str) || !str.equals(str2) || i != 0 || i2 != 0) ? new FixedDateTimeZone(str, str2, i, i2) : DateTimeZone.UTC;
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<RuleSet> arrayList = this.iRuleSets;
        return arrayList.get(arrayList.size() - 1);
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
            DateTimeZone dateTimeZone = fixedDateTimeZone;
            if (fixedDateTimeZone.equals(DateTimeZone.UTC)) {
                dateTimeZone = DateTimeZone.UTC;
            }
            return dateTimeZone;
        } else if (readUnsignedByte == 80) {
            return PrecalculatedZone.readFrom(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    static long readMillis(DataInput dataInput) throws IOException {
        long j;
        long j2;
        int readUnsignedByte = dataInput.readUnsignedByte();
        int i = readUnsignedByte >> 6;
        if (i == 1) {
            j2 = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = 60000;
        } else if (i == 2) {
            j2 = ((((long) readUnsignedByte) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            j2 = (long) ((readUnsignedByte << 26) >> 26);
            j = 1800000;
        }
        return j2 * j;
    }

    static void writeMillis(DataOutput dataOutput, long j) throws IOException {
        if (j % 1800000 == 0) {
            long j2 = j / 1800000;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j3 = j / 60000;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(1073741824 | ((int) (1073741823 & j3)));
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | Property.TYPE_ARRAY);
                dataOutput.writeInt((int) (-1 & j4));
                return;
            }
        }
        dataOutput.writeByte(j < 0 ? 255 : 192);
        dataOutput.writeLong(j);
    }

    public DateTimeZoneBuilder addCutover(int i, char c, int i2, int i3, int i4, boolean z, int i5) {
        if (this.iRuleSets.size() > 0) {
            OfYear ofYear = new OfYear(c, i2, i3, i4, z, i5);
            ArrayList<RuleSet> arrayList = this.iRuleSets;
            arrayList.get(arrayList.size() - 1).setUpperLimit(i, ofYear);
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i, int i2, int i3, char c, int i4, int i5, int i6, boolean z, int i7) {
        if (i2 <= i3) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c, i4, i5, i6, z, i7), str, i), i2, i3));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i) {
        getLastRuleSet().setFixedSavings(str, i);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i) {
        getLastRuleSet().setStandardOffset(i);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z) {
        if (str != null) {
            ArrayList<Transition> arrayList = new ArrayList<>();
            int size = this.iRuleSets.size();
            DSTZone dSTZone = null;
            long j = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                RuleSet ruleSet = this.iRuleSets.get(i);
                Transition firstTransition = ruleSet.firstTransition(j);
                dSTZone = dSTZone;
                if (firstTransition != null) {
                    addTransition(arrayList, firstTransition);
                    long millis = firstTransition.getMillis();
                    int saveMillis = firstTransition.getSaveMillis();
                    RuleSet ruleSet2 = new RuleSet(ruleSet);
                    while (true) {
                        Transition nextTransition = ruleSet2.nextTransition(millis, saveMillis);
                        if (nextTransition == null || (addTransition(arrayList, nextTransition) && dSTZone != null)) {
                            break;
                        }
                        millis = nextTransition.getMillis();
                        saveMillis = nextTransition.getSaveMillis();
                        dSTZone = dSTZone;
                        if (dSTZone == null) {
                            dSTZone = dSTZone;
                            if (i == size - 1) {
                                dSTZone = ruleSet2.buildTailZone(str);
                            }
                        }
                    }
                    j = ruleSet2.getUpperLimit(saveMillis);
                    dSTZone = dSTZone;
                }
            }
            if (arrayList.size() == 0) {
                return dSTZone != null ? dSTZone : buildFixedZone(str, "UTC", 0, 0);
            }
            if (arrayList.size() == 1 && dSTZone == null) {
                Transition transition = arrayList.get(0);
                return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
            }
            PrecalculatedZone create = PrecalculatedZone.create(str, z, arrayList, dSTZone);
            DateTimeZone dateTimeZone = create;
            if (create.isCachable()) {
                dateTimeZone = CachedDateTimeZone.forZone(create);
            }
            return dateTimeZone;
        }
        throw new IllegalArgumentException();
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0));
            writeMillis(dataOutput, (long) dateTimeZone.getOffset(0));
            writeMillis(dataOutput, (long) dateTimeZone.getStandardOffset(0));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }

    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }
}
