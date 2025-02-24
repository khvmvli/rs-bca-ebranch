package o;
/* loaded from: classes2-dex2jar.jar:o/getRequestDate.class */
public final class getRequestDate implements InquiryLoadDataSetunPresenter {
    private final ProsesTarikanFragment_ViewBinding e;

    public getRequestDate(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        this.e = prosesTarikanFragment_ViewBinding;
    }

    @Override // o.InquiryLoadDataSetunPresenter
    public final ProsesTarikanFragment_ViewBinding b() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
