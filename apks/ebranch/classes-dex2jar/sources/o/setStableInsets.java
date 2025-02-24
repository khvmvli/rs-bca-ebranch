package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
/* loaded from: classes-dex2jar.jar:o/setStableInsets.class */
class setStableInsets extends isTypeVisible {
    private static final Method a;
    private static final Method b;
    private static final Class<?> c;
    private static final Constructor<?> e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        e = constructor;
        c = cls;
        a = method2;
        b = method;
    }

    public static boolean c() {
        Method method = a;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Typeface d(Object obj) {
        try {
            Object newInstance = Array.newInstance(c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) b.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return null;
        }
    }

    private static Object d() {
        try {
            return e.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            return null;
        }
    }

    private static boolean e(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            return false;
        }
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, CancellationSignal cancellationSignal, createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        Object d = d();
        if (d == null) {
            return null;
        }
        setCollapseIcon setcollapseicon = new setCollapseIcon();
        for (createFragmentContainer.IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
            Uri c2 = iconCompatParcelizer.c();
            ByteBuffer byteBuffer = (ByteBuffer) setcollapseicon.get(c2);
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer == null) {
                byteBuffer2 = loadReflectionField.c(context, cancellationSignal, c2);
                setcollapseicon.put(c2, byteBuffer2);
            }
            if (byteBuffer2 == null || !e(d, byteBuffer2, iconCompatParcelizer.d(), iconCompatParcelizer.e(), iconCompatParcelizer.a())) {
                return null;
            }
        }
        Typeface d2 = d(d);
        if (d2 == null) {
            return null;
        }
        return Typeface.create(d2, i);
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, getSystemGestureInsets.read read, Resources resources, int i) {
        Object d = d();
        if (d == null) {
            return null;
        }
        getSystemGestureInsets.IconCompatParcelizer[] c2 = read.c();
        for (getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer : c2) {
            ByteBuffer e2 = loadReflectionField.e(context, resources, iconCompatParcelizer.e());
            if (e2 == null || !e(d, e2, iconCompatParcelizer.a(), iconCompatParcelizer.c(), iconCompatParcelizer.i())) {
                return null;
            }
        }
        return d(d);
    }
}
