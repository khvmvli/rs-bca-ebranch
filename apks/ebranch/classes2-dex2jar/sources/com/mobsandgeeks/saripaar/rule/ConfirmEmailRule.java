package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.ConfirmEmail;
import com.mobsandgeeks.saripaar.annotation.Email;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/ConfirmEmailRule.class */
public class ConfirmEmailRule extends SameValueContextualRule<ConfirmEmail, Email, String> {
    protected ConfirmEmailRule(ConfirmEmail confirmEmail, ValidationContext validationContext) {
        super(confirmEmail, Email.class, validationContext);
    }

    public boolean isValid(String str) {
        return isValid((ConfirmEmailRule) str);
    }
}
