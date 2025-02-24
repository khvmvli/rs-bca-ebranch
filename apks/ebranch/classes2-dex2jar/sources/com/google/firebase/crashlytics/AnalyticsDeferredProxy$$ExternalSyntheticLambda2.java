package com.google.firebase.crashlytics;

import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/AnalyticsDeferredProxy$$ExternalSyntheticLambda2.class */
public final /* synthetic */ class AnalyticsDeferredProxy$$ExternalSyntheticLambda2 implements Deferred$DeferredHandler {
    public final /* synthetic */ AnalyticsDeferredProxy f$0;

    public /* synthetic */ AnalyticsDeferredProxy$$ExternalSyntheticLambda2(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f$0 = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.inject.Deferred$DeferredHandler
    public final void handle(Provider provider) {
        this.f$0.lambda$init$2$com-google-firebase-crashlytics-AnalyticsDeferredProxy(provider);
    }
}
