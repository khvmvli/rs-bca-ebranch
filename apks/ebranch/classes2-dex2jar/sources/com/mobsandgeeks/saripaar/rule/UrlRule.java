package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Url;
import o.showDataBankPenerima;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/UrlRule.class */
public class UrlRule extends AnnotationRule<Url, String> {
    protected UrlRule(Url url) {
        super(url);
    }

    public boolean isValid(String str) {
        String[] schemes = this.mRuleAnnotation.schemes();
        return ((schemes == null || schemes.length <= 0) ? showDataBankPenerima.c() : new showDataBankPenerima(schemes, this.mRuleAnnotation.allowFragments() ? 0 : 4)).c(str);
    }
}
