package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.BaseDialogKotlin$MediaSessionCompat$Token;
import o.CameraDialog;
import o.CameraDialog_ViewBinding;
import o.CancelAskTransaksiDialog_ViewBinding;
import o.HaloBCADialog;
import o.JenisKodeBankDialog;
import o.findFragmentByWho;
import o.getChildFragmentManager;
import o.getContext;
import o.getInsetsForType;
import o.getPopEnterAnim;
import o.onViewStateRestored;
import o.setPrimaryBackground;
import o.unbindViews;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout.class */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.MediaBrowserCompat.CustomActionResultReceiver {
    private static final int e = BaseDialogKotlin.MediaDescriptionCompat.j;
    boolean a;
    int b;
    WindowInsetsCompat c;
    boolean d;
    private int f;
    private ValueAnimator g;
    private int h;
    private WeakReference<View> i;
    private int j;
    private boolean k;
    private int l;
    private List<Object> m;
    private boolean n;

    /* renamed from: o */
    private boolean f2o;
    private int[] p;
    private Drawable q;
    private int s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$BaseBehavior.class */
    public static class BaseBehavior<T extends AppBarLayout> extends CameraDialog_ViewBinding<T> {
        private WeakReference<View> a;
        private int b;
        int c;
        private ValueAnimator e;
        private float g;
        private IconCompatParcelizer h;
        private boolean i;
        private int j = -1;

        /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$BaseBehavior$IconCompatParcelizer.class */
        public static abstract class IconCompatParcelizer<T extends AppBarLayout> {
            public abstract boolean e();
        }

        /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$BaseBehavior$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer extends getPopEnterAnim {
            public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<RemoteActionCompatParcelizer>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.RemoteActionCompatParcelizer.3
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new RemoteActionCompatParcelizer(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ RemoteActionCompatParcelizer createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new RemoteActionCompatParcelizer(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new RemoteActionCompatParcelizer[i];
                }
            };
            int a;
            float c;
            boolean e;

            public RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.c = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            public RemoteActionCompatParcelizer(Parcelable parcelable) {
                super(parcelable);
            }

            public final void writeToParcel(Parcel parcel, int i) {
                writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.c);
                parcel.writeByte(this.e ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
            if (r0 >= ((r0 - r0) - (r0 != null ? r0.h() : 0))) goto L_0x00d5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
            if (r0 < ((r0 - r0) - (r0 != null ? r0.h() : 0))) goto L_0x00db;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
            r15 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private void b(androidx.coordinatorlayout.widget.CoordinatorLayout r5, T r6, int r7, int r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 348
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private void c(final CoordinatorLayout coordinatorLayout, final T t) {
            findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.D.e());
            findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.C.e());
            final View e = e(coordinatorLayout);
            if (e != null && t.i() != 0 && (e.getLayoutParams().g instanceof ScrollingViewBehavior)) {
                if (d() + this.c != (-t.i()) && e.canScrollVertically(1)) {
                    findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.D, (CharSequence) null, new getContext(false) { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.5
                        public final boolean b(View view) {
                            t.setExpanded(true);
                            return true;
                        }
                    });
                }
                if (d() + this.c == 0) {
                    return;
                }
                if (e.canScrollVertically(-1)) {
                    final int i = -t.e();
                    if (i != 0) {
                        findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.C, (CharSequence) null, new getContext() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                            /* JADX WARN: Multi-variable type inference failed */
                            public final boolean b(View view) {
                                BaseBehavior.this.c(coordinatorLayout, t, e, 0, i, new int[]{0, 0}, 1);
                                return true;
                            }
                        });
                        return;
                    }
                    return;
                }
                findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.C, (CharSequence) null, new getContext(true) { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.5
                    public final boolean b(View view) {
                        t.setExpanded(true);
                        return true;
                    }
                });
            }
        }

        private static View e(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof onViewStateRestored) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private void e(CoordinatorLayout coordinatorLayout, T t) {
            boolean z;
            int i;
            int i2;
            int d = d() + this.c;
            int childCount = t.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= childCount) {
                    i4 = -1;
                    break;
                }
                View childAt = t.getChildAt(i4);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                write write = (write) childAt.getLayoutParams();
                int i5 = top;
                int i6 = bottom;
                if ((write.e & 32) == 32) {
                    i5 = top - write.topMargin;
                    i6 = bottom + write.bottomMargin;
                }
                int i7 = -d;
                if (i5 <= i7 && i6 >= i7) {
                    break;
                }
                i4++;
            }
            if (i4 >= 0) {
                View childAt2 = t.getChildAt(i4);
                write write2 = (write) childAt2.getLayoutParams();
                int i8 = write2.e;
                if ((i8 & 17) == 17) {
                    int i9 = -childAt2.getTop();
                    int i10 = -childAt2.getBottom();
                    int i11 = i10;
                    if (i4 == t.getChildCount() - 1) {
                        WindowInsetsCompat windowInsetsCompat = t.c;
                        i11 = i10 + (windowInsetsCompat != null ? windowInsetsCompat.h() : 0);
                    }
                    if ((i8 & 2) == 2) {
                        i2 = i11 + findFragmentByWho.m(childAt2);
                        i = i9;
                    } else {
                        i = i9;
                        i2 = i11;
                        if ((i8 & 5) == 5) {
                            i2 = findFragmentByWho.m(childAt2) + i11;
                            if (d < i2) {
                                i = i2;
                                i2 = i11;
                            } else {
                                i = i9;
                            }
                        }
                    }
                    if ((i8 & 32) != 32) {
                        z = false;
                    }
                    int i12 = i;
                    int i13 = i2;
                    if (z) {
                        i12 = i + write2.topMargin;
                        i13 = i2 - write2.bottomMargin;
                    }
                    i3 = i12;
                    if (d < (i13 + i12) / 2) {
                        i3 = i13;
                    }
                    int i14 = -t.i();
                    if (i3 < i14) {
                        i3 = i14;
                    } else if (i3 > 0) {
                    }
                    e(coordinatorLayout, t, i3, 0.0f);
                }
            }
        }

        private void e(final CoordinatorLayout coordinatorLayout, final T t, int i, float f) {
            int abs = Math.abs((d() + this.c) - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            int d = d() + this.c;
            if (d == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.e.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(unbindViews.b);
                this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        BaseBehavior.this.a(coordinatorLayout, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration((long) Math.min(round, 600));
            this.e.setIntValues(d, i);
            this.e.start();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.CameraDialog_ViewBinding
        public final /* synthetic */ int a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int d = d() + this.c;
            int i7 = 0;
            if (i2 == 0 || d < i2 || d > i3) {
                this.c = 0;
                i4 = 0;
            } else {
                if (i < i2) {
                    i = i2;
                } else if (i > i3) {
                    i = i3;
                }
                i4 = 0;
                if (d != i) {
                    if (appBarLayout.d) {
                        int abs = Math.abs(i);
                        int childCount = appBarLayout.getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i8);
                            write write = (write) childAt.getLayoutParams();
                            Interpolator interpolator = write.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i8++;
                            } else if (interpolator != null) {
                                int i9 = write.e;
                                if ((i9 & 1) != 0) {
                                    int height = childAt.getHeight() + write.topMargin + write.bottomMargin + 0;
                                    i6 = height;
                                    if ((i9 & 2) != 0) {
                                        i6 = height - findFragmentByWho.m(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                int i10 = i6;
                                if (findFragmentByWho.h(childAt)) {
                                    WindowInsetsCompat windowInsetsCompat = appBarLayout.c;
                                    if (windowInsetsCompat != null) {
                                        i7 = windowInsetsCompat.h();
                                    }
                                    i10 = i6 - i7;
                                }
                                if (i10 > 0) {
                                    int top = childAt.getTop();
                                    float f = (float) i10;
                                    i5 = Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - top)) / f)));
                                }
                            }
                        }
                    }
                    i5 = i;
                    boolean a = a(i5);
                    this.c = i - i5;
                    if (!a && appBarLayout.d) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.b(d());
                    b(coordinatorLayout, appBarLayout, i, i < d ? -1 : 1, false);
                    i4 = d - i;
                }
            }
            c(coordinatorLayout, appBarLayout);
            return i4;
        }

        /* renamed from: a */
        public void d(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.b == 0 || i == 1) {
                e(coordinatorLayout, (CoordinatorLayout) t);
                if (t.a) {
                    t.c(t.d(view));
                }
            }
            this.a = new WeakReference<>(view);
        }

        /* renamed from: a */
        public boolean e(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean e = e(coordinatorLayout, (CoordinatorLayout) t, i);
            int i3 = t.b;
            int i4 = this.j;
            int i5 = 0;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = t.getChildAt(i4);
                int i6 = -childAt.getBottom();
                if (this.i) {
                    int m = findFragmentByWho.m(childAt);
                    WindowInsetsCompat windowInsetsCompat = t.c;
                    i2 = m + (windowInsetsCompat != null ? windowInsetsCompat.h() : 0);
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.g);
                }
                a(coordinatorLayout, t, i6 + i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i7 = -t.i();
                    if (z) {
                        e(coordinatorLayout, t, i7, 0.0f);
                    } else {
                        a(coordinatorLayout, t, i7, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        e(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        a(coordinatorLayout, t, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                }
            }
            t.b = 0;
            this.j = -1;
            int d = d();
            i5 = -t.i();
            if (d >= i5 && d <= 0) {
                i5 = d;
            }
            a(i5);
            b(coordinatorLayout, t, d(), 0, true);
            t.b(d());
            c(coordinatorLayout, t);
            return e;
        }

        @Override // o.CameraDialog_ViewBinding
        public final int b() {
            return d() + this.c;
        }

        @Override // o.CameraDialog_ViewBinding
        public final /* synthetic */ int b(View view) {
            return -((AppBarLayout) view).a();
        }

        /* JADX WARN: Type inference failed for: r0v19, types: [android.os.Parcelable, com.google.android.material.appbar.AppBarLayout$BaseBehavior$RemoteActionCompatParcelizer] */
        /* JADX WARN: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public android.os.Parcelable a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, T r6) {
            /*
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                android.os.Parcelable r0 = r0.a(r1, r2)
                r7 = r0
                r0 = r4
                int r0 = r0.d()
                r8 = r0
                r0 = r6
                int r0 = r0.getChildCount()
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
            L_0x0019:
                r0 = r11
                r1 = r9
                if (r0 >= r1) goto L_0x0091
                r0 = r6
                r1 = r11
                android.view.View r0 = r0.getChildAt(r1)
                r5 = r0
                r0 = r5
                int r0 = r0.getBottom()
                r1 = r8
                int r0 = r0 + r1
                r12 = r0
                r0 = r5
                int r0 = r0.getTop()
                r1 = r8
                int r0 = r0 + r1
                if (r0 > 0) goto L_0x008b
                r0 = r12
                if (r0 < 0) goto L_0x008b
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$RemoteActionCompatParcelizer r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$RemoteActionCompatParcelizer
                r1 = r0
                r2 = r7
                r1.<init>(r2)
                r7 = r0
                r0 = r7
                r1 = r11
                r0.a = r1
                r0 = r5
                int r0 = o.findFragmentByWho.m(r0)
                r9 = r0
                r0 = r6
                androidx.core.view.WindowInsetsCompat r0 = r0.c
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L_0x0066
                r0 = r6
                int r0 = r0.h()
                r11 = r0
                goto L_0x0069
            L_0x0066:
                r0 = 0
                r11 = r0
            L_0x0069:
                r0 = r12
                r1 = r9
                r2 = r11
                int r1 = r1 + r2
                if (r0 != r1) goto L_0x0076
                r0 = 1
                r10 = r0
            L_0x0076:
                r0 = r7
                r1 = r10
                r0.e = r1
                r0 = r7
                r1 = r12
                float r1 = (float) r1
                r2 = r5
                int r2 = r2.getHeight()
                float r2 = (float) r2
                float r1 = r1 / r2
                r0.c = r1
                r0 = r7
                return r0
            L_0x008b:
                int r11 = r11 + 1
                goto L_0x0019
            L_0x0091:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout):android.os.Parcelable");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return b(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        public boolean b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (t.getLayoutParams().height != -2) {
                return b(coordinatorLayout, (View) t, i, i2, i3, i4);
            }
            coordinatorLayout.d(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // o.CameraDialog_ViewBinding
        public final /* synthetic */ int c(View view) {
            return ((AppBarLayout) view).i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            e(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        @Override // o.CameraDialog_ViewBinding
        public final /* synthetic */ boolean d(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            IconCompatParcelizer iconCompatParcelizer = this.h;
            if (iconCompatParcelizer != null) {
                return iconCompatParcelizer.e();
            }
            WeakReference<View> weakReference = this.a;
            boolean z = true;
            if (weakReference != null) {
                View view2 = weakReference.get();
                z = view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return d(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        public boolean d(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) != 0) {
                z = true;
                if (!t.a) {
                    if ((t.i() != 0) && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                        z = true;
                    }
                }
                if (z && (valueAnimator = this.e) != null) {
                    valueAnimator.cancel();
                }
                this.a = null;
                this.b = i2;
                return z;
            }
            z = false;
            if (z) {
                valueAnimator.cancel();
            }
            this.a = null;
            this.b = i2;
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.CameraDialog_ViewBinding
        public final /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            e(coordinatorLayout, (CoordinatorLayout) appBarLayout);
            if (appBarLayout.a) {
                appBarLayout.c(appBarLayout.d(e(coordinatorLayout)));
            }
        }

        public void e(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) parcelable;
                c(coordinatorLayout, t, ((getPopEnterAnim) remoteActionCompatParcelizer).d);
                this.j = remoteActionCompatParcelizer.a;
                this.g = remoteActionCompatParcelizer.c;
                this.i = remoteActionCompatParcelizer.e;
                return;
            }
            c(coordinatorLayout, t, parcelable);
            this.j = -1;
        }

        /* renamed from: e */
        public void d(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = a(coordinatorLayout, t, b() - i4, -t.a(), 0);
            }
            if (i4 == 0) {
                c(coordinatorLayout, t);
            }
        }

        /* renamed from: e */
        public void c(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.i();
                    i5 = i6;
                    i4 = t.e() + i6;
                } else {
                    i5 = -t.i();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = a(coordinatorLayout, t, b() - i2, i5, i4);
                }
            }
            if (t.a) {
                t.c(t.d(view));
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$Behavior.class */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            d(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // o.cancelReservationAndTransaction
        public final /* bridge */ /* synthetic */ boolean a(int i) {
            return a(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return e(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ Parcelable b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return a(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return b(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // o.cancelReservationAndTransaction
        public final /* bridge */ /* synthetic */ int d() {
            return d();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return d(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            e(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            d(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            c(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior.class */
    public static class ScrollingViewBehavior extends CameraDialog {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fr);
            c(obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.fv, 0));
            obtainStyledAttributes.recycle();
        }

        private static AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // o.cancelReservationAndTransaction
        public final /* bridge */ /* synthetic */ boolean a(int i) {
            return a(i);
        }

        @Override // o.CameraDialog
        public final float b(View view) {
            int i;
            int i2;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = appBarLayout.i();
            int e = appBarLayout.e();
            BaseBehavior baseBehavior = appBarLayout.getLayoutParams().g;
            if (baseBehavior instanceof BaseBehavior) {
                BaseBehavior baseBehavior2 = baseBehavior;
                i = baseBehavior2.d() + baseBehavior2.c;
            } else {
                i = 0;
            }
            if ((e == 0 || i3 + i > e) && (i2 = i3 - e) != 0) {
                return (((float) i) / ((float) i2)) + 1.0f;
            }
            return 0.0f;
        }

        @Override // o.CameraDialog
        public final /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return b(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.a(view));
            if (a == null) {
                return false;
            }
            rect.offset(view.getLeft(), view.getTop());
            Rect rect2 = this.b;
            rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (rect2.contains(rect)) {
                return false;
            }
            a.setExpanded(false, !z);
            return true;
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            BaseBehavior baseBehavior = view2.getLayoutParams().g;
            if (baseBehavior instanceof BaseBehavior) {
                findFragmentByWho.e(view, (((view2.getBottom() - view.getTop()) + baseBehavior.c) + b()) - a(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.a) {
                return false;
            }
            appBarLayout.c(appBarLayout.d(view));
            return false;
        }

        public final void c(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.D.e());
                findFragmentByWho.c(coordinatorLayout, getChildFragmentManager.read.C.e());
            }
        }

        public final boolean c(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // o.cancelReservationAndTransaction
        public final /* bridge */ /* synthetic */ int d() {
            return d();
        }

        @Override // o.CameraDialog
        public final /* synthetic */ View d(List list) {
            return a(list);
        }

        @Override // o.CameraDialog
        public final int e(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).i() : e(view);
        }

        @Override // o.cancelReservationAndTransaction
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
            return e(coordinatorLayout, view, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/android/material/appbar/AppBarLayout$write.class */
    public static final class write extends LinearLayout.LayoutParams {
        Interpolator c;
        int e;

        public write(int i, int i2) {
            super(-1, -2);
            this.e = 1;
        }

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.f14o);
            this.e = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.k, 0);
            if (obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.l)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.l, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = 1;
        }

        public write(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = 1;
        }

        public write(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = 1;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.d);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public AppBarLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private static write b(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new write((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new write((ViewGroup.MarginLayoutParams) layoutParams) : new write(layoutParams);
    }

    private void b(boolean z, boolean z2, boolean z3) {
        int i = z ? 1 : 2;
        int i2 = 0;
        int i3 = z2 ? 4 : 0;
        if (z3) {
            i2 = 8;
        }
        this.b = i | i3 | i2;
        requestLayout();
    }

    private boolean f() {
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z = false;
            if (childAt.getVisibility() != 8) {
                z = false;
                if (!findFragmentByWho.h(childAt)) {
                    z = true;
                }
            }
        }
        return z;
    }

    final int a() {
        int i;
        int i2 = this.j;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            write write2 = (write) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = write2.topMargin;
            int i6 = write2.bottomMargin;
            int i7 = write2.e;
            i = i3;
            if ((i7 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + i5 + i6;
            if ((i7 & 2) != 0) {
                i = i3 - findFragmentByWho.m(childAt);
                break;
            }
            i4++;
        }
        int max = Math.max(0, i);
        this.j = max;
        return max;
    }

    public final int b() {
        WindowInsetsCompat windowInsetsCompat = this.c;
        int i = 0;
        int h = windowInsetsCompat != null ? windowInsetsCompat.h() : 0;
        int m = findFragmentByWho.m(this);
        if (m != 0) {
            i = m;
        } else {
            int childCount = getChildCount();
            if (childCount > 0) {
                i = findFragmentByWho.m(getChildAt(childCount - 1));
            }
            if (i == 0) {
                return getHeight() / 3;
            }
        }
        return (i << 1) + h;
    }

    final void b(int i) {
        this.h = i;
        if (!willNotDraw()) {
            findFragmentByWho.K(this);
        }
        List<Object> list = this.m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.m.get(i2);
            }
        }
    }

    public final CoordinatorLayout.write<AppBarLayout> c() {
        return new Behavior();
    }

    final boolean c(boolean z) {
        if (this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!this.a || !(getBackground() instanceof JenisKodeBankDialog)) {
            return true;
        }
        final JenisKodeBankDialog jenisKodeBankDialog = (JenisKodeBankDialog) getBackground();
        float dimension = getResources().getDimension(BaseDialogKotlin.read.b);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.g = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(BaseDialogKotlin.MediaMetadataCompat.a));
        this.g.setInterpolator(unbindViews.c);
        this.g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                jenisKodeBankDialog.l(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.g.start();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write;
    }

    boolean d() {
        boolean z = false;
        if (this.q != null) {
            WindowInsetsCompat windowInsetsCompat = this.c;
            z = false;
            if ((windowInsetsCompat != null ? windowInsetsCompat.h() : 0) > 0) {
                z = true;
            }
        }
        return z;
    }

    final boolean d(View view) {
        int i;
        View view2 = null;
        if (this.i == null && (i = this.l) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            View view3 = findViewById;
            if (findViewById == null) {
                view3 = findViewById;
                if (getParent() instanceof ViewGroup) {
                    view3 = ((ViewGroup) getParent()).findViewById(this.l);
                }
            }
            if (view3 != null) {
                this.i = new WeakReference<>(view3);
            }
        }
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        draw(canvas);
        if (d()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.h));
            this.q.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void drawableStateChanged() {
        drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final int e() {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.e():int");
    }

    public final int i() {
        int i;
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            write write2 = (write) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = write2.e;
            i = i3;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = i3 + measuredHeight + write2.topMargin + write2.bottomMargin;
            i3 = i6;
            if (i4 == 0) {
                i3 = i6;
                if (findFragmentByWho.h(childAt)) {
                    WindowInsetsCompat windowInsetsCompat = this.c;
                    i3 = i6 - (windowInsetsCompat != null ? windowInsetsCompat.h() : 0);
                }
            }
            if ((i5 & 2) != 0) {
                i = i3 - findFragmentByWho.m(childAt);
                break;
            }
            i4++;
        }
        int max = Math.max(0, i);
        this.s = max;
        return max;
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            JenisKodeBankDialog jenisKodeBankDialog = (JenisKodeBankDialog) background;
            if (jenisKodeBankDialog.l()) {
                jenisKodeBankDialog.n(HaloBCADialog.c(this));
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected int[] onCreateDrawableState(int i) {
        if (this.p == null) {
            this.p = new int[4];
        }
        int[] iArr = this.p;
        int[] onCreateDrawableState = onCreateDrawableState(i + iArr.length);
        iArr[0] = this.n ? BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.S : -BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.S;
        iArr[1] = (!this.n || !this.k) ? -BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.Q : BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.Q;
        iArr[2] = this.n ? BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.P : -BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.P;
        iArr[3] = (!this.n || !this.k) ? -BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.M : BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.M;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.i = null;
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        onLayout(z, i, i2, i3, i4);
        if (findFragmentByWho.h(this) && f()) {
            WindowInsetsCompat windowInsetsCompat = this.c;
            int h = windowInsetsCompat != null ? windowInsetsCompat.h() : 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                findFragmentByWho.e(getChildAt(childCount), h);
            }
        }
        this.s = -1;
        this.f = -1;
        this.j = -1;
        this.d = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((write) getChildAt(i5).getLayoutParams()).c != null) {
                this.d = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.q;
        if (drawable != null) {
            int width = getWidth();
            WindowInsetsCompat windowInsetsCompat2 = this.c;
            drawable.setBounds(0, 0, width, windowInsetsCompat2 != null ? windowInsetsCompat2.h() : 0);
        }
        if (!this.f2o) {
            boolean z3 = true;
            if (!this.a) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((write) getChildAt(i6).getLayoutParams()).e;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z2 = true;
                        break;
                    }
                    i6++;
                }
                z3 = z2;
            }
            if (this.n != z3) {
                this.n = z3;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && findFragmentByWho.h(this) && f()) {
            int measuredHeight = getMeasuredHeight();
            int i4 = 0;
            if (mode != Integer.MIN_VALUE) {
                i3 = measuredHeight;
                if (mode == 0) {
                    WindowInsetsCompat windowInsetsCompat = this.c;
                    if (windowInsetsCompat != null) {
                        i4 = windowInsetsCompat.h();
                    }
                    i3 = measuredHeight + i4;
                }
            } else {
                int measuredHeight2 = getMeasuredHeight();
                WindowInsetsCompat windowInsetsCompat2 = this.c;
                int h = windowInsetsCompat2 != null ? windowInsetsCompat2.h() : 0;
                int size = View.MeasureSpec.getSize(i2);
                i3 = measuredHeight2 + h;
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 > size) {
                    i3 = size;
                }
            }
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
        this.s = -1;
        this.f = -1;
        this.j = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        setElevation(f);
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            ((JenisKodeBankDialog) background).l(f);
        }
    }

    public void setExpanded(boolean z) {
        setExpanded(z, findFragmentByWho.G(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        b(z, z2, true);
    }

    public void setLiftOnScroll(boolean z) {
        this.a = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.l = i;
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.i = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                getInsetsForType.c(this.q, findFragmentByWho.k(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            setWillNotDraw(true ^ d());
            findFragmentByWho.K(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(setPrimaryBackground.c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        CancelAskTransaksiDialog_ViewBinding.d(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return verifyDrawable(drawable) || drawable == this.q;
    }
}
