package o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/setCitizenship.class */
final class setCitizenship implements setCode {
    private static final getTxnSourceValue<Class<?>, byte[]> c = new getTxnSourceValue<>(50);
    private final Class<?> a;
    private final DetailTransactionResponse b;
    private final int d;
    private final getReservationDate<?> f;
    private final setCode g;
    private final CategoryResponse h;
    private final setCode i;
    private final int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCitizenship(DetailTransactionResponse detailTransactionResponse, setCode setcode, setCode setcode2, int i, int i2, getReservationDate<?> getreservationdate, Class<?> cls, CategoryResponse categoryResponse) {
        this.b = detailTransactionResponse;
        this.i = setcode;
        this.g = setcode2;
        this.j = i;
        this.d = i2;
        this.f = getreservationdate;
        this.a = cls;
        this.h = categoryResponse;
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.a(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.j).putInt(this.d).array();
        this.g.e(messageDigest);
        this.i.e(messageDigest);
        messageDigest.update(bArr);
        getReservationDate<?> getreservationdate = this.f;
        if (getreservationdate != null) {
            getreservationdate.e(messageDigest);
        }
        this.h.e(messageDigest);
        getTxnSourceValue<Class<?>, byte[]> gettxnsourcevalue = c;
        byte[] b = gettxnsourcevalue.b((getTxnSourceValue<Class<?>, byte[]>) this.a);
        byte[] bArr2 = b;
        if (b == null) {
            bArr2 = this.a.getName().getBytes(e);
            gettxnsourcevalue.e(this.a, bArr2);
        }
        messageDigest.update(bArr2);
        this.b.e(bArr);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof setCitizenship) {
            setCitizenship setcitizenship = (setCitizenship) obj;
            z = false;
            if (this.d == setcitizenship.d) {
                z = false;
                if (this.j == setcitizenship.j) {
                    z = false;
                    if (getTxnNotes2.a(this.f, setcitizenship.f)) {
                        z = false;
                        if (this.a.equals(setcitizenship.a)) {
                            z = false;
                            if (this.i.equals(setcitizenship.i)) {
                                z = false;
                                if (this.g.equals(setcitizenship.g)) {
                                    z = false;
                                    if (this.h.equals(setcitizenship.h)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // o.setCode
    public final int hashCode() {
        int hashCode = (((((this.i.hashCode() * 31) + this.g.hashCode()) * 31) + this.j) * 31) + this.d;
        getReservationDate<?> getreservationdate = this.f;
        int i = hashCode;
        if (getreservationdate != null) {
            i = (hashCode * 31) + getreservationdate.hashCode();
        }
        return (((i * 31) + this.a.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceCacheKey{sourceKey=");
        sb.append(this.i);
        sb.append(", signature=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.j);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", decodedResourceClass=");
        sb.append(this.a);
        sb.append(", transformation='");
        sb.append(this.f);
        sb.append("', options=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }
}
