package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import o.retryPpuNumber;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/PatternRule.class */
public class PatternRule extends ContextualAnnotationRule<Pattern, String> {
    protected PatternRule(Pattern pattern, ValidationContext validationContext) {
        super(pattern, validationContext);
    }

    public boolean isValid(String str) {
        int regexResId = this.mRuleAnnotation.regexResId();
        return new retryPpuNumber(regexResId != -1 ? this.mValidationContext.getContext().getString(regexResId) : this.mRuleAnnotation.regex(), this.mRuleAnnotation.caseSensitive()).c(str);
    }
}
