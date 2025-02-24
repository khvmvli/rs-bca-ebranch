package o;

import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaBrowserCompat$CustomActionResultReceiver.class */
final class newImmutableList$MediaBrowserCompat$CustomActionResultReceiver implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Boolean> {
    private newImmutableList$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(Boolean bool) {
        return new newImmutableList.write(bool.booleanValue());
    }
}
