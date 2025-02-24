package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes-dex2jar.jar:o/setSupportImageTintMode.class */
public class setSupportImageTintMode extends Button implements getEnterTransition, getNextTransition {
    private final setImageDrawable a;
    private final setDecorPadding c;

    public setSupportImageTintMode(Context context) {
        this(context, null);
    }

    public setSupportImageTintMode(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.p);
    }

    public setSupportImageTintMode(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.a = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.c = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        setdecorpadding.e();
    }

    public ColorStateList B_() {
        setImageDrawable setimagedrawable = this.a;
        return setimagedrawable != null ? setimagedrawable.a() : null;
    }

    public PorterDuff.Mode b() {
        setImageDrawable setimagedrawable = this.a;
        return setimagedrawable != null ? setimagedrawable.b() : null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d) {
            return getAutoSizeMaxTextSize();
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            return setdecorpadding.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d) {
            return getAutoSizeMinTextSize();
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            return setdecorpadding.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d) {
            return getAutoSizeStepGranularity();
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            return setdecorpadding.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d) {
            return getAutoSizeTextAvailableSizes();
        }
        setDecorPadding setdecorpadding = this.c;
        return setdecorpadding != null ? setdecorpadding.g() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        int i = 0;
        if (d) {
            if (getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            return setdecorpadding.i();
        }
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.c(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        onTextChanged(charSequence, i, i2, i3);
        if (this.c != null && !d && this.c.h()) {
            this.c.d();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (d) {
            setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.d(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (d) {
            setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.d(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (d) {
            setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.e(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        setCustomSelectionActionModeCallback(getParentFragment.d(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.d(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }

    @Override // o.getNextTransition
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.c.d(colorStateList);
        this.c.e();
    }

    @Override // o.getNextTransition
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.c.d(mode);
        this.c.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.b(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (d) {
            setTextSize(i, f);
            return;
        }
        setDecorPadding setdecorpadding = this.c;
        if (setdecorpadding != null) {
            setdecorpadding.b(i, f);
        }
    }
}
