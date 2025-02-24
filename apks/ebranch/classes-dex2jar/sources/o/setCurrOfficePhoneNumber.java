package o;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setCurrOfficePhoneNumber.class */
public class setCurrOfficePhoneNumber extends setCurrWorkPeriod {
    protected final byte[] b;

    public setCurrOfficePhoneNumber(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCurrOfficePostCode
    public byte a(int i) {
        return this.b[i];
    }

    @Override // o.setCurrOfficePostCode
    public final boolean a() {
        return realmSet$supplementCardOptions.e(this.b, 0, b());
    }

    @Override // o.setCurrOfficePostCode
    public int b() {
        return this.b.length;
    }

    @Override // o.setCurrOfficePostCode
    protected final int b(int i, int i2, int i3) {
        return setNationality.e(i, this.b, 0, i3);
    }

    @Override // o.setCurrOfficePostCode
    protected final String b(Charset charset) {
        return new String(this.b, 0, b(), charset);
    }

    @Override // o.setCurrOfficePostCode
    public byte d(int i) {
        return this.b[i];
    }

    @Override // o.setCurrOfficePostCode
    public final setCurrOfficePostCode d(int i, int i2) {
        int d = d(0, i2, b());
        return d == 0 ? setCurrOfficePostCode.a : new setCurrOfficeBusinessField(this.b, 0, d);
    }

    protected int e() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setCurrOfficePostCode
    public final void e(setCountry setcountry) throws IOException {
        ((setEmergencyContactCity) setcountry).b(this.b, 0, b());
    }

    @Override // o.setCurrOfficePostCode, java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setCurrOfficePostCode) || b() != ((setCurrOfficePostCode) obj).b()) {
            return false;
        }
        if (b() == 0) {
            return true;
        }
        if (!(obj instanceof setCurrOfficePhoneNumber)) {
            return obj.equals(this);
        }
        setCurrOfficePhoneNumber setcurrofficephonenumber = (setCurrOfficePhoneNumber) obj;
        int c = c();
        int c2 = setcurrofficephonenumber.c();
        if (c != 0 && c2 != 0 && c != c2) {
            return false;
        }
        int b = b();
        if (b > setcurrofficephonenumber.b()) {
            int b2 = b();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(b);
            sb.append(b2);
            throw new IllegalArgumentException(sb.toString());
        } else if (b <= setcurrofficephonenumber.b()) {
            if (setcurrofficephonenumber instanceof setCurrOfficePhoneNumber) {
                byte[] bArr = this.b;
                byte[] bArr2 = setcurrofficephonenumber.b;
                setcurrofficephonenumber.e();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= b) {
                        break;
                    } else if (bArr[i] != bArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i++;
                        i2++;
                    }
                }
            } else {
                z = setcurrofficephonenumber.d(0, b).equals(d(0, b));
            }
            return z;
        } else {
            int b3 = setcurrofficephonenumber.b();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(b);
            sb2.append(", ");
            sb2.append(b3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
