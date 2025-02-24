package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
/* loaded from: classes-dex2jar.jar:o/getCardSlogan.class */
public class getCardSlogan extends setPopupBackgroundDrawable implements TextWatcher {
    private int c;
    int a = 0;
    public String e = "08";

    public getCardSlogan(Context context) {
        super(context);
    }

    public getCardSlogan(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130969338});
        CharSequence text = obtainStyledAttributes.getText(this.a);
        obtainStyledAttributes.recycle();
        if (text != null) {
            setRegionPrefix(text.toString());
        }
    }

    public getCardSlogan(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!getText().toString().startsWith(this.e)) {
            setText(this.e);
            setSelection(getText().length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setMaxLength(int i) {
        this.c = i;
    }

    public void setRegionPrefix(String str) {
        this.e = str;
    }

    public void setWatcher() {
        addTextChangedListener(this);
    }
}
