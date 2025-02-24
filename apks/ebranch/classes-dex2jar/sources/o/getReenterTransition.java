package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.realm.internal.Property;
import java.util.ArrayList;
import java.util.List;
import o.getRetainInstance;
/* loaded from: classes-dex2jar.jar:o/getReenterTransition.class */
public abstract class getReenterTransition extends onDismiss {
    private static final Rect a = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final getRetainInstance.write<getChildFragmentManager> b = new getRetainInstance.write<getChildFragmentManager>() { // from class: o.getReenterTransition.4
        @Override // o.getRetainInstance.write
        public final /* bridge */ /* synthetic */ void b(getChildFragmentManager getchildfragmentmanager, Rect rect) {
            getchildfragmentmanager.b(rect);
        }
    };
    private static final getRetainInstance.RemoteActionCompatParcelizer<setTrackTintList<getChildFragmentManager>, getChildFragmentManager> f = new getRetainInstance.RemoteActionCompatParcelizer<setTrackTintList<getChildFragmentManager>, getChildFragmentManager>() { // from class: o.getReenterTransition.3
        @Override // o.getRetainInstance.RemoteActionCompatParcelizer
        public final /* synthetic */ int a(setTrackTintList<getChildFragmentManager> settracktintlist) {
            return settracktintlist.b();
        }

        @Override // o.getRetainInstance.RemoteActionCompatParcelizer
        public final /* synthetic */ getChildFragmentManager a(setTrackTintList<getChildFragmentManager> settracktintlist, int i) {
            return settracktintlist.e(i);
        }
    };
    private final AccessibilityManager g;
    private write i;
    private final View j;
    private final Rect m = new Rect();
    private final Rect l = new Rect();
    private final Rect k = new Rect();
    private final int[] h = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    /* loaded from: classes-dex2jar.jar:o/getReenterTransition$write.class */
    final class write extends getEnterAnim {
        write() {
        }

        @Override // o.getEnterAnim
        public final getChildFragmentManager a(int i) {
            return getChildFragmentManager.d(getReenterTransition.this.d(i));
        }

        @Override // o.getEnterAnim
        public final getChildFragmentManager d(int i) {
            int i2 = i == 2 ? getReenterTransition.this.c : getReenterTransition.this.d;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // o.getEnterAnim
        public final boolean d(int i, int i2, Bundle bundle) {
            return getReenterTransition.this.d(i, i2, bundle);
        }
    }

    public getReenterTransition(View view) {
        if (view != null) {
            this.j = view;
            this.g = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (findFragmentByWho.l(view) == 0) {
                findFragmentByWho.j(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private getChildFragmentManager a(int i) {
        getChildFragmentManager b2 = getChildFragmentManager.b();
        b2.h(true);
        b2.j(true);
        b2.b("android.view.View");
        Rect rect = a;
        b2.d(rect);
        b2.a(rect);
        b2.b(this.j);
        e(i, b2);
        if (b2.g() == null && b2.h() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b2.b(this.l);
        if (!this.l.equals(rect)) {
            int e = b2.e();
            if ((e & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((e & Property.TYPE_ARRAY) == 0) {
                b2.f(this.j.getContext().getPackageName());
                b2.a(this.j, i);
                if (this.c == i) {
                    b2.b(true);
                    b2.e(Property.TYPE_ARRAY);
                } else {
                    b2.b(false);
                    b2.e(64);
                }
                boolean z = this.d == i;
                if (z) {
                    b2.e(2);
                } else if (b2.s()) {
                    b2.e(1);
                }
                b2.f(z);
                this.j.getLocationOnScreen(this.h);
                b2.c(this.m);
                if (this.m.equals(rect)) {
                    b2.b(this.m);
                    if (b2.b != -1) {
                        getChildFragmentManager b3 = getChildFragmentManager.b();
                        for (int i2 = b2.b; i2 != -1; i2 = b3.b) {
                            b3.d(this.j, -1);
                            b3.d(a);
                            e(i2, b3);
                            b3.b(this.l);
                            this.m.offset(this.l.left, this.l.top);
                        }
                        b3.v();
                    }
                    this.m.offset(this.h[0] - this.j.getScrollX(), this.h[1] - this.j.getScrollY());
                }
                if (this.j.getLocalVisibleRect(this.k)) {
                    this.k.offset(this.h[0] - this.j.getScrollX(), this.h[1] - this.j.getScrollY());
                    if (this.m.intersect(this.k)) {
                        b2.a(this.m);
                        if (a(this.m)) {
                            b2.q(true);
                        }
                    }
                }
                return b2;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private boolean a(Rect rect) {
        boolean z = false;
        if (rect != null) {
            if (rect.isEmpty()) {
                z = false;
            } else if (this.j.getWindowVisibility() != 0) {
                return false;
            } else {
                ViewParent parent = this.j.getParent();
                while (parent instanceof View) {
                    View view = (View) parent;
                    if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                        return false;
                    }
                    parent = view.getParent();
                }
                z = false;
                if (parent != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    private getChildFragmentManager b() {
        getChildFragmentManager d = getChildFragmentManager.d(this.j);
        findFragmentByWho.c(this.j, d);
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        if (d.a() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.b(this.j, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private boolean b(int i) {
        int i2;
        if ((!this.j.isFocused() && !this.j.requestFocus()) || (i2 = this.d) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.d = Integer.MIN_VALUE;
            b(i2, false);
            d(i2, 8);
        }
        this.d = i;
        b(i, true);
        d(i, 8);
        return true;
    }

    private boolean c(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.j.invalidate();
        d(i, 65536);
        return true;
    }

    private boolean d(int i, Rect rect) {
        getChildFragmentManager getchildfragmentmanager;
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        setTrackTintList settracktintlist = new setTrackTintList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            settracktintlist.c(i2, a(i2));
        }
        int i3 = this.d;
        int i4 = Integer.MIN_VALUE;
        getChildFragmentManager getchildfragmentmanager2 = i3 == Integer.MIN_VALUE ? null : (getChildFragmentManager) settracktintlist.b(i3);
        if (i == 1 || i == 2) {
            getchildfragmentmanager = (getChildFragmentManager) getRetainInstance.b(settracktintlist, f, b, getchildfragmentmanager2, i, findFragmentByWho.k(this.j) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i5 = this.d;
            if (i5 != Integer.MIN_VALUE) {
                d(i5).b(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.j;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            getchildfragmentmanager = (getChildFragmentManager) getRetainInstance.b(settracktintlist, f, b, getchildfragmentmanager2, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (getchildfragmentmanager != null) {
            i4 = settracktintlist.c(settracktintlist.e((setTrackTintList) getchildfragmentmanager));
        }
        return b(i4);
    }

    private AccessibilityEvent e(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            getChildFragmentManager b2 = i == -1 ? b() : a(i);
            obtain.getText().add(b2.g());
            obtain.setContentDescription(b2.h());
            obtain.setScrollable(b2.r());
            obtain.setPassword(b2.q());
            obtain.setEnabled(b2.n());
            obtain.setChecked(b2.m());
            a(i, obtain);
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(b2.c());
                getDefaultViewModelProviderFactory.c(obtain, this.j, i);
                obtain.setPackageName(this.j.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.j.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    private void e(int i) {
        int i2 = this.e;
        if (i2 != i) {
            this.e = i;
            d(i, Property.TYPE_ARRAY);
            d(i2, Property.TYPE_SET);
        }
    }

    protected void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean a(KeyEvent keyEvent) {
        boolean z;
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount();
                                z = false;
                                while (i < repeatCount + 1 && d(i2, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.d;
                    z = true;
                    if (i3 != Integer.MIN_VALUE) {
                        c(i3, 16);
                        z = true;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = d(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                z = d(1, (Rect) null);
            }
            return z;
        }
        z = false;
        return z;
    }

    protected void b(int i, boolean z) {
    }

    @Override // o.onDismiss
    public void b(View view, getChildFragmentManager getchildfragmentmanager) {
        b(view, getchildfragmentmanager);
        c(getchildfragmentmanager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean b(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = r4
            android.view.accessibility.AccessibilityManager r0 = r0.g
            boolean r0 = r0.isEnabled()
            r6 = r0
            r0 = 1
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0069
            r0 = r4
            android.view.accessibility.AccessibilityManager r0 = r0.g
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L_0x001b
            goto L_0x0069
        L_0x001b:
            r0 = r5
            int r0 = r0.getAction()
            r8 = r0
            r0 = r8
            r1 = 7
            if (r0 == r1) goto L_0x004b
            r0 = r8
            r1 = 9
            if (r0 == r1) goto L_0x004b
            r0 = r8
            r1 = 10
            if (r0 == r1) goto L_0x0038
            r0 = 0
            return r0
        L_0x0038:
            r0 = r4
            int r0 = r0.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0049
            r0 = r4
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.e(r1)
            r0 = 1
            return r0
        L_0x0049:
            r0 = 0
            return r0
        L_0x004b:
            r0 = r4
            r1 = r5
            float r1 = r1.getX()
            r2 = r5
            float r2 = r2.getY()
            int r0 = r0.e(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r8
            r0.e(r1)
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r0 = 0
            r7 = r0
        L_0x006b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getReenterTransition.b(android.view.MotionEvent):boolean");
    }

    @Override // o.onDismiss
    public getEnterAnim c(View view) {
        if (this.i == null) {
            this.i = new write();
        }
        return this.i;
    }

    public final void c() {
        ViewParent parent;
        if (this.g.isEnabled() && (parent = this.j.getParent()) != null) {
            AccessibilityEvent e = e(-1, 2048);
            getActivity.c(e, 1);
            restoreViewState.a(parent, this.j, e);
        }
    }

    @Override // o.onDismiss
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        c(view, accessibilityEvent);
    }

    protected void c(getChildFragmentManager getchildfragmentmanager) {
    }

    public final void c(boolean z, int i, Rect rect) {
        int i2 = this.d;
        if (i2 != Integer.MIN_VALUE) {
            this.d = Integer.MIN_VALUE;
            b(i2, false);
            d(i2, 8);
        }
        if (z) {
            d(i, rect);
        }
    }

    protected abstract boolean c(int i, int i2);

    final getChildFragmentManager d(int i) {
        return i == -1 ? b() : a(i);
    }

    public final boolean d(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.g.isEnabled() || (parent = this.j.getParent()) == null) {
            return false;
        }
        return restoreViewState.a(parent, this.j, e(i, i2));
    }

    final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        if (i == -1) {
            return findFragmentByWho.c(this.j, i2, bundle);
        }
        boolean z = false;
        if (i2 == 1) {
            z = b(i);
        } else if (i2 != 2) {
            if (i2 != 64) {
                return i2 != 128 ? c(i, i2) : c(i);
            }
            if (!this.g.isEnabled() || !this.g.isTouchExplorationEnabled() || (i3 = this.c) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                c(i3);
            }
            this.c = i;
            this.j.invalidate();
            d(i, 32768);
            z = true;
        } else if (this.d == i) {
            this.d = Integer.MIN_VALUE;
            b(i, false);
            d(i, 8);
            return true;
        }
        return z;
    }

    protected abstract int e(float f2, float f3);

    protected abstract void e(int i, getChildFragmentManager getchildfragmentmanager);

    protected abstract void e(List<Integer> list);
}
