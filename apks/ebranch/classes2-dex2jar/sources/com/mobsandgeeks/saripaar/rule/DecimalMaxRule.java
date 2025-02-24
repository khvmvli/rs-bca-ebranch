package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.DecimalMax;
import o.pilihJenisKodeBankTransaksi;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/DecimalMaxRule.class */
public class DecimalMaxRule extends AnnotationRule<DecimalMax, Double> {
    protected DecimalMaxRule(DecimalMax decimalMax) {
        super(decimalMax);
    }

    public boolean isValid(Double d) {
        if (d != null) {
            double value = this.mRuleAnnotation.value();
            pilihJenisKodeBankTransaksi.a();
            return pilihJenisKodeBankTransaksi.c(d.doubleValue(), value);
        }
        throw new IllegalArgumentException("'Double' cannot be null.");
    }
}
