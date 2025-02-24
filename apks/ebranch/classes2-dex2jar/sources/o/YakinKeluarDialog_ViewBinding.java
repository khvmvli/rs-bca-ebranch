package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/YakinKeluarDialog_ViewBinding.class */
public class YakinKeluarDialog_ViewBinding {
    public final SharedPreferences c;
    final Context d;

    /* loaded from: classes2-dex2jar.jar:o/YakinKeluarDialog_ViewBinding$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        public static final long c = TimeUnit.DAYS.toMillis(7);
        public final String b;
        public final String d;
        public final long e;

        private IconCompatParcelizer(String str, String str2, long j) {
            this.b = str;
            this.d = str2;
            this.e = j;
        }

        static String b(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w(Constants.TAG, sb.toString());
                return null;
            }
        }

        static IconCompatParcelizer b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new IconCompatParcelizer(str, null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new IconCompatParcelizer(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w(Constants.TAG, sb.toString());
                return null;
            }
        }
    }

    public YakinKeluarDialog_ViewBinding(Context context) {
        this.d = context;
        this.c = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(copyWindowDataInto.c(this.d), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !e()) {
                    Log.i(Constants.TAG, "App restored, clearing state");
                    c();
                }
            } catch (IOException e) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(Constants.TAG, valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    private void c() {
        synchronized (this) {
            this.c.edit().clear().commit();
        }
    }

    private boolean e() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.c.getAll().isEmpty();
        }
        return isEmpty;
    }

    public final void b(String str, String str2, String str3, String str4) {
        synchronized (this) {
            String b = IconCompatParcelizer.b(str3, str4, System.currentTimeMillis());
            if (b != null) {
                SharedPreferences.Editor edit = this.c.edit();
                edit.putString(a(str, str2), b);
                edit.commit();
            }
        }
    }

    public final IconCompatParcelizer e(String str, String str2) {
        IconCompatParcelizer b;
        synchronized (this) {
            b = IconCompatParcelizer.b(this.c.getString(a(str, str2), null));
        }
        return b;
    }
}
