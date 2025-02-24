package io.realm.internal;

import io.realm.RealmConfiguration;
import io.realm.RealmFieldType;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/internal/OsSharedRealm.class */
public final class OsSharedRealm implements Closeable, NativeObject {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY;
    public static final byte FILE_EXCEPTION_KIND_EXISTS;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final Capabilities capabilities;
    public final NativeContext context;
    final List<WeakReference<OsResults.Iterator>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<PendingRow>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsSharedRealm$InitializationCallback.class */
    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsSharedRealm$MigrationCallback.class */
    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j, long j2);
    }

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsSharedRealm$SchemaChangedCallback.class */
    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsSharedRealm$VersionID.class */
    public static class VersionID implements Comparable<VersionID> {
        public static final VersionID LIVE = new VersionID(-1, -1);
        public final long index;
        public final long version;

        VersionID(long j, long j2) {
            this.version = j;
            this.index = j2;
        }

        public int compareTo(VersionID versionID) {
            if (versionID != null) {
                int i = (this.version > versionID.version ? 1 : (this.version == versionID.version ? 0 : -1));
                if (i > 0) {
                    return 1;
                }
                return i < 0 ? -1 : 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VersionID versionID = (VersionID) obj;
            if (!(this.version == versionID.version && this.index == versionID.index)) {
                z = false;
            }
            return z;
        }

        @Override // java.lang.Object
        public int hashCode() {
            long j = this.version;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.index;
            return (i * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder sb = new StringBuilder("VersionID{version=");
            sb.append(this.version);
            sb.append(", index=");
            sb.append(this.index);
            sb.append('}');
            return sb.toString();
        }
    }

    private OsSharedRealm(long j, OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j), this);
        NativeContext context = osRealmConfig.getContext();
        this.context = context;
        context.addReference(this);
        this.capabilities = new AndroidCapabilities();
        this.realmNotifier = null;
        boolean z = false;
        nativeSetAutoRefresh(j, false);
        Iterator<OsSharedRealm> it = sharedRealmsUnderConstruction.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OsSharedRealm next = it.next();
            if (next.context == osRealmConfig.getContext()) {
                next.tempSharedRealmsForCallback.add(this);
                z = true;
                break;
            }
        }
        if (!z) {
            throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig, VersionID versionID) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        AndroidCapabilities androidCapabilities = new AndroidCapabilities();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, androidCapabilities);
        NativeContext context = osRealmConfig.getContext();
        this.context = context;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), versionID.version, versionID.index, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            context.addReference(this);
            this.capabilities = androidCapabilities;
            this.realmNotifier = androidRealmNotifier;
            if (versionID.equals(VersionID.LIVE)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, androidCapabilities.canDeliverNotification());
            }
        } catch (Throwable th) {
            try {
                for (OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                this.tempSharedRealmsForCallback.clear();
                sharedRealmsUnderConstruction.remove(this);
                throw th2;
            }
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.Iterator> weakReference : this.iterators) {
            OsResults.Iterator iterator = weakReference.get();
            if (iterator != null) {
                iterator.detach();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<PendingRow> weakReference : this.pendingRows) {
            PendingRow pendingRow = weakReference.get();
            if (pendingRow != null) {
                pendingRow.executeQuery();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(RealmConfiguration realmConfiguration, VersionID versionID) {
        return getInstance(new OsRealmConfig.Builder(realmConfiguration), versionID);
    }

    public static OsSharedRealm getInstance(OsRealmConfig.Builder builder, VersionID versionID) {
        OsRealmConfig build = builder.build();
        ObjectServerFacade.getSyncFacadeIfPossible().wrapObjectStoreSessionIfRequired(build);
        return new OsSharedRealm(build, versionID);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory == null) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() || file.mkdirs() || file.isDirectory()) {
                String str = absolutePath;
                if (!absolutePath.endsWith("/")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/");
                    str = sb.toString();
                }
                nativeInit(str);
                temporaryDirectory = file;
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to create temporary directory: ");
            sb2.append(absolutePath);
            throw new IOException(sb2.toString());
        }
    }

    private static native void nativeBeginTransaction(long j);

    private static native void nativeCancelTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    private static native void nativeCommitTransaction(long j);

    private static native boolean nativeCompact(long j);

    private static native long nativeCreateTable(long j, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j, String str, String str2, int i, boolean z);

    private static native long nativeFreeze(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, long j2, long j3, RealmNotifier realmNotifier);

    private static native long nativeGetTableRef(long j, String str);

    private static native String[] nativeGetTablesName(long j);

    private static native long[] nativeGetVersionID(long j);

    private static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j);

    private static native boolean nativeIsClosed(long j);

    private static native boolean nativeIsEmpty(long j);

    private static native boolean nativeIsFrozen(long j);

    private static native boolean nativeIsInTransaction(long j);

    private static native long nativeNumberOfVersions(long j);

    private static native void nativeRefresh(long j);

    private static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j, String str, String str2);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private static native long nativeSize(long j);

    private static native void nativeStopWaitForChange(long j);

    private static native boolean nativeWaitForChange(long j);

    private static native void nativeWriteCopy(long j, String str, @Nullable byte[] bArr);

    private static void runInitializationCallback(long j, OsRealmConfig osRealmConfig, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j, osRealmConfig));
    }

    private static void runMigrationCallback(long j, OsRealmConfig osRealmConfig, MigrationCallback migrationCallback, long j2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j, osRealmConfig), j2, osRealmConfig.getRealmConfiguration().getSchemaVersion());
    }

    public final void addIterator(OsResults.Iterator iterator) {
        this.iterators.add(new WeakReference<>(iterator));
    }

    public final void addPendingRow(PendingRow pendingRow) {
        this.pendingRows.add(new WeakReference<>(pendingRow));
    }

    public final void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public final void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public final void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public final boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public final Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public final Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z));
    }

    public final OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public final RealmConfiguration getConfiguration() {
        return this.osRealmConfig.getRealmConfiguration();
    }

    @Override // io.realm.internal.NativeObject
    public final long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public final long getNativePtr() {
        return this.nativePtr;
    }

    public final long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public final String getPath() {
        return this.osRealmConfig.getRealmConfiguration().getPath();
    }

    public final OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public final Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public final String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        String[] strArr = nativeGetTablesName;
        if (nativeGetTablesName == null) {
            strArr = new String[0];
        }
        return strArr;
    }

    public final VersionID getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new VersionID(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public final boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    public final void invalidateIterators() {
        for (WeakReference<OsResults.Iterator> weakReference : this.iterators) {
            OsResults.Iterator iterator = weakReference.get();
            if (iterator != null) {
                iterator.invalidate();
            }
        }
        this.iterators.clear();
    }

    public final boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public final boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public final boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public final boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public final boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public final boolean isSyncRealm() {
        return this.osRealmConfig.getResolvedRealmURI() != null;
    }

    public final void refresh() {
        if (!isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }

    public final void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    public final void removePendingRow(PendingRow pendingRow) {
        for (WeakReference<PendingRow> weakReference : this.pendingRows) {
            PendingRow pendingRow2 = weakReference.get();
            if (pendingRow2 == null || pendingRow2 == pendingRow) {
                this.pendingRows.remove(weakReference);
            }
        }
    }

    public final void renameTable(String str, String str2) {
        nativeRenameTable(this.nativePtr, str, str2);
    }

    public final void setAutoRefresh(boolean z) {
        this.capabilities.checkCanDeliverNotification(null);
        nativeSetAutoRefresh(this.nativePtr, z);
    }

    public final long size() {
        return nativeSize(this.nativePtr);
    }

    public final void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public final boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public final void writeCopy(File file, @Nullable byte[] bArr) {
        if (!file.isFile() || !file.exists()) {
            nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
            return;
        }
        throw new IllegalArgumentException("The destination file must not exist");
    }
}
