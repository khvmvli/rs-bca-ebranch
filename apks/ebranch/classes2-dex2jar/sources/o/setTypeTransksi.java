package o;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes2-dex2jar.jar:o/setTypeTransksi.class */
public final class setTypeTransksi {
    private final long a;
    final /* synthetic */ realmGet$FlagRepresentativeTransaction b;
    private final String c;
    private final String d;
    final String e;

    public /* synthetic */ setTypeTransksi(realmGet$FlagRepresentativeTransaction realmget_flagrepresentativetransaction, String str, long j, getFlagSameReceiverSenderData getflagsamereceiversenderdata) {
        this.b = realmget_flagrepresentativetransaction;
        setFotoKtp.c("health_monitor");
        setFotoKtp.b(j > 0);
        this.e = "health_monitor:start";
        this.c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.a = j;
    }

    private final long a() {
        return this.b.a().getLong(this.e, 0);
    }

    private final void e() {
        this.b.r_();
        long e = this.b.q.q_().e();
        SharedPreferences.Editor edit = this.b.a().edit();
        edit.remove(this.c);
        edit.remove(this.d);
        edit.putLong(this.e, e);
        edit.apply();
    }

    public final Pair<String, Long> b() {
        long j;
        this.b.r_();
        this.b.r_();
        long a = a();
        if (a == 0) {
            e();
            j = 0;
        } else {
            j = Math.abs(a - this.b.q.q_().e());
        }
        long j2 = this.a;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            e();
            return null;
        }
        String string = this.b.a().getString(this.d, null);
        long j3 = this.b.a().getLong(this.c, 0);
        e();
        return (string == null || j3 <= 0) ? realmGet$FlagRepresentativeTransaction.a : new Pair<>(string, Long.valueOf(j3));
    }

    public final void d(String str, long j) {
        this.b.r_();
        if (a() == 0) {
            e();
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        long j2 = this.b.a().getLong(this.c, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.b.a().edit();
            edit.putString(this.d, str2);
            edit.putLong(this.c, 1);
            edit.apply();
            return;
        }
        long nextLong = this.b.q.u().g().nextLong();
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.b.a().edit();
        if ((nextLong & Long.MAX_VALUE) < j4) {
            edit2.putString(this.d, str2);
        }
        edit2.putLong(this.c, j3);
        edit2.apply();
    }
}
