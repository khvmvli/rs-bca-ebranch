package com.mobsandgeeks.saripaar.adapter;

import android.widget.RadioButton;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/RadioButtonBooleanAdapter.class */
public class RadioButtonBooleanAdapter implements ViewDataAdapter<RadioButton, Boolean> {
    @Override // com.mobsandgeeks.saripaar.adapter.ViewDataAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(RadioButton radioButton, Annotation annotation) {
        return containsOptionalValue2(radioButton, (RadioButton) annotation);
    }

    /* renamed from: containsOptionalValue  reason: avoid collision after fix types in other method */
    public <T extends Annotation> boolean containsOptionalValue2(RadioButton radioButton, T t) {
        return !radioButton.isChecked();
    }

    public Boolean getData(RadioButton radioButton) {
        return Boolean.valueOf(radioButton.isChecked());
    }
}
