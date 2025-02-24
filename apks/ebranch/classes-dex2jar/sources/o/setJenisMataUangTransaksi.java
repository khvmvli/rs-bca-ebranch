package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;
import o.realmSet$NegaraTujuanPenerima;
/* loaded from: classes-dex2jar.jar:o/setJenisMataUangTransaksi.class */
public final class setJenisMataUangTransaksi {
    private static final String a = "zzcc";
    private static setJenisKodeBankTransaksi b;
    private static Context e;

    private static Context a(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        return realmGet$language.getRemoteContext(context);
    }

    private static setJenisKodeBankTransaksi b(Context context, realmSet$NegaraTujuanPenerima.write write) {
        setJenisKodeBankTransaksi setjeniskodebanktransaksi;
        Log.i(a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) setFotoKtp.b(e(context, write).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                setjeniskodebanktransaksi = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                setjeniskodebanktransaksi = queryLocalInterface instanceof setJenisKodeBankTransaksi ? (setJenisKodeBankTransaksi) queryLocalInterface : new setFlagValueTodayTransaksi(iBinder);
            }
            return setjeniskodebanktransaksi;
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e2);
        }
    }

    public static setJenisKodeBankTransaksi c(Context context, realmSet$NegaraTujuanPenerima.write write) throws GooglePlayServicesNotAvailableException {
        setFotoKtp.b(context);
        Log.d(a, "preferredRenderer: ".concat(String.valueOf(String.valueOf(write))));
        setJenisKodeBankTransaksi setjeniskodebanktransaksi = b;
        if (setjeniskodebanktransaksi != null) {
            return setjeniskodebanktransaksi;
        }
        int isGooglePlayServicesAvailable = realmGet$language.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable == 0) {
            setJenisKodeBankTransaksi b2 = b(context, write);
            b = b2;
            try {
                if (b2.d() == 2) {
                    try {
                        b.d(realmSet$jenisWarkatTransaksi.d(e(context, write)));
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    } catch (UnsatisfiedLinkError e3) {
                        Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        e = null;
                        b = b(context, realmSet$NegaraTujuanPenerima.write.LEGACY);
                    }
                }
                try {
                    b.e(realmSet$jenisWarkatTransaksi.d(((Context) Objects.requireNonNull(e(context, write))).getResources()), 19000000);
                    return b;
                } catch (RemoteException e4) {
                    throw new RuntimeRemoteException(e4);
                }
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        } else {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:30|4|(8:6|(1:8)|14|34|16|17|26|27)|10|34|16|17|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r5 != o.realmSet$NegaraTujuanPenerima.write.d) goto L_0x0034;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        r5 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r5.equals("com.google.android.gms.maps_dynamite") == false) goto L_0x0052;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        android.util.Log.d(o.setJenisMataUangTransaksi.a, "Attempting to load maps_dynamite again.");
        r4 = com.google.android.gms.dynamite.DynamiteModule.a(r4, com.google.android.gms.dynamite.DynamiteModule.c, "com.google.android.gms.maps_dynamite").b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        r4 = a(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = a(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != 1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.content.Context e(android.content.Context r4, o.realmSet$NegaraTujuanPenerima.write r5) {
        /*
            android.content.Context r0 = o.setJenisMataUangTransaksi.e
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: ClassNotFoundException -> 0x0026
            r0 = r5
            if (r0 == 0) goto L_0x0020
            r0 = r5
            int r0 = r0.ordinal()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x002e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            r5 = r0
            goto L_0x0037
        L_0x0026:
            r6 = move-exception
            r0 = r5
            o.realmSet$NegaraTujuanPenerima$write r1 = o.realmSet$NegaraTujuanPenerima.write.LEGACY
            if (r0 != r1) goto L_0x0034
        L_0x002e:
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            r5 = r0
            goto L_0x0037
        L_0x0034:
            java.lang.String r0 = "com.google.android.gms.maps_core_dynamite"
            r5 = r0
        L_0x0037:
            r0 = r4
            com.google.android.gms.dynamite.DynamiteModule$RemoteActionCompatParcelizer r1 = com.google.android.gms.dynamite.DynamiteModule.c     // Catch: Exception -> 0x0048
            r2 = r5
            com.google.android.gms.dynamite.DynamiteModule r0 = com.google.android.gms.dynamite.DynamiteModule.a(r0, r1, r2)     // Catch: Exception -> 0x0048
            android.content.Context r0 = r0.b()     // Catch: Exception -> 0x0048
            r6 = r0
            r0 = r6
            r4 = r0
            goto L_0x007d
        L_0x0048:
            r6 = move-exception
            r0 = r5
            java.lang.String r1 = "com.google.android.gms.maps_dynamite"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = o.setJenisMataUangTransaksi.a     // Catch: Exception -> 0x006d
            java.lang.String r1 = "Attempting to load maps_dynamite again."
            int r0 = android.util.Log.d(r0, r1)     // Catch: Exception -> 0x006d
            r0 = r4
            com.google.android.gms.dynamite.DynamiteModule$RemoteActionCompatParcelizer r1 = com.google.android.gms.dynamite.DynamiteModule.c     // Catch: Exception -> 0x006d
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            com.google.android.gms.dynamite.DynamiteModule r0 = com.google.android.gms.dynamite.DynamiteModule.a(r0, r1, r2)     // Catch: Exception -> 0x006d
            android.content.Context r0 = r0.b()     // Catch: Exception -> 0x006d
            r5 = r0
            r0 = r5
            r4 = r0
            goto L_0x007d
        L_0x006d:
            r5 = move-exception
            r0 = r5
            r1 = r4
            android.content.Context r0 = a(r0, r1)
            r4 = r0
            goto L_0x007d
        L_0x0077:
            r0 = r6
            r1 = r4
            android.content.Context r0 = a(r0, r1)
            r4 = r0
        L_0x007d:
            r0 = r4
            o.setJenisMataUangTransaksi.e = r0
            r0 = r4
            return r0
        L_0x0083:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setJenisMataUangTransaksi.e(android.content.Context, o.realmSet$NegaraTujuanPenerima$write):android.content.Context");
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e3);
        }
    }
}
