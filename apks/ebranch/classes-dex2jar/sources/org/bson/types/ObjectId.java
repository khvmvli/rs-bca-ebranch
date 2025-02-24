package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import o.remove;
/* loaded from: classes-dex2jar.jar:org/bson/types/ObjectId.class */
public final class ObjectId implements Comparable<ObjectId>, Serializable {
    private static final short a;
    private static final int b;
    private final int c;
    private final int f;
    private final short g;
    private final int i;
    private static final AtomicInteger e = new AtomicInteger(new SecureRandom().nextInt());
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            b = secureRandom.nextInt(16777216);
            a = (short) ((short) secureRandom.nextInt(32768));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    public ObjectId(int i, int i2) {
        this(i, i2, true);
    }

    ObjectId(int i, int i2, int i3) {
        this(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2, (byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3});
    }

    @Deprecated
    public ObjectId(int i, int i2, short s, int i3) {
        this(i, i2, s, i3, true);
    }

    private ObjectId(int i, int i2, short s, int i3, boolean z) {
        if ((i2 & -16777216) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        } else if (!z || (i3 & -16777216) == 0) {
            this.f = i;
            this.c = 16777215 & i3;
            this.i = i2;
            this.g = (short) s;
        } else {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
    }

    private ObjectId(int i, int i2, boolean z) {
        this(i, b, a, i2, z);
    }

    public ObjectId(String str) {
        this(e(str));
    }

    public ObjectId(ByteBuffer byteBuffer) {
        remove.e("buffer", byteBuffer);
        remove.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.f = (byteBuffer.get() << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        this.i = ((byteBuffer.get() & 255) << 16) | 0 | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        this.g = (short) ((short) (((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255)));
        this.c = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 16) | 0 | ((byteBuffer.get() & 255) << 8);
    }

    public ObjectId(Date date) {
        this((int) (date.getTime() / 1000), e.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i) {
        this((int) (date.getTime() / 1000), i, true);
    }

    @Deprecated
    public ObjectId(Date date, int i, short s, int i2) {
        this((int) (date.getTime() / 1000), i, s, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
        if (((byte[]) remove.e("bytes", bArr)).length == 12) {
            return;
        }
        StringBuilder sb = new StringBuilder("state should be: ");
        sb.append("bytes has length of 12");
        throw new IllegalArgumentException(sb.toString());
    }

    private void d(ByteBuffer byteBuffer) {
        remove.e("buffer", byteBuffer);
        remove.b("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put((byte) (this.f >> 24));
        byteBuffer.put((byte) (this.f >> 16));
        byteBuffer.put((byte) (this.f >> 8));
        byteBuffer.put((byte) this.f);
        byteBuffer.put((byte) (this.i >> 16));
        byteBuffer.put((byte) (this.i >> 8));
        byteBuffer.put((byte) this.i);
        byteBuffer.put((byte) (this.g >> 8));
        byteBuffer.put((byte) this.g);
        byteBuffer.put((byte) (this.c >> 16));
        byteBuffer.put((byte) (this.c >> 8));
        byteBuffer.put((byte) this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static byte[] e(java.lang.String r7) {
        /*
            r0 = r7
            if (r0 == 0) goto L_0x00af
            r0 = r7
            int r0 = r0.length()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            r1 = 24
            if (r0 == r1) goto L_0x0016
        L_0x0011:
            r0 = 0
            r10 = r0
            goto L_0x0056
        L_0x0016:
            r0 = 0
            r10 = r0
        L_0x0018:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L_0x0054
            r0 = r7
            r1 = r10
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            r1 = 48
            if (r0 < r1) goto L_0x0032
            r0 = r11
            r1 = 57
            if (r0 <= r1) goto L_0x004e
        L_0x0032:
            r0 = r11
            r1 = 97
            if (r0 < r1) goto L_0x0040
            r0 = r11
            r1 = 102(0x66, float:1.43E-43)
            if (r0 <= r1) goto L_0x004e
        L_0x0040:
            r0 = r11
            r1 = 65
            if (r0 < r1) goto L_0x0011
            r0 = r11
            r1 = 70
            if (r0 > r1) goto L_0x0011
        L_0x004e:
            int r10 = r10 + 1
            goto L_0x0018
        L_0x0054:
            r0 = 1
            r10 = r0
        L_0x0056:
            r0 = r10
            if (r0 == 0) goto L_0x0088
            r0 = 12
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = r9
            r10 = r0
        L_0x0062:
            r0 = r10
            r1 = 12
            if (r0 >= r1) goto L_0x0085
            r0 = r10
            r1 = 1
            int r0 = r0 << r1
            r9 = r0
            r0 = r12
            r1 = r10
            r2 = r7
            r3 = r9
            r4 = r9
            r5 = 2
            int r4 = r4 + r5
            java.lang.String r2 = r2.substring(r3, r4)
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)
            byte r2 = (byte) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r10 = r10 + 1
            goto L_0x0062
        L_0x0085:
            r0 = r12
            return r0
        L_0x0088:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "invalid hexadecimal representation of an ObjectId: ["
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r12
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r12
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x00af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.types.ObjectId.e(java.lang.String):byte[]");
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ObjectId objectId) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        d(allocate);
        byte[] array = allocate.array();
        ByteBuffer allocate2 = ByteBuffer.allocate(12);
        objectId.d(allocate2);
        byte[] array2 = allocate2.array();
        for (int i = 0; i < 12; i++) {
            byte b2 = array[i];
            byte b3 = array2[i];
            if (b2 != b3) {
                return (b2 & 255) < (b3 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.c == objectId.c && this.f == objectId.f && this.i == objectId.i && this.g == objectId.g;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return (((((this.f * 31) + this.c) * 31) + this.i) * 31) + this.g;
    }

    @Override // java.lang.Object
    public final String toString() {
        char[] cArr = new char[24];
        ByteBuffer allocate = ByteBuffer.allocate(12);
        d(allocate);
        byte[] array = allocate.array();
        int i = 0;
        for (byte b2 : array) {
            int i2 = i + 1;
            char[] cArr2 = d;
            cArr[i] = (char) cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = (char) cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
