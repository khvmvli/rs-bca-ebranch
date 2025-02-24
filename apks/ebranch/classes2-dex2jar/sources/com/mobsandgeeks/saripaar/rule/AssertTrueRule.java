package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.AssertTrue;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/AssertTrueRule.class */
public class AssertTrueRule extends AnnotationRule<AssertTrue, Boolean> {
    protected AssertTrueRule(AssertTrue assertTrue) {
        super(assertTrue);
    }

    public boolean isValid(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalArgumentException("'data' cannot be null.");
    }
}
