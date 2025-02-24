package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
/* loaded from: classes-dex2jar.jar:o/setMaxProgress.class */
public class setMaxProgress {
    private final setFontAssetDelegate a;
    public final setImageAssetsFolder d;

    public setMaxProgress(setImageAssetsFolder setimageassetsfolder, setFontAssetDelegate setfontassetdelegate) {
        this.d = setimageassetsfolder;
        this.a = setfontassetdelegate;
    }

    public BindBitmap<BindAnim> b(String str, String str2) {
        Throwable th;
        Exception e;
        setFrame c;
        setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations;
        BindBitmap<BindAnim> bindBitmap;
        StringBuilder sb = new StringBuilder("Fetching ");
        sb.append(str);
        AvailableBookingTimeActivity_ViewBinding.d(sb.toString());
        setFrame setframe = null;
        setFrame setframe2 = null;
        try {
            try {
                c = this.a.c(str);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (c.c()) {
                InputStream a = c.a();
                String b = c.b();
                String str3 = b;
                if (b == null) {
                    str3 = "application/json";
                }
                boolean z = false;
                if (str3.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
                    AvailableBookingTimeActivity_ViewBinding.d("Handling zip response.");
                    setignoredisabledsystemanimations = setIgnoreDisabledSystemAnimations.ZIP;
                    bindBitmap = str2 == null ? Action.a(new ZipInputStream(a), (String) null) : Action.a(new ZipInputStream(new FileInputStream(this.d.d(str, a, setIgnoreDisabledSystemAnimations.ZIP))), str);
                } else {
                    AvailableBookingTimeActivity_ViewBinding.d("Received json response.");
                    setignoredisabledsystemanimations = setIgnoreDisabledSystemAnimations.JSON;
                    bindBitmap = str2 == null ? Action.b(a, (String) null) : Action.b(new FileInputStream(new File(this.d.d(str, a, setIgnoreDisabledSystemAnimations.JSON).getAbsolutePath())), str);
                }
                if (!(str2 == null || bindBitmap.b == null)) {
                    File file = new File(this.d.b(), setImageAssetsFolder.c(str, setignoredisabledsystemanimations, true));
                    File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
                    boolean renameTo = file.renameTo(file2);
                    StringBuilder sb2 = new StringBuilder("Copying temp file to real file (");
                    sb2.append(file2);
                    sb2.append(")");
                    AvailableBookingTimeActivity_ViewBinding.d(sb2.toString());
                    if (!renameTo) {
                        StringBuilder sb3 = new StringBuilder("Unable to rename cache file ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(" to ");
                        sb3.append(file2.getAbsolutePath());
                        sb3.append(".");
                        AvailableBookingTimeActivity_ViewBinding.b(sb3.toString());
                    }
                }
                StringBuilder sb4 = new StringBuilder("Completed fetch from network. Success: ");
                if (bindBitmap.b != null) {
                    z = true;
                }
                sb4.append(z);
                AvailableBookingTimeActivity_ViewBinding.d(sb4.toString());
                try {
                    c.close();
                } catch (IOException e3) {
                    AvailableBookingTimeActivity_ViewBinding.a("LottieFetchResult close failed ", e3);
                }
                return bindBitmap;
            }
            BindBitmap<BindAnim> bindBitmap2 = new BindBitmap<>(new IllegalArgumentException(c.d()));
            try {
                c.close();
            } catch (IOException e4) {
                AvailableBookingTimeActivity_ViewBinding.a("LottieFetchResult close failed ", e4);
            }
            return bindBitmap2;
        } catch (Exception e5) {
            e = e5;
            setframe = c;
            setframe2 = setframe;
            BindBitmap<BindAnim> bindBitmap3 = new BindBitmap<>(e);
            if (setframe != null) {
                try {
                    setframe.close();
                } catch (IOException e6) {
                    AvailableBookingTimeActivity_ViewBinding.a("LottieFetchResult close failed ", e6);
                }
            }
            return bindBitmap3;
        } catch (Throwable th3) {
            th = th3;
            setframe2 = c;
            if (setframe2 != null) {
                try {
                    setframe2.close();
                } catch (IOException e7) {
                    AvailableBookingTimeActivity_ViewBinding.a("LottieFetchResult close failed ", e7);
                }
            }
            throw th;
        }
    }
}
