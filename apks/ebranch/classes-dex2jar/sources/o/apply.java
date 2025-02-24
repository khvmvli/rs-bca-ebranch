package o;

import android.content.Context;
import java.io.File;
/* loaded from: classes-dex2jar.jar:o/apply.class */
public final class apply {
    private static setFallbackResource a;
    private static setFontAssetDelegate b;
    public static boolean c;
    private static int d;
    private static volatile setImageAssetsFolder e;
    private static volatile setMaxProgress f;
    private static int g;
    private static long[] h;
    private static String[] i;
    private static boolean j;

    public static setMaxProgress a(Context context) {
        setMaxProgress setmaxprogress = f;
        setMaxProgress setmaxprogress2 = setmaxprogress;
        if (setmaxprogress == null) {
            synchronized (setMaxProgress.class) {
                try {
                    setMaxProgress setmaxprogress3 = f;
                    setmaxprogress2 = setmaxprogress3;
                    if (setmaxprogress3 == null) {
                        setImageAssetsFolder b2 = b(context);
                        setFontAssetDelegate setfontassetdelegate = b;
                        setFontAssetDelegate setfontassetdelegate2 = setfontassetdelegate;
                        if (setfontassetdelegate == null) {
                            setfontassetdelegate2 = new setFailureListener();
                        }
                        setmaxprogress2 = new setMaxProgress(b2, setfontassetdelegate2);
                        f = setmaxprogress2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return setmaxprogress2;
    }

    private static setImageAssetsFolder b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        setImageAssetsFolder setimageassetsfolder = e;
        setImageAssetsFolder setimageassetsfolder2 = setimageassetsfolder;
        if (setimageassetsfolder == null) {
            synchronized (setImageAssetsFolder.class) {
                try {
                    setImageAssetsFolder setimageassetsfolder3 = e;
                    setimageassetsfolder2 = setimageassetsfolder3;
                    if (setimageassetsfolder3 == null) {
                        setFallbackResource setfallbackresource = a;
                        setFallbackResource setfallbackresource2 = setfallbackresource;
                        if (setfallbackresource == null) {
                            setfallbackresource2 = new setFallbackResource() { // from class: o.apply.4
                                @Override // o.setFallbackResource
                                public final File c() {
                                    return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                                }
                            };
                        }
                        setImageAssetsFolder setimageassetsfolder4 = new setImageAssetsFolder(setfallbackresource2);
                        e = setimageassetsfolder4;
                        setimageassetsfolder2 = setimageassetsfolder4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return setimageassetsfolder2;
    }

    public static void c(String str) {
        if (j) {
            int i2 = g;
            if (i2 == 20) {
                d++;
                return;
            }
            i[i2] = str;
            h[i2] = System.nanoTime();
            setDrawerShadow.b(str);
            g++;
        }
    }

    public static float d(String str) {
        int i2 = d;
        if (i2 > 0) {
            d = i2 - 1;
            return 0.0f;
        } else if (!j) {
            return 0.0f;
        } else {
            int i3 = g - 1;
            g = i3;
            if (i3 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(i[i3])) {
                setDrawerShadow.e();
                return ((float) (System.nanoTime() - h[g])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(i[g]);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
