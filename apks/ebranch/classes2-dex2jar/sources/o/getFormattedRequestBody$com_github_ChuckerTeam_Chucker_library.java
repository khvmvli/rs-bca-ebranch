package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* loaded from: classes2-dex2jar.jar:o/getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library.class */
public final class getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library extends formatBytes$com_github_ChuckerTeam_Chucker_library {
    private volatile getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library _immediate;
    private final boolean a;
    private final Handler b;
    private final getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library d;
    private final String g;

    private getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(Handler handler, String str, int i) {
        this(handler, null);
    }

    private getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(Handler handler, String str, boolean z) {
        super((byte) 0);
        this.b = handler;
        this.g = str;
        this.a = z;
        this._immediate = z ? this : null;
        getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library getformattedrequestbody_com_github_chuckerteam_chucker_library = this._immediate;
        getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library getformattedrequestbody_com_github_chuckerteam_chucker_library2 = getformattedrequestbody_com_github_chuckerteam_chucker_library;
        if (getformattedrequestbody_com_github_chuckerteam_chucker_library == null) {
            getformattedrequestbody_com_github_chuckerteam_chucker_library2 = new getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(handler, str, true);
            this._immediate = getformattedrequestbody_com_github_chuckerteam_chucker_library2;
            onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
        }
        this.d = getformattedrequestbody_com_github_chuckerteam_chucker_library2;
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final boolean b() {
        return !this.a || !subscribeReservationRescheduleEvent.b(Looper.myLooper(), this.b.getLooper());
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        if (!this.b.post(runnable)) {
            StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
            sb.append(this);
            sb.append("' was closed");
            VerifyOTPPresenter.d(prosesTarikanFragment_ViewBinding, new CancellationException(sb.toString()));
            ReservasiListChosenPresenter.a().d(prosesTarikanFragment_ViewBinding, runnable);
        }
    }

    @Override // o.Registry$NoModelLoaderAvailableException
    public final /* bridge */ /* synthetic */ Registry$NoModelLoaderAvailableException e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library) && ((getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // o.Registry$NoModelLoaderAvailableException, o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        String c = c();
        String str = c;
        if (c == null) {
            String str2 = this.g;
            String str3 = str2;
            if (str2 == null) {
                str3 = this.b.toString();
            }
            str = str3;
            if (this.a) {
                str = subscribeReservationRescheduleEvent.b(str3, ".immediate");
            }
        }
        return str;
    }
}
