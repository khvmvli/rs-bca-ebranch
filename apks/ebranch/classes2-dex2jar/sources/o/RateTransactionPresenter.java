package o;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2-dex2jar.jar:o/RateTransactionPresenter.class */
public final class RateTransactionPresenter {
    private static final boolean b;
    private static final boolean c;
    private static final boolean d = false;
    private static final AtomicLong e;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0.equals("auto") != false) goto L_0x0089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r0.equals("on") != false) goto L_0x0057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r0.equals("") != false) goto L_0x0057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        r8 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = o.getStatus$com_github_ChuckerTeam_Chucker_library.e(r0)
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0089
            r0 = r5
            int r0 = r0.hashCode()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x004e
            r0 = r7
            r1 = 3551(0xddf, float:4.976E-42)
            if (r0 == r1) goto L_0x0042
            r0 = r7
            r1 = 109935(0x1ad6f, float:1.54052E-40)
            if (r0 == r1) goto L_0x0034
            r0 = r7
            r1 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r0 != r1) goto L_0x005c
            r0 = r5
            java.lang.String r1 = "auto"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            goto L_0x0089
        L_0x0034:
            r0 = r5
            java.lang.String r1 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            r0 = 0
            r8 = r0
            goto L_0x008d
        L_0x0042:
            r0 = r5
            java.lang.String r1 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
            goto L_0x0057
        L_0x004e:
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005c
        L_0x0057:
            r0 = 1
            r8 = r0
            goto L_0x008d
        L_0x005c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r9
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0089:
            boolean r0 = o.RateTransactionPresenter.d
            r8 = r0
        L_0x008d:
            r0 = r8
            o.RateTransactionPresenter.b = r0
            r0 = r8
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            java.lang.String r0 = o.getStatus$com_github_ChuckerTeam_Chucker_library.e(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x00a7
            r0 = r5
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r8 = r0
            goto L_0x00a9
        L_0x00a7:
            r0 = 1
            r8 = r0
        L_0x00a9:
            r0 = r8
            if (r0 == 0) goto L_0x00b2
            r0 = r6
            r8 = r0
            goto L_0x00b4
        L_0x00b2:
            r0 = 0
            r8 = r0
        L_0x00b4:
            r0 = r8
            o.RateTransactionPresenter.c = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            o.RateTransactionPresenter.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RateTransactionPresenter.m273clinit():void");
    }

    public static final AtomicLong a() {
        return e;
    }

    public static final boolean b() {
        return c;
    }

    public static final boolean c() {
        return d;
    }

    public static final boolean e() {
        return b;
    }
}
