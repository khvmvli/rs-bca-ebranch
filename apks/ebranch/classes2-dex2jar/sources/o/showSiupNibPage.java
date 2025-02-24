package o;
/* loaded from: classes2-dex2jar.jar:o/showSiupNibPage.class */
public abstract class showSiupNibPage extends SumberDanaDataPemilikSetunFragment_ViewBinding implements TransaksiTundaFragment<Object> {
    private final int arity;

    public showSiupNibPage(int i) {
        this(i, null);
    }

    public showSiupNibPage(int i, ProsesTarikanFragment<Object> prosesTarikanFragment) {
        super(prosesTarikanFragment);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding, java.lang.Object
    public String toString() {
        String str;
        if (getCompletion() == null) {
            str = subscriberLoadDraftBankTransferEvent.c((TransaksiTundaFragment) this);
            subscribeReservationRescheduleEvent.d(str, "");
        } else {
            str = toString();
        }
        return str;
    }
}
