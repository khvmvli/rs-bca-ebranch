package o;

import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
/* loaded from: classes2-dex2jar.jar:o/PilihRekeningSumberDanaDialog_ViewBinding.class */
public final /* synthetic */ class PilihRekeningSumberDanaDialog_ViewBinding implements EventHandler {
    public static final EventHandler a = new PilihRekeningSumberDanaDialog_ViewBinding();

    private PilihRekeningSumberDanaDialog_ViewBinding() {
    }

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        AnalyticsConnectorImpl.zza(event);
    }
}
