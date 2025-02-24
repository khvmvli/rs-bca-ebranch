package o;
/* loaded from: classes2-dex2jar.jar:o/getResponseImageData.class */
public class getResponseImageData<T> extends DetailTransactionPresenter<T> implements SumberDanaDataPemilikSetunFragment {
    public final ProsesTarikanFragment<T> e;

    /* JADX WARN: Multi-variable type inference failed */
    public getResponseImageData(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        super(prosesTarikanFragment_ViewBinding, true, true);
        this.e = prosesTarikanFragment;
    }

    @Override // o.DetailTransactionPresenter
    public void a(Object obj) {
        ProsesTarikanFragment<T> prosesTarikanFragment = this.e;
        prosesTarikanFragment.resumeWith(GetRatePresenter.b(obj, prosesTarikanFragment));
    }

    @Override // o.GeneratedAppGlideModule
    public void e(Object obj) {
        getRequestDateString$com_github_ChuckerTeam_Chucker_library.c(ReviewSetoranReservasiUbahFragment_ViewBinding.e(this.e), GetRatePresenter.b(obj, this.e), null);
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public final SumberDanaDataPemilikSetunFragment getCallerFrame() {
        ProsesTarikanFragment<T> prosesTarikanFragment = this.e;
        return prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment ? (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment : null;
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // o.GeneratedAppGlideModule
    public final boolean m() {
        return true;
    }
}
