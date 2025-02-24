package com.google.zxing;
/* loaded from: classes2-dex2jar.jar:com/google/zxing/NotFoundException.class */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException b;

    static {
        NotFoundException notFoundException = new NotFoundException();
        b = notFoundException;
        notFoundException.setStackTrace(c);
    }

    private NotFoundException() {
    }
}
