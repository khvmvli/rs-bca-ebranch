package o;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes2-dex2jar.jar:o/chooseKeperluanMendadak.class */
public final class chooseKeperluanMendadak extends setContentHeight {
    BottomSheetBehavior<FrameLayout> a;
    FrameLayout b;
    boolean c;
    boolean d;
    BottomSheetBehavior.read e;
    private FrameLayout f;
    boolean g;
    boolean h;
    private CoordinatorLayout i;
    BottomSheetBehavior.read j;

    /* renamed from: o  reason: collision with root package name */
    private boolean f58o;

    /* loaded from: classes2-dex2jar.jar:o/chooseKeperluanMendadak$write.class */
    static final class write extends BottomSheetBehavior.read {
        private final boolean a;
        private final boolean b;
        private final WindowInsetsCompat e;

        private write(View view, WindowInsetsCompat windowInsetsCompat) {
            this.e = windowInsetsCompat;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.a = z3;
            JenisKodeBankDialog jenisKodeBankDialog = BottomSheetBehavior.a(view).l;
            ColorStateList c = jenisKodeBankDialog != null ? jenisKodeBankDialog.F.d : findFragmentByWho.c(view);
            if (c != null) {
                int defaultColor = c.getDefaultColor();
                if (defaultColor == 0 || isRound.e(defaultColor) <= 0.5d) {
                    z2 = false;
                }
                this.b = z2;
            } else if (view.getBackground() instanceof ColorDrawable) {
                int color = ((ColorDrawable) view.getBackground()).getColor();
                if (color == 0 || isRound.e(color) <= 0.5d) {
                    z = false;
                }
                this.b = z;
            } else {
                this.b = z3;
            }
        }

        /* synthetic */ write(View view, WindowInsetsCompat windowInsetsCompat, byte b) {
            this(view, windowInsetsCompat);
        }

        private void e(View view) {
            if (view.getTop() < this.e.h()) {
                chooseKeperluanMendadak.d(view, this.b);
                view.setPadding(view.getPaddingLeft(), this.e.h() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                chooseKeperluanMendadak.d(view, this.a);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.read
        public final void d(View view) {
            e(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.read
        public final void e(View view, int i) {
            e(view);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public chooseKeperluanMendadak(android.content.Context r8, int r9) {
        /*
            r7 = this;
            r0 = r9
            r10 = r0
            r0 = r9
            if (r0 != 0) goto L_0x002c
            android.util.TypedValue r0 = new android.util.TypedValue
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r8
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r1 = o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.h
            r2 = r11
            r3 = 1
            boolean r0 = r0.resolveAttribute(r1, r2, r3)
            if (r0 == 0) goto L_0x0028
            r0 = r11
            int r0 = r0.resourceId
            r10 = r0
            goto L_0x002c
        L_0x0028:
            int r0 = o.BaseDialogKotlin.MediaDescriptionCompat.a
            r10 = r0
        L_0x002c:
            r0 = r7
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2)
            r0 = r7
            r1 = 1
            r0.c = r1
            r0 = r7
            r1 = 1
            r0.d = r1
            r0 = r7
            o.chooseKeperluanMendadak$1 r1 = new o.chooseKeperluanMendadak$1
            r2 = r1
            r3 = r7
            r2.<init>()
            r0.e = r1
            r0 = r7
            r1 = 1
            boolean r0 = r0.a(r1)
            r0 = r7
            r1 = r7
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            int[] r2 = new int[r2]
            r3 = r2
            r4 = 0
            int r5 = o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.w
            r3[r4] = r5
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            r2 = 0
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.f58o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseKeperluanMendadak.<init>(android.content.Context, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View d(int i, View view, ViewGroup.LayoutParams layoutParams) {
        b();
        CoordinatorLayout findViewById = this.f.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.c);
        View view2 = view;
        if (i != 0) {
            view2 = view;
            if (view == null) {
                view2 = getLayoutInflater().inflate(i, (ViewGroup) findViewById, false);
            }
        }
        if (this.f58o) {
            findFragmentByWho.d(this.b, new instantiate() { // from class: o.chooseKeperluanMendadak.5
                public final WindowInsetsCompat d(View view3, WindowInsetsCompat windowInsetsCompat) {
                    if (chooseKeperluanMendadak.this.j != null) {
                        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = chooseKeperluanMendadak.this.a;
                        bottomSheetBehavior.d.remove(chooseKeperluanMendadak.this.j);
                    }
                    if (windowInsetsCompat != null) {
                        chooseKeperluanMendadak choosekeperluanmendadak = chooseKeperluanMendadak.this;
                        choosekeperluanmendadak.j = new write(choosekeperluanmendadak.b, windowInsetsCompat, (byte) 0);
                        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = chooseKeperluanMendadak.this.a;
                        BottomSheetBehavior.read read = chooseKeperluanMendadak.this.j;
                        if (!bottomSheetBehavior2.d.contains(read)) {
                            bottomSheetBehavior2.d.add(read);
                        }
                    }
                    return windowInsetsCompat;
                }
            });
        }
        this.b.removeAllViews();
        if (layoutParams == null) {
            this.b.addView(view2);
        } else {
            this.b.addView(view2, layoutParams);
        }
        findViewById.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.Z).setOnClickListener(new View.OnClickListener() { // from class: o.chooseKeperluanMendadak.3
            /* JADX WARN: Type inference failed for: r0v13, types: [android.app.Dialog, o.chooseKeperluanMendadak] */
            /* JADX WARN: Type inference failed for: r0v4, types: [android.app.Dialog, o.chooseKeperluanMendadak] */
            /* JADX WARN: Type inference failed for: r0v7, types: [android.app.Dialog, o.chooseKeperluanMendadak] */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // android.view.View.OnClickListener
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    r0 = r6
                    o.chooseKeperluanMendadak r0 = o.chooseKeperluanMendadak.this
                    boolean r0 = r0.c
                    if (r0 == 0) goto L_0x0051
                    r0 = r6
                    o.chooseKeperluanMendadak r0 = o.chooseKeperluanMendadak.this
                    boolean r0 = r0.isShowing()
                    if (r0 == 0) goto L_0x0051
                    r0 = r6
                    o.chooseKeperluanMendadak r0 = o.chooseKeperluanMendadak.this
                    r8 = r0
                    r0 = r8
                    boolean r0 = r0.g
                    if (r0 != 0) goto L_0x0043
                    r0 = r8
                    android.content.Context r0 = r0.getContext()
                    r1 = 1
                    int[] r1 = new int[r1]
                    r2 = r1
                    r3 = 0
                    r4 = 16843611(0x101035b, float:2.3695965E-38)
                    r2[r3] = r4
                    android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
                    r7 = r0
                    r0 = r8
                    r1 = r7
                    r2 = 0
                    r3 = 1
                    boolean r1 = r1.getBoolean(r2, r3)
                    r0.d = r1
                    r0 = r7
                    r0.recycle()
                    r0 = r8
                    r1 = 1
                    r0.g = r1
                L_0x0043:
                    r0 = r8
                    boolean r0 = r0.d
                    if (r0 == 0) goto L_0x0051
                    r0 = r6
                    o.chooseKeperluanMendadak r0 = o.chooseKeperluanMendadak.this
                    r0.cancel()
                L_0x0051:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.chooseKeperluanMendadak.AnonymousClass3.onClick(android.view.View):void");
            }
        });
        findFragmentByWho.d(this.b, new onDismiss() { // from class: o.chooseKeperluanMendadak.4
            public final void b(View view3, getChildFragmentManager getchildfragmentmanager) {
                b(view3, getchildfragmentmanager);
                if (chooseKeperluanMendadak.this.c) {
                    getchildfragmentmanager.e(1048576);
                    getchildfragmentmanager.g(true);
                    return;
                }
                getchildfragmentmanager.g(false);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [android.app.Dialog, o.chooseKeperluanMendadak] */
            public final boolean b(View view3, int i2, Bundle bundle) {
                if (i2 != 1048576 || !chooseKeperluanMendadak.this.c) {
                    return b(view3, i2, bundle);
                }
                chooseKeperluanMendadak.this.cancel();
                return true;
            }
        });
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: o.chooseKeperluanMendadak.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.f;
    }

    public static void d(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FrameLayout b() {
        if (this.f == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), BaseDialogKotlin$MediaBrowserCompat$MediaItem.d, null);
            this.f = frameLayout;
            this.i = frameLayout.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.c);
            FrameLayout frameLayout2 = (FrameLayout) this.f.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.a);
            this.b = frameLayout2;
            BottomSheetBehavior<FrameLayout> a = BottomSheetBehavior.a(frameLayout2);
            this.a = a;
            BottomSheetBehavior.read read = this.e;
            if (!a.d.contains(read)) {
                a.d.add(read);
            }
            this.a.e(this.c);
        }
        return this.f;
    }

    public final void cancel() {
        if (this.a == null) {
            b();
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
        if (!this.h || bottomSheetBehavior.u == 5) {
            cancel();
        } else {
            bottomSheetBehavior.b(5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f58o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    protected final void onStart() {
        onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.u == 5) {
            this.a.b(4);
        }
    }

    public final void setCancelable(boolean z) {
        setCancelable(z);
        if (this.c != z) {
            this.c = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.e(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        setCanceledOnTouchOutside(z);
        if (z && !this.c) {
            this.c = true;
        }
        this.d = z;
        this.g = true;
    }

    public final void setContentView(int i) {
        setContentView(d(i, null, null));
    }

    public final void setContentView(View view) {
        setContentView(d(0, view, null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setContentView(d(0, view, layoutParams));
    }
}
