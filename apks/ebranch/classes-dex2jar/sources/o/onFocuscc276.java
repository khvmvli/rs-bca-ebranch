package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.tozny.crypto.android.AesCbcWithIntegrity;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/onFocuscc276.class */
public final class onFocuscc276 implements SharedPreferences {
    private static boolean b = false;
    private static final String e = "com.securepreferences.SecurePreferences";
    private String a;
    private AesCbcWithIntegrity.write c;
    SharedPreferences d;

    /* loaded from: classes-dex2jar.jar:o/onFocuscc276$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements SharedPreferences.Editor {
        private SharedPreferences.Editor e;

        private RemoteActionCompatParcelizer() {
            this.e = onFocuscc276.this.d.edit();
        }

        /* synthetic */ RemoteActionCompatParcelizer(onFocuscc276 onfocuscc276, byte b) {
            this();
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            this.e.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.e.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return this.e.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.e.putString(onFocuscc276.d(str), onFocuscc276.this.e(Boolean.toString(z)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            this.e.putString(onFocuscc276.d(str), onFocuscc276.this.e(Float.toString(f)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            this.e.putString(onFocuscc276.d(str), onFocuscc276.this.e(Integer.toString(i)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            this.e.putString(onFocuscc276.d(str), onFocuscc276.this.e(Long.toString(j)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            this.e.putString(onFocuscc276.d(str), onFocuscc276.this.e(str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            for (String str2 : set) {
                hashSet.add(onFocuscc276.this.e(str2));
            }
            this.e.putStringSet(onFocuscc276.d(str), hashSet);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            this.e.remove(onFocuscc276.d(str));
            return this;
        }
    }

    private onFocuscc276(Context context, AesCbcWithIntegrity.write write, String str, String str2) {
        if (this.d == null) {
            this.a = this.a;
            this.d = TextUtils.isEmpty(str2) ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str2, 0);
        }
        if (write != null) {
            this.c = write;
        } else if (TextUtils.isEmpty(str)) {
            try {
                AesCbcWithIntegrity.write c = AesCbcWithIntegrity.c(context.getPackageName(), a(context).getBytes());
                if (c != null) {
                    String d = d(c.toString());
                    String string = this.d.getString(d, null);
                    if (string == null) {
                        this.c = AesCbcWithIntegrity.e();
                        if (!this.d.edit().putString(d, this.c.toString()).commit()) {
                            Log.w(e, "Key not committed to prefs");
                        }
                    } else {
                        this.c = AesCbcWithIntegrity.d(string);
                    }
                    if (this.c == null) {
                        throw new GeneralSecurityException("Problem generating Key");
                    }
                    return;
                }
                throw new GeneralSecurityException("Key not generated");
            } catch (GeneralSecurityException e2) {
                if (b) {
                    String str3 = e;
                    StringBuilder sb = new StringBuilder("Error init:");
                    sb.append(e2.getMessage());
                    Log.e(str3, sb.toString());
                }
                throw new IllegalStateException(e2);
            }
        } else {
            try {
                AesCbcWithIntegrity.write c2 = AesCbcWithIntegrity.c(str, a(context).getBytes());
                this.c = c2;
                if (c2 == null) {
                    throw new GeneralSecurityException("Problem generating Key From Password");
                }
            } catch (GeneralSecurityException e3) {
                if (b) {
                    String str4 = e;
                    StringBuilder sb2 = new StringBuilder("Error init using user password:");
                    sb2.append(e3.getMessage());
                    Log.e(str4, sb2.toString());
                }
                throw new IllegalStateException(e3);
            }
        }
    }

    public onFocuscc276(Context context, String str, String str2) {
        this(context, null, str, str2);
    }

    private static String a(Context context) {
        try {
            String str = (String) Build.class.getField("SERIAL").get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), "android_id") : str;
        } catch (Exception e2) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrity.e(new AesCbcWithIntegrity.read(str), this.c);
        } catch (UnsupportedEncodingException e2) {
            if (!b) {
                return null;
            }
            Log.w(e, "decrypt", e2);
            return null;
        } catch (GeneralSecurityException e3) {
            if (!b) {
                return null;
            }
            Log.w(e, "decrypt", e3);
            return null;
        }
    }

    public static String d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Utf8Charset.NAME);
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (UnsupportedEncodingException e2) {
            if (!b) {
                return null;
            }
            Log.w(e, "Problem generating hash", e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            if (!b) {
                return null;
            }
            Log.w(e, "Problem generating hash", e3);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.d.contains(d(str));
    }

    String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AesCbcWithIntegrity.d(str, this.c).toString();
        } catch (UnsupportedEncodingException e2) {
            if (!b) {
                return null;
            }
            Log.w(e, "encrypt", e2);
            return null;
        } catch (GeneralSecurityException e3) {
            if (!b) {
                return null;
            }
            Log.w(e, "encrypt", e3);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final /* synthetic */ SharedPreferences.Editor edit() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, String> getAll() {
        Map<String, ?> all = this.d.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                Object value = entry.getValue();
                if (value != null && !value.equals(this.c.toString())) {
                    hashMap.put(entry.getKey(), c(value.toString()));
                }
            } catch (Exception e2) {
                if (b) {
                    Log.w(e, "error during getAll", e2);
                }
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        String string = this.d.getString(d(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        String string = this.d.getString(d(str), null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        String string = this.d.getString(d(str), null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        String string = this.d.getString(d(str), null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String string = this.d.getString(d(str), null);
        if (string != null) {
            str2 = c(string);
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.d.getStringSet(d(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        for (String str2 : stringSet) {
            hashSet.add(c(str2));
        }
        return hashSet;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
