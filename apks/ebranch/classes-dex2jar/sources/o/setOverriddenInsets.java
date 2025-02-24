package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import o.createFragmentContainer;
import o.getSystemGestureInsets;
/* loaded from: classes-dex2jar.jar:o/setOverriddenInsets.class */
public class setOverriddenInsets extends WindowInsetsCompat$Impl20 {
    protected final Method a;
    protected final Class<?> b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method g;
    protected final Constructor<?> j;

    public setOverriddenInsets() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor<?> constructor;
        Class<?> cls = null;
        try {
            cls = a();
            constructor = e(cls);
            method5 = a(cls);
            method4 = b(cls);
            method3 = f(cls);
            method2 = d(cls);
            method = c(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method5 = null;
            method3 = null;
            method2 = null;
            method4 = null;
            constructor = null;
            method = null;
        }
        this.b = cls;
        this.j = constructor;
        this.a = method5;
        this.d = method4;
        this.g = method3;
        this.c = method2;
        this.e = method;
    }

    private boolean b() {
        if (this.a == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.a != null;
    }

    private void c(Object obj) {
        try {
            this.c.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }

    private boolean c(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.a.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    private boolean d(Object obj) {
        try {
            return ((Boolean) this.g.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    private Object e() {
        try {
            return this.j.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    private boolean e(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    protected Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.e.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    protected Class<?> a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Method a(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    protected Method b(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    @Override // o.isTypeVisible
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        if (!b()) {
            return c(context, resources, i, str, i2);
        }
        Object e = e();
        if (e == null) {
            return null;
        }
        if (!c(context, e, str, 0, -1, -1, null)) {
            c(e);
            return null;
        } else if (!d(e)) {
            return null;
        } else {
            return a(e);
        }
    }

    @Override // o.WindowInsetsCompat$Impl20, o.isTypeVisible
    public Typeface c(Context context, CancellationSignal cancellationSignal, createFragmentContainer.IconCompatParcelizer[] iconCompatParcelizerArr, int i) {
        Typeface a;
        if (iconCompatParcelizerArr.length <= 0) {
            return null;
        }
        if (!b()) {
            createFragmentContainer.IconCompatParcelizer d = d(iconCompatParcelizerArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(d.c(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(d.e()).setItalic(d.a()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } else if (openFileDescriptor == null) {
                    return null;
                } else {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException e) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> c = loadReflectionField.c(context, iconCompatParcelizerArr, cancellationSignal);
            Object e2 = e();
            if (e2 == null) {
                return null;
            }
            boolean z = false;
            for (createFragmentContainer.IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
                ByteBuffer byteBuffer = c.get(iconCompatParcelizer.c());
                if (byteBuffer != null) {
                    if (!e(e2, byteBuffer, iconCompatParcelizer.d(), iconCompatParcelizer.e(), iconCompatParcelizer.a() ? 1 : 0)) {
                        c(e2);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                c(e2);
                return null;
            } else if (d(e2) && (a = a(e2)) != null) {
                return Typeface.create(a, i);
            } else {
                return null;
            }
        }
    }

    @Override // o.WindowInsetsCompat$Impl20, o.isTypeVisible
    public Typeface c(Context context, getSystemGestureInsets.read read, Resources resources, int i) {
        if (!b()) {
            return c(context, read, resources, i);
        }
        Object e = e();
        if (e == null) {
            return null;
        }
        getSystemGestureInsets.IconCompatParcelizer[] c = read.c();
        for (getSystemGestureInsets.IconCompatParcelizer iconCompatParcelizer : c) {
            if (!c(context, e, iconCompatParcelizer.b(), iconCompatParcelizer.a(), iconCompatParcelizer.c(), iconCompatParcelizer.i() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(iconCompatParcelizer.d()))) {
                c(e);
                return null;
            }
        }
        if (!d(e)) {
            return null;
        }
        return a(e);
    }

    protected Method c(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Method d(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Constructor<?> e(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    protected Method f(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
