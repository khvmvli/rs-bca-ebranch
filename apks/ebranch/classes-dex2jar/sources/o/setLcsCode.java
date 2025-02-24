package o;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/setLcsCode.class */
public abstract class setLcsCode extends setPadding {
    private static boolean f;
    public static final write h = new write((byte) 0);

    /* loaded from: classes-dex2jar.jar:o/setLcsCode$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable kategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable = KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e;
        Context applicationContext = getApplicationContext();
        subscribeReservationRescheduleEvent.d(applicationContext, "");
        KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.e(applicationContext);
    }

    @Override // o.getView, android.app.Activity
    public void onPause() {
        onPause();
        f = false;
    }

    @Override // o.getView, android.app.Activity
    public void onResume() {
        onResume();
        f = true;
    }
}
