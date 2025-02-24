package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import io.realm.internal.Property;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver.class */
final class getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver {
    private final Context a;
    private Map<String, String> d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        this.a = context;
    }

    private static Bundle b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), Property.TYPE_ARRAY);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("BackendRegistry", "Application info not found.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final getCob d(String str) {
        Map<String, String> map;
        if (this.d == null) {
            Bundle b = b(this.a);
            if (b == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.emptyMap();
            } else {
                map = new HashMap<>();
                for (String str2 : b.keySet()) {
                    Object obj = b.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String trim = str3.trim();
                            if (!trim.isEmpty()) {
                                map.put(trim, str2.substring(8));
                            }
                        }
                    }
                }
            }
            this.d = map;
        }
        String str4 = this.d.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (getCob) Class.forName(str4).asSubclass(getCob.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
            return null;
        }
    }
}
