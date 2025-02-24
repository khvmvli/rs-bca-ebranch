package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
/* loaded from: classes-dex2jar.jar:o/setPopupBackgroundDrawable.class */
public class setPopupBackgroundDrawable extends EditText implements initLifecycle {
    private final getParentFragmentManager a;
    private final setLastBaselineToBottomHeight c;
    private final setDecorPadding d;
    private final setImageDrawable e;

    public setPopupBackgroundDrawable(Context context) {
        this(context, null);
    }

    public setPopupBackgroundDrawable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.z);
    }

    public setPopupBackgroundDrawable(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setImageDrawable setimagedrawable = new setImageDrawable(this);
        this.e = setimagedrawable;
        setimagedrawable.c(attributeSet, i);
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.d = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        setdecorpadding.e();
        this.c = new setLastBaselineToBottomHeight(this);
        this.a = new getParentFragmentManager();
    }

    @Override // o.initLifecycle
    public onSaveInstanceState a(onSaveInstanceState onsaveinstancestate) {
        return this.a.a(this, onsaveinstancestate);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.e;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
        setDecorPadding setdecorpadding = this.d;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        setLastBaselineToBottomHeight setlastbaselinetobottomheight;
        return (Build.VERSION.SDK_INT >= 28 || (setlastbaselinetobottomheight = this.c) == null) ? getTextClassifier() : setlastbaselinetobottomheight.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = onCreateInputConnection(editorInfo);
        this.d.a(this, onCreateInputConnection, editorInfo);
        InputConnection e = setDropDownWidth.e(onCreateInputConnection, editorInfo, this);
        String[] p = findFragmentByWho.p(this);
        InputConnection inputConnection = e;
        if (e != null) {
            inputConnection = e;
            if (p != null) {
                getExitAnim.b(editorInfo, p);
                inputConnection = getExitTransitionCallback.a(e, editorInfo, setFirstBaselineToTopHeight.d(this));
            }
        }
        return inputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (setFirstBaselineToTopHeight.a(this, dragEvent)) {
            return true;
        }
        return onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (setFirstBaselineToTopHeight.a(this, i)) {
            return true;
        }
        return onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.e;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.e;
        if (setimagedrawable != null) {
            setimagedrawable.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        setCustomSelectionActionModeCallback(getParentFragment.d(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.e;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.e;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        setDecorPadding setdecorpadding = this.d;
        if (setdecorpadding != null) {
            setdecorpadding.b(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        setLastBaselineToBottomHeight setlastbaselinetobottomheight;
        if (Build.VERSION.SDK_INT >= 28 || (setlastbaselinetobottomheight = this.c) == null) {
            setTextClassifier(textClassifier);
        } else {
            setlastbaselinetobottomheight.c(textClassifier);
        }
    }
}
