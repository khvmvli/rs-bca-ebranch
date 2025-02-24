package com.scottyab.rootbeer;

import com.scottyab.rootbeer.util.QLog;
/* loaded from: classes2-dex2jar.jar:com/scottyab/rootbeer/RootBeerNative.class */
public class RootBeerNative {
    private static boolean libraryLoaded = false;

    static {
        try {
            System.loadLibrary("b3ebd9");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            QLog.e(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}
