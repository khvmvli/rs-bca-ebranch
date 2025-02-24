package com.google.firebase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp$;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getTotalBiayaTransfer;
import o.prepareDialog;
import o.realmGet$purposePemRek;
import o.setFlagIB;
import o.setThumbTextPadding;
/* loaded from: classes-dex2jar.jar:com/google/firebase/FirebaseApp.class */
public class FirebaseApp {
    public static final String DEFAULT_APP_NAME;
    private static final String FIREBASE_ANDROID;
    private static final String FIREBASE_COMMON;
    private static final String KOTLIN;
    private static final String LOG_TAG;
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final String name;
    private final FirebaseOptions options;
    private static final Object LOCK = new Object();
    private static final Executor UI_EXECUTOR = new write((byte) 0);
    static final Map<String, FirebaseApp> INSTANCES = new setThumbTextPadding();
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    /* loaded from: classes-dex2jar.jar:com/google/firebase/FirebaseApp$write.class */
    static final class write implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    protected FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        if (context != null) {
            this.applicationContext = context;
            if (!TextUtils.isEmpty(str)) {
                this.name = str;
                if (firebaseOptions != null) {
                    this.options = firebaseOptions;
                    this.componentRuntime = ComponentRuntime.builder(UI_EXECUTOR).addLazyComponentRegistrars(ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy()).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponent(Component.of(context, Context.class, new Class[0])).addComponent(Component.of(this, FirebaseApp.class, new Class[0])).addComponent(Component.of(firebaseOptions, FirebaseOptions.class, new Class[0])).build();
                    this.dataCollectionConfigStorage = new Lazy<>((Provider<DataCollectionConfigStorage>) new FirebaseApp$.ExternalSyntheticLambda0(this, context));
                    return;
                }
                throw new NullPointerException("null reference");
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new NullPointerException("null reference");
    }

    private void checkNotDeleted() {
        if (!(!this.deleted.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            for (FirebaseApp firebaseApp : INSTANCES.values()) {
                arrayList.add(firebaseApp.getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(getTotalBiayaTransfer.c());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(normalize(str));
            if (firebaseApp == null) {
                List<String> allAppNames = getAllAppNames();
                if (allAppNames.isEmpty()) {
                    str2 = "";
                } else {
                    StringBuilder sb = new StringBuilder("Available app names: ");
                    sb.append(TextUtils.join(", ", allAppNames));
                    str2 = sb.toString();
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return firebaseApp;
    }

    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        String str2 = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        byte[] bytes2 = firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public void initializeAllApis() {
        if (!prepareDialog.e(this.applicationContext)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(getName());
            Log.i(LOG_TAG, sb.toString());
            IconCompatParcelizer.b(this.applicationContext);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(getName());
        Log.i(LOG_TAG, sb2.toString());
        this.componentRuntime.initializeEagerComponents(isDefaultApp());
    }

    public static FirebaseApp initializeApp(Context context) {
        synchronized (LOCK) {
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            FirebaseOptions fromResource = FirebaseOptions.fromResource(context);
            if (fromResource == null) {
                Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return initializeApp(context, fromResource);
        }
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        RemoteActionCompatParcelizer.a(context);
        String normalize = normalize(str);
        Context context2 = context;
        if (context.getApplicationContext() != null) {
            context2 = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            boolean containsKey = map.containsKey(normalize);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(normalize);
            sb.append(" already exists!");
            String obj = sb.toString();
            if (!(!containsKey)) {
                throw new IllegalStateException(String.valueOf(obj));
            } else if (context2 != null) {
                firebaseApp = new FirebaseApp(context2, normalize, firebaseOptions);
                map.put(normalize, firebaseApp);
            } else {
                throw new NullPointerException("Application context cannot be null.");
            }
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    private static String normalize(String str) {
        return str.trim();
    }

    public void notifyBackgroundStateChangeListeners(boolean z) {
        Log.d(LOG_TAG, "Notifying background state change listeners.");
        for (BackgroundStateChangeListener backgroundStateChangeListener : this.backgroundStateChangeListeners) {
            backgroundStateChangeListener.onBackgroundStateChanged(z);
        }
    }

    private void notifyOnAppDeleted() {
        for (FirebaseAppLifecycleListener firebaseAppLifecycleListener : this.lifecycleListeners) {
            firebaseAppLifecycleListener.onDeleted(this.name, this.options);
        }
    }

    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && realmGet$purposePemRek.c.a.get()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        if (firebaseAppLifecycleListener != null) {
            this.lifecycleListeners.add(firebaseAppLifecycleListener);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.name.equals(((FirebaseApp) obj).getName());
    }

    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public String getPersistenceKey() {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = getName().getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        byte[] bytes2 = getOptions().getApplicationId().getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    /* renamed from: lambda$new$0$com-google-firebase-FirebaseApp */
    /* synthetic */ DataCollectionConfigStorage m228lambda$new$0$comgooglefirebaseFirebaseApp(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.componentRuntime.get(Publisher.class));
    }

    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        if (firebaseAppLifecycleListener != null) {
            this.lifecycleListeners.remove(firebaseAppLifecycleListener);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
            boolean z2 = realmGet$purposePemRek.c.a.get();
            if (z && z2) {
                notifyBackgroundStateChangeListeners(true);
            } else if (!z && z2) {
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    public String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("name", this.name).b("options", this.options).toString();
    }
}
