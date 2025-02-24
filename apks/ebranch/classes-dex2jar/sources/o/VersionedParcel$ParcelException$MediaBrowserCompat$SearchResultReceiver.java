package o;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.class */
final class VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver extends View.BaseSavedState {
    public static final Parcelable.Creator<VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver> CREATOR = new Parcelable.ClassLoaderCreator<VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver>() { // from class: o.VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT >= 24 ? new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(parcel, null) : new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return Build.VERSION.SDK_INT >= 24 ? new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(parcel, classLoader) : new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver[i];
        }
    };
    int a;
    Parcelable b;
    int d;

    VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(Parcel parcel) {
        super(parcel);
        this.d = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(null);
    }

    VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.d = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
