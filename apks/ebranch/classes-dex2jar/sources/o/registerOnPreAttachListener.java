package o;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes-dex2jar.jar:o/registerOnPreAttachListener.class */
public final class registerOnPreAttachListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private ViewTreeObserver b;
    private final Runnable c;
    private final View e;

    private registerOnPreAttachListener(View view, Runnable runnable) {
        this.e = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    private void c() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.e.removeOnAttachStateChangeListener(this);
    }

    public static registerOnPreAttachListener e(View view, Runnable runnable) {
        if (view != null) {
            registerOnPreAttachListener registeronpreattachlistener = new registerOnPreAttachListener(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(registeronpreattachlistener);
            view.addOnAttachStateChangeListener(registeronpreattachlistener);
            return registeronpreattachlistener;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        c();
    }
}
