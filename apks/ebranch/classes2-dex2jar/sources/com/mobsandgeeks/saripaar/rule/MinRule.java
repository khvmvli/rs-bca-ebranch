package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Min;
import o.showDataTransaksi;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/MinRule.class */
public class MinRule extends AnnotationRule<Min, Integer> {
    protected MinRule(Min min) {
        super(min);
    }

    public boolean isValid(Integer num) {
        if (num != null) {
            int value = this.mRuleAnnotation.value();
            showDataTransaksi.c();
            return showDataTransaksi.c(num.intValue(), value);
        }
        throw new IllegalArgumentException("'Integer' cannot be null.");
    }
}
