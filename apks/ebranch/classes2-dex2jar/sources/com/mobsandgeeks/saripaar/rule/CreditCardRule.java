package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.CreditCard;
import com.mobsandgeeks.saripaar.annotation.CreditCard$Type;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/CreditCardRule.class */
public class CreditCardRule extends AnnotationRule<CreditCard, String> {
    private static final Map<CreditCard$Type, Long> CARD_TYPE_REGISTRY = new HashMap<CreditCard$Type, Long>() { // from class: com.mobsandgeeks.saripaar.rule.CreditCardRule.1
        {
            put(CreditCard$Type.AMEX, 1L);
            put(CreditCard$Type.DINERS, 16L);
            put(CreditCard$Type.DISCOVER, 8L);
            put(CreditCard$Type.MASTERCARD, 4L);
            put(CreditCard$Type.VISA, 2L);
        }
    };

    protected CreditCardRule(CreditCard creditCard) {
        super(creditCard);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [long] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean isValid(java.lang.String r6) {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = r5
            java.lang.annotation.Annotation r2 = r2.mRuleAnnotation
            com.mobsandgeeks.saripaar.annotation.CreditCard r2 = (com.mobsandgeeks.saripaar.annotation.CreditCard) r2
            com.mobsandgeeks.saripaar.annotation.CreditCard$Type[] r2 = r2.cardTypes()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            com.mobsandgeeks.saripaar.annotation.CreditCard$Type r1 = com.mobsandgeeks.saripaar.annotation.CreditCard$Type.NONE
            boolean r0 = r0.contains(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r9
            r11 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0060
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
        L_0x0030:
            r0 = r9
            r11 = r0
            r0 = r13
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0060
            r0 = r13
            java.lang.Object r0 = r0.next()
            com.mobsandgeeks.saripaar.annotation.CreditCard$Type r0 = (com.mobsandgeeks.saripaar.annotation.CreditCard$Type) r0
            r7 = r0
            r0 = r9
            java.util.Map<com.mobsandgeeks.saripaar.annotation.CreditCard$Type, java.lang.Long> r1 = com.mobsandgeeks.saripaar.rule.CreditCardRule.CARD_TYPE_REGISTRY
            r2 = r7
            java.lang.Object r1 = r1.get(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r0 = r0 + r1
            r9 = r0
            goto L_0x0030
        L_0x0060:
            o.OR6ReviewFragment r0 = new o.OR6ReviewFragment
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r1 = r6
            java.lang.String r2 = "\\s"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
            boolean r0 = r0.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobsandgeeks.saripaar.rule.CreditCardRule.isValid(java.lang.String):boolean");
    }
}
