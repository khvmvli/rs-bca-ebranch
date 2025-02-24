package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/getNamaBank.class */
public final class getNamaBank extends setFotoPribadi implements realmGet.oldCustFlag {
    public static final Parcelable.Creator<getNamaBank> CREATOR = new getKodeBank();
    private final String d;
    private final List e;

    public getNamaBank(List list, String str) {
        this.e = list;
        this.d = str;
    }

    public final Status e() {
        return this.d != null ? Status.e : Status.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.e;
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, list, false);
        setHmAddress.c(parcel, 2, this.d, false);
        setHmAddress.e(parcel, b);
    }
}
