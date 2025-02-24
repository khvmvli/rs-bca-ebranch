package o;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.onChooseValueFasilitasPerlindungan;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataFasilitas.class */
public class onClickUbahDataFasilitas implements Cloneable {
    onClickUbahDataKontakDarurat a;
    protected onClickUbahDataLainnya c;
    onClickUbahDataKartuTambahan1 e;
    Class f;
    Method g;
    final ReentrantReadWriteLock h;
    final Object[] i;
    String j;
    private Method p;
    private Object q;
    static final onClickUbahDataKontakDarurat b = new SubscribeBidangUsaha();
    static final onClickUbahDataKontakDarurat d = new onClickUbahDataDiri();
    private static Class[] m = {Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
    private static Class[] n = {Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
    private static Class[] k = {Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    private static final HashMap<Class, HashMap<String, Method>> l = new HashMap<>();

    /* renamed from: o */
    private static final HashMap<Class, HashMap<String, Method>> f72o = new HashMap<>();

    /* loaded from: classes2-dex2jar.jar:o/onClickUbahDataFasilitas$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends onClickUbahDataFasilitas {
        private onClickedUbahCC273 l;
        int n;

        /* renamed from: o */
        CC27FormKartuKreditFragment f73o;

        public RemoteActionCompatParcelizer(String str, int... iArr) {
            super(str, (byte) 0);
            setIntValues(iArr);
        }

        public RemoteActionCompatParcelizer(onClickUbahDataLainnya onclickubahdatalainnya, int... iArr) {
            super(onclickubahdatalainnya, (byte) 0);
            setIntValues(iArr);
            if (onclickubahdatalainnya instanceof onClickedUbahCC273) {
                this.l = (onClickedUbahCC273) this.c;
            }
        }

        @Override // o.onClickUbahDataFasilitas
        public final /* bridge */ /* synthetic */ onClickUbahDataFasilitas a() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) clone();
            remoteActionCompatParcelizer.f73o = (CC27FormKartuKreditFragment) remoteActionCompatParcelizer.e;
            return remoteActionCompatParcelizer;
        }

        @Override // o.onClickUbahDataFasilitas
        final Object b() {
            return Integer.valueOf(this.n);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.onClickUbahDataFasilitas
        public final void b(float f) {
            this.n = this.f73o.d(f);
        }

        @Override // o.onClickUbahDataFasilitas
        final void b(Class cls) {
            if (this.c == null) {
                b(cls);
            }
        }

        @Override // o.onClickUbahDataFasilitas, java.lang.Object
        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) clone();
            remoteActionCompatParcelizer.f73o = (CC27FormKartuKreditFragment) remoteActionCompatParcelizer.e;
            return remoteActionCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.onClickUbahDataFasilitas
        public final void d(Object obj) {
            onClickedUbahCC273 onclickedubahcc273 = this.l;
            if (onclickedubahcc273 != null) {
                onclickedubahcc273.c((onClickedUbahCC273) obj, this.n);
            } else if (this.c != null) {
                this.c.c(obj, Integer.valueOf(this.n));
            } else if (this.g != null) {
                try {
                    this.i[0] = Integer.valueOf(this.n);
                    this.g.invoke(obj, this.i);
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // o.onClickUbahDataFasilitas
        public final void setIntValues(int... iArr) {
            setIntValues(iArr);
            this.f73o = (CC27FormKartuKreditFragment) this.e;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onClickUbahDataFasilitas$write.class */
    public static final class write extends onClickUbahDataFasilitas {
        onClickUbahDataAlamat l;
        float m;
        private onClickedUbahCC2710 n;

        public write(String str, float... fArr) {
            super(str, (byte) 0);
            setFloatValues(fArr);
        }

        public write(onClickUbahDataLainnya onclickubahdatalainnya, float... fArr) {
            super(onclickubahdatalainnya, (byte) 0);
            setFloatValues(fArr);
            if (onclickubahdatalainnya instanceof onClickedUbahCC2710) {
                this.n = (onClickedUbahCC2710) this.c;
            }
        }

        @Override // o.onClickUbahDataFasilitas
        public final /* bridge */ /* synthetic */ onClickUbahDataFasilitas a() {
            write write = (write) clone();
            write.l = (onClickUbahDataAlamat) write.e;
            return write;
        }

        @Override // o.onClickUbahDataFasilitas
        final Object b() {
            return Float.valueOf(this.m);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.onClickUbahDataFasilitas
        public final void b(float f) {
            this.m = this.l.a(f);
        }

        @Override // o.onClickUbahDataFasilitas
        final void b(Class cls) {
            if (this.c == null) {
                b(cls);
            }
        }

        @Override // o.onClickUbahDataFasilitas, java.lang.Object
        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            write write = (write) clone();
            write.l = (onClickUbahDataAlamat) write.e;
            return write;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.onClickUbahDataFasilitas
        public final void d(Object obj) {
            onClickedUbahCC2710 onclickedubahcc2710 = this.n;
            if (onclickedubahcc2710 != null) {
                onclickedubahcc2710.a(obj, this.m);
            } else if (this.c != null) {
                this.c.c(obj, Float.valueOf(this.m));
            } else if (this.g != null) {
                try {
                    this.i[0] = Float.valueOf(this.m);
                    this.g.invoke(obj, this.i);
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // o.onClickUbahDataFasilitas
        public final void setFloatValues(float... fArr) {
            setFloatValues(fArr);
            this.l = (onClickUbahDataAlamat) this.e;
        }
    }

    private onClickUbahDataFasilitas(String str) {
        this.g = null;
        this.p = null;
        this.e = null;
        this.h = new ReentrantReadWriteLock();
        this.i = new Object[1];
        this.j = str;
    }

    /* synthetic */ onClickUbahDataFasilitas(String str, byte b2) {
        this(str);
    }

    private onClickUbahDataFasilitas(onClickUbahDataLainnya onclickubahdatalainnya) {
        this.g = null;
        this.p = null;
        this.e = null;
        this.h = new ReentrantReadWriteLock();
        this.i = new Object[1];
        this.c = onclickubahdatalainnya;
        if (onclickubahdatalainnya != null) {
            this.j = onclickubahdatalainnya.c;
        }
    }

    /* synthetic */ onClickUbahDataFasilitas(onClickUbahDataLainnya onclickubahdatalainnya, byte b2) {
        this(onclickubahdatalainnya);
    }

    public static onClickUbahDataFasilitas a(String str, float... fArr) {
        return new write(str, fArr);
    }

    public static onClickUbahDataFasilitas b(String str, int... iArr) {
        return new RemoteActionCompatParcelizer(str, iArr);
    }

    public static onClickUbahDataFasilitas c(onClickUbahDataLainnya<?, Integer> onclickubahdatalainnya, int... iArr) {
        return new RemoteActionCompatParcelizer(onclickubahdatalainnya, iArr);
    }

    private Method e(Class cls, String str, Class cls2) {
        String str2 = this.j;
        String str3 = str;
        if (str2 != null) {
            if (str2.length() == 0) {
                str3 = str;
            } else {
                char upperCase = Character.toUpperCase(str2.charAt(0));
                String substring = str2.substring(1);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(upperCase);
                sb.append(substring);
                str3 = sb.toString();
            }
        }
        r7 = null;
        Method method = null;
        if (cls2 == null) {
            try {
                method = cls.getMethod(str3, null);
            } catch (NoSuchMethodException e) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod(str3, null);
                    method = declaredMethod;
                    declaredMethod.setAccessible(true);
                    method = declaredMethod;
                } catch (NoSuchMethodException e2) {
                    StringBuilder sb2 = new StringBuilder("Couldn't find no-arg method for property ");
                    sb2.append(this.j);
                    sb2.append(": ");
                    sb2.append(e);
                    Log.e("PropertyValuesHolder", sb2.toString());
                }
            }
            return method;
        }
        Class<?>[] clsArr = new Class[1];
        Class<?>[] clsArr2 = this.f.equals(Float.class) ? m : this.f.equals(Integer.class) ? n : this.f.equals(Double.class) ? k : new Class[]{this.f};
        for (Class<?> cls3 : clsArr2) {
            clsArr[0] = cls3;
            try {
                Method method2 = cls.getMethod(str3, clsArr);
                method = method2;
                this.f = cls3;
                return method2;
            } catch (NoSuchMethodException e3) {
                try {
                    Method declaredMethod2 = cls.getDeclaredMethod(str3, clsArr);
                    declaredMethod2.setAccessible(true);
                    method = declaredMethod2;
                    this.f = cls3;
                    return declaredMethod2;
                } catch (NoSuchMethodException e4) {
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("Couldn't find setter/getter for property ");
        sb3.append(this.j);
        sb3.append(" with value type ");
        sb3.append(this.f);
        Log.e("PropertyValuesHolder", sb3.toString());
        return method;
    }

    private Method e(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.h.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.j) : null;
            Method method2 = method;
            if (method == null) {
                method2 = e(cls, str, cls2);
                HashMap<String, Method> hashMap3 = hashMap2;
                if (hashMap2 == null) {
                    hashMap3 = new HashMap<>();
                    hashMap.put(cls, hashMap3);
                }
                hashMap3.put(this.j, method2);
            }
            return method2;
        } finally {
            this.h.writeLock().unlock();
        }
    }

    public static onClickUbahDataFasilitas e(onClickUbahDataLainnya<?, Float> onclickubahdatalainnya, float... fArr) {
        return new write(onclickubahdatalainnya, fArr);
    }

    /* renamed from: a */
    public onClickUbahDataFasilitas clone() {
        try {
            onClickUbahDataFasilitas onclickubahdatafasilitas = (onClickUbahDataFasilitas) clone();
            onclickubahdatafasilitas.j = this.j;
            onclickubahdatafasilitas.c = this.c;
            onclickubahdatafasilitas.e = this.e.clone();
            onclickubahdatafasilitas.a = this.a;
            return onclickubahdatafasilitas;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public final void a(Object obj) {
        onClickUbahDataLainnya onclickubahdatalainnya = this.c;
        if (onclickubahdatalainnya != null) {
            try {
                onclickubahdatalainnya.b(obj);
                Iterator<onChooseValueFasilitasPerlindungan> it = this.e.c.iterator();
                while (it.hasNext()) {
                    onChooseValueFasilitasPerlindungan next = it.next();
                    if (!next.a) {
                        next.a(this.c.b(obj));
                    }
                }
                return;
            } catch (ClassCastException e) {
                StringBuilder sb = new StringBuilder("No such property (");
                sb.append(this.c.c);
                sb.append(") on target object ");
                sb.append(obj);
                sb.append(". Trying reflection instead");
                Log.e("PropertyValuesHolder", sb.toString());
                this.c = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.g == null) {
            b(cls);
        }
        Iterator<onChooseValueFasilitasPerlindungan> it2 = this.e.c.iterator();
        while (it2.hasNext()) {
            onChooseValueFasilitasPerlindungan next2 = it2.next();
            if (!next2.a) {
                if (this.p == null) {
                    this.p = e(cls, f72o, "get", null);
                }
                try {
                    next2.a(this.p.invoke(obj, new Object[0]));
                } catch (IllegalAccessException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                } catch (InvocationTargetException e3) {
                    Log.e("PropertyValuesHolder", e3.toString());
                }
            }
        }
    }

    Object b() {
        return this.q;
    }

    public void b(float f) {
        this.q = this.e.c(f);
    }

    void b(Class cls) {
        this.g = e(cls, l, "set", this.f);
    }

    public void d(Object obj) {
        onClickUbahDataLainnya onclickubahdatalainnya = this.c;
        if (onclickubahdatalainnya != null) {
            onclickubahdatalainnya.c(obj, b());
        }
        if (this.g != null) {
            try {
                this.i[0] = b();
                this.g.invoke(obj, this.i);
            } catch (IllegalAccessException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (InvocationTargetException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    public String getPropertyName() {
        return this.j;
    }

    public void setEvaluator(onClickUbahDataKontakDarurat onclickubahdatakontakdarurat) {
        this.a = onclickubahdatakontakdarurat;
        this.e.b = onclickubahdatakontakdarurat;
    }

    public void setFloatValues(float... fArr) {
        this.f = Float.TYPE;
        int length = fArr.length;
        onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = new onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer[Math.max(length, 2)];
        if (length == 1) {
            remoteActionCompatParcelizerArr[0] = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) onChooseValueFasilitasPerlindungan.d(0.0f);
            remoteActionCompatParcelizerArr[1] = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) onChooseValueFasilitasPerlindungan.a(1.0f, fArr[0]);
        } else {
            remoteActionCompatParcelizerArr[0] = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) onChooseValueFasilitasPerlindungan.a(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                remoteActionCompatParcelizerArr[i] = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) onChooseValueFasilitasPerlindungan.a(((float) i) / ((float) (length - 1)), fArr[i]);
            }
        }
        this.e = new onClickUbahDataAlamat(remoteActionCompatParcelizerArr);
    }

    public void setIntValues(int... iArr) {
        this.f = Integer.TYPE;
        int length = iArr.length;
        onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver[] onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr = new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver[Math.max(length, 2)];
        if (length == 1) {
            onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr[0] = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) onChooseValueFasilitasPerlindungan.e(0.0f);
            onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr[1] = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) onChooseValueFasilitasPerlindungan.d(1.0f, iArr[0]);
        } else {
            onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr[0] = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) onChooseValueFasilitasPerlindungan.d(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr[i] = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) onChooseValueFasilitasPerlindungan.d(((float) i) / ((float) (length - 1)), iArr[i]);
            }
        }
        this.e = new CC27FormKartuKreditFragment(onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr);
    }

    public void setKeyframes(onChooseValueFasilitasPerlindungan... onchoosevaluefasilitasperlindunganArr) {
        int length = onchoosevaluefasilitasperlindunganArr.length;
        onChooseValueFasilitasPerlindungan[] onchoosevaluefasilitasperlindunganArr2 = new onChooseValueFasilitasPerlindungan[Math.max(length, 2)];
        this.f = onchoosevaluefasilitasperlindunganArr[0].b;
        for (int i = 0; i < length; i++) {
            onchoosevaluefasilitasperlindunganArr2[i] = onchoosevaluefasilitasperlindunganArr[i];
        }
        this.e = new onClickUbahDataKartuTambahan1(onchoosevaluefasilitasperlindunganArr2);
    }

    public void setObjectValues(Object... objArr) {
        this.f = objArr[0].getClass();
        int length = objArr.length;
        onChooseValueFasilitasPerlindungan.IconCompatParcelizer[] iconCompatParcelizerArr = new onChooseValueFasilitasPerlindungan.IconCompatParcelizer[Math.max(length, 2)];
        if (length == 1) {
            iconCompatParcelizerArr[0] = (onChooseValueFasilitasPerlindungan.IconCompatParcelizer) onChooseValueFasilitasPerlindungan.b(0.0f);
            iconCompatParcelizerArr[1] = (onChooseValueFasilitasPerlindungan.IconCompatParcelizer) onChooseValueFasilitasPerlindungan.b(1.0f, objArr[0]);
        } else {
            iconCompatParcelizerArr[0] = (onChooseValueFasilitasPerlindungan.IconCompatParcelizer) onChooseValueFasilitasPerlindungan.b(0.0f, objArr[0]);
            for (int i = 1; i < length; i++) {
                iconCompatParcelizerArr[i] = (onChooseValueFasilitasPerlindungan.IconCompatParcelizer) onChooseValueFasilitasPerlindungan.b(((float) i) / ((float) (length - 1)), objArr[i]);
            }
        }
        this.e = new onClickUbahDataKartuTambahan1(iconCompatParcelizerArr);
    }

    public void setProperty(onClickUbahDataLainnya onclickubahdatalainnya) {
        this.c = onclickubahdatalainnya;
    }

    public void setPropertyName(String str) {
        this.j = str;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append(": ");
        sb.append(this.e.toString());
        return sb.toString();
    }
}
