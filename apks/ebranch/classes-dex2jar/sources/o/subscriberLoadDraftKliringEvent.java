package o;
/* loaded from: classes-dex2jar.jar:o/subscriberLoadDraftKliringEvent.class */
public final class subscriberLoadDraftKliringEvent {
    public static String b(TransaksiTundaFragment transaksiTundaFragment) {
        String obj = transaksiTundaFragment.getClass().getGenericInterfaces()[0].toString();
        String str = obj;
        if (obj.startsWith("kotlin.jvm.functions.")) {
            str = obj.substring(21);
        }
        return str;
    }
}
