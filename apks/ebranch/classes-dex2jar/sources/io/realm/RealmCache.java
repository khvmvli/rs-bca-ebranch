package io.realm;

import io.realm.BaseRealm;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Util;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.internal.android.AndroidRealmNotifier;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.internal.util.Pair;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/RealmCache.class */
public final class RealmCache {
    private static final String ASYNC_CALLBACK_NULL_MSG = "The callback cannot be null.";
    private static final String ASYNC_NOT_ALLOWED_MSG = "Realm instances cannot be loaded asynchronously on a non-looper thread.";
    private static final String DIFFERENT_KEY_MESSAGE = "Wrong key used to decrypt Realm.";
    private static final String WRONG_REALM_CLASS_MESSAGE = "The type of Realm class must be Realm or DynamicRealm.";
    private static final List<WeakReference<RealmCache>> cachesList = new ArrayList();
    private static final Collection<RealmCache> leakedCaches = new ConcurrentLinkedQueue();
    private RealmConfiguration configuration;
    private final String realmPath;
    private final Map<Pair<RealmCacheType, OsSharedRealm.VersionID>, ReferenceCounter> refAndCountMap = new HashMap();
    private final AtomicBoolean isLeaked = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$Callback.class */
    public interface Callback {
        void onResult(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$Callback0.class */
    public interface Callback0 {
        void onCall();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$CreateRealmRunnable.class */
    public static class CreateRealmRunnable<T extends BaseRealm> implements Runnable {
        private final BaseRealm.InstanceCallback<T> callback;
        private final CountDownLatch canReleaseBackgroundInstanceLatch = new CountDownLatch(1);
        private final RealmConfiguration configuration;
        private Future future;
        private final RealmNotifier notifier;
        private final Class<T> realmClass;

        CreateRealmRunnable(RealmNotifier realmNotifier, RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback<T> instanceCallback, Class<T> cls) {
            this.configuration = realmConfiguration;
            this.realmClass = cls;
            this.callback = instanceCallback;
            this.notifier = realmNotifier;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 8, insn: 0x00cd: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:51:0x00cd
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
            // Method dump skipped, instructions count: 215
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmCache.CreateRealmRunnable.run():void");
        }

        public void setFuture(Future future) {
            this.future = future;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$GlobalReferenceCounter.class */
    public static class GlobalReferenceCounter extends ReferenceCounter {
        private BaseRealm cachedRealm;

        private GlobalReferenceCounter() {
            super();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void clearThreadLocalCache() {
            String path = this.cachedRealm.getPath();
            this.localCount.set(null);
            this.cachedRealm = null;
            if (this.globalCount.decrementAndGet() < 0) {
                StringBuilder sb = new StringBuilder("Global reference counter of Realm");
                sb.append(path);
                sb.append(" not be negative.");
                throw new IllegalStateException(sb.toString());
            }
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        BaseRealm getRealmInstance() {
            return this.cachedRealm;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        int getThreadLocalCount() {
            return this.globalCount.get();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        boolean hasInstanceAvailableForThread() {
            return this.cachedRealm != null;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        void onRealmCreated(BaseRealm baseRealm) {
            this.cachedRealm = baseRealm;
            this.localCount.set(0);
            this.globalCount.incrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$RealmCacheType.class */
    public enum RealmCacheType {
        TYPED_REALM,
        DYNAMIC_REALM;

        static RealmCacheType valueOf(Class<? extends BaseRealm> cls) {
            if (cls == Realm.class) {
                return TYPED_REALM;
            }
            if (cls == DynamicRealm.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException(RealmCache.WRONG_REALM_CLASS_MESSAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$ReferenceCounter.class */
    public static abstract class ReferenceCounter {
        protected AtomicInteger globalCount;
        protected final ThreadLocal<Integer> localCount;

        private ReferenceCounter() {
            this.localCount = new ThreadLocal<>();
            this.globalCount = new AtomicInteger(0);
        }

        abstract void clearThreadLocalCache();

        public int getGlobalCount() {
            return this.globalCount.get();
        }

        abstract BaseRealm getRealmInstance();

        abstract int getThreadLocalCount();

        abstract boolean hasInstanceAvailableForThread();

        public void incrementThreadCount(int i) {
            Integer num = this.localCount.get();
            ThreadLocal<Integer> threadLocal = this.localCount;
            int i2 = i;
            if (num != null) {
                i2 = i + num.intValue();
            }
            threadLocal.set(Integer.valueOf(i2));
        }

        abstract void onRealmCreated(BaseRealm baseRealm);

        public void setThreadCount(int i) {
            this.localCount.set(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/RealmCache$ThreadConfinedReferenceCounter.class */
    public static class ThreadConfinedReferenceCounter extends ReferenceCounter {
        private final ThreadLocal<BaseRealm> localRealm;

        private ThreadConfinedReferenceCounter() {
            super();
            this.localRealm = new ThreadLocal<>();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void clearThreadLocalCache() {
            String path = this.localRealm.get().getPath();
            this.localCount.set(null);
            this.localRealm.set(null);
            if (this.globalCount.decrementAndGet() < 0) {
                StringBuilder sb = new StringBuilder("Global reference counter of Realm");
                sb.append(path);
                sb.append(" can not be negative.");
                throw new IllegalStateException(sb.toString());
            }
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public BaseRealm getRealmInstance() {
            return this.localRealm.get();
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public int getThreadLocalCount() {
            Integer num = (Integer) this.localCount.get();
            return num != null ? num.intValue() : 0;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public boolean hasInstanceAvailableForThread() {
            return this.localRealm.get() != null;
        }

        @Override // io.realm.RealmCache.ReferenceCounter
        public void onRealmCreated(BaseRealm baseRealm) {
            this.localRealm.set(baseRealm);
            this.localCount.set(0);
            this.globalCount.incrementAndGet();
        }
    }

    private RealmCache(String str) {
        this.realmPath = str;
    }

    private static void copyAssetFileIfNeeded(final RealmConfiguration realmConfiguration) {
        final File file = realmConfiguration.hasAssetFile() ? new File(realmConfiguration.getRealmDirectory(), realmConfiguration.getRealmFileName()) : null;
        final String syncServerCertificateAssetName = ObjectServerFacade.getFacade(realmConfiguration.isSyncConfiguration()).getSyncServerCertificateAssetName(realmConfiguration);
        final boolean z = !Util.isEmptyString(syncServerCertificateAssetName);
        if (file != null || z) {
            OsObjectStore.callWithLock(realmConfiguration, new Runnable() { // from class: io.realm.RealmCache.1
                @Override // java.lang.Runnable
                public void run() {
                    if (file != null) {
                        RealmCache.copyFileIfNeeded(realmConfiguration.getAssetFilePath(), file);
                    }
                    if (z) {
                        RealmCache.copyFileIfNeeded(syncServerCertificateAssetName, new File(ObjectServerFacade.getFacade(realmConfiguration.isSyncConfiguration()).getSyncServerCertificateFilePath(realmConfiguration)));
                    }
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 12, insn: 0x0180: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:77:0x0180
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static void copyFileIfNeeded(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 12, insn: 0x0180: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:77:0x0180
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private <E extends BaseRealm> void createInstance(Class<E> cls, ReferenceCounter referenceCounter, OsSharedRealm.VersionID versionID) {
        BaseRealm baseRealm;
        if (cls == Realm.class) {
            baseRealm = Realm.createInstance(this, versionID);
            baseRealm.getSchema().createKeyPathMapping();
        } else if (cls == DynamicRealm.class) {
            baseRealm = DynamicRealm.createInstance(this, versionID);
        } else {
            throw new IllegalArgumentException(WRONG_REALM_CLASS_MESSAGE);
        }
        referenceCounter.onRealmCreated(baseRealm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends BaseRealm> E createRealmOrGetFromCache(RealmConfiguration realmConfiguration, Class<E> cls) {
        return (E) getCache(realmConfiguration.getPath(), true).doCreateRealmOrGetFromCache(realmConfiguration, cls, OsSharedRealm.VersionID.LIVE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E extends BaseRealm> E createRealmOrGetFromCache(RealmConfiguration realmConfiguration, Class<E> cls, OsSharedRealm.VersionID versionID) {
        return (E) getCache(realmConfiguration.getPath(), true).doCreateRealmOrGetFromCache(realmConfiguration, cls, versionID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends BaseRealm> RealmAsyncTask createRealmOrGetFromCacheAsync(RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback<T> instanceCallback, Class<T> cls) {
        return getCache(realmConfiguration.getPath(), true).doCreateRealmOrGetFromCacheAsync(realmConfiguration, instanceCallback, cls);
    }

    private <E extends BaseRealm> E doCreateRealmOrGetFromCache(RealmConfiguration realmConfiguration, Class<E> cls, OsSharedRealm.VersionID versionID) {
        E e;
        synchronized (this) {
            ReferenceCounter refCounter = getRefCounter(cls, versionID);
            if (getTotalGlobalRefCount() == 0) {
                copyAssetFileIfNeeded(realmConfiguration);
                boolean realmExists = realmConfiguration.realmExists();
                if (realmConfiguration.isSyncConfiguration() && (!realmExists)) {
                    ObjectServerFacade.getSyncFacadeIfPossible().wrapObjectStoreSessionIfRequired(new OsRealmConfig.Builder(realmConfiguration).build());
                    ObjectServerFacade.getSyncFacadeIfPossible().downloadInitialRemoteChanges(realmConfiguration);
                }
                this.configuration = realmConfiguration;
            } else {
                validateConfiguration(realmConfiguration);
            }
            if (!refCounter.hasInstanceAvailableForThread()) {
                createInstance(cls, refCounter, versionID);
            }
            refCounter.incrementThreadCount(1);
            e = (E) refCounter.getRealmInstance();
        }
        return e;
    }

    private <T extends BaseRealm> RealmAsyncTask doCreateRealmOrGetFromCacheAsync(RealmConfiguration realmConfiguration, BaseRealm.InstanceCallback<T> instanceCallback, Class<T> cls) {
        RealmAsyncTaskImpl realmAsyncTaskImpl;
        synchronized (this) {
            AndroidCapabilities androidCapabilities = new AndroidCapabilities();
            androidCapabilities.checkCanDeliverNotification(ASYNC_NOT_ALLOWED_MSG);
            if (instanceCallback != null) {
                CreateRealmRunnable createRealmRunnable = new CreateRealmRunnable(new AndroidRealmNotifier(null, androidCapabilities), realmConfiguration, instanceCallback, cls);
                Future<?> submitTransaction = BaseRealm.asyncTaskExecutor.submitTransaction(createRealmRunnable);
                createRealmRunnable.setFuture(submitTransaction);
                ObjectServerFacade.getSyncFacadeIfPossible().createNativeSyncSession(realmConfiguration);
                realmAsyncTaskImpl = new RealmAsyncTaskImpl(submitTransaction, BaseRealm.asyncTaskExecutor);
            } else {
                throw new IllegalArgumentException(ASYNC_CALLBACK_NULL_MSG);
            }
        }
        return realmAsyncTaskImpl;
    }

    private void doInvokeWithGlobalRefCount(Callback callback) {
        synchronized (this) {
            callback.onResult(getTotalGlobalRefCount());
        }
    }

    private static RealmCache getCache(String str, boolean z) {
        RealmCache realmCache;
        List<WeakReference<RealmCache>> list = cachesList;
        synchronized (list) {
            Iterator<WeakReference<RealmCache>> it = list.iterator();
            RealmCache realmCache2 = null;
            while (it.hasNext()) {
                RealmCache realmCache3 = it.next().get();
                if (realmCache3 == null) {
                    it.remove();
                } else if (realmCache3.realmPath.equals(str)) {
                    realmCache2 = realmCache3;
                }
            }
            realmCache = realmCache2;
            if (realmCache2 == null) {
                realmCache = realmCache2;
                if (z) {
                    realmCache = new RealmCache(str);
                    cachesList.add(new WeakReference<>(realmCache));
                }
            }
        }
        return realmCache;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getLocalThreadCount(RealmConfiguration realmConfiguration) {
        int i = 0;
        RealmCache cache = getCache(realmConfiguration.getPath(), false);
        if (cache == null) {
            return 0;
        }
        for (ReferenceCounter referenceCounter : cache.refAndCountMap.values()) {
            i += referenceCounter.getThreadLocalCount();
        }
        return i;
    }

    private <E extends BaseRealm> ReferenceCounter getRefCounter(Class<E> cls, OsSharedRealm.VersionID versionID) {
        Pair<RealmCacheType, OsSharedRealm.VersionID> pair = new Pair<>(RealmCacheType.valueOf(cls), versionID);
        ReferenceCounter referenceCounter = this.refAndCountMap.get(pair);
        ReferenceCounter referenceCounter2 = referenceCounter;
        if (referenceCounter == null) {
            referenceCounter2 = versionID.equals(OsSharedRealm.VersionID.LIVE) ? new ThreadConfinedReferenceCounter() : new GlobalReferenceCounter();
            this.refAndCountMap.put(pair, referenceCounter2);
        }
        return referenceCounter2;
    }

    private int getTotalGlobalRefCount() {
        int i = 0;
        for (ReferenceCounter referenceCounter : this.refAndCountMap.values()) {
            i += referenceCounter.getGlobalCount();
        }
        return i;
    }

    private int getTotalLiveRealmGlobalRefCount() {
        int i = 0;
        for (ReferenceCounter referenceCounter : this.refAndCountMap.values()) {
            if (referenceCounter instanceof ThreadConfinedReferenceCounter) {
                i += referenceCounter.getGlobalCount();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void invokeWithGlobalRefCount(RealmConfiguration realmConfiguration, Callback callback) {
        synchronized (cachesList) {
            RealmCache cache = getCache(realmConfiguration.getPath(), false);
            if (cache == null) {
                callback.onResult(0);
            } else {
                cache.doInvokeWithGlobalRefCount(callback);
            }
        }
    }

    private void validateConfiguration(RealmConfiguration realmConfiguration) {
        if (!this.configuration.equals(realmConfiguration)) {
            if (Arrays.equals(this.configuration.getEncryptionKey(), realmConfiguration.getEncryptionKey())) {
                RealmMigration migration = realmConfiguration.getMigration();
                RealmMigration migration2 = this.configuration.getMigration();
                if (migration2 == null || migration == null || !migration2.getClass().equals(migration.getClass()) || migration.equals(migration2)) {
                    StringBuilder sb = new StringBuilder("Configurations cannot be different if used to open the same file. \nCached configuration: \n");
                    sb.append(this.configuration);
                    sb.append("\n\nNew configuration: \n");
                    sb.append(realmConfiguration);
                    throw new IllegalArgumentException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: ");
                sb2.append(realmConfiguration.getMigration().getClass().getCanonicalName());
                throw new IllegalArgumentException(sb2.toString());
            }
            throw new IllegalArgumentException(DIFFERENT_KEY_MESSAGE);
        }
    }

    public final RealmConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void invokeWithLock(Callback0 callback0) {
        synchronized (this) {
            callback0.onCall();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void leak() {
        if (!this.isLeaked.getAndSet(true)) {
            leakedCaches.add(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void release(BaseRealm baseRealm) {
        BaseRealm realmInstance;
        synchronized (this) {
            String path = baseRealm.getPath();
            ReferenceCounter refCounter = getRefCounter(baseRealm.getClass(), baseRealm.isFrozen() ? baseRealm.sharedRealm.getVersionID() : OsSharedRealm.VersionID.LIVE);
            int threadLocalCount = refCounter.getThreadLocalCount();
            if (threadLocalCount <= 0) {
                RealmLog.warn("%s has been closed already. refCount is %s", path, Integer.valueOf(threadLocalCount));
                return;
            }
            int i = threadLocalCount - 1;
            if (i == 0) {
                refCounter.clearThreadLocalCache();
                baseRealm.doClose();
                if (getTotalLiveRealmGlobalRefCount() == 0) {
                    this.configuration = null;
                    for (ReferenceCounter referenceCounter : this.refAndCountMap.values()) {
                        if ((referenceCounter instanceof GlobalReferenceCounter) && (realmInstance = referenceCounter.getRealmInstance()) != null) {
                            while (!realmInstance.isClosed()) {
                                realmInstance.close();
                            }
                        }
                    }
                    ObjectServerFacade.getFacade(baseRealm.getConfiguration().isSyncConfiguration()).realmClosed(baseRealm.getConfiguration());
                }
            } else {
                refCounter.setThreadCount(i);
            }
        }
    }
}
