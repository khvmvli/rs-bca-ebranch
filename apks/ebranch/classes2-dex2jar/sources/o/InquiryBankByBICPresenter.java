package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/InquiryBankByBICPresenter.class */
public final class InquiryBankByBICPresenter extends ProsesORFragment_ViewBinding implements Registry$NoSourceEncoderAvailableException<String> {
    public static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer((byte) 0);
    final long a;

    /* loaded from: classes2-dex2jar.jar:o/InquiryBankByBICPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements ProsesTarikanFragment_ViewBinding.read<InquiryBankByBICPresenter> {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public InquiryBankByBICPresenter(long j) {
        super(d);
        this.a = j;
    }

    @Override // o.Registry$NoSourceEncoderAvailableException
    public final /* synthetic */ void a(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, String str) {
        Thread.currentThread().setName(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r7 != null) goto L_0x0023;
     */
    @Override // o.Registry$NoSourceEncoderAvailableException
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final /* synthetic */ java.lang.String c(o.ProsesTarikanFragment_ViewBinding r7) {
        /*
            r6 = this;
            r0 = r7
            o.KliringPresenter$RemoteActionCompatParcelizer r1 = o.KliringPresenter.e
            o.ProsesTarikanFragment_ViewBinding$read r1 = (o.ProsesTarikanFragment_ViewBinding.read) r1
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = r0.b(r1)
            o.KliringPresenter r0 = (o.KliringPresenter) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0020
            r0 = r7
            java.lang.String r0 = r0.d
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            java.lang.String r0 = "coroutine"
            r7 = r0
        L_0x0023:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = " @"
            r2 = 0
            r3 = 0
            r4 = 6
            int r0 = o.CheckOTPSessionPresenter.c(r0, r1, r2, r3, r4)
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 >= 0) goto L_0x004a
            r0 = r9
            int r0 = r0.length()
            r11 = r0
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r7
            int r2 = r2.length()
            r3 = r11
            int r2 = r2 + r3
            r3 = 10
            int r2 = r2 + r3
            r1.<init>(r2)
            r12 = r0
            r0 = r9
            if (r0 == 0) goto L_0x00b1
            r0 = r9
            r1 = 0
            r2 = r11
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r13
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.d(r0, r1)
            r0 = r12
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = " @"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = 35
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            r1 = r6
            long r1 = r1.a
            java.lang.StringBuilder r0 = r0.append(r1)
            o.onCLickStatusNpwp r0 = o.onCLickStatusNpwp.e
            r7 = r0
            r0 = r12
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.d(r0, r1)
            r0 = r8
            r1 = r7
            r0.setName(r1)
            r0 = r9
            return r0
        L_0x00b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InquiryBankByBICPresenter.c(o.ProsesTarikanFragment_ViewBinding):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InquiryBankByBICPresenter) && this.a == ((InquiryBankByBICPresenter) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
