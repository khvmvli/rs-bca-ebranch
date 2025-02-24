package o;
/* loaded from: classes2-dex2jar.jar:o/ResetAccountPresenter.class */
public final class ResetAccountPresenter {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r11 != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final <T> void a(o.OcrPresenter<? super T> r4, o.ProsesTarikanFragment<? super T> r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ResetAccountPresenter.a(o.OcrPresenter, o.ProsesTarikanFragment, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(OcrPresenter<?> ocrPresenter) {
        boolean z;
        OcrPresenter<?> b;
        HttpTransaction httpTransaction = HttpTransaction.b;
        SendEmailTransactionSuccessPresenter d = HttpTransaction.d();
        if (d.h >= SendEmailTransactionSuccessPresenter.b(true)) {
            getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = d.b;
            getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library2 = getparsedresponseheaders_com_github_chuckerteam_chucker_library;
            if (getparsedresponseheaders_com_github_chuckerteam_chucker_library == null) {
                getparsedresponseheaders_com_github_chuckerteam_chucker_library2 = new getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<>();
                d.b = getparsedresponseheaders_com_github_chuckerteam_chucker_library2;
            }
            getparsedresponseheaders_com_github_chuckerteam_chucker_library2.d(ocrPresenter);
            return;
        }
        d.h += SendEmailTransactionSuccessPresenter.b(true);
        try {
            a(ocrPresenter, ocrPresenter.a(), true);
            do {
                getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library3 = d.b;
                if (getparsedresponseheaders_com_github_chuckerteam_chucker_library3 == null || (b = getparsedresponseheaders_com_github_chuckerteam_chucker_library3.b()) == null) {
                    z = false;
                } else {
                    b.run();
                    z = true;
                }
            } while (z);
        } finally {
            try {
            } finally {
            }
        }
    }
}
