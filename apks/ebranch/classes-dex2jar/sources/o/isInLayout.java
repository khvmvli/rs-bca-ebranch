package o;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Iterator;
import o.performStop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/isInLayout.class */
public final class isInLayout extends performPictureInPictureModeChanged {
    private static final performStop.read j = new performStop.read() { // from class: o.isInLayout.4
        @Override // o.performStop.read
        public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
            return new isInLayout(true);
        }
    };
    final boolean d;
    final HashMap<String, Fragment> c = new HashMap<>();
    final HashMap<String, isInLayout> e = new HashMap<>();
    final HashMap<String, performPrimaryNavigationFragmentChanged> i = new HashMap<>();
    boolean b = false;
    private boolean h = false;
    boolean a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isInLayout(boolean z) {
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static isInLayout b(performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged) {
        return (isInLayout) new performStop(performprimarynavigationfragmentchanged, j).c(isInLayout.class);
    }

    @Override // o.performPictureInPictureModeChanged
    public final void a() {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Fragment fragment) {
        if (isDetached.a(3)) {
            StringBuilder sb = new StringBuilder("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        isInLayout isinlayout = this.e.get(fragment.mWho);
        if (isinlayout != null) {
            isinlayout.a();
            this.e.remove(fragment.mWho);
        }
        performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged = this.i.get(fragment.mWho);
        if (performprimarynavigationfragmentchanged != null) {
            performprimarynavigationfragmentchanged.e();
            this.i.remove(fragment.mWho);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Fragment fragment) {
        if (!this.a) {
            if ((this.c.remove(fragment.mWho) != null) && isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Updating retained Fragments: Removed ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        } else if (isDetached.a(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Fragment fragment) {
        if (this.a) {
            if (isDetached.a(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.c.containsKey(fragment.mWho)) {
            this.c.put(fragment.mWho, fragment);
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Updating retained Fragments: Added ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(Fragment fragment) {
        if (!this.c.containsKey(fragment.mWho)) {
            return true;
        }
        return this.d ? this.b : !this.h;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isInLayout isinlayout = (isInLayout) obj;
        if (!this.c.equals(isinlayout.c) || !this.e.equals(isinlayout.e) || !this.i.equals(isinlayout.i)) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.e.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.i.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
