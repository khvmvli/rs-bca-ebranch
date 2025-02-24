package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.ConfirmPassword;
import com.mobsandgeeks.saripaar.annotation.Password;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/ConfirmPasswordRule.class */
public class ConfirmPasswordRule extends SameValueContextualRule<ConfirmPassword, Password, String> {
    protected ConfirmPasswordRule(ConfirmPassword confirmPassword, ValidationContext validationContext) {
        super(confirmPassword, Password.class, validationContext);
    }

    public boolean isValid(String str) {
        return isValid((ConfirmPasswordRule) str);
    }
}
