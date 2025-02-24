package o;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/LifecycleCoroutineScopeImpl.class */
final class LifecycleCoroutineScopeImpl {
    final Set<LiveData> d = Collections.newSetFromMap(new IdentityHashMap());
    final onActivityStopped e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCoroutineScopeImpl(onActivityStopped onactivitystopped) {
        this.e = onactivitystopped;
    }
}
