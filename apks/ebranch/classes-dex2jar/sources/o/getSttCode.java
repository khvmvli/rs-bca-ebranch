package o;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import o.Page6KLFragment;
/* loaded from: classes-dex2jar.jar:o/getSttCode.class */
public final class getSttCode {

    /* loaded from: classes-dex2jar.jar:o/getSttCode$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends SumberDanaDataPemilikSetunFragment_ViewBinding {
        Object a;
        Object b;
        /* synthetic */ Object c;
        Object d;
        int e;

        IconCompatParcelizer(ProsesTarikanFragment<? super IconCompatParcelizer> prosesTarikanFragment) {
            super(prosesTarikanFragment);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return getSttCode.d(null, null, null, null, (ProsesTarikanFragment) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSttCode$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Long>, Object> {
        final /* synthetic */ File b;
        int c;
        final /* synthetic */ defaultInspectorModulesProvider e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(File file, defaultInspectorModulesProvider defaultinspectormodulesprovider, ProsesTarikanFragment<? super RemoteActionCompatParcelizer> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.b = file;
            this.e = defaultinspectormodulesprovider;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new RemoteActionCompatParcelizer(this.b, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Long> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                setScheme$com_github_ChuckerTeam_Chucker_library d = ChuckerDatabase.d(ChuckerDatabase.e(this.b));
                try {
                    th = null;
                    return new Long(d.a(this.e));
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSttCode$read.class */
    public static final class read extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super String>, Object> {
        final /* synthetic */ TujuanTransaksiORResponse$$Parcelable b;
        int d;
        final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable, Activity activity, ProsesTarikanFragment<? super read> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.b = tujuanTransaksiORResponse$$Parcelable;
            this.e = activity;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new read(this.b, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super String> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                return getSttCode.e(this.b, this.e);
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSttCode$write.class */
    public static final class write extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super defaultInspectorModulesProvider>, Object> {
        final /* synthetic */ TujuanTransaksiORResponse$$Parcelable c;
        int d;
        final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable, Activity activity, ProsesTarikanFragment<? super write> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.c = tujuanTransaksiORResponse$$Parcelable;
            this.e = activity;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new write(this.c, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super defaultInspectorModulesProvider> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                return this.c.b(this.e);
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object b(o.TujuanTransaksiORResponse$$Parcelable r6, android.app.Activity r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, o.ProsesTarikanFragment<? super android.content.Intent> r12) {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSttCode.b(o.TujuanTransaksiORResponse$$Parcelable, android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.ProsesTarikanFragment):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object d(o.TujuanTransaksiORResponse$$Parcelable r6, android.app.Activity r7, java.lang.String r8, java.lang.String r9, o.ProsesTarikanFragment<? super android.content.Intent> r10) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSttCode.d(o.TujuanTransaksiORResponse$$Parcelable, android.app.Activity, java.lang.String, java.lang.String, o.ProsesTarikanFragment):java.lang.Object");
    }

    public static final String e(TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable, Context context) {
        subscribeReservationRescheduleEvent.e(tujuanTransaksiORResponse$$Parcelable, "");
        subscribeReservationRescheduleEvent.e(context, "");
        setTookMs b = ChuckerDatabase.b(tujuanTransaksiORResponse$$Parcelable.b(context));
        try {
            th = null;
            return b.t();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
