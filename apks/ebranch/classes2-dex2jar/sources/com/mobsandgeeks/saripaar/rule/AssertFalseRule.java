package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.AssertFalse;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/AssertFalseRule.class */
public class AssertFalseRule extends AnnotationRule<AssertFalse, Boolean> {
    protected AssertFalseRule(AssertFalse assertFalse) {
        super(assertFalse);
    }

    public boolean isValid(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue();
        }
        throw new IllegalArgumentException("'data' cannot be null.");
    }
}
