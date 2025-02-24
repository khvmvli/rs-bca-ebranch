package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTextFuture$MediaBrowserCompat$CustomActionResultReceiver.class */
public class setTextFuture$MediaBrowserCompat$CustomActionResultReceiver extends View.BaseSavedState {
    public static final Parcelable.Creator<setTextFuture$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.Creator<setTextFuture$MediaBrowserCompat$CustomActionResultReceiver>() { // from class: o.setTextFuture$MediaBrowserCompat$CustomActionResultReceiver.5
        /* renamed from: b */
        public setTextFuture$MediaBrowserCompat$CustomActionResultReceiver[] newArray(int i) {
            return new setTextFuture$MediaBrowserCompat$CustomActionResultReceiver[i];
        }

        /* renamed from: d */
        public setTextFuture$MediaBrowserCompat$CustomActionResultReceiver createFromParcel(Parcel parcel) {
            return new setTextFuture$MediaBrowserCompat$CustomActionResultReceiver(parcel);
        }
    };
    boolean c;

    setTextFuture$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
        super(parcel);
        this.c = parcel.readByte() != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTextFuture$MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : 0);
    }
}
