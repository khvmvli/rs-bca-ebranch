package o;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes-dex2jar.jar:o/getHmCity.class */
public final class getHmCity implements getHmProvince {
    static final Logger d = Logger.getLogger(getCitizen.class.getName());
    final getCurrentPage a;
    final getMaritalStatus b;
    final getLastEducation c;
    final realmGet$acctType e;
    private final Executor h;

    @onClickNegara
    public getHmCity(Executor executor, getCurrentPage getcurrentpage, getLastEducation getlasteducation, getMaritalStatus getmaritalstatus, realmGet$acctType realmget_accttype) {
        this.h = executor;
        this.a = getcurrentpage;
        this.c = getlasteducation;
        this.b = getmaritalstatus;
        this.e = realmget_accttype;
    }

    @Override // o.getHmProvince
    public final void e(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, setTransaksiTunda settransaksitunda, getTransaksiTundaDetailList gettransaksitundadetaillist) {
        this.h.execute(new Runnable(transaksiTundaDetail$$Parcelable, gettransaksitundadetaillist, settransaksitunda) { // from class: o.getHandPhoneCountryCodeNumber
            public final /* synthetic */ setTransaksiTunda a;
            public final /* synthetic */ TransaksiTundaDetail$$Parcelable d;
            public final /* synthetic */ getTransaksiTundaDetailList e;

            {
                this.d = r5;
                this.e = r6;
                this.a = r7;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0075: INVOKE  
                  (wrap: o.realmGet$acctType : 0x005e: IGET  (r0v21 o.realmGet$acctType A[REMOVE]) = (r0v1 'gethmcity' o.getHmCity) o.getHmCity.e o.realmGet$acctType)
                  (wrap: o.getHmCountry : 0x006e: CONSTRUCTOR  (r0v22 o.getHmCountry A[REMOVE]) = 
                  (r0v1 'gethmcity' o.getHmCity)
                  (r0v3 'transaksiTundaDetail$$Parcelable2' o.TransaksiTundaDetail$$Parcelable)
                  (wrap: o.setTransaksiTunda : 0x0056: INVOKE  (r0v19 o.setTransaksiTunda A[REMOVE]) = (r0v16 'd2' o.getFlagEKTP), (r0v7 'settransaksitunda2' o.setTransaksiTunda) type: INTERFACE call: o.getFlagEKTP.a(o.setTransaksiTunda):o.setTransaksiTunda)
                 call: o.getHmCountry.<init>(o.getHmCity, o.TransaksiTundaDetail$$Parcelable, o.setTransaksiTunda):void type: CONSTRUCTOR)
                 type: INTERFACE call: o.realmGet$acctType.d(o.realmGet$acctType$IconCompatParcelizer):java.lang.Object in method: o.getHandPhoneCountryCodeNumber.run():void, file: classes-dex2jar.jar:o/getHandPhoneCountryCodeNumber.class
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:301)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getHmCountry, state: NOT_LOADED
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
                	... 20 more
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r6 = this;
                    r0 = r6
                    o.getHmCity r0 = o.getHmCity.this
                    r7 = r0
                    r0 = r6
                    o.TransaksiTundaDetail$$Parcelable r0 = r0.d
                    r8 = r0
                    r0 = r6
                    o.getTransaksiTundaDetailList r0 = r0.e
                    r9 = r0
                    r0 = r6
                    o.setTransaksiTunda r0 = r0.a
                    r10 = r0
                    r0 = r7
                    o.getCurrentPage r0 = r0.a     // Catch: Exception -> 0x0083
                    r1 = r8
                    java.lang.String r1 = r1.c()     // Catch: Exception -> 0x0083
                    o.getFlagEKTP r0 = r0.d(r1)     // Catch: Exception -> 0x0083
                    r11 = r0
                    r0 = r11
                    if (r0 != 0) goto L_0x0052
                    java.lang.String r0 = "Transport backend '%s' is not registered"
                    r1 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: Exception -> 0x0083
                    r2 = r1
                    r3 = 0
                    r4 = r8
                    java.lang.String r4 = r4.c()     // Catch: Exception -> 0x0083
                    r2[r3] = r4     // Catch: Exception -> 0x0083
                    java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: Exception -> 0x0083
                    r8 = r0
                    java.util.logging.Logger r0 = o.getHmCity.d     // Catch: Exception -> 0x0083
                    r1 = r8
                    r0.warning(r1)     // Catch: Exception -> 0x0083
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: Exception -> 0x0083
                    r7 = r0
                    r0 = r7
                    r1 = r8
                    r0.<init>(r1)     // Catch: Exception -> 0x0083
                    r0 = r9
                    r1 = r7
                    r0.onSchedule(r1)     // Catch: Exception -> 0x0083
                    return
                L_0x0052:
                    r0 = r11
                    r1 = r10
                    o.setTransaksiTunda r0 = r0.a(r1)     // Catch: Exception -> 0x0083
                    r10 = r0
                    r0 = r7
                    o.realmGet$acctType r0 = r0.e     // Catch: Exception -> 0x0083
                    r12 = r0
                    o.getHmCountry r0 = new o.getHmCountry     // Catch: Exception -> 0x0083
                    r11 = r0
                    r0 = r11
                    r1 = r7
                    r2 = r8
                    r3 = r10
                    r0.<init>(r1, r2, r3)     // Catch: Exception -> 0x0083
                    r0 = r12
                    r1 = r11
                    java.lang.Object r0 = r0.d(r1)     // Catch: Exception -> 0x0083
                    r0 = r9
                    r1 = 0
                    r0.onSchedule(r1)     // Catch: Exception -> 0x0083
                    return
                L_0x0083:
                    r7 = move-exception
                    java.util.logging.Logger r0 = o.getHmCity.d
                    r11 = r0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r1 = r0
                    java.lang.String r2 = "Error scheduling event "
                    r1.<init>(r2)
                    r8 = r0
                    r0 = r8
                    r1 = r7
                    java.lang.String r1 = r1.getMessage()
                    java.lang.StringBuilder r0 = r0.append(r1)
                    r0 = r11
                    r1 = r8
                    java.lang.String r1 = r1.toString()
                    r0.warning(r1)
                    r0 = r9
                    r1 = r7
                    r0.onSchedule(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getHandPhoneCountryCodeNumber.run():void");
            }
        });
    }
}
