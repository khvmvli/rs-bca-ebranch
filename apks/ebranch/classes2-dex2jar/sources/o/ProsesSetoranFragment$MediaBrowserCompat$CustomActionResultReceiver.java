package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
final class ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver extends subscribeDraftTxnBerkalaEvent implements onClickInfo<String, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, String> {
    public static final ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver c = new ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver();

    ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver() {
        super(2);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) obj2;
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        if (str2.length() == 0) {
            str = iconCompatParcelizer.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(", ");
            sb.append(iconCompatParcelizer);
            str = sb.toString();
        }
        return str;
    }
}
