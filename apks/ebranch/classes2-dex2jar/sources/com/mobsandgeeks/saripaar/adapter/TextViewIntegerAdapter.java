package com.mobsandgeeks.saripaar.adapter;

import android.widget.TextView;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/TextViewIntegerAdapter.class */
public class TextViewIntegerAdapter extends TextViewBaseAdapter<Integer> {
    private static final String REGEX_INTEGER = "\\d+";

    @Override // com.mobsandgeeks.saripaar.adapter.TextViewBaseAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(TextView textView, Annotation annotation) {
        return containsOptionalValue2(textView, (TextView) annotation);
    }

    public Integer getData(TextView textView) throws ConversionException {
        String trim = textView.getText().toString().trim();
        if (trim.matches(REGEX_INTEGER)) {
            return Integer.valueOf(Integer.parseInt(trim));
        }
        throw new ConversionException(String.format("Expected an integer, but was %s", trim));
    }
}
