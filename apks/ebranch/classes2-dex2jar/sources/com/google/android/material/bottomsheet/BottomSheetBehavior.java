package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver;
import o.BaseDialogKotlin$MediaSessionCompat$Token;
import o.HaloBCADialog;
import o.HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver;
import o.HubunganKeuanganDialog_ViewBinding;
import o.InfoTarikanDialog_ViewBinding;
import o.JenisKodeBankDialog;
import o.JenisPekerjaanDialog;
import o.findFragmentByWho;
import o.getChildFragmentManager;
import o.getContext;
import o.getPopEnterAnim;
import o.getReturnTransition;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomsheet/BottomSheetBehavior.class */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.write<V> {
    private static final int B = BaseDialogKotlin.MediaDescriptionCompat.f;
    WeakReference<V> A;
    private int C;
    private final getReturnTransition.MediaBrowserCompat.CustomActionResultReceiver D;
    private Map<View, Integer> E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private ValueAnimator J;
    private boolean K;
    private float L;
    private int M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private BottomSheetBehavior<V>.IconCompatParcelizer T;
    private boolean U;
    private boolean V;
    private JenisPekerjaanDialog W;
    private int X;
    int a;
    private VelocityTracker ab;
    float b;
    int c;
    public final ArrayList<read> d;
    boolean e;
    int f;
    int g;
    boolean h;
    int i;
    int j;
    int k;
    public JenisKodeBankDialog l;
    float m;
    public boolean n;

    /* renamed from: o */
    int f4o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    WeakReference<View> t;
    public int u;
    int v;
    int w;
    boolean x;
    boolean y;
    getReturnTransition z;

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomsheet/BottomSheetBehavior$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements Runnable {
        boolean a;
        private final View c;
        int d;

        IconCompatParcelizer(View view, int i) {
            BottomSheetBehavior.this = r4;
            this.c = view;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (BottomSheetBehavior.this.z == null || !BottomSheetBehavior.this.z.e(true)) {
                BottomSheetBehavior.this.d(this.d);
            } else {
                findFragmentByWho.c(this.c, this);
            }
            this.a = false;
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomsheet/BottomSheetBehavior$read.class */
    public static abstract class read {
        public abstract void d(View view);

        public abstract void e(View view, int i);
    }

    public BottomSheetBehavior() {
        this.X = 0;
        this.h = true;
        this.U = false;
        this.M = -1;
        this.T = null;
        this.m = 0.5f;
        this.b = -1.0f;
        this.e = true;
        this.u = 4;
        this.d = new ArrayList<>();
        this.F = -1;
        this.D = new getReturnTransition.MediaBrowserCompat.CustomActionResultReceiver() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            public final int a(View view, int i) {
                int a = BottomSheetBehavior.this.a();
                int i2 = BottomSheetBehavior.this.n ? BottomSheetBehavior.this.s : BottomSheetBehavior.this.a;
                return i < a ? a : i > i2 ? i2 : i;
            }

            public final void a(View view, float f, float f2) {
                int i;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (BottomSheetBehavior.this.h) {
                        i = BottomSheetBehavior.this.j;
                    } else if (view.getTop() > BottomSheetBehavior.this.g) {
                        i = BottomSheetBehavior.this.g;
                    } else {
                        i = BottomSheetBehavior.this.a();
                    }
                    i2 = 3;
                } else if (BottomSheetBehavior.this.n && BottomSheetBehavior.this.b(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        if (!(view.getTop() > (BottomSheetBehavior.this.s + BottomSheetBehavior.this.a()) / 2)) {
                            if (BottomSheetBehavior.this.h) {
                                i = BottomSheetBehavior.this.j;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.a()) < Math.abs(view.getTop() - BottomSheetBehavior.this.g)) {
                                i = BottomSheetBehavior.this.a();
                            } else {
                                i = BottomSheetBehavior.this.g;
                            }
                            i2 = 3;
                        }
                    }
                    i = BottomSheetBehavior.this.s;
                    i2 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (BottomSheetBehavior.this.h) {
                        if (Math.abs(top - BottomSheetBehavior.this.j) < Math.abs(top - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.j;
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.a;
                            i2 = 4;
                        }
                    } else if (top < BottomSheetBehavior.this.g) {
                        if (top < Math.abs(top - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.a();
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.g;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.g) < Math.abs(top - BottomSheetBehavior.this.a)) {
                        i = BottomSheetBehavior.this.g;
                    } else {
                        i = BottomSheetBehavior.this.a;
                        i2 = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.h) {
                        i = BottomSheetBehavior.this.a;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.g) < Math.abs(top2 - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.g;
                        } else {
                            i = BottomSheetBehavior.this.a;
                        }
                    }
                    i2 = 4;
                }
                BottomSheetBehavior.this.b(view, i2, i, true);
            }

            public final boolean b(View view, int i) {
                boolean z = true;
                if (BottomSheetBehavior.this.u == 1 || BottomSheetBehavior.this.x) {
                    return false;
                }
                if (BottomSheetBehavior.this.u == 3 && BottomSheetBehavior.this.c == i) {
                    View view2 = BottomSheetBehavior.this.t != null ? BottomSheetBehavior.this.t.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                if (BottomSheetBehavior.this.A == null || BottomSheetBehavior.this.A.get() != view) {
                    z = false;
                }
                return z;
            }

            public final int c() {
                return BottomSheetBehavior.this.n ? BottomSheetBehavior.this.s : BottomSheetBehavior.this.a;
            }

            public final void c(int i) {
                if (i == 1 && BottomSheetBehavior.this.e) {
                    BottomSheetBehavior.this.d(1);
                }
            }

            public final void c(View view, int i, int i2) {
                BottomSheetBehavior.this.c(i2);
            }

            public final int e(View view, int i) {
                return view.getLeft();
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X = 0;
        this.h = true;
        this.U = false;
        this.M = -1;
        this.T = null;
        this.m = 0.5f;
        this.b = -1.0f;
        this.e = true;
        this.u = 4;
        this.d = new ArrayList<>();
        this.F = -1;
        this.D = new getReturnTransition.MediaBrowserCompat.CustomActionResultReceiver() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            public final int a(View view, int i) {
                int a = BottomSheetBehavior.this.a();
                int i2 = BottomSheetBehavior.this.n ? BottomSheetBehavior.this.s : BottomSheetBehavior.this.a;
                return i < a ? a : i > i2 ? i2 : i;
            }

            public final void a(View view, float f, float f2) {
                int i;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (BottomSheetBehavior.this.h) {
                        i = BottomSheetBehavior.this.j;
                    } else if (view.getTop() > BottomSheetBehavior.this.g) {
                        i = BottomSheetBehavior.this.g;
                    } else {
                        i = BottomSheetBehavior.this.a();
                    }
                    i2 = 3;
                } else if (BottomSheetBehavior.this.n && BottomSheetBehavior.this.b(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        if (!(view.getTop() > (BottomSheetBehavior.this.s + BottomSheetBehavior.this.a()) / 2)) {
                            if (BottomSheetBehavior.this.h) {
                                i = BottomSheetBehavior.this.j;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.a()) < Math.abs(view.getTop() - BottomSheetBehavior.this.g)) {
                                i = BottomSheetBehavior.this.a();
                            } else {
                                i = BottomSheetBehavior.this.g;
                            }
                            i2 = 3;
                        }
                    }
                    i = BottomSheetBehavior.this.s;
                    i2 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (BottomSheetBehavior.this.h) {
                        if (Math.abs(top - BottomSheetBehavior.this.j) < Math.abs(top - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.j;
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.a;
                            i2 = 4;
                        }
                    } else if (top < BottomSheetBehavior.this.g) {
                        if (top < Math.abs(top - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.a();
                            i2 = 3;
                        } else {
                            i = BottomSheetBehavior.this.g;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.g) < Math.abs(top - BottomSheetBehavior.this.a)) {
                        i = BottomSheetBehavior.this.g;
                    } else {
                        i = BottomSheetBehavior.this.a;
                        i2 = 4;
                    }
                } else {
                    if (BottomSheetBehavior.this.h) {
                        i = BottomSheetBehavior.this.a;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.g) < Math.abs(top2 - BottomSheetBehavior.this.a)) {
                            i = BottomSheetBehavior.this.g;
                        } else {
                            i = BottomSheetBehavior.this.a;
                        }
                    }
                    i2 = 4;
                }
                BottomSheetBehavior.this.b(view, i2, i, true);
            }

            public final boolean b(View view, int i) {
                boolean z = true;
                if (BottomSheetBehavior.this.u == 1 || BottomSheetBehavior.this.x) {
                    return false;
                }
                if (BottomSheetBehavior.this.u == 3 && BottomSheetBehavior.this.c == i) {
                    View view2 = BottomSheetBehavior.this.t != null ? BottomSheetBehavior.this.t.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                if (BottomSheetBehavior.this.A == null || BottomSheetBehavior.this.A.get() != view) {
                    z = false;
                }
                return z;
            }

            public final int c() {
                return BottomSheetBehavior.this.n ? BottomSheetBehavior.this.s : BottomSheetBehavior.this.a;
            }

            public final void c(int i) {
                if (i == 1 && BottomSheetBehavior.this.e) {
                    BottomSheetBehavior.this.d(1);
                }
            }

            public final void c(View view, int i, int i2) {
                BottomSheetBehavior.this.c(i2);
            }

            public final int e(View view, int i) {
                return view.getLeft();
            }
        };
        this.Q = context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.aa);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.Z);
        this.V = obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.aq);
        boolean hasValue = obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.ac);
        if (hasValue) {
            c(context, attributeSet, hasValue, HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.ac));
        } else {
            c(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.setDuration(500L);
        this.J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.l != null) {
                    JenisKodeBankDialog jenisKodeBankDialog = BottomSheetBehavior.this.l;
                    if (jenisKodeBankDialog.F.i != floatValue) {
                        jenisKodeBankDialog.F.i = floatValue;
                        jenisKodeBankDialog.H = true;
                        jenisKodeBankDialog.invalidateSelf();
                    }
                }
            }
        });
        this.b = obtainStyledAttributes.getDimension(BaseDialogKotlin$MediaSessionCompat$Token.Y, -1.0f);
        if (obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.aa)) {
            this.M = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.aa, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(BaseDialogKotlin$MediaSessionCompat$Token.am);
        if (peekValue == null || peekValue.data != -1) {
            e(obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.am, -1), false);
        } else {
            e(peekValue.data, false);
        }
        e(obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.af, false));
        this.H = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ai, false);
        boolean z = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ag, true);
        if (this.h != z) {
            this.h = z;
            if (this.A != null) {
                b();
            }
            d((!this.h || this.u != 6) ? this.u : 3);
            d();
        }
        this.y = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.al, false);
        this.e = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ae, true);
        this.X = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.ak, 0);
        float f = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.ah, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.m = f;
        if (this.A != null) {
            this.g = (int) (((float) this.s) * (1.0f - f));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(BaseDialogKotlin$MediaSessionCompat$Token.ad);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(BaseDialogKotlin$MediaSessionCompat$Token.ad, 0);
            if (dimensionPixelOffset >= 0) {
                this.i = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i = peekValue2.data;
            if (i >= 0) {
                this.i = i;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.r = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.aj, false);
        this.q = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ao, false);
        this.p = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ar, false);
        this.R = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ap, true);
        obtainStyledAttributes.recycle();
        this.L = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int a(V v, int i, int i2) {
        return findFragmentByWho.a(v, v.getResources().getString(i), new getContext(6) { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            public final boolean b(View view) {
                BottomSheetBehavior.this.b(r10);
                return true;
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> a(V v) {
        CoordinatorLayout.read layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.read) {
            BottomSheetBehavior<V> bottomSheetBehavior = layoutParams.g;
            if (bottomSheetBehavior instanceof BottomSheetBehavior) {
                return bottomSheetBehavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void a(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.K != z) {
                this.K = z;
                if (this.l != null && (valueAnimator = this.J) != null) {
                    if (valueAnimator.isRunning()) {
                        this.J.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.J.setFloatValues(1.0f - f, f);
                    this.J.start();
                }
            }
        }
    }

    private void b() {
        int c = c();
        if (this.h) {
            this.a = Math.max(this.s - c, this.j);
        } else {
            this.a = this.s - c;
        }
    }

    private int c() {
        int i;
        return this.O ? Math.min(Math.max(this.P, this.s - ((this.v * 9) / 16)), this.C) + this.f4o : (this.H || this.r || (i = this.f) <= 0) ? this.w + this.f4o : Math.max(this.w, i + this.Q);
    }

    private void c(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.V) {
            this.W = new JenisPekerjaanDialog(JenisPekerjaanDialog.d(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.i, B, new InfoTarikanDialog_ViewBinding(0.0f)), (byte) 0);
            JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(this.W);
            this.l = jenisKodeBankDialog;
            jenisKodeBankDialog.b(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.l.setTint(typedValue.data);
                return;
            }
            this.l.c(colorStateList);
        }
    }

    private void c(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.A;
        if (weakReference != null) {
            CoordinatorLayout parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.E == null) {
                        this.E = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.A.get()) {
                        if (z) {
                            this.E.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.U) {
                                findFragmentByWho.j(childAt, 4);
                            }
                        } else if (this.U && (map = this.E) != null && map.containsKey(childAt)) {
                            findFragmentByWho.j(childAt, this.E.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.E = null;
                } else if (this.U) {
                    this.A.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    private void d() {
        V v;
        WeakReference<V> weakReference = this.A;
        if (weakReference != null && (v = weakReference.get()) != null) {
            findFragmentByWho.c(v, 524288);
            findFragmentByWho.c(v, 262144);
            findFragmentByWho.c(v, 1048576);
            int i = this.F;
            if (i != -1) {
                findFragmentByWho.c(v, i);
            }
            final int i2 = 6;
            if (!this.h && this.u != 6) {
                this.F = a(v, BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.d, 6);
            }
            if (this.n && this.u != 5) {
                findFragmentByWho.c(v, getChildFragmentManager.read.h, (CharSequence) null, new getContext(5) { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    public final boolean b(View view) {
                        BottomSheetBehavior.this.b(i2);
                        return true;
                    }
                });
            }
            int i3 = this.u;
            if (i3 == 3) {
                if (this.h) {
                    i2 = 4;
                }
                findFragmentByWho.c(v, getChildFragmentManager.read.j, (CharSequence) null, new getContext() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    public final boolean b(View view) {
                        BottomSheetBehavior.this.b(i2);
                        return true;
                    }
                });
            } else if (i3 == 4) {
                if (this.h) {
                    i2 = 3;
                }
                findFragmentByWho.c(v, getChildFragmentManager.read.n, (CharSequence) null, new getContext() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    public final boolean b(View view) {
                        BottomSheetBehavior.this.b(i2);
                        return true;
                    }
                });
            } else if (i3 == 6) {
                findFragmentByWho.c(v, getChildFragmentManager.read.j, (CharSequence) null, new getContext(4) { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    public final boolean b(View view) {
                        BottomSheetBehavior.this.b(i2);
                        return true;
                    }
                });
                findFragmentByWho.c(v, getChildFragmentManager.read.n, (CharSequence) null, new getContext(3) { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    public final boolean b(View view) {
                        BottomSheetBehavior.this.b(i2);
                        return true;
                    }
                });
            }
        }
    }

    private View e(View view) {
        if (findFragmentByWho.H(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View e = e(viewGroup.getChildAt(i));
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    private void e(final int i) {
        final V v = this.A.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent == null || !parent.isLayoutRequested() || !findFragmentByWho.F(v)) {
                b((View) v, i);
            } else {
                v.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheetBehavior.this.b(v, i);
                    }
                });
            }
        }
    }

    public final int a() {
        int i;
        if (this.h) {
            i = this.j;
        } else {
            i = Math.max(this.i, this.R ? 0 : this.k);
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver] */
    public final Parcelable a(CoordinatorLayout coordinatorLayout, V v) {
        return new BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver(a(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (a(r8, r9, r10, r11, r12) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.View r10, float r11, float r12) {
        /*
            r7 = this;
            r0 = r7
            java.lang.ref.WeakReference<android.view.View> r0 = r0.t
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r14
            r15 = r0
            r0 = r13
            if (r0 == 0) goto L_0x003c
            r0 = r14
            r15 = r0
            r0 = r10
            r1 = r13
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L_0x003c
            r0 = r7
            int r0 = r0.u
            r1 = 3
            if (r0 != r1) goto L_0x0039
            r0 = r14
            r15 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x003c
        L_0x0039:
            r0 = 1
            r15 = r0
        L_0x003c:
            r0 = r15
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, float, float):boolean");
    }

    public final void b(int i) {
        if (i != this.u) {
            if (this.A != null) {
                e(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.n && i == 5)) {
                this.u = i;
            }
        }
    }

    final void b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.a;
        } else if (i == 6) {
            int i3 = this.g;
            if (this.h) {
                i2 = this.j;
                if (i3 <= i2) {
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = a();
        } else if (!this.n || i != 5) {
            StringBuilder sb = new StringBuilder("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.s;
        }
        b(view, i, i2, false);
    }

    final void b(View view, int i, int i2, boolean z) {
        getReturnTransition getreturntransition = this.z;
        if (getreturntransition != null && (!z ? getreturntransition.c(view, view.getLeft(), i2) : getreturntransition.a(view.getLeft(), i2))) {
            d(2);
            a(i);
            if (this.T == null) {
                this.T = new IconCompatParcelizer(view, i);
            }
            if (!this.T.a) {
                this.T.d = i;
                findFragmentByWho.c(view, this.T);
                this.T.a = true;
                return;
            }
            this.T.d = i;
            return;
        }
        d(i);
    }

    final boolean b(View view, float f) {
        boolean z = true;
        if (this.y) {
            return true;
        }
        if (view.getTop() < this.a) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.a)) / ((float) c()) <= 0.5f) {
            z = false;
        }
        return z;
    }

    final void c(int i) {
        V v = this.A.get();
        if (!(v == null || this.d.isEmpty())) {
            int i2 = this.a;
            if (i <= i2 && i2 != a()) {
                a();
            }
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                this.d.get(i3).d(v);
            }
        }
    }

    public final void c(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver = (BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver) parcelable;
        c(coordinatorLayout, v, ((getPopEnterAnim) bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver).d);
        int i = this.X;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.w = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.c;
            }
            int i2 = this.X;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.h = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.a;
            }
            int i3 = this.X;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.n = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.e;
            }
            int i4 = this.X;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.y = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.f;
            }
        }
        if (bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.i == 1 || bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.i == 2) {
            this.u = 4;
        } else {
            this.u = bottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.i;
        }
    }

    public final void c(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.t;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < a()) {
                        int a = top - a();
                        iArr[1] = a;
                        findFragmentByWho.e(v, -a);
                        d(3);
                    } else if (this.e) {
                        iArr[1] = i2;
                        findFragmentByWho.e(v, -i2);
                        d(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.a;
                    if (i4 > i5 && !this.n) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        findFragmentByWho.e(v, -i6);
                        d(4);
                    } else if (this.e) {
                        iArr[1] = i2;
                        findFragmentByWho.e(v, -i2);
                        d(1);
                    } else {
                        return;
                    }
                }
                c(v.getTop());
                this.N = i2;
                this.S = true;
            }
        }
    }

    public final boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        getReturnTransition getreturntransition;
        boolean z = true;
        if (!v.isShown() || !this.e) {
            this.I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.c = -1;
            VelocityTracker velocityTracker = this.ab;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.ab = null;
            }
        }
        if (this.ab == null) {
            this.ab = VelocityTracker.obtain();
        }
        this.ab.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            if (this.u != 2) {
                WeakReference<View> weakReference = this.t;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.c(view2, x, this.G)) {
                    this.c = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.x = true;
                }
            }
            this.I = this.c == -1 && !coordinatorLayout.c(v, x, this.G);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.x = false;
            this.c = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (!this.I && (getreturntransition = this.z) != null && getreturntransition.c(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.t;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.I || this.u == 1 || coordinatorLayout.c(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.z == null || Math.abs(((float) this.G) - motionEvent.getY()) <= ((float) this.z.i)) {
            z = false;
        }
        return z;
    }

    final void d(int i) {
        V v;
        if (this.u != i) {
            this.u = i;
            WeakReference<V> weakReference = this.A;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    c(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    c(false);
                }
                a(i);
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    this.d.get(i2).e(v, i);
                }
                d();
            }
        }
    }

    public final void d(CoordinatorLayout.read read2) {
        d(read2);
        this.A = null;
        this.z = null;
    }

    public final void d(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float f;
        int i3 = 3;
        if (v.getTop() == a()) {
            d(3);
            return;
        }
        WeakReference<View> weakReference = this.t;
        if (weakReference != null && view == weakReference.get() && this.S) {
            if (this.N > 0) {
                if (this.h) {
                    i2 = this.j;
                } else {
                    int top = v.getTop();
                    i2 = this.g;
                    if (top <= i2) {
                        i2 = a();
                    }
                    i3 = 6;
                }
                b(v, i3, i2, false);
                this.S = false;
            }
            if (this.n) {
                VelocityTracker velocityTracker = this.ab;
                if (velocityTracker == null) {
                    f = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND, this.L);
                    f = this.ab.getYVelocity(this.c);
                }
                if (b(v, f)) {
                    i2 = this.s;
                    i3 = 5;
                    b(v, i3, i2, false);
                    this.S = false;
                }
            }
            if (this.N == 0) {
                int top2 = v.getTop();
                if (!this.h) {
                    int i4 = this.g;
                    if (top2 < i4) {
                        if (top2 < Math.abs(top2 - this.a)) {
                            i2 = a();
                        } else {
                            i2 = this.g;
                        }
                    } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.a)) {
                        i2 = this.g;
                    } else {
                        i2 = this.a;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.j) < Math.abs(top2 - this.a)) {
                    i2 = this.j;
                } else {
                    i2 = this.a;
                    i3 = 4;
                }
            } else {
                if (this.h) {
                    i2 = this.a;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.g) < Math.abs(top3 - this.a)) {
                        i2 = this.g;
                        i3 = 6;
                    } else {
                        i2 = this.a;
                    }
                }
                i3 = 4;
            }
            b(v, i3, i2, false);
            this.S = false;
        }
    }

    public final void d(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    void d(boolean z) {
        V v;
        if (this.A != null) {
            b();
            if (this.u == 4 && (v = this.A.get()) != null) {
                if (z) {
                    e(this.u);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        boolean z = false;
        this.N = 0;
        this.S = false;
        if ((i & 2) != 0) {
            z = true;
        }
        return z;
    }

    public final void e() {
        e();
        this.A = null;
        this.z = null;
    }

    public final void e(int i, boolean z) {
        boolean z2;
        if (i == -1) {
            if (!this.O) {
                this.O = true;
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.O || this.w != i) {
                this.O = false;
                this.w = Math.max(0, i);
                z2 = true;
            }
            z2 = false;
        }
        if (z2) {
            d(false);
        }
    }

    public final void e(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (!z && this.u == 5) {
                b(4);
            }
            d();
        }
    }

    public final boolean e(CoordinatorLayout coordinatorLayout, final V v, int i) {
        JenisKodeBankDialog jenisKodeBankDialog;
        if (findFragmentByWho.h(coordinatorLayout) && !findFragmentByWho.h(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.A == null) {
            this.P = coordinatorLayout.getResources().getDimensionPixelSize(BaseDialogKotlin.read.d);
            final boolean z = Build.VERSION.SDK_INT >= 29 && !this.H && !this.O;
            if (this.r || this.q || this.p || z) {
                HaloBCADialog.a(v, new HaloBCADialog.IconCompatParcelizer() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                    @Override // o.HaloBCADialog.IconCompatParcelizer
                    public final WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver) {
                        BottomSheetBehavior.this.k = windowInsetsCompat.h();
                        boolean z2 = true;
                        if (findFragmentByWho.k(view) != 1) {
                            z2 = false;
                        }
                        int paddingBottom = view.getPaddingBottom();
                        int paddingLeft = view.getPaddingLeft();
                        int paddingRight = view.getPaddingRight();
                        if (BottomSheetBehavior.this.r) {
                            BottomSheetBehavior.this.f4o = windowInsetsCompat.j();
                            paddingBottom = haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver.e + BottomSheetBehavior.this.f4o;
                        }
                        if (BottomSheetBehavior.this.q) {
                            paddingLeft = (z2 ? haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver.a : haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver.d) + windowInsetsCompat.i();
                        }
                        if (BottomSheetBehavior.this.p) {
                            paddingRight = (z2 ? haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver.d : haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver.a) + windowInsetsCompat.f();
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        if (z) {
                            BottomSheetBehavior.this.f = windowInsetsCompat.e().d;
                        }
                        if (BottomSheetBehavior.this.r || z) {
                            BottomSheetBehavior.this.d(false);
                        }
                        return windowInsetsCompat;
                    }
                });
            }
            this.A = new WeakReference<>(v);
            if (this.V && (jenisKodeBankDialog = this.l) != null) {
                findFragmentByWho.b(v, jenisKodeBankDialog);
            }
            JenisKodeBankDialog jenisKodeBankDialog2 = this.l;
            if (jenisKodeBankDialog2 != null) {
                float f = this.b;
                float f2 = f;
                if (f == -1.0f) {
                    f2 = findFragmentByWho.j(v);
                }
                jenisKodeBankDialog2.l(f2);
                boolean z2 = this.u == 3;
                this.K = z2;
                JenisKodeBankDialog jenisKodeBankDialog3 = this.l;
                float f3 = z2 ? 0.0f : 1.0f;
                if (jenisKodeBankDialog3.F.i != f3) {
                    jenisKodeBankDialog3.F.i = f3;
                    jenisKodeBankDialog3.H = true;
                    jenisKodeBankDialog3.invalidateSelf();
                }
            }
            d();
            if (findFragmentByWho.l(v) == 0) {
                findFragmentByWho.j(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.M;
            if (measuredWidth > i2 && i2 != -1) {
                final ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.M;
                v.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.setLayoutParams(layoutParams);
                    }
                });
            }
        }
        if (this.z == null) {
            this.z = getReturnTransition.a(coordinatorLayout, this.D);
        }
        int top = v.getTop();
        coordinatorLayout.d(v, i);
        this.v = coordinatorLayout.getWidth();
        this.s = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.C = height;
        int i3 = this.s;
        int i4 = this.k;
        if (i3 - height < i4) {
            if (this.R) {
                this.C = i3;
            } else {
                this.C = i3 - i4;
            }
        }
        this.j = Math.max(0, i3 - this.C);
        this.g = (int) (((float) this.s) * (1.0f - this.m));
        b();
        int i5 = this.u;
        if (i5 == 3) {
            findFragmentByWho.e(v, a());
        } else if (i5 == 6) {
            findFragmentByWho.e(v, this.g);
        } else if (this.n && i5 == 5) {
            findFragmentByWho.e(v, this.s);
        } else if (i5 == 4) {
            findFragmentByWho.e(v, this.a);
        } else if (i5 == 1 || i5 == 2) {
            findFragmentByWho.e(v, top - v.getTop());
        }
        this.t = new WeakReference<>(e(v));
        return true;
    }

    public final boolean e(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        getReturnTransition getreturntransition = this.z;
        if (getreturntransition != null) {
            getreturntransition.a(motionEvent);
        }
        if (actionMasked == 0) {
            this.c = -1;
            VelocityTracker velocityTracker = this.ab;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.ab = null;
            }
        }
        if (this.ab == null) {
            this.ab = VelocityTracker.obtain();
        }
        this.ab.addMovement(motionEvent);
        if (this.z != null && actionMasked == 2 && !this.I && Math.abs(((float) this.G) - motionEvent.getY()) > ((float) this.z.i)) {
            this.z.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.I;
    }
}
