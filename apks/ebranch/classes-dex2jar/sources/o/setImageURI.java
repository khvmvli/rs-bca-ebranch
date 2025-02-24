package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes-dex2jar.jar:o/setImageURI.class */
public class setImageURI extends CheckedTextView {
    private static final int[] c = {16843016};
    private final setDecorPadding d;

    public setImageURI(Context context) {
        this(context, null);
    }

    public setImageURI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public setImageURI(Context context, AttributeSet attributeSet, int i) {
        super(setMaxWidth.c(context), attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setDecorPadding setdecorpadding = new setDecorPadding(this);
        this.d = setdecorpadding;
        setdecorpadding.e(attributeSet, i);
        setdecorpadding.e();
        Context context2 = getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context2, context2.obtainStyledAttributes(attributeSet, c, i, 0));
        setCheckMarkDrawable(seticonifiedbydefault.d(0));
        seticonifiedbydefault.d.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        setDecorPadding setdecorpadding = this.d;
        if (setdecorpadding != null) {
            setdecorpadding.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setDropDownWidth.e(onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(setPrimaryBackground.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        setCustomSelectionActionModeCallback(getParentFragment.d(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        setDecorPadding setdecorpadding = this.d;
        if (setdecorpadding != null) {
            setdecorpadding.b(context, i);
        }
    }
}
