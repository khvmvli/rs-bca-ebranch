package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Email;
import o.pilihNegaraTujuanPenerima;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/EmailRule.class */
public class EmailRule extends AnnotationRule<Email, String> {
    protected EmailRule(Email email) {
        super(email);
    }

    public boolean isValid(String str) {
        return pilihNegaraTujuanPenerima.b(this.mRuleAnnotation.allowLocal()).b(str);
    }
}
