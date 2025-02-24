package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$noRekeningTeller.class */
public final class realmSet$noRekeningTeller extends getHmKecamatan implements realmSet$isInputAtmPemrek {
    public realmSet$noRekeningTeller(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void a(setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        e(4, c);
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<getNomorHp> b(String str, String str2, String str3) throws RemoteException {
        Parcel c = c();
        c.writeString(null);
        c.writeString(str2);
        c.writeString(str3);
        Parcel c2 = c(17, c);
        ArrayList createTypedArrayList = c2.createTypedArrayList(getNomorHp.CREATOR);
        c2.recycle();
        return createTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void b(Bundle bundle, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        getHmStayPeriod.d(c, setcreditcards);
        e(19, c);
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(getNomorHp getnomorhp) throws RemoteException {
        throw null;
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void b(realmGet.tipeNasabah tipenasabah, String str, String str2) throws RemoteException {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void b(setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        e(20, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final String c(setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        Parcel c2 = c(11, c);
        String readString = c2.readString();
        c2.recycle();
        return readString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void c(realmSet$tarikans realmset_tarikans, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, realmset_tarikans);
        getHmStayPeriod.d(c, setcreditcards);
        e(2, c);
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> d(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel c = c();
        c.writeString(null);
        c.writeString(str2);
        c.writeString(str3);
        getHmStayPeriod.d(c, z);
        Parcel c2 = c(15, c);
        ArrayList createTypedArrayList = c2.createTypedArrayList(realmSet$tarikans.CREATOR);
        c2.recycle();
        return createTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void d(realmGet.tipeNasabah tipenasabah, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, tipenasabah);
        getHmStayPeriod.d(c, setcreditcards);
        e(1, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void d(setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        e(18, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final List<getNomorHp> e(String str, String str2, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, setcreditcards);
        Parcel c2 = c(16, c);
        ArrayList createTypedArrayList = c2.createTypedArrayList(getNomorHp.CREATOR);
        c2.recycle();
        return createTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> e(String str, String str2, boolean z, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, z);
        getHmStayPeriod.d(c, setcreditcards);
        Parcel c2 = c(14, c);
        ArrayList createTypedArrayList = c2.createTypedArrayList(realmSet$tarikans.CREATOR);
        c2.recycle();
        return createTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final List<realmSet$tarikans> e(setCreditCards setcreditcards, boolean z) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        getHmStayPeriod.d(c, z);
        Parcel c2 = c(7, c);
        ArrayList createTypedArrayList = c2.createTypedArrayList(realmSet$tarikans.CREATOR);
        c2.recycle();
        return createTypedArrayList;
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final void e(long j, String str, String str2, String str3) throws RemoteException {
        Parcel c = c();
        c.writeLong(j);
        c.writeString(str);
        c.writeString(str2);
        c.writeString(str3);
        e(10, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void e(getNomorHp getnomorhp, setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, getnomorhp);
        getHmStayPeriod.d(c, setcreditcards);
        e(12, c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$isInputAtmPemrek
    public final void e(setCreditCards setcreditcards) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, setcreditcards);
        e(6, c);
    }

    @Override // o.realmSet$isInputAtmPemrek
    public final byte[] e(realmGet.tipeNasabah tipenasabah, String str) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, tipenasabah);
        c.writeString(str);
        Parcel c2 = c(9, c);
        byte[] createByteArray = c2.createByteArray();
        c2.recycle();
        return createByteArray;
    }
}
