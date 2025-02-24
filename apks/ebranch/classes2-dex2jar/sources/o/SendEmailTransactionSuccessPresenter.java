package o;
/* loaded from: classes2-dex2jar.jar:o/SendEmailTransactionSuccessPresenter.class */
public abstract class SendEmailTransactionSuccessPresenter extends InquiryLoadDataBTPresenter {
    public getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> b;
    boolean d;
    long h;

    public static long b(boolean z) {
        return z ? 4294967296L : 1;
    }

    protected long a() {
        getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = this.b;
        long j = Long.MAX_VALUE;
        if (getparsedresponseheaders_com_github_chuckerteam_chucker_library == null) {
            return Long.MAX_VALUE;
        }
        if (!(getparsedresponseheaders_com_github_chuckerteam_chucker_library.c == getparsedresponseheaders_com_github_chuckerteam_chucker_library.d)) {
            j = 0;
        }
        return j;
    }

    public final void c(boolean z) {
        long j = this.h - 4294967296L;
        this.h = j;
        if (j <= 0) {
            if (RateTransactionPresenter.c()) {
                if (!(this.h == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.d) {
                i();
            }
        }
    }

    protected boolean c() {
        getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = this.b;
        boolean z = true;
        if (!(getparsedresponseheaders_com_github_chuckerteam_chucker_library == null || getparsedresponseheaders_com_github_chuckerteam_chucker_library.c == getparsedresponseheaders_com_github_chuckerteam_chucker_library.d)) {
            z = false;
        }
        return z;
    }

    public final void e(boolean z) {
        this.h += z ? 4294967296L : 1;
        if (!z) {
            this.d = true;
        }
    }

    public final boolean f() {
        OcrPresenter<?> b;
        getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = this.b;
        if (getparsedresponseheaders_com_github_chuckerteam_chucker_library == null || (b = getparsedresponseheaders_com_github_chuckerteam_chucker_library.b()) == null) {
            return false;
        }
        b.run();
        return true;
    }

    public final boolean g() {
        return this.h >= 4294967296L;
    }

    public long h() {
        OcrPresenter<?> b;
        getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = this.b;
        boolean z = false;
        if (!(getparsedresponseheaders_com_github_chuckerteam_chucker_library == null || (b = getparsedresponseheaders_com_github_chuckerteam_chucker_library.b()) == null)) {
            b.run();
            z = true;
        }
        return !z ? Long.MAX_VALUE : 0;
    }

    protected void i() {
    }

    public final boolean j() {
        getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<OcrPresenter<?>> getparsedresponseheaders_com_github_chuckerteam_chucker_library = this.b;
        boolean z = true;
        if (!(getparsedresponseheaders_com_github_chuckerteam_chucker_library == null || getparsedresponseheaders_com_github_chuckerteam_chucker_library.c == getparsedresponseheaders_com_github_chuckerteam_chucker_library.d)) {
            z = false;
        }
        return z;
    }
}
