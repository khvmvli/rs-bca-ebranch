package org.parceler;
/* loaded from: classes2-dex2jar.jar:org/parceler/ParcelerRuntimeException.class */
public class ParcelerRuntimeException extends RuntimeException {
    public ParcelerRuntimeException(String str) {
        super(str);
    }

    public ParcelerRuntimeException(String str, Exception exc) {
        super(str, exc);
    }
}
