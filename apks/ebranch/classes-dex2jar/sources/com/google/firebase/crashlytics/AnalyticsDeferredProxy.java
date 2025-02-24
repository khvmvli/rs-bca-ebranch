package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy$;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.ReservasiTellerDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/google/firebase/crashlytics/AnalyticsDeferredProxy.class */
public class AnalyticsDeferredProxy {
    private final Deferred<AnalyticsConnector> analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;
    private final List<BreadcrumbHandler> breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = deferred;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }

    private void init() {
        this.analyticsConnectorDeferred.whenAvailable(new AnalyticsDeferredProxy$.ExternalSyntheticLambda2(this));
    }

    private static AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(AnalyticsConnector analyticsConnector, ReservasiTellerDialog_ViewBinding reservasiTellerDialog_ViewBinding) {
        AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", reservasiTellerDialog_ViewBinding);
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandle = registerAnalyticsConnectorListener;
        if (registerAnalyticsConnectorListener == null) {
            Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener2 = analyticsConnector.registerAnalyticsConnectorListener("crash", reservasiTellerDialog_ViewBinding);
            analyticsConnectorHandle = registerAnalyticsConnectorListener2;
            if (registerAnalyticsConnectorListener2 != null) {
                Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                analyticsConnectorHandle = registerAnalyticsConnectorListener2;
            }
        }
        return analyticsConnectorHandle;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsDeferredProxy$.ExternalSyntheticLambda1(this);
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new AnalyticsDeferredProxy$.ExternalSyntheticLambda0(this);
    }

    /* renamed from: lambda$getAnalyticsEventLogger$1$com-google-firebase-crashlytics-AnalyticsDeferredProxy  reason: not valid java name */
    /* synthetic */ void m233xdd1a3d95(String str, Bundle bundle) {
        this.analyticsEventLogger.logEvent(str, bundle);
    }

    /* renamed from: lambda$getDeferredBreadcrumbSource$0$com-google-firebase-crashlytics-AnalyticsDeferredProxy  reason: not valid java name */
    /* synthetic */ void m234x77abb2bd(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            if (this.breadcrumbSource instanceof DisabledBreadcrumbSource) {
                this.breadcrumbHandlerList.add(breadcrumbHandler);
            }
            this.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
        }
    }

    /* renamed from: lambda$init$2$com-google-firebase-crashlytics-AnalyticsDeferredProxy  reason: not valid java name */
    /* synthetic */ void m235xec284ea4(Provider provider) {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        ReservasiTellerDialog_ViewBinding reservasiTellerDialog_ViewBinding = new ReservasiTellerDialog_ViewBinding();
        if (subscribeToAnalyticsEvents(analyticsConnector, reservasiTellerDialog_ViewBinding) != null) {
            Logger.getLogger().d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (BreadcrumbHandler breadcrumbHandler : this.breadcrumbHandlerList) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(breadcrumbHandler);
                }
                reservasiTellerDialog_ViewBinding.c = breadcrumbAnalyticsEventReceiver;
                reservasiTellerDialog_ViewBinding.a = blockingAnalyticsEventLogger;
                this.breadcrumbSource = breadcrumbAnalyticsEventReceiver;
                this.analyticsEventLogger = blockingAnalyticsEventLogger;
            }
            return;
        }
        Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
    }
}
