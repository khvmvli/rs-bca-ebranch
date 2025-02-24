package com.google.firebase.analytics.connector;

import java.util.Set;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/analytics/connector/AnalyticsConnector$AnalyticsConnectorHandle.class */
public interface AnalyticsConnector$AnalyticsConnectorHandle {
    void registerEventNames(Set<String> set);

    void unregister();

    void unregisterEventNames();
}
