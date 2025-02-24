package o;

import java.lang.ref.WeakReference;
/* loaded from: classes-dex2jar.jar:o/realmGet$tipeNasabahPengirim.class */
abstract class realmGet$tipeNasabahPengirim extends realmGet$statusKewarganegaraanPengirim {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference d = a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$tipeNasabahPengirim(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.realmGet$statusKewarganegaraanPengirim
    public final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            byte[] bArr2 = (byte[]) this.d.get();
            bArr = bArr2;
            if (bArr2 == null) {
                bArr = b();
                this.d = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] b();
}
