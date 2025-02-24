package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaSessionCompat$ResultReceiverWrapper.class */
public final class newImmutableList$MediaSessionCompat$ResultReceiverWrapper extends newImmutableList.PlaybackStateCompat.CustomAction<Collection> {
    private static final d d = new ListUtil.ImmutableList() { // from class: o.newImmutableList$MediaSessionCompat$ResultReceiverWrapper.5
        @Override // o.d
        public final void a(Object obj, Parcel parcel) {
            parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
        }

        @Override // o.d
        public final Object e(Parcel parcel) {
            return ListUtil.OneItemImmutableList.a(parcel.readParcelable(newImmutableList$MediaSessionCompat$ResultReceiverWrapper.class.getClassLoader()));
        }
    };
    public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaSessionCompat$ResultReceiverWrapper$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements Parcelable.Creator<newImmutableList$MediaSessionCompat$ResultReceiverWrapper> {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ newImmutableList$MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel parcel) {
            return new newImmutableList$MediaSessionCompat$ResultReceiverWrapper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ newImmutableList$MediaSessionCompat$ResultReceiverWrapper[] newArray(int i) {
            return new newImmutableList$MediaSessionCompat$ResultReceiverWrapper[i];
        }
    }

    public newImmutableList$MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
    }

    public newImmutableList$MediaSessionCompat$ResultReceiverWrapper(Collection collection) {
        super(collection, d, (byte) 0);
    }

    @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
    public final /* bridge */ /* synthetic */ int describeContents() {
        return describeContents();
    }

    @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
    public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
    }
}
