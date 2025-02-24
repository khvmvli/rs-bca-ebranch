package o;

import android.net.Uri;
/* loaded from: classes-dex2jar.jar:o/realmSet$identityCardImg.class */
public final class realmSet$identityCardImg {
    private static final setThumbTextPadding<String, Uri> b = new setThumbTextPadding<>();

    public static Uri e(String str) {
        Uri uri;
        synchronized (realmSet$identityCardImg.class) {
            try {
                setThumbTextPadding<String, Uri> setthumbtextpadding = b;
                Uri uri2 = setthumbtextpadding.get("com.google.android.gms.measurement");
                uri = uri2;
                if (uri2 == null) {
                    String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                    uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                    setthumbtextpadding.put("com.google.android.gms.measurement", uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uri;
    }
}
