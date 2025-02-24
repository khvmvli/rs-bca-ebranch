package o;

import android.os.IBinder;
import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class */
final class newImmutableList$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<IBinder> {
    private newImmutableList$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ newImmutableList$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(byte b) {
        this();
    }

    @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
    public final /* synthetic */ Parcelable a(IBinder iBinder) {
        return new newImmutableList.ImmLeaksCleaner(iBinder);
    }
}
