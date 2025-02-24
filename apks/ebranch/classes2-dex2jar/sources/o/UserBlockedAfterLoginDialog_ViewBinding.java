package o;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.messaging.Constants;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/UserBlockedAfterLoginDialog_ViewBinding.class */
public class UserBlockedAfterLoginDialog_ViewBinding {
    public final FirebaseApp a;
    private final FirebaseInstallationsApi b;
    private final ValueTodayDialog c;
    private final Provider<HeartBeatInfo> d;
    public final realmGet.emailAddr e;
    private final Provider<UserAgentPublisher> j;

    public UserBlockedAfterLoginDialog_ViewBinding(FirebaseApp firebaseApp, ValueTodayDialog valueTodayDialog, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, valueTodayDialog, new realmGet.emailAddr(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private UserBlockedAfterLoginDialog_ViewBinding(FirebaseApp firebaseApp, ValueTodayDialog valueTodayDialog, realmGet.emailAddr emailaddr, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.a = firebaseApp;
        this.c = valueTodayDialog;
        this.e = emailaddr;
        this.j = provider;
        this.d = provider2;
        this.b = firebaseInstallationsApi;
    }

    public static boolean a(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private String e() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.getName().getBytes()), 11);
        } catch (NoSuchAlgorithmException e) {
            return "[HASH-ERROR]";
        }
    }

    public Bundle e(String str, String str2, String str3, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.c.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.c.c());
        bundle.putString("app_ver_name", this.c.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String token = ((InstallationTokenResult) setLocalClearingCodeBank.a(this.b.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w(Constants.TAG, "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e(Constants.TAG, "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.d.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.j.get();
        if (!(heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return bundle;
    }
}
