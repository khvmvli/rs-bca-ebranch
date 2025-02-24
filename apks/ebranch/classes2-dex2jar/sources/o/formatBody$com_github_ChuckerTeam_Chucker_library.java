package o;
/* loaded from: classes2-dex2jar.jar:o/formatBody$com_github_ChuckerTeam_Chucker_library.class */
public final class formatBody$com_github_ChuckerTeam_Chucker_library extends InquiryLoadDataBTPresenter {
    public static final formatBody$com_github_ChuckerTeam_Chucker_library d = new formatBody$com_github_ChuckerTeam_Chucker_library();

    private formatBody$com_github_ChuckerTeam_Chucker_library() {
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final boolean b() {
        return false;
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        rewind rewind = (rewind) prosesTarikanFragment_ViewBinding.b(rewind.e);
        if (rewind != null) {
            rewind.c = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
