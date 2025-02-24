package o;

import o.ProsesTarikanFragment_ViewBinding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver extends subscribeDraftTxnBerkalaEvent implements onClickInfo<ProsesTarikanFragment_ViewBinding, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ProsesTarikanFragment_ViewBinding> {
    public static final ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver e = new ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver();

    ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver() {
        super(2);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        ProsesSetoranFragment prosesSetoranFragment;
        ProsesSetoranFragment prosesSetoranFragment2;
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = (ProsesTarikanFragment_ViewBinding) obj;
        ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) obj2;
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        ProsesTarikanFragment_ViewBinding e2 = prosesTarikanFragment_ViewBinding.e(iconCompatParcelizer.d());
        if (e2 == ReviewSetoranFragment.e) {
            prosesSetoranFragment = iconCompatParcelizer;
        } else {
            ProsesORFragment prosesORFragment = (ProsesORFragment) e2.b(ProsesORFragment.e);
            if (prosesORFragment == null) {
                prosesSetoranFragment2 = new ProsesSetoranFragment(e2, iconCompatParcelizer);
            } else {
                ProsesTarikanFragment_ViewBinding e3 = e2.e(ProsesORFragment.e);
                prosesSetoranFragment2 = e3 == ReviewSetoranFragment.e ? new ProsesSetoranFragment(iconCompatParcelizer, prosesORFragment) : new ProsesSetoranFragment(new ProsesSetoranFragment(e3, iconCompatParcelizer), prosesORFragment);
            }
            prosesSetoranFragment = prosesSetoranFragment2;
        }
        return prosesSetoranFragment;
    }
}
