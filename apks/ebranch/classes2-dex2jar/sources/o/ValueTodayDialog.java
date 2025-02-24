package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.Constants;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/ValueTodayDialog.class */
public class ValueTodayDialog {
    private String a;
    private int b;
    private int c = 0;
    private String d;
    private final Context e;

    public ValueTodayDialog(Context context) {
        this.e = context;
    }

    private PackageInfo a(String str) {
        try {
            return this.e.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w(Constants.TAG, sb.toString());
            return null;
        }
    }

    private void a() {
        synchronized (this) {
            PackageInfo a = a(this.e.getPackageName());
            if (a != null) {
                this.d = Integer.toString(a.versionCode);
                this.a = a.versionName;
            }
        }
    }

    public static String b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        String str;
        synchronized (this) {
            if (this.a == null) {
                a();
            }
            str = this.a;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (this) {
            if (this.d == null) {
                a();
            }
            str = this.d;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        int i;
        PackageInfo a;
        synchronized (this) {
            if (this.b == 0 && (a = a("com.google.android.gms")) != null) {
                this.b = a.versionCode;
            }
            i = this.b;
        }
        return i;
    }

    public final int e() {
        synchronized (this) {
            int i = this.c;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.e.getPackageManager();
            boolean z = false;
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e(Constants.TAG, "Google Play services missing or without correct permission.");
                return 0;
            }
            int i2 = 1;
            if (!(Build.VERSION.SDK_INT >= 26)) {
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
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.c = 2;
                return 2;
            }
            Log.w(Constants.TAG, "Failed to resolve IID implementation package, falling back");
            if (Build.VERSION.SDK_INT >= 26) {
                z = true;
            }
            if (z) {
                this.c = 2;
                i2 = 2;
            } else {
                this.c = 1;
            }
            return i2;
        }
    }
}
