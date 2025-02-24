package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.util.concurrent.Callable;
import o.ResetAccountSuccessDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$2.class */
final class CrashlyticsCore$2 implements Callable<Boolean> {
    final /* synthetic */ CrashlyticsCore d;

    CrashlyticsCore$2(CrashlyticsCore crashlyticsCore) {
        this.d = crashlyticsCore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Boolean call() throws Exception {
        try {
            ResetAccountSuccessDialog access$100 = CrashlyticsCore.access$100(this.d);
            boolean delete = new File(access$100.c.getFilesDir(), access$100.a).delete();
            if (!delete) {
                Logger.getLogger().w("Initialization marker file was not properly removed.");
            }
            return Boolean.valueOf(delete);
        } catch (Exception e) {
            Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e);
            return Boolean.FALSE;
        }
    }
}
