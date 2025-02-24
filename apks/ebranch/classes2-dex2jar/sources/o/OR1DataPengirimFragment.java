package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.squareup.picasso.Downloader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/OR1DataPengirimFragment.class */
public final class OR1DataPengirimFragment {
    static final StringBuilder b = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/OR1DataPengirimFragment$write.class */
    public static final class write implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new OR1DataPengirimFragment$MediaBrowserCompat$CustomActionResultReceiver(runnable);
        }
    }

    public static Resources a(Context context, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws FileNotFoundException {
        if (cC9FormKartuKreditFragment_ViewBinding.j != 0 || cC9FormKartuKreditFragment_ViewBinding.q == null) {
            return context.getResources();
        }
        String authority = cC9FormKartuKreditFragment_ViewBinding.q.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(cC9FormKartuKreditFragment_ViewBinding.q);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(cC9FormKartuKreditFragment_ViewBinding.q);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public static void a() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static boolean a(Context context) {
        boolean z = false;
        try {
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
        } catch (NullPointerException e) {
        }
        return z;
    }

    public static boolean a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int b(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String b(onFocuscc279 onfocuscc279) {
        return d(onfocuscc279, "");
    }

    public static void b(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        boolean z = false;
        try {
            if ("CONDITIONAL_CACHE".equals(split[0])) {
                z = false;
                if (Integer.parseInt(split[1]) == 304) {
                    z = true;
                }
            }
        } catch (NumberFormatException e) {
            z = false;
        }
        return z;
    }

    public static Downloader c(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return new CC9FormKartuKreditFragment(context);
        } catch (ClassNotFoundException e) {
            return new KliringInfoBiayaFragment(context);
        }
    }

    public static <T> T c(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static void c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    public static int d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        return (memoryClass * 1048576) / 7;
    }

    public static int d(Resources resources, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws FileNotFoundException {
        int parseInt;
        if (cC9FormKartuKreditFragment_ViewBinding.j != 0 || cC9FormKartuKreditFragment_ViewBinding.q == null) {
            return cC9FormKartuKreditFragment_ViewBinding.j;
        }
        String authority = cC9FormKartuKreditFragment_ViewBinding.q.getAuthority();
        if (authority != null) {
            List<String> pathSegments = cC9FormKartuKreditFragment_ViewBinding.q.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(cC9FormKartuKreditFragment_ViewBinding.q);
                throw new FileNotFoundException(sb.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(cC9FormKartuKreditFragment_ViewBinding.q);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                parseInt = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(cC9FormKartuKreditFragment_ViewBinding.q);
                throw new FileNotFoundException(sb3.toString());
            }
            return parseInt;
        }
        StringBuilder sb4 = new StringBuilder("No package provided: ");
        sb4.append(cC9FormKartuKreditFragment_ViewBinding.q);
        throw new FileNotFoundException(sb4.toString());
    }

    public static String d(onFocuscc279 onfocuscc279, String str) {
        StringBuilder sb = new StringBuilder(str);
        showDataAlamat showdataalamat = onfocuscc279.d;
        if (showdataalamat != null) {
            sb.append(showdataalamat.j.b());
        }
        List<showDataAlamat> list = onfocuscc279.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || showdataalamat != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).j.b());
            }
        }
        return sb.toString();
    }

    public static void d(Looper looper) {
        AnonymousClass1 r0 = new Handler(looper) { // from class: o.OR1DataPengirimFragment.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    public static long e(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException e) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    public static File e(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String e(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        StringBuilder sb = b;
        if (cC9FormKartuKreditFragment_ViewBinding.l != null) {
            sb.ensureCapacity(cC9FormKartuKreditFragment_ViewBinding.l.length() + 50);
            sb.append(cC9FormKartuKreditFragment_ViewBinding.l);
        } else if (cC9FormKartuKreditFragment_ViewBinding.q != null) {
            String obj = cC9FormKartuKreditFragment_ViewBinding.q.toString();
            sb.ensureCapacity(obj.length() + 50);
            sb.append(obj);
        } else {
            sb.ensureCapacity(50);
            sb.append(cC9FormKartuKreditFragment_ViewBinding.j);
        }
        sb.append('\n');
        if (cC9FormKartuKreditFragment_ViewBinding.f != 0.0f) {
            sb.append("rotation:");
            sb.append(cC9FormKartuKreditFragment_ViewBinding.f);
            if (cC9FormKartuKreditFragment_ViewBinding.e) {
                sb.append('@');
                sb.append(cC9FormKartuKreditFragment_ViewBinding.k);
                sb.append('x');
                sb.append(cC9FormKartuKreditFragment_ViewBinding.n);
            }
            sb.append('\n');
        }
        if ((cC9FormKartuKreditFragment_ViewBinding.t == 0 && cC9FormKartuKreditFragment_ViewBinding.f18o == 0) ? false : true) {
            sb.append("resize:");
            sb.append(cC9FormKartuKreditFragment_ViewBinding.t);
            sb.append('x');
            sb.append(cC9FormKartuKreditFragment_ViewBinding.f18o);
            sb.append('\n');
        }
        if (cC9FormKartuKreditFragment_ViewBinding.d) {
            sb.append("centerCrop");
            sb.append('\n');
        } else if (cC9FormKartuKreditFragment_ViewBinding.c) {
            sb.append("centerInside");
            sb.append('\n');
        }
        if (cC9FormKartuKreditFragment_ViewBinding.s != null) {
            int size = cC9FormKartuKreditFragment_ViewBinding.s.size();
            for (int i = 0; i < size; i++) {
                sb.append(cC9FormKartuKreditFragment_ViewBinding.s.get(i).a());
                sb.append('\n');
            }
        }
        String obj2 = sb.toString();
        sb.setLength(0);
        return obj2;
    }

    public static void e(String str, String str2, String str3) {
        b(str, str2, str3, "");
    }

    public static boolean e(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        boolean z = false;
        if (inputStream.read(bArr, 0, 12) == 12) {
            z = false;
            if ("RIFF".equals(new String(bArr, 0, 4, "US-ASCII"))) {
                z = false;
                if ("WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
                    z = true;
                }
            }
        }
        return z;
    }
}
