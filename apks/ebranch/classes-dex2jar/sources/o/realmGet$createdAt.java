package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/realmGet$createdAt.class */
public final class realmGet$createdAt {
    private SharedPreferences b;

    public realmGet$createdAt(Context context) {
        try {
            Context remoteContext = realmGet$lastEducation.getRemoteContext(context);
            this.b = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float d(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    public final boolean d(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.b;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
