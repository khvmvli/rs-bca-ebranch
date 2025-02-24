package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/NotEmptyRule.class */
public class NotEmptyRule extends ContextualAnnotationRule<NotEmpty, String> {
    protected NotEmptyRule(NotEmpty notEmpty, ValidationContext validationContext) {
        super(notEmpty, validationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        if ("".equals(r7) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean isValid(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0070
            r0 = r4
            r7 = r0
            r0 = r3
            java.lang.annotation.Annotation r0 = r0.mRuleAnnotation
            com.mobsandgeeks.saripaar.annotation.NotEmpty r0 = (com.mobsandgeeks.saripaar.annotation.NotEmpty) r0
            boolean r0 = r0.trim()
            if (r0 == 0) goto L_0x0020
            r0 = r4
            java.lang.String r0 = r0.trim()
            r7 = r0
        L_0x0020:
            r0 = r3
            com.mobsandgeeks.saripaar.ValidationContext r0 = r0.mValidationContext
            android.content.Context r0 = r0.getContext()
            r4 = r0
            r0 = r3
            java.lang.annotation.Annotation r0 = r0.mRuleAnnotation
            com.mobsandgeeks.saripaar.annotation.NotEmpty r0 = (com.mobsandgeeks.saripaar.annotation.NotEmpty) r0
            int r0 = r0.emptyTextResId()
            r1 = -1
            if (r0 == r1) goto L_0x004c
            r0 = r4
            r1 = r3
            java.lang.annotation.Annotation r1 = r1.mRuleAnnotation
            com.mobsandgeeks.saripaar.annotation.NotEmpty r1 = (com.mobsandgeeks.saripaar.annotation.NotEmpty) r1
            int r1 = r1.emptyTextResId()
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
            goto L_0x0059
        L_0x004c:
            r0 = r3
            java.lang.annotation.Annotation r0 = r0.mRuleAnnotation
            com.mobsandgeeks.saripaar.annotation.NotEmpty r0 = (com.mobsandgeeks.saripaar.annotation.NotEmpty) r0
            java.lang.String r0 = r0.emptyText()
            r4 = r0
        L_0x0059:
            r0 = r4
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
            r0 = r5
            r6 = r0
            java.lang.String r0 = ""
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
        L_0x006e:
            r0 = 1
            r6 = r0
        L_0x0070:
            r0 = r6
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobsandgeeks.saripaar.rule.NotEmptyRule.isValid(java.lang.String):boolean");
    }
}
