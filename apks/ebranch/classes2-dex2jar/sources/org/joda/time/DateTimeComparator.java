package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes2-dex2jar.jar:org/joda/time/DateTimeComparator.class */
public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    protected DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        return (dateTimeFieldType == null && dateTimeFieldType2 == null) ? ALL_INSTANCE : (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) ? DATE_INSTANCE : (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) ? TIME_INSTANCE : new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // java.util.Comparator
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            org.joda.time.convert.ConverterManager r0 = org.joda.time.convert.ConverterManager.getInstance()
            r1 = r6
            org.joda.time.convert.InstantConverter r0 = r0.getInstantConverter(r1)
            r8 = r0
            r0 = r8
            r1 = r6
            r2 = 0
            org.joda.time.Chronology r0 = r0.getChronology(r1, r2)
            r9 = r0
            r0 = r8
            r1 = r6
            r2 = r9
            long r0 = r0.getInstantMillis(r1, r2)
            r10 = r0
            r0 = r6
            r1 = r7
            if (r0 != r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            org.joda.time.convert.ConverterManager r0 = org.joda.time.convert.ConverterManager.getInstance()
            r1 = r7
            org.joda.time.convert.InstantConverter r0 = r0.getInstantConverter(r1)
            r8 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            org.joda.time.Chronology r0 = r0.getChronology(r1, r2)
            r6 = r0
            r0 = r8
            r1 = r7
            r2 = r6
            long r0 = r0.getInstantMillis(r1, r2)
            r12 = r0
            r0 = r5
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r7 = r0
            r0 = r10
            r14 = r0
            r0 = r12
            r16 = r0
            r0 = r7
            if (r0 == 0) goto L_0x006c
            r0 = r7
            r1 = r9
            org.joda.time.DateTimeField r0 = r0.getField(r1)
            r1 = r10
            long r0 = r0.roundFloor(r1)
            r14 = r0
            r0 = r5
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r1 = r6
            org.joda.time.DateTimeField r0 = r0.getField(r1)
            r1 = r12
            long r0 = r0.roundFloor(r1)
            r16 = r0
        L_0x006c:
            r0 = r5
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r7 = r0
            r0 = r14
            r10 = r0
            r0 = r16
            r12 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0099
            r0 = r7
            r1 = r9
            org.joda.time.DateTimeField r0 = r0.getField(r1)
            r1 = r14
            long r0 = r0.remainder(r1)
            r10 = r0
            r0 = r5
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r1 = r6
            org.joda.time.DateTimeField r0 = r0.getField(r1)
            r1 = r16
            long r0 = r0.remainder(r1)
            r12 = r0
        L_0x0099:
            r0 = r10
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r18 = r0
            r0 = r18
            if (r0 >= 0) goto L_0x00a7
            r0 = -1
            return r0
        L_0x00a7:
            r0 = r18
            if (r0 <= 0) goto L_0x00ae
            r0 = 1
            return r0
        L_0x00ae:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeComparator.compare(java.lang.Object, java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r0.equals(r0.getUpperLimit()) != false) goto L_0x0063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r0.equals(r0.getLowerLimit()) != false) goto L_0x003b;
     */
    @Override // java.util.Comparator, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.joda.time.DateTimeComparator
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0066
            r0 = r4
            org.joda.time.DateTimeComparator r0 = (org.joda.time.DateTimeComparator) r0
            r4 = r0
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getLowerLimit()
            if (r0 == r1) goto L_0x003b
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r8 = r0
            r0 = r6
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0066
            r0 = r6
            r7 = r0
            r0 = r8
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getLowerLimit()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0066
        L_0x003b:
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getUpperLimit()
            if (r0 == r1) goto L_0x0063
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r8 = r0
            r0 = r6
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0066
            r0 = r6
            r7 = r0
            r0 = r8
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getUpperLimit()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0066
        L_0x0063:
            r0 = 1
            r7 = r0
        L_0x0066:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeComparator.equals(java.lang.Object):boolean");
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    @Override // java.lang.Object
    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int i = 0;
        int hashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            i = dateTimeFieldType2.hashCode();
        }
        return hashCode + (i * 123);
    }

    @Override // java.lang.Object
    public String toString() {
        String str = "";
        if (this.iLowerLimit == this.iUpperLimit) {
            StringBuilder sb = new StringBuilder("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
            if (dateTimeFieldType != null) {
                str = dateTimeFieldType.getName();
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DateTimeComparator[");
        DateTimeFieldType dateTimeFieldType2 = this.iLowerLimit;
        sb2.append(dateTimeFieldType2 == null ? "" : dateTimeFieldType2.getName());
        sb2.append("-");
        DateTimeFieldType dateTimeFieldType3 = this.iUpperLimit;
        if (dateTimeFieldType3 != null) {
            str = dateTimeFieldType3.getName();
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
