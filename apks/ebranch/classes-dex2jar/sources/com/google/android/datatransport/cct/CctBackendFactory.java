package com.google.android.datatransport.cct;

import o.getCob;
import o.getDob;
import o.getFlagEKTP;
import o.setBanknoteCondition;
/* loaded from: classes-dex2jar.jar:com/google/android/datatransport/cct/CctBackendFactory.class */
public class CctBackendFactory implements getCob {
    @Override // o.getCob
    public getFlagEKTP create(getDob getdob) {
        return new setBanknoteCondition(getdob.e(), getdob.c(), getdob.a());
    }
}
