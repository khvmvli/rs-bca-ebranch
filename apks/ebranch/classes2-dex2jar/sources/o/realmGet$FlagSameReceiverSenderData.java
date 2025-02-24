package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.firebase.messaging.Constants;
/* loaded from: classes2-dex2jar.jar:o/realmGet$FlagSameReceiverSenderData.class */
public final class realmGet$FlagSameReceiverSenderData implements ServiceConnection {
    final /* synthetic */ realmGet$ReceiverName c;
    private final String d;

    public realmGet$FlagSameReceiverSenderData(realmGet$ReceiverName realmget_receivername, String str) {
        this.c = realmget_receivername;
        this.d = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                getIdentityCardNumber c = getHmKelurahan.c(iBinder);
                if (c == null) {
                    this.c.d.s_().c().b("Install Referrer Service implementation was not found");
                    return;
                }
                this.c.d.s_().i().b("Install Referrer Service connected");
                this.c.d.o_().b(new Runnable(c, this) { // from class: o.realmGet$FlagSaveToSourceAccountList
                    final /* synthetic */ ServiceConnection a;
                    final /* synthetic */ getIdentityCardNumber e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.e = r5;
                        this.a = r6;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle;
                        Bundle d;
                        realmGet$FlagSameReceiverSenderData realmget_flagsamereceiversenderdata = realmGet$FlagSameReceiverSenderData.this;
                        realmGet$ReceiverName realmget_receivername = realmget_flagsamereceiversenderdata.c;
                        String str = realmget_flagsamereceiversenderdata.d;
                        getIdentityCardNumber getidentitycardnumber = this.e;
                        ServiceConnection serviceConnection = this.a;
                        realmget_receivername.d.o_().r_();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("package_name", str);
                        try {
                            d = getidentitycardnumber.d(bundle2);
                            bundle = d;
                        } catch (Exception e) {
                            realmget_receivername.d.s_().b().e("Exception occurred while retrieving the Install Referrer", e.getMessage());
                        }
                        if (d == null) {
                            realmget_receivername.d.s_().b().b("Install Referrer Service returned a null response");
                            bundle = null;
                        }
                        realmget_receivername.d.o_().r_();
                        if (bundle != null) {
                            long j = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
                            if (j == 0) {
                                realmget_receivername.d.s_().c().b("Service response is missing Install Referrer install timestamp");
                            } else {
                                String string = bundle.getString("install_referrer");
                                if (string == null || string.isEmpty()) {
                                    realmget_receivername.d.s_().b().b("No referrer defined in Install Referrer response");
                                } else {
                                    realmget_receivername.d.s_().i().e("InstallReferrer API result", string);
                                    Bundle a = realmget_receivername.d.u().a(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                                    if (a == null) {
                                        realmget_receivername.d.s_().b().b("No campaign params defined in Install Referrer result");
                                    } else {
                                        String string2 = a.getString("medium");
                                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                                            if (j2 == 0) {
                                                realmget_receivername.d.s_().b().b("Install Referrer is missing click timestamp for ad campaign");
                                            } else {
                                                a.putLong("click_timestamp", j2);
                                            }
                                        }
                                        if (j == realmget_receivername.d.q().b.d()) {
                                            realmget_receivername.d.s_().i().b("Install Referrer campaign has already been logged");
                                        } else if (realmget_receivername.d.a()) {
                                            realmget_receivername.d.q().b.b(j);
                                            realmget_receivername.d.s_().i().e("Logging Install Referrer campaign from sdk with ", "referrer API");
                                            a.putString("_cis", "referrer API");
                                            realmget_receivername.d.x().e("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, a);
                                        }
                                    }
                                }
                            }
                        }
                        getAlamatPengirim.b().d(realmget_receivername.d.t_(), serviceConnection);
                    }
                });
            } catch (RuntimeException e) {
                this.c.d.s_().c().e("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.c.d.s_().c().b("Install Referrer connection returned with null binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.c.d.s_().i().b("Install Referrer Service disconnected");
    }
}
