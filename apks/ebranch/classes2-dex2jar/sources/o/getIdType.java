package o;

import android.app.Activity;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/getIdType.class */
public final class getIdType extends realmGet$FlagTxnBerkala {
    private getAcctNo a;
    protected getAcctNo b;
    private Activity c;
    private volatile getAcctNo e;
    private getAcctNo f;
    private volatile boolean g;
    private boolean h;
    private volatile getAcctNo j;
    private getAcctNo k;
    private String l;
    private final Object i = new Object();
    private final Map<Activity, getAcctNo> d = new ConcurrentHashMap();

    public getIdType(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final getAcctNo a(Activity activity) {
        setFotoKtp.b(activity);
        getAcctNo getacctno = this.d.get(activity);
        getAcctNo getacctno2 = getacctno;
        if (getacctno == null) {
            getacctno2 = new getAcctNo(null, b(activity.getClass(), "Activity"), this.q.u().i());
            this.d.put(activity, getacctno2);
        }
        if (this.q.t().c((String) null, realmSet.hasDone.Z) && this.j != null) {
            return this.j;
        }
        return getacctno2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Type inference failed for: r0v33, types: [o.Setoran$$Parcelable$1, o.realmSet$descTransaksi, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v48, types: [long] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.getIdType, o.realmSet$descTransaksi, o.realmSet$RepresentativeName] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void a(o.getAcctNo r8, o.getAcctNo r9, long r10, boolean r12, android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIdType.a(o.getAcctNo, o.getAcctNo, long, boolean, android.os.Bundle):void");
    }

    public static void b(getAcctNo getacctno, Bundle bundle, boolean z) {
        boolean z2 = z;
        if (getacctno != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = getacctno.c;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = getacctno.e;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", getacctno.b);
                return;
            }
            z2 = false;
        }
        if (getacctno == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(getIdType getidtype, Bundle bundle, getAcctNo getacctno, getAcctNo getacctno2, long j) {
        bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        getidtype.a(getacctno, getacctno2, j, true, getidtype.q.u().d((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(Activity activity, getAcctNo getacctno, boolean z) {
        getAcctNo getacctno2;
        getAcctNo getacctno3 = this.e == null ? this.a : this.e;
        if (getacctno.e == null) {
            getacctno2 = new getAcctNo(getacctno.c, activity != null ? b(activity.getClass(), "Activity") : null, getacctno.b, getacctno.a, getacctno.h);
        } else {
            getacctno2 = getacctno;
        }
        this.a = this.e;
        this.e = getacctno2;
        this.q.o_().b(new getBankTransfers(this, getacctno2, getacctno3, this.q.q_().b(), z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(getAcctNo getacctno, boolean z, long j) {
        ((realmSet.descTransaksi) this).q.b().c(this.q.q_().b());
        if (((realmSet.descTransaksi) this).q.r().c.b(getacctno != null && getacctno.d, z, j) && getacctno != null) {
            getacctno.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Activity activity, Bundle bundle) {
        getAcctNo getacctno;
        if (this.q.t().g() && bundle != null && (getacctno = this.d.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", getacctno.b);
            bundle2.putString("name", getacctno.c);
            bundle2.putString("referrer_name", getacctno.e);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, getAcctNo getacctno) {
        r_();
        synchronized (this) {
            String str2 = this.l;
            if (str2 == null || str2.equals(str) || getacctno != null) {
                this.l = str;
                this.k = getacctno;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String b(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.q.t();
        String str3 = str2;
        if (length2 > 100) {
            this.q.t();
            str3 = str2.substring(0, 100);
        }
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r0 > 100) goto L_0x0071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r0 > 100) goto L_0x00b8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(android.os.Bundle r11, long r12) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIdType.b(android.os.Bundle, long):void");
    }

    @Override // o.realmGet$FlagTxnBerkala
    protected final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity) {
        if (this.q.t().c((String) null, realmSet.hasDone.Z)) {
            synchronized (this.i) {
                this.h = true;
                if (activity != this.c) {
                    synchronized (this.i) {
                        this.c = activity;
                        this.g = false;
                    }
                    if (this.q.t().c((String) null, realmSet.hasDone.V) && this.q.t().g()) {
                        this.j = null;
                        this.q.o_().b(new getCreditCards(this));
                    }
                }
            }
        }
        if (!this.q.t().c((String) null, realmSet.hasDone.V) || this.q.t().g()) {
            c(activity, a(activity), false);
            getNominalTransaksiTeller b = ((realmSet.descTransaksi) this).q.b();
            b.q.o_().b((Runnable) new getKliringList(b, b.q.q_().b()));
            return;
        }
        this.e = this.j;
        this.q.o_().b(new User(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getAcctNo d(boolean z) {
        n();
        r_();
        if (!this.q.t().c((String) null, realmSet.hasDone.Z) || !z) {
            return this.b;
        }
        getAcctNo getacctno = this.b;
        return getacctno != null ? getacctno : this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Activity activity) {
        if (this.q.t().c((String) null, realmSet.hasDone.Z)) {
            synchronized (this.i) {
                this.h = false;
                this.g = true;
            }
        }
        long b = this.q.q_().b();
        if (!this.q.t().c((String) null, realmSet.hasDone.V) || this.q.t().g()) {
            getAcctNo a = a(activity);
            this.a = this.e;
            this.e = null;
            this.q.o_().b(new getIdNum(this, a, b));
            return;
        }
        this.e = null;
        this.q.o_().b(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: INVOKE  
              (wrap: o.realmGet$SenderIdType : 0x0060: INVOKE  (r0v26 o.realmGet$SenderIdType A[REMOVE]) = 
              (wrap: o.realmGet$TxnPurpose : 0x005d: IGET  (r0v25 o.realmGet$TxnPurpose A[REMOVE]) = (r8v0 'this' o.getIdType A[IMMUTABLE_TYPE, THIS]) o.realmSet$RepresentativeName.q o.realmGet$TxnPurpose)
             type: VIRTUAL call: o.realmGet$TxnPurpose.o_():o.realmGet$SenderIdType)
              (wrap: o.Tarikan$$Parcelable$1 : 0x0069: CONSTRUCTOR  (r1v8 o.Tarikan$$Parcelable$1 A[REMOVE]) = (r8v0 'this' o.getIdType A[IMMUTABLE_TYPE, THIS]), (r0v7 'b' long) call: o.Tarikan$$Parcelable.1.<init>(o.getIdType, long):void type: CONSTRUCTOR)
             type: VIRTUAL call: o.realmGet$SenderIdType.b(java.lang.Runnable):void in method: o.getIdType.d(android.app.Activity):void, file: classes2-dex2jar.jar:o/getIdType.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.Tarikan$$Parcelable, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 19 more
            */
        /*
            this = this;
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.getSumberDana r0 = r0.t()
            r1 = 0
            o.realmSet$image r2 = o.realmSet.hasDone.Z
            boolean r0 = r0.c(r1, r2)
            if (r0 == 0) goto L_0x002c
            r0 = r8
            java.lang.Object r0 = r0.i
            r10 = r0
            r0 = r10
            monitor-enter(r0)
            r0 = r8
            r1 = 0
            r0.h = r1     // Catch: all -> 0x0027
            r0 = r8
            r1 = 1
            r0.g = r1     // Catch: all -> 0x0027
            r0 = r10
            monitor-exit(r0)     // Catch: all -> 0x0027
            goto L_0x002c
        L_0x0027:
            r9 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: all -> 0x0027
            r0 = r9
            throw r0
        L_0x002c:
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.getNoTelpKontakPengirim r0 = r0.q_()
            long r0 = r0.b()
            r11 = r0
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.getSumberDana r0 = r0.t()
            r1 = 0
            o.realmSet$image r2 = o.realmSet.hasDone.V
            boolean r0 = r0.c(r1, r2)
            if (r0 == 0) goto L_0x0070
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.getSumberDana r0 = r0.t()
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0070
            r0 = r8
            r1 = 0
            r0.e = r1
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmGet$SenderIdType r0 = r0.o_()
            o.Tarikan$$Parcelable$1 r1 = new o.Tarikan$$Parcelable$1
            r2 = r1
            r3 = r8
            r4 = r11
            r2.<init>(r4)
            r0.b(r1)
            return
        L_0x0070:
            r0 = r8
            r1 = r9
            o.getAcctNo r0 = r0.a(r1)
            r9 = r0
            r0 = r8
            r1 = r8
            o.getAcctNo r1 = r1.e
            r0.a = r1
            r0 = r8
            r1 = 0
            r0.e = r1
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmGet$SenderIdType r0 = r0.o_()
            o.getIdNum r1 = new o.getIdNum
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r11
            r2.<init>(r3, r4, r5)
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIdType.d(android.app.Activity):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Activity activity) {
        synchronized (this.i) {
            if (activity == this.c) {
                this.c = null;
            }
        }
        if (this.q.t().g()) {
            this.d.remove(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.q.t().g() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.d.put(activity, new getAcctNo(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }
}
