package o;

import android.view.ViewGroup;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver.class */
public abstract class setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<VH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public final setOnStartEnterTransitionListener.RemoteActionCompatParcelizer a = new setOnStartEnterTransitionListener.RemoteActionCompatParcelizer();
    boolean d = false;
    write c = write.ALLOW;

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver$write.class */
    public enum write {
        ALLOW,
        PREVENT_WHEN_EMPTY,
        PREVENT
    }

    public abstract VH a(ViewGroup viewGroup, int i);

    public final void a() {
        this.a.b();
    }

    public final void a(boolean z) {
        if (!this.a.c()) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final VH b(ViewGroup viewGroup, int i) {
        try {
            setDrawerShadow.b("RV CreateView");
            VH a = a(viewGroup, i);
            if (a.b.getParent() == null) {
                a.g = i;
                setDrawerShadow.e();
                return a;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            setDrawerShadow.e();
            throw th;
        }
    }

    public final void b(int i) {
        this.a.c(i, 1);
    }

    public abstract int c();

    public long c(int i) {
        return -1;
    }

    public void c(VH vh) {
    }

    public int d(int i) {
        return 0;
    }

    public final void e(int i) {
        this.a.d(i, 1, null);
    }

    public abstract void e(VH vh, int i);
}
