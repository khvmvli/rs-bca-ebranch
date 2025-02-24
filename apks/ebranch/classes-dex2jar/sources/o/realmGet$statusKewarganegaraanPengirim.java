package o;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/realmGet$statusKewarganegaraanPengirim.class */
public abstract class realmGet$statusKewarganegaraanPengirim extends setResVillage {
    private final int c;

    public realmGet$statusKewarganegaraanPengirim(byte[] bArr) {
        setFotoKtp.b(bArr.length == 25);
        this.c = Arrays.hashCode(bArr);
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] a();

    @Override // o.setNumberID
    public final int c() {
        return this.c;
    }

    @Override // o.setNumberID
    public final realmSet$noHpKontakPengirim e() {
        return realmSet$jenisWarkatTransaksi.d(a());
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        realmSet$noHpKontakPengirim e;
        if (obj == null || !(obj instanceof setNumberID)) {
            return false;
        }
        try {
            setNumberID setnumberid = (setNumberID) obj;
            if (setnumberid.c() == this.c && (e = setnumberid.e()) != null) {
                return Arrays.equals(a(), (byte[]) realmSet$jenisWarkatTransaksi.e(e));
            }
            return false;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return false;
        }
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c;
    }
}
