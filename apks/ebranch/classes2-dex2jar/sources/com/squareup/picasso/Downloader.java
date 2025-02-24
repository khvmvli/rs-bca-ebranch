package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import o.CC28FormKartuKreditFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:com/squareup/picasso/Downloader.class */
public interface Downloader {

    /* loaded from: classes2-dex2jar.jar:com/squareup/picasso/Downloader$ResponseException.class */
    public static class ResponseException extends IOException {
        public final int a;
        public final boolean d;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.d = CC28FormKartuKreditFragment_ViewBinding.a(i);
            this.a = i2;
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/squareup/picasso/Downloader$read.class */
    public static final class read {
        public final long a;
        public final Bitmap b;
        public final boolean d;
        public final InputStream e;

        public read(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.e = inputStream;
                this.b = null;
                this.d = z;
                this.a = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }

    read c(Uri uri, int i) throws IOException;
}
