package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setNorekPengirim.class */
public final class setNorekPengirim extends getBankTujuanCode implements IInterface {
    public setNorekPengirim(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final realmSet$noHpKontakPengirim a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, int i, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(i);
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim2);
        Parcel a = a(3, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }

    public final realmSet$noHpKontakPengirim d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, int i, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(i);
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim2);
        Parcel a = a(2, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }
}
