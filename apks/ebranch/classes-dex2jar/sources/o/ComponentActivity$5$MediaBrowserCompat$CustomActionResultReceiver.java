package o;

import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver {
    final onRequestPermissionsResult c;
    final ArrayList<onResume> e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentActivity$5$MediaBrowserCompat$CustomActionResultReceiver(onRequestPermissionsResult onrequestpermissionsresult) {
        this.c = onrequestpermissionsresult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        Iterator<onResume> it = this.e.iterator();
        while (it.hasNext()) {
            this.c.e(it.next());
        }
        this.e.clear();
    }
}
