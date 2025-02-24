package io.realm;

import io.realm.BaseRealm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.log.RealmLog;
import java.io.File;
import java.util.Locale;
import javax.annotation.Nullable;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:io/realm/DynamicRealm.class */
public class DynamicRealm extends BaseRealm {
    private final RealmSchema schema = new MutableRealmSchema(this);

    /* loaded from: classes-dex2jar.jar:io/realm/DynamicRealm$Callback.class */
    public static abstract class Callback extends BaseRealm.InstanceCallback<DynamicRealm> {
        @Override // io.realm.BaseRealm.InstanceCallback
        public void onError(Throwable th) {
            onError(th);
        }

        public abstract void onSuccess(DynamicRealm dynamicRealm);
    }

    /* loaded from: classes-dex2jar.jar:io/realm/DynamicRealm$Transaction.class */
    public interface Transaction {

        /* loaded from: classes-dex2jar.jar:io/realm/DynamicRealm$Transaction$OnError.class */
        public interface OnError {
            void onError(Throwable th);
        }

        /* loaded from: classes-dex2jar.jar:io/realm/DynamicRealm$Transaction$OnSuccess.class */
        public interface OnSuccess {
            void onSuccess();
        }

        void execute(DynamicRealm dynamicRealm);
    }

    private DynamicRealm(final RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, (OsSchemaInfo) null, versionID);
        RealmCache.invokeWithGlobalRefCount(realmCache.getConfiguration(), new RealmCache.Callback() { // from class: io.realm.DynamicRealm.1
            @Override // io.realm.RealmCache.Callback
            public void onResult(int i) {
                if (i <= 0 && !realmCache.getConfiguration().isReadOnly() && OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) == -1) {
                    DynamicRealm.this.sharedRealm.beginTransaction();
                    if (OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) == -1) {
                        OsObjectStore.setSchemaVersion(DynamicRealm.this.sharedRealm, -1);
                    }
                    DynamicRealm.this.sharedRealm.commitTransaction();
                }
            }
        });
    }

    private DynamicRealm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
    }

    public static DynamicRealm createInstance(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new DynamicRealm(realmCache, versionID);
    }

    public static DynamicRealm createInstance(OsSharedRealm osSharedRealm) {
        return new DynamicRealm(osSharedRealm);
    }

    public static DynamicRealm getInstance(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (DynamicRealm) RealmCache.createRealmOrGetFromCache(realmConfiguration, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static RealmAsyncTask getInstanceAsync(RealmConfiguration realmConfiguration, Callback callback) {
        if (realmConfiguration != null) {
            return RealmCache.createRealmOrGetFromCacheAsync(realmConfiguration, callback, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public void addChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        addListener(realmChangeListener);
    }

    @Override // io.realm.BaseRealm
    public Page6DTahapanXpresiSFragment_ViewBinding<DynamicRealm> asFlowable() {
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

    public DynamicRealmObject createEmbeddedObject(String str, DynamicRealmObject dynamicRealmObject, String str2) {
        checkIfValid();
        Util.checkNull(dynamicRealmObject, "parentObject");
        Util.checkEmpty(str2, "parentProperty");
        if (!RealmObject.isManaged(dynamicRealmObject) || !RealmObject.isValid(dynamicRealmObject)) {
            throw new IllegalArgumentException("Only valid, managed objects can be a parent to an embedded object.");
        }
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, str);
        if (primaryKeyForObject == null) {
            String type = dynamicRealmObject.getType();
            RealmObjectSchema realmObjectSchema = this.schema.get(type);
            if (realmObjectSchema != null) {
                return new DynamicRealmObject(this, getEmbeddedObjectRow(str, dynamicRealmObject, str2, this.schema, realmObjectSchema));
            }
            throw new IllegalStateException(String.format("No schema found for '%s'.", type));
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', embedded objects cannot have primary keys.", str, primaryKeyForObject));
    }

    public DynamicRealmObject createObject(String str) {
        checkIfValid();
        Table table = this.schema.getTable(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, str);
        if (primaryKeyForObject == null) {
            return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.create(table)));
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', use  'createObject(String, Object)' instead.", str, primaryKeyForObject));
    }

    public DynamicRealmObject createObject(String str, Object obj) {
        return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.createWithPrimaryKey(this.schema.getTable(str), obj)));
    }

    public void delete(String str) {
        checkIfValid();
        checkIfInTransaction();
        this.schema.getTable(str).clear();
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void deleteAll() {
        deleteAll();
    }

    public void executeTransaction(Transaction transaction) {
        if (transaction != null) {
            checkAllowWritesOnUiThread();
            beginTransaction();
            try {
                transaction.execute(this);
                commitTransaction();
            } catch (RuntimeException e) {
                if (isInTransaction()) {
                    cancelTransaction();
                } else {
                    RealmLog.warn("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw e;
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
            return new RealmAsyncTaskImpl(asyncTaskExecutor.submitTransaction(new Runnable() { // from class: io.realm.DynamicRealm.2
                @Override // java.lang.Runnable
                public void run() {
                    OsSharedRealm.VersionID versionID;
                    if (!Thread.currentThread().isInterrupted()) {
                        DynamicRealm instance = DynamicRealm.getInstance(configuration);
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
    public DynamicRealm freeze() {
        OsSharedRealm.VersionID versionID;
        try {
            versionID = this.sharedRealm.getVersionID();
        } catch (IllegalStateException e) {
            getVersion();
            versionID = this.sharedRealm.getVersionID();
        }
        return (DynamicRealm) RealmCache.createRealmOrGetFromCache(this.configuration, DynamicRealm.class, versionID);
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

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ long getVersion() {
        return getVersion();
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
        return this.sharedRealm.isEmpty();
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

    public void removeChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        removeListener(realmChangeListener);
    }

    @Override // io.realm.BaseRealm
    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean z) {
        setAutoRefresh(z);
    }

    void setVersion(long j) {
        OsObjectStore.setSchemaVersion(this.sharedRealm, j);
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

    public RealmQuery<DynamicRealmObject> where(String str) {
        checkIfValid();
        if (this.sharedRealm.hasTable(Table.getTableNameForClass(str))) {
            return RealmQuery.createDynamicQuery(this, str);
        }
        StringBuilder sb = new StringBuilder("Class does not exist in the Realm and cannot be queried: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
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
