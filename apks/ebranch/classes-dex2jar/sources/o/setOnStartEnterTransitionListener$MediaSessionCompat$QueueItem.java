package o;

import android.util.SparseArray;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem.class */
public class setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem {
    SparseArray<RemoteActionCompatParcelizer> c = new SparseArray<>();
    int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        final ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> d = new ArrayList<>();
        int b = 5;
        long e = 0;
        long a = 0;

        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i, long j, long j2) {
        long j3 = e(i).e;
        return j3 == 0 || j + j3 < j2;
    }

    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c.get(i);
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.d.isEmpty()) {
            return null;
        }
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = remoteActionCompatParcelizer.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!arrayList.get(size).a()) {
                return arrayList.remove(size);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteActionCompatParcelizer e(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c.get(i);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer();
            this.c.put(i, remoteActionCompatParcelizer2);
        }
        return remoteActionCompatParcelizer2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, long j) {
        RemoteActionCompatParcelizer e = e(i);
        long j2 = e.e;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        e.e = j;
    }

    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.g;
        ArrayList<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> arrayList = e(i).d;
        if (this.c.get(i).b > arrayList.size()) {
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.i();
            arrayList.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
    }
}
