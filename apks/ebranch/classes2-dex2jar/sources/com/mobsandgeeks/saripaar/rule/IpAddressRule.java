package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.IpAddress;
import o.pilihHubunganKeuanganOR;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/rule/IpAddressRule.class */
public class IpAddressRule extends AnnotationRule<IpAddress, String> {
    protected IpAddressRule(IpAddress ipAddress) {
        super(ipAddress);
    }

    public boolean isValid(String str) {
        pilihHubunganKeuanganOR b = pilihHubunganKeuanganOR.b();
        return b.d(str) || b.c(str);
    }
}
