package o;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setReligionValue.class */
public final class setReligionValue implements Parcelable.Creator {
    public static void a(setDebitCardType setdebitcardtype, Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, setdebitcardtype.d);
        setHmAddress.d(parcel, 2, setdebitcardtype.c);
        setHmAddress.d(parcel, 3, setdebitcardtype.e);
        setHmAddress.c(parcel, 4, setdebitcardtype.f, false);
        setHmAddress.b(parcel, 5, setdebitcardtype.g, false);
        setHmAddress.b(parcel, 6, (Parcelable[]) setdebitcardtype.j, i, false);
        setHmAddress.a(parcel, 7, setdebitcardtype.i, false);
        setHmAddress.b(parcel, 8, (Parcelable) setdebitcardtype.h, i, false);
        setHmAddress.b(parcel, 10, (Parcelable[]) setdebitcardtype.m, i, false);
        setHmAddress.b(parcel, 11, (Parcelable[]) setdebitcardtype.f217o, i, false);
        setHmAddress.b(parcel, 12, setdebitcardtype.k);
        setHmAddress.d(parcel, 13, setdebitcardtype.n);
        setHmAddress.b(parcel, 14, setdebitcardtype.l);
        setHmAddress.c(parcel, 15, setdebitcardtype.b(), false);
        setHmAddress.e(parcel, b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Scope[] scopeArr = setDebitCardType.a;
        Bundle bundle = new Bundle();
        realmGet$job[] realmget_jobArr = setDebitCardType.b;
        realmGet$job[] realmget_jobArr2 = realmget_jobArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b)) {
                case 1:
                    i = SafeParcelReader.k(parcel, b);
                    break;
                case 2:
                    i2 = SafeParcelReader.k(parcel, b);
                    break;
                case 3:
                    i3 = SafeParcelReader.k(parcel, b);
                    break;
                case 4:
                    str = SafeParcelReader.b(parcel, b);
                    break;
                case 5:
                    iBinder = SafeParcelReader.l(parcel, b);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.d(parcel, b, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.c(parcel, b);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.b(parcel, b, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.p(parcel, b);
                    break;
                case 10:
                    realmget_jobArr = (realmGet$job[]) SafeParcelReader.d(parcel, b, realmGet$job.CREATOR);
                    break;
                case 11:
                    realmget_jobArr2 = (realmGet$job[]) SafeParcelReader.d(parcel, b, realmGet$job.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.j(parcel, b);
                    break;
                case 13:
                    i4 = SafeParcelReader.k(parcel, b);
                    break;
                case 14:
                    z2 = SafeParcelReader.j(parcel, b);
                    break;
                case 15:
                    str2 = SafeParcelReader.b(parcel, b);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setDebitCardType(i, i2, i3, str, iBinder, scopeArr, bundle, account, realmget_jobArr, realmget_jobArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setDebitCardType[i];
    }
}
