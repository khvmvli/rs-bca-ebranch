package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getRequestContentType.class */
public final class getRequestContentType<T> extends OcrPresenter<T> implements SumberDanaDataPemilikSetunFragment, ProsesTarikanFragment<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(getRequestContentType.class, Object.class, "_reusableCancellableContinuation");
    public final ProsesTarikanFragment<T> d;
    public final InquiryLoadDataBTPresenter i;
    public Object a = getRequestDateString$com_github_ChuckerTeam_Chucker_library.d;
    public final Object c = getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.b(getContext());
    public volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* JADX WARN: Multi-variable type inference failed */
    public getRequestContentType(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        super(-1);
        this.i = inquiryLoadDataBTPresenter;
        this.d = prosesTarikanFragment;
    }

    @Override // o.OcrPresenter
    public final ProsesTarikanFragment<T> a() {
        return this;
    }

    @Override // o.OcrPresenter
    public final Object b() {
        Object obj = this.a;
        if (RateTransactionPresenter.c()) {
            if (!(obj != getRequestDateString$com_github_ChuckerTeam_Chucker_library.d)) {
                throw new AssertionError();
            }
        }
        this.a = getRequestDateString$com_github_ChuckerTeam_Chucker_library.d;
        return obj;
    }

    @Override // o.OcrPresenter
    public final void c(Object obj, Throwable th) {
        if (obj instanceof GetHBPresenter) {
            ((GetHBPresenter) obj).e.a(th);
        }
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public final SumberDanaDataPemilikSetunFragment getCallerFrame() {
        ProsesTarikanFragment<T> prosesTarikanFragment = this.d;
        return prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment ? (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment : null;
    }

    @Override // o.ProsesTarikanFragment
    public final ProsesTarikanFragment_ViewBinding getContext() {
        return this.d.getContext();
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.ProsesTarikanFragment
    public final void resumeWith(Object obj) {
        boolean z;
        OcrPresenter<?> b2;
        ProsesTarikanFragment_ViewBinding context = this.d.getContext();
        Object e = GetRatePresenter.e(obj, null);
        if (this.i.b()) {
            this.a = e;
            this.e = 0;
            this.i.d(context, this);
            return;
        }
        RateTransactionPresenter.c();
        HttpTransaction httpTransaction = HttpTransaction.b;
        SendEmailTransactionSuccessPresenter d = HttpTransaction.d();
        if (d.g()) {
            this.a = e;
            this.e = 0;
            getRequestContentType<T> getrequestcontenttype = this;
            getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = d.b;
            getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library2 = getparsedresponseheaders_com_github_chuckerteam_chucker_library;
            if (getparsedresponseheaders_com_github_chuckerteam_chucker_library == null) {
                getparsedresponseheaders_com_github_chuckerteam_chucker_library2 = new getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<>();
                d.b = getparsedresponseheaders_com_github_chuckerteam_chucker_library2;
            }
            getparsedresponseheaders_com_github_chuckerteam_chucker_library2.d(getrequestcontenttype);
            return;
        }
        getRequestContentType<T> getrequestcontenttype2 = this;
        d.e(true);
        try {
            ProsesTarikanFragment_ViewBinding context2 = getContext();
            Object b3 = getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.b(context2, this.c);
            this.d.resumeWith(obj);
            onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
            getResponseSummaryText$com_github_ChuckerTeam_Chucker_library.d(context2, b3);
            do {
                getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library3 = d.b;
                if (getparsedresponseheaders_com_github_chuckerteam_chucker_library3 == null || (b2 = getparsedresponseheaders_com_github_chuckerteam_chucker_library3.b()) == null) {
                    z = false;
                } else {
                    b2.run();
                    z = true;
                }
            } while (z);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.i);
        sb.append(", ");
        sb.append(ReRegistrationPresenter.e(this.d));
        sb.append(']');
        return sb.toString();
    }
}
