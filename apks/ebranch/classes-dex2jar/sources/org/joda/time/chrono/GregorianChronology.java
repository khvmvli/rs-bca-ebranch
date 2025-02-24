package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
/* loaded from: classes-dex2jar.jar:org/joda/time/chrono/GregorianChronology.class */
public final class GregorianChronology extends BasicGJChronology {
    private static final int DAYS_0000_TO_1970;
    private static final int MAX_YEAR;
    private static final long MILLIS_PER_MONTH;
    private static final long MILLIS_PER_YEAR;
    private static final int MIN_YEAR;
    private static final long serialVersionUID;
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final GregorianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private GregorianChronology(Chronology chronology, Object obj, int i) {
        super(chronology, obj, i);
    }

    public static GregorianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone, int i) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = cCache;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZone2);
        GregorianChronology[] gregorianChronologyArr2 = gregorianChronologyArr;
        if (gregorianChronologyArr == null) {
            gregorianChronologyArr2 = new GregorianChronology[7];
            GregorianChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, gregorianChronologyArr2);
            if (putIfAbsent != null) {
                gregorianChronologyArr2 = putIfAbsent;
            }
        }
        int i2 = i - 1;
        GregorianChronology gregorianChronology = gregorianChronologyArr2[i2];
        GregorianChronology gregorianChronology2 = gregorianChronology;
        if (gregorianChronology == null) {
            synchronized (gregorianChronologyArr2) {
                GregorianChronology gregorianChronology3 = gregorianChronologyArr2[i2];
                gregorianChronology2 = gregorianChronology3;
                if (gregorianChronology3 == null) {
                    gregorianChronology2 = dateTimeZone2 == DateTimeZone.UTC ? new GregorianChronology(null, null, i) : new GregorianChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), dateTimeZone2), null, i);
                    gregorianChronologyArr2[i2] = gregorianChronology2;
                }
            }
        }
        return gregorianChronology2;
    }

    public static GregorianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        int i = minimumDaysInFirstWeek;
        if (minimumDaysInFirstWeek == 0) {
            i = 4;
        }
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), i);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    protected final void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            assemble(fields);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (isLeapYear(r6) != false) goto L_0x0017;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /* Code decompiled incorrectly, please refer to instructions dump */
    final long calculateFirstDayOfYearMillis(int r6) {
        /*
            r5 = this;
            r0 = r6
            r1 = 100
            int r0 = r0 / r1
            r7 = r0
            r0 = r6
            if (r0 >= 0) goto L_0x001e
            r0 = r6
            r1 = 3
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 >> r1
            r1 = r7
            int r0 = r0 - r1
            r1 = r7
            r2 = 3
            int r1 = r1 + r2
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 + r1
            r8 = r0
        L_0x0017:
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
            goto L_0x0035
        L_0x001e:
            r0 = r6
            r1 = 2
            int r0 = r0 >> r1
            r1 = r7
            int r0 = r0 - r1
            r1 = r7
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r5
            r1 = r6
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L_0x0035
            goto L_0x0017
        L_0x0035:
            r0 = r6
            long r0 = (long) r0
            r1 = 365(0x16d, double:1.803E-321)
            long r0 = r0 * r1
            r1 = r7
            r2 = 719527(0xafaa7, float:1.008272E-39)
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.GregorianChronology.calculateFirstDayOfYearMillis(int):long");
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long getApproxMillisAtEpochDividedByTwo() {
        return 31083597720000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public final long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public final long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long getAverageMillisPerYearDividedByTwo() {
        return 15778476000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public final int getMaxYear() {
        return MAX_YEAR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public final int getMinYear() {
        return MIN_YEAR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.joda.time.chrono.BasicChronology
    public final boolean isLeapYear(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2);
    }
}
