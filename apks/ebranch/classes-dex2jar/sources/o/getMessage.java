package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
/* loaded from: classes-dex2jar.jar:o/getMessage.class */
public final class getMessage implements TextWatcher {
    private String a;
    private EditText b;
    private int c;
    private int d;

    public getMessage(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.removeTextChangedListener(this);
        if (this.c > 1) {
            String replaceAll = this.a.replaceAll("[^0-9]", "");
            this.a = replaceAll;
            if (!replaceAll.isEmpty()) {
                this.b.setText(this.a.replaceAll(" - ", "").replaceAll("(.{4}(?!$))", "$1 - "));
                int length = this.b.getText().length();
                this.d = length;
                this.b.setSelection(length);
            }
        } else {
            int length2 = this.b.length();
            EditText editText = this.b;
            editText.setText(editText.getText().toString().replaceAll(" - ", "").replaceAll("(.{4}(?!$))", "$1 - "));
            int length3 = (this.d + this.b.length()) - length2;
            if (length3 > 0) {
                this.b.setSelection(length3);
            } else {
                this.b.setSelection(0);
            }
        }
        this.b.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0) {
            this.d = i + 1;
        } else {
            this.d = i;
        }
        this.a = charSequence.toString();
        this.c = i3;
    }
}
