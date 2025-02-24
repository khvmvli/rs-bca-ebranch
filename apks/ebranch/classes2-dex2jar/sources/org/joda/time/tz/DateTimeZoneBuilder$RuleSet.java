package org.joda.time.tz;

import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.DateTimeUtils;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.DateTimeZoneBuilder;
/* loaded from: classes2-dex2jar.jar:org/joda/time/tz/DateTimeZoneBuilder$RuleSet.class */
final class DateTimeZoneBuilder$RuleSet {
    private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
    private String iInitialNameKey;
    private int iInitialSaveMillis;
    private ArrayList<DateTimeZoneBuilder$Rule> iRules;
    private int iStandardOffset;
    private DateTimeZoneBuilder.OfYear iUpperOfYear;
    private int iUpperYear;

    DateTimeZoneBuilder$RuleSet() {
        this.iRules = new ArrayList<>(10);
        this.iUpperYear = Integer.MAX_VALUE;
    }

    DateTimeZoneBuilder$RuleSet(DateTimeZoneBuilder$RuleSet dateTimeZoneBuilder$RuleSet) {
        this.iStandardOffset = dateTimeZoneBuilder$RuleSet.iStandardOffset;
        this.iRules = new ArrayList<>(dateTimeZoneBuilder$RuleSet.iRules);
        this.iInitialNameKey = dateTimeZoneBuilder$RuleSet.iInitialNameKey;
        this.iInitialSaveMillis = dateTimeZoneBuilder$RuleSet.iInitialSaveMillis;
        this.iUpperYear = dateTimeZoneBuilder$RuleSet.iUpperYear;
        this.iUpperOfYear = dateTimeZoneBuilder$RuleSet.iUpperOfYear;
    }

    public final void addRule(DateTimeZoneBuilder$Rule dateTimeZoneBuilder$Rule) {
        if (!this.iRules.contains(dateTimeZoneBuilder$Rule)) {
            this.iRules.add(dateTimeZoneBuilder$Rule);
        }
    }

    public final DateTimeZoneBuilder.DSTZone buildTailZone(String str) {
        if (this.iRules.size() != 2) {
            return null;
        }
        DateTimeZoneBuilder$Rule dateTimeZoneBuilder$Rule = this.iRules.get(0);
        DateTimeZoneBuilder$Rule dateTimeZoneBuilder$Rule2 = this.iRules.get(1);
        if (dateTimeZoneBuilder$Rule.getToYear() == Integer.MAX_VALUE && dateTimeZoneBuilder$Rule2.getToYear() == Integer.MAX_VALUE) {
            return new DateTimeZoneBuilder.DSTZone(str, this.iStandardOffset, dateTimeZoneBuilder$Rule.iRecurrence, dateTimeZoneBuilder$Rule2.iRecurrence);
        }
        return null;
    }

    public final DateTimeZoneBuilder$Transition firstTransition(long j) {
        DateTimeZoneBuilder$Transition dateTimeZoneBuilder$Transition;
        String str = this.iInitialNameKey;
        if (str != null) {
            int i = this.iStandardOffset;
            return new DateTimeZoneBuilder$Transition(j, str, i + this.iInitialSaveMillis, i);
        }
        ArrayList<DateTimeZoneBuilder$Rule> arrayList = new ArrayList<>(this.iRules);
        long j2 = Long.MIN_VALUE;
        int i2 = 0;
        DateTimeZoneBuilder$Transition dateTimeZoneBuilder$Transition2 = null;
        while (true) {
            DateTimeZoneBuilder$Transition nextTransition = nextTransition(j2, i2);
            dateTimeZoneBuilder$Transition = dateTimeZoneBuilder$Transition2;
            if (nextTransition == null) {
                break;
            }
            j2 = nextTransition.getMillis();
            int i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            if (i3 == 0) {
                dateTimeZoneBuilder$Transition = new DateTimeZoneBuilder$Transition(j, nextTransition);
                break;
            } else if (i3 > 0) {
                DateTimeZoneBuilder$Transition dateTimeZoneBuilder$Transition3 = dateTimeZoneBuilder$Transition2;
                if (dateTimeZoneBuilder$Transition2 == null) {
                    Iterator<DateTimeZoneBuilder$Rule> it = arrayList.iterator();
                    while (true) {
                        dateTimeZoneBuilder$Transition3 = dateTimeZoneBuilder$Transition2;
                        if (!it.hasNext()) {
                            break;
                        }
                        DateTimeZoneBuilder$Rule next = it.next();
                        if (next.getSaveMillis() == 0) {
                            dateTimeZoneBuilder$Transition3 = new DateTimeZoneBuilder$Transition(j, next, this.iStandardOffset);
                            break;
                        }
                    }
                }
                dateTimeZoneBuilder$Transition = dateTimeZoneBuilder$Transition3;
                if (dateTimeZoneBuilder$Transition3 == null) {
                    String nameKey = nextTransition.getNameKey();
                    int i4 = this.iStandardOffset;
                    dateTimeZoneBuilder$Transition = new DateTimeZoneBuilder$Transition(j, nameKey, i4, i4);
                }
            } else {
                dateTimeZoneBuilder$Transition2 = new DateTimeZoneBuilder$Transition(j, nextTransition);
                i2 = nextTransition.getSaveMillis();
            }
        }
        this.iRules = arrayList;
        return dateTimeZoneBuilder$Transition;
    }

    public final int getStandardOffset() {
        return this.iStandardOffset;
    }

    public final long getUpperLimit(int i) {
        int i2 = this.iUpperYear;
        if (i2 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return this.iUpperOfYear.setInstant(i2, this.iStandardOffset, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final org.joda.time.tz.DateTimeZoneBuilder$Transition nextTransition(long r8, int r10) {
        /*
            r7 = this;
            org.joda.time.chrono.ISOChronology r0 = org.joda.time.chrono.ISOChronology.getInstanceUTC()
            r11 = r0
            r0 = r7
            java.util.ArrayList<org.joda.time.tz.DateTimeZoneBuilder$Rule> r0 = r0.iRules
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r0
            r0 = 0
            r15 = r0
        L_0x0016:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x005d
            r0 = r12
            java.lang.Object r0 = r0.next()
            org.joda.time.tz.DateTimeZoneBuilder$Rule r0 = (org.joda.time.tz.DateTimeZoneBuilder$Rule) r0
            r16 = r0
            r0 = r16
            r1 = r8
            r2 = r7
            int r2 = r2.iStandardOffset
            r3 = r10
            long r0 = r0.next(r1, r2, r3)
            r17 = r0
            r0 = r17
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            r0 = r12
            r0.remove()
            goto L_0x0016
        L_0x004a:
            r0 = r17
            r1 = r13
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0016
            r0 = r16
            r15 = r0
            r0 = r17
            r13 = r0
            goto L_0x0016
        L_0x005d:
            r0 = r15
            if (r0 != 0) goto L_0x0064
            r0 = 0
            return r0
        L_0x0064:
            r0 = r11
            org.joda.time.DateTimeField r0 = r0.year()
            r1 = r13
            int r0 = r0.get(r1)
            int r1 = org.joda.time.tz.DateTimeZoneBuilder$RuleSet.YEAR_LIMIT
            if (r0 < r1) goto L_0x0076
            r0 = 0
            return r0
        L_0x0076:
            r0 = r7
            int r0 = r0.iUpperYear
            r19 = r0
            r0 = r19
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L_0x0099
            r0 = r13
            r1 = r7
            org.joda.time.tz.DateTimeZoneBuilder$OfYear r1 = r1.iUpperOfYear
            r2 = r19
            r3 = r7
            int r3 = r3.iStandardOffset
            r4 = r10
            long r1 = r1.setInstant(r2, r3, r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
            r0 = 0
            return r0
        L_0x0099:
            org.joda.time.tz.DateTimeZoneBuilder$Transition r0 = new org.joda.time.tz.DateTimeZoneBuilder$Transition
            r1 = r0
            r2 = r13
            r3 = r15
            r4 = r7
            int r4 = r4.iStandardOffset
            r1.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder$RuleSet.nextTransition(long, int):org.joda.time.tz.DateTimeZoneBuilder$Transition");
    }

    public final void setFixedSavings(String str, int i) {
        this.iInitialNameKey = str;
        this.iInitialSaveMillis = i;
    }

    public final void setStandardOffset(int i) {
        this.iStandardOffset = i;
    }

    public final void setUpperLimit(int i, DateTimeZoneBuilder.OfYear ofYear) {
        this.iUpperYear = i;
        this.iUpperOfYear = ofYear;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.iInitialNameKey);
        sb.append(" initial: ");
        sb.append(this.iInitialSaveMillis);
        sb.append(" std: ");
        sb.append(this.iStandardOffset);
        sb.append(" upper: ");
        sb.append(this.iUpperYear);
        sb.append(" ");
        sb.append(this.iUpperOfYear);
        sb.append(" ");
        sb.append(this.iRules);
        return sb.toString();
    }
}
