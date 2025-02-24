package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import o.UpdateReceiverDataPresenter;
/* loaded from: classes2-dex2jar.jar:o/GetBranchPresenter.class */
public class GetBranchPresenter<T> extends OcrPresenter<T> implements GetBranchROPresenter<T>, SumberDanaDataPemilikSetunFragment {
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = GetAvailableBranchPresenter.c;
    private final ProsesTarikanFragment_ViewBinding a;
    public RescheduleReservationV2Presenter d;
    private final ProsesTarikanFragment<T> i;
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(GetBranchPresenter.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(GetBranchPresenter.class, Object.class, "_state");

    /* JADX WARN: Multi-variable type inference failed */
    public GetBranchPresenter(ProsesTarikanFragment<? super T> prosesTarikanFragment, int i) {
        super(1);
        this.i = prosesTarikanFragment;
        RateTransactionPresenter.c();
        this.a = prosesTarikanFragment.getContext();
    }

    public static Throwable a(UpdateReceiverDataPresenter updateReceiverDataPresenter) {
        return updateReceiverDataPresenter.h();
    }

    private final void a(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding, Throwable th) {
        try {
            t1TransaksiTarikanUbahFragment_ViewBinding.a(th);
        } catch (Throwable th2) {
            GetTxnTellerDetailPresenter.b(getContext(), new CompletionHandlerException(subscribeReservationRescheduleEvent.b("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final void b(int i) {
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this._decision;
            z2 = false;
            if (i2 == 0) {
                if (c.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i2 == 1) {
                z = false;
            } else {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z) {
            GetBranchPresenter<T> getBranchPresenter = this;
            if (RateTransactionPresenter.c()) {
                if (!(i != -1)) {
                    throw new AssertionError();
                }
            }
            ProsesTarikanFragment<T> a = getBranchPresenter.a();
            boolean z3 = i == 4;
            if (!z3 && (a instanceof getRequestContentType)) {
                boolean z4 = i == 1 || i == 2;
                int i3 = getBranchPresenter.e;
                if (i3 == 1 || i3 == 2) {
                    z2 = true;
                }
                if (z4 == z2) {
                    InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter = ((getRequestContentType) a).i;
                    ProsesTarikanFragment_ViewBinding context = a.getContext();
                    if (inquiryLoadDataBTPresenter.b()) {
                        inquiryLoadDataBTPresenter.d(context, getBranchPresenter);
                        return;
                    } else {
                        ResetAccountPresenter.e(getBranchPresenter);
                        return;
                    }
                }
            }
            ResetAccountPresenter.a(getBranchPresenter, a, z3);
        }
    }

    private boolean b(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof ImageHeaderParser$ImageType) {
                z2 = obj instanceof GetCategoriesORPresenter;
                GetBranchByCityPresenter getBranchByCityPresenter = new GetBranchByCityPresenter(this, th, z2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, getBranchByCityPresenter)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        GetCategoriesORPresenter getCategoriesORPresenter = z2 ? (GetCategoriesORPresenter) obj : null;
        if (getCategoriesORPresenter != null) {
            c(getCategoriesORPresenter, th);
        }
        e();
        b(this.e);
        return true;
    }

    private final void e() {
        RescheduleReservationV2Presenter rescheduleReservationV2Presenter;
        boolean z = true;
        if (this.e == 2) {
            if (((getRequestContentType) this.i)._reusableCancellableContinuation != null) {
                if (!z && (rescheduleReservationV2Presenter = this.d) != null) {
                    rescheduleReservationV2Presenter.a();
                    this.d = Registry$MissingComponentException.a;
                    return;
                }
            }
        }
        z = false;
        if (!z) {
        }
    }

    private static void e(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding, Object obj) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(t1TransaksiTarikanUbahFragment_ViewBinding);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final RescheduleReservationV2Presenter f() {
        UpdateReceiverDataPresenter updateReceiverDataPresenter = (UpdateReceiverDataPresenter) getContext().b(UpdateReceiverDataPresenter.b);
        if (updateReceiverDataPresenter == null) {
            return null;
        }
        RescheduleReservationV2Presenter d = UpdateReceiverDataPresenter.read.d(updateReceiverDataPresenter, true, false, (GetIdentityPresenter) new GetCountriesPresenter(this), 2, null);
        this.d = d;
        return d;
    }

    private final void g() {
        Throwable th;
        ProsesTarikanFragment<T> prosesTarikanFragment = this.i;
        getRequestContentType getrequestcontenttype = prosesTarikanFragment instanceof getRequestContentType ? (getRequestContentType) prosesTarikanFragment : null;
        if (getrequestcontenttype == null) {
            th = null;
        } else {
            GetBranchPresenter<T> getBranchPresenter = this;
            while (true) {
                Object obj = getrequestcontenttype._reusableCancellableContinuation;
                boolean z = false;
                boolean z2 = false;
                if (obj == getRequestDateString$com_github_ChuckerTeam_Chucker_library.b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getRequestContentType.b;
                    getScheme$com_github_ChuckerTeam_Chucker_library getscheme_com_github_chuckerteam_chucker_library = getRequestDateString$com_github_ChuckerTeam_Chucker_library.b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(getrequestcontenttype, getscheme_com_github_chuckerteam_chucker_library, getBranchPresenter)) {
                            if (atomicReferenceFieldUpdater.get(getrequestcontenttype) != getscheme_com_github_chuckerteam_chucker_library) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        th = null;
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = getRequestContentType.b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(getrequestcontenttype, obj, null)) {
                            if (atomicReferenceFieldUpdater2.get(getrequestcontenttype) != obj) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        th = (Throwable) obj;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalStateException(subscribeReservationRescheduleEvent.b("Inconsistent state ", obj).toString());
                }
            }
        }
        if (th != null) {
            RescheduleReservationV2Presenter rescheduleReservationV2Presenter = this.d;
            if (rescheduleReservationV2Presenter != null) {
                rescheduleReservationV2Presenter.a();
                this.d = Registry$MissingComponentException.a;
            }
            b(th);
        }
    }

    private final boolean h() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!c.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((((o.getRequestContentType) r3.i)._reusableCancellableContinuation != null) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final boolean i() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.e
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 2
            if (r0 != r1) goto L_0x0011
            r0 = 1
            r4 = r0
            goto L_0x0013
        L_0x0011:
            r0 = 0
            r4 = r0
        L_0x0013:
            r0 = r4
            if (r0 == 0) goto L_0x0032
            r0 = r3
            o.ProsesTarikanFragment<T> r0 = r0.i
            o.getRequestContentType r0 = (o.getRequestContentType) r0
            java.lang.Object r0 = r0._reusableCancellableContinuation
            if (r0 == 0) goto L_0x0029
            r0 = 1
            r4 = r0
            goto L_0x002b
        L_0x0029:
            r0 = 0
            r4 = r0
        L_0x002b:
            r0 = r4
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            r5 = r0
        L_0x0034:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetBranchPresenter.i():boolean");
    }

    @Override // o.OcrPresenter
    public final <T> T a(Object obj) {
        T t = (T) obj;
        if (obj instanceof GetCustDataPresenter) {
            t = (T) ((GetCustDataPresenter) obj).b;
        }
        return t;
    }

    @Override // o.OcrPresenter
    public final ProsesTarikanFragment<T> a() {
        return this.i;
    }

    @Override // o.GetBranchROPresenter
    public final void a(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter = t1TransaksiTarikanUbahFragment_ViewBinding instanceof GetCategoriesORPresenter ? (GetCategoriesORPresenter) t1TransaksiTarikanUbahFragment_ViewBinding : new UpdateTxnTellerDetailPresenter(t1TransaksiTarikanUbahFragment_ViewBinding);
        while (true) {
            Object obj = this._state;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            if (obj instanceof GetAvailableBranchPresenter) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, updateTxnTellerDetailPresenter)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z3) {
                    return;
                }
            } else if (obj instanceof GetCategoriesORPresenter) {
                e(t1TransaksiTarikanUbahFragment_ViewBinding, obj);
            } else {
                boolean z4 = obj instanceof GetDaftarPekerjaanPresenter;
                if (z4) {
                    GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = (GetDaftarPekerjaanPresenter) obj;
                    if (!GetDaftarPekerjaanPresenter.b.compareAndSet(getDaftarPekerjaanPresenter, 0, 1)) {
                        e(t1TransaksiTarikanUbahFragment_ViewBinding, obj);
                    }
                    if (obj instanceof GetBranchByCityPresenter) {
                        Throwable th = null;
                        if (!z4) {
                            getDaftarPekerjaanPresenter = null;
                        }
                        if (getDaftarPekerjaanPresenter != null) {
                            th = getDaftarPekerjaanPresenter.a;
                        }
                        a(t1TransaksiTarikanUbahFragment_ViewBinding, th);
                        return;
                    }
                    return;
                } else if (obj instanceof GetCustDataPresenter) {
                    GetCustDataPresenter getCustDataPresenter = (GetCustDataPresenter) obj;
                    if (getCustDataPresenter.d != null) {
                        e(t1TransaksiTarikanUbahFragment_ViewBinding, obj);
                    }
                    if (!(updateTxnTellerDetailPresenter instanceof GetBankSpecialRelationPresenter)) {
                        if (getCustDataPresenter.c != null) {
                            a(t1TransaksiTarikanUbahFragment_ViewBinding, getCustDataPresenter.c);
                            return;
                        }
                        GetCustDataPresenter a = GetCustDataPresenter.a(getCustDataPresenter, null, updateTxnTellerDetailPresenter, null, null, null, 29);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                        while (true) {
                            if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    z = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(updateTxnTellerDetailPresenter instanceof GetBankSpecialRelationPresenter)) {
                    GetCustDataPresenter getCustDataPresenter2 = new GetCustDataPresenter(obj, updateTxnTellerDetailPresenter, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, getCustDataPresenter2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // o.OcrPresenter
    public final Object b() {
        return this._state;
    }

    @Override // o.OcrPresenter
    public final Throwable b(Object obj) {
        Throwable th;
        Throwable b2 = b(obj);
        if (b2 == null) {
            th = null;
        } else {
            ProsesTarikanFragment<T> prosesTarikanFragment = this.i;
            th = b2;
            if (RateTransactionPresenter.b()) {
                th = !(prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment) ? b2 : getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(b2, (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment);
            }
        }
        return th;
    }

    public final Object c() {
        UpdateReceiverDataPresenter updateReceiverDataPresenter;
        boolean i = i();
        if (h()) {
            if (this.d == null) {
                f();
            }
            if (i) {
                g();
            }
            return ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED;
        }
        if (i) {
            g();
        }
        Object obj = this._state;
        if (obj instanceof GetDaftarPekerjaanPresenter) {
            Throwable th = ((GetDaftarPekerjaanPresenter) obj).a;
            Throwable th2 = th;
            if (RateTransactionPresenter.b()) {
                th2 = getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(th, this);
            }
            throw th2;
        }
        int i2 = this.e;
        boolean z = true;
        if (i2 != 1) {
            z = i2 == 2;
        }
        if (!z || (updateReceiverDataPresenter = (UpdateReceiverDataPresenter) getContext().b(UpdateReceiverDataPresenter.b)) == null || updateReceiverDataPresenter.e()) {
            Object obj2 = obj;
            if (obj instanceof GetCustDataPresenter) {
                obj2 = ((GetCustDataPresenter) obj).b;
            }
            return obj2;
        }
        CancellationException h = updateReceiverDataPresenter.h();
        c(obj, h);
        Throwable th3 = h;
        if (RateTransactionPresenter.b()) {
            th3 = getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(h, this);
        }
        throw th3;
    }

    @Override // o.OcrPresenter
    public final void c(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof ImageHeaderParser$ImageType) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof GetDaftarPekerjaanPresenter)) {
                if (obj2 instanceof GetCustDataPresenter) {
                    GetCustDataPresenter getCustDataPresenter = (GetCustDataPresenter) obj2;
                    boolean z = false;
                    if (!(getCustDataPresenter.c != null)) {
                        GetCustDataPresenter a = GetCustDataPresenter.a(getCustDataPresenter, null, null, null, null, th, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            GetCategoriesORPresenter getCategoriesORPresenter = getCustDataPresenter.d;
                            if (getCategoriesORPresenter != null) {
                                c(getCategoriesORPresenter, th);
                            }
                            T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding = getCustDataPresenter.a;
                            if (t1TransaksiTarikanUbahFragment_ViewBinding != null) {
                                e((T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp>) t1TransaksiTarikanUbahFragment_ViewBinding, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (InquiryEditDataORPresenter.e(b, this, obj2, new GetCustDataPresenter(obj2, null, null, null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void c(GetCategoriesORPresenter getCategoriesORPresenter, Throwable th) {
        try {
            getCategoriesORPresenter.a(th);
        } catch (Throwable th2) {
            GetTxnTellerDetailPresenter.b(getContext(), new CompletionHandlerException(subscribeReservationRescheduleEvent.b("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void d() {
        RescheduleReservationV2Presenter f = f();
        if (f != null && (!(this._state instanceof ImageHeaderParser$ImageType))) {
            f.a();
            this.d = Registry$MissingComponentException.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(java.lang.Throwable r6) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.i()
            r7 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L_0x0011
        L_0x000b:
            r0 = 0
            r9 = r0
            goto L_0x00a0
        L_0x0011:
            r0 = r5
            o.ProsesTarikanFragment<T> r0 = r0.i
            o.getRequestContentType r0 = (o.getRequestContentType) r0
            r10 = r0
        L_0x001a:
            r0 = r10
            java.lang.Object r0 = r0._reusableCancellableContinuation
            r11 = r0
            r0 = r11
            o.getScheme$com_github_ChuckerTeam_Chucker_library r1 = o.getRequestDateString$com_github_ChuckerTeam_Chucker_library.b
            boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.getRequestContentType.b
            r11 = r0
            o.getScheme$com_github_ChuckerTeam_Chucker_library r0 = o.getRequestDateString$com_github_ChuckerTeam_Chucker_library.b
            r12 = r0
        L_0x0036:
            r0 = r11
            r1 = r10
            r2 = r12
            r3 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            r9 = r0
            goto L_0x0058
        L_0x0049:
            r0 = r11
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            r1 = r12
            if (r0 == r1) goto L_0x0036
            r0 = 0
            r9 = r0
        L_0x0058:
            r0 = r9
            if (r0 == 0) goto L_0x001a
            r0 = r8
            r9 = r0
            goto L_0x00a0
        L_0x0063:
            r0 = r11
            boolean r0 = r0 instanceof java.lang.Throwable
            if (r0 == 0) goto L_0x0071
            r0 = r8
            r9 = r0
            goto L_0x00a0
        L_0x0071:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.getRequestContentType.b
            r12 = r0
        L_0x0076:
            r0 = r12
            r1 = r10
            r2 = r11
            r3 = 0
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 == 0) goto L_0x0089
            r0 = 1
            r9 = r0
            goto L_0x0098
        L_0x0089:
            r0 = r12
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            r1 = r11
            if (r0 == r1) goto L_0x0076
            r0 = 0
            r9 = r0
        L_0x0098:
            r0 = r9
            if (r0 == 0) goto L_0x001a
            goto L_0x000b
        L_0x00a0:
            r0 = r9
            if (r0 == 0) goto L_0x00a6
            return
        L_0x00a6:
            r0 = r5
            r1 = r6
            boolean r0 = r0.b(r1)
            r0 = r5
            r0.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetBranchPresenter.e(java.lang.Throwable):void");
    }

    public final void e(T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding, Throwable th) {
        try {
            t1TransaksiTarikanUbahFragment_ViewBinding.a(th);
        } catch (Throwable th2) {
            GetTxnTellerDetailPresenter.b(getContext(), new CompletionHandlerException(subscribeReservationRescheduleEvent.b("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public SumberDanaDataPemilikSetunFragment getCallerFrame() {
        ProsesTarikanFragment<T> prosesTarikanFragment = this.i;
        return prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment ? (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment : null;
    }

    @Override // o.ProsesTarikanFragment
    public ProsesTarikanFragment_ViewBinding getContext() {
        return this.a;
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.ProsesTarikanFragment
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        GetBranchPresenter<T> getBranchPresenter = this;
        Throwable e = Page6KLFragment.e(obj);
        if (e != null) {
            Throwable th = e;
            if (RateTransactionPresenter.b()) {
                GetBranchPresenter<T> getBranchPresenter2 = getBranchPresenter;
                th = !(getBranchPresenter2 instanceof SumberDanaDataPemilikSetunFragment) ? e : getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(e, getBranchPresenter2);
            }
            obj = new GetDaftarPekerjaanPresenter(th, false, 2);
        }
        int i = this.e;
        do {
            obj2 = this._state;
            if (obj2 instanceof ImageHeaderParser$ImageType) {
                ImageHeaderParser$ImageType imageHeaderParser$ImageType = (ImageHeaderParser$ImageType) obj2;
                if (obj instanceof GetDaftarPekerjaanPresenter) {
                    RateTransactionPresenter.c();
                    RateTransactionPresenter.c();
                } else {
                    boolean z = true;
                    if (i != 1) {
                        z = i == 2;
                    }
                    if (z && (imageHeaderParser$ImageType instanceof GetCategoriesORPresenter) && !(imageHeaderParser$ImageType instanceof GetBankSpecialRelationPresenter)) {
                        obj3 = new GetCustDataPresenter(obj, imageHeaderParser$ImageType instanceof GetCategoriesORPresenter ? (GetCategoriesORPresenter) imageHeaderParser$ImageType : null, null, null, null, 16);
                    }
                }
                obj3 = obj;
            } else {
                if (obj2 instanceof GetBranchByCityPresenter) {
                    if (GetBranchByCityPresenter.c.compareAndSet((GetBranchByCityPresenter) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(subscribeReservationRescheduleEvent.b("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!InquiryEditDataORPresenter.e(b, this, obj2, obj3));
        e();
        b(i);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation");
        sb.append('(');
        sb.append(ReRegistrationPresenter.e(this.i));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof ImageHeaderParser$ImageType ? "Active" : obj instanceof GetBranchByCityPresenter ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
