package o;

import android.os.Parcel;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaBrowserCompat$SearchResultReceiver.class */
public final class newImmutableList$MediaBrowserCompat$SearchResultReceiver extends newImmutableList.PlaybackStateCompat.CustomAction<char[]> {
    private static final e d = new e();
    public static final newImmutableList$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new newImmutableList$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

    public newImmutableList$MediaBrowserCompat$SearchResultReceiver(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
    }

    public newImmutableList$MediaBrowserCompat$SearchResultReceiver(char[] cArr) {
        super(cArr, d, (byte) 0);
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
