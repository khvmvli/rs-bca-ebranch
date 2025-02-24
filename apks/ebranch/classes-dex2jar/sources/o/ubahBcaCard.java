package o;

import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:o/ubahBcaCard.class */
public final /* synthetic */ class ubahBcaCard implements Realm.Transaction {
    public final /* synthetic */ subscribeUbahVisaCardEvent a;

    public /* synthetic */ ubahBcaCard(subscribeUbahVisaCardEvent subscribeubahvisacardevent) {
        this.a = subscribeubahvisacardevent;
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(Realm realm) {
        subscribeUbahVisaCardEvent.d(this.a, realm);
    }
}
