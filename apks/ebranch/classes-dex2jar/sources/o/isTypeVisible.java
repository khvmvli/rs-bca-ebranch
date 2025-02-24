package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
/* loaded from: classes-dex2jar.jar:o/isTypeVisible.class */
public class isTypeVisible {
    private ConcurrentHashMap<Long, getSystemGestureInsets.read> a = new ConcurrentHashMap<>();

    /* loaded from: classes-dex2jar.jar:o/isTypeVisible$read.class */
    public interface read<T> {
        int a(T t);

        boolean c(T t);
    }

    private getSystemGestureInsets.IconCompatParcelizer a(getSystemGestureInsets.read read2, int i) {
        return (getSystemGestureInsets.IconCompatParcelizer) d(read2.c(), i, new read<getSystemGestureInsets.IconCompatParcelizer>() { // from class: o.isTypeVisible.5
            /* renamed from: b */
            public int a(getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.c();
            }

            /* renamed from: e */
            public boolean c(getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.i();
            }
        });
    }

    private void a(Typeface typeface, getSystemGestureInsets.read read2) {
        long d = d(typeface);
        if (d != 0) {
            this.a.put(Long.valueOf(d), read2);
        }
    }

    private static long d(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    private static <T> T d(T[] tArr, int i, read<T> read2) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(read2.a(t2) - i2) << 1) + (read2.c(t2) == z ? 0 : 1);
            if (t != null) {
                i3 = i3;
                if (i3 <= abs) {
                }
            }
            t = t2;
            i3 = abs;
        }
        return t;
    }

    /* JADX WARN: Finally extract failed */
    public Typeface a(Context context, InputStream inputStream) {
        File a = loadReflectionField.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!loadReflectionField.a(a, inputStream)) {
                a.delete();
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            a.delete();
            return null;
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File a = loadReflectionField.a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!loadReflectionField.b(a, resources, i)) {
                a.delete();
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            a.delete();
            return null;
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        Throwable th;
        InputStream inputStream = null;
        if (iconCompatParcelizerArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(d(iconCompatParcelizerArr, i).c());
        } catch (IOException e) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface a = a(context, inputStream);
            loadReflectionField.c(inputStream);
            return a;
        } catch (IOException e2) {
            loadReflectionField.c(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            loadReflectionField.c(inputStream);
            throw th;
        }
    }

    public Typeface c(Context context, getSystemGestureInsets.read read2, Resources resources, int i) {
        getSystemGestureInsets.IconCompatParcelizer a = a(read2, i);
        if (a == null) {
            return null;
        }
        Typeface d = setRootWindowInsets.d(context, resources, a.e(), a.b(), i);
        a(d, read2);
        return d;
    }

    protected createFragmentContainer.IconCompatParcelizer d(createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        return (createFragmentContainer.IconCompatParcelizer) d(iconCompatParcelizerArr, i, new read<createFragmentContainer.IconCompatParcelizer>() { // from class: o.isTypeVisible.1
            /* renamed from: d */
            public int a(createFragmentContainer.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.e();
            }

            /* renamed from: e */
            public boolean c(createFragmentContainer.IconCompatParcelizer iconCompatParcelizer) {
                return iconCompatParcelizer.a();
            }
        });
    }
}
