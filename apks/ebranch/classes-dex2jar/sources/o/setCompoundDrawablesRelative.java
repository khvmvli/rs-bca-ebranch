package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
/* loaded from: classes-dex2jar.jar:o/setCompoundDrawablesRelative.class */
public class setCompoundDrawablesRelative extends MultiAutoCompleteTextView {
    private static final int[] c = {16843126};
    private final setImageDrawable a;
    private final setDecorPadding b;

    public setCompoundDrawablesRelative(Context context) {
        this(context, null);
    }

    public setCompoundDrawablesRelative(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.s);
    }

    public setCompoundDrawablesRelative(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        Context context2 = getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context2, context2.obtainStyledAttributes(attributeSet, c, i, 0));
        if (seticonifiedbydefault.d.hasValue(0)) {
            setDropDownBackgroundDrawable(seticonifiedbydefault.d(0));
        }
        seticonifiedbydefault.d.recycle();
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.a = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.b = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        setdecorpadding.e();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.b;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setDropDownWidth.e(onCreateInputConnection(editorInfo), editorInfo, this);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(setPrimaryBackground.c(getContext(), i));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        setDecorPadding setdecorpadding = this.b;
        if (setdecorpadding != null) {
            setdecorpadding.b(context, i);
        }
    }
}
