package com.google.firebase.installations;

import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import o.setJatuhTempo;
/* loaded from: classes-dex2jar.jar:com/google/firebase/installations/FirebaseInstallationsApi.class */
public interface FirebaseInstallationsApi {
    setJatuhTempo<Void> delete();

    setJatuhTempo<String> getId();

    setJatuhTempo<InstallationTokenResult> getToken(boolean z);

    FidListenerHandle registerFidListener(FidListener fidListener);
}
