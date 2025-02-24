package com.mobsandgeeks.saripaar.adapter;

import android.widget.CheckBox;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/CheckBoxBooleanAdapter.class */
public class CheckBoxBooleanAdapter implements ViewDataAdapter<CheckBox, Boolean> {
    @Override // com.mobsandgeeks.saripaar.adapter.ViewDataAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(CheckBox checkBox, Annotation annotation) {
        return containsOptionalValue2(checkBox, (CheckBox) annotation);
    }

    /* renamed from: containsOptionalValue  reason: avoid collision after fix types in other method */
    public <T extends Annotation> boolean containsOptionalValue2(CheckBox checkBox, T t) {
        return !checkBox.isChecked();
    }

    public Boolean getData(CheckBox checkBox) {
        return Boolean.valueOf(checkBox.isChecked());
    }
}
