package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/realmGet$alamatPengirim.class */
public final class realmGet$alamatPengirim {
    protected final Context e;

    public realmGet$alamatPengirim(Context context) {
        this.e = context;
    }

    public final int a(String str) {
        return this.e.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public final int b(String str, String str2) {
        return this.e.getPackageManager().checkPermission(str, str2);
    }

    public final CharSequence b(String str) throws PackageManager.NameNotFoundException {
        Context context = this.e;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public final boolean b(int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.e.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException e) {
            return false;
        }
    }

    @ResultIgnorabilityUnspecified
    public final ApplicationInfo c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.e.getPackageManager().getApplicationInfo(str, i);
    }

    @ResultIgnorabilityUnspecified
    public final PackageInfo d(String str, int i) throws PackageManager.NameNotFoundException {
        return this.e.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean d() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return realmGet$accType.c(this.e);
        }
        if (!(Build.VERSION.SDK_INT >= 26) || (nameForUid = this.e.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.e.getPackageManager().isInstantApp(nameForUid);
    }
}
