package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* renamed from: o.realmSet$norekPenerima */
/* loaded from: classes-dex2jar.jar:o/realmSet$norekPenerima.class */
public final class C0026realmSet$norekPenerima extends setFotoPribadi implements realmGet$oldCustFlag {
    private final Status e;
    public static final C0026realmSet$norekPenerima d = new C0026realmSet$norekPenerima(Status.e);
    public static final Parcelable.Creator<C0026realmSet$norekPenerima> CREATOR = new setBankTujuanOfficeCode();

    public C0026realmSet$norekPenerima(Status status) {
        this.e = status;
    }

    @Override // o.realmGet$oldCustFlag
    public final Status e() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, (Parcelable) this.e, i, false);
        setHmAddress.e(parcel, b);
    }
}
