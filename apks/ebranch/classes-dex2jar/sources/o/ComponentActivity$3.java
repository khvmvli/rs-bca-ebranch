package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/ComponentActivity$3.class */
public final class ComponentActivity$3 implements Parcelable {
    public static final Parcelable.Creator<ComponentActivity$3> CREATOR = new Parcelable.Creator<ComponentActivity$3>() { // from class: o.ComponentActivity$3.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComponentActivity$3 createFromParcel(Parcel parcel) {
            return new ComponentActivity$3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComponentActivity$3[] newArray(int i) {
            return new ComponentActivity$3[i];
        }
    };
    public final int b;
    public final Intent c;

    public ComponentActivity$3(int i, Intent intent) {
        this.b = i;
        this.c = intent;
    }

    ComponentActivity$3(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.b;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c == null ? 0 : 1);
        Intent intent = this.c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
