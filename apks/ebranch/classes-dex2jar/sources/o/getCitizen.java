package o;

import android.content.Context;
import java.util.Collections;
import o.getTransaksiTundaSubDetailList;
@onChooseValueDescPekerjaan
/* loaded from: classes-dex2jar.jar:o/getCitizen.class */
public class getCitizen implements getBusinessFieldFlagFreeText {
    public static volatile Account e;
    public final getJobOthers a;
    private final getHmProvince b;
    private final realmGet$businessField c;
    private final realmGet$businessField d;

    @onClickNegara
    public getCitizen(realmGet$businessField realmget_businessfield, realmGet$businessField realmget_businessfield2, getHmProvince gethmprovince, getJobOthers getjobothers, getKitasKitapNumber getkitaskitapnumber) {
        this.c = realmget_businessfield;
        this.d = realmget_businessfield2;
        this.b = gethmprovince;
        this.a = getjobothers;
        getkitaskitapnumber.a.execute(new Runnable() { // from class: o.getLanguage
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: INVOKE  
                  (wrap: o.realmGet$acctType : 0x0006: IGET  (r0v3 o.realmGet$acctType A[REMOVE]) = (r0v1 'getkitaskitapnumber2' o.getKitasKitapNumber) o.getKitasKitapNumber.d o.realmGet$acctType)
                  (wrap: o.getKitasKitapExpDate : 0x000e: CONSTRUCTOR  (r1v0 o.getKitasKitapExpDate A[REMOVE]) = (r0v1 'getkitaskitapnumber2' o.getKitasKitapNumber) call: o.getKitasKitapExpDate.<init>(o.getKitasKitapNumber):void type: CONSTRUCTOR)
                 type: INTERFACE call: o.realmGet$acctType.d(o.realmGet$acctType$IconCompatParcelizer):java.lang.Object in method: o.getLanguage.run():void, file: classes-dex2jar.jar:o/getLanguage.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getKitasKitapExpDate, state: NOT_LOADED
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
                	... 10 more
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r5 = this;
                    r0 = r5
                    o.getKitasKitapNumber r0 = o.getKitasKitapNumber.this
                    r6 = r0
                    r0 = r6
                    o.realmGet$acctType r0 = r0.d
                    o.getKitasKitapExpDate r1 = new o.getKitasKitapExpDate
                    r2 = r1
                    r3 = r6
                    r2.<init>(r3)
                    java.lang.Object r0 = r0.d(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getLanguage.run():void");
            }
        });
    }

    public static void e(Context context) {
        if (e == null) {
            synchronized (getCitizen.class) {
                try {
                    if (e == null) {
                        e = new getTransaksiTundaSubDetailList.write((byte) 0).d(context).b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final getStatusType a(setFlagReservasi setflagreservasi) {
        return new TransaksiTundaSubDetail(setflagreservasi instanceof setNoReffAnak ? Collections.unmodifiableSet(((setNoReffAnak) setflagreservasi).c()) : Collections.singleton(new getFlagRating("proto")), TransaksiTundaDetail$$Parcelable.e().e(setflagreservasi.b()).a(setflagreservasi.e()).e(), this);
    }

    @Override // o.getBusinessFieldFlagFreeText
    public final void e(getTransaksiTundaDetail gettransaksitundadetail, getTransaksiTundaDetailList gettransaksitundadetaillist) {
        getHmProvince gethmprovince = this.b;
        TransaksiTundaDetail$$Parcelable e2 = gettransaksitundadetail.e();
        gethmprovince.e(TransaksiTundaDetail$$Parcelable.e().e(e2.c()).d(gettransaksitundadetail.a().b()).a(e2.b()).e(), setTransaksiTunda.j().d(this.c.c()).b(this.d.c()).e(gettransaksitundadetail.d()).c(new setTxbType(gettransaksitundadetail.c(), gettransaksitundadetail.b().apply(gettransaksitundadetail.a().a()))).b(gettransaksitundadetail.a().d()).c(), gettransaksitundadetaillist);
    }
}
