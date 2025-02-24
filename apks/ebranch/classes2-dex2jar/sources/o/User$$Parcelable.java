package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/User$$Parcelable.class */
public final class User$$Parcelable extends setFotoPribadi implements realmGet.oldCustFlag {
    public static final Parcelable.Creator<User$$Parcelable> CREATOR = new Parcelable.Creator() { // from class: o.User$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            int i = 0;
            Intent intent = null;
            int i2 = 0;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 == 2) {
                    i2 = SafeParcelReader.k(parcel, b);
                } else if (b2 != 3) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    intent = (Intent) SafeParcelReader.b(parcel, b, Intent.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new User$$Parcelable(i, i2, intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new User$$Parcelable[i];
        }
    };
    private int a;
    final int b;
    private Intent c;

    public User$$Parcelable() {
        this(2, 0, null);
    }

    User$$Parcelable(int i, int i2, Intent intent) {
        this.b = i;
        this.a = i2;
        this.c = intent;
    }

    public final Status e() {
        return this.a == 0 ? Status.e : Status.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, i2);
        setHmAddress.d(parcel, 2, this.a);
        setHmAddress.b(parcel, 3, this.c, i, false);
        setHmAddress.e(parcel, b);
    }
}
