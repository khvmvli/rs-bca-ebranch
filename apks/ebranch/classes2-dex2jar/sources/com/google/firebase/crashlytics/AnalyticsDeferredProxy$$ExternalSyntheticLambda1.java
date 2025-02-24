package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/AnalyticsDeferredProxy$$ExternalSyntheticLambda1.class */
public final /* synthetic */ class AnalyticsDeferredProxy$$ExternalSyntheticLambda1 implements AnalyticsEventLogger {
    public final /* synthetic */ AnalyticsDeferredProxy f$0;

    public /* synthetic */ AnalyticsDeferredProxy$$ExternalSyntheticLambda1(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f$0 = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void logEvent(String str, Bundle bundle) {
        this.f$0.lambda$getAnalyticsEventLogger$1$com-google-firebase-crashlytics-AnalyticsDeferredProxy(str, bundle);
    }
}
