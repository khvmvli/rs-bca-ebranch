package o;

import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2-dex2jar.jar:o/TujuanTransaksiDialog_ViewBinding.class */
public final /* synthetic */ class TujuanTransaksiDialog_ViewBinding implements realmSet$namaBank {
    private final String e;

    public TujuanTransaksiDialog_ViewBinding(String str) {
        this.e = str;
    }

    @Override // o.realmSet$namaBank
    public final setJatuhTempo a(Object obj) {
        return FirebaseMessaging.lambda$subscribeToTopic$6$FirebaseMessaging(this.e, (BN1NoATMFragment) obj);
    }
}
