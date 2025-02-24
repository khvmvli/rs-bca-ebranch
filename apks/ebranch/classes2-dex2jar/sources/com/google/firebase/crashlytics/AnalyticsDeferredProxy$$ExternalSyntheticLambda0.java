package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/AnalyticsDeferredProxy$$ExternalSyntheticLambda0.class */
public final /* synthetic */ class AnalyticsDeferredProxy$$ExternalSyntheticLambda0 implements BreadcrumbSource {
    public final /* synthetic */ AnalyticsDeferredProxy f$0;

    public /* synthetic */ AnalyticsDeferredProxy$$ExternalSyntheticLambda0(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f$0 = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        this.f$0.lambda$getDeferredBreadcrumbSource$0$com-google-firebase-crashlytics-AnalyticsDeferredProxy(breadcrumbHandler);
    }
}
