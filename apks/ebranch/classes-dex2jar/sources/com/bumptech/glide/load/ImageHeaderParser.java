package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DetailTransactionResponse;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/ImageHeaderParser.class */
public interface ImageHeaderParser {

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/ImageHeaderParser$ImageType.class */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean b;

        ImageType(boolean z) {
            this.b = z;
        }

        public final boolean hasAlpha() {
            return this.b;
        }
    }

    int a(InputStream inputStream, DetailTransactionResponse detailTransactionResponse) throws IOException;

    ImageType a(ByteBuffer byteBuffer) throws IOException;

    ImageType c(InputStream inputStream) throws IOException;
}
