package io.github.inflationx.calligraphy3;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
/* loaded from: classes2-dex2jar.jar:io/github/inflationx/calligraphy3/CalligraphyUtils$1.class */
final class CalligraphyUtils$1 implements TextWatcher {
    final /* synthetic */ Typeface val$typeface;

    CalligraphyUtils$1(Typeface typeface) {
        this.val$typeface = typeface;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CalligraphyUtils.applyTypefaceSpan(editable, this.val$typeface);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
