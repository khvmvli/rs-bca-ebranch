package o;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:o/ReservasiTellerDialog_ViewBinding.class */
public class ReservasiTellerDialog_ViewBinding implements AnalyticsConnector$AnalyticsConnectorListener {
    public AnalyticsEventReceiver a;
    public AnalyticsEventReceiver c;

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger.getLogger().v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            Bundle bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle3.getString("_o")) ? this.a : this.c;
            if (analyticsEventReceiver != null) {
                analyticsEventReceiver.onEvent(string, bundle3);
            }
        }
    }
}
