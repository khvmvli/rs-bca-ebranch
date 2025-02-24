package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/realmGet$TxnSource.class */
public final class realmGet$TxnSource {
    private String A;
    private long B;
    private long C;
    private List<String> D;
    private long E;
    private long G;
    private long a;
    private long b;
    private long c;
    private boolean d;
    private String e;
    private final String f;
    private long g;
    private String h;
    private final realmGet$TxnPurpose i;
    private String j;
    private long k;
    private long l;
    private String m;
    private String n;

    /* renamed from: o */
    private long f89o;
    private long p;
    private String q;
    private long r;
    private String s;
    private long t;
    private boolean u;
    private long v;
    private String w;
    private Boolean x;
    private boolean y;
    private long z;

    public realmGet$TxnSource(realmGet$TxnPurpose realmget_txnpurpose, String str) {
        setFotoKtp.b(realmget_txnpurpose);
        setFotoKtp.c(str);
        this.i = realmget_txnpurpose;
        this.f = str;
        realmget_txnpurpose.o_().r_();
    }

    public final String A() {
        this.i.o_().r_();
        return this.A;
    }

    public final long B() {
        this.i.o_().r_();
        return this.f89o;
    }

    public final long C() {
        this.i.o_().r_();
        return this.l;
    }

    public final String D() {
        this.i.o_().r_();
        return this.n;
    }

    public final long F() {
        this.i.o_().r_();
        return this.t;
    }

    public final long G() {
        this.i.o_().r_();
        return this.p;
    }

    public final String H() {
        this.i.o_().r_();
        return this.s;
    }

    public final String I() {
        this.i.o_().r_();
        return this.q;
    }

    public final long a() {
        this.i.o_().r_();
        return this.a;
    }

    public final void a(long j) {
        this.i.o_().r_();
        this.d |= this.t != j;
        this.t = j;
    }

    public final void a(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.e, str);
        this.e = str;
    }

    public final void a(boolean z) {
        this.i.o_().r_();
        this.d |= this.u != z;
        this.u = z;
    }

    public final long b() {
        this.i.o_().r_();
        return this.z;
    }

    public final void b(long j) {
        this.i.o_().r_();
        this.d |= this.r != j;
        this.r = j;
    }

    public final void b(Boolean bool) {
        this.i.o_().r_();
        boolean z = this.d;
        Boolean bool2 = this.x;
        int i = setAcctNo.a;
        this.d = z | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.x = bool;
    }

    public final void b(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.j, str);
        this.j = str;
    }

    public final long c() {
        this.i.o_().r_();
        return this.k;
    }

    public final void c(long j) {
        this.i.o_().r_();
        this.d |= this.a != j;
        this.a = j;
    }

    public final void c(String str) {
        this.i.o_().r_();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.d |= true ^ setAcctNo.c(this.h, str2);
        this.h = str2;
    }

    public final void c(List<String> list) {
        this.i.o_().r_();
        List<String> list2 = this.D;
        int i = setAcctNo.a;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.d = true;
                this.D = list != null ? new ArrayList(list) : null;
            }
        }
    }

    public final void d(long j) {
        boolean z = false;
        setFotoKtp.b(j >= 0);
        this.i.o_().r_();
        boolean z2 = this.d;
        if (this.k != j) {
            z = true;
        }
        this.d = z | z2;
        this.k = j;
    }

    public final void d(String str) {
        this.i.o_().r_();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.d |= true ^ setAcctNo.c(this.w, str2);
        this.w = str2;
    }

    public final void d(boolean z) {
        this.i.o_().r_();
        this.d |= this.y != z;
        this.y = z;
    }

    public final boolean d() {
        this.i.o_().r_();
        return this.u;
    }

    public final long e() {
        this.i.o_().r_();
        return this.r;
    }

    public final void e(long j) {
        this.i.o_().r_();
        this.d |= this.z != j;
        this.z = j;
    }

    public final void e(String str) {
        this.i.o_().r_();
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = null;
        }
        this.d |= true ^ setAcctNo.c(this.A, str2);
        this.A = str2;
    }

    public final long f() {
        this.i.o_().r_();
        return this.C;
    }

    public final void f(long j) {
        this.i.o_().r_();
        this.d |= this.G != j;
        this.G = j;
    }

    public final long g() {
        this.i.o_().r_();
        return this.B;
    }

    public final void g(long j) {
        this.i.o_().r_();
        this.d |= this.g != j;
        this.g = j;
    }

    public final void g(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.n, str);
        this.n = str;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void h() {
        /*
            r5 = this;
            r0 = r5
            o.realmGet$TxnPurpose r0 = r0.i
            o.realmGet$SenderIdType r0 = r0.o_()
            r0.r_()
            r0 = r5
            long r0 = r0.k
            r1 = 1
            long r0 = r0 + r1
            r6 = r0
            r0 = r6
            r8 = r0
            r0 = r6
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            r0 = r5
            o.realmGet$TxnPurpose r0 = r0.i
            o.setIsInputAtmPemrek r0 = r0.s_()
            o.setCodeCurrencyTeller r0 = r0.c()
            java.lang.String r1 = "Bundle index overflow. appId"
            r2 = r5
            java.lang.String r2 = r2.f
            java.lang.Object r2 = o.setIsInputAtmPemrek.d(r2)
            r0.e(r1, r2)
            r0 = 0
            r8 = r0
        L_0x0033:
            r0 = r5
            r1 = 1
            r0.d = r1
            r0 = r5
            r1 = r8
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$TxnSource.h():void");
    }

    public final void h(long j) {
        this.i.o_().r_();
        this.d |= this.B != j;
        this.B = j;
    }

    public final void h(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.s, str);
        this.s = str;
    }

    public final long i() {
        this.i.o_().r_();
        return this.g;
    }

    public final void i(long j) {
        this.i.o_().r_();
        this.d |= this.E != j;
        this.E = j;
    }

    public final void i(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.m, str);
        this.m = str;
    }

    public final long j() {
        this.i.o_().r_();
        return this.G;
    }

    public final void j(long j) {
        this.i.o_().r_();
        this.d |= this.C != j;
        this.C = j;
    }

    public final void j(String str) {
        this.i.o_().r_();
        this.d |= !setAcctNo.c(this.q, str);
        this.q = str;
    }

    public final long k() {
        this.i.o_().r_();
        return this.E;
    }

    public final void k(long j) {
        this.i.o_().r_();
        this.d |= this.c != j;
        this.c = j;
    }

    public final long l() {
        this.i.o_().r_();
        return this.b;
    }

    public final void l(long j) {
        this.i.o_().r_();
        this.d |= this.l != j;
        this.l = j;
    }

    public final void m(long j) {
        this.i.o_().r_();
        this.d |= this.v != j;
        this.v = j;
    }

    public final boolean m() {
        this.i.o_().r_();
        return this.d;
    }

    public final String n() {
        this.i.o_().r_();
        return this.e;
    }

    public final void n(long j) {
        this.i.o_().r_();
        this.d |= this.f89o != j;
        this.f89o = j;
    }

    public final long o() {
        this.i.o_().r_();
        return this.c;
    }

    public final void o(long j) {
        this.i.o_().r_();
        this.d |= this.b != j;
        this.b = j;
    }

    public final String p() {
        this.i.o_().r_();
        String str = this.e;
        a((String) null);
        return str;
    }

    public final void q(long j) {
        this.i.o_().r_();
        this.d |= this.p != j;
        this.p = j;
    }

    public final boolean q() {
        this.i.o_().r_();
        return this.y;
    }

    public final List<String> r() {
        this.i.o_().r_();
        return this.D;
    }

    public final Boolean s() {
        this.i.o_().r_();
        return this.x;
    }

    public final long t() {
        this.i.o_().r_();
        return this.v;
    }

    public final String u() {
        this.i.o_().r_();
        return this.f;
    }

    public final void v() {
        this.i.o_().r_();
        this.d = false;
    }

    public final String w() {
        this.i.o_().r_();
        return this.w;
    }

    public final String x() {
        this.i.o_().r_();
        return this.h;
    }

    public final String y() {
        this.i.o_().r_();
        return this.j;
    }

    public final String z() {
        this.i.o_().r_();
        return this.m;
    }
}
