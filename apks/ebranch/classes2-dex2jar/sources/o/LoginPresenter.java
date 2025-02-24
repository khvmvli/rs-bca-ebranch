package o;
/* loaded from: classes2-dex2jar.jar:o/LoginPresenter.class */
public final class LoginPresenter {
    public static final boolean c(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter) {
        UpdateReceiverDataPresenter updateReceiverDataPresenter = (UpdateReceiverDataPresenter) inquiryLoadDataSetunPresenter.b().b(UpdateReceiverDataPresenter.b);
        return updateReceiverDataPresenter == null ? true : updateReceiverDataPresenter.e();
    }

    public static final InquiryLoadDataSetunPresenter e(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding2 = prosesTarikanFragment_ViewBinding;
        if (prosesTarikanFragment_ViewBinding.b(UpdateReceiverDataPresenter.b) == null) {
            prosesTarikanFragment_ViewBinding2 = prosesTarikanFragment_ViewBinding.b(new UpdateTxnTellerKUDetailPresenter(null));
        }
        return new getRequestDate(prosesTarikanFragment_ViewBinding2);
    }
}
