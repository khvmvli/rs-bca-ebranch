package io.realm;

import android.content.Context;
import android.util.JsonReader;
import com.facebook.stetho.common.Utf8Charset;
import io.realm.BaseRealm;
import io.realm.RealmCache;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.ColumnIndices;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmNotifier;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:io/realm/Realm.class */
public class Realm extends BaseRealm {
    public static final String DEFAULT_REALM_NAME;
    public static final int ENCRYPTION_KEY_LENGTH;
    private static final String NULL_CONFIG_MSG;
    private static RealmConfiguration defaultConfiguration;
    private static final Object defaultConfigurationLock = new Object();
    private final RealmSchema schema;

    /* loaded from: classes-dex2jar.jar:io/realm/Realm$Callback.class */
    public static abstract class Callback extends BaseRealm.InstanceCallback<Realm> {
        @Override // io.realm.BaseRealm.InstanceCallback
        public void onError(Throwable th) {
            onError(th);
        }

        public abstract void onSuccess(Realm realm);
    }

    /* loaded from: classes-dex2jar.jar:io/realm/Realm$Transaction.class */
    public interface Transaction {

        /* loaded from: classes-dex2jar.jar:io/realm/Realm$Transaction$Callback.class */
        public static class Callback {
            public void onError(Exception exc) {
            }

            public void onSuccess() {
            }
        }

        /* loaded from: classes-dex2jar.jar:io/realm/Realm$Transaction$OnError.class */
        public interface OnError {
            void onError(Throwable th);
        }

        /* loaded from: classes-dex2jar.jar:io/realm/Realm$Transaction$OnSuccess.class */
        public interface OnSuccess {
            void onSuccess();
        }

        void execute(Realm realm);
    }

    private Realm(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, createExpectedSchemaInfo(realmCache.getConfiguration().getSchemaMediator()), versionID);
        this.schema = new ImmutableRealmSchema(this, new ColumnIndices(this.configuration.getSchemaMediator(), this.sharedRealm.getSchemaInfo()));
        if (this.configuration.isReadOnly()) {
            RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
            for (Class<? extends RealmModel> cls : schemaMediator.getModelClasses()) {
                String tableNameForClass = Table.getTableNameForClass(schemaMediator.getSimpleClassName(cls));
                if (!this.sharedRealm.hasTable(tableNameForClass)) {
                    this.sharedRealm.close();
                    throw new RealmMigrationNeededException(this.configuration.getPath(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.getClassNameForTable(tableNameForClass)));
                }
            }
        }
    }

    private Realm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.schema = new ImmutableRealmSchema(this, new ColumnIndices(this.configuration.getSchemaMediator(), osSharedRealm.getSchemaInfo()));
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static void checkFilesDirAvailable(android.content.Context r6) {
        /*
            r0 = r6
            java.io.File r0 = r0.getFilesDir()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x001a
            r0 = r7
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0011
            return
        L_0x0011:
            r0 = r7
            boolean r0 = r0.mkdirs()     // Catch: SecurityException -> 0x0019
            goto L_0x001a
        L_0x0019:
            r8 = move-exception
        L_0x001a:
            r0 = r7
            if (r0 == 0) goto L_0x0025
            r0 = r7
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0081
        L_0x0025:
            r0 = 0
            r9 = r0
            r0 = -1
            r11 = r0
        L_0x002a:
            r0 = r6
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L_0x003b
            r0 = r6
            java.io.File r0 = r0.getFilesDir()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0081
        L_0x003b:
            int r11 = r11 + 1
            r0 = r11
            r1 = 4
            int r0 = java.lang.Math.min(r0, r1)
            r12 = r0
            r0 = 5
            long[] r0 = new long[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 10
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 16
            r1[r2] = r3
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            android.os.SystemClock.sleep(r0)
            r0 = r9
            r1 = r13
            long r0 = r0 + r1
            r13 = r0
            r0 = r13
            r9 = r0
            r0 = r13
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
        L_0x0081:
            r0 = r6
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L_0x0093
            r0 = r6
            java.io.File r0 = r0.getFilesDir()
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0093
            return
        L_0x0093:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Context.getFilesDir() returns "
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r6
            java.io.File r1 = r1.getFilesDir()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.Realm.checkFilesDirAvailable(android.content.Context):void");
    }

    private void checkHasPrimaryKey(Class<? extends RealmModel> cls) {
        if (!hasPrimaryKey(cls)) {
            StringBuilder sb = new StringBuilder("A RealmObject with no @PrimaryKey cannot be updated: ");
            sb.append(cls.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void checkMaxDepth(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("maxDepth must be > 0. It was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private <E extends RealmModel> void checkNotNullObject(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    private <E extends RealmModel> void checkValidObjectForDetach(E e) {
        if (e == null) {
            throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
        } else if (!RealmObject.isManaged(e) || !RealmObject.isValid(e)) {
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        } else if (e instanceof DynamicRealmObject) {
            throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
        }
    }

    public static boolean compactRealm(RealmConfiguration realmConfiguration) {
        return BaseRealm.compactRealm(realmConfiguration);
    }

    private <E extends RealmModel> E copyOrUpdate(E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        checkIfValid();
        if (!isInTransaction()) {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        } else if (!this.configuration.getSchemaMediator().isEmbedded(Util.getOriginalModelClass(e.getClass()))) {
            try {
                return (E) this.configuration.getSchemaMediator().copyOrUpdate(this, e, z, map, set);
            } catch (IllegalStateException e2) {
                if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(e2.getMessage());
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
    }

    private <E extends RealmModel> E createDetachedCopy(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        checkIfValid();
        return (E) this.configuration.getSchemaMediator().createDetachedCopy(e, i, map);
    }

    private static OsSchemaInfo createExpectedSchemaInfo(RealmProxyMediator realmProxyMediator) {
        return new OsSchemaInfo(realmProxyMediator.getExpectedObjectSchemaInfoMap().values());
    }

    public static Realm createInstance(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new Realm(realmCache, versionID);
    }

    public static Realm createInstance(OsSharedRealm osSharedRealm) {
        return new Realm(osSharedRealm);
    }

    public static boolean deleteRealm(RealmConfiguration realmConfiguration) {
        return BaseRealm.deleteRealm(realmConfiguration);
    }

    @Nullable
    public static Context getApplicationContext() {
        return applicationContext;
    }

    @Nullable
    public static RealmConfiguration getDefaultConfiguration() {
        RealmConfiguration realmConfiguration;
        synchronized (defaultConfigurationLock) {
            realmConfiguration = defaultConfiguration;
        }
        return realmConfiguration;
    }

    public static Realm getDefaultInstance() {
        RealmConfiguration defaultConfiguration2 = getDefaultConfiguration();
        if (defaultConfiguration2 != null) {
            return (Realm) RealmCache.createRealmOrGetFromCache(defaultConfiguration2, Realm.class);
        }
        if (BaseRealm.applicationContext == null) {
            throw new IllegalStateException("Call `Realm.init(Context)` before calling this method.");
        }
        throw new IllegalStateException("Set default configuration by using `Realm.setDefaultConfiguration(RealmConfiguration)`.");
    }

    @Nullable
    public static Object getDefaultModule() {
        try {
            Constructor<?> constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (IllegalAccessException e2) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e4);
        }
    }

    private Scanner getFullStringScanner(InputStream inputStream) {
        return new Scanner(inputStream, Utf8Charset.NAME).useDelimiter("\\A");
    }

    public static int getGlobalInstanceCount(RealmConfiguration realmConfiguration) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        RealmCache.invokeWithGlobalRefCount(realmConfiguration, new RealmCache.Callback() { // from class: io.realm.Realm.2
            @Override // io.realm.RealmCache.Callback
            public void onResult(int i) {
                atomicInteger.set(i);
            }
        });
        return atomicInteger.get();
    }

    public static Realm getInstance(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (Realm) RealmCache.createRealmOrGetFromCache(realmConfiguration, Realm.class);
        }
        throw new IllegalArgumentException(NULL_CONFIG_MSG);
    }

    public static RealmAsyncTask getInstanceAsync(RealmConfiguration realmConfiguration, Callback callback) {
        if (realmConfiguration != null) {
            return RealmCache.createRealmOrGetFromCacheAsync(realmConfiguration, callback, Realm.class);
        }
        throw new IllegalArgumentException(NULL_CONFIG_MSG);
    }

    public static int getLocalInstanceCount(RealmConfiguration realmConfiguration) {
        return RealmCache.getLocalThreadCount(realmConfiguration);
    }

    public static void init(Context context) {
        synchronized (Realm.class) {
            try {
                initializeRealm(context, "");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void initializeRealm(Context context, String str) {
        if (BaseRealm.applicationContext != null) {
            return;
        }
        if (context != null) {
            checkFilesDirAvailable(context);
            RealmCore.loadLibrary(context);
            setDefaultConfiguration(new RealmConfiguration.Builder(context).build());
            ObjectServerFacade.getSyncFacadeIfPossible().initialize(context, str);
            if (context.getApplicationContext() != null) {
                BaseRealm.applicationContext = context.getApplicationContext();
            } else {
                BaseRealm.applicationContext = context;
            }
            OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
            return;
        }
        throw new IllegalArgumentException("Non-null context required.");
    }

    public static void migrateRealm(RealmConfiguration realmConfiguration) throws FileNotFoundException {
        migrateRealm(realmConfiguration, null);
    }

    public static void migrateRealm(RealmConfiguration realmConfiguration, @Nullable RealmMigration realmMigration) throws FileNotFoundException {
        BaseRealm.migrateRealm(realmConfiguration, realmMigration);
    }

    public static void removeDefaultConfiguration() {
        synchronized (defaultConfigurationLock) {
            defaultConfiguration = null;
        }
    }

    public static void setDefaultConfiguration(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            synchronized (defaultConfigurationLock) {
                defaultConfiguration = realmConfiguration;
            }
            return;
        }
        throw new IllegalArgumentException(NULL_CONFIG_MSG);
    }

    public void addChangeListener(RealmChangeListener<Realm> realmChangeListener) {
        addListener(realmChangeListener);
    }

    @Override // io.realm.BaseRealm
    public Page6DTahapanXpresiSFragment_ViewBinding<Realm> asFlowable() {
        return this.configuration.getRxFactory().from(this);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void beginTransaction() {
        beginTransaction();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void cancelTransaction() {
        cancelTransaction();
    }

    @Override // io.realm.BaseRealm, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        close();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void commitTransaction() {
        commitTransaction();
    }

    public <E extends RealmModel> E copyFromRealm(E e) {
        return (E) copyFromRealm((Realm) e, Integer.MAX_VALUE);
    }

    public <E extends RealmModel> E copyFromRealm(E e, int i) {
        checkMaxDepth(i);
        checkValidObjectForDetach(e);
        return (E) createDetachedCopy(e, i, new HashMap());
    }

    public <E extends RealmModel> List<E> copyFromRealm(Iterable<E> iterable) {
        return copyFromRealm(iterable, Integer.MAX_VALUE);
    }

    public <E extends RealmModel> List<E> copyFromRealm(Iterable<E> iterable, int i) {
        checkMaxDepth(i);
        if (iterable == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList();
        HashMap hashMap = new HashMap();
        for (E e : iterable) {
            checkValidObjectForDetach(e);
            arrayList.add(createDetachedCopy(e, i, hashMap));
        }
        return arrayList;
    }

    public <E extends RealmModel> E copyToRealm(E e, ImportFlag... importFlagArr) {
        checkNotNullObject(e);
        return (E) copyOrUpdate(e, false, new HashMap(), Util.toSet(importFlagArr));
    }

    public <E extends RealmModel> List<E> copyToRealm(Iterable<E> iterable, ImportFlag... importFlagArr) {
        if (iterable == null) {
            return new ArrayList();
        }
        ArrayList arrayList = iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList();
        HashMap hashMap = new HashMap();
        for (E e : iterable) {
            checkNotNullObject(e);
            arrayList.add(copyOrUpdate(e, false, hashMap, Util.toSet(importFlagArr)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends RealmModel> E copyToRealmOrUpdate(E e, ImportFlag... importFlagArr) {
        checkNotNullObject(e);
        checkHasPrimaryKey(e.getClass());
        return (E) copyOrUpdate(e, true, new HashMap(), Util.toSet(importFlagArr));
    }

    public <E extends RealmModel> List<E> copyToRealmOrUpdate(Iterable<E> iterable, ImportFlag... importFlagArr) {
        if (iterable == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList();
        HashMap hashMap = new HashMap();
        Set<ImportFlag> set = Util.toSet(importFlagArr);
        for (E e : iterable) {
            checkNotNullObject(e);
            arrayList.add(copyOrUpdate(e, true, hashMap, set));
        }
        return arrayList;
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, InputStream inputStream) throws IOException {
        if (cls != null && inputStream != null) {
            checkIfValid();
            JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, Utf8Charset.NAME));
            try {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    this.configuration.getSchemaMediator().createUsingJsonStream(cls, this, jsonReader);
                }
                jsonReader.endArray();
            } finally {
                jsonReader.close();
            }
        }
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, String str) {
        if (cls != null && str != null && str.length() != 0) {
            try {
                createAllFromJson(cls, new JSONArray(str));
            } catch (JSONException e) {
                throw new RealmException("Could not create JSON array from string", e);
            }
        }
    }

    public <E extends RealmModel> void createAllFromJson(Class<E> cls, JSONArray jSONArray) {
        if (!(cls == null || jSONArray == null)) {
            checkIfValid();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), false);
                } catch (JSONException e) {
                    throw new RealmException("Could not map JSON", e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends RealmModel> E createEmbeddedObject(Class<E> cls, RealmModel realmModel, String str) {
        checkIfValid();
        Util.checkNull(realmModel, "parentObject");
        Util.checkEmpty(str, "parentProperty");
        if (!RealmObject.isManaged(realmModel) || !RealmObject.isValid(realmModel)) {
            throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
        }
        return (E) this.configuration.getSchemaMediator().newInstance(cls, this, getEmbeddedObjectRow(this.schema.getSchemaForClass(cls).getClassName(), (RealmObjectProxy) realmModel, str, this.schema, this.schema.getSchemaForClass((Class<? extends RealmModel>) realmModel.getClass())), this.schema.getColumnInfo(cls), true, Collections.EMPTY_LIST);
    }

    public <E extends RealmModel> E createObject(Class<E> cls) {
        checkIfValid();
        RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
        if (!schemaMediator.isEmbedded(cls)) {
            return (E) createObjectInternal(cls, true, Collections.emptyList());
        }
        StringBuilder sb = new StringBuilder("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  ");
        sb.append(schemaMediator.getSimpleClassName(cls));
        throw new IllegalArgumentException(sb.toString());
    }

    public <E extends RealmModel> E createObject(Class<E> cls, @Nullable Object obj) {
        checkIfValid();
        RealmProxyMediator schemaMediator = this.configuration.getSchemaMediator();
        if (!schemaMediator.isEmbedded(cls)) {
            return (E) createObjectInternal(cls, obj, true, Collections.emptyList());
        }
        StringBuilder sb = new StringBuilder("This class is marked embedded. Use `createEmbeddedObject(class, parent, property)` instead:  ");
        sb.append(schemaMediator.getSimpleClassName(cls));
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Finally extract failed */
    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, InputStream inputStream) throws IOException {
        E e;
        Scanner scanner = null;
        Scanner scanner2 = null;
        if (cls == null || inputStream == null) {
            return null;
        }
        checkIfValid();
        try {
            if (OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, this.configuration.getSchemaMediator().getSimpleClassName(cls)) != null) {
                try {
                    Scanner fullStringScanner = getFullStringScanner(inputStream);
                    scanner2 = fullStringScanner;
                    scanner = fullStringScanner;
                    RealmModel createOrUpdateUsingJsonObject = this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, new JSONObject(fullStringScanner.next()), false);
                    e = (E) createOrUpdateUsingJsonObject;
                    if (fullStringScanner != null) {
                        fullStringScanner.close();
                        e = (E) createOrUpdateUsingJsonObject;
                    }
                } catch (JSONException e2) {
                    throw new RealmException("Failed to read JSON", e2);
                }
            } else {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, Utf8Charset.NAME));
                try {
                    e = (E) this.configuration.getSchemaMediator().createUsingJsonStream(cls, this, jsonReader);
                } finally {
                    jsonReader.close();
                }
            }
            return e;
        } catch (Throwable th) {
            if (scanner2 != null) {
                scanner2.close();
            }
            throw th;
        }
    }

    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        try {
            return (E) createObjectFromJson(cls, new JSONObject(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create Json object from string", e);
        }
    }

    @Nullable
    public <E extends RealmModel> E createObjectFromJson(Class<E> cls, JSONObject jSONObject) {
        if (cls == null || jSONObject == null) {
            return null;
        }
        checkIfValid();
        try {
            return (E) this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONObject, false);
        } catch (JSONException e) {
            throw new RealmException("Could not map JSON", e);
        }
    }

    public <E extends RealmModel> E createObjectInternal(Class<E> cls, @Nullable Object obj, boolean z, List<String> list) {
        return (E) this.configuration.getSchemaMediator().newInstance(cls, this, OsObject.createWithPrimaryKey(this.schema.getTable(cls), obj), this.schema.getColumnInfo(cls), z, list);
    }

    public <E extends RealmModel> E createObjectInternal(Class<E> cls, boolean z, List<String> list) {
        Table table = this.schema.getTable(cls);
        if (OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, this.configuration.getSchemaMediator().getSimpleClassName(cls)) == null) {
            return (E) this.configuration.getSchemaMediator().newInstance(cls, this, OsObject.create(table), this.schema.getColumnInfo(cls), z, list);
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key, use 'createObject(Class<E>, Object)' instead.", table.getClassName()));
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, InputStream inputStream) {
        if (cls != null && inputStream != null) {
            checkIfValid();
            checkHasPrimaryKey(cls);
            Scanner scanner = null;
            scanner = null;
            try {
                try {
                    Scanner fullStringScanner = getFullStringScanner(inputStream);
                    JSONArray jSONArray = new JSONArray(fullStringScanner.next());
                    int i = 0;
                    while (true) {
                        scanner = fullStringScanner;
                        scanner = fullStringScanner;
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), true);
                        i++;
                    }
                    if (fullStringScanner != null) {
                        fullStringScanner.close();
                    }
                } catch (JSONException e) {
                    throw new RealmException("Failed to read JSON", e);
                }
            } catch (Throwable th) {
                if (scanner != null) {
                    scanner.close();
                }
                throw th;
            }
        }
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, String str) {
        if (cls != null && str != null && str.length() != 0) {
            checkIfValid();
            checkHasPrimaryKey(cls);
            try {
                createOrUpdateAllFromJson(cls, new JSONArray(str));
            } catch (JSONException e) {
                throw new RealmException("Could not create JSON array from string", e);
            }
        }
    }

    public <E extends RealmModel> void createOrUpdateAllFromJson(Class<E> cls, JSONArray jSONArray) {
        if (!(cls == null || jSONArray == null)) {
            checkIfValid();
            checkHasPrimaryKey(cls);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONArray.getJSONObject(i), true);
                } catch (JSONException e) {
                    throw new RealmException("Could not map JSON", e);
                }
            }
        }
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, InputStream inputStream) {
        Scanner scanner = null;
        Scanner scanner2 = null;
        if (cls == null || inputStream == null) {
            return null;
        }
        try {
            checkIfValid();
            checkHasPrimaryKey(cls);
            try {
                Scanner fullStringScanner = getFullStringScanner(inputStream);
                scanner2 = fullStringScanner;
                scanner = fullStringScanner;
                E e = (E) createOrUpdateObjectFromJson(cls, new JSONObject(fullStringScanner.next()));
                if (fullStringScanner != null) {
                    fullStringScanner.close();
                }
                return e;
            } catch (JSONException e2) {
                throw new RealmException("Failed to read JSON", e2);
            }
        } catch (Throwable th) {
            if (scanner2 != null) {
                scanner2.close();
            }
            throw th;
        }
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        checkIfValid();
        checkHasPrimaryKey(cls);
        try {
            return (E) createOrUpdateObjectFromJson(cls, new JSONObject(str));
        } catch (JSONException e) {
            throw new RealmException("Could not create Json object from string", e);
        }
    }

    public <E extends RealmModel> E createOrUpdateObjectFromJson(Class<E> cls, JSONObject jSONObject) {
        if (cls == null || jSONObject == null) {
            return null;
        }
        checkIfValid();
        checkHasPrimaryKey(cls);
        try {
            return (E) this.configuration.getSchemaMediator().createOrUpdateUsingJsonObject(cls, this, jSONObject, true);
        } catch (JSONException e) {
            throw new RealmException("Could not map JSON", e);
        }
    }

    public void delete(Class<? extends RealmModel> cls) {
        checkIfValid();
        this.schema.getTable(cls).clear();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
        deleteAll();
    }

    public void executeTransaction(Transaction transaction) {
        if (transaction != null) {
            checkIfValid();
            checkAllowWritesOnUiThread();
            beginTransaction();
            try {
                transaction.execute(this);
                commitTransaction();
            } catch (Throwable th) {
                if (isInTransaction()) {
                    cancelTransaction();
                } else {
                    RealmLog.warn("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Transaction should not be null");
        }
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction) {
        return executeTransactionAsync(transaction, null, null);
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnError onError) {
        if (onError != null) {
            return executeTransactionAsync(transaction, null, onError);
        }
        throw new IllegalArgumentException("onError callback can't be null");
    }

    public RealmAsyncTask executeTransactionAsync(Transaction transaction, Transaction.OnSuccess onSuccess) {
        if (onSuccess != null) {
            return executeTransactionAsync(transaction, onSuccess, null);
        }
        throw new IllegalArgumentException("onSuccess callback can't be null");
    }

    public RealmAsyncTask executeTransactionAsync(final Transaction transaction, @Nullable final Transaction.OnSuccess onSuccess, @Nullable final Transaction.OnError onError) {
        checkIfValid();
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction should not be null");
        } else if (!isFrozen()) {
            final boolean canDeliverNotification = this.sharedRealm.capabilities.canDeliverNotification();
            if (!(onSuccess == null && onError == null)) {
                this.sharedRealm.capabilities.checkCanDeliverNotification("Callback cannot be delivered on current thread.");
            }
            final RealmConfiguration configuration = getConfiguration();
            final RealmNotifier realmNotifier = this.sharedRealm.realmNotifier;
            return new RealmAsyncTaskImpl(asyncTaskExecutor.submitTransaction(new Runnable() { // from class: io.realm.Realm.1
                @Override // java.lang.Runnable
                public void run() {
                    OsSharedRealm.VersionID versionID;
                    if (!Thread.currentThread().isInterrupted()) {
                        Realm instance = Realm.getInstance(configuration);
                        instance.beginTransaction();
                        Throwable th = null;
                        try {
                            transaction.execute(instance);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                if (instance.isInTransaction()) {
                                    instance.cancelTransaction();
                                }
                                instance.close();
                                versionID = null;
                            } catch (Throwable th3) {
                                instance.close();
                                throw th3;
                            }
                        }
                        if (Thread.currentThread().isInterrupted()) {
                            try {
                                if (instance.isInTransaction()) {
                                    instance.cancelTransaction();
                                }
                                instance.close();
                            } catch (Throwable th4) {
                                instance.close();
                                throw th4;
                            }
                        } else {
                            instance.commitTransaction();
                            versionID = instance.sharedRealm.getVersionID();
                            try {
                                if (instance.isInTransaction()) {
                                    instance.cancelTransaction();
                                }
                                instance.close();
                                if (canDeliverNotification) {
                                    if (versionID != null && onSuccess != null) {
                                        realmNotifier.post(new 1(this, versionID));
                                    } else if (th != null) {
                                        realmNotifier.post(new 2(this, th));
                                    }
                                } else if (th != null) {
                                    throw new RealmException("Async transaction failed", th);
                                }
                            } catch (Throwable th5) {
                                instance.close();
                                throw th5;
                            }
                        }
                    }
                }
            }), asyncTaskExecutor);
        } else {
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
    }

    @Override // io.realm.BaseRealm
    public Realm freeze() {
        return (Realm) RealmCache.createRealmOrGetFromCache(this.configuration, Realm.class, this.sharedRealm.getVersionID());
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ RealmConfiguration getConfiguration() {
        return getConfiguration();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getNumberOfActiveVersions() {
        return getNumberOfActiveVersions();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ String getPath() {
        return getPath();
    }

    @Override // io.realm.BaseRealm
    public RealmSchema getSchema() {
        return this.schema;
    }

    public Table getTable(Class<? extends RealmModel> cls) {
        return this.schema.getTable(cls);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
        return getVersion();
    }

    public boolean hasPrimaryKey(Class<? extends RealmModel> cls) {
        return this.configuration.getSchemaMediator().hasPrimaryKey(cls);
    }

    public void insert(RealmModel realmModel) {
        checkIfValidAndInTransaction();
        if (realmModel != null) {
            this.configuration.getSchemaMediator().insert(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public void insert(Collection<? extends RealmModel> collection) {
        checkIfValidAndInTransaction();
        if (collection == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        } else if (!collection.isEmpty()) {
            this.configuration.getSchemaMediator().insert(this, collection);
        }
    }

    public void insertOrUpdate(RealmModel realmModel) {
        checkIfValidAndInTransaction();
        if (realmModel != null) {
            this.configuration.getSchemaMediator().insertOrUpdate(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public void insertOrUpdate(Collection<? extends RealmModel> collection) {
        checkIfValidAndInTransaction();
        if (collection == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        } else if (!collection.isEmpty()) {
            this.configuration.getSchemaMediator().insertOrUpdate(this, collection);
        }
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isAutoRefresh() {
        return isAutoRefresh();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return isClosed();
    }

    @Override // io.realm.BaseRealm
    public boolean isEmpty() {
        checkIfValid();
        for (RealmObjectSchema realmObjectSchema : this.schema.getAll()) {
            if (!realmObjectSchema.getClassName().startsWith("__") && realmObjectSchema.getTable().size() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isFrozen() {
        return isFrozen();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ boolean isInTransaction() {
        return isInTransaction();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void refresh() {
        refresh();
    }

    public void removeAllChangeListeners() {
        removeAllListeners();
    }

    public void removeChangeListener(RealmChangeListener<Realm> realmChangeListener) {
        removeListener(realmChangeListener);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean z) {
        setAutoRefresh(z);
    }

    @Override // io.realm.BaseRealm
    @Deprecated
    public /* bridge */ /* synthetic */ void stopWaitForChange() {
        stopWaitForChange();
    }

    @Override // io.realm.BaseRealm
    @Deprecated
    public /* bridge */ /* synthetic */ boolean waitForChange() {
        return waitForChange();
    }

    public <E extends RealmModel> RealmQuery<E> where(Class<E> cls) {
        checkIfValid();
        return RealmQuery.createQuery(this, cls);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeCopyTo(File file) {
        writeCopyTo(file);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void writeEncryptedCopyTo(File file, byte[] bArr) {
        writeEncryptedCopyTo(file, bArr);
    }
}
