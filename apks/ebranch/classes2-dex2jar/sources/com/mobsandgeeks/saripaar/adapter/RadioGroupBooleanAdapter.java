package com.mobsandgeeks.saripaar.adapter;

import android.widget.RadioGroup;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/RadioGroupBooleanAdapter.class */
public class RadioGroupBooleanAdapter implements ViewDataAdapter<RadioGroup, Boolean> {
    @Override // com.mobsandgeeks.saripaar.adapter.ViewDataAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(RadioGroup radioGroup, Annotation annotation) {
        return containsOptionalValue2(radioGroup, (RadioGroup) annotation);
    }

    /* renamed from: containsOptionalValue  reason: avoid collision after fix types in other method */
    public <T extends Annotation> boolean containsOptionalValue2(RadioGroup radioGroup, T t) {
        return radioGroup.getCheckedRadioButtonId() == -1;
    }

    public Boolean getData(RadioGroup radioGroup) throws ConversionException {
        return Boolean.valueOf(radioGroup.getCheckedRadioButtonId() != -1);
    }
}
