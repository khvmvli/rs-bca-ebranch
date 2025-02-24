package o;

import androidx.fragment.app.Fragment;
import o.performStop;
/* loaded from: classes-dex2jar.jar:o/onAttachFragment.class */
public final class onAttachFragment {
    public static final <VM extends performPictureInPictureModeChanged> onChooseValueSumberPenghasilan<VM> c(Fragment fragment, setEmptyView<VM> setemptyview, pilihNoRek<? extends performPrimaryNavigationFragmentChanged> pilihnorek, pilihNoRek<? extends performStop.read> pilihnorek2) {
        subscribeReservationRescheduleEvent.e(fragment, "");
        subscribeReservationRescheduleEvent.e(setemptyview, "");
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        onAttachFragment$MediaBrowserCompat$CustomActionResultReceiver onattachfragment_mediabrowsercompat_customactionresultreceiver = pilihnorek2;
        if (pilihnorek2 == null) {
            onattachfragment_mediabrowsercompat_customactionresultreceiver = new pilihNoRek<performStop.read>() { // from class: o.onAttachFragment$MediaBrowserCompat$CustomActionResultReceiver
                @Override // o.pilihNoRek
                public final /* synthetic */ performStop.read invoke() {
                    return Fragment.this.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new performResume(setemptyview, pilihnorek, onattachfragment_mediabrowsercompat_customactionresultreceiver);
    }
}
