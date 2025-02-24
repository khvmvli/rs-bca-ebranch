package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.FullLifecycleObserverAdapter;
/* loaded from: classes-dex2jar.jar:o/FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver.class */
final class FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver {
    final int[] a;
    final String[] b;
    final FullLifecycleObserverAdapter.IconCompatParcelizer c;
    final Set<String> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver(FullLifecycleObserverAdapter.IconCompatParcelizer iconCompatParcelizer, int[] iArr, String[] strArr) {
        this.c = iconCompatParcelizer;
        this.a = iArr;
        this.b = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.e = Collections.unmodifiableSet(hashSet);
            return;
        }
        this.e = null;
    }
}
