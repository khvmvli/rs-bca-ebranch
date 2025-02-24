package o;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$RepresentativeName.class */
public final class realmGet$RepresentativeName extends realmSet$isMember implements getSumberDanaCode {
    private final Map<String, Map<String, String>> e = new setThumbTextPadding();
    private final Map<String, Map<String, Boolean>> a = new setThumbTextPadding();
    private final Map<String, Map<String, Boolean>> c = new setThumbTextPadding();
    private final Map<String, realmGet.noCardKrisFlyer> j = new setThumbTextPadding();
    private final Map<String, String> g = new setThumbTextPadding();
    private final Map<String, Map<String, Integer>> f = new setThumbTextPadding();
    final setThumbResource<String, getNationality> b = new setThumbResource<String, getNationality>(20) { // from class: o.realmGet$RecurringVar
        public final /* synthetic */ Object a(Object obj) {
            String str = (String) obj;
            setFotoKtp.c(str);
            return realmGet$RepresentativeName.a(realmGet$RepresentativeName.this, str);
        }
    };
    final realmGet.PromoCode d = new realmGet.PromoCode() { // from class: o.realmGet$RepresentativeIdNumber
        public final void c(int i, String str, List<String> list, boolean z, boolean z2) {
            int i2 = i - 1;
            setCodeCurrencyTeller g = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? realmGet$RepresentativeName.this.q.s_().g() : z ? realmGet$RepresentativeName.this.q.s_().j() : !z2 ? realmGet$RepresentativeName.this.q.s_().f() : realmGet$RepresentativeName.this.q.s_().c() : realmGet$RepresentativeName.this.q.s_().i() : z ? realmGet$RepresentativeName.this.q.s_().d() : !z2 ? realmGet$RepresentativeName.this.q.s_().a() : realmGet$RepresentativeName.this.q.s_().b() : realmGet$RepresentativeName.this.q.s_().h();
            int size = list.size();
            if (size == 1) {
                g.e(str, list.get(0));
            } else if (size == 2) {
                g.a(str, list.get(0), list.get(1));
            } else if (size != 3) {
                g.b(str);
            } else {
                g.b(str, list.get(0), list.get(1), list.get(2));
            }
        }
    };

    public realmGet$RepresentativeName(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
    }

    public static /* synthetic */ getNationality a(realmGet$RepresentativeName realmget_representativename, String str) {
        getNationality getnationality;
        realmget_representativename.v();
        setFotoKtp.c(str);
        realmGet.KategoriTujuanTransaksi.e();
        if (!realmget_representativename.q.t().c((String) null, realmSet.hasDone.F)) {
            getnationality = null;
        } else if (!realmget_representativename.f(str)) {
            getnationality = null;
        } else {
            if (!realmget_representativename.j.containsKey(str) || realmget_representativename.j.get(str) == null) {
                realmget_representativename.i(str);
            } else {
                realmget_representativename.c(str, realmget_representativename.j.get(str));
            }
            getnationality = (getNationality) realmget_representativename.b.d().get(str);
        }
        return getnationality;
    }

    private final realmGet.noCardKrisFlyer a(String str, byte[] bArr) {
        if (bArr == null) {
            return realmGet.noCardKrisFlyer.e();
        }
        try {
            realmGet.noCardKrisFlyer v = setAccounts.a(realmGet.noCardKrisFlyer.d(), bArr).v();
            setCodeCurrencyTeller i = this.q.s_().i();
            String str2 = null;
            Long valueOf = v.b() ? Long.valueOf(v.a()) : null;
            if (v.j()) {
                str2 = v.f();
            }
            i.a("Parsed config. version, gmp_app_id", valueOf, str2);
            return v;
        } catch (zzkn e) {
            this.q.s_().c().a("Unable to merge remote config. appId", setIsInputAtmPemrek.d(str), e);
            return realmGet.noCardKrisFlyer.e();
        } catch (RuntimeException e2) {
            this.q.s_().c().a("Unable to merge remote config. appId", setIsInputAtmPemrek.d(str), e2);
            return realmGet.noCardKrisFlyer.e();
        }
    }

    private final void b(String str, realmGet.monthlyOtherIncome monthlyotherincome) {
        Map<String, Boolean> setthumbtextpadding = new setThumbTextPadding<>();
        Map<String, Boolean> setthumbtextpadding2 = new setThumbTextPadding<>();
        Map<String, Integer> setthumbtextpadding3 = new setThumbTextPadding<>();
        if (monthlyotherincome != null) {
            for (int i = 0; i < monthlyotherincome.d(); i++) {
                realmGet.nationality an = monthlyotherincome.b(i).an();
                if (TextUtils.isEmpty(an.e())) {
                    this.q.s_().c().b("EventConfig contained null event name");
                } else {
                    String e = an.e();
                    String c = realmSet$SenderName.c(an.e());
                    if (!TextUtils.isEmpty(c)) {
                        an.b(c);
                        monthlyotherincome.a(i, an);
                    }
                    setthumbtextpadding.put(e, Boolean.valueOf(an.d()));
                    setthumbtextpadding2.put(an.e(), Boolean.valueOf(an.a()));
                    if (an.b()) {
                        if (an.c() < 2 || an.c() > 65535) {
                            this.q.s_().c().a("Invalid sampling rate. Event name, sample rate", an.e(), Integer.valueOf(an.c()));
                        } else {
                            setthumbtextpadding3.put(an.e(), Integer.valueOf(an.c()));
                        }
                    }
                }
            }
        }
        this.a.put(str, setthumbtextpadding);
        this.c.put(str, setthumbtextpadding2);
        this.f.put(str, setthumbtextpadding3);
    }

    private final void c(String str, realmGet.noCardKrisFlyer nocardkrisflyer) {
        if (nocardkrisflyer.o() != 0) {
            this.q.s_().i().e("EES programs found", Integer.valueOf(nocardkrisflyer.o()));
            realmSet.customerName customername = (realmSet.customerName) nocardkrisflyer.n().get(0);
            try {
                getNationality getnationality = new getNationality();
                getnationality.e("internal.remoteConfig", new Callable(this, str) { // from class: o.realmGet$ReceiverAlias
                    private final String d;
                    private final realmGet$RepresentativeName e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.e = r4;
                        this.d = r5;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: RETURN  
                          (wrap: o.setRelationship : 0x0015: CONSTRUCTOR  (r0v0 o.setRelationship A[REMOVE]) = 
                          ("internal.remoteConfig")
                          (wrap: o.realmGet$RepresentativeIdType : 0x0012: CONSTRUCTOR  (r3v0 o.realmGet$RepresentativeIdType A[REMOVE]) = 
                          (wrap: o.realmGet$RepresentativeName : 0x000b: IGET  (r5v1 o.realmGet$RepresentativeName A[REMOVE]) = (r8v0 'this' o.realmGet$ReceiverAlias A[IMMUTABLE_TYPE, THIS]) o.realmGet$ReceiverAlias.e o.realmGet$RepresentativeName)
                          (wrap: java.lang.String : 0x000f: IGET  (r6v1 java.lang.String A[REMOVE]) = (r8v0 'this' o.realmGet$ReceiverAlias A[IMMUTABLE_TYPE, THIS]) o.realmGet$ReceiverAlias.d java.lang.String)
                         call: o.realmGet$RepresentativeIdType.<init>(o.realmGet$RepresentativeName, java.lang.String):void type: CONSTRUCTOR)
                         call: o.setRelationship.<init>(java.lang.String, o.getKotaBankPenerima):void type: CONSTRUCTOR)
                         in method: o.realmGet$ReceiverAlias.call():java.lang.Object, file: classes2-dex2jar.jar:o/realmGet$ReceiverAlias.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.realmGet$RepresentativeIdType, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:709)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 10 more
                        */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        /*
                            r8 = this;
                            o.setRelationship r0 = new o.setRelationship
                            r1 = r0
                            java.lang.String r2 = "internal.remoteConfig"
                            o.realmGet$RepresentativeIdType r3 = new o.realmGet$RepresentativeIdType
                            r4 = r3
                            r5 = r8
                            o.realmGet$RepresentativeName r5 = r5.e
                            r6 = r8
                            java.lang.String r6 = r6.d
                            r4.<init>(r5, r6)
                            r1.<init>(r2, r3)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$ReceiverAlias.call():java.lang.Object");
                    }
                });
                getnationality.e("internal.logger", new Callable(this) { // from class: o.realmGet$RecurringValue
                    private final realmGet$RepresentativeName a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = r4;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new realmGet.SumberDanaTransaksiKode(this.a.d);
                    }
                });
                getnationality.d(customername);
                this.b.c(str, getnationality);
                this.q.s_().i().a("EES program loaded for appId, activities", str, Integer.valueOf(customername.e().c()));
                for (realmSet.currWorkPeriod currworkperiod : customername.e().d()) {
                    this.q.s_().i().e("EES program activity", currworkperiod.d());
                }
            } catch (zzd e) {
                this.q.s_().b().e("Failed to load EES program. appId", str);
            }
        } else {
            this.b.b(str);
        }
    }

    private static final Map<String, String> e(realmGet.noCardKrisFlyer nocardkrisflyer) {
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
        if (nocardkrisflyer != null) {
            for (realmGet.phoneNumber phonenumber : nocardkrisflyer.h()) {
                setthumbtextpadding.put(phonenumber.b(), phonenumber.a());
            }
        }
        return setthumbtextpadding;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 12, insn: 0x0202: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:54:0x0202
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    private final void i(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 12, insn: 0x0202: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:54:0x0202
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final String a(String str, String str2) {
        r_();
        i(str);
        Map<String, String> map = this.e.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final boolean a(String str) {
        r_();
        realmGet.noCardKrisFlyer b = b(str);
        if (b == null) {
            return false;
        }
        return b.l();
    }

    public final boolean a(String str, byte[] bArr, String str2) {
        v();
        r_();
        setFotoKtp.c(str);
        realmGet.monthlyOtherIncome monthlyotherincome = (realmGet.monthlyOtherIncome) a(str, bArr).an();
        if (monthlyotherincome == null) {
            return false;
        }
        b(str, monthlyotherincome);
        realmGet.KategoriTujuanTransaksi.e();
        if (this.q.t().c((String) null, realmSet.hasDone.F)) {
            c(str, (realmGet.noCardKrisFlyer) monthlyotherincome.v());
        }
        this.j.put(str, (realmGet.noCardKrisFlyer) monthlyotherincome.v());
        this.g.put(str, str2);
        this.e.put(str, e(monthlyotherincome.v()));
        this.h.r().c(str, new ArrayList(monthlyotherincome.a()));
        try {
            monthlyotherincome.c();
            bArr = monthlyotherincome.v().am();
        } catch (RuntimeException e) {
            this.q.s_().c().a("Unable to serialize reduced-size config. Storing full config instead. appId", setIsInputAtmPemrek.d(str), e);
        }
        realmGet.FlagPromoCode.a();
        if (this.q.t().c((String) null, realmSet.hasDone.A)) {
            this.h.r().a(str, bArr, str2);
        } else {
            this.h.r().a(str, bArr, (String) null);
        }
        this.j.put(str, (realmGet.noCardKrisFlyer) monthlyotherincome.v());
        return true;
    }

    public final realmGet.noCardKrisFlyer b(String str) {
        v();
        r_();
        setFotoKtp.c(str);
        i(str);
        return this.j.get(str);
    }

    public final boolean b(String str, String str2) {
        Boolean bool;
        r_();
        i(str);
        if (j(str) && setAcctNo.c(str2)) {
            return true;
        }
        if (h(str) && setAcctNo.d(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.a.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String c(String str) {
        r_();
        return this.g.get(str);
    }

    public final void d(String str) {
        r_();
        this.g.put(str, null);
    }

    public final boolean d(String str, String str2) {
        Boolean bool;
        r_();
        i(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.c.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int e(String str, String str2) {
        Integer num;
        r_();
        i(str);
        Map<String, Integer> map = this.f.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final void e(String str) {
        r_();
        this.j.remove(str);
    }

    public final boolean f(String str) {
        realmGet.noCardKrisFlyer nocardkrisflyer;
        realmGet.KategoriTujuanTransaksi.e();
        return this.q.t().c((String) null, realmSet.hasDone.F) && !TextUtils.isEmpty(str) && (nocardkrisflyer = this.j.get(str)) != null && nocardkrisflyer.o() != 0;
    }

    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final boolean j(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        return false;
    }
}
