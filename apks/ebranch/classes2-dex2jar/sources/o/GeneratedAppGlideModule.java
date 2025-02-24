package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import o.ProsesTarikanFragment_ViewBinding;
import o.UpdateReceiverDataPresenter;
/* loaded from: classes2-dex2jar.jar:o/GeneratedAppGlideModule.class */
public class GeneratedAppGlideModule implements GetCreditCardOptionsPresenter, hasAlpha {
    static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(GeneratedAppGlideModule.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    volatile /* synthetic */ Object _state;

    /* loaded from: classes2-dex2jar.jar:o/GeneratedAppGlideModule$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements TxnTellerPresenter {
        volatile /* synthetic */ Object _rootCause;
        final Registry$NoImageHeaderParserException a;
        volatile /* synthetic */ int _isCompleting = 0;
        volatile /* synthetic */ Object _exceptionsHolder = null;

        public RemoteActionCompatParcelizer(Registry$NoImageHeaderParserException registry$NoImageHeaderParserException, boolean z, Throwable th) {
            this.a = registry$NoImageHeaderParserException;
            this._rootCause = th;
        }

        @Override // o.TxnTellerPresenter
        public final boolean b() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void d(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(subscribeReservationRescheduleEvent.b("State is ", obj).toString());
                }
            }
        }

        @Override // o.TxnTellerPresenter
        public final Registry$NoImageHeaderParserException e() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [int, boolean] */
        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(((Throwable) this._rootCause) != null);
            sb.append(", completing=");
            sb.append((boolean) this._isCompleting);
            sb.append(", rootCause=");
            sb.append((Throwable) this._rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(this.a);
            sb.append(']');
            return sb.toString();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/GeneratedAppGlideModule$read.class */
    public static final class read extends getResponseHeaders$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver {
        final /* synthetic */ getResponseHeaders$com_github_ChuckerTeam_Chucker_library b;
        final /* synthetic */ Object d;
        final /* synthetic */ GeneratedAppGlideModule e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library, GeneratedAppGlideModule generatedAppGlideModule, Object obj) {
            super(getresponseheaders_com_github_chuckerteam_chucker_library);
            this.b = getresponseheaders_com_github_chuckerteam_chucker_library;
            this.e = generatedAppGlideModule;
            this.d = obj;
        }

        @Override // o.getRequestBody
        public final /* synthetic */ Object e(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
            Object obj;
            GeneratedAppGlideModule generatedAppGlideModule = this.e;
            while (true) {
                obj = generatedAppGlideModule._state;
                if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                    break;
                }
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(generatedAppGlideModule);
            }
            return obj == this.d ? null : getRequestPayloadSize.a();
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/GeneratedAppGlideModule$write.class */
    public static final class write extends VTandFAPresenter {
        private final GetCitySearchPresenter a;
        private final GeneratedAppGlideModule c;
        private final RemoteActionCompatParcelizer f;
        private final Object h;

        public write(GeneratedAppGlideModule generatedAppGlideModule, RemoteActionCompatParcelizer remoteActionCompatParcelizer, GetCitySearchPresenter getCitySearchPresenter, Object obj) {
            this.c = generatedAppGlideModule;
            this.f = remoteActionCompatParcelizer;
            this.a = getCitySearchPresenter;
            this.h = obj;
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            Throwable th = (Throwable) obj;
            GeneratedAppGlideModule.a(this.c, this.f, this.a, this.h);
            return onCLickStatusNpwp.e;
        }

        @Override // o.GetIdentityPresenter
        public final void e(Throwable th) {
            GeneratedAppGlideModule.a(this.c, this.f, this.a, this.h);
        }
    }

    public GeneratedAppGlideModule(boolean z) {
        this._state = z ? Glide.c : Glide.a;
        this._parentHandle = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        return o.Glide.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final java.lang.Object a(java.lang.Object r9) {
        /*
            r8 = this;
        L_0x0000:
            r0 = r8
            java.lang.Object r0 = r0._state
            r10 = r0
            r0 = r10
            boolean r0 = r0 instanceof o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library
            if (r0 != 0) goto L_0x0045
            r0 = r10
            boolean r0 = r0 instanceof o.TxnTellerPresenter
            if (r0 == 0) goto L_0x0041
            r0 = r10
            boolean r0 = r0 instanceof o.GeneratedAppGlideModule.RemoteActionCompatParcelizer
            if (r0 == 0) goto L_0x0024
            r0 = r10
            o.GeneratedAppGlideModule$RemoteActionCompatParcelizer r0 = (o.GeneratedAppGlideModule.RemoteActionCompatParcelizer) r0
            int r0 = r0._isCompleting
            if (r0 != 0) goto L_0x0041
        L_0x0024:
            r0 = r8
            r1 = r10
            o.GetDaftarPekerjaanPresenter r2 = new o.GetDaftarPekerjaanPresenter
            r3 = r2
            r4 = r8
            r5 = r9
            java.lang.Throwable r4 = r4.b(r5)
            r5 = 0
            r6 = 2
            r3.<init>(r4, r5, r6)
            java.lang.Object r0 = r0.a(r1, r2)
            r10 = r0
            r0 = r10
            o.getScheme$com_github_ChuckerTeam_Chucker_library r1 = o.Glide.e()
            if (r0 == r1) goto L_0x0000
            r0 = r10
            return r0
        L_0x0041:
            o.getScheme$com_github_ChuckerTeam_Chucker_library r0 = o.Glide.a()
            return r0
        L_0x0045:
            r0 = r10
            o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library r0 = (o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) r0
            r1 = r8
            java.lang.Object r0 = r0.c(r1)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneratedAppGlideModule.a(java.lang.Object):java.lang.Object");
    }

    private final Object a(Object obj, Object obj2) {
        return !(obj instanceof TxnTellerPresenter) ? Glide.e : (((obj instanceof RescheduleReservationPresenter) || (obj instanceof VTandFAPresenter)) && !(obj instanceof GetCitySearchPresenter) && !(obj2 instanceof GetDaftarPekerjaanPresenter)) ? c((TxnTellerPresenter) obj, obj2) ? obj2 : Glide.b : d((TxnTellerPresenter) obj, obj2);
    }

    private final GetCitySearchPresenter a(TxnTellerPresenter txnTellerPresenter) {
        boolean z = txnTellerPresenter instanceof GetCitySearchPresenter;
        GetCitySearchPresenter getCitySearchPresenter = null;
        GetCitySearchPresenter getCitySearchPresenter2 = z ? (GetCitySearchPresenter) txnTellerPresenter : null;
        if (getCitySearchPresenter2 == null) {
            Registry$NoImageHeaderParserException e = txnTellerPresenter.e();
            if (e != null) {
                getCitySearchPresenter = d((getResponseHeaders$com_github_ChuckerTeam_Chucker_library) e);
            }
        } else {
            getCitySearchPresenter = getCitySearchPresenter2;
        }
        return getCitySearchPresenter;
    }

    public static final /* synthetic */ void a(GeneratedAppGlideModule generatedAppGlideModule, RemoteActionCompatParcelizer remoteActionCompatParcelizer, GetCitySearchPresenter getCitySearchPresenter, Object obj) {
        Object obj2;
        if (RateTransactionPresenter.c()) {
            while (true) {
                obj2 = generatedAppGlideModule._state;
                if (!(obj2 instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                    break;
                }
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj2).c(generatedAppGlideModule);
            }
            if (!(obj2 == remoteActionCompatParcelizer)) {
                throw new AssertionError();
            }
        }
        GetCitySearchPresenter d = d((getResponseHeaders$com_github_ChuckerTeam_Chucker_library) getCitySearchPresenter);
        if (d == null || !generatedAppGlideModule.a(remoteActionCompatParcelizer, d, obj)) {
            generatedAppGlideModule.e(generatedAppGlideModule.d(remoteActionCompatParcelizer, obj));
        }
    }

    private final void a(TxnTellerPresenter txnTellerPresenter, Object obj) {
        GetCustAcctListPresenter getCustAcctListPresenter = (GetCustAcctListPresenter) this._parentHandle;
        if (getCustAcctListPresenter != null) {
            getCustAcctListPresenter.a();
            this._parentHandle = Registry$MissingComponentException.a;
        }
        boolean z = obj instanceof GetDaftarPekerjaanPresenter;
        Throwable th = null;
        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = z ? (GetDaftarPekerjaanPresenter) obj : null;
        if (getDaftarPekerjaanPresenter != null) {
            th = getDaftarPekerjaanPresenter.a;
        }
        if (txnTellerPresenter instanceof VTandFAPresenter) {
            try {
                ((VTandFAPresenter) txnTellerPresenter).e(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(txnTellerPresenter);
                sb.append(" for ");
                sb.append(this);
                b((Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        } else {
            Registry$NoImageHeaderParserException e = txnTellerPresenter.e();
            if (e != null) {
                b(e, th);
            }
        }
    }

    private final boolean a(RemoteActionCompatParcelizer remoteActionCompatParcelizer, GetCitySearchPresenter getCitySearchPresenter, Object obj) {
        while (UpdateReceiverDataPresenter.read.d(getCitySearchPresenter.a, false, false, (GetIdentityPresenter) new write(this, remoteActionCompatParcelizer, getCitySearchPresenter, obj), 1, null) == Registry$MissingComponentException.a) {
            GetCitySearchPresenter d = d((getResponseHeaders$com_github_ChuckerTeam_Chucker_library) getCitySearchPresenter);
            getCitySearchPresenter = d;
            if (d == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable b(Object obj) {
        CancellationException cancellationException;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            cancellationException = th;
            if (th == null) {
                cancellationException = new JobCancellationException(c(), null, this);
            }
        } else if (obj != null) {
            cancellationException = ((hasAlpha) obj).i();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
        return cancellationException;
    }

    private final Registry$NoImageHeaderParserException b(TxnTellerPresenter txnTellerPresenter) {
        Object obj;
        Registry$NoImageHeaderParserException e = txnTellerPresenter.e();
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException = e;
        if (e == null) {
            if (txnTellerPresenter instanceof RescheduleReservationPresenter) {
                registry$NoImageHeaderParserException = new Registry$NoImageHeaderParserException();
            } else if (txnTellerPresenter instanceof VTandFAPresenter) {
                VTandFAPresenter vTandFAPresenter = (VTandFAPresenter) txnTellerPresenter;
                vTandFAPresenter.b(new Registry$NoImageHeaderParserException());
                while (true) {
                    obj = vTandFAPresenter._next;
                    if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                        break;
                    }
                    ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(vTandFAPresenter);
                }
                getResponseHeaders$com_github_ChuckerTeam_Chucker_library b = getRequestPayloadSize.b(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, vTandFAPresenter, b) && atomicReferenceFieldUpdater.get(this) == vTandFAPresenter) {
                }
                registry$NoImageHeaderParserException = null;
            } else {
                throw new IllegalStateException(subscribeReservationRescheduleEvent.b("State should have list: ", txnTellerPresenter).toString());
            }
        }
        return registry$NoImageHeaderParserException;
    }

    private final void b(Registry$NoImageHeaderParserException registry$NoImageHeaderParserException, Throwable th) {
        Object obj;
        CompletionHandlerException completionHandlerException;
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException2 = registry$NoImageHeaderParserException;
        while (true) {
            obj = registry$NoImageHeaderParserException2._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(registry$NoImageHeaderParserException2);
        }
        CompletionHandlerException completionHandlerException2 = null;
        for (getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) obj; !subscribeReservationRescheduleEvent.b(getresponseheaders_com_github_chuckerteam_chucker_library, registry$NoImageHeaderParserException2); getresponseheaders_com_github_chuckerteam_chucker_library = getresponseheaders_com_github_chuckerteam_chucker_library.h()) {
            completionHandlerException2 = completionHandlerException2;
            if (getresponseheaders_com_github_chuckerteam_chucker_library instanceof VTandFAPresenter) {
                VTandFAPresenter vTandFAPresenter = (VTandFAPresenter) getresponseheaders_com_github_chuckerteam_chucker_library;
                try {
                    vTandFAPresenter.e(th);
                    completionHandlerException2 = completionHandlerException2;
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException3 = completionHandlerException2;
                    if (completionHandlerException3 == null) {
                        completionHandlerException = null;
                    } else {
                        subscribeReservationRescheduleEvent.e(completionHandlerException3, "");
                        subscribeReservationRescheduleEvent.e(th2, "");
                        completionHandlerException = completionHandlerException3;
                        if (completionHandlerException3 != th2) {
                            clickOrangLain.c.a(completionHandlerException3, th2);
                            completionHandlerException = completionHandlerException3;
                        }
                    }
                    completionHandlerException2 = completionHandlerException2;
                    if (completionHandlerException == null) {
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(vTandFAPresenter);
                        sb.append(" for ");
                        sb.append(this);
                        completionHandlerException2 = new CompletionHandlerException(sb.toString(), th2);
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException4 = completionHandlerException2;
        if (completionHandlerException4 != null) {
            b((Throwable) completionHandlerException4);
        }
    }

    private final void b(VTandFAPresenter vTandFAPresenter) {
        Object obj;
        vTandFAPresenter.b(new Registry$NoImageHeaderParserException());
        while (true) {
            obj = vTandFAPresenter._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(vTandFAPresenter);
        }
        getResponseHeaders$com_github_ChuckerTeam_Chucker_library b = getRequestPayloadSize.b(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, vTandFAPresenter, b) && atomicReferenceFieldUpdater.get(this) == vTandFAPresenter) {
        }
    }

    private CancellationException c(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        JobCancellationException jobCancellationException = cancellationException;
        if (cancellationException == null) {
            String str2 = str;
            if (str == null) {
                str2 = c();
            }
            jobCancellationException = new JobCancellationException(str2, th, this);
        }
        return jobCancellationException;
    }

    private final void c(RescheduleReservationPresenter rescheduleReservationPresenter) {
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException = new Registry$NoImageHeaderParserException();
        UpdateDeleteDaftarPemilikSumberDanaPresenter updateDeleteDaftarPemilikSumberDanaPresenter = rescheduleReservationPresenter.e ? registry$NoImageHeaderParserException : new UpdateDeleteDaftarPemilikSumberDanaPresenter(registry$NoImageHeaderParserException);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, rescheduleReservationPresenter, updateDeleteDaftarPemilikSumberDanaPresenter) && atomicReferenceFieldUpdater.get(this) == rescheduleReservationPresenter) {
        }
    }

    private final boolean c(Object obj, Registry$NoImageHeaderParserException registry$NoImageHeaderParserException, VTandFAPresenter vTandFAPresenter) {
        boolean z;
        boolean z2;
        char c2;
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException2 = registry$NoImageHeaderParserException;
        VTandFAPresenter vTandFAPresenter2 = vTandFAPresenter;
        read read2 = new read(vTandFAPresenter2, this, obj);
        while (true) {
            getResponseHeaders$com_github_ChuckerTeam_Chucker_library a = registry$NoImageHeaderParserException2.a((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) null);
            getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library = a;
            if (a == null) {
                getresponseheaders_com_github_chuckerteam_chucker_library = getResponseHeaders$com_github_ChuckerTeam_Chucker_library.e((getResponseHeaders$com_github_ChuckerTeam_Chucker_library) registry$NoImageHeaderParserException2._prev);
            }
            getResponseHeaders$com_github_ChuckerTeam_Chucker_library.b.lazySet(vTandFAPresenter2, getresponseheaders_com_github_chuckerteam_chucker_library);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getResponseHeaders$com_github_ChuckerTeam_Chucker_library.e;
            atomicReferenceFieldUpdater.lazySet(vTandFAPresenter2, registry$NoImageHeaderParserException2);
            read2.a = registry$NoImageHeaderParserException2;
            while (true) {
                z = false;
                if (!atomicReferenceFieldUpdater.compareAndSet(getresponseheaders_com_github_chuckerteam_chucker_library, registry$NoImageHeaderParserException2, read2)) {
                    if (atomicReferenceFieldUpdater.get(getresponseheaders_com_github_chuckerteam_chucker_library) != registry$NoImageHeaderParserException2) {
                        z2 = false;
                        break;
                    }
                } else {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                c2 = 0;
            } else {
                Object obj2 = read2._consensus;
                Object obj3 = obj2;
                if (obj2 == getProtocol.c) {
                    obj3 = read2.b(read2.e(getresponseheaders_com_github_chuckerteam_chucker_library));
                }
                read2.e(getresponseheaders_com_github_chuckerteam_chucker_library, obj3);
                c2 = obj3 == null ? (char) 1 : 2;
            }
            if (c2 != 1) {
                if (c2 == 2) {
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    private final boolean c(TxnTellerPresenter txnTellerPresenter, Object obj) {
        if (RateTransactionPresenter.c()) {
            if (!((txnTellerPresenter instanceof RescheduleReservationPresenter) || (txnTellerPresenter instanceof VTandFAPresenter))) {
                throw new AssertionError();
            }
        }
        if (RateTransactionPresenter.c() && !(!(obj instanceof GetDaftarPekerjaanPresenter))) {
            throw new AssertionError();
        } else if (!InquiryEditDataORPresenter.e(c, this, txnTellerPresenter, Glide.a(obj))) {
            return false;
        } else {
            d(obj);
            a(txnTellerPresenter, obj);
            return true;
        }
    }

    private final Object d(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Object obj) {
        ArrayList arrayList;
        Throwable e;
        Object obj2;
        if (RateTransactionPresenter.c()) {
            while (true) {
                obj2 = this._state;
                if (!(obj2 instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                    break;
                }
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj2).c(this);
            }
            if (!(obj2 == remoteActionCompatParcelizer)) {
                throw new AssertionError();
            }
        }
        if (RateTransactionPresenter.c()) {
            if (!(!(remoteActionCompatParcelizer._exceptionsHolder == Glide.i))) {
                throw new AssertionError();
            }
        }
        if (!RateTransactionPresenter.c() || remoteActionCompatParcelizer._isCompleting != 0) {
            Throwable th = null;
            GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = obj instanceof GetDaftarPekerjaanPresenter ? (GetDaftarPekerjaanPresenter) obj : null;
            if (getDaftarPekerjaanPresenter != null) {
                th = getDaftarPekerjaanPresenter.a;
            }
            synchronized (remoteActionCompatParcelizer) {
                Throwable th2 = (Throwable) remoteActionCompatParcelizer._rootCause;
                Object obj3 = remoteActionCompatParcelizer._exceptionsHolder;
                if (obj3 == null) {
                    arrayList = new ArrayList(4);
                } else if (obj3 instanceof Throwable) {
                    arrayList = new ArrayList(4);
                    arrayList.add(obj3);
                } else if (obj3 instanceof ArrayList) {
                    arrayList = (ArrayList) obj3;
                } else {
                    throw new IllegalStateException(subscribeReservationRescheduleEvent.b("State is ", obj3).toString());
                }
                Throwable th3 = (Throwable) remoteActionCompatParcelizer._rootCause;
                if (th3 != null) {
                    arrayList.add(0, th3);
                }
                if (th != null && !subscribeReservationRescheduleEvent.b(th, th3)) {
                    arrayList.add(th);
                }
                remoteActionCompatParcelizer._exceptionsHolder = Glide.i;
                ArrayList arrayList2 = arrayList;
                e = e(remoteActionCompatParcelizer, arrayList2);
                if (e != null) {
                    e(e, arrayList2);
                }
            }
            Object obj4 = obj;
            if (e != null) {
                obj4 = obj;
                if (e != th) {
                    obj4 = new GetDaftarPekerjaanPresenter(e, false, 2);
                }
            }
            if (e != null) {
                if (d(e) || a(e)) {
                    if (obj4 != null) {
                        GetDaftarPekerjaanPresenter.b.compareAndSet((GetDaftarPekerjaanPresenter) obj4, 0, 1);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            d(obj4);
            boolean e2 = InquiryEditDataORPresenter.e(c, this, remoteActionCompatParcelizer, Glide.a(obj4));
            if (!RateTransactionPresenter.c() || e2) {
                a((TxnTellerPresenter) remoteActionCompatParcelizer, obj4);
                return obj4;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private final Object d(TxnTellerPresenter txnTellerPresenter, Object obj) {
        boolean z;
        Registry$NoImageHeaderParserException b = b(txnTellerPresenter);
        if (b == null) {
            return Glide.b;
        }
        Throwable th = null;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = txnTellerPresenter instanceof RemoteActionCompatParcelizer ? (RemoteActionCompatParcelizer) txnTellerPresenter : null;
        boolean z2 = false;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(b, false, null);
        }
        synchronized (remoteActionCompatParcelizer2) {
            if (remoteActionCompatParcelizer2._isCompleting != 0) {
                return Glide.e;
            }
            remoteActionCompatParcelizer2._isCompleting = 1;
            if (remoteActionCompatParcelizer2 != txnTellerPresenter) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, txnTellerPresenter, remoteActionCompatParcelizer2)) {
                        if (atomicReferenceFieldUpdater.get(this) != txnTellerPresenter) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return Glide.b;
                }
            }
            if (RateTransactionPresenter.c()) {
                if (!(!(remoteActionCompatParcelizer2._exceptionsHolder == Glide.i))) {
                    throw new AssertionError();
                }
            }
            if (((Throwable) remoteActionCompatParcelizer2._rootCause) != null) {
                z2 = true;
            }
            GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = obj instanceof GetDaftarPekerjaanPresenter ? (GetDaftarPekerjaanPresenter) obj : null;
            if (getDaftarPekerjaanPresenter != null) {
                remoteActionCompatParcelizer2.d(getDaftarPekerjaanPresenter.a);
            }
            th = (Throwable) remoteActionCompatParcelizer2._rootCause;
            if (!z2) {
            }
            onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
            if (th != null) {
                e(b, th);
            }
            GetCitySearchPresenter a = a(txnTellerPresenter);
            return (a == null || !a(remoteActionCompatParcelizer2, a, obj)) ? d(remoteActionCompatParcelizer2, obj) : Glide.d;
        }
    }

    private static GetCitySearchPresenter d(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
        getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library2;
        while (true) {
            getresponseheaders_com_github_chuckerteam_chucker_library2 = getresponseheaders_com_github_chuckerteam_chucker_library;
            if (getresponseheaders_com_github_chuckerteam_chucker_library.d()) {
                getResponseHeaders$com_github_ChuckerTeam_Chucker_library a = getresponseheaders_com_github_chuckerteam_chucker_library.a(null);
                getresponseheaders_com_github_chuckerteam_chucker_library = a == null ? getResponseHeaders$com_github_ChuckerTeam_Chucker_library.e((getResponseHeaders$com_github_ChuckerTeam_Chucker_library) getresponseheaders_com_github_chuckerteam_chucker_library._prev) : a;
            }
        }
        while (true) {
            Object obj = getresponseheaders_com_github_chuckerteam_chucker_library2._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                getResponseHeaders$com_github_ChuckerTeam_Chucker_library b = getRequestPayloadSize.b(obj);
                if (b.d()) {
                    getresponseheaders_com_github_chuckerteam_chucker_library2 = b;
                } else if (b instanceof GetCitySearchPresenter) {
                    return (GetCitySearchPresenter) b;
                } else {
                    getresponseheaders_com_github_chuckerteam_chucker_library2 = b;
                    if (b instanceof Registry$NoImageHeaderParserException) {
                        return null;
                    }
                }
            } else {
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(getresponseheaders_com_github_chuckerteam_chucker_library2);
            }
        }
    }

    private final boolean d(Throwable th) {
        if (m()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        GetCustAcctListPresenter getCustAcctListPresenter = (GetCustAcctListPresenter) this._parentHandle;
        if (getCustAcctListPresenter == null || getCustAcctListPresenter == Registry$MissingComponentException.a) {
            return z;
        }
        boolean z2 = true;
        if (!getCustAcctListPresenter.c(th)) {
            z2 = z;
        }
        return z2;
    }

    private final Throwable e(RemoteActionCompatParcelizer remoteActionCompatParcelizer, List<? extends Throwable> list) {
        Object obj;
        boolean z = true;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (((Throwable) remoteActionCompatParcelizer._rootCause) == null) {
                z = false;
            }
            if (z) {
                return new JobCancellationException(c(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                obj2 = it2.next();
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private static void e(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable d = !RateTransactionPresenter.b() ? th : getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.d(th);
            for (Throwable th2 : list) {
                Throwable th3 = th2;
                if (RateTransactionPresenter.b()) {
                    th3 = getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.d(th2);
                }
                if (th3 != th && th3 != d && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    subscribeReservationRescheduleEvent.e(th, "");
                    subscribeReservationRescheduleEvent.e(th3, "");
                    if (th != th3) {
                        clickOrangLain.c.a(th, th3);
                    }
                }
            }
        }
    }

    private final void e(Registry$NoImageHeaderParserException registry$NoImageHeaderParserException, Throwable th) {
        Object obj;
        CompletionHandlerException completionHandlerException;
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException2 = registry$NoImageHeaderParserException;
        while (true) {
            obj = registry$NoImageHeaderParserException2._next;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(registry$NoImageHeaderParserException2);
        }
        CompletionHandlerException completionHandlerException2 = null;
        for (getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) obj; !subscribeReservationRescheduleEvent.b(getresponseheaders_com_github_chuckerteam_chucker_library, registry$NoImageHeaderParserException2); getresponseheaders_com_github_chuckerteam_chucker_library = getresponseheaders_com_github_chuckerteam_chucker_library.h()) {
            completionHandlerException2 = completionHandlerException2;
            if (getresponseheaders_com_github_chuckerteam_chucker_library instanceof UpdateTxnTellerSetunDetailPresenter) {
                VTandFAPresenter vTandFAPresenter = (VTandFAPresenter) getresponseheaders_com_github_chuckerteam_chucker_library;
                try {
                    vTandFAPresenter.e(th);
                    completionHandlerException2 = completionHandlerException2;
                } catch (Throwable th2) {
                    CompletionHandlerException completionHandlerException3 = completionHandlerException2;
                    if (completionHandlerException3 == null) {
                        completionHandlerException = null;
                    } else {
                        subscribeReservationRescheduleEvent.e(completionHandlerException3, "");
                        subscribeReservationRescheduleEvent.e(th2, "");
                        completionHandlerException = completionHandlerException3;
                        if (completionHandlerException3 != th2) {
                            clickOrangLain.c.a(completionHandlerException3, th2);
                            completionHandlerException = completionHandlerException3;
                        }
                    }
                    completionHandlerException2 = completionHandlerException2;
                    if (completionHandlerException == null) {
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(vTandFAPresenter);
                        sb.append(" for ");
                        sb.append(this);
                        completionHandlerException2 = new CompletionHandlerException(sb.toString(), th2);
                    }
                }
            }
        }
        CompletionHandlerException completionHandlerException4 = completionHandlerException2;
        if (completionHandlerException4 != null) {
            b((Throwable) completionHandlerException4);
        }
        d(th);
    }

    private static String h(Object obj) {
        String str;
        if (obj instanceof RemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            if (((Throwable) remoteActionCompatParcelizer._rootCause) != null) {
                str = "Cancelling";
            } else {
                if (remoteActionCompatParcelizer._isCompleting != 0) {
                    str = "Completing";
                }
                str = "Active";
            }
        } else if (obj instanceof TxnTellerPresenter) {
            if (!((TxnTellerPresenter) obj).b()) {
                str = "New";
            }
            str = "Active";
        } else {
            str = obj instanceof GetDaftarPekerjaanPresenter ? "Cancelled" : "Completed";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0150 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final java.lang.Object i(java.lang.Object r9) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneratedAppGlideModule.i(java.lang.Object):java.lang.Object");
    }

    private boolean j(Object obj) {
        getScheme$com_github_ChuckerTeam_Chucker_library getscheme_com_github_chuckerteam_chucker_library = Glide.e;
        if (j()) {
            Object a = a(obj);
            getscheme_com_github_chuckerteam_chucker_library = a;
            if (a == Glide.d) {
                return true;
            }
        }
        Object obj2 = getscheme_com_github_chuckerteam_chucker_library;
        if (getscheme_com_github_chuckerteam_chucker_library == Glide.e) {
            obj2 = i(obj);
        }
        boolean z = true;
        if (obj2 != Glide.e) {
            z = true;
            if (obj2 != Glide.d) {
                if (obj2 == Glide.h) {
                    z = false;
                } else {
                    e(obj2);
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean o() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                return !(obj instanceof TxnTellerPresenter);
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
    }

    public boolean D_() {
        return true;
    }

    public String a() {
        return getClass().getSimpleName();
    }

    @Override // o.UpdateReceiverDataPresenter
    public final void a(CancellationException cancellationException) {
        JobCancellationException jobCancellationException = cancellationException;
        if (cancellationException == null) {
            jobCancellationException = new JobCancellationException(c(), null, this);
        }
        j(jobCancellationException);
    }

    protected boolean a(Throwable th) {
        return false;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, o.ProsesTarikanFragment_ViewBinding
    public final <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read2) {
        GeneratedAppGlideModule generatedAppGlideModule;
        GeneratedAppGlideModule generatedAppGlideModule2 = this;
        subscribeReservationRescheduleEvent.e(read2, "");
        if (subscribeReservationRescheduleEvent.b(generatedAppGlideModule2.d(), read2)) {
            subscribeReservationRescheduleEvent.c(generatedAppGlideModule2);
            generatedAppGlideModule = generatedAppGlideModule2;
        } else {
            generatedAppGlideModule = null;
        }
        return generatedAppGlideModule;
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        return ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(this, prosesTarikanFragment_ViewBinding);
    }

    public void b(Throwable th) {
        throw th;
    }

    @Override // o.GetCreditCardOptionsPresenter
    public final void b(hasAlpha hasalpha) {
        j(hasalpha);
    }

    public final Object c(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                Object a = a(obj2, obj);
                if (a == Glide.e) {
                    StringBuilder sb = new StringBuilder("Job ");
                    sb.append(this);
                    sb.append(" is already complete or completing, but is being completed with ");
                    sb.append(obj);
                    String obj3 = sb.toString();
                    boolean z = obj instanceof GetDaftarPekerjaanPresenter;
                    Throwable th = null;
                    GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = z ? (GetDaftarPekerjaanPresenter) obj : null;
                    if (getDaftarPekerjaanPresenter != null) {
                        th = getDaftarPekerjaanPresenter.a;
                    }
                    throw new IllegalStateException(obj3, th);
                } else if (a != Glide.b) {
                    return a;
                }
            } else {
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj2).c(this);
            }
        }
    }

    protected String c() {
        return "Job was cancelled";
    }

    @Override // o.UpdateReceiverDataPresenter
    public final GetCustAcctListPresenter d(GetCreditCardOptionsPresenter getCreditCardOptionsPresenter) {
        return (GetCustAcctListPresenter) UpdateReceiverDataPresenter.read.d(this, true, false, (GetIdentityPresenter) new GetCitySearchPresenter(getCreditCardOptionsPresenter), 2, null);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding.IconCompatParcelizer
    public final ProsesTarikanFragment_ViewBinding.read<?> d() {
        return UpdateReceiverDataPresenter.b;
    }

    protected void d(Object obj) {
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return (R) onclickinfo.invoke(r, this);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read2) {
        GeneratedAppGlideModule generatedAppGlideModule = this;
        subscribeReservationRescheduleEvent.e(read2, "");
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = generatedAppGlideModule;
        if (subscribeReservationRescheduleEvent.b(generatedAppGlideModule.d(), read2)) {
            prosesTarikanFragment_ViewBinding = ReviewSetoranFragment.e;
        }
        return prosesTarikanFragment_ViewBinding;
    }

    @Override // o.UpdateReceiverDataPresenter
    public final RescheduleReservationV2Presenter e(boolean z, boolean z2, T1TransaksiTarikanUbahFragment_ViewBinding<? super Throwable, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter;
        Throwable th;
        RescheduleReservationV2Presenter rescheduleReservationV2Presenter;
        VTandFAPresenter vTandFAPresenter;
        Throwable th2 = null;
        if (z) {
            UpdateTxnTellerSetunDetailPresenter updateTxnTellerSetunDetailPresenter = t1TransaksiTarikanUbahFragment_ViewBinding instanceof UpdateTxnTellerSetunDetailPresenter ? (UpdateTxnTellerSetunDetailPresenter) t1TransaksiTarikanUbahFragment_ViewBinding : null;
            UpdatePINPresenter updatePINPresenter = updateTxnTellerSetunDetailPresenter;
            if (updateTxnTellerSetunDetailPresenter == null) {
                updatePINPresenter = new UpdatePINPresenter(t1TransaksiTarikanUbahFragment_ViewBinding);
            }
            updateDeleteDaftarTransferPresenter = updatePINPresenter;
        } else {
            VTandFAPresenter vTandFAPresenter2 = t1TransaksiTarikanUbahFragment_ViewBinding instanceof VTandFAPresenter ? (VTandFAPresenter) t1TransaksiTarikanUbahFragment_ViewBinding : null;
            if (vTandFAPresenter2 != null) {
                vTandFAPresenter = vTandFAPresenter2;
                if (RateTransactionPresenter.c()) {
                    if (!(vTandFAPresenter2 instanceof UpdateTxnTellerSetunDetailPresenter)) {
                        vTandFAPresenter = vTandFAPresenter2;
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                vTandFAPresenter = null;
            }
            updateDeleteDaftarTransferPresenter = vTandFAPresenter;
            if (vTandFAPresenter == null) {
                updateDeleteDaftarTransferPresenter = new UpdateDeleteDaftarTransferPresenter(t1TransaksiTarikanUbahFragment_ViewBinding);
            }
        }
        updateDeleteDaftarTransferPresenter.d = this;
        while (true) {
            Object n = n();
            if (n instanceof RescheduleReservationPresenter) {
                RescheduleReservationPresenter rescheduleReservationPresenter = (RescheduleReservationPresenter) n;
                if (!rescheduleReservationPresenter.e) {
                    c(rescheduleReservationPresenter);
                } else if (InquiryEditDataORPresenter.e(c, this, n, updateDeleteDaftarTransferPresenter)) {
                    return updateDeleteDaftarTransferPresenter;
                }
            } else if (n instanceof TxnTellerPresenter) {
                Registry$NoImageHeaderParserException e = ((TxnTellerPresenter) n).e();
                if (e != null) {
                    RescheduleReservationV2Presenter rescheduleReservationV2Presenter2 = Registry$MissingComponentException.a;
                    if (!z || !(n instanceof RemoteActionCompatParcelizer)) {
                        th = null;
                        rescheduleReservationV2Presenter = rescheduleReservationV2Presenter2;
                    } else {
                        synchronized (n) {
                            th = (Throwable) ((RemoteActionCompatParcelizer) n)._rootCause;
                            if (th != null) {
                                rescheduleReservationV2Presenter = rescheduleReservationV2Presenter2;
                                if (t1TransaksiTarikanUbahFragment_ViewBinding instanceof GetCitySearchPresenter) {
                                    rescheduleReservationV2Presenter = rescheduleReservationV2Presenter2;
                                    if (((RemoteActionCompatParcelizer) n)._isCompleting != 0) {
                                    }
                                }
                                onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
                            }
                            if (c(n, e, updateDeleteDaftarTransferPresenter)) {
                                if (th == null) {
                                    return updateDeleteDaftarTransferPresenter;
                                }
                                rescheduleReservationV2Presenter = updateDeleteDaftarTransferPresenter;
                                onCLickStatusNpwp onclickstatusnpwp2 = onCLickStatusNpwp.e;
                            }
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            t1TransaksiTarikanUbahFragment_ViewBinding.a(th);
                        }
                        return rescheduleReservationV2Presenter;
                    } else if (c(n, e, updateDeleteDaftarTransferPresenter)) {
                        return updateDeleteDaftarTransferPresenter;
                    }
                } else if (n != null) {
                    b((VTandFAPresenter) n);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
            } else {
                if (z2) {
                    GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = n instanceof GetDaftarPekerjaanPresenter ? (GetDaftarPekerjaanPresenter) n : null;
                    if (getDaftarPekerjaanPresenter != null) {
                        th2 = getDaftarPekerjaanPresenter.a;
                    }
                    t1TransaksiTarikanUbahFragment_ViewBinding.a(th2);
                }
                return Registry$MissingComponentException.a;
            }
        }
    }

    protected void e(Object obj) {
    }

    protected final void e(UpdateReceiverDataPresenter updateReceiverDataPresenter) {
        if (RateTransactionPresenter.c()) {
            if (!(((GetCustAcctListPresenter) this._parentHandle) == null)) {
                throw new AssertionError();
            }
        }
        if (updateReceiverDataPresenter == null) {
            this._parentHandle = Registry$MissingComponentException.a;
            return;
        }
        updateReceiverDataPresenter.g();
        GetCustAcctListPresenter d = updateReceiverDataPresenter.d(this);
        this._parentHandle = d;
        if (o()) {
            d.a();
            this._parentHandle = Registry$MissingComponentException.a;
        }
    }

    @Override // o.UpdateReceiverDataPresenter
    public boolean e() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
        return (obj instanceof TxnTellerPresenter) && ((TxnTellerPresenter) obj).b();
    }

    public boolean e(Throwable th) {
        boolean z = true;
        if (th instanceof CancellationException) {
            return true;
        }
        if (!j(th) || !D_()) {
            z = false;
        }
        return z;
    }

    public final GetCustAcctListPresenter f() {
        return (GetCustAcctListPresenter) this._parentHandle;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[SYNTHETIC] */
    @Override // o.UpdateReceiverDataPresenter
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean g() {
        /*
            r5 = this;
        L_0x0000:
            r0 = r5
            java.lang.Object r0 = r0._state
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library
            if (r0 != 0) goto L_0x00b7
            r0 = r6
            boolean r0 = r0 instanceof o.RescheduleReservationPresenter
            r7 = r0
            r0 = -1
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x005c
            r0 = r6
            o.RescheduleReservationPresenter r0 = (o.RescheduleReservationPresenter) r0
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x00a5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.GeneratedAppGlideModule.c
            r9 = r0
            o.RescheduleReservationPresenter r0 = o.Glide.d()
            r10 = r0
        L_0x002b:
            r0 = r9
            r1 = r5
            r2 = r6
            r3 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            r11 = r0
            goto L_0x004a
        L_0x003d:
            r0 = r9
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            r1 = r6
            if (r0 == r1) goto L_0x002b
            r0 = 0
            r11 = r0
        L_0x004a:
            r0 = r11
            if (r0 != 0) goto L_0x0055
            r0 = r8
            r11 = r0
            goto L_0x00a8
        L_0x0055:
            r0 = r5
            r0.l()
            goto L_0x009f
        L_0x005c:
            r0 = r6
            boolean r0 = r0 instanceof o.UpdateDeleteDaftarPemilikSumberDanaPresenter
            if (r0 == 0) goto L_0x00a5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.GeneratedAppGlideModule.c
            r10 = r0
            r0 = r6
            o.UpdateDeleteDaftarPemilikSumberDanaPresenter r0 = (o.UpdateDeleteDaftarPemilikSumberDanaPresenter) r0
            o.Registry$NoImageHeaderParserException r0 = r0.e
            r9 = r0
        L_0x0071:
            r0 = r10
            r1 = r5
            r2 = r6
            r3 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 == 0) goto L_0x0083
            r0 = 1
            r11 = r0
            goto L_0x0090
        L_0x0083:
            r0 = r10
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            r1 = r6
            if (r0 == r1) goto L_0x0071
            r0 = 0
            r11 = r0
        L_0x0090:
            r0 = r11
            if (r0 != 0) goto L_0x009b
            r0 = r8
            r11 = r0
            goto L_0x00a8
        L_0x009b:
            r0 = r5
            r0.l()
        L_0x009f:
            r0 = 1
            r11 = r0
            goto L_0x00a8
        L_0x00a5:
            r0 = 0
            r11 = r0
        L_0x00a8:
            r0 = r11
            if (r0 == 0) goto L_0x00b5
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L_0x0000
            r0 = 1
            return r0
        L_0x00b5:
            r0 = 0
            return r0
        L_0x00b7:
            r0 = r6
            o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library r0 = (o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) r0
            r1 = r5
            java.lang.Object r0 = r0.c(r1)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GeneratedAppGlideModule.g():boolean");
    }

    @Override // o.UpdateReceiverDataPresenter
    public final CancellationException h() {
        Object obj;
        JobCancellationException jobCancellationException;
        while (true) {
            obj = this._state;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
        if (obj instanceof RemoteActionCompatParcelizer) {
            Throwable th = (Throwable) ((RemoteActionCompatParcelizer) obj)._rootCause;
            if (th != null) {
                jobCancellationException = c(th, subscribeReservationRescheduleEvent.b(getClass().getSimpleName(), " is cancelling"));
            } else {
                throw new IllegalStateException(subscribeReservationRescheduleEvent.b("Job is still new or active: ", this).toString());
            }
        } else if (!(obj instanceof TxnTellerPresenter)) {
            jobCancellationException = obj instanceof GetDaftarPekerjaanPresenter ? c(((GetDaftarPekerjaanPresenter) obj).a, (String) null) : new JobCancellationException(subscribeReservationRescheduleEvent.b(getClass().getSimpleName(), " has completed normally"), null, this);
        } else {
            throw new IllegalStateException(subscribeReservationRescheduleEvent.b("Job is still new or active: ", this).toString());
        }
        return jobCancellationException;
    }

    @Override // o.hasAlpha
    public final CancellationException i() {
        Object obj;
        Throwable th;
        while (true) {
            obj = this._state;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                break;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
        CancellationException cancellationException = null;
        if (obj instanceof RemoteActionCompatParcelizer) {
            th = (Throwable) ((RemoteActionCompatParcelizer) obj)._rootCause;
        } else if (obj instanceof GetDaftarPekerjaanPresenter) {
            th = ((GetDaftarPekerjaanPresenter) obj).a;
        } else if (!(obj instanceof TxnTellerPresenter)) {
            th = null;
        } else {
            throw new IllegalStateException(subscribeReservationRescheduleEvent.b("Cannot be cancelling child in this state: ", obj).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        JobCancellationException jobCancellationException = cancellationException;
        if (cancellationException == null) {
            jobCancellationException = new JobCancellationException(subscribeReservationRescheduleEvent.b("Parent job is ", h(obj)), th, this);
        }
        return jobCancellationException;
    }

    public boolean j() {
        return false;
    }

    protected void l() {
    }

    protected boolean m() {
        return false;
    }

    public final Object n() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library)) {
                return obj;
            }
            ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append('{');
        sb2.append(h(n()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
