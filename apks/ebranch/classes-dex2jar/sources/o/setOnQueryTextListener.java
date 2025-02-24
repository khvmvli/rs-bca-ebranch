package o;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setOnQueryTextListener.class */
public class setOnQueryTextListener implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static setOnQueryTextListener a;
    private static setOnQueryTextListener b;
    private final View c;
    private int d;
    private int e;
    private boolean f;
    private final Runnable g = new Runnable() { // from class: o.setOnQueryTextListener.3
        @Override // java.lang.Runnable
        public void run() {
            setOnQueryTextListener.this.a(false);
        }
    };
    private final Runnable h = new Runnable() { // from class: o.setOnQueryTextListener.1
        @Override // java.lang.Runnable
        public void run() {
            setOnQueryTextListener.this.a();
        }
    };
    private final int i;
    private setOnQueryTextFocusChangeListener j;

    /* renamed from: o  reason: collision with root package name */
    private final CharSequence f253o;

    private setOnQueryTextListener(View view, CharSequence charSequence) {
        this.c = view;
        this.f253o = charSequence;
        this.i = dump.a(ViewConfiguration.get(view.getContext()));
        d();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private boolean b(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.e) <= this.i && Math.abs(y - this.d) <= this.i) {
            return false;
        }
        this.e = x;
        this.d = y;
        return true;
    }

    private void c() {
        this.c.postDelayed(this.g, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void d() {
        this.e = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
    }

    private void e() {
        this.c.removeCallbacks(this.g);
    }

    public static void e(View view, CharSequence charSequence) {
        setOnQueryTextListener setonquerytextlistener = a;
        if (setonquerytextlistener != null && setonquerytextlistener.c == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setOnQueryTextListener setonquerytextlistener2 = b;
            if (setonquerytextlistener2 != null && setonquerytextlistener2.c == view) {
                setonquerytextlistener2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new setOnQueryTextListener(view, charSequence);
    }

    private static void e(setOnQueryTextListener setonquerytextlistener) {
        setOnQueryTextListener setonquerytextlistener2 = a;
        if (setonquerytextlistener2 != null) {
            setonquerytextlistener2.e();
        }
        a = setonquerytextlistener;
        if (setonquerytextlistener != null) {
            setonquerytextlistener.c();
        }
    }

    void a() {
        if (b == this) {
            b = null;
            setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener = this.j;
            if (setonquerytextfocuschangelistener != null) {
                setonquerytextfocuschangelistener.c();
                this.j = null;
                d();
                this.c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (a == this) {
            e(null);
        }
        this.c.removeCallbacks(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x012c, code lost:
        if (((android.view.WindowManager.LayoutParams) r0).type != 2) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    void a(boolean r7) {
        /*
        // Method dump skipped, instructions count: 784
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnQueryTextListener.a(boolean):void");
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.f) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action != 10) {
                return false;
            }
            d();
            a();
            return false;
        } else if (!this.c.isEnabled() || this.j != null || !b(motionEvent)) {
            return false;
        } else {
            e(this);
            return false;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.e = view.getWidth() / 2;
        this.d = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
