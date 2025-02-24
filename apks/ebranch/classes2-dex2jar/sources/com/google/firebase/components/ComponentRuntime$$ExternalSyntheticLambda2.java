package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import o.QRCodeDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentRuntime$$ExternalSyntheticLambda2.class */
public final /* synthetic */ class ComponentRuntime$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ QRCodeDialog f$0;
    public final /* synthetic */ Provider f$1;

    public /* synthetic */ ComponentRuntime$$ExternalSyntheticLambda2(QRCodeDialog qRCodeDialog, Provider provider) {
        this.f$0 = qRCodeDialog;
        this.f$1 = provider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentRuntime.lambda$processSetComponents$3(this.f$0, this.f$1);
    }
}
