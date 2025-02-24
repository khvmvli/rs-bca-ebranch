package org.joda.time.tz;

import io.realm.internal.Property;
import org.joda.time.DateTimeZone;
/* loaded from: classes-dex2jar.jar:org/joda/time/tz/CachedDateTimeZone.class */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache = new Info[cInfoCacheMask + 1];
    private final DateTimeZone iZone;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:org/joda/time/tz/CachedDateTimeZone$Info.class */
    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        Info(DateTimeZone dateTimeZone, long j) {
            this.iPeriodStart = j;
            this.iZoneRef = dateTimeZone;
        }

        public final String getNameKey(long j) {
            Info info = this;
            while (true) {
                Info info2 = info.iNextInfo;
                if (info2 == null || j < info2.iPeriodStart) {
                    break;
                }
                info = info2;
            }
            if (info.iNameKey == null) {
                info.iNameKey = info.iZoneRef.getNameKey(info.iPeriodStart);
            }
            return info.iNameKey;
        }

        public final int getOffset(long j) {
            Info info = this;
            while (true) {
                Info info2 = info.iNextInfo;
                if (info2 == null || j < info2.iPeriodStart) {
                    break;
                }
                info = info2;
            }
            if (info.iOffset == Integer.MIN_VALUE) {
                info.iOffset = info.iZoneRef.getOffset(info.iPeriodStart);
            }
            return info.iOffset;
        }

        public final int getStandardOffset(long j) {
            Info info = this;
            while (true) {
                Info info2 = info.iNextInfo;
                if (info2 == null || j < info2.iPeriodStart) {
                    break;
                }
                info = info2;
            }
            if (info.iStandardOffset == Integer.MIN_VALUE) {
                info.iStandardOffset = info.iZoneRef.getStandardOffset(info.iPeriodStart);
            }
            return info.iStandardOffset;
        }
    }

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException e) {
            num = null;
        }
        if (num == null) {
            i = Property.TYPE_DICTIONARY;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iZone = dateTimeZone;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [long] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private org.joda.time.tz.CachedDateTimeZone.Info createInfo(long r8) {
        /*
            r7 = this;
            r0 = r8
            r1 = -4294967296(0xffffffff00000000, double:NaN)
            long r0 = r0 & r1
            r10 = r0
            org.joda.time.tz.CachedDateTimeZone$Info r0 = new org.joda.time.tz.CachedDateTimeZone$Info
            r1 = r0
            r2 = r7
            org.joda.time.DateTimeZone r2 = r2.iZone
            r3 = r10
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r10
            r8 = r0
            r0 = r12
            r13 = r0
        L_0x001a:
            r0 = r7
            org.joda.time.DateTimeZone r0 = r0.iZone
            r1 = r8
            long r0 = r0.nextTransition(r1)
            r14 = r0
            r0 = r14
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            r0 = r14
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = r10
            long r1 = r1 | r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            org.joda.time.tz.CachedDateTimeZone$Info r0 = new org.joda.time.tz.CachedDateTimeZone$Info
            r1 = r0
            r2 = r7
            org.joda.time.DateTimeZone r2 = r2.iZone
            r3 = r14
            r1.<init>(r2, r3)
            r16 = r0
            r0 = r13
            r1 = r16
            r0.iNextInfo = r1
            r0 = r16
            r13 = r0
            r0 = r14
            r8 = r0
            goto L_0x001a
        L_0x0056:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.CachedDateTimeZone.createInfo(long):org.joda.time.tz.CachedDateTimeZone$Info");
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (((int) (r0.iPeriodStart >> 32)) != r0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private org.joda.time.tz.CachedDateTimeZone.Info getInfo(long r5) {
        /*
            r4 = this;
            r0 = r5
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r7 = r0
            r0 = r4
            org.joda.time.tz.CachedDateTimeZone$Info[] r0 = r0.iInfoCache
            r8 = r0
            int r0 = org.joda.time.tz.CachedDateTimeZone.cInfoCacheMask
            r1 = r7
            r0 = r0 & r1
            r9 = r0
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L_0x0030
            r0 = r10
            r11 = r0
            r0 = r10
            long r0 = r0.iPeriodStart
            r1 = 32
            long r0 = r0 >> r1
            int r0 = (int) r0
            r1 = r7
            if (r0 == r1) goto L_0x003e
        L_0x0030:
            r0 = r4
            r1 = r5
            org.joda.time.tz.CachedDateTimeZone$Info r0 = r0.createInfo(r1)
            r11 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r0[r1] = r2
        L_0x003e:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.CachedDateTimeZone.getInfo(long):org.joda.time.tz.CachedDateTimeZone$Info");
    }

    @Override // org.joda.time.DateTimeZone, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j) {
        return getInfo(j).getNameKey(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j) {
        return getInfo(j).getOffset(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j) {
        return getInfo(j).getStandardOffset(j);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone, java.lang.Object
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j) {
        return this.iZone.nextTransition(j);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j) {
        return this.iZone.previousTransition(j);
    }
}
