package o;

import com.google.android.gms.internal.measurement.zzkn;
/* loaded from: classes-dex2jar.jar:o/setEmergencyContactMobileNumber.class */
final class setEmergencyContactMobileNumber extends setEmergencyContactBCACardNumber {
    private final byte[] c;
    private int e;
    private int a = Integer.MAX_VALUE;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setEmergencyContactMobileNumber(byte[] bArr, int i, int i2, boolean z, setCurrOfficeExtensionNumber setcurrofficeextensionnumber) {
        super(null);
        this.c = bArr;
    }

    public final int e(int i) throws zzkn {
        int i2 = this.a;
        this.a = 0;
        int i3 = this.d + this.e;
        this.d = i3;
        if (i3 > 0) {
            this.e = i3;
            this.d = 0;
        } else {
            this.e = 0;
        }
        return i2;
    }
}
