package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Checked;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/CheckedRule.class */
public class CheckedRule extends AnnotationRule<Checked, Boolean> {
    protected CheckedRule(Checked checked) {
        super(checked);
    }

    public boolean isValid(Boolean bool) {
        if (bool != null) {
            return this.mRuleAnnotation.value() == bool.booleanValue();
        }
        throw new IllegalArgumentException("'data' cannot be null.");
    }
}
