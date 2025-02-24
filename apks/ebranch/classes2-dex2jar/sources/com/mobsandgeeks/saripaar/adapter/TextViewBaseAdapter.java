package com.mobsandgeeks.saripaar.adapter;

import android.widget.TextView;
import java.lang.annotation.Annotation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/TextViewBaseAdapter.class */
public abstract class TextViewBaseAdapter<DATA> implements ViewDataAdapter<TextView, DATA> {
    @Override // com.mobsandgeeks.saripaar.adapter.ViewDataAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(TextView textView, Annotation annotation) {
        return containsOptionalValue2(textView, (TextView) annotation);
    }

    /* renamed from: containsOptionalValue */
    public <T extends Annotation> boolean containsOptionalValue2(TextView textView, T t) {
        return "".equals(textView.getText().toString());
    }
}
