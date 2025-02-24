package o;

import android.os.Parcelable;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaSessionCompat$QueueItem.class */
final class newImmutableList$MediaSessionCompat$QueueItem implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Character> {
    private newImmutableList$MediaSessionCompat$QueueItem() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$MediaSessionCompat$QueueItem(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(Character ch) {
        return new newImmutableList$MediaSessionCompat$Token(ch);
    }
}
