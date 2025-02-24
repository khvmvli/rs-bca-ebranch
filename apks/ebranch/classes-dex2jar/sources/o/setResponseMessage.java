package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/setResponseMessage.class */
public class setResponseMessage implements Serializable, Comparable<setResponseMessage> {
    static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final setResponseMessage c = new setResponseMessage((byte[]) new byte[0].clone());
    transient String a;
    final byte[] d;
    transient int e;

    public setResponseMessage(byte[] bArr) {
        this.d = bArr;
    }

    public static setResponseMessage a(String str) {
        if (str != null) {
            setResponseMessage setresponsemessage = new setResponseMessage(str.getBytes(defaultDumperPluginsProvider.a));
            setresponsemessage.a = str;
            return setresponsemessage;
        }
        throw new IllegalArgumentException("s == null");
    }

    private static int b(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 >= 'a' && c2 <= 'f') {
            c3 = 'a';
        } else if (c2 < 'A' || c2 > 'F') {
            StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
            sb.append(c2);
            throw new IllegalArgumentException(sb.toString());
        }
        return (c2 - c3) + 10;
    }

    private setResponseMessage b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(str).digest(this.d);
            if (digest != null) {
                return new setResponseMessage((byte[]) digest.clone());
            }
            throw new IllegalArgumentException("data == null");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Nullable
    public static setResponseMessage d(String str) {
        if (str != null) {
            byte[] c2 = setResponseImageData.c(str);
            return c2 != null ? new setResponseMessage(c2) : null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static setResponseMessage d(byte... bArr) {
        if (bArr != null) {
            return new setResponseMessage((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static setResponseMessage e(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((byte) ((b(str.charAt(i2)) << 4) + b(str.charAt(i2 + 1))));
            }
            return new setResponseMessage((byte[]) bArr.clone());
        }
        StringBuilder sb = new StringBuilder("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static setResponseMessage e(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new setResponseMessage(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            setResponseMessage setresponsemessage = new setResponseMessage(bArr);
            try {
                Field declaredField = setResponseMessage.class.getDeclaredField("d");
                declaredField.setAccessible(true);
                declaredField.set(this, setresponsemessage.d);
            } catch (IllegalAccessException e) {
                throw new AssertionError();
            } catch (NoSuchFieldException e2) {
                throw new AssertionError();
            }
        } else {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.d.length);
        objectOutputStream.write(this.d);
    }

    public byte a(int i) {
        return this.d[i];
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        if (i >= 0) {
            byte[] bArr2 = this.d;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && defaultDumperPluginsProvider.a(bArr2, i, bArr, i2, i3)) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a() {
        return this.d;
    }

    public setResponseMessage b() {
        return b("SHA-1");
    }

    public String c() {
        return setResponseImageData.e(this.d);
    }

    public void c(setResponseContentType setresponsecontenttype) {
        byte[] bArr = this.d;
        setresponsecontenttype.a(bArr, 0, bArr.length);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(setResponseMessage setresponsemessage) {
        setResponseMessage setresponsemessage2 = setresponsemessage;
        int g = g();
        int g2 = setresponsemessage2.g();
        int min = Math.min(g, g2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                int a = a(i) & 255;
                int a2 = setresponsemessage2.a(i) & 255;
                if (a == a2) {
                    i++;
                } else {
                    if (a >= a2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (g == g2) {
                return 0;
            } else {
                if (g >= g2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    public setResponseMessage d() {
        return b("MD5");
    }

    public setResponseMessage d(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new setResponseMessage(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.d.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public boolean d(int i, setResponseMessage setresponsemessage, int i2, int i3) {
        return setresponsemessage.a(0, this.d, 0, i3);
    }

    public String e() {
        byte[] bArr = this.d;
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = b;
            cArr[i] = (char) cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = (char) cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r0.a(0, r0, 0, r0.length) != false) goto L_0x0035;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            r8 = r0
            r0 = r7
            r1 = r6
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r7
            boolean r0 = r0 instanceof o.setResponseMessage
            if (r0 == 0) goto L_0x0033
            r0 = r7
            o.setResponseMessage r0 = (o.setResponseMessage) r0
            r9 = r0
            r0 = r9
            int r0 = r0.g()
            r10 = r0
            r0 = r6
            byte[] r0 = r0.d
            r7 = r0
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 != r1) goto L_0x0033
            r0 = r9
            r1 = 0
            r2 = r7
            r3 = 0
            r4 = r7
            int r4 = r4.length
            boolean r0 = r0.a(r1, r2, r3, r4)
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            r0 = 0
            r8 = r0
        L_0x0035:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseMessage.equals(java.lang.Object):boolean");
    }

    public byte[] f() {
        return (byte[]) this.d.clone();
    }

    public int g() {
        return this.d.length;
    }

    public setResponseMessage h() {
        return b("SHA-256");
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.e;
        int i2 = i;
        if (i == 0) {
            i2 = Arrays.hashCode(this.d);
            this.e = i2;
        }
        return i2;
    }

    public setResponseMessage i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) ((byte) (b2 + 32));
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) ((byte) (b3 + 32));
                    }
                }
                return new setResponseMessage(bArr2);
            }
        }
    }

    public String j() {
        String str = this.a;
        String str2 = str;
        if (str == null) {
            str2 = new String(this.d, defaultDumperPluginsProvider.a);
            this.a = str2;
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        r8 = -1;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseMessage.toString():java.lang.String");
    }
}
