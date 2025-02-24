package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setAutoSizeTextTypeUniformWithPresetSizes.class */
public abstract class setAutoSizeTextTypeUniformWithPresetSizes extends ViewGroup {
    protected int a;
    protected setButtonDrawable b;
    protected setSupportCompoundDrawablesTintMode c;
    protected final write d = new write();
    protected final Context e;
    protected generateActivityResultKey g;
    private boolean h;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes-dex2jar.jar:o/setAutoSizeTextTypeUniformWithPresetSizes$write.class */
    public final class write implements getAllowReturnTransitionOverlap {
        private boolean b = false;
        int c;

        protected write() {
        }

        public final write b(generateActivityResultKey generateactivityresultkey, int i) {
            setAutoSizeTextTypeUniformWithPresetSizes.this.g = generateactivityresultkey;
            this.c = i;
            return this;
        }

        @Override // o.getAllowReturnTransitionOverlap
        public final void b(View view) {
            setAutoSizeTextTypeUniformWithPresetSizes.this.setVisibility(0);
            this.b = false;
        }

        @Override // o.getAllowReturnTransitionOverlap
        public final void c(View view) {
            if (!this.b) {
                setAutoSizeTextTypeUniformWithPresetSizes.this.g = null;
                setAutoSizeTextTypeUniformWithPresetSizes.this.setVisibility(this.c);
            }
        }

        @Override // o.getAllowReturnTransitionOverlap
        public final void d(View view) {
            this.b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAutoSizeTextTypeUniformWithPresetSizes(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.e, typedValue, true) || typedValue.resourceId == 0) {
            this.e = context;
        } else {
            this.e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int b(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        int i5 = measuredWidth;
        if (z) {
            i5 = -measuredWidth;
        }
        return i5;
    }

    public generateActivityResultKey c(int i, long j) {
        generateActivityResultKey generateactivityresultkey = this.g;
        if (generateactivityresultkey != null) {
            generateactivityresultkey.c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            generateActivityResultKey e = findFragmentByWho.a(this).e(1.0f);
            e.a(j);
            e.d(this.d.b(e, i));
            return e;
        }
        generateActivityResultKey e2 = findFragmentByWho.a(this).e(0.0f);
        e2.a(j);
        e2.d(this.d.b(e2, i));
        return e2;
    }

    public boolean c() {
        setButtonDrawable setbuttondrawable = this.b;
        if (setbuttondrawable != null) {
            return setbuttondrawable.f();
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.e, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.d, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(setHasDecor$MediaBrowserCompat$MediaItem.m, 0));
        obtainStyledAttributes.recycle();
        setButtonDrawable setbuttondrawable = this.b;
        if (setbuttondrawable != null) {
            setbuttondrawable.g();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
        }
        if (!this.j) {
            boolean onTouchEvent = onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.j = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.j = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.a = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            generateActivityResultKey generateactivityresultkey = this.g;
            if (generateactivityresultkey != null) {
                generateactivityresultkey.c();
            }
            setVisibility(i);
        }
    }
}
