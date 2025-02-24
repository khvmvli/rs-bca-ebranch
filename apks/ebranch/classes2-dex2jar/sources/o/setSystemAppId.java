package o;

import android.content.SharedPreferences;
/* loaded from: classes2-dex2jar.jar:o/setSystemAppId.class */
public final class setSystemAppId {
    private boolean a;
    private final boolean b;
    final /* synthetic */ realmGet$FlagRepresentativeTransaction c;
    private final String d;
    private boolean e;

    public setSystemAppId(realmGet$FlagRepresentativeTransaction realmget_flagrepresentativetransaction, String str, boolean z) {
        this.c = realmget_flagrepresentativetransaction;
        setFotoKtp.c(str);
        this.d = str;
        this.b = z;
    }

    public final void d(boolean z) {
        SharedPreferences.Editor edit = this.c.a().edit();
        edit.putBoolean(this.d, z);
        edit.apply();
        this.e = z;
    }

    public final boolean d() {
        if (!this.a) {
            this.a = true;
            this.e = this.c.a().getBoolean(this.d, this.b);
        }
        return this.e;
    }
}
