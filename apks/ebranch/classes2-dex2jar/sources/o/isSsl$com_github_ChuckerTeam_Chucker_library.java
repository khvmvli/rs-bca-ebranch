package o;

import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes2-dex2jar.jar:o/isSsl$com_github_ChuckerTeam_Chucker_library.class */
public class isSsl$com_github_ChuckerTeam_Chucker_library extends SubmitBankNotesPresenter {
    setError b;
    private final int d;
    private final String f;
    private final int g;
    private final long i;

    private isSsl$com_github_ChuckerTeam_Chucker_library(int i, int i2, long j, String str) {
        this.d = i;
        this.g = i2;
        this.i = j;
        this.f = str;
        this.b = new setError(this.d, this.g, this.i, this.f);
    }

    private isSsl$com_github_ChuckerTeam_Chucker_library(int i, int i2, String str) {
        this(i, i2, setRequestContentType.e, str);
    }

    public /* synthetic */ isSsl$com_github_ChuckerTeam_Chucker_library(int i, int i2, String str, int i3) {
        this(setRequestContentType.c, setRequestContentType.a, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        try {
            this.b.a(runnable, setRequestBody.e, false);
        } catch (RejectedExecutionException e) {
            RequestOTPPresenter.a.d(prosesTarikanFragment_ViewBinding, runnable);
        }
    }

    @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("[scheduler = ");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
