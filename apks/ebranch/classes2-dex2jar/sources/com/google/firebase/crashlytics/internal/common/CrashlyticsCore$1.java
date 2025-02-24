package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.util.concurrent.Callable;
import o.setJatuhTempo;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$1.class */
final class CrashlyticsCore$1 implements Callable<setJatuhTempo<Void>> {
    final /* synthetic */ CrashlyticsCore c;
    final /* synthetic */ SettingsDataProvider d;

    CrashlyticsCore$1(CrashlyticsCore crashlyticsCore, SettingsDataProvider settingsDataProvider) {
        this.c = crashlyticsCore;
        this.d = settingsDataProvider;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ setJatuhTempo<Void> call() throws Exception {
        return CrashlyticsCore.access$000(this.c, this.d);
    }
}
