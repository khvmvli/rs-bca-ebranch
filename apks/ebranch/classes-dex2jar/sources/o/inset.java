package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/inset.class */
public final class inset {

    /* loaded from: classes-dex2jar.jar:o/inset$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        public static Handler b(Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }

        public final void a(final Typeface typeface, Handler handler) {
            b(handler).post(new Runnable() { // from class: o.inset.RemoteActionCompatParcelizer.2
                @Override // java.lang.Runnable
                public void run() {
                    RemoteActionCompatParcelizer.this.e(typeface);
                }
            });
        }

        public final void d(final int i, Handler handler) {
            b(handler).post(new Runnable() { // from class: o.inset.RemoteActionCompatParcelizer.3
                @Override // java.lang.Runnable
                public void run() {
                    RemoteActionCompatParcelizer.this.e(i);
                }
            });
        }

        public abstract void e(int i);

        public abstract void e(Typeface typeface);
    }

    /* loaded from: classes-dex2jar.jar:o/inset$write.class */
    public static final class write {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/inset$write$read.class */
        public static class read {
            static void d(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.inset$write$write */
        /* loaded from: classes-dex2jar.jar:o/inset$write$write.class */
        public static class C0004write {
            private static Method a;
            private static final Object b = new Object();
            private static boolean e;

            static void e(Resources.Theme theme) {
                synchronized (b) {
                    if (!e) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            a = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        e = true;
                    }
                    Method method = a;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            a = null;
                        }
                    }
                }
            }
        }

        public static void e(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                read.d(theme);
            } else if (Build.VERSION.SDK_INT >= 23) {
                C0004write.e(theme);
            }
        }
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i, theme);
    }

    public static void a(Context context, int i, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            remoteActionCompatParcelizer.d(-4, handler);
        } else {
            c(context, i, new TypedValue(), 0, remoteActionCompatParcelizer, handler, false, false);
        }
    }

    public static Typeface b(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static Typeface c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, typedValue, i2, remoteActionCompatParcelizer, null, true, false);
    }

    private static Typeface c(Context context, int i, TypedValue typedValue, int i2, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface e = e(context, resources, typedValue, i, i2, remoteActionCompatParcelizer, handler, z, z2);
        if (e != null || remoteActionCompatParcelizer != null || z2) {
            return e;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sb.toString());
    }

    public static int d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.graphics.Typeface e(android.content.Context r9, android.content.res.Resources r10, android.util.TypedValue r11, int r12, int r13, o.inset.RemoteActionCompatParcelizer r14, android.os.Handler r15, boolean r16, boolean r17) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inset.e(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, o.inset$RemoteActionCompatParcelizer, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
