package o;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/setCurrOfficePostCode.class */
public abstract class setCurrOfficePostCode implements Iterable<Byte>, Serializable {
    private int e = 0;
    public static final setCurrOfficePostCode a = new setCurrOfficePhoneNumber(setNationality.d);
    private static final setCustomerFullName d = new setCustomerFullName(null);
    private static final Comparator<setCurrOfficePostCode> b = new setCurrOfficeEmailAddress();

    static {
        int i = setBirthDate.c;
    }

    public static setCurrOfficePostCode b(byte[] bArr, int i, int i2) {
        d(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new setCurrOfficePhoneNumber(bArr2);
    }

    public static setCurrOfficePostCode c(String str) {
        return new setCurrOfficePhoneNumber(str.getBytes(setNationality.c));
    }

    static int d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte a(int i);

    public abstract boolean a();

    public abstract int b();

    protected abstract int b(int i, int i2, int i3);

    protected abstract String b(Charset charset);

    public final int c() {
        return this.e;
    }

    public abstract byte d(int i);

    public abstract setCurrOfficePostCode d(int i, int i2);

    public final String e(Charset charset) {
        return b() == 0 ? "" : b(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(setCountry setcountry) throws IOException;

    @Override // java.lang.Object
    public abstract boolean equals(Object obj);

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.e;
        int i2 = i;
        if (i == 0) {
            int b2 = b();
            int b3 = b(b2, 0, b2);
            i2 = b3;
            if (b3 == 0) {
                i2 = 1;
            }
            this.e = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new setCurrCompanyBusinessType(this);
    }

    @Override // java.lang.Object
    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()), b() <= 50 ? realmSet$incomeAmount.c(this) : String.valueOf(realmSet$incomeAmount.c(d(0, 47))).concat("..."));
    }
}
