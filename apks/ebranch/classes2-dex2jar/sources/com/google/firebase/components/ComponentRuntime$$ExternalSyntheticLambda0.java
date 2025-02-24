package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import o.PilihTahunBulanDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentRuntime$$ExternalSyntheticLambda0.class */
public final /* synthetic */ class ComponentRuntime$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ PilihTahunBulanDialog f$0;
    public final /* synthetic */ Provider f$1;

    public /* synthetic */ ComponentRuntime$$ExternalSyntheticLambda0(PilihTahunBulanDialog pilihTahunBulanDialog, Provider provider) {
        this.f$0 = pilihTahunBulanDialog;
        this.f$1 = provider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentRuntime.lambda$processInstanceComponents$2(this.f$0, this.f$1);
    }
}
