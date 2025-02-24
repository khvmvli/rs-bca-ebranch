package o;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
/* loaded from: classes-dex2jar.jar:o/getIsRepresentativeTransaction.class */
public final class getIsRepresentativeTransaction extends performPictureInPictureModeChanged {
    final performDestroyView<Boolean> a;
    final LiveData<Boolean> b;
    final LiveData<Boolean> c;
    final LiveData<Boolean> d;
    final LiveData<Boolean> e;
    final LiveData<HttpTransaction> g;
    final LiveData<String> h;

    /* loaded from: classes-dex2jar.jar:o/getIsRepresentativeTransaction$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements onClickInfo<Boolean, Boolean, Boolean> {
        public static final IconCompatParcelizer d = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(2);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return Boolean.valueOf(!bool.booleanValue() || !bool2.booleanValue());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getIsRepresentativeTransaction$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<I, O> implements setSwitchMinWidth<HttpTransaction, Boolean> {
        @Override // o.setSwitchMinWidth
        public final Boolean c(HttpTransaction httpTransaction) {
            HttpTransaction httpTransaction2 = httpTransaction;
            boolean z = true;
            if (httpTransaction2 == null || subscribeReservationRescheduleEvent.b((Object) httpTransaction2.getFormattedPath$com_github_ChuckerTeam_Chucker_library(true), (Object) httpTransaction2.getFormattedPath$com_github_ChuckerTeam_Chucker_library(false))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getIsRepresentativeTransaction$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements onClickInfo<HttpTransaction, Boolean, String> {
        public static final read c = new read();

        read() {
            super(2);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ String invoke(HttpTransaction httpTransaction, Boolean bool) {
            String str;
            HttpTransaction httpTransaction2 = httpTransaction;
            boolean booleanValue = bool.booleanValue();
            if (httpTransaction2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(httpTransaction2.getMethod());
                sb.append(' ');
                sb.append(httpTransaction2.getFormattedPath$com_github_ChuckerTeam_Chucker_library(booleanValue));
                str = sb.toString();
            } else {
                str = "";
            }
            return str;
        }
    }

    public getIsRepresentativeTransaction(long j) {
        performDestroyView<Boolean> performdestroyview = new performDestroyView<>(Boolean.FALSE);
        this.a = performdestroyview;
        performDestroyView<Boolean> performdestroyview2 = performdestroyview;
        this.e = performdestroyview2;
        KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
        this.h = getNotes.d(KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c().b(j), performdestroyview2, read.c);
        KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable2 = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
        LiveData<HttpTransaction> b = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c().b(j);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        performDetach performdetach = new performDetach();
        performdetach.d(b, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: INVOKE  
              (r0v13 'performdetach' o.performDetach)
              (r0v10 'b' androidx.lifecycle.LiveData<com.chuckerteam.chucker.internal.data.entity.HttpTransaction>)
              (wrap: o.performPrepareOptionsMenu$4 : 0x006b: CONSTRUCTOR  (r2v3 o.performPrepareOptionsMenu$4 A[REMOVE]) = 
              (r0v13 'performdetach' o.performDetach)
              (r0v12 'remoteActionCompatParcelizer' o.getIsRepresentativeTransaction$RemoteActionCompatParcelizer)
             call: o.performPrepareOptionsMenu.4.<init>(o.performDetach, o.setSwitchMinWidth):void type: CONSTRUCTOR)
             type: VIRTUAL call: o.performDetach.d(androidx.lifecycle.LiveData, o.performLowMemory):void in method: o.getIsRepresentativeTransaction.<init>(long):void, file: classes-dex2jar.jar:o/getIsRepresentativeTransaction.class
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
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.performPrepareOptionsMenu, state: GENERATED_AND_UNLOADED
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
            	... 15 more
            */
        /*
            this = this;
            r0 = r7
            r0.<init>()
            o.performDestroyView r0 = new o.performDestroyView
            r1 = r0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2)
            r10 = r0
            r0 = r7
            r1 = r10
            r0.a = r1
            r0 = r10
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r10 = r0
            r0 = r7
            r1 = r10
            r0.e = r1
            o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e
            r11 = r0
            r0 = r7
            o.getCategorySttDesc r1 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c()
            r2 = r8
            androidx.lifecycle.LiveData r1 = r1.b(r2)
            r2 = r10
            o.getIsRepresentativeTransaction$read r3 = o.getIsRepresentativeTransaction.read.c
            o.onClickInfo r3 = (o.onClickInfo) r3
            androidx.lifecycle.LiveData r1 = o.getNotes.d(r1, r2, r3)
            r0.h = r1
            o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e
            r11 = r0
            o.getCategorySttDesc r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c()
            r1 = r8
            androidx.lifecycle.LiveData r0 = r0.b(r1)
            r12 = r0
            o.getIsRepresentativeTransaction$RemoteActionCompatParcelizer r0 = new o.getIsRepresentativeTransaction$RemoteActionCompatParcelizer
            r1 = r0
            r1.<init>()
            o.setSwitchMinWidth r0 = (o.setSwitchMinWidth) r0
            r11 = r0
            o.performDetach r0 = new o.performDetach
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            r1 = r12
            o.performPrepareOptionsMenu$4 r2 = new o.performPrepareOptionsMenu$4
            r3 = r2
            r4 = r13
            r5 = r11
            r3.<init>(r5)
            r0.d(r1, r2)
            r0 = r13
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.d(r0, r1)
            r0 = r7
            r1 = r13
            r0.b = r1
            o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e
            r11 = r0
            o.getCategorySttDesc r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c()
            r1 = r8
            androidx.lifecycle.LiveData r0 = r0.b(r1)
            r12 = r0
            o.getIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.getIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver
            r1 = r0
            r1.<init>()
            o.setSwitchMinWidth r0 = (o.setSwitchMinWidth) r0
            r13 = r0
            o.performDetach r0 = new o.performDetach
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r11
            r1 = r12
            o.performPrepareOptionsMenu$4 r2 = new o.performPrepareOptionsMenu$4
            r3 = r2
            r4 = r11
            r5 = r13
            r3.<init>(r5)
            r0.d(r1, r2)
            r0 = r11
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.d(r0, r1)
            r0 = r7
            r1 = r11
            r0.c = r1
            o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e
            r13 = r0
            r0 = r7
            o.getCategorySttDesc r1 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c()
            r2 = r8
            androidx.lifecycle.LiveData r1 = r1.b(r2)
            r0.g = r1
            r0 = r7
            r1 = r11
            r2 = r10
            o.getIsRepresentativeTransaction$IconCompatParcelizer r3 = o.getIsRepresentativeTransaction.IconCompatParcelizer.d
            o.onClickInfo r3 = (o.onClickInfo) r3
            androidx.lifecycle.LiveData r1 = o.getNotes.d(r1, r2, r3)
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIsRepresentativeTransaction.<init>(long):void");
    }
}
