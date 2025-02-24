package com.mobsandgeeks.saripaar.adapter;

import android.widget.TextView;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/TextViewDoubleAdapter.class */
public class TextViewDoubleAdapter extends TextViewBaseAdapter<Double> {
    private static final String REGEX_DECIMAL = "[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";

    @Override // com.mobsandgeeks.saripaar.adapter.TextViewBaseAdapter
    public /* bridge */ /* synthetic */ boolean containsOptionalValue(TextView textView, Annotation annotation) {
        return containsOptionalValue2(textView, (TextView) annotation);
    }

    public Double getData(TextView textView) throws ConversionException {
        String trim = textView.getText().toString().trim();
        if (trim.matches(REGEX_DECIMAL)) {
            return Double.valueOf(Double.parseDouble(trim));
        }
        throw new ConversionException(String.format("Expected a floating point number, but was %s", trim));
    }
}
