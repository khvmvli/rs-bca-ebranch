package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/realmGet$statusPendudukPengirim.class */
final class realmGet$statusPendudukPengirim extends realmGet$statusKewarganegaraanPengirim {
    private final byte[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$statusPendudukPengirim(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.realmGet$statusKewarganegaraanPengirim
    public final byte[] a() {
        return this.e;
    }
}
