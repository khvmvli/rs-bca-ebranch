package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.events.Subscriber;
/* loaded from: classes2-dex2jar.jar:o/PilihJenisIdentitasDialog_ViewBinding.class */
public final /* synthetic */ class PilihJenisIdentitasDialog_ViewBinding implements ComponentFactory {
    public static final ComponentFactory a = new PilihJenisIdentitasDialog_ViewBinding();

    private PilihJenisIdentitasDialog_ViewBinding() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return AnalyticsConnectorImpl.getInstance((FirebaseApp) componentContainer.get(FirebaseApp.class), (Context) componentContainer.get(Context.class), (Subscriber) componentContainer.get(Subscriber.class));
    }
}
