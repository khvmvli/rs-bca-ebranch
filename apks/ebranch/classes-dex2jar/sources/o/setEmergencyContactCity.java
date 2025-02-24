package o;

import com.google.android.gms.internal.measurement.zzjj;
import io.realm.internal.Property;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setEmergencyContactCity.class */
public final class setEmergencyContactCity extends setCustomerName {
    private final int a;
    private final byte[] b;
    private int d;

    public setEmergencyContactCity(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.a = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    @Override // o.setCustomerName
    public final void a(int i, int i2) throws IOException {
        c(i << 3);
        b(i2);
    }

    @Override // o.setCustomerName
    public final void a(int i, long j) throws IOException {
        c(i << 3);
        e(j);
    }

    @Override // o.setCustomerName
    public final void b(int i) throws IOException {
        if (i >= 0) {
            c(i);
        } else {
            e((long) i);
        }
    }

    @Override // o.setCustomerName
    public final void b(int i, int i2) throws IOException {
        c((i << 3) | i2);
    }

    @Override // o.setCustomerName
    public final void b(int i, long j) throws IOException {
        c((i << 3) | 1);
        d(j);
    }

    @Override // o.setCustomerName
    public final void b(int i, String str) throws IOException {
        c((i << 3) | 2);
        d(str);
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(i2)), e);
        }
    }

    @Override // o.setCustomerName
    public final void c(int i) throws IOException {
        int i2 = i;
        if (setCustomerName.b) {
            int i3 = setBirthDate.c;
            i2 = i;
        }
        while ((i2 & -128) != 0) {
            try {
                byte[] bArr = this.b;
                int i4 = this.d;
                this.d = i4 + 1;
                bArr[i4] = (byte) ((byte) ((i2 & 127) | Property.TYPE_ARRAY));
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.a), 1), e);
            }
        }
        byte[] bArr2 = this.b;
        int i5 = this.d;
        this.d = i5 + 1;
        bArr2[i5] = (byte) ((byte) i2);
    }

    @Override // o.setCustomerName
    public final void c(int i, int i2) throws IOException {
        c((i << 3) | 5);
        e(i2);
    }

    @Override // o.setCustomerName
    public final void c(byte[] bArr, int i, int i2) throws IOException {
        b(bArr, 0, i2);
    }

    @Override // o.setCustomerName
    public final int d() {
        return this.a - this.d;
    }

    @Override // o.setCustomerName
    public final void d(byte b) throws IOException {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = (byte) b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.a), 1), e);
        }
    }

    @Override // o.setCustomerName
    public final void d(long j) throws IOException {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            bArr[i] = (byte) ((byte) (((int) j) & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((byte) (((int) (j >> 8)) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((byte) (((int) (j >> 16)) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((byte) (((int) (j >> 24)) & 255));
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((byte) (((int) (j >> 32)) & 255));
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((byte) (((int) (j >> 40)) & 255));
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((byte) (((int) (j >> 48)) & 255));
            this.d = i8 + 1;
            bArr[i8] = (byte) ((byte) (((int) (j >> 56)) & 255));
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.a), 1), e);
        }
    }

    public final void d(String str) throws IOException {
        int i = this.d;
        try {
            int h = h(str.length() * 3);
            int h2 = h(str.length());
            if (h2 == h) {
                int i2 = i + h2;
                this.d = i2;
                int d = realmSet$supplementCardOptions.d(str, this.b, i2, this.a - i2);
                this.d = i;
                c((d - i) - h2);
                this.d = d;
                return;
            }
            c(realmSet$supplementCardOptions.a(str));
            byte[] bArr = this.b;
            int i3 = this.d;
            this.d = realmSet$supplementCardOptions.d(str, bArr, i3, this.a - i3);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(e);
        } catch (realmSet$supplementCardLimit e2) {
            this.d = i;
            e(str, e2);
        }
    }

    @Override // o.setCustomerName
    public final void e(int i) throws IOException {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((byte) (i & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((byte) ((i >> 8) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((byte) ((i >> 16) & 255));
            this.d = i5 + 1;
            bArr[i5] = (byte) ((byte) ((i >> 24) & 255));
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.a), 1), e);
        }
    }

    @Override // o.setCustomerName
    public final void e(int i, int i2) throws IOException {
        c(i << 3);
        c(i2);
    }

    @Override // o.setCustomerName
    public final void e(int i, setCurrOfficePostCode setcurrofficepostcode) throws IOException {
        c((i << 3) | 2);
        c(setcurrofficepostcode.b());
        setcurrofficepostcode.e(this);
    }

    @Override // o.setCustomerName
    public final void e(int i, boolean z) throws IOException {
        c(i << 3);
        d(z ? (byte) 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [long] */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.setCustomerName
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(long r9) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmergencyContactCity.e(long):void");
    }
}
