package o;

import io.realm.RealmFieldTypeConstants;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$ReceiverName.class */
public final class realmGet$ReceiverName {
    final realmGet$TxnPurpose d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$ReceiverName(realmGet$TxnPurpose realmget_txnpurpose) {
        this.d = realmget_txnpurpose;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        boolean z = false;
        try {
            realmGet.alamatPengirim b = realmGet.jenisWarkatTransaksi.b(this.d.t_());
            if (b == null) {
                this.d.s_().i().b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (b.d("com.android.vending", (int) RealmFieldTypeConstants.LIST_OFFSET).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.d.s_().i().e("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
