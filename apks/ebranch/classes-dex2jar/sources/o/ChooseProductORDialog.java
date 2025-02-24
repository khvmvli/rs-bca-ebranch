package o;

import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:o/ChooseProductORDialog.class */
public final /* synthetic */ class ChooseProductORDialog implements Realm.Transaction {
    public final /* synthetic */ subscribeUbahVisaCardEvent a;

    public /* synthetic */ ChooseProductORDialog(subscribeUbahVisaCardEvent subscribeubahvisacardevent) {
        this.a = subscribeubahvisacardevent;
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(Realm realm) {
        subscribeUbahVisaCardEvent.e(this.a, realm);
    }
}
