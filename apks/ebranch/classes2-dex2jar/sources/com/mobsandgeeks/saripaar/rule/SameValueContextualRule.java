package com.mobsandgeeks.saripaar.rule;

import android.view.View;
import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import java.lang.annotation.Annotation;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/SameValueContextualRule.class */
class SameValueContextualRule<CONFIRM extends Annotation, SOURCE extends Annotation, DATA_TYPE> extends ContextualAnnotationRule<CONFIRM, DATA_TYPE> {
    private Class<CONFIRM> mConfirmClass;
    private Class<SOURCE> mSourceClass;

    /* JADX INFO: Access modifiers changed from: protected */
    public SameValueContextualRule(CONFIRM confirm, Class<SOURCE> cls, ValidationContext validationContext) {
        super(confirm, validationContext);
        this.mConfirmClass = (Class<CONFIRM>) confirm.annotationType();
        this.mSourceClass = cls;
    }

    public boolean isValid(DATA_TYPE data_type) {
        List<View> annotatedViews = this.mValidationContext.getAnnotatedViews(this.mSourceClass);
        int size = annotatedViews.size();
        if (size == 0) {
            throw new IllegalStateException(String.format("You should have a view annotated with '%s' to use '%s'.", this.mSourceClass.getName(), this.mConfirmClass.getName()));
        } else if (size <= 1) {
            return data_type.equals(this.mValidationContext.getData(annotatedViews.get(0), this.mSourceClass));
        } else {
            throw new IllegalStateException(String.format("More than 1 field annotated with '%s'.", this.mSourceClass.getName()));
        }
    }
}
