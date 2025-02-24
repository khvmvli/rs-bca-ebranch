package o;
/* loaded from: classes-dex2jar.jar:o/subscriberLoadDraftBankTransferEvent.class */
public final class subscriberLoadDraftBankTransferEvent {
    private static final setEmptyView[] a;
    private static final subscriberLoadDraftKliringEvent b;

    static {
        subscriberLoadDraftKliringEvent subscriberloaddraftkliringevent;
        try {
            subscriberloaddraftkliringevent = (subscriberLoadDraftKliringEvent) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            subscriberloaddraftkliringevent = null;
        }
        subscriberLoadDraftKliringEvent subscriberloaddraftkliringevent2 = subscriberloaddraftkliringevent;
        if (subscriberloaddraftkliringevent == null) {
            subscriberloaddraftkliringevent2 = new subscriberLoadDraftKliringEvent();
        }
        b = subscriberloaddraftkliringevent2;
        a = new setEmptyView[0];
    }

    public static setEmptyView a(Class cls) {
        return new TarikanUbahInfoBiayaFragment_ViewBinding(cls);
    }

    public static String b(subscribeDraftTxnBerkalaEvent subscribedrafttxnberkalaevent) {
        return subscriberLoadDraftKliringEvent.b(subscribedrafttxnberkalaevent);
    }

    public static AdminFeesPresenter b(Class cls) {
        return new subscribeTransaksiBatalROEvent(cls, "");
    }

    public static ApplyCCPresenter b(subscribeTransaksiUbahTellerEvent subscribetransaksiubahtellerevent) {
        return subscribetransaksiubahtellerevent;
    }

    public static String c(TransaksiTundaFragment transaksiTundaFragment) {
        return subscriberLoadDraftKliringEvent.b(transaksiTundaFragment);
    }
}
