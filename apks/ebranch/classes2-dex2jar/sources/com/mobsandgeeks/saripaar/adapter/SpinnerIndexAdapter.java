package com.mobsandgeeks.saripaar.adapter;

import android.widget.Spinner;
import com.mobsandgeeks.saripaar.annotation.Select;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/SpinnerIndexAdapter.class */
public class SpinnerIndexAdapter implements ViewDataAdapter<Spinner, Integer> {
    @Override // com.mobsandgeeks.saripaar.adapter.ViewDataAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(Spinner spinner, Annotation annotation) {
        return containsOptionalValue2(spinner, (Spinner) annotation);
    }

    /* renamed from: containsOptionalValue  reason: avoid collision after fix types in other method */
    public <T extends Annotation> boolean containsOptionalValue2(Spinner spinner, T t) {
        return (t instanceof Select) && spinner.getSelectedItemPosition() == ((Select) t).defaultSelection();
    }

    public Integer getData(Spinner spinner) {
        return Integer.valueOf(spinner.getSelectedItemPosition());
    }
}
