package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setButtonDrawable$MediaBrowserCompat$SearchResultReceiver.class */
final class setButtonDrawable$MediaBrowserCompat$SearchResultReceiver implements Parcelable {
    public static final Parcelable.Creator<setButtonDrawable$MediaBrowserCompat$SearchResultReceiver> CREATOR = new Parcelable.Creator<setButtonDrawable$MediaBrowserCompat$SearchResultReceiver>() { // from class: o.setButtonDrawable$MediaBrowserCompat$SearchResultReceiver.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ setButtonDrawable$MediaBrowserCompat$SearchResultReceiver createFromParcel(Parcel parcel) {
            return new setButtonDrawable$MediaBrowserCompat$SearchResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ setButtonDrawable$MediaBrowserCompat$SearchResultReceiver[] newArray(int i) {
            return new setButtonDrawable$MediaBrowserCompat$SearchResultReceiver[i];
        }
    };
    public int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setButtonDrawable$MediaBrowserCompat$SearchResultReceiver() {
    }

    setButtonDrawable$MediaBrowserCompat$SearchResultReceiver(Parcel parcel) {
        this.c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
    }
}
