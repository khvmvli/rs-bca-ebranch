package io.realm;

import android.content.Context;
import android.os.Looper;
import io.realm.Realm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.CheckedRow;
import io.realm.internal.ColumnInfo;
import io.realm.internal.InvalidRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:io/realm/BaseRealm.class */
public abstract class BaseRealm implements Closeable {
    static final String CLOSED_REALM_MESSAGE;
    static final String DELETE_NOT_SUPPORTED_UNDER_PARTIAL_SYNC;
    private static final String INCORRECT_THREAD_CLOSE_MESSAGE;
    static final String INCORRECT_THREAD_MESSAGE;
    static final String LISTENER_NOT_ALLOWED_MESSAGE;
    private static final String NOT_IN_TRANSACTION_MESSAGE;
    static volatile Context applicationContext;
    protected final RealmConfiguration configuration;
    final boolean frozen;
    private RealmCache realmCache;
    private OsSharedRealm.SchemaChangedCallback schemaChangedCallback;
    public OsSharedRealm sharedRealm;
    private boolean shouldCloseSharedRealm;
    final long threadId;
    static final RealmThreadPoolExecutor asyncTaskExecutor = RealmThreadPoolExecutor.newDefaultExecutor();
    public static final RealmThreadPoolExecutor WRITE_EXECUTOR = RealmThreadPoolExecutor.newSingleThreadExecutor();
    public static final ThreadLocalRealmObjectContext objectContext = new ThreadLocalRealmObjectContext();

    /* loaded from: classes-dex2jar.jar:io/realm/BaseRealm$InstanceCallback.class */
    public static abstract class InstanceCallback<T extends BaseRealm> {
        public void onError(Throwable th) {
            throw new RealmException("Exception happens when initializing Realm in the background thread.", th);
        }

        public abstract void onSuccess(T t);
    }

    /* loaded from: classes-dex2jar.jar:io/realm/BaseRealm$RealmObjectContext.class */
    public static final class RealmObjectContext {
        private boolean acceptDefaultValue;
        private ColumnInfo columnInfo;
        private List<String> excludeFields;
        private BaseRealm realm;
        private Row row;

        public final void clear() {
            this.realm = null;
            this.row = null;
            this.columnInfo = null;
            this.acceptDefaultValue = false;
            this.excludeFields = null;
        }

        public final boolean getAcceptDefaultValue() {
            return this.acceptDefaultValue;
        }

        public final ColumnInfo getColumnInfo() {
            return this.columnInfo;
        }

        public final List<String> getExcludeFields() {
            return this.excludeFields;
        }

        public final BaseRealm getRealm() {
            return this.realm;
        }

        public final Row getRow() {
            return this.row;
        }

        public final void set(BaseRealm baseRealm, Row row, ColumnInfo columnInfo, boolean z, List<String> list) {
            this.realm = baseRealm;
            this.row = row;
            this.columnInfo = columnInfo;
            this.acceptDefaultValue = z;
            this.excludeFields = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/BaseRealm$ThreadLocalRealmObjectContext.class */
    public static final class ThreadLocalRealmObjectContext extends ThreadLocal<RealmObjectContext> {
        ThreadLocalRealmObjectContext() {
        }

        @Override // java.lang.ThreadLocal
        public final RealmObjectContext initialValue() {
            return new RealmObjectContext();
        }
    }

    public BaseRealm(RealmCache realmCache, @Nullable OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this(realmCache.getConfiguration(), osSchemaInfo, versionID);
        this.realmCache = realmCache;
    }

    BaseRealm(RealmConfiguration realmConfiguration, @Nullable OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this.schemaChangedCallback = new OsSharedRealm.SchemaChangedCallback() { // from class: io.realm.BaseRealm.1
            @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
            public void onSchemaChanged() {
                RealmSchema schema = BaseRealm.this.getSchema();
                if (schema != null) {
                    schema.refresh();
                }
                if (BaseRealm.this instanceof Realm) {
                    schema.createKeyPathMapping();
                }
            }
        };
        this.threadId = Thread.currentThread().getId();
        this.configuration = realmConfiguration;
        AnonymousClass2 r10 = null;
        this.realmCache = null;
        OsSharedRealm.MigrationCallback createMigrationCallback = (osSchemaInfo == null || realmConfiguration.getMigration() == null) ? null : createMigrationCallback(realmConfiguration.getMigration());
        final Realm.Transaction initialDataTransaction = realmConfiguration.getInitialDataTransaction();
        OsSharedRealm instance = OsSharedRealm.getInstance(new OsRealmConfig.Builder(realmConfiguration).fifoFallbackDir(new File(applicationContext.getFilesDir(), ".realm.temp")).autoUpdateNotification(true).migrationCallback(createMigrationCallback).schemaInfo(osSchemaInfo).initializationCallback(initialDataTransaction != null ? new OsSharedRealm.InitializationCallback() { // from class: io.realm.BaseRealm.2
            @Override // io.realm.internal.OsSharedRealm.InitializationCallback
            public void onInit(OsSharedRealm osSharedRealm) {
                initialDataTransaction.execute(Realm.createInstance(osSharedRealm));
            }
        } : r10), versionID);
        this.sharedRealm = instance;
        this.frozen = instance.isFrozen();
        this.shouldCloseSharedRealm = true;
        this.sharedRealm.registerSchemaChangedCallback(this.schemaChangedCallback);
    }

    public BaseRealm(OsSharedRealm osSharedRealm) {
        this.schemaChangedCallback = new OsSharedRealm.SchemaChangedCallback() { // from class: io.realm.BaseRealm.1
            @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
            public void onSchemaChanged() {
                RealmSchema schema = BaseRealm.this.getSchema();
                if (schema != null) {
                    schema.refresh();
                }
                if (BaseRealm.this instanceof Realm) {
                    schema.createKeyPathMapping();
                }
            }
        };
        this.threadId = Thread.currentThread().getId();
        this.configuration = osSharedRealm.getConfiguration();
        this.realmCache = null;
        this.sharedRealm = osSharedRealm;
        this.frozen = osSharedRealm.isFrozen();
        this.shouldCloseSharedRealm = false;
    }

    public static boolean compactRealm(RealmConfiguration realmConfiguration) {
        OsSharedRealm instance = OsSharedRealm.getInstance(realmConfiguration, OsSharedRealm.VersionID.LIVE);
        boolean compact = instance.compact();
        instance.close();
        return compact;
    }

    public static OsSharedRealm.MigrationCallback createMigrationCallback(final RealmMigration realmMigration) {
        return new OsSharedRealm.MigrationCallback() { // from class: io.realm.BaseRealm.6
            @Override // io.realm.internal.OsSharedRealm.MigrationCallback
            public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2) {
                realmMigration.migrate(DynamicRealm.createInstance(osSharedRealm), j, j2);
            }
        };
    }

    public static boolean deleteRealm(final RealmConfiguration realmConfiguration) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.callWithLock(realmConfiguration, new Runnable() { // from class: io.realm.BaseRealm.4
            @Override // java.lang.Runnable
            public void run() {
                atomicBoolean.set(Util.deleteRealm(realmConfiguration.getPath(), realmConfiguration.getRealmDirectory(), realmConfiguration.getRealmFileName()));
            }
        })) {
            return atomicBoolean.get();
        }
        StringBuilder sb = new StringBuilder("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: ");
        sb.append(realmConfiguration.getPath());
        throw new IllegalStateException(sb.toString());
    }

    public static void migrateRealm(final RealmConfiguration realmConfiguration, @Nullable final RealmMigration realmMigration) throws FileNotFoundException {
        if (realmConfiguration == null) {
            throw new IllegalArgumentException("RealmConfiguration must be provided");
        } else if (realmConfiguration.isSyncConfiguration()) {
            throw new IllegalArgumentException("Manual migrations are not supported for synced Realms");
        } else if (realmMigration == null && realmConfiguration.getMigration() == null) {
            throw new RealmMigrationNeededException(realmConfiguration.getPath(), "RealmMigration must be provided.");
        } else {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            RealmCache.invokeWithGlobalRefCount(realmConfiguration, new RealmCache.Callback() { // from class: io.realm.BaseRealm.5
                @Override // io.realm.RealmCache.Callback
                public void onResult(int i) {
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder("Cannot migrate a Realm file that is already open: ");
                        sb.append(realmConfiguration.getPath());
                        throw new IllegalStateException(sb.toString());
                    } else if (!new File(realmConfiguration.getPath()).exists()) {
                        atomicBoolean.set(true);
                    } else {
                        OsSchemaInfo osSchemaInfo = new OsSchemaInfo(realmConfiguration.getSchemaMediator().getExpectedObjectSchemaInfoMap().values());
                        RealmMigration realmMigration2 = realmMigration;
                        RealmMigration realmMigration3 = realmMigration2;
                        if (realmMigration2 == null) {
                            realmMigration3 = realmConfiguration.getMigration();
                        }
                        OsSharedRealm instance = OsSharedRealm.getInstance(new OsRealmConfig.Builder(realmConfiguration).autoUpdateNotification(false).schemaInfo(osSchemaInfo).migrationCallback(realmMigration3 != null ? BaseRealm.createMigrationCallback(realmMigration3) : null), OsSharedRealm.VersionID.LIVE);
                        if (instance != null) {
                            instance.close();
                        }
                    }
                }
            });
            if (atomicBoolean.get()) {
                StringBuilder sb = new StringBuilder("Cannot migrate a Realm file which doesn't exist: ");
                sb.append(realmConfiguration.getPath());
                throw new FileNotFoundException(sb.toString());
            }
        }
    }

    protected <T extends BaseRealm> void addListener(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener != null) {
            checkIfValid();
            this.sharedRealm.capabilities.checkCanDeliverNotification(LISTENER_NOT_ALLOWED_MESSAGE);
            if (!this.frozen) {
                this.sharedRealm.realmNotifier.addChangeListener(this, realmChangeListener);
                return;
            }
            throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public abstract Page6DTahapanXpresiSFragment_ViewBinding asFlowable();

    public void beginTransaction() {
        checkIfValid();
        this.sharedRealm.beginTransaction();
    }

    public void cancelTransaction() {
        checkIfValid();
        this.sharedRealm.cancelTransaction();
    }

    public void checkAllowQueriesOnUiThread() {
        if (getSharedRealm().capabilities.isMainThread() && !getConfiguration().isAllowQueriesOnUiThread()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    protected void checkAllowWritesOnUiThread() {
        if (getSharedRealm().capabilities.isMainThread() && !getConfiguration().isAllowWritesOnUiThread()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }

    protected void checkIfInTransaction() {
        if (!this.sharedRealm.isInTransaction()) {
            throw new IllegalStateException(NOT_IN_TRANSACTION_MESSAGE);
        }
    }

    public void checkIfValid() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException(CLOSED_REALM_MESSAGE);
        } else if (!this.frozen && this.threadId != Thread.currentThread().getId()) {
            throw new IllegalStateException(INCORRECT_THREAD_MESSAGE);
        }
    }

    public void checkIfValidAndInTransaction() {
        if (!isInTransaction()) {
            throw new IllegalStateException(NOT_IN_TRANSACTION_MESSAGE);
        }
    }

    public void checkNotInSync() {
        if (this.configuration.isSyncConfiguration()) {
            throw new UnsupportedOperationException("You cannot perform destructive changes to a schema of a synced Realm");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.frozen || this.threadId == Thread.currentThread().getId()) {
            RealmCache realmCache = this.realmCache;
            if (realmCache != null) {
                realmCache.release(this);
            } else {
                doClose();
            }
        } else {
            throw new IllegalStateException(INCORRECT_THREAD_CLOSE_MESSAGE);
        }
    }

    public void commitTransaction() {
        checkIfValid();
        this.sharedRealm.commitTransaction();
    }

    public void deleteAll() {
        checkIfValid();
        for (RealmObjectSchema realmObjectSchema : getSchema().getAll()) {
            getSchema().getTable(realmObjectSchema.getClassName()).clear();
        }
    }

    public void doClose() {
        this.realmCache = null;
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && this.shouldCloseSharedRealm) {
            osSharedRealm.close();
            this.sharedRealm = null;
        }
    }

    @Override // java.lang.Object
    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.shouldCloseSharedRealm && (osSharedRealm = this.sharedRealm) != null && !osSharedRealm.isClosed()) {
            RealmLog.warn("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.configuration.getPath());
            RealmCache realmCache = this.realmCache;
            if (realmCache != null) {
                realmCache.leak();
            }
        }
        finalize();
    }

    public abstract BaseRealm freeze();

    public <E extends RealmModel> E get(Class<E> cls, long j, boolean z, List<String> list) {
        return (E) this.configuration.getSchemaMediator().newInstance(cls, this, getSchema().getTable(cls).getUncheckedRow(j), getSchema().getColumnInfo(cls), z, list);
    }

    public <E extends RealmModel> E get(@Nullable Class<E> cls, @Nullable String str, long j) {
        DynamicRealmObject dynamicRealmObject;
        boolean z = str != null;
        Table table = z ? getSchema().getTable(str) : getSchema().getTable(cls);
        if (z) {
            dynamicRealmObject = new DynamicRealmObject(this, j != -1 ? table.getCheckedRow(j) : InvalidRow.INSTANCE);
        } else {
            dynamicRealmObject = (E) this.configuration.getSchemaMediator().newInstance(cls, this, j != -1 ? table.getUncheckedRow(j) : InvalidRow.INSTANCE, getSchema().getColumnInfo(cls), false, Collections.emptyList());
        }
        return dynamicRealmObject;
    }

    public <E extends RealmModel> E get(@Nullable Class<E> cls, @Nullable String str, UncheckedRow uncheckedRow) {
        return str != null ? new DynamicRealmObject(this, CheckedRow.getFromRow(uncheckedRow)) : (E) this.configuration.getSchemaMediator().newInstance(cls, this, uncheckedRow, getSchema().getColumnInfo(cls), false, Collections.emptyList());
    }

    public RealmConfiguration getConfiguration() {
        return this.configuration;
    }

    Row getEmbeddedObjectRow(String str, RealmObjectProxy realmObjectProxy, String str2, RealmSchema realmSchema, RealmObjectSchema realmObjectSchema) {
        long columnKey = realmObjectSchema.getColumnKey(str2);
        RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
        Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
        if (realmObjectSchema.isPropertyAcceptableForEmbeddedObject(realmObjectSchema.getFieldType(str2))) {
            String propertyClassName = realmObjectSchema.getPropertyClassName(str2);
            if (propertyClassName.equals(str)) {
                return realmSchema.getTable(str).getCheckedRow(row$realm.createEmbeddedObject(columnKey, fieldType));
            }
            throw new IllegalArgumentException(String.format("Parent type %s expects that property '%s' be of type %s but was %s.", realmObjectSchema.getClassName(), str2, propertyClassName, str));
        }
        throw new IllegalArgumentException(String.format("Field '%s' does not contain a valid link", str2));
    }

    public long getNumberOfActiveVersions() {
        checkIfValid();
        return getSharedRealm().getNumberOfVersions();
    }

    public String getPath() {
        return this.configuration.getPath();
    }

    public abstract RealmSchema getSchema();

    public OsSharedRealm getSharedRealm() {
        return this.sharedRealm;
    }

    public long getVersion() {
        return OsObjectStore.getSchemaVersion(this.sharedRealm);
    }

    public boolean isAutoRefresh() {
        return this.sharedRealm.isAutoRefresh();
    }

    public boolean isClosed() {
        if (this.frozen || this.threadId == Thread.currentThread().getId()) {
            OsSharedRealm osSharedRealm = this.sharedRealm;
            return osSharedRealm == null || osSharedRealm.isClosed();
        }
        throw new IllegalStateException(INCORRECT_THREAD_MESSAGE);
    }

    public abstract boolean isEmpty();

    public boolean isFrozen() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.frozen;
        }
        throw new IllegalStateException(CLOSED_REALM_MESSAGE);
    }

    public boolean isInTransaction() {
        checkIfValid();
        return this.sharedRealm.isInTransaction();
    }

    public void refresh() {
        checkIfValid();
        checkAllowQueriesOnUiThread();
        if (!isInTransaction()) {
            this.sharedRealm.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    protected void removeAllListeners() {
        if (isClosed()) {
            RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.configuration.getPath());
        }
        this.sharedRealm.realmNotifier.removeChangeListeners(this);
    }

    protected <T extends BaseRealm> void removeListener(RealmChangeListener<T> realmChangeListener) {
        if (realmChangeListener != null) {
            if (isClosed()) {
                RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.configuration.getPath());
            }
            this.sharedRealm.realmNotifier.removeChangeListener(this, realmChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void setAutoRefresh(boolean z) {
        checkIfValid();
        this.sharedRealm.setAutoRefresh(z);
    }

    @Deprecated
    public void stopWaitForChange() {
        RealmCache realmCache = this.realmCache;
        if (realmCache != null) {
            realmCache.invokeWithLock(new RealmCache.Callback0() { // from class: io.realm.BaseRealm.3
                @Override // io.realm.RealmCache.Callback0
                public void onCall() {
                    if (BaseRealm.this.sharedRealm == null || BaseRealm.this.sharedRealm.isClosed()) {
                        throw new IllegalStateException(BaseRealm.CLOSED_REALM_MESSAGE);
                    }
                    BaseRealm.this.sharedRealm.stopWaitForChange();
                }
            });
            return;
        }
        throw new IllegalStateException(CLOSED_REALM_MESSAGE);
    }

    @Deprecated
    public boolean waitForChange() {
        checkIfValid();
        if (isInTransaction()) {
            throw new IllegalStateException("Cannot wait for changes inside of a transaction.");
        } else if (Looper.myLooper() == null) {
            boolean waitForChange = this.sharedRealm.waitForChange();
            if (waitForChange) {
                this.sharedRealm.refresh();
            }
            return waitForChange;
        } else {
            throw new IllegalStateException("Cannot wait for changes inside a Looper thread. Use RealmChangeListeners instead.");
        }
    }

    public void writeCopyTo(File file) {
        if (file != null) {
            checkIfValid();
            this.sharedRealm.writeCopy(file, null);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }

    public void writeEncryptedCopyTo(File file, byte[] bArr) {
        if (file != null) {
            checkIfValid();
            this.sharedRealm.writeCopy(file, bArr);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }
}
