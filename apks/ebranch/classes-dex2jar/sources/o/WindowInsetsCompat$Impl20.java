package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/WindowInsetsCompat$Impl20.class */
public class WindowInsetsCompat$Impl20 extends isTypeVisible {
    private static Method a;
    private static Method b;
    private static boolean c;
    private static Constructor<?> d;
    private static Class<?> e;

    private static void a() {
        Method method;
        Method method2;
        Class<?> cls;
        if (!c) {
            c = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method = null;
                cls = null;
                method2 = null;
            }
            d = constructor;
            e = cls;
            b = method2;
            a = method;
        }
    }

    private static Typeface b(Object obj) {
        a();
        try {
            Object newInstance = Array.newInstance(e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) a.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException e2) {
            return null;
        }
    }

    private static Object d() {
        a();
        try {
            return d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static boolean e(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) b.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, CancellationSignal cancellationSignal, createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        if (iconCompatParcelizerArr.length <= 0) {
            return null;
        }
        createFragmentContainer.IconCompatParcelizer d2 = d(iconCompatParcelizerArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(d2.c(), "r", cancellationSignal);
            if (openFileDescriptor != null) {
                File b2 = b(openFileDescriptor);
                if (b2 != null && b2.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(b2);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface a2 = a(context, fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else if (openFileDescriptor == null) {
                return null;
            } else {
                openFileDescriptor.close();
                return null;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, getSystemGestureInsets.read read, Resources resources, int i) {
        Object d2 = d();
        getSystemGestureInsets.IconCompatParcelizer[] c2 = read.c();
        for (getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer : c2) {
            File a2 = loadReflectionField.a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!loadReflectionField.b(a2, resources, iconCompatParcelizer.e())) {
                    a2.delete();
                    return null;
                } else if (!e(d2, a2.getPath(), iconCompatParcelizer.c(), iconCompatParcelizer.i())) {
                    a2.delete();
                    return null;
                } else {
                    a2.delete();
                }
            } catch (RuntimeException e2) {
                a2.delete();
                return null;
            } catch (Throwable th) {
                a2.delete();
                throw th;
            }
        }
        return b(d2);
    }
}
