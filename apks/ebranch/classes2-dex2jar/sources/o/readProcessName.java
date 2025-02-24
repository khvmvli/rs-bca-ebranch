package o;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
/* loaded from: classes2-dex2jar.jar:o/readProcessName.class */
final class readProcessName {
    public static String b = "EasyImage";
    public static String c = "Temp";

    readProcessName() {
    }

    private static File c(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_name", b));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String c(Context context, Uri uri) {
        return uri.getScheme().equals(FirebaseAnalytics.Param.CONTENT) ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }

    private static File d(Context context) {
        File e = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("pl.aprilapps.public_temp", false) ? e(context) : c(context);
        if (!e.exists()) {
            e.mkdirs();
        }
        return e;
    }

    private static File e(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File file = new File(new File(PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_location", externalFilesDir != null ? externalFilesDir.getPath() : null), PreferenceManager.getDefaultSharedPreferences(context).getString("pl.aprilapps.folder_name", b)), c);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File e(Context context, Uri uri) throws IOException {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        File d = d(context);
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(".");
        sb.append(c(context, uri));
        File file = new File(d, sb.toString());
        file.createNewFile();
        e(openInputStream, file);
        return file;
    }

    private static void e(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
