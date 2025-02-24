package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/GetTxnBerkalaDetailPresenter.class */
public final class GetTxnBerkalaDetailPresenter {
    private static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0.equals("on") != false) goto L_0x006f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0.equals("") != false) goto L_0x006f;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = o.getStatus$com_github_ChuckerTeam_Chucker_library.e(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x006f
            r0 = r4
            int r0 = r0.hashCode()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x003a
            r0 = r5
            r1 = 3551(0xddf, float:4.976E-42)
            if (r0 == r1) goto L_0x002e
            r0 = r5
            r1 = 109935(0x1ad6f, float:1.54052E-40)
            if (r0 != r1) goto L_0x0046
            r0 = r4
            java.lang.String r1 = "off"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            r6 = r0
            goto L_0x0071
        L_0x002e:
            r0 = r4
            java.lang.String r1 = "on"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            goto L_0x006f
        L_0x003a:
            r0 = r4
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            goto L_0x006f
        L_0x0046:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = 39
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x006f:
            r0 = 1
            r6 = r0
        L_0x0071:
            r0 = r6
            o.GetTxnBerkalaDetailPresenter.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetTxnBerkalaDetailPresenter.m206clinit():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 != null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.String b(o.ProsesTarikanFragment_ViewBinding r4) {
        /*
            boolean r0 = o.RateTransactionPresenter.e()
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            r0 = r4
            o.InquiryBankByBICPresenter$RemoteActionCompatParcelizer r1 = o.InquiryBankByBICPresenter.d
            o.ProsesTarikanFragment_ViewBinding$read r1 = (o.ProsesTarikanFragment_ViewBinding.read) r1
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = r0.b(r1)
            o.InquiryBankByBICPresenter r0 = (o.InquiryBankByBICPresenter) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x001e
            r0 = 0
            return r0
        L_0x001e:
            r0 = r4
            o.KliringPresenter$RemoteActionCompatParcelizer r1 = o.KliringPresenter.e
            o.ProsesTarikanFragment_ViewBinding$read r1 = (o.ProsesTarikanFragment_ViewBinding.read) r1
            o.ProsesTarikanFragment_ViewBinding$IconCompatParcelizer r0 = r0.b(r1)
            o.KliringPresenter r0 = (o.KliringPresenter) r0
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003e
            r0 = r4
            java.lang.String r0 = r0.d
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            java.lang.String r0 = "coroutine"
            r4 = r0
        L_0x0041:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 35
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            long r1 = r1.a
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetTxnBerkalaDetailPresenter.b(o.ProsesTarikanFragment_ViewBinding):java.lang.String");
    }

    public static final InquiryLoadDataBTPresenter b() {
        return a ? populateUrl.d : GetCurrenciesBNPresenter.b;
    }

    public static final ProsesTarikanFragment_ViewBinding c(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        ProsesTarikanFragment_ViewBinding b = inquiryLoadDataSetunPresenter.b().b(prosesTarikanFragment_ViewBinding);
        ProsesTarikanFragment_ViewBinding b2 = RateTransactionPresenter.e() ? b.b(new InquiryBankByBICPresenter(RateTransactionPresenter.a().incrementAndGet())) : b;
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding2 = b2;
        if (b != ReservasiListChosenPresenter.d()) {
            prosesTarikanFragment_ViewBinding2 = b2;
            if (b.b(ProsesORFragment.e) == null) {
                prosesTarikanFragment_ViewBinding2 = b2.b(ReservasiListChosenPresenter.d());
            }
        }
        return prosesTarikanFragment_ViewBinding2;
    }

    public static final GlideException<?> e(ProsesTarikanFragment<?> prosesTarikanFragment, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Object obj) {
        GlideException<?> glideException;
        if (!(prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment)) {
            return null;
        }
        if (!(prosesTarikanFragment_ViewBinding.b((ProsesTarikanFragment_ViewBinding.read<ProsesTarikanFragment_ViewBinding.IconCompatParcelizer>) DefaultImageHeaderParser$Reader$EndOfFileException.d) != null)) {
            return null;
        }
        SumberDanaDataPemilikSetunFragment sumberDanaDataPemilikSetunFragment = (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment;
        while (true) {
            if (!(sumberDanaDataPemilikSetunFragment instanceof RegistrationPresenter)) {
                SumberDanaDataPemilikSetunFragment callerFrame = sumberDanaDataPemilikSetunFragment.getCallerFrame();
                if (callerFrame != null) {
                    sumberDanaDataPemilikSetunFragment = callerFrame;
                    if (callerFrame instanceof GlideException) {
                        glideException = (GlideException) callerFrame;
                        break;
                    }
                } else {
                    glideException = null;
                    break;
                }
            } else {
                glideException = null;
                break;
            }
        }
        if (glideException != null) {
            glideException.a = prosesTarikanFragment_ViewBinding;
            glideException.d = obj;
        }
        return glideException;
    }
}
