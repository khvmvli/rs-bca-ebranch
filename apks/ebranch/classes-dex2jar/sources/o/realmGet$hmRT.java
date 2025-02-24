package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$hmRT.class */
public final class realmGet$hmRT {
    private int c = 0;
    private final Context d;
    private int e;

    public realmGet$hmRT(Context context) {
        this.d = context;
    }

    private final PackageInfo b(String str) {
        try {
            return realmGet$jenisWarkatTransaksi.b(this.d).d(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }

    public final int b() {
        synchronized (this) {
            int i = this.c;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.d.getPackageManager();
            if (realmGet$jenisWarkatTransaksi.b(this.d).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            if (!getTipeNasabahPengirimId.d()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    this.c = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (getTipeNasabahPengirimId.d()) {
                    this.c = 2;
                } else {
                    this.c = 1;
                }
                return this.c;
            }
            this.c = 2;
            return 2;
        }
    }

    public final int e() {
        int i;
        PackageInfo b;
        synchronized (this) {
            if (this.e == 0 && (b = b("com.google.android.gms")) != null) {
                this.e = b.versionCode;
            }
            i = this.e;
        }
        return i;
    }
}
