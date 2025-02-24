package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver extends View.BaseSavedState {
    public static final Parcelable.Creator<setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.Creator<setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver>() { // from class: o.setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver createFromParcel(Parcel parcel) {
            return new setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver[] newArray(int i) {
            return new setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    };
    boolean a;
    int b;
    String c;
    String d;
    float e;
    int i;
    int j;

    private setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
        super(parcel);
        this.d = parcel.readString();
        this.e = parcel.readFloat();
        this.a = parcel.readInt() != 1 ? false : true;
        this.c = parcel.readString();
        this.j = parcel.readInt();
        this.i = parcel.readInt();
    }

    /* synthetic */ setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel, byte b) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnFocusChangeListener$MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.j);
        parcel.writeInt(this.i);
    }
}
