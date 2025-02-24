package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmGet$dollarCurrCode.class */
public final class realmGet$dollarCurrCode extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$dollarCurrCode> CREATOR = new Parcelable.Creator<realmGet$dollarCurrCode>() { // from class: o.realmGet$flagIB
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$dollarCurrCode createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            Intent intent = null;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                if (SafeParcelReader.b(b) != 1) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    intent = (Intent) SafeParcelReader.b(parcel, b, Intent.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$dollarCurrCode(intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$dollarCurrCode[] newArray(int i) {
            return new realmGet$dollarCurrCode[i];
        }
    };
    public Intent a;

    public realmGet$dollarCurrCode(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        Intent intent = this.a;
        if (intent != null) {
            parcel.writeInt(-65535);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            intent.writeToParcel(parcel, i);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        int dataPosition4 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition4 - dataPosition);
        parcel.setDataPosition(dataPosition4);
    }
}
