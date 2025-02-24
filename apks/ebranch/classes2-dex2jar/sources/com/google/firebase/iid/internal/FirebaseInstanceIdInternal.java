package com.google.firebase.iid.internal;

import java.io.IOException;
import o.setJatuhTempo;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/iid/internal/FirebaseInstanceIdInternal.class */
public interface FirebaseInstanceIdInternal {

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/iid/internal/FirebaseInstanceIdInternal$NewTokenListener.class */
    public interface NewTokenListener {
        void onNewToken(String str);
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    void deleteToken(String str, String str2) throws IOException;

    String getId();

    String getToken();

    setJatuhTempo<String> getTokenTask();
}
