package o;

import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaBrowserCompat$MediaItem.class */
final class newImmutableList$MediaBrowserCompat$MediaItem implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<byte[]> {
    private newImmutableList$MediaBrowserCompat$MediaItem() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$MediaBrowserCompat$MediaItem(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(byte[] bArr) {
        return new newImmutableList.MediaMetadataCompat(bArr);
    }
}
