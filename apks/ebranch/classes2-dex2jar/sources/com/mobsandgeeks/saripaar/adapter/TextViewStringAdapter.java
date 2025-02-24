package com.mobsandgeeks.saripaar.adapter;

import android.widget.TextView;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/TextViewStringAdapter.class */
public class TextViewStringAdapter extends TextViewBaseAdapter<String> {
    @Override // com.mobsandgeeks.saripaar.adapter.TextViewBaseAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(TextView textView, Annotation annotation) {
        return containsOptionalValue2(textView, (TextView) annotation);
    }

    public String getData(TextView textView) {
        return textView.getText().toString();
    }
}
