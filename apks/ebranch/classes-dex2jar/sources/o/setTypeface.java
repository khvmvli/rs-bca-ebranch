package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.getShowsDialog;
/* loaded from: classes-dex2jar.jar:o/setTypeface.class */
public class setTypeface extends TextView implements getNextTransition, getEnterTransition {
    private final setImageDrawable a;
    private final setLastBaselineToBottomHeight b;
    private Future<getShowsDialog> c;
    private boolean e;
    private final setDecorPadding g;

    public setTypeface(Context context) {
        this(context, null);
    }

    public setTypeface(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public setTypeface(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        this.e = false;
        setOnCloseListener.e(this, getContext());
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.a = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.g = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        setdecorpadding.e();
        this.b = new setLastBaselineToBottomHeight(this);
    }

    private void c() {
        Future<getShowsDialog> future = this.c;
        if (future != null) {
            try {
                this.c = null;
                getParentFragment.a(this, future.get());
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.a;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d) {
            return getAutoSizeMaxTextSize();
        }
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            return setdecorpadding.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getParentFragment.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getParentFragment.c(this);
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        c();
        return getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        setLastBaselineToBottomHeight setlastbaselinetobottomheight;
        return (Build.VERSION.SDK_INT >= 28 || (setlastbaselinetobottomheight = this.b) == null) ? getTextClassifier() : setlastbaselinetobottomheight.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = onCreateInputConnection(editorInfo);
        this.g.a(this, onCreateInputConnection, editorInfo);
        return setDropDownWidth.e(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.c(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        onTextChanged(charSequence, i, i2, i3);
        if (this.g != null && !d && this.g.h()) {
            this.g.d();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (d) {
            setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
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
        setDecorPadding setdecorpadding = this.g;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? setPrimaryBackground.c(context, i) : null;
        Drawable c2 = i2 != 0 ? setPrimaryBackground.c(context, i2) : null;
        Drawable c3 = i3 != 0 ? setPrimaryBackground.c(context, i3) : null;
        if (i4 != 0) {
            drawable = setPrimaryBackground.c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? setPrimaryBackground.c(context, i) : null;
        Drawable c2 = i2 != 0 ? setPrimaryBackground.c(context, i2) : null;
        Drawable c3 = i3 != 0 ? setPrimaryBackground.c(context, i3) : null;
        if (i4 != 0) {
            drawable = setPrimaryBackground.c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.f();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        setCustomSelectionActionModeCallback(getParentFragment.d(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            setFirstBaselineToTopHeight(i);
        } else {
            getParentFragment.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            setLastBaselineToBottomHeight(i);
        } else {
            getParentFragment.a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        getParentFragment.d(this, i);
    }

    public void setPrecomputedText(getShowsDialog getshowsdialog) {
        getParentFragment.a(this, getshowsdialog);
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
        this.g.d(colorStateList);
        this.g.e();
    }

    @Override // o.getNextTransition
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.g.d(mode);
        this.g.e();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.b(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        setLastBaselineToBottomHeight setlastbaselinetobottomheight;
        if (Build.VERSION.SDK_INT >= 28 || (setlastbaselinetobottomheight = this.b) == null) {
            setTextClassifier(textClassifier);
        } else {
            setlastbaselinetobottomheight.c(textClassifier);
        }
    }

    public void setTextFuture(Future<getShowsDialog> future) {
        this.c = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(getShowsDialog.read read) {
        getParentFragment.a(this, read);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (d) {
            setTextSize(i, f);
            return;
        }
        setDecorPadding setdecorpadding = this.g;
        if (setdecorpadding != null) {
            setdecorpadding.b(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (!this.e) {
            Typeface a = (typeface == null || i <= 0) ? null : setRootWindowInsets.a(getContext(), typeface, i);
            this.e = true;
            if (a != null) {
                typeface = a;
            }
            try {
                setTypeface(typeface, i);
            } finally {
                this.e = false;
            }
        }
    }
}
