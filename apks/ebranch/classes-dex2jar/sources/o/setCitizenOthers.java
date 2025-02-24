package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setCitizenOthers.class */
public final class setCitizenOthers implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        realmGet$jobValue realmget_jobvalue = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 == 2) {
                str = SafeParcelReader.b(parcel, b);
            } else if (b2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.b(parcel, b, PendingIntent.CREATOR);
            } else if (b2 != 4) {
                SafeParcelReader.p(parcel, b);
            } else {
                realmget_jobvalue = (realmGet$jobValue) SafeParcelReader.b(parcel, b, realmGet$jobValue.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new Status(i, str, pendingIntent, realmget_jobvalue);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
