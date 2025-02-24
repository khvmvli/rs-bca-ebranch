package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes-dex2jar.jar:o/Action.class */
public final class Action {
    private static final Map<String, BindFont<BindAnim>> e = new HashMap();
    private static final byte[] b = {80, 75, 3, 4};

    private static Boolean a(setTookMs settookms) {
        try {
            setTookMs j = settookms.j();
            for (byte b2 : b) {
                if (j.i() != b2) {
                    return Boolean.FALSE;
                }
            }
            j.close();
            return Boolean.TRUE;
        } catch (Exception e2) {
            AvailableBookingTimeActivity_ViewBinding.b("Failed to check zip file header", e2);
            return Boolean.FALSE;
        }
    }

    public static BindBitmap<BindAnim> a(Context context, int i, String str) {
        try {
            setTookMs b2 = ChuckerDatabase.b(ChuckerDatabase.d(context.getResources().openRawResource(i)));
            return a(b2).booleanValue() ? a(new ZipInputStream(b2.h()), str) : c(b2.h(), str, true);
        } catch (Resources.NotFoundException e2) {
            return new BindBitmap<>(e2);
        }
    }

    public static BindBitmap<BindAnim> a(ZipInputStream zipInputStream, String str) {
        try {
            return d(zipInputStream, str);
        } finally {
            copyNoRef.d(zipInputStream);
        }
    }

    private static BindBitmap<BindAnim> a(onClickUbahCabang onclickubahcabang, String str, boolean z) {
        try {
            try {
                BindAnim a = sendEmail.a(onclickubahcabang);
                if (str != null) {
                    DebouncingOnClickListener a2 = DebouncingOnClickListener.a();
                    if (str != null) {
                        a2.d.c(str, a);
                    }
                }
                BindBitmap<BindAnim> bindBitmap = new BindBitmap<>(a);
                if (z) {
                    copyNoRef.d(onclickubahcabang);
                }
                return bindBitmap;
            } catch (Exception e2) {
                BindBitmap<BindAnim> bindBitmap2 = new BindBitmap<>(e2);
                if (z) {
                    copyNoRef.d(onclickubahcabang);
                }
                return bindBitmap2;
            }
        } catch (Throwable th) {
            if (z) {
                copyNoRef.d(onclickubahcabang);
            }
            throw th;
        }
    }

    public static BindFont<BindAnim> a(final Context context, final String str) {
        StringBuilder sb = new StringBuilder("url_");
        sb.append(str);
        final String obj = sb.toString();
        return e(obj, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.2
            /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final /* synthetic */ o.BindBitmap<o.BindAnim> call() throws java.lang.Exception {
                /*
                // Method dump skipped, instructions count: 226
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Action.AnonymousClass2.call():java.lang.Object");
            }
        });
    }

    public static BindFont<BindAnim> a(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return e(str2, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                return Action.b(r3, r8, r0);
            }
        });
    }

    private static String b(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    public static BindBitmap<BindAnim> b(Context context, String str) {
        StringBuilder sb = new StringBuilder("asset_");
        sb.append(str);
        return b(context, str, sb.toString());
    }

    public static BindBitmap<BindAnim> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2, true);
            }
            return a(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new BindBitmap<>(e2);
        }
    }

    public static BindBitmap<BindAnim> b(InputStream inputStream, String str) {
        return c(inputStream, str, true);
    }

    private static BindBitmap<BindAnim> c(InputStream inputStream, String str, boolean z) {
        try {
            return a(onClickUbahCabang.d(ChuckerDatabase.b(ChuckerDatabase.d(inputStream))), str, true);
        } finally {
            copyNoRef.d(inputStream);
        }
    }

    public static BindFont<BindAnim> c(Context context, final String str) {
        StringBuilder sb = new StringBuilder("asset_");
        sb.append(str);
        final String obj = sb.toString();
        final Context applicationContext = context.getApplicationContext();
        return e(obj, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                return Action.b(applicationContext, str, obj);
            }
        });
    }

    private static BindBitmap<BindAnim> d(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            BindAnim bindAnim = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    bindAnim = a(onClickUbahCabang.d(ChuckerDatabase.b(ChuckerDatabase.d(zipInputStream))), (String) null, false).b;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (bindAnim == null) {
                return new BindBitmap<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                BindColor d = d(bindAnim, (String) entry.getKey());
                if (d != null) {
                    d.d = copyNoRef.b((Bitmap) entry.getValue(), d.e, d.a);
                }
            }
            for (Map.Entry<String, BindColor> entry2 : bindAnim.i.entrySet()) {
                if (entry2.getValue().d == null) {
                    StringBuilder sb = new StringBuilder("There is no image for ");
                    sb.append(entry2.getValue().c);
                    return new BindBitmap<>(new IllegalStateException(sb.toString()));
                }
            }
            if (str != null) {
                DebouncingOnClickListener a = DebouncingOnClickListener.a();
                if (str != null) {
                    a.d.c(str, bindAnim);
                }
            }
            return new BindBitmap<>(bindAnim);
        } catch (IOException e2) {
            return new BindBitmap<>(e2);
        }
    }

    private static BindColor d(BindAnim bindAnim, String str) {
        for (BindColor bindColor : bindAnim.i.values()) {
            if (bindColor.c.equals(str)) {
                return bindColor;
            }
        }
        return null;
    }

    public static BindFont<BindAnim> d(Context context, final int i) {
        final String b2 = b(context, i);
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return e(b2, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                Context context2 = (Context) r3.get();
                Context context3 = context2;
                if (context2 == null) {
                    context3 = r4;
                }
                return Action.a(context3, r9, r10);
            }
        });
    }

    public static BindFont<BindAnim> d(final Context context, final String str, final String str2) {
        return e(str2, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.2
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final /* synthetic */ o.BindBitmap<o.BindAnim> call() throws java.lang.Exception {
                /*
                // Method dump skipped, instructions count: 226
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Action.AnonymousClass2.call():java.lang.Object");
            }
        });
    }

    public static BindFont<BindAnim> d(final InputStream inputStream, final String str) {
        return e(str, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.9
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                return Action.b(inputStream, str);
            }
        });
    }

    public static BindBitmap<BindAnim> e(Context context, int i) {
        return a(context, i, b(context, i));
    }

    public static BindFont<BindAnim> e(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return e(str, new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.5
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                Context context3 = context2;
                if (context2 == null) {
                    context3 = applicationContext;
                }
                return Action.a(context3, i, str);
            }
        });
    }

    private static BindFont<BindAnim> e(final String str, Callable<BindBitmap<BindAnim>> callable) {
        final BindAnim bindAnim = null;
        if (str != null) {
            DebouncingOnClickListener a = DebouncingOnClickListener.a();
            if (str != null) {
                bindAnim = a.d.e(str);
            }
        }
        if (bindAnim != null) {
            return new BindFont<>(new Callable<BindBitmap<BindAnim>>() { // from class: o.Action.8
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ BindBitmap<BindAnim> call() throws Exception {
                    return new BindBitmap<>(bindAnim);
                }
            });
        }
        if (str != null) {
            Map<String, BindFont<BindAnim>> map = e;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        BindFont<BindAnim> bindFont = new BindFont<>(callable);
        if (str != null) {
            bindFont.c(new BindBool<BindAnim>() { // from class: o.Action.1
                @Override // o.BindBool
                public final /* synthetic */ void d(BindAnim bindAnim2) {
                    Action.e.remove(str);
                }
            });
            bindFont.e(new BindBool<Throwable>() { // from class: o.Action.4
                @Override // o.BindBool
                public final /* synthetic */ void d(Throwable th) {
                    Action.e.remove(str);
                }
            });
            e.put(str, bindFont);
        }
        return bindFont;
    }
}
