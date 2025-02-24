package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$$ExternalSyntheticLambda0.class */
public final /* synthetic */ class CrashlyticsCore$$ExternalSyntheticLambda0 implements BreadcrumbHandler {
    public final /* synthetic */ CrashlyticsCore f$0;

    public /* synthetic */ CrashlyticsCore$$ExternalSyntheticLambda0(CrashlyticsCore crashlyticsCore) {
        this.f$0 = crashlyticsCore;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
    public final void handleBreadcrumb(String str) {
        this.f$0.log(str);
    }
}
