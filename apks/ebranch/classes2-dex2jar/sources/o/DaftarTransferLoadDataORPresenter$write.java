package o;
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferLoadDataORPresenter$write.class */
public final class DaftarTransferLoadDataORPresenter$write extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<setRegionPrefix, String> {
    final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaftarTransferLoadDataORPresenter$write(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    public final /* synthetic */ Object a(Object obj) {
        setRegionPrefix setregionprefix = (setRegionPrefix) obj;
        subscribeReservationRescheduleEvent.e(setregionprefix, "");
        return CheckOTPSessionPresenter.a(this.a, setregionprefix);
    }
}
