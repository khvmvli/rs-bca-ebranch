package o;

import com.google.android.gms.internal.measurement.zzjj;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes-dex2jar.jar:o/setCustomerName.class */
public abstract class setCustomerName extends setCountry {
    setEmergencyContactOfficeExt c;
    private static final Logger d = Logger.getLogger(setCustomerName.class.getName());
    private static final boolean b = realmGet$jobSector.a();

    private setCustomerName() {
    }

    public /* synthetic */ setCustomerName(setEmergencyContactAddress setemergencycontactaddress) {
    }

    public static int a(int i) {
        return h(i << 3);
    }

    public static /* synthetic */ boolean a() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static int b(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        int i2 = i;
        boolean z = j == 1 ? 1 : 0;
        if ((-2097152 & (j == 1 ? 1 : 0)) != 0) {
            i2 = i + 2;
            z = j >>> 14;
        }
        int i3 = i2;
        if (((z == true ? 1 : 0) & -16384) != 0) {
            i3 = i2 + 1;
        }
        return i3;
    }

    @Deprecated
    public static int c(int i, realmGet$cardDescription realmget_carddescription, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        int h = h(i << 3);
        setBcaDebitCardType setbcadebitcardtype = (setBcaDebitCardType) realmget_carddescription;
        int ak = setbcadebitcardtype.ak();
        int i2 = ak;
        if (ak == -1) {
            i2 = realmset_annualfeebasicdisplayamount.c(setbcadebitcardtype);
            setbcadebitcardtype.g(i2);
        }
        return h + h + i2;
    }

    public static setCustomerName c(byte[] bArr) {
        return new setEmergencyContactCity(bArr, 0, bArr.length);
    }

    public static int d(int i) {
        if (i >= 0) {
            return h(i);
        }
        return 10;
    }

    public static int d(realmGet$cardDescription realmget_carddescription, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        setBcaDebitCardType setbcadebitcardtype = (setBcaDebitCardType) realmget_carddescription;
        int ak = setbcadebitcardtype.ak();
        int i = ak;
        if (ak == -1) {
            i = realmset_annualfeebasicdisplayamount.c(setbcadebitcardtype);
            setbcadebitcardtype.g(i);
        }
        return h(i) + i;
    }

    public static int d(setCurrOfficePostCode setcurrofficepostcode) {
        int b2 = setcurrofficepostcode.b();
        return h(b2) + b2;
    }

    public static int e(String str) {
        int i;
        try {
            i = realmSet$supplementCardOptions.a(str);
        } catch (realmSet$supplementCardLimit e) {
            i = str.getBytes(setNationality.c).length;
        }
        return h(i) + i;
    }

    public static int e(setPreferredMailingAddress setpreferredmailingaddress) {
        int a = setpreferredmailingaddress.a();
        return h(a) + a;
    }

    public static int h(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public final void b() {
        if (d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public abstract void b(int i, long j) throws IOException;

    public abstract void b(int i, String str) throws IOException;

    public abstract void c(int i) throws IOException;

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(byte[] bArr, int i, int i2) throws IOException;

    public abstract int d();

    public abstract void d(byte b2) throws IOException;

    public abstract void d(long j) throws IOException;

    public abstract void e(int i) throws IOException;

    public abstract void e(int i, int i2) throws IOException;

    public abstract void e(int i, setCurrOfficePostCode setcurrofficepostcode) throws IOException;

    public abstract void e(int i, boolean z) throws IOException;

    public abstract void e(long j) throws IOException;

    public final void e(String str, realmSet$supplementCardLimit realmset_supplementcardlimit) throws IOException {
        d.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) realmset_supplementcardlimit);
        byte[] bytes = str.getBytes(setNationality.c);
        try {
            int length = bytes.length;
            c(length);
            c(bytes, 0, length);
        } catch (zzjj e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjj(e2);
        }
    }
}
