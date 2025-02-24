package o;

import android.widget.LinearLayout;
import com.bca.smartbranch.fragment.CC11FormKartuKreditFragment;
import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:o/setReceiverName.class */
public final /* synthetic */ class setReceiverName implements Realm.Transaction {
    public final /* synthetic */ CC11FormKartuKreditFragment.AnonymousClass5 b;
    public final /* synthetic */ int e;

    public /* synthetic */ setReceiverName(CC11FormKartuKreditFragment.AnonymousClass5 r4, int i) {
        this.b = r4;
        this.e = i;
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(Realm realm) {
        CC11FormKartuKreditFragment.AnonymousClass5 r0 = this.b;
        switch (this.e) {
            case 2131298153:
                CC11FormKartuKreditFragment.this.a.c(CC11FormKartuKreditFragment.this.llWNA);
                return;
            case 2131298154:
                getPromotion.d(CC11FormKartuKreditFragment.this.getActivity());
                setMessage setmessage = CC11FormKartuKreditFragment.this.a;
                LinearLayout linearLayout = CC11FormKartuKreditFragment.this.llWNA;
                setmessage.a = linearLayout.getMeasuredHeight();
                setmessage.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: IPUT  
                      (wrap: o.setMessage$1 : 0x004a: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v12 'setmessage' o.setMessage), (r0v15 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v12 'setmessage' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: o.setReceiverName.execute(io.realm.Realm):void, file: classes-dex2jar.jar:o/setReceiverName.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 21 more
                    */
                /*
                    this = this;
                    r0 = r6
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment$5 r0 = r0.b
                    r7 = r0
                    r0 = r6
                    int r0 = r0.e
                    switch(r0) {
                        case 2131298153: goto L_0x00af;
                        case 2131298154: goto L_0x0021;
                        default: goto L_0x0020;
                    }
                L_0x0020:
                    return
                L_0x0021:
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.getView r0 = r0.getActivity()
                    o.getPromotion.d(r0)
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.setMessage r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.b(r0)
                    r8 = r0
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    android.widget.LinearLayout r0 = r0.llWNA
                    r9 = r0
                    r0 = r8
                    r1 = r9
                    int r1 = r1.getMeasuredHeight()
                    r0.a = r1
                    r0 = r8
                    o.setMessage$1 r1 = new o.setMessage$1
                    r2 = r1
                    r3 = r8
                    r4 = r9
                    r2.<init>(r4)
                    r0.b = r1
                    r0 = r8
                    r1 = r9
                    r0.b(r1)
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                    com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                    java.lang.String r1 = "ID"
                    r0.setNationality(r1)
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.getView r0 = r0.getActivity()
                    com.bca.smartbranch.activity.CC8FormKartuKreditActivity r0 = (com.bca.smartbranch.activity.CC8FormKartuKreditActivity) r0
                    com.bca.smartbranch.data.localdb.CreditCard r0 = r0.n
                    java.lang.String r1 = ""
                    r0.setKitasKitapFlag(r1)
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    android.widget.EditText r0 = r0.etNegara
                    java.lang.String r1 = ""
                    r0.setText(r1)
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.LogoutDialog_ViewBinding r0 = r0.tilNegara
                    r1 = 0
                    r0.setHintEnabled(r1)
                    android.os.Handler r0 = new android.os.Handler
                    r1 = r0
                    r1.<init>()
                    o.setReceiverResidency r1 = new o.setReceiverResidency
                    r2 = r1
                    r3 = r7
                    r2.<init>()
                    r2 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r2 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.setMessage r2 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.b(r2)
                    int r2 = r2.e
                    long r2 = (long) r2
                    boolean r0 = r0.postDelayed(r1, r2)
                    return
                L_0x00af:
                    r0 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    o.setMessage r0 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.b(r0)
                    r1 = r7
                    com.bca.smartbranch.fragment.CC11FormKartuKreditFragment r1 = com.bca.smartbranch.fragment.CC11FormKartuKreditFragment.this
                    android.widget.LinearLayout r1 = r1.llWNA
                    r0.c(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setReceiverName.execute(io.realm.Realm):void");
            }
        }
