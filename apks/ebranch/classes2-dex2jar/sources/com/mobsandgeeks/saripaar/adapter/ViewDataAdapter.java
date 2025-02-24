package com.mobsandgeeks.saripaar.adapter;

import android.view.View;
import com.mobsandgeeks.saripaar.exception.ConversionException;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/adapter/ViewDataAdapter.class */
public interface ViewDataAdapter<VIEW extends View, DATA> {
    <T extends Annotation> boolean containsOptionalValue(VIEW view, T t);

    DATA getData(VIEW view) throws ConversionException;
}
