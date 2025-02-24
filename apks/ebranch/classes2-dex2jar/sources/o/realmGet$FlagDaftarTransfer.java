package o;

import android.content.SharedPreferences;
/* loaded from: classes2-dex2jar.jar:o/realmGet$FlagDaftarTransfer.class */
public final class realmGet$FlagDaftarTransfer {
    final /* synthetic */ realmGet$FlagRepresentativeTransaction b;
    private String c;
    private final String d;
    private boolean e;

    public realmGet$FlagDaftarTransfer(realmGet$FlagRepresentativeTransaction realmget_flagrepresentativetransaction, String str, String str2) {
        this.b = realmget_flagrepresentativetransaction;
        setFotoKtp.c(str);
        this.d = str;
    }

    public final String b() {
        if (!this.e) {
            this.e = true;
            this.c = this.b.a().getString(this.d, null);
        }
        return this.c;
    }

    public final void d(String str) {
        SharedPreferences.Editor edit = this.b.a().edit();
        edit.putString(this.d, str);
        edit.apply();
        this.c = str;
    }
}
