package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.DecimalMin;
import o.pilihJenisKodeBankTransaksi;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/DecimalMinRule.class */
public class DecimalMinRule extends AnnotationRule<DecimalMin, Double> {
    protected DecimalMinRule(DecimalMin decimalMin) {
        super(decimalMin);
    }

    public boolean isValid(Double d) {
        if (d != null) {
            double value = this.mRuleAnnotation.value();
            pilihJenisKodeBankTransaksi.a();
            return pilihJenisKodeBankTransaksi.a(d.doubleValue(), value);
        }
        throw new IllegalArgumentException("'Double' cannot be null.");
    }
}
