package o;

import android.content.SharedPreferences;
/* loaded from: classes2-dex2jar.jar:o/getIsLongForm.class */
public final class getIsLongForm {
    final /* synthetic */ realmGet$FlagRepresentativeTransaction a;
    private long b;
    private final String c;
    private final long d;
    private boolean e;

    public getIsLongForm(realmGet$FlagRepresentativeTransaction realmget_flagrepresentativetransaction, String str, long j) {
        this.a = realmget_flagrepresentativetransaction;
        setFotoKtp.c(str);
        this.c = str;
        this.d = j;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.a.a().edit();
        edit.putLong(this.c, j);
        edit.apply();
        this.b = j;
    }

    public final long d() {
        if (!this.e) {
            this.e = true;
            this.b = this.a.a().getLong(this.c, this.d);
        }
        return this.b;
    }
}
