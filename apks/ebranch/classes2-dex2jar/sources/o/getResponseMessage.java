package o;

import kotlin.KotlinNothingValueException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getResponseMessage.class */
public final class getResponseMessage extends Registry$NoModelLoaderAvailableException {
    private final String a;
    private final Throwable d;

    public getResponseMessage(Throwable th, String str) {
        this.d = th;
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final java.lang.Void a() {
        /*
            r5 = this;
            r0 = r5
            java.lang.Throwable r0 = r0.d
            if (r0 == 0) goto L_0x0032
            r0 = r5
            java.lang.String r0 = r0.a
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = ". "
            r1 = r6
            java.lang.String r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L_0x0020
        L_0x001d:
            java.lang.String r0 = ""
            r6 = r0
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Module with the Main dispatcher had failed to initialize"
            r3 = r6
            java.lang.String r2 = o.subscribeReservationRescheduleEvent.b(r2, r3)
            r3 = r5
            java.lang.Throwable r3 = r3.d
            r1.<init>(r2, r3)
            throw r0
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResponseMessage.a():java.lang.Void");
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final boolean b() {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final /* synthetic */ void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // o.Registry$NoModelLoaderAvailableException
    public final Registry$NoModelLoaderAvailableException e() {
        return this;
    }

    @Override // o.Registry$NoModelLoaderAvailableException, o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        Throwable th = this.d;
        sb.append(th != null ? subscribeReservationRescheduleEvent.b(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
