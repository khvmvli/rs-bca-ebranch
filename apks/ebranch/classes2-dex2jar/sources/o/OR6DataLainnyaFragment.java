package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/OR6DataLainnyaFragment.class */
final class OR6DataLainnyaFragment extends View.BaseSavedState {
    public static final Parcelable.Creator<OR6DataLainnyaFragment> CREATOR = new Parcelable.Creator<OR6DataLainnyaFragment>() { // from class: o.OR6DataLainnyaFragment.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OR6DataLainnyaFragment createFromParcel(Parcel parcel) {
            return new OR6DataLainnyaFragment(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OR6DataLainnyaFragment[] newArray(int i) {
            return new OR6DataLainnyaFragment[i];
        }
    };
    float b;

    private OR6DataLainnyaFragment(Parcel parcel) {
        super(parcel);
        this.b = parcel.readFloat();
    }

    /* synthetic */ OR6DataLainnyaFragment(Parcel parcel, byte b) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OR6DataLainnyaFragment(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        parcel.writeFloat(this.b);
    }
}
