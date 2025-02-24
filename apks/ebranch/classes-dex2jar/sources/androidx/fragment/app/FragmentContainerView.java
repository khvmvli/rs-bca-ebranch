package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import o.findFragmentByWho;
import o.getSharedElementSourceNames;
import o.getUserVisibleHint;
import o.isDetached;
/* loaded from: classes-dex2jar.jar:androidx/fragment/app/FragmentContainerView.class */
public final class FragmentContainerView extends FrameLayout {
    public boolean a;
    private ArrayList<View> b;
    private ArrayList<View> c;
    private View.OnApplyWindowInsetsListener d;

    public FragmentContainerView(Context context) {
        super(context);
        this.a = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        String str2;
        this.a = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getSharedElementSourceNames.RemoteActionCompatParcelizer.c);
            if (classAttribute == null) {
                str2 = obtainStyledAttributes.getString(getSharedElementSourceNames.RemoteActionCompatParcelizer.g);
                str = "android:name";
            } else {
                str = "class";
                str2 = classAttribute;
            }
            obtainStyledAttributes.recycle();
            if (str2 != null && !isInEditMode()) {
                StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                sb.append(str);
                sb.append("=\"");
                sb.append(str2);
                sb.append("\"");
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, isDetached isdetached) {
        super(context, attributeSet);
        String str;
        this.a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getSharedElementSourceNames.RemoteActionCompatParcelizer.c);
        String string = classAttribute == null ? obtainStyledAttributes.getString(getSharedElementSourceNames.RemoteActionCompatParcelizer.g) : classAttribute;
        String string2 = obtainStyledAttributes.getString(getSharedElementSourceNames.RemoteActionCompatParcelizer.j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = isdetached.findFragmentById(id);
        if (string != null && findFragmentById == null) {
            if (id <= 0) {
                if (string2 != null) {
                    StringBuilder sb = new StringBuilder(" with tag ");
                    sb.append(string2);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(string);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            Fragment d = isdetached.o().d(context.getClassLoader(), string);
            d.onInflate(context, attributeSet, (Bundle) null);
            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(isdetached);
            getuservisiblehint.q = true;
            d.mContainer = this;
            getuservisiblehint.d(getId(), d, string2, 1);
            getuservisiblehint.e();
        }
        isdetached.c(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.c;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (isDetached.d(view) != null) {
            addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (isDetached.d(view) != null) {
            return addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.View, android.view.ViewGroup
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat c = WindowInsetsCompat.c(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        WindowInsetsCompat c2 = onApplyWindowInsetsListener != null ? WindowInsetsCompat.c(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : findFragmentByWho.b(this, c);
        if (!c2.k()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                findFragmentByWho.c(getChildAt(i), c2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.View, android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas) {
        if (this.a && this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                drawChild(canvas, this.b.get(i), getDrawingTime());
            }
        }
        dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.a || (arrayList = this.b) == null || arrayList.size() <= 0 || !this.b.contains(view)) {
            return drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.a = true;
            }
        }
        endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected final void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(view);
        }
        startViewTransition(view);
    }
}
