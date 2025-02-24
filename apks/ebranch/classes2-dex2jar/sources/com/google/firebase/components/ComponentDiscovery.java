package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.inject.Provider;
import io.realm.RealmFieldTypeConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentDiscovery.class */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX;
    private static final String COMPONENT_SENTINEL_VALUE;
    static final String TAG;
    private final T context;
    private final RemoteActionCompatParcelizer<T> retriever;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentDiscovery$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<T> {
        List<String> c(T t);
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/components/ComponentDiscovery$read.class */
    static final class read implements RemoteActionCompatParcelizer<Context> {
        private final Class<? extends Service> a;

        private read(Class<? extends Service> cls) {
            this.a = cls;
        }

        /* synthetic */ read(Class cls, byte b) {
            this(cls);
        }

        /* renamed from: c */
        private Bundle c2(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(ComponentDiscovery.TAG, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.a), RealmFieldTypeConstants.LIST_OFFSET);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(" has no service info.");
                Log.w(ComponentDiscovery.TAG, sb.toString());
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w(ComponentDiscovery.TAG, "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RemoteActionCompatParcelizer
        public final /* synthetic */ List c(Context context) {
            Bundle c = c2(context);
            if (c == null) {
                Log.w(ComponentDiscovery.TAG, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : c.keySet()) {
                if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(c.get(str)) && str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    ComponentDiscovery(T t, RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.context = t;
        this.retriever = remoteActionCompatParcelizer;
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new read(cls, (byte) 0));
    }

    public static ComponentRegistrar instantiate(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
        } catch (ClassNotFoundException e) {
            Log.w(TAG, String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    @Deprecated
    public final List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.retriever.c(this.context)) {
            try {
                ComponentRegistrar instantiate = instantiate(str);
                if (instantiate != null) {
                    arrayList.add(instantiate);
                }
            } catch (InvalidRegistrarException e) {
                Log.w(TAG, "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public final List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.retriever.c(this.context)) {
            arrayList.add(new Provider(str) { // from class: com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r4;
                }

                public final Object get() {
                    return ComponentDiscovery.instantiate(this.f$0);
                }
            });
        }
        return arrayList;
    }
}
