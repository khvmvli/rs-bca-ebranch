package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setPopupCallback$MediaBrowserCompat$SearchResultReceiver.class */
public abstract class setPopupCallback$MediaBrowserCompat$SearchResultReceiver {
    final /* synthetic */ setPopupCallback a;
    private BroadcastReceiver d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPopupCallback$MediaBrowserCompat$SearchResultReceiver(setPopupCallback setpopupcallback) {
        this.a = setpopupcallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.d != null) {
            try {
                this.a.f.unregisterReceiver(this.d);
            } catch (IllegalArgumentException e) {
            }
            this.d = null;
        }
    }

    abstract IntentFilter b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        a();
        IntentFilter b = b();
        if (b != null && b.countActions() != 0) {
            if (this.d == null) {
                this.d = new BroadcastReceiver() { // from class: o.setPopupCallback$MediaBrowserCompat$SearchResultReceiver.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        setPopupCallback$MediaBrowserCompat$SearchResultReceiver.this.e();
                    }
                };
            }
            this.a.f.registerReceiver(this.d, b);
        }
    }

    abstract void e();
}
