package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BaseDialogKotlin;
import o.getChildFragmentManager;
import o.getPathData;
import o.onFindViewById;
@getPathData.MediaBrowserCompat.CustomActionResultReceiver
/* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding.class */
public class KetentuanORDialog_ViewBinding extends HorizontalScrollView {
    private static final int D = BaseDialogKotlin.MediaDescriptionCompat.n;
    private static final onFindViewById.write<KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver> I = new onFindViewById.read(16);
    float A;
    getPathData B;
    boolean C;
    private int E;
    private RemoteActionCompatParcelizer F;
    private IconCompatParcelizer G;
    private KetentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver H;
    private DataSetObserver J;
    private final int K;
    private setScaleX L;
    private final int M;
    private ValueAnimator N;
    private boolean O;
    private RemoteActionCompatParcelizer P;
    private final int Q;
    private final onFindViewById.write<MediaDescriptionCompat> R;
    boolean a;
    int b;
    final read c;
    public final ArrayList<RemoteActionCompatParcelizer> d;
    KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver e;
    final int f;
    int g;
    int h;
    PorterDuff.Mode i;
    ColorStateList j;
    int k;
    int l;
    int m;
    boolean n;

    /* renamed from: o */
    KonfirmasiCallCabangDialog_ViewBinding f38o;
    ColorStateList p;
    int q;
    int r;
    int s;
    int t;
    ColorStateList u;
    int v;
    int w;
    float x;
    Drawable y;
    public final ArrayList<KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver> z;

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements getPathData.IconCompatParcelizer {
        boolean d;

        IconCompatParcelizer() {
            KetentuanORDialog_ViewBinding.this = r4;
        }

        public final void b(getPathData getpathdata, setScaleX setscalex) {
            if (KetentuanORDialog_ViewBinding.this.B == getpathdata) {
                KetentuanORDialog_ViewBinding.this.b(setscalex, this.d);
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$MediaDescriptionCompat.class */
    public final class MediaDescriptionCompat extends LinearLayout {
        ImageView a;
        Drawable b;
        TextView c;
        ImageView d;
        CancelReservasiDialog e;
        KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver g;
        TextView h;
        private View i;
        private View j;
        private int l = 2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(Context context) {
            super(context);
            KetentuanORDialog_ViewBinding.this = r7;
            d(context);
            findFragmentByWho.c(this, r7.q, r7.r, r7.t, r7.s);
            setGravity(17);
            setOrientation(!r7.a ? 1 : 0);
            setClickable(true);
            findFragmentByWho.a(this, getMinimumMaxLifecycleState.e(getContext(), 1002));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void a() {
            FrameLayout frameLayout;
            if (cancelReservationOnly.d) {
                frameLayout = new FrameLayout(getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.e, (ViewGroup) frameLayout, false);
            this.a = imageView;
            frameLayout.addView(imageView, 0);
        }

        private FrameLayout b(View view) {
            FrameLayout frameLayout = null;
            if (view != this.a && view != this.h) {
                return null;
            }
            if (cancelReservationOnly.d) {
                frameLayout = (FrameLayout) view.getParent();
            }
            return frameLayout;
        }

        private void c(View view) {
            if ((this.e != null) && view != null) {
                e(false);
                CancelReservasiDialog cancelReservasiDialog = this.e;
                FrameLayout b = b(view);
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                cancelReservasiDialog.setBounds(rect);
                cancelReservasiDialog.b(view, b);
                WeakReference<FrameLayout> weakReference = cancelReservasiDialog.a;
                FrameLayout frameLayout = null;
                if ((weakReference != null ? weakReference.get() : null) != null) {
                    WeakReference<FrameLayout> weakReference2 = cancelReservasiDialog.a;
                    if (weakReference2 != null) {
                        frameLayout = weakReference2.get();
                    }
                    frameLayout.setForeground(cancelReservasiDialog);
                } else if (!cancelReservationOnly.d) {
                    view.getOverlay().add(cancelReservasiDialog);
                } else {
                    throw new IllegalArgumentException("Trying to reference null customBadgeParent");
                }
                this.j = view;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void d() {
            FrameLayout frameLayout;
            if (cancelReservationOnly.d) {
                frameLayout = new FrameLayout(getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.a, (ViewGroup) frameLayout, false);
            this.h = textView;
            frameLayout.addView(textView);
        }

        private void e(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        private void f() {
            if (this.e != null) {
                e(true);
                View view = this.j;
                if (view != null) {
                    CancelReservasiDialog cancelReservasiDialog = this.e;
                    if (cancelReservasiDialog != null) {
                        if (!cancelReservationOnly.d) {
                            WeakReference<FrameLayout> weakReference = cancelReservasiDialog.a;
                            if ((weakReference != null ? weakReference.get() : null) == null) {
                                view.getOverlay().remove(cancelReservasiDialog);
                            }
                        }
                        WeakReference<FrameLayout> weakReference2 = cancelReservasiDialog.a;
                        (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                    }
                    this.j = null;
                }
            }
        }

        private void h() {
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver;
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2;
            boolean z = false;
            boolean z2 = false;
            if (this.e != null) {
                if (this.i == null) {
                    if (this.a != null && (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 = this.g) != null && ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.d != null) {
                        View view = this.j;
                        ImageView imageView = this.a;
                        if (view != imageView) {
                            f();
                            c(this.a);
                            return;
                        }
                        if (this.e != null) {
                            z2 = true;
                        }
                        if (z2 && imageView == this.j) {
                            CancelReservasiDialog cancelReservasiDialog = this.e;
                            FrameLayout b = b(imageView);
                            Rect rect = new Rect();
                            imageView.getDrawingRect(rect);
                            cancelReservasiDialog.setBounds(rect);
                            cancelReservasiDialog.b(imageView, b);
                            return;
                        }
                        return;
                    } else if (!(this.h == null || (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = this.g) == null || ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.a != 1)) {
                        View view2 = this.j;
                        TextView textView = this.h;
                        if (view2 != textView) {
                            f();
                            c(this.h);
                            return;
                        }
                        if (this.e != null) {
                            z = true;
                        }
                        if (z && textView == this.j) {
                            CancelReservasiDialog cancelReservasiDialog2 = this.e;
                            FrameLayout b2 = b(textView);
                            Rect rect2 = new Rect();
                            textView.getDrawingRect(rect2);
                            cancelReservasiDialog2.setBounds(rect2);
                            cancelReservasiDialog2.b(textView, b2);
                            return;
                        }
                        return;
                    }
                }
                f();
            }
        }

        public final int b() {
            TextView textView = this.h;
            ImageView imageView = this.a;
            View view = this.i;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = new View[]{textView, imageView, view}[i3];
                i = i;
                i2 = i2;
                z = z;
                if (view2 != null) {
                    i = i;
                    i2 = i2;
                    z = z;
                    if (view2.getVisibility() == 0) {
                        i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                        i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                        z = true;
                    }
                }
            }
            return i - i2;
        }

        public final void c() {
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = this.g;
            View view = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null ? ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.i = view;
                TextView textView = this.h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.a.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.c = textView2;
                if (textView2 != null) {
                    this.l = getParentFragment.d(textView2);
                }
                this.d = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.i;
                if (view2 != null) {
                    removeView(view2);
                    this.i = null;
                }
                this.c = null;
                this.d = null;
            }
            if (this.i == null) {
                if (this.a == null) {
                    a();
                }
                Drawable drawable = null;
                if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null) {
                    drawable = null;
                    if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.d != null) {
                        drawable = getInsetsForType.h(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.d).mutate();
                    }
                }
                if (drawable != null) {
                    getInsetsForType.e(drawable, KetentuanORDialog_ViewBinding.this.j);
                    if (KetentuanORDialog_ViewBinding.this.i != null) {
                        getInsetsForType.d(drawable, KetentuanORDialog_ViewBinding.this.i);
                    }
                }
                if (this.h == null) {
                    d();
                    this.l = getParentFragment.d(this.h);
                }
                getParentFragment.e(this.h, KetentuanORDialog_ViewBinding.this.v);
                if (KetentuanORDialog_ViewBinding.this.u != null) {
                    this.h.setTextColor(KetentuanORDialog_ViewBinding.this.u);
                }
                e(this.h, this.a);
                h();
                final ImageView imageView2 = this.a;
                if (imageView2 != null) {
                    imageView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.KetentuanORDialog_ViewBinding.MediaDescriptionCompat.5
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            if (r0.getVisibility() == 0) {
                                MediaDescriptionCompat.this.e(r0);
                            }
                        }
                    });
                }
                final TextView textView3 = this.h;
                if (textView3 != null) {
                    textView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.KetentuanORDialog_ViewBinding.MediaDescriptionCompat.5
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            if (textView3.getVisibility() == 0) {
                                MediaDescriptionCompat.this.e(textView3);
                            }
                        }
                    });
                }
            } else {
                TextView textView4 = this.c;
                if (!(textView4 == null && this.d == null)) {
                    e(textView4, this.d);
                }
            }
            if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null && !TextUtils.isEmpty(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.c)) {
                setContentDescription(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.c);
            }
            setSelected(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null && ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.d());
        }

        void d(Context context) {
            GradientDrawable gradientDrawable = null;
            if (KetentuanORDialog_ViewBinding.this.f != 0) {
                Drawable c = setPrimaryBackground.c(context, KetentuanORDialog_ViewBinding.this.f);
                this.b = c;
                if (c != null && c.isStateful()) {
                    this.b.setState(getDrawableState());
                }
            } else {
                this.b = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable drawable = gradientDrawable2;
            if (KetentuanORDialog_ViewBinding.this.p != null) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(1.0E-5f);
                gradientDrawable.setColor(-1);
                ColorStateList e = InfoDialog_ViewBinding.e(KetentuanORDialog_ViewBinding.this.p);
                if (KetentuanORDialog_ViewBinding.this.C) {
                    gradientDrawable2 = null;
                }
                if (KetentuanORDialog_ViewBinding.this.C) {
                }
                drawable = new RippleDrawable(e, gradientDrawable2, gradientDrawable);
            }
            findFragmentByWho.b(this, drawable);
            KetentuanORDialog_ViewBinding.this.invalidate();
        }

        @Override // android.view.View, android.view.ViewGroup
        protected final void drawableStateChanged() {
            drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.b;
            boolean z = false;
            if (drawable != null) {
                z = false;
                if (drawable.isStateful()) {
                    z = false | this.b.setState(drawableState);
                }
            }
            if (z) {
                invalidate();
                KetentuanORDialog_ViewBinding.this.invalidate();
            }
        }

        public final int e() {
            TextView textView = this.h;
            ImageView imageView = this.a;
            View view = this.i;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = new View[]{textView, imageView, view}[i3];
                i = i;
                i2 = i2;
                z = z;
                if (view2 != null) {
                    i = i;
                    i2 = i2;
                    z = z;
                    if (view2.getVisibility() == 0) {
                        i2 = z ? Math.min(i2, view2.getTop()) : view2.getTop();
                        i = z ? Math.max(i, view2.getBottom()) : view2.getBottom();
                        z = true;
                    }
                }
            }
            return i - i2;
        }

        void e(View view) {
            if ((this.e != null) && view == this.j) {
                CancelReservasiDialog cancelReservasiDialog = this.e;
                FrameLayout b = b(view);
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                cancelReservasiDialog.setBounds(rect);
                cancelReservasiDialog.b(view, b);
            }
        }

        void e(TextView textView, ImageView imageView) {
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = this.g;
            CharSequence charSequence = null;
            Drawable mutate = (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver == null || ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.d == null) ? null : getInsetsForType.h(this.g.d).mutate();
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 = this.g;
            charSequence = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 != null ? ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.j : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.g.a == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int applyDimension = (!z || imageView.getVisibility() != 0) ? 0 : (int) TypedValue.applyDimension(1, (float) 8, getContext().getResources().getDisplayMetrics());
                if (KetentuanORDialog_ViewBinding.this.a) {
                    if (applyDimension != requireDialog.a(marginLayoutParams)) {
                        requireDialog.c(marginLayoutParams, applyDimension);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (applyDimension != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = applyDimension;
                    requireDialog.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver3 = this.g;
            if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver3 != null) {
                charSequence = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver3.c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                }
                setOnSearchClickListener.b(this, charSequence);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            CancelReservasiDialog cancelReservasiDialog = this.e;
            if (cancelReservasiDialog != null && cancelReservasiDialog.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) contentDescription);
                sb.append(", ");
                CancelReservasiDialog cancelReservasiDialog2 = this.e;
                if (!cancelReservasiDialog2.isVisible()) {
                    obj = null;
                } else {
                    if (cancelReservasiDialog2.d.h != -1) {
                        obj = null;
                        if (cancelReservasiDialog2.d.g > 0) {
                            Context context = cancelReservasiDialog2.e.get();
                            obj = context == null ? null : cancelReservasiDialog2.a() <= cancelReservasiDialog2.c ? context.getResources().getQuantityString(cancelReservasiDialog2.d.g, cancelReservasiDialog2.a(), Integer.valueOf(cancelReservasiDialog2.a())) : context.getString(cancelReservasiDialog2.d.c, Integer.valueOf(cancelReservasiDialog2.c));
                        }
                    } else {
                        obj = cancelReservasiDialog2.d.f;
                    }
                }
                sb.append(obj);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
            getChildFragmentManager d = getChildFragmentManager.d(accessibilityNodeInfo);
            d.b(getChildFragmentManager.IconCompatParcelizer.c(0, 1, this.g.i, 1, false, isSelected()));
            if (isSelected()) {
                d.d(false);
                d.b(getChildFragmentManager.read.d);
            }
            d.g(getResources().getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.f));
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
            if ((r0.getLineWidth(0) * (r13 / r0.getPaint().getTextSize())) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0123;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
            if (r0 > r0) goto L_0x002a;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void onMeasure(int r5, int r6) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: o.KetentuanORDialog_ViewBinding.MediaDescriptionCompat.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = performClick();
            boolean z = performClick;
            if (this.g != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = this.g;
                KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.h;
                if (ketentuanORDialog_ViewBinding != null) {
                    ketentuanORDialog_ViewBinding.a(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            return z;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            isSelected();
            setSelected(z);
            TextView textView = this.h;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.a;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.i;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    @Deprecated
    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<T extends KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver> {
        void b(T t);
    }

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$read.class */
    public final class read extends LinearLayout {
        ValueAnimator a;
        float c;
        int e = -1;
        private int b = -1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Context context) {
            super(context);
            KetentuanORDialog_ViewBinding.this = r4;
            setWillNotDraw(false);
        }

        private void b() {
            View childAt = getChildAt(this.e);
            KonfirmasiCallCabangDialog_ViewBinding konfirmasiCallCabangDialog_ViewBinding = KetentuanORDialog_ViewBinding.this.f38o;
            KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = KetentuanORDialog_ViewBinding.this;
            Drawable drawable = ketentuanORDialog_ViewBinding.y;
            RectF a = KonfirmasiCallCabangDialog_ViewBinding.a(ketentuanORDialog_ViewBinding, childAt);
            drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        }

        void a(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                KonfirmasiCallCabangDialog_ViewBinding konfirmasiCallCabangDialog_ViewBinding = KetentuanORDialog_ViewBinding.this.f38o;
                KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = KetentuanORDialog_ViewBinding.this;
                konfirmasiCallCabangDialog_ViewBinding.d(ketentuanORDialog_ViewBinding, view, view2, f, ketentuanORDialog_ViewBinding.y);
            } else {
                KetentuanORDialog_ViewBinding.this.y.setBounds(-1, KetentuanORDialog_ViewBinding.this.y.getBounds().top, -1, KetentuanORDialog_ViewBinding.this.y.getBounds().bottom);
            }
            findFragmentByWho.K(this);
        }

        void b(boolean z, final int i, int i2) {
            final View childAt = getChildAt(this.e);
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                b();
                return;
            }
            AnonymousClass2 r0 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.KetentuanORDialog_ViewBinding.read.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    read.this.a(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.a = valueAnimator;
                valueAnimator.setInterpolator(unbindViews.d);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(r0);
                valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: o.KetentuanORDialog_ViewBinding.read.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        read.this.e = i;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        read.this.e = i;
                    }
                });
                valueAnimator.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(r0);
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int i;
            int height = KetentuanORDialog_ViewBinding.this.y.getBounds().height();
            int i2 = height;
            if (height < 0) {
                i2 = KetentuanORDialog_ViewBinding.this.y.getIntrinsicHeight();
            }
            int i3 = KetentuanORDialog_ViewBinding.this.k;
            if (i3 == 0) {
                i = getHeight() - i2;
                i2 = getHeight();
            } else if (i3 != 1) {
                i = 0;
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = 0;
                        i = 0;
                    } else {
                        i2 = getHeight();
                        i = 0;
                    }
                }
            } else {
                i = (getHeight() - i2) / 2;
                i2 = (getHeight() + i2) / 2;
            }
            if (KetentuanORDialog_ViewBinding.this.y.getBounds().width() > 0) {
                Rect bounds = KetentuanORDialog_ViewBinding.this.y.getBounds();
                KetentuanORDialog_ViewBinding.this.y.setBounds(bounds.left, i, bounds.right, i2);
                Drawable drawable = KetentuanORDialog_ViewBinding.this.y;
                Drawable drawable2 = drawable;
                if (KetentuanORDialog_ViewBinding.this.w != 0) {
                    drawable2 = getInsetsForType.h(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable2.setColorFilter(KetentuanORDialog_ViewBinding.this.w, PorterDuff.Mode.SRC_IN);
                    } else {
                        getInsetsForType.b(drawable2, KetentuanORDialog_ViewBinding.this.w);
                    }
                }
                drawable2.draw(canvas);
            }
            draw(canvas);
        }

        final void e(int i) {
            Rect bounds = KetentuanORDialog_ViewBinding.this.y.getBounds();
            KetentuanORDialog_ViewBinding.this.y.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                b();
            } else {
                b(false, this.e, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected final void onMeasure(int i, int i2) {
            onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (KetentuanORDialog_ViewBinding.this.h == 1 || KetentuanORDialog_ViewBinding.this.b == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        i3 = i3;
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) TypedValue.applyDimension(1, (float) 16, getContext().getResources().getDisplayMetrics())) << 1)) {
                            z = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z = true;
                                }
                            }
                        } else {
                            KetentuanORDialog_ViewBinding.this.h = 0;
                            KetentuanORDialog_ViewBinding.this.b(false);
                        }
                        if (z) {
                            onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.b != i) {
                requestLayout();
                this.b = i;
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$write.class */
    public interface write extends RemoteActionCompatParcelizer<KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver> {
    }

    public KetentuanORDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public KetentuanORDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.R);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public KetentuanORDialog_ViewBinding(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 674
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KetentuanORDialog_ViewBinding.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void a(int i) {
        int childCount = this.c.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.c.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private void b() {
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            MediaDescriptionCompat mediaDescriptionCompat = this.z.get(i).g;
            if (mediaDescriptionCompat != null) {
                mediaDescriptionCompat.c();
            }
        }
    }

    private void b(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.c.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.c.setGravity(8388611);
    }

    private void b(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.d.get(size).b(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver);
        }
    }

    private int c() {
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == 2) ? this.Q : 0;
    }

    private static ColorStateList c(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private MediaDescriptionCompat c(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        onFindViewById.write<MediaDescriptionCompat> write2 = this.R;
        MediaDescriptionCompat mediaDescriptionCompat = write2 != null ? (MediaDescriptionCompat) write2.a() : null;
        MediaDescriptionCompat mediaDescriptionCompat2 = mediaDescriptionCompat;
        if (mediaDescriptionCompat == null) {
            mediaDescriptionCompat2 = new MediaDescriptionCompat(getContext());
        }
        if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != mediaDescriptionCompat2.g) {
            mediaDescriptionCompat2.g = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver;
            mediaDescriptionCompat2.c();
        }
        mediaDescriptionCompat2.setFocusable(true);
        mediaDescriptionCompat2.setMinimumWidth(c());
        if (TextUtils.isEmpty(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.c)) {
            mediaDescriptionCompat2.setContentDescription(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.j);
        } else {
            mediaDescriptionCompat2.setContentDescription(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.c);
        }
        return mediaDescriptionCompat2;
    }

    private void c(View view) {
        if (view instanceof LimitActivationDialog_ViewBinding) {
            LimitActivationDialog_ViewBinding limitActivationDialog_ViewBinding = (LimitActivationDialog_ViewBinding) view;
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver a = a();
            if (limitActivationDialog_ViewBinding.e != null) {
                a.a(limitActivationDialog_ViewBinding.e);
            }
            if (limitActivationDialog_ViewBinding.a != null) {
                a.d = limitActivationDialog_ViewBinding.a;
                boolean z = true;
                if (a.h.h == 1 || a.h.b == 2) {
                    a.h.b(true);
                }
                MediaDescriptionCompat mediaDescriptionCompat = a.g;
                if (mediaDescriptionCompat != null) {
                    mediaDescriptionCompat.c();
                }
                if (cancelReservationOnly.d) {
                    if (a.g.e == null) {
                        z = false;
                    }
                    if (z && a.g.e.isVisible()) {
                        a.g.invalidate();
                    }
                }
            }
            if (limitActivationDialog_ViewBinding.b != 0) {
                a.e = LayoutInflater.from(a.g.getContext()).inflate(limitActivationDialog_ViewBinding.b, (ViewGroup) a.g, false);
                MediaDescriptionCompat mediaDescriptionCompat2 = a.g;
                if (mediaDescriptionCompat2 != null) {
                    mediaDescriptionCompat2.c();
                }
            }
            if (!TextUtils.isEmpty(limitActivationDialog_ViewBinding.getContentDescription())) {
                a.c = limitActivationDialog_ViewBinding.getContentDescription();
                MediaDescriptionCompat mediaDescriptionCompat3 = a.g;
                if (mediaDescriptionCompat3 != null) {
                    mediaDescriptionCompat3.c();
                }
            }
            b(a, this.z.size(), this.z.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void c(LinearLayout.LayoutParams layoutParams) {
        if (this.b == 1 && this.h == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void c(getPathData getpathdata, boolean z, boolean z2) {
        List list;
        List list2;
        getPathData getpathdata2 = this.B;
        if (getpathdata2 != null) {
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver = this.H;
            if (!(ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver == null || (list2 = getpathdata2.n) == null)) {
                list2.remove(ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver);
            }
            IconCompatParcelizer iconCompatParcelizer = this.G;
            if (!(iconCompatParcelizer == null || (list = this.B.b) == null)) {
                list.remove(iconCompatParcelizer);
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.F;
        if (remoteActionCompatParcelizer != null) {
            this.d.remove(remoteActionCompatParcelizer);
            this.F = null;
        }
        if (getpathdata != null) {
            this.B = getpathdata;
            if (this.H == null) {
                this.H = new getPathData.MediaBrowserCompat.ItemReceiver(this) { // from class: o.KetentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver
                    int b;
                    int c;
                    private final WeakReference<KetentuanORDialog_ViewBinding> e;

                    {
                        this.e = new WeakReference<>(r6);
                    }

                    public final void a(int i, float f) {
                        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = this.e.get();
                        if (ketentuanORDialog_ViewBinding != null) {
                            int i2 = this.c;
                            boolean z3 = false;
                            boolean z4 = i2 != 2 || this.b == 1;
                            if (!(i2 == 2 && this.b == 0)) {
                                z3 = true;
                            }
                            ketentuanORDialog_ViewBinding.setScrollPosition(i, f, z4, z3);
                        }
                    }

                    public void b(int i) {
                        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = this.e.get();
                        if (ketentuanORDialog_ViewBinding != null) {
                            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = ketentuanORDialog_ViewBinding.e;
                            if ((ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null ? ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i : -1) != i && i < ketentuanORDialog_ViewBinding.z.size()) {
                                int i2 = this.c;
                                ketentuanORDialog_ViewBinding.a(ketentuanORDialog_ViewBinding.c(i), i2 == 0 || (i2 == 2 && this.b == 0));
                            }
                        }
                    }

                    public final void d(int i) {
                        this.b = this.c;
                        this.c = i;
                    }
                };
            }
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver2 = this.H;
            ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver2.c = 0;
            ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver2.b = 0;
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver3 = this.H;
            if (getpathdata.n == null) {
                getpathdata.n = new ArrayList();
            }
            getpathdata.n.add(ketentuanORDialog_ViewBinding$MediaBrowserCompat$SearchResultReceiver3);
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem ketentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem = new write(getpathdata) { // from class: o.KetentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem
                private final getPathData b;

                {
                    this.b = r4;
                }

                @Override // o.KetentuanORDialog_ViewBinding.RemoteActionCompatParcelizer
                public final void b(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) {
                    this.b.setCurrentItem(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i);
                }
            };
            this.F = ketentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem;
            if (!this.d.contains(ketentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem)) {
                this.d.add(ketentuanORDialog_ViewBinding$MediaBrowserCompat$MediaItem);
            }
            setScaleX setscalex = getpathdata.d;
            if (setscalex != null) {
                b(setscalex, z);
            }
            if (this.G == null) {
                this.G = new IconCompatParcelizer();
            }
            this.G.d = z;
            IconCompatParcelizer iconCompatParcelizer2 = this.G;
            if (getpathdata.b == null) {
                getpathdata.b = new ArrayList();
            }
            getpathdata.b.add(iconCompatParcelizer2);
            setScrollPosition(getpathdata.j, 0.0f, true);
        } else {
            this.B = null;
            b((setScaleX) null, false);
        }
        this.O = z2;
    }

    private void d(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && findFragmentByWho.G(this)) {
                read read2 = this.c;
                int childCount = read2.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (read2.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int e = e(i, 0.0f);
                    if (scrollX != e) {
                        if (this.N == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            this.N = valueAnimator;
                            valueAnimator.setInterpolator(unbindViews.d);
                            this.N.setDuration((long) this.g);
                            this.N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.KetentuanORDialog_ViewBinding.2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    KetentuanORDialog_ViewBinding.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                                }
                            });
                        }
                        this.N.setIntValues(scrollX, e);
                        this.N.start();
                    }
                    read read3 = this.c;
                    int i3 = this.g;
                    ValueAnimator valueAnimator2 = read3.a;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        read3.a.cancel();
                    }
                    read3.b(true, i, i3);
                    return;
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    private int e(int i, float f) {
        int i2 = this.b;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.c.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.c.getChildCount() ? this.c.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return findFragmentByWho.k(this) == 0 ? left + i5 : left - i5;
    }

    private void e() {
        int i = this.b;
        findFragmentByWho.c(this.c, (i == 0 || i == 2) ? Math.max(0, this.E - this.q) : 0, 0, 0, 0);
        int i2 = this.b;
        if (i2 == 0) {
            b(this.h);
        } else if (i2 == 1 || i2 == 2) {
            if (this.h == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.c.setGravity(1);
        }
        b(true);
    }

    public final KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver a() {
        KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = (KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) I.a();
        KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver;
        if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver == null) {
            ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 = new KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver();
        }
        ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.h = this;
        ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.g = c(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2);
        if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.b != -1) {
            ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.g.setId(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.b);
        }
        return ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2;
    }

    public final void a(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        a(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, true);
    }

    public final void a(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, boolean z) {
        KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 = this.e;
        if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 != ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver) {
            int i = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null ? ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i : -1;
            if (z) {
                if ((ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 == null || ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2.i == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    d(i);
                }
                if (i != -1) {
                    a(i);
                }
            }
            this.e = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver;
            if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 != null) {
                for (int size = this.d.size() - 1; size >= 0; size--) {
                    this.d.get(size);
                }
            }
            if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null) {
                b(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver);
            }
        } else if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver2 != null) {
            for (int size2 = this.d.size() - 1; size2 >= 0; size2--) {
                this.d.get(size2);
            }
            d(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public final void b(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, int i, boolean z) {
        if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.h == this) {
            ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i = i;
            this.z.add(i, ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver);
            int size = this.z.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                }
                this.z.get(i).i = i;
            }
            MediaDescriptionCompat mediaDescriptionCompat = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.g;
            mediaDescriptionCompat.setSelected(false);
            mediaDescriptionCompat.setActivated(false);
            read read2 = this.c;
            int i2 = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            c(layoutParams);
            read2.addView(mediaDescriptionCompat, i2, layoutParams);
            if (z) {
                KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.h;
                if (ketentuanORDialog_ViewBinding != null) {
                    ketentuanORDialog_ViewBinding.a(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void b(KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, boolean z) {
        b(ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver, this.z.size(), z);
    }

    final void b(setScaleX setscalex, boolean z) {
        DataSetObserver dataSetObserver;
        setScaleX setscalex2 = this.L;
        if (!(setscalex2 == null || (dataSetObserver = this.J) == null)) {
            setscalex2.c.unregisterObserver(dataSetObserver);
        }
        this.L = setscalex;
        if (z && setscalex != null) {
            if (this.J == null) {
                this.J = new DataSetObserver() { // from class: o.KetentuanORDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        KetentuanORDialog_ViewBinding.this.d();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        KetentuanORDialog_ViewBinding.this.d();
                    }
                };
            }
            setscalex.c.registerObserver(this.J);
        }
        d();
    }

    final void b(boolean z) {
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            childAt.setMinimumWidth(c());
            c((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver c(int i) {
        return (i < 0 || i >= this.z.size()) ? null : this.z.get(i);
    }

    public final void d() {
        int i;
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) this.c.getChildAt(childCount);
            this.c.removeViewAt(childCount);
            if (mediaDescriptionCompat != null) {
                if (mediaDescriptionCompat.g != null) {
                    mediaDescriptionCompat.g = null;
                    mediaDescriptionCompat.c();
                }
                mediaDescriptionCompat.setSelected(false);
                this.R.c(mediaDescriptionCompat);
            }
            requestLayout();
        }
        Iterator<KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver> it = this.z.iterator();
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                break;
            }
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver next = it.next();
            it.remove();
            next.h = null;
            next.g = null;
            next.f = null;
            next.d = null;
            next.b = -1;
            next.j = null;
            next.c = null;
            next.i = -1;
            next.e = null;
            I.c(next);
        }
        this.e = null;
        setScaleX setscalex = this.L;
        if (setscalex != null) {
            int d = setscalex.d();
            for (int i2 = 0; i2 < d; i2++) {
                b(a().a(this.L.c(i2)), this.z.size(), false);
            }
            getPathData getpathdata = this.B;
            if (getpathdata != null && d > 0) {
                int i3 = getpathdata.j;
                KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = this.e;
                if (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null) {
                    i = ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i;
                }
                if (i3 != i && i3 < this.z.size()) {
                    a(c(i3), true);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        JenisKartuDialog_ViewBinding.d(this);
        if (this.B == null) {
            ViewParent parent = getParent();
            if (parent instanceof getPathData) {
                c((getPathData) parent, true, true);
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        if (this.O) {
            setupWithViewPager(null);
            this.O = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        MediaDescriptionCompat mediaDescriptionCompat;
        Drawable drawable;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            if ((childAt instanceof MediaDescriptionCompat) && (drawable = (mediaDescriptionCompat = (MediaDescriptionCompat) childAt).b) != null) {
                drawable.setBounds(mediaDescriptionCompat.getLeft(), mediaDescriptionCompat.getTop(), mediaDescriptionCompat.getRight(), mediaDescriptionCompat.getBottom());
                mediaDescriptionCompat.b.draw(canvas);
            }
        }
        onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getChildFragmentManager.d(accessibilityNodeInfo).c(getChildFragmentManager.MediaBrowserCompat.CustomActionResultReceiver.b(1, this.z.size(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:
        if (r0.getMeasuredWidth() != getMeasuredWidth()) goto L_0x015d;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KetentuanORDialog_ViewBinding.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        setElevation(f);
        Drawable background = getBackground();
        if (background instanceof JenisKodeBankDialog) {
            ((JenisKodeBankDialog) background).l(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.a != z) {
            this.a = z;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof MediaDescriptionCompat) {
                    MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) childAt;
                    mediaDescriptionCompat.setOrientation(!KetentuanORDialog_ViewBinding.this.a ? 1 : 0);
                    TextView textView = mediaDescriptionCompat.c;
                    if (textView == null && mediaDescriptionCompat.d == null) {
                        mediaDescriptionCompat.e(mediaDescriptionCompat.h, mediaDescriptionCompat.a);
                    } else {
                        mediaDescriptionCompat.e(textView, mediaDescriptionCompat.d);
                    }
                }
            }
            e();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.P;
        if (remoteActionCompatParcelizer2 != null) {
            this.d.remove(remoteActionCompatParcelizer2);
        }
        this.P = remoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null && !this.d.contains(remoteActionCompatParcelizer)) {
            this.d.add(remoteActionCompatParcelizer);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(write write2) {
        setOnTabSelectedListener((RemoteActionCompatParcelizer) write2);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.c.getChildCount()) {
            if (z2) {
                read read2 = this.c;
                ValueAnimator valueAnimator = read2.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    read2.a.cancel();
                }
                read2.e = i;
                read2.c = f;
                read2.a(read2.getChildAt(i), read2.getChildAt(read2.e + 1), read2.c);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            scrollTo(e(i, f), 0);
            if (z) {
                a(round);
            }
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(setPrimaryBackground.c(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.y != drawable) {
            Drawable drawable2 = drawable;
            if (drawable == null) {
                drawable2 = new GradientDrawable();
            }
            this.y = drawable2;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.w = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.k != i) {
            this.k = i;
            findFragmentByWho.K(this.c);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.c.e(i);
    }

    public void setTabGravity(int i) {
        if (this.h != i) {
            this.h = i;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            b();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(setPrimaryBackground.b(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.l = i;
        if (i == 0) {
            this.f38o = new KonfirmasiCallCabangDialog_ViewBinding();
        } else if (i == 1) {
            this.f38o = new LimitActivationDialog();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.n = z;
        findFragmentByWho.K(this.c);
    }

    public void setTabMode(int i) {
        if (i != this.b) {
            this.b = i;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof MediaDescriptionCompat) {
                    ((MediaDescriptionCompat) childAt).d(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(setPrimaryBackground.b(getContext(), i));
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(c(i, i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            b();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(setScaleX setscalex) {
        b(setscalex, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.C != z) {
            this.C = z;
            for (int i = 0; i < this.c.getChildCount(); i++) {
                View childAt = this.c.getChildAt(i);
                if (childAt instanceof MediaDescriptionCompat) {
                    ((MediaDescriptionCompat) childAt).d(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(getPathData getpathdata) {
        setupWithViewPager(getpathdata, true);
    }

    public void setupWithViewPager(getPathData getpathdata, boolean z) {
        c(getpathdata, z, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        int width = this.c.getWidth();
        int width2 = getWidth();
        boolean z = false;
        if (Math.max(0, ((width - width2) - getPaddingLeft()) - getPaddingRight()) > 0) {
            z = true;
        }
        return z;
    }
}
