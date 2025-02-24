package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.BahasaLayananDialog;
import o.TapresDialog_ViewBinding;
import o.setJatuhTempo;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/heartbeatinfo/DefaultHeartBeatInfo.class */
public class DefaultHeartBeatInfo implements HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return DefaultHeartBeatInfo.lambda$static$0(runnable);
        }
    };
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private Provider<TapresDialog_ViewBinding> storageProvider;

    private DefaultHeartBeatInfo(Context context, Set<HeartBeatConsumer> set) {
        this(new Lazy(new Provider(context) { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$ExternalSyntheticLambda0
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r4;
            }

            public final Object get() {
                return TapresDialog_ViewBinding.c(this.f$0);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY));
    }

    DefaultHeartBeatInfo(Provider<TapresDialog_ViewBinding> provider, Set<HeartBeatConsumer> set, Executor executor) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
    }

    public static Component<HeartBeatInfo> component() {
        return Component.builder(HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.setOf(HeartBeatConsumer.class)).factory(new ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatInfo.lambda$component$4(componentContainer);
            }
        }).build();
    }

    public static /* synthetic */ HeartBeatInfo lambda$component$4(ComponentContainer componentContainer) {
        return new DefaultHeartBeatInfo((Context) componentContainer.get(Context.class), componentContainer.setOf(HeartBeatConsumer.class));
    }

    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public setJatuhTempo<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo() {
        return setLocalClearingCodeBank.c(this.backgroundExecutor, new Callable() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatInfo.this.m60xaf1d5f68();
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = ((TapresDialog_ViewBinding) this.storageProvider.get()).c(str, currentTimeMillis);
        boolean a = ((TapresDialog_ViewBinding) this.storageProvider.get()).a(currentTimeMillis);
        return (!c || !a) ? a ? HeartBeatInfo.HeartBeat.GLOBAL : c ? HeartBeatInfo.HeartBeat.SDK : HeartBeatInfo.HeartBeat.NONE : HeartBeatInfo.HeartBeat.COMBINED;
    }

    /* renamed from: lambda$getAndClearStoredHeartBeatInfo$2$com-google-firebase-heartbeatinfo-DefaultHeartBeatInfo */
    public /* synthetic */ List m60xaf1d5f68() throws Exception {
        ArrayList arrayList = new ArrayList();
        TapresDialog_ViewBinding tapresDialog_ViewBinding = (TapresDialog_ViewBinding) this.storageProvider.get();
        List<SdkHeartBeatResult> c = tapresDialog_ViewBinding.c(true);
        long b = tapresDialog_ViewBinding.b();
        for (SdkHeartBeatResult sdkHeartBeatResult : c) {
            boolean c2 = TapresDialog_ViewBinding.c(b, sdkHeartBeatResult.getMillis());
            HeartBeatInfo.HeartBeat heartBeat = c2 ? HeartBeatInfo.HeartBeat.COMBINED : HeartBeatInfo.HeartBeat.SDK;
            if (c2) {
                b = sdkHeartBeatResult.getMillis();
            }
            arrayList.add(HeartBeatResult.create(sdkHeartBeatResult.getSdkName(), sdkHeartBeatResult.getMillis(), heartBeat));
        }
        if (b > 0) {
            synchronized (tapresDialog_ViewBinding) {
                tapresDialog_ViewBinding.c.edit().putLong("fire-global", b).apply();
            }
        }
        return arrayList;
    }

    /* renamed from: lambda$storeHeartBeatInfo$3$com-google-firebase-heartbeatinfo-DefaultHeartBeatInfo */
    public /* synthetic */ Void m61x2740e339(String str) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        if (!((TapresDialog_ViewBinding) this.storageProvider.get()).c(str, currentTimeMillis)) {
            return null;
        }
        TapresDialog_ViewBinding tapresDialog_ViewBinding = (TapresDialog_ViewBinding) this.storageProvider.get();
        synchronized (tapresDialog_ViewBinding) {
            long j = tapresDialog_ViewBinding.c.getLong("fire-count", 0);
            tapresDialog_ViewBinding.b.edit().putString(String.valueOf(currentTimeMillis), str).apply();
            SharedPreferences.Editor edit = tapresDialog_ViewBinding.c.edit();
            long j2 = j + 1;
            edit.putLong("fire-count", j2).apply();
            if (j2 > 200) {
                tapresDialog_ViewBinding.d();
            }
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public setJatuhTempo<Void> storeHeartBeatInfo(String str) {
        if (this.consumers.size() > 0) {
            return setLocalClearingCodeBank.c(this.backgroundExecutor, new Callable(str) { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatInfo$$ExternalSyntheticLambda3
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r5;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return DefaultHeartBeatInfo.this.m61x2740e339(this.f$1);
                }
            });
        }
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        bahasaLayananDialog.e((Object) null);
        return bahasaLayananDialog;
    }
}
