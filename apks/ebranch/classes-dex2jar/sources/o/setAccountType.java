package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import io.realm.internal.Property;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/setAccountType.class */
public final class setAccountType {
    private final Context c;

    public setAccountType(Context context) {
        this.c = context;
    }

    private static GetCustAcctListResponse$AccountData$$Parcelable d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof GetCustAcctListResponse$AccountData$$Parcelable) {
                    return (GetCustAcctListResponse$AccountData$$Parcelable) newInstance;
                }
                StringBuilder sb = new StringBuilder("Expected instanceof GlideModule, but found: ");
                sb.append(newInstance);
                throw new RuntimeException(sb.toString());
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb3 = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e2);
            } catch (NoSuchMethodException e3) {
                StringBuilder sb4 = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb5 = new StringBuilder("Unable to instantiate GlideModule implementation for ");
                sb5.append(cls);
                throw new RuntimeException(sb5.toString(), e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public final List<GetCustAcctListResponse$AccountData$$Parcelable> b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.c.getPackageManager().getApplicationInfo(this.c.getPackageName(), Property.TYPE_ARRAY);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
                Log.v("ManifestParser", sb.toString());
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(d(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str);
                        Log.d("ManifestParser", sb2.toString());
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
