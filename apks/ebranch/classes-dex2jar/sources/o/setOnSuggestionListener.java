package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/setOnSuggestionListener.class */
public final class setOnSuggestionListener extends View {
    private int a;
    private WeakReference<View> b;
    private setOnSuggestionListener$MediaBrowserCompat$CustomActionResultReceiver c;
    private int d;
    private LayoutInflater e;

    public setOnSuggestionListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setOnSuggestionListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.ed, i, 0);
        this.d = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ei, -1);
        this.a = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ej, 0);
        setId(obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ee, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View b() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.e;
            LayoutInflater layoutInflater2 = layoutInflater;
            if (layoutInflater == null) {
                layoutInflater2 = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater2.inflate(this.a, viewGroup, false);
            int i = this.d;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.b = new WeakReference<>(inflate);
            setOnSuggestionListener$MediaBrowserCompat$CustomActionResultReceiver setonsuggestionlistener_mediabrowsercompat_customactionresultreceiver = this.c;
            if (setonsuggestionlistener_mediabrowsercompat_customactionresultreceiver != null) {
                setonsuggestionlistener_mediabrowsercompat_customactionresultreceiver.b(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setInflatedId(int i) {
        this.d = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.e = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.a = i;
    }

    public final void setOnInflateListener(setOnSuggestionListener$MediaBrowserCompat$CustomActionResultReceiver setonsuggestionlistener_mediabrowsercompat_customactionresultreceiver) {
        this.c = setonsuggestionlistener_mediabrowsercompat_customactionresultreceiver;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.b;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        setVisibility(i);
        if (i == 0 || i == 4) {
            b();
        }
    }
}
