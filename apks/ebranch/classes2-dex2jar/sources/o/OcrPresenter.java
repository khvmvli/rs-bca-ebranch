package o;
/* loaded from: classes2-dex2jar.jar:o/OcrPresenter.class */
public abstract class OcrPresenter<T> extends setMethod {
    public int e;

    public OcrPresenter(int i) {
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(Object obj) {
        return obj;
    }

    public abstract ProsesTarikanFragment<T> a();

    public final void a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                subscribeReservationRescheduleEvent.e(th, "");
                subscribeReservationRescheduleEvent.e(th2, "");
                if (th != th2) {
                    clickOrangLain.c.a(th, th2);
                }
            }
            Throwable th3 = th;
            if (th == null) {
                th3 = th2;
            }
            StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String obj = sb.toString();
            subscribeReservationRescheduleEvent.c(th3);
            GetTxnTellerDetailPresenter.b(a().getContext(), new LoginFingerprintPresenter(obj, th3));
        }
    }

    public abstract Object b();

    public Throwable b(Object obj) {
        boolean z = obj instanceof GetDaftarPekerjaanPresenter;
        Throwable th = null;
        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = z ? (GetDaftarPekerjaanPresenter) obj : null;
        if (getDaftarPekerjaanPresenter != null) {
            th = getDaftarPekerjaanPresenter.a;
        }
        return th;
    }

    public void c(Object obj, Throwable th) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:2|(4:4|(1:6)(1:7)|8|(2:10|11))|12|73|13|(1:15)(1:16)|17|(5:19|20|(1:25)(1:24)|26|(12:28|30|(2:43|(1:45)(1:46))(5:34|(3:39|41|42)|40|41|42)|47|48|(3:50|(2:52|53)(2:54|55)|56)|58|75|59|60|63|64))|29|30|(1:32)|43|(0)(0)|47|48|(0)|58|75|59|60|63|64|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ae, code lost:
        if (r8 != false) goto L_0x01b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cf, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d1, code lost:
        r0 = o.Page6KLFragment.a;
        o.subscribeReservationRescheduleEvent.e(r14, "");
        r10 = o.Page6KLFragment.d(new o.Page6KLFragment.IconCompatParcelizer(r14));
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[Catch: all -> 0x01f6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0229, blocks: (B:13:0x0033, B:15:0x0064, B:50:0x018f, B:54:0x019d, B:58:0x01b1, B:59:0x01b8, B:17:0x0075, B:19:0x0091, B:28:0x00b4, B:32:0x00d1, B:34:0x00db, B:36:0x00fa, B:39:0x0105, B:40:0x0117, B:42:0x0120, B:45:0x0145, B:46:0x016c, B:47:0x0185), top: B:73:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c A[Catch: all -> 0x01f6, TRY_ENTER, TryCatch #2 {all -> 0x0229, blocks: (B:13:0x0033, B:15:0x0064, B:50:0x018f, B:54:0x019d, B:58:0x01b1, B:59:0x01b8, B:17:0x0075, B:19:0x0091, B:28:0x00b4, B:32:0x00d1, B:34:0x00db, B:36:0x00fa, B:39:0x0105, B:40:0x0117, B:42:0x0120, B:45:0x0145, B:46:0x016c, B:47:0x0185), top: B:73:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #2 {all -> 0x0229, blocks: (B:13:0x0033, B:15:0x0064, B:50:0x018f, B:54:0x019d, B:58:0x01b1, B:59:0x01b8, B:17:0x0075, B:19:0x0091, B:28:0x00b4, B:32:0x00d1, B:34:0x00db, B:36:0x00fa, B:39:0x0105, B:40:0x0117, B:42:0x0120, B:45:0x0145, B:46:0x016c, B:47:0x0185), top: B:73:0x0033 }] */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OcrPresenter.run():void");
    }
}
