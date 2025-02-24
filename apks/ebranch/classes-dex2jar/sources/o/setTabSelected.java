package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import o.setBackgroundResource;
import o.setHasDecor;
import o.setTabSelected;
import o.setWeightSum;
/* loaded from: classes-dex2jar.jar:o/setTabSelected.class */
public class setTabSelected extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator f = new DecelerateInterpolator();
    int a;
    setWeightSum b;
    int c;
    Runnable d;
    int e;
    protected final IconCompatParcelizer g = new IconCompatParcelizer();
    private boolean h;
    private int i;
    protected ViewPropertyAnimator j;

    /* renamed from: o */
    private Spinner f276o;

    /* loaded from: classes-dex2jar.jar:o/setTabSelected$IconCompatParcelizer.class */
    protected final class IconCompatParcelizer extends AnimatorListenerAdapter {
        private int c;
        private boolean e = false;

        protected IconCompatParcelizer() {
            setTabSelected.this = r4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.e) {
                setTabSelected.this.j = null;
                setTabSelected.this.setVisibility(this.c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            setTabSelected.this.setVisibility(0);
            this.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTabSelected$read.class */
    public final class read extends LinearLayout {
        private ImageView a;
        private final int[] b;
        private View c;
        setBackgroundResource.write d;
        private TextView j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Context context, setBackgroundResource.write write, boolean z) {
            super(context, null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.c);
            setTabSelected.this = r10;
            int[] iArr = {16842964};
            this.b = iArr;
            this.d = write;
            setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(null, iArr, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.c, 0));
            if (seticonifiedbydefault.d.hasValue(0)) {
                setBackgroundDrawable(seticonifiedbydefault.d(0));
            }
            seticonifiedbydefault.d.recycle();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        public final void a() {
            setBackgroundResource.write write = this.d;
            View b = write.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.c = b;
                TextView textView = this.j;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.a.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.c;
            if (view != null) {
                removeView(view);
                this.c = null;
            }
            Drawable a = write.a();
            CharSequence e = write.e();
            if (a != null) {
                if (this.a == null) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset = new setDropDownHorizontalOffset(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    setdropdownhorizontaloffset.setLayoutParams(layoutParams);
                    addView(setdropdownhorizontaloffset, 0);
                    this.a = setdropdownhorizontaloffset;
                }
                this.a.setImageDrawable(a);
                this.a.setVisibility(0);
            } else {
                ImageView imageView2 = this.a;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.a.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(e);
            if (z) {
                if (this.j == null) {
                    setTypeface settypeface = new setTypeface(getContext(), null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.j);
                    settypeface.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    settypeface.setLayoutParams(layoutParams2);
                    addView(settypeface);
                    this.j = settypeface;
                }
                this.j.setText(e);
                this.j.setVisibility(0);
            } else {
                TextView textView2 = this.j;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.j.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.a;
            if (imageView3 != null) {
                imageView3.setContentDescription(write.c());
            }
            if (!z) {
                charSequence = write.c();
            }
            setOnSearchClickListener.b(this, charSequence);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            onMeasure(i, i2);
            if (setTabSelected.this.e > 0 && getMeasuredWidth() > setTabSelected.this.e) {
                onMeasure(View.MeasureSpec.makeMeasureSpec(setTabSelected.this.e, 1073741824), i2);
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public setTabSelected(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(context);
        setContentHeight(sethideoncontentscrollenabled.d());
        this.a = sethideoncontentscrollenabled.e.getResources().getDimensionPixelSize(setHasDecor.write.a);
        setWeightSum setweightsum = new setWeightSum(getContext(), null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.b);
        setweightsum.setMeasureWithLargestChildEnabled(true);
        setweightsum.setGravity(17);
        setweightsum.setLayoutParams(new setWeightSum.IconCompatParcelizer(-2, -1));
        this.b = setweightsum;
        addView(setweightsum, new ViewGroup.LayoutParams(-2, -1));
    }

    private boolean a() {
        Spinner spinner = this.f276o;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f276o);
        addView(this.b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f276o.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        onAttachedToWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(getContext());
        setContentHeight(sethideoncontentscrollenabled.d());
        this.a = sethideoncontentscrollenabled.e.getResources().getDimensionPixelSize(setHasDecor.write.a);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        setBackgroundResource.write write = ((read) view).d;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.e = -1;
        } else {
            if (childCount > 2) {
                this.e = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.e = View.MeasureSpec.getSize(i) / 2;
            }
            this.e = Math.min(this.e, this.a);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        if (!z && this.h) {
            this.b.measure(0, makeMeasureSpec);
            if (this.b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                Spinner spinner = this.f276o;
                boolean z2 = false;
                if (spinner != null) {
                    z2 = false;
                    if (spinner.getParent() == this) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (this.f276o == null) {
                        setTextFuture settextfuture = new setTextFuture(getContext(), null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.i);
                        settextfuture.setLayoutParams(new setWeightSum.IconCompatParcelizer(-2, -1));
                        settextfuture.setOnItemSelectedListener(this);
                        this.f276o = settextfuture;
                    }
                    removeView(this.b);
                    addView(this.f276o, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f276o.getAdapter() == null) {
                        this.f276o.setAdapter((SpinnerAdapter) new BaseAdapter() { // from class: o.setTabSelected$MediaBrowserCompat$CustomActionResultReceiver
                            @Override // android.widget.Adapter
                            public final int getCount() {
                                return setTabSelected.this.b.getChildCount();
                            }

                            @Override // android.widget.Adapter
                            public final Object getItem(int i3) {
                                return ((setTabSelected.read) setTabSelected.this.b.getChildAt(i3)).d;
                            }

                            @Override // android.widget.Adapter
                            public final long getItemId(int i3) {
                                return (long) i3;
                            }

                            @Override // android.widget.Adapter
                            public final View getView(int i3, View view, ViewGroup viewGroup) {
                                if (view == null) {
                                    setTabSelected settabselected = setTabSelected.this;
                                    view = new setTabSelected.read(settabselected.getContext(), (setBackgroundResource.write) getItem(i3), true);
                                    view.setBackgroundDrawable(null);
                                    view.setLayoutParams(new AbsListView.LayoutParams(-1, settabselected.c));
                                } else {
                                    setTabSelected.read read2 = (setTabSelected.read) view;
                                    read2.d = (setBackgroundResource.write) getItem(i3);
                                    read2.a();
                                }
                                return view;
                            }
                        });
                    }
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.d = null;
                    }
                    this.f276o.setSelection(this.i);
                }
            } else {
                a();
            }
        } else {
            a();
        }
        int measuredWidth = getMeasuredWidth();
        onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.i);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.h = z;
    }

    public void setContentHeight(int i) {
        this.c = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.b.getChildAt(i);
                Runnable runnable = this.d;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                AnonymousClass4 r0 = new Runnable() { // from class: o.setTabSelected.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        setTabSelected.this.smoothScrollTo(childAt2.getLeft() - ((setTabSelected.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        setTabSelected.this.d = null;
                    }
                };
                this.d = r0;
                post(r0);
            }
            i2++;
        }
        Spinner spinner = this.f276o;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
