package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.findFragmentByWho;
import o.getChildFragmentManager;
import o.getContext;
import o.getReturnTransition;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/behavior/SwipeDismissBehavior.class */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.write<V> {
    public SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver e;
    private boolean f;
    getReturnTransition g;
    private boolean h;
    private float j = 0.0f;
    public int d = 2;
    float b = 0.5f;
    public float a = 0.0f;
    public float c = 0.5f;
    private final getReturnTransition.MediaBrowserCompat.CustomActionResultReceiver i = new getReturnTransition.MediaBrowserCompat.CustomActionResultReceiver() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.3
        private int a = -1;
        private int d;

        public final int a(View view, int i) {
            return view.getTop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.d) >= java.lang.Math.round(((float) r8.getWidth()) * r7.c.b)) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void a(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 295
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass3.a(android.view.View, float, float):void");
        }

        public final boolean b(View view, int i) {
            int i2 = this.a;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.a(view);
        }

        public final void c(int i) {
            if (SwipeDismissBehavior.this.e != null) {
                SwipeDismissBehavior.this.e.c(i);
            }
        }

        public final void c(View view, int i, int i2) {
            float width = ((float) this.d) + (((float) view.getWidth()) * SwipeDismissBehavior.this.a);
            float width2 = ((float) this.d) + (((float) view.getWidth()) * SwipeDismissBehavior.this.c);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }

        public final int d(View view) {
            return view.getWidth();
        }

        public final void d(View view, int i) {
            this.a = i;
            this.d = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final int e(View view, int i) {
            int i2;
            int i3;
            boolean z = findFragmentByWho.k(view) == 1;
            if (SwipeDismissBehavior.this.d == 0) {
                if (z) {
                    i3 = this.d - view.getWidth();
                    i2 = this.d;
                }
                i3 = this.d;
                i2 = view.getWidth() + i3;
            } else if (SwipeDismissBehavior.this.d == 1) {
                if (!z) {
                    i3 = this.d - view.getWidth();
                    i2 = this.d;
                }
                i3 = this.d;
                i2 = view.getWidth() + i3;
            } else {
                i3 = this.d - view.getWidth();
                i2 = view.getWidth() + this.d;
            }
            return Math.min(Math.max(i3, i), i2);
        }
    };

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/behavior/SwipeDismissBehavior$write.class */
    final class write implements Runnable {
        private final View a;
        private final boolean b;

        write(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SwipeDismissBehavior.this.g != null && SwipeDismissBehavior.this.g.e(true)) {
                findFragmentByWho.c(this.a, this);
            } else if (this.b && SwipeDismissBehavior.this.e != null) {
                SwipeDismissBehavior.this.e.d(this.a);
            }
        }
    }

    public boolean a(View view) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 == 3) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean c(androidx.coordinatorlayout.widget.CoordinatorLayout r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.h
            r9 = r0
            r0 = r8
            int r0 = r0.getActionMasked()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L_0x002d
            r0 = r10
            r1 = 1
            if (r0 == r1) goto L_0x0021
            r0 = r9
            r11 = r0
            r0 = r10
            r1 = 3
            if (r0 != r1) goto L_0x0044
        L_0x0021:
            r0 = r5
            r1 = 0
            r0.h = r1
            r0 = r9
            r11 = r0
            goto L_0x0044
        L_0x002d:
            r0 = r6
            r1 = r7
            r2 = r8
            float r2 = r2.getX()
            int r2 = (int) r2
            r3 = r8
            float r3 = r3.getY()
            int r3 = (int) r3
            boolean r0 = r0.c(r1, r2, r3)
            r11 = r0
            r0 = r5
            r1 = r11
            r0.h = r1
        L_0x0044:
            r0 = r11
            if (r0 == 0) goto L_0x007e
            r0 = r5
            o.getReturnTransition r0 = r0.g
            if (r0 != 0) goto L_0x0075
            r0 = r5
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0067
            r0 = r6
            r1 = r5
            float r1 = r1.j
            r2 = r5
            o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver r2 = r2.i
            o.getReturnTransition r0 = o.getReturnTransition.b(r0, r1, r2)
            r6 = r0
            goto L_0x0070
        L_0x0067:
            r0 = r6
            r1 = r5
            o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver r1 = r1.i
            o.getReturnTransition r0 = o.getReturnTransition.a(r0, r1)
            r6 = r0
        L_0x0070:
            r0 = r5
            r1 = r6
            r0.g = r1
        L_0x0075:
            r0 = r5
            o.getReturnTransition r0 = r0.g
            r1 = r8
            boolean r0 = r0.c(r1)
            return r0
        L_0x007e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean e(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean e = e(coordinatorLayout, v, i);
        if (findFragmentByWho.l(v) == 0) {
            findFragmentByWho.j(v, 1);
            findFragmentByWho.c(v, 1048576);
            if (a(v)) {
                findFragmentByWho.c(v, getChildFragmentManager.read.h, (CharSequence) null, new getContext() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.5
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
                        if (r7 == false) goto L_0x0045;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
                    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump */
                    public final boolean b(android.view.View r4) {
                        /*
                            r3 = this;
                            r0 = r3
                            com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                            r1 = r4
                            boolean r0 = r0.a(r1)
                            r5 = r0
                            r0 = 0
                            r6 = r0
                            r0 = r5
                            if (r0 == 0) goto L_0x007d
                            r0 = r4
                            int r0 = o.findFragmentByWho.k(r0)
                            r1 = 1
                            if (r0 != r1) goto L_0x001d
                            r0 = 1
                            r7 = r0
                            goto L_0x0020
                        L_0x001d:
                            r0 = 0
                            r7 = r0
                        L_0x0020:
                            r0 = r3
                            com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                            int r0 = r0.d
                            if (r0 != 0) goto L_0x002f
                            r0 = r7
                            if (r0 != 0) goto L_0x0045
                        L_0x002f:
                            r0 = r6
                            r8 = r0
                            r0 = r3
                            com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                            int r0 = r0.d
                            r1 = 1
                            if (r0 != r1) goto L_0x0048
                            r0 = r6
                            r8 = r0
                            r0 = r7
                            if (r0 != 0) goto L_0x0048
                        L_0x0045:
                            r0 = 1
                            r8 = r0
                        L_0x0048:
                            r0 = r4
                            int r0 = r0.getWidth()
                            r6 = r0
                            r0 = r6
                            r7 = r0
                            r0 = r8
                            if (r0 == 0) goto L_0x0059
                            r0 = r6
                            int r0 = -r0
                            r7 = r0
                        L_0x0059:
                            r0 = r4
                            r1 = r7
                            o.findFragmentByWho.d(r0, r1)
                            r0 = r4
                            r1 = 0
                            r0.setAlpha(r1)
                            r0 = r3
                            com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                            com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.e
                            if (r0 == 0) goto L_0x007b
                            r0 = r3
                            com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                            com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.e
                            r1 = r4
                            r0.d(r1)
                        L_0x007b:
                            r0 = 1
                            return r0
                        L_0x007d:
                            r0 = 0
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.b(android.view.View):boolean");
                    }
                });
            }
        }
        return e;
    }

    public final boolean e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        getReturnTransition getreturntransition = this.g;
        if (getreturntransition == null) {
            return false;
        }
        getreturntransition.a(motionEvent);
        return true;
    }
}
