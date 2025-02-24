package o;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/setImageAssetsFolder.class */
public class setImageAssetsFolder {
    private final setFallbackResource c;

    public setImageAssetsFolder(setFallbackResource setfallbackresource) {
        this.c = setfallbackresource;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str, setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            StringBuilder sb2 = new StringBuilder(".temp");
            sb2.append(setignoredisabledsystemanimations.a);
            str2 = sb2.toString();
        } else {
            str2 = setignoredisabledsystemanimations.a;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File b() {
        File c = this.c.c();
        if (c.isFile()) {
            c.delete();
        }
        if (!c.exists()) {
            c.mkdirs();
        }
        return c;
    }

    public final Pair<setIgnoreDisabledSystemAnimations, InputStream> d(String str) {
        try {
            File file = new File(b(), c(str, setIgnoreDisabledSystemAnimations.JSON, false));
            if (!file.exists()) {
                file = new File(b(), c(str, setIgnoreDisabledSystemAnimations.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations = file.getAbsolutePath().endsWith(".zip") ? setIgnoreDisabledSystemAnimations.ZIP : setIgnoreDisabledSystemAnimations.JSON;
            StringBuilder sb = new StringBuilder("Cache hit for ");
            sb.append(str);
            sb.append(" at ");
            sb.append(file.getAbsolutePath());
            AvailableBookingTimeActivity_ViewBinding.d(sb.toString());
            return new Pair<>(setignoredisabledsystemanimations, fileInputStream);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File d(String str, InputStream inputStream, setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations) throws IOException {
        File file = new File(b(), c(str, setignoredisabledsystemanimations, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
