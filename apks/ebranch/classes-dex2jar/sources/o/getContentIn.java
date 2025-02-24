package o;

import android.util.Log;
import io.realm.internal.Property;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* loaded from: classes-dex2jar.jar:o/getContentIn.class */
public final class getContentIn {
    public setCategoryCd d;
    public ByteBuffer e;
    public final byte[] c = new byte[Property.TYPE_SET];
    public int a = 0;

    private void b() {
        int a;
        do {
            a = a();
            this.e.position(Math.min(this.e.position() + a, this.e.limit()));
        } while (a > 0);
    }

    private void c() {
        boolean z;
        do {
            e();
            byte[] bArr = this.c;
            z = false;
            if (bArr[0] == 1) {
                byte b = bArr[1];
                this.d.g = ((bArr[2] & 255) << 8) | (b & 255);
            }
            if (this.a <= 0) {
                return;
            }
            if (this.d.l != 0) {
                z = true;
            }
        } while (!z);
    }

    private void e() {
        int a = a();
        this.a = a;
        if (a > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.a;
                    if (i2 < i3) {
                        int i4 = i3 - i2;
                        this.e.get(this.c, i2, i4);
                        i2 += i4;
                        i = i4;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder("Error Reading Block n: ");
                        sb.append(i2);
                        sb.append(" count: ");
                        sb.append(i);
                        sb.append(" blockSize: ");
                        sb.append(this.a);
                        Log.d("GifHeaderParser", sb.toString(), e);
                    }
                    this.d.l = 1;
                    return;
                }
            }
        }
    }

    public int a() {
        int i;
        try {
            i = this.e.get() & 255;
        } catch (Exception e) {
            this.d.l = 1;
            i = 0;
        }
        return i;
    }

    public int[] c(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.e.get(bArr);
            iArr = null;
            int[] iArr2 = new int[Property.TYPE_SET];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = iArr2;
                if (i2 >= i) {
                    break;
                }
                int i4 = i3 + 1;
                byte b = bArr[i3];
                int i5 = i4 + 1;
                iArr2[i2] = ((b & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i5 + 1;
                i2++;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.d.l = 1;
        }
        return iArr;
    }

    public void d() {
        boolean z = false;
        while (!z) {
            if (!(this.d.l != 0) && this.d.b <= Integer.MAX_VALUE) {
                int a = a();
                if (a == 33) {
                    int a2 = a();
                    if (a2 == 1) {
                        b();
                    } else if (a2 == 249) {
                        this.d.e = new getContentOrder();
                        a();
                        int a3 = a();
                        this.d.e.e = (a3 & 28) >> 2;
                        if (this.d.e.e == 0) {
                            this.d.e.e = 1;
                        }
                        this.d.e.n = (a3 & 1) != 0;
                        short s = this.e.getShort();
                        short s2 = s;
                        if (s < 2) {
                            s2 = 10;
                        }
                        this.d.e.d = s2 * 10;
                        this.d.e.i = a();
                        a();
                    } else if (a2 == 254) {
                        b();
                    } else if (a2 != 255) {
                        b();
                    } else {
                        e();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < 11; i++) {
                            sb.append((char) this.c[i]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            c();
                        } else {
                            b();
                        }
                    }
                } else if (a == 44) {
                    if (this.d.e == null) {
                        this.d.e = new getContentOrder();
                    }
                    this.d.e.g = this.e.getShort();
                    this.d.e.h = this.e.getShort();
                    this.d.e.f = this.e.getShort();
                    this.d.e.b = this.e.getShort();
                    int a4 = a();
                    boolean z2 = (a4 & Property.TYPE_ARRAY) != 0;
                    int pow = (int) Math.pow(2.0d, (double) ((a4 & 7) + 1));
                    this.d.e.c = (a4 & 64) != 0;
                    if (z2) {
                        this.d.e.j = c(pow);
                    } else {
                        this.d.e.j = null;
                    }
                    this.d.e.a = this.e.position();
                    a();
                    b();
                    if (!(this.d.l != 0)) {
                        this.d.b++;
                        this.d.d.add(this.d.e);
                    }
                } else if (a != 59) {
                    this.d.l = 1;
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }
}
