package o;
/* loaded from: classes2-dex2jar.jar:o/UpdateDeleteDaftarPemilikSumberDanaPresenter.class */
public final class UpdateDeleteDaftarPemilikSumberDanaPresenter implements TxnTellerPresenter {
    final Registry$NoImageHeaderParserException e;

    public UpdateDeleteDaftarPemilikSumberDanaPresenter(Registry$NoImageHeaderParserException registry$NoImageHeaderParserException) {
        this.e = registry$NoImageHeaderParserException;
    }

    @Override // o.TxnTellerPresenter
    public final boolean b() {
        return false;
    }

    @Override // o.TxnTellerPresenter
    public final Registry$NoImageHeaderParserException e() {
        return this.e;
    }

    public final String toString() {
        return RateTransactionPresenter.e() ? this.e.a("New") : toString();
    }
}
