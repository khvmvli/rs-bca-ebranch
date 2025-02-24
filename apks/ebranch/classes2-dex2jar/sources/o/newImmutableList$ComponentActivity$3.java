package o;

import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$ComponentActivity$3.class */
final class newImmutableList$ComponentActivity$3 implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Float> {
    private newImmutableList$ComponentActivity$3() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$ComponentActivity$3(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(Float f) {
        return new newImmutableList.PlaybackStateCompat(f);
    }
}
