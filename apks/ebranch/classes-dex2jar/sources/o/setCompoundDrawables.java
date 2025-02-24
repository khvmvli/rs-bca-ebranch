package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
/* loaded from: classes-dex2jar.jar:o/setCompoundDrawables.class */
public class setCompoundDrawables extends RadioButton {
    private final setSupportImageTintList b;
    private final setImageDrawable c;
    private final setDecorPadding d;

    public setCompoundDrawables(Context context) {
        this(context, null);
    }

    public setCompoundDrawables(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.N);
    }

    public setCompoundDrawables(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setSupportImageTintList setsupportimagetintlist = new setSupportImageTintList(this);
        this.b = setsupportimagetintlist;
        setsupportimagetintlist.a(attributeSet, i);
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.c = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.d = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.c;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.d;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.TextView, android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = getCompoundPaddingLeft();
        setSupportImageTintList setsupportimagetintlist = this.b;
        int i = compoundPaddingLeft;
        if (setsupportimagetintlist != null) {
            i = setsupportimagetintlist.a(compoundPaddingLeft);
        }
        return i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.c;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.c;
        if (setimagedrawable != null) {
            setimagedrawable.a(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(setPrimaryBackground.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        setButtonDrawable(drawable);
        setSupportImageTintList setsupportimagetintlist = this.b;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.c;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.c;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setSupportImageTintList setsupportimagetintlist = this.b;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.b(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setSupportImageTintList setsupportimagetintlist = this.b;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.e(mode);
        }
    }
}
