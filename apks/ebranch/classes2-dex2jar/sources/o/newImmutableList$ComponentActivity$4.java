package o;

import android.os.Parcelable;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$ComponentActivity$4.class */
final class newImmutableList$ComponentActivity$4 implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Integer> {
    private newImmutableList$ComponentActivity$4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$ComponentActivity$4(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(Integer num) {
        return new newImmutableList$ActivityResultRegistry$1(num);
    }
}
