package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.BN3PilihCabangFragment;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/platforminfo/GlobalLibraryVersionRegistrar.class */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<BN3PilihCabangFragment> infos = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = INSTANCE;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = globalLibraryVersionRegistrar;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar3 = INSTANCE;
                    globalLibraryVersionRegistrar2 = globalLibraryVersionRegistrar3;
                    if (globalLibraryVersionRegistrar3 == null) {
                        globalLibraryVersionRegistrar2 = new GlobalLibraryVersionRegistrar();
                        INSTANCE = globalLibraryVersionRegistrar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return globalLibraryVersionRegistrar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<BN3PilihCabangFragment> getRegisteredVersions() {
        Set<BN3PilihCabangFragment> unmodifiableSet;
        synchronized (this.infos) {
            unmodifiableSet = Collections.unmodifiableSet(this.infos);
        }
        return unmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.infos) {
            this.infos.add(BN3PilihCabangFragment.c(str, str2));
        }
    }
}
