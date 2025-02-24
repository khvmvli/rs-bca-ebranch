package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$3.class */
final class CrashlyticsCore$3 implements Runnable {
    final /* synthetic */ SettingsDataProvider b;
    final /* synthetic */ CrashlyticsCore c;

    CrashlyticsCore$3(CrashlyticsCore crashlyticsCore, SettingsDataProvider settingsDataProvider) {
        this.c = crashlyticsCore;
        this.b = settingsDataProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CrashlyticsCore.access$000(this.c, this.b);
    }
}
