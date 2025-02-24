package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Domain;
import o.onChoosePilihNorekPengirim;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/DomainRule.class */
public class DomainRule extends AnnotationRule<Domain, String> {
    protected DomainRule(Domain domain) {
        super(domain);
    }

    public boolean isValid(String str) {
        return onChoosePilihNorekPengirim.d(this.mRuleAnnotation.allowLocal()).a(str);
    }
}
