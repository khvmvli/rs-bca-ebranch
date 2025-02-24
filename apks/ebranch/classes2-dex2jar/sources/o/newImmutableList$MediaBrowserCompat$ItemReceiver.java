package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaBrowserCompat$ItemReceiver.class */
public final class newImmutableList$MediaBrowserCompat$ItemReceiver extends newImmutableList.PlaybackStateCompat.CustomAction<Byte> {
    private static final setLogger<Byte> b = new setLogger<Byte>() { // from class: o.newImmutableList$MediaBrowserCompat$ItemReceiver.4
        @Override // o.setLogger
        public final /* synthetic */ void c(Byte b2, Parcel parcel) {
            parcel.writeByte(b2.byteValue());
        }

        @Override // o.setLogger
        public final /* synthetic */ Byte e(Parcel parcel) {
            return Byte.valueOf(parcel.readByte());
        }
    };
    public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaBrowserCompat$ItemReceiver$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements Parcelable.Creator<newImmutableList$MediaBrowserCompat$ItemReceiver> {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ newImmutableList$MediaBrowserCompat$ItemReceiver createFromParcel(Parcel parcel) {
            return new newImmutableList$MediaBrowserCompat$ItemReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ newImmutableList$MediaBrowserCompat$ItemReceiver[] newArray(int i) {
            return new newImmutableList$MediaBrowserCompat$ItemReceiver[i];
        }
    }

    public newImmutableList$MediaBrowserCompat$ItemReceiver(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) b, (byte) 0);
    }

    public newImmutableList$MediaBrowserCompat$ItemReceiver(Byte b2) {
        super(b2, b, (byte) 0);
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
