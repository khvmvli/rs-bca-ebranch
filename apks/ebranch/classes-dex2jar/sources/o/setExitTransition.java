package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setExitTransition.class */
public final class setExitTransition extends setOnStartEnterTransitionListener.MediaMetadataCompat implements setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper {
    private static final int[] q = {16842919};
    private static final int[] r = new int[0];
    private final int C;
    private final int D;
    private final int G;
    int a;
    int b;
    float c;
    final int g;
    setOnStartEnterTransitionListener i;
    int k;
    float m;
    final ValueAnimator n;

    /* renamed from: o */
    final StateListDrawable f224o;
    int s;
    final Drawable t;
    private final Drawable u;
    private final int w;
    private final StateListDrawable x;
    private final int z;
    int f = 0;
    int j = 0;
    boolean h = false;
    boolean d = false;
    int l = 0;
    private int p = 0;
    private final int[] A = new int[2];
    private final int[] v = new int[2];
    int e = 0;
    private final Runnable y = new Runnable() { // from class: o.setExitTransition.5
        @Override // java.lang.Runnable
        public final void run() {
            setExitTransition setexittransition = setExitTransition.this;
            int i = setexittransition.e;
            if (i == 1) {
                setexittransition.n.cancel();
            } else if (i != 2) {
                return;
            }
            setexittransition.e = 3;
            ValueAnimator valueAnimator = setexittransition.n;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            setexittransition.n.setDuration(500L);
            setexittransition.n.start();
        }
    };
    private final setOnStartEnterTransitionListener.RatingCompat B = new setOnStartEnterTransitionListener.RatingCompat() { // from class: o.setExitTransition.3
        @Override // o.setOnStartEnterTransitionListener.RatingCompat
        public final void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
            setExitTransition setexittransition = setExitTransition.this;
            int computeHorizontalScrollOffset = setonstartentertransitionlistener.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = setonstartentertransitionlistener.computeVerticalScrollOffset();
            int computeVerticalScrollRange = setexittransition.i.computeVerticalScrollRange();
            int i3 = setexittransition.j;
            setexittransition.h = computeVerticalScrollRange - i3 > 0 && i3 >= setexittransition.g;
            int computeHorizontalScrollRange = setexittransition.i.computeHorizontalScrollRange();
            int i4 = setexittransition.f;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= setexittransition.g;
            setexittransition.d = z;
            boolean z2 = setexittransition.h;
            if (z2 || z) {
                if (z2) {
                    float f = (float) computeVerticalScrollOffset;
                    float f2 = (float) i3;
                    setexittransition.k = (int) ((f2 * (f + (f2 / 2.0f))) / ((float) computeVerticalScrollRange));
                    setexittransition.s = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (setexittransition.d) {
                    float f3 = (float) computeHorizontalScrollOffset;
                    float f4 = (float) i4;
                    setexittransition.a = (int) ((f4 * (f3 + (f4 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    setexittransition.b = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = setexittransition.l;
                if (i5 == 0 || i5 == 1) {
                    setexittransition.e(1);
                }
            } else if (setexittransition.l != 0) {
                setexittransition.e(0);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setExitTransition$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements ValueAnimator.AnimatorUpdateListener {
        RemoteActionCompatParcelizer() {
            setExitTransition.this = r4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            setExitTransition.this.f224o.setAlpha(floatValue);
            setExitTransition.this.t.setAlpha(floatValue);
            setExitTransition.this.i.invalidate();
        }
    }

    public setExitTransition(setOnStartEnterTransitionListener setonstartentertransitionlistener, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        this.f224o = stateListDrawable;
        this.t = drawable;
        this.x = stateListDrawable2;
        this.u = drawable2;
        this.z = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.G = Math.max(i, drawable.getIntrinsicWidth());
        this.w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.D = Math.max(i, drawable2.getIntrinsicWidth());
        this.g = i2;
        this.C = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: o.setExitTransition$MediaBrowserCompat$CustomActionResultReceiver
            private boolean e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.e) {
                    this.e = false;
                } else if (((Float) setExitTransition.this.n.getAnimatedValue()).floatValue() == 0.0f) {
                    setExitTransition.this.e = 0;
                    setExitTransition.this.e(0);
                } else {
                    setExitTransition.this.e = 2;
                    setExitTransition.this.i.invalidate();
                }
            }
        });
        ofFloat.addUpdateListener(new RemoteActionCompatParcelizer());
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.i;
        if (setonstartentertransitionlistener2 != setonstartentertransitionlistener) {
            if (setonstartentertransitionlistener2 != null) {
                setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setonstartentertransitionlistener2.z;
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.a("Cannot remove item decoration during a scroll  or layout");
                }
                setonstartentertransitionlistener2.v.remove(this);
                if (setonstartentertransitionlistener2.v.isEmpty()) {
                    setonstartentertransitionlistener2.setWillNotDraw(setonstartentertransitionlistener2.getOverScrollMode() == 2 ? true : z);
                }
                setonstartentertransitionlistener2.g();
                setonstartentertransitionlistener2.requestLayout();
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.i;
                setonstartentertransitionlistener3.F.remove(this);
                if (setonstartentertransitionlistener3.p == this) {
                    setonstartentertransitionlistener3.p = null;
                }
                setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.i;
                setOnStartEnterTransitionListener.RatingCompat ratingCompat = this.B;
                List<setOnStartEnterTransitionListener.RatingCompat> list = setonstartentertransitionlistener4.Q;
                if (list != null) {
                    list.remove(ratingCompat);
                }
                this.i.removeCallbacks(this.y);
            }
            this.i = setonstartentertransitionlistener;
            if (setonstartentertransitionlistener != null) {
                setonstartentertransitionlistener.c(this, -1);
                this.i.F.add(this);
                setOnStartEnterTransitionListener setonstartentertransitionlistener5 = this.i;
                setOnStartEnterTransitionListener.RatingCompat ratingCompat2 = this.B;
                if (setonstartentertransitionlistener5.Q == null) {
                    setonstartentertransitionlistener5.Q = new ArrayList();
                }
                setonstartentertransitionlistener5.Q.add(ratingCompat2);
            }
        }
    }

    private boolean a(float f, float f2) {
        boolean z;
        if (f2 >= ((float) (this.j - this.w))) {
            int i = this.a;
            int i2 = this.b / 2;
            if (f >= ((float) (i - i2)) && f <= ((float) (i + i2))) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    private static int c(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        float f3 = (f2 - f) / ((float) i4);
        int i5 = i - i3;
        int i6 = (int) (f3 * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private void c() {
        int i = this.e;
        if (i != 0) {
            if (i == 3) {
                this.n.cancel();
            } else {
                return;
            }
        }
        this.e = 1;
        ValueAnimator valueAnimator = this.n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.n.setDuration(500L);
        this.n.setStartDelay(0);
        this.n.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r5 >= ((float) (r4.f - r4.z))) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        r0 = r4.k;
        r0 = r4.s / 2;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        if (r6 < ((float) (r0 - r0))) goto L_0x006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r6 > ((float) (r0 + r0))) goto L_0x006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r5 <= ((float) r4.z)) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean c(float r5, float r6) {
        /*
            r4 = this;
            r0 = r4
            o.setOnStartEnterTransitionListener r0 = r0.i
            int r0 = o.findFragmentByWho.k(r0)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x0015
            r0 = 0
            r7 = r0
            goto L_0x0017
        L_0x0015:
            r0 = 1
            r7 = r0
        L_0x0017:
            r0 = r7
            if (r0 == 0) goto L_0x002c
            r0 = r8
            r9 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.z
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            goto L_0x003f
        L_0x002c:
            r0 = r8
            r9 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.f
            r2 = r4
            int r2 = r2.z
            int r1 = r1 - r2
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
        L_0x003f:
            r0 = r4
            int r0 = r0.k
            r7 = r0
            r0 = r4
            int r0 = r0.s
            r1 = 2
            int r0 = r0 / r1
            r10 = r0
            r0 = r8
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            int r1 = r1 - r2
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            r0 = r8
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r10
            int r1 = r1 + r2
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            r0 = 1
            r9 = r0
        L_0x006b:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExitTransition.c(float, float):boolean");
    }

    @Override // o.setOnStartEnterTransitionListener.MediaMetadataCompat
    public final void a(Canvas canvas, setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        if (this.f != this.i.getWidth() || this.j != this.i.getHeight()) {
            this.f = this.i.getWidth();
            this.j = this.i.getHeight();
            e(0);
        } else if (this.e != 0) {
            if (this.h) {
                int i = this.f;
                int i2 = this.z;
                int i3 = i - i2;
                int i4 = this.k;
                int i5 = this.s;
                int i6 = i4 - (i5 / 2);
                this.f224o.setBounds(0, 0, i2, i5);
                this.t.setBounds(0, 0, this.G, this.j);
                boolean z = true;
                if (findFragmentByWho.k(this.i) != 1) {
                    z = false;
                }
                if (z) {
                    this.t.draw(canvas);
                    canvas.translate((float) this.z, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f224o.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.z), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.t.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f224o.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.d) {
                int i7 = this.j;
                int i8 = this.w;
                int i9 = i7 - i8;
                int i10 = this.a;
                int i11 = this.b;
                int i12 = i10 - (i11 / 2);
                this.x.setBounds(0, 0, i11, i8);
                this.u.setBounds(0, 0, this.f, this.D);
                canvas.translate(0.0f, (float) i9);
                this.u.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.x.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper
    public final void a(MotionEvent motionEvent) {
        if (this.l != 0) {
            if (motionEvent.getAction() == 0) {
                boolean c = c(motionEvent.getX(), motionEvent.getY());
                boolean a = a(motionEvent.getX(), motionEvent.getY());
                if (c || a) {
                    if (a) {
                        this.p = 1;
                        this.c = (float) ((int) motionEvent.getX());
                    } else if (c) {
                        this.p = 2;
                        this.m = (float) ((int) motionEvent.getY());
                    }
                    e(2);
                }
            } else if (motionEvent.getAction() == 1 && this.l == 2) {
                this.m = 0.0f;
                this.c = 0.0f;
                e(1);
                this.p = 0;
            } else if (motionEvent.getAction() == 2 && this.l == 2) {
                c();
                if (this.p == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.v;
                    int i = this.C;
                    iArr[0] = i;
                    iArr[1] = this.f - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.a) - max) >= 2.0f) {
                        int c2 = c(this.c, max, iArr, this.i.computeHorizontalScrollRange(), this.i.computeHorizontalScrollOffset(), this.f);
                        if (c2 != 0) {
                            this.i.scrollBy(c2, 0);
                        }
                        this.c = max;
                    }
                }
                if (this.p == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.A;
                    int i2 = this.C;
                    iArr2[0] = i2;
                    iArr2[1] = this.j - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.k) - max2) >= 2.0f) {
                        int c3 = c(this.m, max2, iArr2, this.i.computeVerticalScrollRange(), this.i.computeVerticalScrollOffset(), this.j);
                        if (c3 != 0) {
                            this.i.scrollBy(0, c3);
                        }
                        this.m = max2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        if (r0 == 2) goto L_0x007a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r0 != false) goto L_0x003f;
     */
    @Override // o.setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean d(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.l
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L_0x0072
            r0 = r4
            r1 = r5
            float r1 = r1.getX()
            r2 = r5
            float r2 = r2.getY()
            boolean r0 = r0.c(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r5
            float r1 = r1.getX()
            r2 = r5
            float r2 = r2.getY()
            boolean r0 = r0.a(r1, r2)
            r9 = r0
            r0 = r7
            r10 = r0
            r0 = r5
            int r0 = r0.getAction()
            if (r0 != 0) goto L_0x007d
            r0 = r8
            if (r0 != 0) goto L_0x003f
            r0 = r7
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L_0x007d
        L_0x003f:
            r0 = r9
            if (r0 == 0) goto L_0x0056
            r0 = r4
            r1 = 1
            r0.p = r1
            r0 = r4
            r1 = r5
            float r1 = r1.getX()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.c = r1
            goto L_0x006a
        L_0x0056:
            r0 = r8
            if (r0 == 0) goto L_0x006a
            r0 = r4
            r1 = 2
            r0.p = r1
            r0 = r4
            r1 = r5
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.m = r1
        L_0x006a:
            r0 = r4
            r1 = 2
            r0.e(r1)
            goto L_0x007a
        L_0x0072:
            r0 = r7
            r10 = r0
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L_0x007d
        L_0x007a:
            r0 = 1
            r10 = r0
        L_0x007d:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExitTransition.d(android.view.MotionEvent):boolean");
    }

    public final void e(int i) {
        if (i == 2 && this.l != 2) {
            this.f224o.setState(q);
            this.i.removeCallbacks(this.y);
        }
        if (i == 0) {
            this.i.invalidate();
        } else {
            c();
        }
        if (this.l == 2 && i != 2) {
            this.f224o.setState(r);
            this.i.removeCallbacks(this.y);
            this.i.postDelayed(this.y, (long) 1200);
        } else if (i == 1) {
            this.i.removeCallbacks(this.y);
            this.i.postDelayed(this.y, (long) 1500);
        }
        this.l = i;
    }
}
