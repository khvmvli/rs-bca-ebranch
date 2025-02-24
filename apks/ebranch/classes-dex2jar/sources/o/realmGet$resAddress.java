package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes-dex2jar.jar:o/realmGet$resAddress.class */
public class realmGet$resAddress {
    protected final realmGet$religionValue e;

    public realmGet$resAddress(realmGet$religionValue realmget_religionvalue) {
        this.e = realmget_religionvalue;
    }

    public static realmGet$religionValue b(Activity activity) {
        return d(new realmGet$resHouseStatus(activity));
    }

    protected static realmGet$religionValue d(realmGet$resHouseStatus realmget_reshousestatus) {
        if (realmget_reshousestatus.c()) {
            return setBusinessFieldValue.a(realmget_reshousestatus.d());
        }
        if (realmget_reshousestatus.b()) {
            return setAcctType.d(realmget_reshousestatus.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public Activity d() {
        Activity c = this.e.c();
        setFotoKtp.b(c);
        return c;
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void d(Bundle bundle) {
    }

    public void e() {
    }

    public void e(Bundle bundle) {
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
