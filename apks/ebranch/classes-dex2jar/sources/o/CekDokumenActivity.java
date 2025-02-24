package o;

import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:o/CekDokumenActivity.class */
public final /* synthetic */ class CekDokumenActivity implements Realm.Transaction {
    public final /* synthetic */ subscribeUbahVisaCardEvent e;

    public /* synthetic */ CekDokumenActivity(subscribeUbahVisaCardEvent subscribeubahvisacardevent) {
        this.e = subscribeubahvisacardevent;
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(Realm realm) {
        subscribeUbahVisaCardEvent.b(this.e, realm);
    }
}
