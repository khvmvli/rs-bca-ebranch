package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Length;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/LengthRule.class */
public class LengthRule extends AnnotationRule<Length, String> {
    protected LengthRule(Length length) {
        super(length);
    }

    private void assertMinMax(int i, int i2) {
        if (i > i2) {
            throw new IllegalStateException(String.format("'min' (%d) should be less than or equal to 'max' (%d).", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public boolean isValid(String str) {
        if (str != null) {
            int min = this.mRuleAnnotation.min();
            int max = this.mRuleAnnotation.max();
            assertMinMax(min, max);
            String str2 = str;
            if (this.mRuleAnnotation.trim()) {
                str2 = str.trim();
            }
            int length = str2.length();
            boolean z = true;
            boolean z2 = min == Integer.MIN_VALUE || length >= min;
            boolean z3 = max == Integer.MAX_VALUE || length <= max;
            if (!z2 || !z3) {
                z = false;
            }
            return z;
        }
        throw new IllegalArgumentException("'text' cannot be null.");
    }
}
