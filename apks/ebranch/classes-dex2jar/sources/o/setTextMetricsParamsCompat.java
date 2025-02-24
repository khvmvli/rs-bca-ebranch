package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes-dex2jar.jar:o/setTextMetricsParamsCompat.class */
public class setTextMetricsParamsCompat extends ToggleButton {
    private final setImageDrawable a;
    private final setDecorPadding e;

    public setTextMetricsParamsCompat(Context context) {
        this(context, null);
    }

    public setTextMetricsParamsCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public setTextMetricsParamsCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.a = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.e = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
    }

    @Override // android.widget.ToggleButton, android.widget.TextView, android.widget.CompoundButton, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.e;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
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
}
