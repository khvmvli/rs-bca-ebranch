package o;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmSet$accountNumber.class */
public final class realmSet$accountNumber extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$accountNumber> CREATOR = new Parcelable.Creator<realmSet$accountNumber>() { // from class: o.realmSet$accounttype
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$accountNumber createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            C0008getAccounttype getaccounttype = null;
            IBinder iBinder = null;
            PendingIntent pendingIntent = null;
            IBinder iBinder2 = null;
            IBinder iBinder3 = null;
            int i = 1;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                switch (SafeParcelReader.b(b)) {
                    case 1:
                        i = SafeParcelReader.k(parcel, b);
                        break;
                    case 2:
                        getaccounttype = (C0008getAccounttype) SafeParcelReader.b(parcel, b, C0008getAccounttype.CREATOR);
                        break;
                    case 3:
                        iBinder = SafeParcelReader.l(parcel, b);
                        break;
                    case 4:
                        pendingIntent = (PendingIntent) SafeParcelReader.b(parcel, b, PendingIntent.CREATOR);
                        break;
                    case 5:
                        iBinder2 = SafeParcelReader.l(parcel, b);
                        break;
                    case 6:
                        iBinder3 = SafeParcelReader.l(parcel, b);
                        break;
                    default:
                        SafeParcelReader.p(parcel, b);
                        break;
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$accountNumber(i, getaccounttype, iBinder, pendingIntent, iBinder2, iBinder3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$accountNumber[] newArray(int i) {
            return new realmSet$accountNumber[i];
        }
    };
    final realmSet$FlagKodeAutoCompletePenerima a;
    final int b;
    final realmSet$FlagValueTodayTransaksi c;
    final PendingIntent d;
    final C0008getAccounttype e;
    final setBankTujuanPenerima f;

    public realmSet$accountNumber(int i, C0008getAccounttype getaccounttype, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.b = i;
        this.e = getaccounttype;
        setBankTujuanPenerima setbanktujuanpenerima = null;
        this.c = iBinder == null ? null : realmSet$FlagUpdateDaftarTransferPenerima.e(iBinder);
        this.d = pendingIntent;
        this.a = iBinder2 == null ? null : realmSet$FlagPromoCode.b(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            setbanktujuanpenerima = queryLocalInterface instanceof setBankTujuanPenerima ? (setBankTujuanPenerima) queryLocalInterface : new setAlamatPenerima(iBinder3);
        }
        this.f = setbanktujuanpenerima;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.realmSet$FlagValueTodayTransaksi, android.os.IBinder] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.realmSet$accountNumber a(o.realmSet$FlagValueTodayTransaksi r9, o.setBankTujuanPenerima r10) {
        /*
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L_0x0008
            r0 = 0
            r11 = r0
        L_0x0008:
            o.realmSet$accountNumber r0 = new o.realmSet$accountNumber
            r1 = r0
            r2 = 2
            r3 = 0
            r4 = r9
            r5 = 0
            r6 = 0
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$accountNumber.a(o.realmSet$FlagValueTodayTransaksi, o.setBankTujuanPenerima):o.realmSet$accountNumber");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.realmSet$FlagKodeAutoCompletePenerima, android.os.IBinder] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.realmSet$accountNumber d(o.realmSet$FlagKodeAutoCompletePenerima r9, o.setBankTujuanPenerima r10) {
        /*
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L_0x0008
            r0 = 0
            r11 = r0
        L_0x0008:
            o.realmSet$accountNumber r0 = new o.realmSet$accountNumber
            r1 = r0
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r9
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$accountNumber.d(o.realmSet$FlagKodeAutoCompletePenerima, o.setBankTujuanPenerima):o.realmSet$accountNumber");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.b);
        setHmAddress.b(parcel, 2, (Parcelable) this.e, i, false);
        realmSet$FlagValueTodayTransaksi realmset_flagvaluetodaytransaksi = this.c;
        IBinder iBinder = null;
        setHmAddress.b(parcel, 3, realmset_flagvaluetodaytransaksi == null ? null : realmset_flagvaluetodaytransaksi.asBinder(), false);
        setHmAddress.b(parcel, 4, (Parcelable) this.d, i, false);
        realmSet$FlagKodeAutoCompletePenerima realmset_flagkodeautocompletepenerima = this.a;
        setHmAddress.b(parcel, 5, realmset_flagkodeautocompletepenerima == null ? null : realmset_flagkodeautocompletepenerima.asBinder(), false);
        setBankTujuanPenerima setbanktujuanpenerima = this.f;
        if (setbanktujuanpenerima != null) {
            iBinder = setbanktujuanpenerima.asBinder();
        }
        setHmAddress.b(parcel, 6, iBinder, false);
        setHmAddress.e(parcel, b);
    }
}
