package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes2-dex2jar.jar:o/setNominalTransaksiTeller.class */
public final class setNominalTransaksiTeller extends BroadcastReceiver {
    private final realmSet$kirimanUangs b;
    private boolean c;
    private boolean d;

    public setNominalTransaksiTeller(realmSet$kirimanUangs realmset_kirimanuangs) {
        setFotoKtp.b(realmset_kirimanuangs);
        this.b = realmset_kirimanuangs;
    }

    public final void a() {
        this.b.w();
        this.b.o_().r_();
        this.b.o_().r_();
        if (this.c) {
            this.b.s_().i().b("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                this.b.t_().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.b.s_().b().e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void c() {
        this.b.w();
        this.b.o_().r_();
        if (!this.c) {
            this.b.t_().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = this.b.h().d();
            this.b.s_().i().e("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.w();
        String action = intent.getAction();
        this.b.s_().i().e("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean d = this.b.h().d();
            if (this.d != d) {
                this.d = d;
                this.b.o_().b(new setNameTransaksi(this, d));
                return;
            }
            return;
        }
        this.b.s_().c().e("NetworkBroadcastReceiver received unknown action", action);
    }
}
