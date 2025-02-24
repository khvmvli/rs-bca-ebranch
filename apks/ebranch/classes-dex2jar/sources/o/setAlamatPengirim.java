package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setAlamatPengirim.class */
public final class setAlamatPengirim extends getBankTujuanCode implements IInterface {
    public setAlamatPengirim(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, boolean z) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(z ? 1 : 0);
        Parcel a = a(5, b);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final realmSet$noHpKontakPengirim b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, int i) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(i);
        Parcel a = a(2, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }

    public final realmSet$noHpKontakPengirim b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, boolean z, long j) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(z ? 1 : 0);
        b.writeLong(j);
        Parcel a = a(7, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }

    public final int c() throws RemoteException {
        Parcel a = a(6, b());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final realmSet$noHpKontakPengirim c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, int i) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(i);
        Parcel a = a(4, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }

    public final int d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, boolean z) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(z ? 1 : 0);
        Parcel a = a(3, b);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final realmSet$noHpKontakPengirim e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, int i, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2) throws RemoteException {
        Parcel b = b();
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim);
        b.writeString(str);
        b.writeInt(i);
        getBiayaTransfer.b(b, realmset_nohpkontakpengirim2);
        Parcel a = a(8, b);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }
}
