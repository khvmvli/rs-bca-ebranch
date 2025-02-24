package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Max;
import o.showDataTransaksi;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/MaxRule.class */
public class MaxRule extends AnnotationRule<Max, Integer> {
    protected MaxRule(Max max) {
        super(max);
    }

    public boolean isValid(Integer num) {
        if (num != null) {
            int value = this.mRuleAnnotation.value();
            showDataTransaksi.c();
            return showDataTransaksi.b(num.intValue(), value);
        }
        throw new IllegalArgumentException("'Integer' cannot be null.");
    }
}
