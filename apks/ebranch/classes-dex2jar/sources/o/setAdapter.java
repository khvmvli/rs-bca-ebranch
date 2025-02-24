package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
/* loaded from: classes-dex2jar.jar:o/setAdapter.class */
public class setAdapter extends CheckBox {
    private final setImageDrawable b;
    private final setSupportImageTintList c;
    private final setDecorPadding d;

    public setAdapter(Context context) {
        this(context, null);
    }

    public setAdapter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.r);
    }

    public setAdapter(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setSupportImageTintList setsupportimagetintlist = new setSupportImageTintList(this);
        this.c = setsupportimagetintlist;
        setsupportimagetintlist.a(attributeSet, i);
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.b = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.d = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.b;
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
        setSupportImageTintList setsupportimagetintlist = this.c;
        int i = compoundPaddingLeft;
        if (setsupportimagetintlist != null) {
            i = setsupportimagetintlist.a(compoundPaddingLeft);
        }
        return i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.b;
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
        setSupportImageTintList setsupportimagetintlist = this.c;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setSupportImageTintList setsupportimagetintlist = this.c;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.b(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setSupportImageTintList setsupportimagetintlist = this.c;
        if (setsupportimagetintlist != null) {
            setsupportimagetintlist.e(mode);
        }
    }
}
