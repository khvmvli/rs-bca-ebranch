package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$ActivityResultRegistry$1.class */
public final class newImmutableList$ActivityResultRegistry$1 extends newImmutableList.PlaybackStateCompat.CustomAction<Integer> {
    private static final setLogger<Integer> b = new setLogger<Integer>() { // from class: o.newImmutableList$ActivityResultRegistry$1.4
        @Override // o.setLogger
        public final /* synthetic */ void c(Integer num, Parcel parcel) {
            parcel.writeInt(num.intValue());
        }

        @Override // o.setLogger
        public final /* synthetic */ Integer e(Parcel parcel) {
            return Integer.valueOf(parcel.readInt());
        }
    };
    public static final write CREATOR = new write((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ActivityResultRegistry$1$write.class */
    static final class write implements Parcelable.Creator<newImmutableList$ActivityResultRegistry$1> {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ newImmutableList$ActivityResultRegistry$1 createFromParcel(Parcel parcel) {
            return new newImmutableList$ActivityResultRegistry$1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ newImmutableList$ActivityResultRegistry$1[] newArray(int i) {
            return new newImmutableList$ActivityResultRegistry$1[i];
        }
    }

    public newImmutableList$ActivityResultRegistry$1(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) b, (byte) 0);
    }

    public newImmutableList$ActivityResultRegistry$1(Integer num) {
        super(num, b, (byte) 0);
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
