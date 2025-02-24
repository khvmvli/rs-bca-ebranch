package o;

import o.ApplyCCPresenter;
/* loaded from: classes-dex2jar.jar:o/subscribeTransaksiUbahTellerEvent.class */
public abstract class subscribeTransaksiUbahTellerEvent extends subscribeTransaksiBatalTellerEvent implements ApplyCCPresenter {
    public subscribeTransaksiUbahTellerEvent() {
    }

    public subscribeTransaksiUbahTellerEvent(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
    public final Object a(Object obj) {
        return e((subscribeTransaksiUbahTellerEvent) obj);
    }

    @Override // o.TransaksiBerhasilFragment
    protected final AccountOpeningPresenter e() {
        return subscriberLoadDraftBankTransferEvent.b(this);
    }

    @Override // o.ApplyCCPresenter
    public final ApplyCCPresenter.write g() {
        return ((ApplyCCPresenter) h()).g();
    }
}
