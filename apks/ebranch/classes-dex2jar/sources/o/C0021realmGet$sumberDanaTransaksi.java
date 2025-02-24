package o;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* renamed from: o.realmGet$sumberDanaTransaksi */
/* loaded from: classes-dex2jar.jar:o/realmGet$sumberDanaTransaksi.class */
public final class C0021realmGet$sumberDanaTransaksi extends setFotoPribadi {
    public static final Parcelable.Creator<C0021realmGet$sumberDanaTransaksi> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$totalPembayaran
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            String str = null;
            IBinder iBinder = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                switch (SafeParcelReader.b(b)) {
                    case 1:
                        str = SafeParcelReader.b(parcel, b);
                        break;
                    case 2:
                        z = SafeParcelReader.j(parcel, b);
                        break;
                    case 3:
                        z2 = SafeParcelReader.j(parcel, b);
                        break;
                    case 4:
                        iBinder = SafeParcelReader.l(parcel, b);
                        break;
                    case 5:
                        z3 = SafeParcelReader.j(parcel, b);
                        break;
                    case 6:
                        z4 = SafeParcelReader.j(parcel, b);
                        break;
                    default:
                        SafeParcelReader.p(parcel, b);
                        break;
                }
            }
            SafeParcelReader.d(parcel, a);
            return new C0021realmGet$sumberDanaTransaksi(str, z, z2, iBinder, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C0021realmGet$sumberDanaTransaksi[i];
        }
    };
    private final boolean a;
    private final String b;
    private final boolean c;
    private final Context d;
    private final boolean e;
    private final boolean h;

    public C0021realmGet$sumberDanaTransaksi(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.b = str;
        this.a = z;
        this.e = z2;
        this.d = (Context) realmSet$jenisWarkatTransaksi.e(realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(iBinder));
        this.c = z3;
        this.h = z4;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [o.realmSet$noHpKontakPengirim, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 1, str, false);
        setHmAddress.b(parcel, 2, this.a);
        setHmAddress.b(parcel, 3, this.e);
        setHmAddress.b(parcel, 4, (IBinder) realmSet$jenisWarkatTransaksi.d(this.d), false);
        setHmAddress.b(parcel, 5, this.c);
        setHmAddress.b(parcel, 6, this.h);
        setHmAddress.e(parcel, b);
    }
}
