package com.mobsandgeeks.saripaar;

import android.content.Context;
import java.lang.annotation.Annotation;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/AnnotationRule.class */
public abstract class AnnotationRule<RULE_ANNOTATION extends Annotation, DATA_TYPE> extends Rule<DATA_TYPE> {
    protected final RULE_ANNOTATION mRuleAnnotation;

    public AnnotationRule(RULE_ANNOTATION rule_annotation) {
        super(rule_annotation != null ? ((Integer) Reflector.getAttributeValue(rule_annotation, "sequence", Integer.TYPE)).intValue() : -1);
        if (rule_annotation != null) {
            this.mRuleAnnotation = rule_annotation;
            return;
        }
        throw new IllegalArgumentException("'ruleAnnotation' cannot be null.");
    }

    public String getMessage(Context context) {
        int intValue = ((Integer) Reflector.getAttributeValue(this.mRuleAnnotation, "messageResId", Integer.class)).intValue();
        return intValue != -1 ? context.getString(intValue) : (String) Reflector.getAttributeValue(this.mRuleAnnotation, "message", String.class);
    }
}
