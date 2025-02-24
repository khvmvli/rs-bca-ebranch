package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/InquiryLoadDataBTPresenter.class */
public abstract class InquiryLoadDataBTPresenter extends ProsesORFragment_ViewBinding implements ProsesORFragment {
    public static final IconCompatParcelizer c = new IconCompatParcelizer((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/InquiryLoadDataBTPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends ProsesSetoranFragment_ViewBinding<ProsesORFragment, InquiryLoadDataBTPresenter> {
        private IconCompatParcelizer() {
            super(ProsesORFragment.e, AnonymousClass4.b);
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public InquiryLoadDataBTPresenter() {
        super(ProsesORFragment.e);
    }

    @Override // o.ProsesORFragment
    public final <T> ProsesTarikanFragment<T> b(ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        return new getRequestContentType(this, prosesTarikanFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.ProsesORFragment_ViewBinding, o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, o.ProsesTarikanFragment_ViewBinding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final <E extends o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(o.ProsesTarikanFragment_ViewBinding.read<E> r4) {
        /*
            r3 = this;
            r0 = r3
            o.ProsesORFragment r0 = (o.ProsesORFragment) r0
            r5 = r0
            r0 = r4
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r4
            boolean r0 = r0 instanceof o.ProsesSetoranFragment_ViewBinding
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0078
            r0 = r4
            o.ProsesSetoranFragment_ViewBinding r0 = (o.ProsesSetoranFragment_ViewBinding) r0
            r7 = r0
            r0 = r5
            o.ProsesTarikanFragment_ViewBinding$read r0 = r0.d()
            r4 = r0
            r0 = r4
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r4
            r1 = r7
            if (r0 == r1) goto L_0x0042
            r0 = r7
            o.ProsesTarikanFragment_ViewBinding$read<?> r0 = r0.d
            r1 = r4
            if (r0 == r1) goto L_0x0042
            r0 = 0
            r9 = r0
            goto L_0x0045
        L_0x0042:
            r0 = 1
            r9 = r0
        L_0x0045:
            r0 = r8
            r4 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0076
            r0 = r5
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = (o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) r0
            r4 = r0
            r0 = r4
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r7
            o.T1TransaksiTarikanUbahFragment_ViewBinding<o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer, E extends B> r0 = r0.b
            r1 = r4
            java.lang.Object r0 = r0.a(r1)
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = (o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) r0
            r7 = r0
            r0 = r8
            r4 = r0
            r0 = r7
            boolean r0 = r0 instanceof o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer
            if (r0 == 0) goto L_0x0076
            r0 = r7
            r4 = r0
        L_0x0076:
            r0 = r4
            return r0
        L_0x0078:
            r0 = r7
            r8 = r0
            o.ProsesORFragment$IconCompatParcelizer r0 = o.ProsesORFragment.e
            r1 = r4
            if (r0 != r1) goto L_0x008d
            r0 = r5
            o.subscribeReservationRescheduleEvent.c(r0)
            r0 = r5
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = (o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) r0
            r8 = r0
        L_0x008d:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InquiryLoadDataBTPresenter.b(o.ProsesTarikanFragment_ViewBinding$read):o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer");
    }

    public boolean b() {
        return true;
    }

    public abstract void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable);

    @Override // o.ProsesORFragment_ViewBinding, o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read) {
        InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = this;
        subscribeReservationRescheduleEvent.e(read, "");
        if (read instanceof ProsesSetoranFragment_ViewBinding) {
            ProsesSetoranFragment_ViewBinding prosesSetoranFragment_ViewBinding = (ProsesSetoranFragment_ViewBinding) read;
            ProsesTarikanFragment_ViewBinding.read<?> d = inquiryLoadDataBTPresenter.d();
            subscribeReservationRescheduleEvent.e(d, "");
            ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = inquiryLoadDataBTPresenter;
            if (d == prosesSetoranFragment_ViewBinding || prosesSetoranFragment_ViewBinding.d == d) {
                InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter2 = inquiryLoadDataBTPresenter;
                subscribeReservationRescheduleEvent.e(inquiryLoadDataBTPresenter2, "");
                prosesTarikanFragment_ViewBinding = inquiryLoadDataBTPresenter;
                if (((ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) prosesSetoranFragment_ViewBinding.b.a(inquiryLoadDataBTPresenter2)) != null) {
                    prosesTarikanFragment_ViewBinding = ReviewSetoranFragment.e;
                }
            }
            return prosesTarikanFragment_ViewBinding;
        }
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding2 = inquiryLoadDataBTPresenter;
        if (ProsesORFragment.e == read) {
            prosesTarikanFragment_ViewBinding2 = ReviewSetoranFragment.e;
        }
        return prosesTarikanFragment_ViewBinding2;
    }

    @Override // o.ProsesORFragment
    public final void e(ProsesTarikanFragment<?> prosesTarikanFragment) {
        RescheduleReservationV2Presenter rescheduleReservationV2Presenter;
        getRequestContentType getrequestcontenttype = (getRequestContentType) prosesTarikanFragment;
        do {
        } while (getrequestcontenttype._reusableCancellableContinuation == getRequestDateString$com_github_ChuckerTeam_Chucker_library.b);
        Object obj = getrequestcontenttype._reusableCancellableContinuation;
        GetBranchPresenter getBranchPresenter = obj instanceof GetBranchPresenter ? (GetBranchPresenter) obj : null;
        if (getBranchPresenter != null && (rescheduleReservationV2Presenter = getBranchPresenter.d) != null) {
            rescheduleReservationV2Presenter.a();
            getBranchPresenter.d = Registry$MissingComponentException.a;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
