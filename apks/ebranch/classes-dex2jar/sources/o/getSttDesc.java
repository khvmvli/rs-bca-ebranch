package o;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
import o.Page6KLFragment;
import o.setNotes;
/* loaded from: classes-dex2jar.jar:o/getSttDesc.class */
public final class getSttDesc extends performPictureInPictureModeChanged {
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> a;
    public final performDestroyView<String> b;
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable>> d = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.b().c();

    /* loaded from: classes-dex2jar.jar:o/getSttDesc$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int b;

        public IconCompatParcelizer(ProsesTarikanFragment<? super IconCompatParcelizer> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new IconCompatParcelizer(prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
                this.b = 1;
                if (KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.b().d((ProsesTarikanFragment) this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSttDesc$read.class */
    static final class read extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
        int d;

        read(ProsesTarikanFragment<? super read> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new read(prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
                this.d = 1;
                if (KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c().b((ProsesTarikanFragment) this) == reviewSetoranFragment_ViewBinding) {
                    return reviewSetoranFragment_ViewBinding;
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSttDesc$write.class */
    public static final class write<I, O> implements setSwitchMinWidth<String, LiveData<List<? extends GetTxnTellerDetailResponse$TxnDetail$$Parcelable>>> {
        @Override // o.setSwitchMinWidth
        public final /* synthetic */ LiveData<List<? extends GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> c(String str) {
            LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> liveData;
            String str2 = str;
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
            getCategorySttDesc c = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c();
            String str3 = str2;
            if (str3 == null || CheckOTPSessionPresenter.a(str3)) {
                liveData = c.b();
            } else if (TextUtils.isDigitsOnly(str3)) {
                subscribeReservationRescheduleEvent.d(str2, "");
                liveData = c.b(str2, "");
            } else {
                subscribeReservationRescheduleEvent.d(str2, "");
                liveData = c.b("", str2);
            }
            return liveData;
        }
    }

    public getSttDesc() {
        performDestroyView<String> performdestroyview = new performDestroyView<>("");
        this.b = performdestroyview;
        performDestroyView<String> performdestroyview2 = performdestroyview;
        write write2 = new write();
        performDetach performdetach = new performDetach();
        performdetach.d(performdestroyview2, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: INVOKE  
              (r0v7 'performdetach' o.performDetach)
              (r0v4 'performdestroyview2' o.performDestroyView<java.lang.String>)
              (wrap: o.performPrepareOptionsMenu$3 : 0x0033: CONSTRUCTOR  (r2v1 o.performPrepareOptionsMenu$3 A[REMOVE]) = (r0v6 'write2' o.getSttDesc$write), (r0v7 'performdetach' o.performDetach) call: o.performPrepareOptionsMenu.3.<init>(o.setSwitchMinWidth, o.performDetach):void type: CONSTRUCTOR)
             type: VIRTUAL call: o.performDetach.d(androidx.lifecycle.LiveData, o.performLowMemory):void in method: o.getSttDesc.<init>():void, file: classes-dex2jar.jar:o/getSttDesc.class
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
            java.lang.String r2 = ""
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            r1 = r8
            r0.b = r1
            r0 = r8
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r8 = r0
            o.getSttDesc$write r0 = new o.getSttDesc$write
            r1 = r0
            r1.<init>()
            o.setSwitchMinWidth r0 = (o.setSwitchMinWidth) r0
            r9 = r0
            o.performDetach r0 = new o.performDetach
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            r1 = r8
            o.performPrepareOptionsMenu$3 r2 = new o.performPrepareOptionsMenu$3
            r3 = r2
            r4 = r9
            r5 = r10
            r3.<init>(r5)
            r0.d(r1, r2)
            r0 = r10
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.d(r0, r1)
            r0 = r7
            r1 = r10
            r0.a = r1
            o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable r0 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e
            r8 = r0
            r0 = r7
            o.KategoriTujuanTransaksiORResponse$$Parcelable r1 = o.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.b()
            androidx.lifecycle.LiveData r1 = r1.c()
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSttDesc.<init>():void");
    }

    public static Object b(ProsesTarikanFragment<? super List<HttpTransaction>> prosesTarikanFragment) {
        KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
        return KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.c().e(prosesTarikanFragment);
    }

    public final void e() {
        GetAreaPresenter.a(performSaveInstanceState.b(this), (ProsesTarikanFragment_ViewBinding) null, (KategoriTujuanTransaksiORPresenter) null, new read(null), 3);
        setNotes.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setNotes.c;
        synchronized (setNotes.d()) {
            setNotes.d().clear();
            setNotes.b().clear();
            onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
        }
    }
}
