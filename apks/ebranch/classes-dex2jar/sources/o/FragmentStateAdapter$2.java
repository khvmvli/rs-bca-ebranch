package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import o.setPageTransformer;
/* loaded from: classes-dex2jar.jar:o/FragmentStateAdapter$2.class */
public class FragmentStateAdapter$2 extends LinearLayout implements FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 {
    private CC26BFormKartuKreditFragment c;
    private CC26BFormKartuKreditFragment e;
    private int g;
    private int h;
    private int i;
    private setKeepHint j;
    private int d = 0;
    private int a = setPageTransformer.IconCompatParcelizer.e;
    private int b = setPageTransformer.MediaDescriptionCompat.e;

    public FragmentStateAdapter$2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public FragmentStateAdapter$2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a() {
        int size;
        removeAllViews();
        setKeepHint setkeephint = this.j;
        if (setkeephint != null && (size = setkeephint.e.size()) >= 2) {
            for (int i = 0; i < size; i++) {
                View view = new View(getContext());
                view.setBackgroundResource(this.b);
                addView(view, this.i, this.h);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = this.g;
                layoutParams.rightMargin = this.g;
                view.setLayoutParams(layoutParams);
                this.c.a(view);
                this.c.d();
            }
            this.c.a(getChildAt(this.d));
            this.c.d();
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        setGravity(17);
        c(context, attributeSet);
        CC26BFormKartuKreditFragment e = CC26CFormKartuKreditFragment.e(context, this.a);
        this.c = e;
        e.d(new LinearInterpolator());
        CC26BFormKartuKreditFragment e2 = CC26CFormKartuKreditFragment.e(context, this.a);
        this.e = e2;
        e2.d(new FragmentStateAdapter$2$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }

    private void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setPageTransformer$MediaBrowserCompat$MediaItem.a);
            this.i = obtainStyledAttributes.getDimensionPixelSize(setPageTransformer$MediaBrowserCompat$MediaItem.f, -1);
            this.h = obtainStyledAttributes.getDimensionPixelSize(setPageTransformer$MediaBrowserCompat$MediaItem.c, -1);
            this.g = obtainStyledAttributes.getDimensionPixelSize(setPageTransformer$MediaBrowserCompat$MediaItem.b, -1);
            this.a = obtainStyledAttributes.getResourceId(setPageTransformer$MediaBrowserCompat$MediaItem.d, setPageTransformer.IconCompatParcelizer.e);
            this.b = obtainStyledAttributes.getResourceId(setPageTransformer$MediaBrowserCompat$MediaItem.e, setPageTransformer.MediaDescriptionCompat.e);
            obtainStyledAttributes.recycle();
        }
        int i = this.i;
        int i2 = i;
        if (i == -1) {
            i2 = (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
        }
        this.i = i2;
        int i3 = this.h;
        int i4 = i3;
        if (i3 == -1) {
            i4 = (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
        }
        this.h = i4;
        int i5 = this.g;
        int i6 = i5;
        if (i5 == -1) {
            i6 = (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
        }
        this.g = i6;
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void a(int i, float f) {
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void b(int i) {
        if (getChildAt(this.d) != null) {
            this.e.a(getChildAt(this.d));
            this.e.d();
            this.c.a(getChildAt(i));
            this.c.d();
            this.d = i;
        }
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void d(int i) {
    }

    public void setCurrentItem(int i) {
        this.d = i;
        a();
    }

    public void setViewPager(getPathData getpathdata) {
        this.j = (setKeepHint) getpathdata.d;
        a();
    }
}
