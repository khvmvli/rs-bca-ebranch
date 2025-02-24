package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.util.concurrent.Callable;
import o.ResetAccountSuccessDialog;
import o.ScreenshotSuccessDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$4.class */
final class CrashlyticsCore$4 implements Callable<Boolean> {
    final /* synthetic */ CrashlyticsCore a;

    CrashlyticsCore$4(CrashlyticsCore crashlyticsCore) {
        this.a = crashlyticsCore;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        ScreenshotSuccessDialog access$200 = CrashlyticsCore.access$200(this.a);
        ResetAccountSuccessDialog resetAccountSuccessDialog = access$200.g;
        boolean z = true;
        if (!new File(resetAccountSuccessDialog.c.getFilesDir(), resetAccountSuccessDialog.a).exists()) {
            String e = access$200.e();
            if (e == null || !access$200.i.hasCrashDataForSession(e)) {
                z = false;
            }
        } else {
            Logger.getLogger().v("Found previous crash marker.");
            ResetAccountSuccessDialog resetAccountSuccessDialog2 = access$200.g;
            new File(resetAccountSuccessDialog2.c.getFilesDir(), resetAccountSuccessDialog2.a).delete();
        }
        return Boolean.valueOf(z);
    }
}
