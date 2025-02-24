package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getReferenceSalesCode.class */
public final class getReferenceSalesCode extends getHmKecamatan implements getPrevWorkPeriod {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getReferenceSalesCode(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // o.getPrevWorkPeriod
    public final void a(int i, String str, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim3) throws RemoteException {
        Parcel c = c();
        c.writeInt(5);
        c.writeString(str);
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim2);
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim3);
        e(33, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void a(long j) throws RemoteException {
        Parcel c = c();
        c.writeLong(j);
        e(14, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void a(Bundle bundle, getTotalSupplementCard gettotalsupplementcard, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        getHmStayPeriod.c(c, gettotalsupplementcard);
        c.writeLong(j);
        e(32, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void a(String str, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeLong(j);
        e(7, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void a(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(20, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void a(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeLong(j);
        e(29, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(long j) throws RemoteException {
        Parcel c = c();
        c.writeLong(j);
        e(43, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(Bundle bundle, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        c.writeLong(j);
        e(44, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(String str, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeLong(j);
        e(24, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(getSelectedCardOptions getselectedcardoptions) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, getselectedcardoptions);
        e(34, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(17, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(getTotalSupplementCard gettotalsupplementcard, int i) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        c.writeInt(i);
        e(38, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void b(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeLong(j);
        e(25, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(long j) throws RemoteException {
        Parcel c = c();
        c.writeLong(j);
        e(12, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(Bundle bundle, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        c.writeLong(j);
        e(8, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(String str, String str2, boolean z, getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, z);
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(5, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(getSelectedCardOptions getselectedcardoptions) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, getselectedcardoptions);
        e(35, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(16, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeLong(j);
        e(28, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void c(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, realmGet$bcaDebitCardType realmget_bcadebitcardtype, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        getHmStayPeriod.d(c, realmget_bcadebitcardtype);
        c.writeLong(j);
        e(1, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(Bundle bundle) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        e(42, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(Bundle bundle, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, bundle);
        c.writeLong(j);
        e(45, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(String str, String str2, Bundle bundle, getTotalSupplementCard gettotalsupplementcard, long j) throws RemoteException {
        throw null;
    }

    @Override // o.getPrevWorkPeriod
    public final void d(String str, String str2, getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(10, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(String str, String str2, realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, boolean z, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        getHmStayPeriod.d(c, z);
        c.writeLong(j);
        e(4, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(String str, getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(6, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(22, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeLong(j);
        e(30, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, Bundle bundle, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        getHmStayPeriod.d(c, bundle);
        c.writeLong(j);
        e(27, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, String str, String str2, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeString(str);
        c.writeString(str2);
        c.writeLong(j);
        e(15, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, getTotalSupplementCard gettotalsupplementcard, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        getHmStayPeriod.c(c, gettotalsupplementcard);
        c.writeLong(j);
        e(31, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void d(boolean z, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, z);
        c.writeLong(j);
        e(11, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(long j) throws RemoteException {
        throw null;
    }

    @Override // o.getPrevWorkPeriod
    public final void e(String str, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeLong(j);
        e(23, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, bundle);
        e(9, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        getHmStayPeriod.d(c, bundle);
        getHmStayPeriod.d(c, z);
        getHmStayPeriod.d(c, z2);
        c.writeLong(j);
        e(2, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(Map map) throws RemoteException {
        throw null;
    }

    @Override // o.getPrevWorkPeriod
    public final void e(getSelectedCardOptions getselectedcardoptions) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, getselectedcardoptions);
        e(36, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(19, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(realmGet$autodebetPercentage realmget_autodebetpercentage) throws RemoteException {
        throw null;
    }

    @Override // o.getPrevWorkPeriod
    public final void e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim, long j) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, realmset_nohpkontakpengirim);
        c.writeLong(j);
        e(26, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void e(boolean z) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.d(c, z);
        e(39, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void h(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        Parcel c = c();
        getHmStayPeriod.c(c, gettotalsupplementcard);
        e(21, c);
    }

    @Override // o.getPrevWorkPeriod
    public final void j(getTotalSupplementCard gettotalsupplementcard) throws RemoteException {
        throw null;
    }
}
