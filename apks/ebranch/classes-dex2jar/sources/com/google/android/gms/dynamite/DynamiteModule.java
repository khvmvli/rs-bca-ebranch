package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import o.getStatusPendudukPengirim;
import o.realmGet$incomeSourceValue;
import o.realmSet$jenisWarkatTransaksi;
import o.realmSet$noHpKontakPengirim;
import o.setAccType;
import o.setAlamatPengirim;
import o.setJenisWarkatTransaksi;
import o.setNamaKontakPengirim;
import o.setNorekPengirim;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule.class */
public final class DynamiteModule {
    private static String f;
    private static Boolean g;
    private static int l;
    private static Boolean m;

    /* renamed from: o */
    private static boolean f71o;
    private static setAlamatPengirim q;
    private static setNorekPengirim s;
    public final Context j;
    private static final ThreadLocal k = new ThreadLocal();
    private static final ThreadLocal n = new ThreadLocal() { // from class: o.realmSet$totalBiayaTransfer
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            return 0L;
        }
    };
    private static final RemoteActionCompatParcelizer.IconCompatParcelizer t = new RemoteActionCompatParcelizer.IconCompatParcelizer() { // from class: o.realmSet$tanggalJatuhTempoTransaksi
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer
        public final int d(Context context, String str) {
            return DynamiteModule.c(context, str);
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer
        public final int d(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
            return DynamiteModule.d(context, str, z);
        }
    };
    public static final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer() { // from class: o.realmSet$tipeNasabahPengirimId
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            int d2 = iconCompatParcelizer.d(context, str, true);
            remoteActionCompatParcelizer.d = d2;
            if (d2 != 0) {
                remoteActionCompatParcelizer.e = 1;
            } else {
                int d3 = iconCompatParcelizer.d(context, str);
                remoteActionCompatParcelizer.a = d3;
                if (d3 != 0) {
                    remoteActionCompatParcelizer.e = -1;
                }
            }
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer a = new RemoteActionCompatParcelizer() { // from class: o.realmSet$totalPembayaran
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            int d2 = iconCompatParcelizer.d(context, str);
            remoteActionCompatParcelizer.a = d2;
            if (d2 != 0) {
                remoteActionCompatParcelizer.e = -1;
            } else {
                int d3 = iconCompatParcelizer.d(context, str, true);
                remoteActionCompatParcelizer.d = d3;
                if (d3 != 0) {
                    remoteActionCompatParcelizer.e = 1;
                }
            }
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer i = new RemoteActionCompatParcelizer() { // from class: o.realmSet$tujuanTransaksiCode
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            int i2 = 0;
            int d2 = iconCompatParcelizer.d(context, str, false);
            remoteActionCompatParcelizer.d = d2;
            if (d2 != 0) {
                i2 = 1;
            }
            remoteActionCompatParcelizer.e = i2;
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer() { // from class: o.realmSet$totalNominal
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.a = iconCompatParcelizer.d(context, str);
            int i2 = 1;
            int d2 = iconCompatParcelizer.d(context, str, true);
            remoteActionCompatParcelizer.d = d2;
            int i3 = remoteActionCompatParcelizer.a;
            int i4 = i3;
            if (i3 == 0) {
                if (d2 == 0) {
                    i2 = 0;
                    remoteActionCompatParcelizer.e = i2;
                    return remoteActionCompatParcelizer;
                }
                i4 = 0;
            }
            if (i4 >= d2) {
                i2 = -1;
            }
            remoteActionCompatParcelizer.e = i2;
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer() { // from class: o.realmSet$tujuanTransaksi
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            int i2;
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            int d2 = iconCompatParcelizer.d(context, str);
            remoteActionCompatParcelizer.a = d2;
            int i3 = 1;
            int i4 = 0;
            if (d2 != 0) {
                i2 = iconCompatParcelizer.d(context, str, false);
                remoteActionCompatParcelizer.d = i2;
            } else {
                i2 = iconCompatParcelizer.d(context, str, true);
                remoteActionCompatParcelizer.d = i2;
            }
            int i5 = remoteActionCompatParcelizer.a;
            if (i5 != 0) {
                i4 = i5;
            } else if (i2 == 0) {
                i3 = 0;
                remoteActionCompatParcelizer.e = i3;
                return remoteActionCompatParcelizer;
            }
            if (i4 >= i2) {
                i3 = -1;
            }
            remoteActionCompatParcelizer.e = i3;
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer() { // from class: o.realmSet$waktuPengirimanTransaksi
        @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer
        public final DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e(Context context, String str, DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer) throws DynamiteModule.LoadingException {
            DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DynamiteModule.RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.a = iconCompatParcelizer.d(context, str);
            int i2 = 1;
            int d2 = iconCompatParcelizer.d(context, str, true);
            remoteActionCompatParcelizer.d = d2;
            int i3 = remoteActionCompatParcelizer.a;
            int i4 = i3;
            if (i3 == 0) {
                if (d2 == 0) {
                    i2 = 0;
                    remoteActionCompatParcelizer.e = i2;
                    return remoteActionCompatParcelizer;
                }
                i4 = 0;
            }
            if (d2 < i4) {
                i2 = -1;
            }
            remoteActionCompatParcelizer.e = i2;
            return remoteActionCompatParcelizer;
        }
    };
    public static final RemoteActionCompatParcelizer h = new setAccType();

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
    }

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule$LoadingException.class */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {

        /* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule$RemoteActionCompatParcelizer$IconCompatParcelizer.class */
        public interface IconCompatParcelizer {
            int d(Context context, String str);

            int d(Context context, String str, boolean z) throws LoadingException;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer */
        /* loaded from: classes-dex2jar.jar:com/google/android/gms/dynamite/DynamiteModule$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer.class */
        public static final class C0000RemoteActionCompatParcelizer {
            public int a = 0;
            public int d = 0;
            public int e = 0;
        }

        C0000RemoteActionCompatParcelizer e(Context context, String str, IconCompatParcelizer iconCompatParcelizer) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        if (context != null) {
            this.j = context;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule a(Context context, RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) throws LoadingException {
        DynamiteModule dynamiteModule;
        Boolean bool;
        realmSet$noHpKontakPengirim realmset_nohpkontakpengirim;
        setNorekPengirim setnorekpengirim;
        boolean z;
        realmSet$noHpKontakPengirim realmset_nohpkontakpengirim2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = k;
            setJenisWarkatTransaksi setjeniswarkattransaksi = (setJenisWarkatTransaksi) threadLocal.get();
            setJenisWarkatTransaksi setjeniswarkattransaksi2 = new setJenisWarkatTransaksi(null);
            threadLocal.set(setjeniswarkattransaksi2);
            ThreadLocal threadLocal2 = n;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                RemoteActionCompatParcelizer.C0000RemoteActionCompatParcelizer e2 = remoteActionCompatParcelizer.e(context, str, t);
                int i2 = e2.a;
                int i3 = e2.d;
                StringBuilder sb = new StringBuilder("Considering local module ");
                sb.append(str);
                sb.append(":");
                sb.append(i2);
                sb.append(" and remote module ");
                sb.append(str);
                sb.append(":");
                sb.append(i3);
                Log.i("DynamiteModule", sb.toString());
                int i4 = e2.e;
                if (i4 != 0) {
                    int i5 = i4;
                    if (i4 == -1) {
                        if (e2.a != 0) {
                            i5 = -1;
                        }
                    }
                    if (!(i5 == 1 && e2.d == 0)) {
                        if (i5 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        } else if (i5 == 1) {
                            try {
                                int i6 = e2.d;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        try {
                                            if (a(context)) {
                                                bool = g;
                                            } else {
                                                throw new LoadingException("Remote loading disabled");
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (bool == null) {
                                        throw new LoadingException("Failed to determine which loading route to use.");
                                    } else if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder("Selected remote version of ");
                                        sb2.append(str);
                                        sb2.append(", version >= ");
                                        sb2.append(i6);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (DynamiteModule.class) {
                                            try {
                                                setnorekpengirim = s;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        if (setnorekpengirim != null) {
                                            setJenisWarkatTransaksi setjeniswarkattransaksi3 = (setJenisWarkatTransaksi) threadLocal.get();
                                            if (setjeniswarkattransaksi3 == null || setjeniswarkattransaksi3.d == null) {
                                                throw new LoadingException("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor = setjeniswarkattransaksi3.d;
                                            new realmSet$jenisWarkatTransaksi(null);
                                            synchronized (DynamiteModule.class) {
                                                try {
                                                    z = l >= 2;
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                            if (z) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                realmset_nohpkontakpengirim2 = setnorekpengirim.a(new realmSet$jenisWarkatTransaksi(applicationContext2), str, i6, new realmSet$jenisWarkatTransaksi(cursor));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                realmset_nohpkontakpengirim2 = setnorekpengirim.d(new realmSet$jenisWarkatTransaksi(applicationContext2), str, i6, new realmSet$jenisWarkatTransaksi(cursor));
                                            }
                                            Context context2 = (Context) realmSet$jenisWarkatTransaksi.e(realmset_nohpkontakpengirim2);
                                            if (context2 != null) {
                                                dynamiteModule = new DynamiteModule(context2);
                                            } else {
                                                throw new LoadingException("Failed to get module context");
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i6);
                                        Log.i("DynamiteModule", sb3.toString());
                                        setAlamatPengirim d2 = d(context);
                                        if (d2 != null) {
                                            int c2 = d2.c();
                                            if (c2 >= 3) {
                                                setJenisWarkatTransaksi setjeniswarkattransaksi4 = (setJenisWarkatTransaksi) threadLocal.get();
                                                if (setjeniswarkattransaksi4 != null) {
                                                    realmset_nohpkontakpengirim = d2.e(new realmSet$jenisWarkatTransaksi(context), str, i6, new realmSet$jenisWarkatTransaksi(setjeniswarkattransaksi4.d));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                            } else if (c2 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                realmset_nohpkontakpengirim = d2.c(new realmSet$jenisWarkatTransaksi(context), str, i6);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                realmset_nohpkontakpengirim = d2.b(new realmSet$jenisWarkatTransaksi(context), str, i6);
                                            }
                                            Object e3 = realmSet$jenisWarkatTransaksi.e(realmset_nohpkontakpengirim);
                                            if (e3 != null) {
                                                dynamiteModule = new DynamiteModule((Context) e3);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    throw new LoadingException("Failed to load remote module.", e4);
                                } catch (LoadingException e5) {
                                    throw e5;
                                } catch (Throwable th4) {
                                    getStatusPendudukPengirim.e(context, th4);
                                    throw new LoadingException("Failed to load remote module.", th4);
                                }
                            } catch (LoadingException e6) {
                                String message = e6.getMessage();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Failed to load remote module: ");
                                sb4.append(message);
                                Log.w("DynamiteModule", sb4.toString());
                                int i7 = e2.a;
                                if (i7 == 0 || remoteActionCompatParcelizer.e(context, str, new setNamaKontakPengirim(i7, 0)).e != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e6);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder("VersionPolicy returned invalid code:");
                            sb5.append(i5);
                            throw new LoadingException(sb5.toString());
                        }
                        if (longValue == 0) {
                            n.remove();
                        } else {
                            n.set(Long.valueOf(longValue));
                        }
                        Cursor cursor2 = setjeniswarkattransaksi2.d;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        k.set(setjeniswarkattransaksi);
                        return dynamiteModule;
                    }
                }
                int i8 = e2.a;
                int i9 = e2.d;
                StringBuilder sb6 = new StringBuilder("No acceptable module ");
                sb6.append(str);
                sb6.append(" found. Local version is ");
                sb6.append(i8);
                sb6.append(" and remote version is ");
                sb6.append(i9);
                sb6.append(".");
                throw new LoadingException(sb6.toString());
            } catch (Throwable th5) {
                if (longValue == 0) {
                    n.remove();
                } else {
                    n.set(Long.valueOf(longValue));
                }
                Cursor cursor3 = setjeniswarkattransaksi2.d;
                if (cursor3 != null) {
                    cursor3.close();
                }
                k.set(setjeniswarkattransaksi);
                throw th5;
            }
        } else {
            throw new LoadingException("null application Context");
        }
    }

    private static void a(ClassLoader classLoader) throws LoadingException {
        setNorekPengirim setnorekpengirim;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                setnorekpengirim = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                setnorekpengirim = queryLocalInterface instanceof setNorekPengirim ? (setNorekPengirim) queryLocalInterface : new setNorekPengirim(iBinder);
            }
            s = setnorekpengirim;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean a(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(m)) {
            return true;
        }
        boolean z = false;
        if (m == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            boolean z2 = false;
            if (realmGet$incomeSourceValue.c.c(context, 10000000) == 0) {
                z2 = false;
                if (resolveContentProvider != null) {
                    z2 = false;
                    if ("com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z2 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z2);
            m = valueOf;
            boolean booleanValue = valueOf.booleanValue();
            z = booleanValue;
            if (booleanValue) {
                z = booleanValue;
                if (resolveContentProvider.applicationInfo != null) {
                    z = booleanValue;
                    if ((resolveContentProvider.applicationInfo.flags & 129) == 0) {
                        Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                        f71o = true;
                        z = booleanValue;
                    }
                }
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static int b(Context context, String str, boolean z, boolean z2) throws LoadingException {
        Throwable th;
        Exception e2;
        try {
            Cursor cursor = null;
            Cursor query = null;
            try {
                boolean z3 = true;
                query = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) n.get()).longValue())).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z4 = false;
                            int i2 = query.getInt(0);
                            if (i2 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f = query.getString(2);
                                        int columnIndex = query.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            l = query.getInt(columnIndex);
                                        }
                                        int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z4 = query.getInt(columnIndex2) != 0;
                                            f71o = z4;
                                        } else {
                                            z4 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                setJenisWarkatTransaksi setjeniswarkattransaksi = (setJenisWarkatTransaksi) k.get();
                                if (setjeniswarkattransaksi == null || setjeniswarkattransaksi.d != null) {
                                    z3 = false;
                                } else {
                                    setjeniswarkattransaksi.d = query;
                                }
                                if (z3) {
                                }
                            }
                            if (!z2 || !z4) {
                                if (query != null) {
                                    query.close();
                                }
                                return i2;
                            }
                            cursor = query;
                            throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        cursor = query;
                        if (e2 instanceof LoadingException) {
                            throw e2;
                        }
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new LoadingException(sb.toString(), e2);
                    } catch (Throwable th3) {
                        th = th3;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int c(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            Object obj = declaredField.get(null);
            boolean z = true;
            if (obj != str) {
                z = obj != null && obj.equals(str);
            }
            if (z) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            StringBuilder sb3 = new StringBuilder("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v41, types: [o.setJenisWarkatTransaksi] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.database.Cursor] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static int d(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 1008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    private static setAlamatPengirim d(Context context) {
        setAlamatPengirim setalamatpengirim;
        synchronized (DynamiteModule.class) {
            try {
                setAlamatPengirim setalamatpengirim2 = q;
                if (setalamatpengirim2 != null) {
                    return setalamatpengirim2;
                }
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        setalamatpengirim = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        setalamatpengirim = queryLocalInterface instanceof setAlamatPengirim ? (setAlamatPengirim) queryLocalInterface : new setAlamatPengirim(iBinder);
                    }
                    if (setalamatpengirim != null) {
                        q = setalamatpengirim;
                        return setalamatpengirim;
                    }
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder("Failed to load IDynamiteLoader from GmsCore: ");
                    sb.append(message);
                    Log.e("DynamiteModule", sb.toString());
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int e(Context context, String str) {
        return d(context, str, false);
    }

    public final IBinder a(String str) throws LoadingException {
        try {
            return (IBinder) this.j.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2);
        }
    }

    @ResultIgnorabilityUnspecified
    public final Context b() {
        return this.j;
    }
}
