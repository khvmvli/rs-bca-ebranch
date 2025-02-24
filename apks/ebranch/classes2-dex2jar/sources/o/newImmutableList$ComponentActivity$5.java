package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$ComponentActivity$5.class */
public final class newImmutableList$ComponentActivity$5 extends newImmutableList.PlaybackStateCompat.CustomAction<LinkedHashMap> {
    private static final ListUtil.TwoItemImmutableList d = new ListUtil.TwoItemImmutableList() { // from class: o.newImmutableList$ComponentActivity$5.4
        @Override // o.v
        public final Object a(Parcel parcel) {
            return ListUtil.OneItemImmutableList.a(parcel.readParcelable(newImmutableList.setPopupCallback.class.getClassLoader()));
        }

        @Override // o.v
        public final void a(Object obj, Parcel parcel) {
            parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
        }

        @Override // o.v
        public final Object c(Parcel parcel) {
            return ListUtil.OneItemImmutableList.a(parcel.readParcelable(newImmutableList.setPopupCallback.class.getClassLoader()));
        }

        @Override // o.v
        public final void e(Object obj, Parcel parcel) {
            parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
        }
    };
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ComponentActivity$5$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements Parcelable.Creator<newImmutableList$ComponentActivity$5> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ newImmutableList$ComponentActivity$5 createFromParcel(Parcel parcel) {
            return new newImmutableList$ComponentActivity$5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ newImmutableList$ComponentActivity$5[] newArray(int i) {
            return new newImmutableList$ComponentActivity$5[i];
        }
    }

    public newImmutableList$ComponentActivity$5(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
    }

    public newImmutableList$ComponentActivity$5(LinkedHashMap linkedHashMap) {
        super(linkedHashMap, d, (byte) 0);
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
