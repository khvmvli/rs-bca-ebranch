package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Select;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/SelectRule.class */
public class SelectRule extends AnnotationRule<Select, Integer> {
    protected SelectRule(Select select) {
        super(select);
    }

    public boolean isValid(Integer num) {
        if (num != null) {
            return this.mRuleAnnotation.defaultSelection() != num.intValue();
        }
        throw new IllegalArgumentException("'index' cannot be null.");
    }
}
