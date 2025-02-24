package o;

import android.os.Parcelable;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class */
final class newImmutableList$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<char[]> {
    private newImmutableList$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(char[] cArr) {
        return new newImmutableList$MediaBrowserCompat$SearchResultReceiver(cArr);
    }
}
