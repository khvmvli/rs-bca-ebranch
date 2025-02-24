package o;

import android.text.TextUtils;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/getCode.class */
public final class getCode<T> {
    private static final read<Object> c = new read<Object>() { // from class: o.getCode.5
        @Override // o.getCode.read
        public final void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    public final T a;
    final String b;
    final read<T> d;
    volatile byte[] e;

    /* loaded from: classes-dex2jar.jar:o/getCode$read.class */
    public interface read<T> {
        void c(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private getCode(String str, T t, read<T> read2) {
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
            this.a = t;
            if (read2 != null) {
                this.d = read2;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> getCode<T> b(String str) {
        return new getCode<>(str, null, c);
    }

    public static <T> getCode<T> c(String str, T t) {
        return new getCode<>(str, t, c);
    }

    public static <T> getCode<T> c(String str, T t, read<T> read2) {
        return new getCode<>(str, t, read2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getCode) {
            return this.b.equals(((getCode) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{key='");
        sb.append(this.b);
        sb.append("'}");
        return sb.toString();
    }
}
