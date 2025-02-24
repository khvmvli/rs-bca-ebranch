package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Digits;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/DigitsRule.class */
public class DigitsRule extends AnnotationRule<Digits, String> {
    protected DigitsRule(Digits digits) {
        super(digits);
    }

    public boolean isValid(String str) {
        return str.matches(String.format("(\\d{0,%d})(\\.\\d{1,%d})?", Integer.valueOf(this.mRuleAnnotation.integer()), Integer.valueOf(this.mRuleAnnotation.fraction())));
    }
}
