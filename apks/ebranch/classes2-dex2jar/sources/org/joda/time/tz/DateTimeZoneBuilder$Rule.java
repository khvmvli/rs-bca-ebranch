package org.joda.time.tz;

import org.joda.time.tz.DateTimeZoneBuilder;
/* loaded from: classes2-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$Rule.class */
final class DateTimeZoneBuilder$Rule {
    final int iFromYear;
    final DateTimeZoneBuilder.Recurrence iRecurrence;
    final int iToYear;

    DateTimeZoneBuilder$Rule(DateTimeZoneBuilder.Recurrence recurrence, int i, int i2) {
        this.iRecurrence = recurrence;
        this.iFromYear = i;
        this.iToYear = i2;
    }

    public final int getFromYear() {
        return this.iFromYear;
    }

    public final String getNameKey() {
        return this.iRecurrence.getNameKey();
    }

    public final DateTimeZoneBuilder.OfYear getOfYear() {
        return this.iRecurrence.getOfYear();
    }

    public final int getSaveMillis() {
        return this.iRecurrence.getSaveMillis();
    }

    public final int getToYear() {
        return this.iToYear;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        if (r0.year().get(((long) r0) + r0) <= r6.iToYear) goto L_0x0077;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [long] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long next(long r7, int r9, int r10) {
        /*
            r6 = this;
            org.joda.time.chrono.ISOChronology r0 = org.joda.time.chrono.ISOChronology.getInstanceUTC()
            r11 = r0
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r12 = r0
            r0 = r7
            r1 = -9223372036854775808
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r0
            goto L_0x0029
        L_0x001a:
            r0 = r11
            org.joda.time.DateTimeField r0 = r0.year()
            r1 = r12
            long r1 = (long) r1
            r2 = r7
            long r1 = r1 + r2
            int r0 = r0.get(r1)
            r13 = r0
        L_0x0029:
            r0 = r13
            r1 = r6
            int r1 = r1.iFromYear
            if (r0 >= r1) goto L_0x004a
            r0 = r11
            org.joda.time.DateTimeField r0 = r0.year()
            r1 = 0
            r2 = r6
            int r2 = r2.iFromYear
            long r0 = r0.set(r1, r2)
            r1 = r12
            long r1 = (long) r1
            long r0 = r0 - r1
            r1 = 1
            long r0 = r0 - r1
            r14 = r0
            goto L_0x004d
        L_0x004a:
            r0 = r7
            r14 = r0
        L_0x004d:
            r0 = r6
            org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iRecurrence
            r1 = r14
            r2 = r9
            r3 = r10
            long r0 = r0.next(r1, r2, r3)
            r14 = r0
            r0 = r14
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            r0 = r11
            org.joda.time.DateTimeField r0 = r0.year()
            r1 = r12
            long r1 = (long) r1
            r2 = r14
            long r1 = r1 + r2
            int r0 = r0.get(r1)
            r1 = r6
            int r1 = r1.iToYear
            if (r0 > r1) goto L_0x007a
        L_0x0077:
            r0 = r14
            r7 = r0
        L_0x007a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder$Rule.next(long, int, int):long");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iFromYear);
        sb.append(" to ");
        sb.append(this.iToYear);
        sb.append(" using ");
        sb.append(this.iRecurrence);
        return sb.toString();
    }
}
