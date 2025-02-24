package com.google.firebase.installations;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.BahasaLayananDialog;
import o.TanggalDialog_ViewBinding;
import o.TapresDialog;
import o.Tarikan100JutaGuestDialog;
import o.clickedClose;
import o.setJatuhTempo;
import o.setJenisWarkat;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/installations/FirebaseInstallations.class */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG;
    private static final String APP_ID_VALIDATION_MSG;
    private static final String AUTH_ERROR_MSG;
    private static final String CHIME_FIREBASE_APP_NAME;
    private static final int CORE_POOL_SIZE;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS;
    private static final String LOCKFILE_NAME_GENERATE_FID;
    private static final int MAXIMUM_POOL_SIZE;
    private static final String PROJECT_ID_VALIDATION_MSG;
    private final ExecutorService backgroundExecutor;
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    private Set<FidListener> fidListeners;
    private final FirebaseApp firebaseApp;
    private final IidStore iidStore;
    private final List<clickedClose> listeners;
    private final Object lock;
    private final ExecutorService networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;
    private static final Object lockGenerateFid = new Object();
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.4
        private final AtomicInteger e = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.e.getAndIncrement())));
        }
    };

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2 */
    /* loaded from: classes2-dex2jar.jar:com/google/firebase/installations/FirebaseInstallations$2.class */
    public static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            a = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            b = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2) {
        this(new ThreadPoolExecutor(0, 1, (long) KEEP_ALIVE_TIME_IN_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY), firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider, provider2), new PersistedInstallation(firebaseApp), Utils.getInstance(), new IidStore(firebaseApp), new RandomFidGenerator());
    }

    FirebaseInstallations(ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, IidStore iidStore, RandomFidGenerator randomFidGenerator) {
        this.lock = new Object();
        this.fidListeners = new HashSet();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = iidStore;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = new ThreadPoolExecutor(0, 1, (long) KEEP_ALIVE_TIME_IN_SECONDS, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY);
    }

    private setJatuhTempo<InstallationTokenResult> addGetAuthTokenListener() {
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        addStateListeners(new TapresDialog(this.utils, setjeniswarkat));
        return setjeniswarkat.c;
    }

    private setJatuhTempo<String> addGetIdListener() {
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        addStateListeners(new Tarikan100JutaGuestDialog(setjeniswarkat));
        return setjeniswarkat.c;
    }

    private void addStateListeners(clickedClose clickedclose) {
        synchronized (this.lock) {
            this.listeners.add(clickedclose);
        }
    }

    public Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
        updateCacheFid(null);
        PersistedInstallationEntry multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.serviceClient.deleteFirebaseInstallation(getApiKey(), multiProcessSafePrefs.getFirebaseInstallationId(), getProjectIdentifier(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* renamed from: doNetworkCallIfNecessary */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void m64x349c6181(boolean r6) {
        /*
            r5 = this;
            r0 = r5
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.getMultiProcessSafePrefs()
            r7 = r0
            r0 = r7
            boolean r0 = r0.isErrored()     // Catch: FirebaseInstallationsException -> 0x0083
            if (r0 != 0) goto L_0x0032
            r0 = r7
            boolean r0 = r0.isUnregistered()     // Catch: FirebaseInstallationsException -> 0x0083
            if (r0 == 0) goto L_0x0016
            goto L_0x0032
        L_0x0016:
            r0 = r6
            if (r0 != 0) goto L_0x0029
            r0 = r5
            com.google.firebase.installations.Utils r0 = r0.utils     // Catch: FirebaseInstallationsException -> 0x0083
            r1 = r7
            boolean r0 = r0.isAuthTokenExpired(r1)     // Catch: FirebaseInstallationsException -> 0x0083
            if (r0 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            r0 = r5
            r1 = r7
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.fetchAuthTokenFromServer(r1)     // Catch: FirebaseInstallationsException -> 0x0083
            r8 = r0
            goto L_0x0038
        L_0x0032:
            r0 = r5
            r1 = r7
            com.google.firebase.installations.local.PersistedInstallationEntry r0 = r0.registerFidWithServer(r1)     // Catch: FirebaseInstallationsException -> 0x0083
            r8 = r0
        L_0x0038:
            r0 = r5
            r1 = r8
            r0.insertOrUpdatePrefs(r1)
            r0 = r5
            r1 = r7
            r2 = r8
            r0.updateFidListener(r1, r2)
            r0 = r8
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto L_0x0052
            r0 = r5
            r1 = r8
            java.lang.String r1 = r1.getFirebaseInstallationId()
            r0.updateCacheFid(r1)
        L_0x0052:
            r0 = r8
            boolean r0 = r0.isErrored()
            if (r0 == 0) goto L_0x0068
            r0 = r5
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            r2 = r1
            com.google.firebase.installations.FirebaseInstallationsException$Status r3 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r2.<init>(r3)
            r0.triggerOnException(r1)
            return
        L_0x0068:
            r0 = r8
            boolean r0 = r0.isNotGenerated()
            if (r0 == 0) goto L_0x007d
            r0 = r5
            java.io.IOException r1 = new java.io.IOException
            r2 = r1
            java.lang.String r3 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r2.<init>(r3)
            r0.triggerOnException(r1)
            return
        L_0x007d:
            r0 = r5
            r1 = r8
            r0.triggerOnStateReached(r1)
            return
        L_0x0083:
            r8 = move-exception
            r0 = r5
            r1 = r8
            r0.triggerOnException(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.FirebaseInstallations.m64x349c6181(boolean):void");
    }

    /* renamed from: doRegistrationOrRefresh */
    public final void m66x4bb3eea9(boolean z) {
        PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        PersistedInstallationEntry persistedInstallationEntry = prefsWithGeneratedIdMultiProcessSafe;
        if (z) {
            persistedInstallationEntry = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(persistedInstallationEntry);
        this.networkExecutor.execute(new Runnable(z) { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda0
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m64x349c6181(this.f$1);
            }
        });
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult generateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i = AnonymousClass2.a[generateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withAuthToken(generateAuthToken.getToken(), generateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i == 3) {
            updateCacheFid(null);
            return persistedInstallationEntry.withNoGeneratedFid();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private String getCacheFid() {
        String str;
        synchronized (this) {
            str = this.cachedFid;
        }
        return str;
    }

    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp) {
        if (firebaseApp != null) {
            return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
        }
        throw new IllegalArgumentException("Null is not a valid value of FirebaseApp.");
    }

    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        PersistedInstallationEntry readPersistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            TanggalDialog_ViewBinding b = TanggalDialog_ViewBinding.b(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            if (b != null) {
                try {
                    b.a.release();
                    b.e.close();
                } catch (IOException e) {
                    Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                }
            }
        }
        return readPersistedInstallationEntryValue;
    }

    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        PersistedInstallationEntry persistedInstallationEntry;
        synchronized (lockGenerateFid) {
            TanggalDialog_ViewBinding b = TanggalDialog_ViewBinding.b(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            PersistedInstallationEntry readPersistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
            persistedInstallationEntry = readPersistedInstallationEntryValue;
            if (readPersistedInstallationEntryValue.isNotGenerated()) {
                persistedInstallationEntry = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(readPersistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(readPersistedInstallationEntryValue)));
            }
            if (b != null) {
                try {
                    b.a.release();
                    b.e.close();
                } catch (IOException e) {
                    Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                }
            }
        }
        return persistedInstallationEntry;
    }

    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            TanggalDialog_ViewBinding b = TanggalDialog_ViewBinding.b(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
            if (b != null) {
                try {
                    b.a.release();
                    b.e.close();
                } catch (IOException e) {
                    Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
                }
            }
        }
    }

    private void preConditionChecks() {
        if (TextUtils.isEmpty(getApplicationId())) {
            throw new IllegalArgumentException(APP_ID_VALIDATION_MSG);
        } else if (TextUtils.isEmpty(getProjectIdentifier())) {
            throw new IllegalArgumentException(PROJECT_ID_VALIDATION_MSG);
        } else if (TextUtils.isEmpty(getApiKey())) {
            throw new IllegalArgumentException(API_KEY_VALIDATION_MSG);
        } else if (!Utils.isValidAppIdFormat(getApplicationId())) {
            throw new IllegalArgumentException(APP_ID_VALIDATION_MSG);
        } else if (!Utils.isValidApiKeyFormat(getApiKey())) {
            throw new IllegalArgumentException(API_KEY_VALIDATION_MSG);
        }
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) && !this.firebaseApp.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.fidGenerator.createRandomFid();
        }
        String readIid = this.iidStore.readIid();
        String str = readIid;
        if (TextUtils.isEmpty(readIid)) {
            str = this.fidGenerator.createRandomFid();
        }
        return str;
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse createFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : this.iidStore.readToken());
        int i = AnonymousClass2.b[createFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withRegisteredFid(createFirebaseInstallation.getFid(), createFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), createFirebaseInstallation.getAuthToken().getToken(), createFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void triggerOnException(Exception exc) {
        synchronized (this.lock) {
            Iterator<clickedClose> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            Iterator<clickedClose> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().a(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    private void updateCacheFid(String str) {
        synchronized (this) {
            this.cachedFid = str;
        }
    }

    private void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        synchronized (this) {
            if (this.fidListeners.size() != 0 && !persistedInstallationEntry.getFirebaseInstallationId().equals(persistedInstallationEntry2.getFirebaseInstallationId())) {
                for (FidListener fidListener : this.fidListeners) {
                    fidListener.onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
                }
            }
        }
    }

    public setJatuhTempo<Void> delete() {
        return setLocalClearingCodeBank.c(this.backgroundExecutor, new Callable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseInstallations.this.deleteFirebaseInstallationId();
            }
        });
    }

    String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    public setJatuhTempo<String> getId() {
        preConditionChecks();
        String cacheFid = getCacheFid();
        if (cacheFid != null) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.e(cacheFid);
            return bahasaLayananDialog;
        }
        setJatuhTempo<String> addGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(new Runnable() { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m65x9bfaa81c();
            }
        });
        return addGetIdListener;
    }

    String getName() {
        return this.firebaseApp.getName();
    }

    String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    public setJatuhTempo<InstallationTokenResult> getToken(boolean z) {
        preConditionChecks();
        setJatuhTempo<InstallationTokenResult> addGetAuthTokenListener = addGetAuthTokenListener();
        this.backgroundExecutor.execute(new Runnable(z) { // from class: com.google.firebase.installations.FirebaseInstallations$$ExternalSyntheticLambda2
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInstallations.this.m66x4bb3eea9(this.f$1);
            }
        });
        return addGetAuthTokenListener;
    }

    /* renamed from: lambda$getId$0$com-google-firebase-installations-FirebaseInstallations */
    public /* synthetic */ void m65x9bfaa81c() {
        m66x4bb3eea9(false);
    }

    public FidListenerHandle registerFidListener(final FidListener fidListener) {
        AnonymousClass1 r0;
        synchronized (this) {
            this.fidListeners.add(fidListener);
            r0 = new FidListenerHandle() { // from class: com.google.firebase.installations.FirebaseInstallations.1
                @Override // com.google.firebase.installations.internal.FidListenerHandle
                public final void unregister() {
                    synchronized (FirebaseInstallations.this) {
                        FirebaseInstallations.this.fidListeners.remove(fidListener);
                    }
                }
            };
        }
        return r0;
    }
}
