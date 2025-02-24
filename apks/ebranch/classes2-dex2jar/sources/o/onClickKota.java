package o;

import android.content.Context;
import android.hardware.Camera;
/* loaded from: classes2-dex2jar.jar:o/onClickKota.class */
public abstract class onClickKota implements Camera.PictureCallback {
    private Context d;
    private boolean c = false;
    public boolean b = false;

    public onClickKota(Context context) {
        this.d = context;
    }

    private static int d(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i4 = 0;
        while (i2 > 0) {
            i4 = (i4 << 8) | (bArr[i] & 255);
            i += i3;
            i2--;
        }
        return i4;
    }

    protected abstract void e(byte[] bArr);

    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
    @Override // android.hardware.Camera.PictureCallback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onPictureTaken(byte[] r9, android.hardware.Camera r10) {
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickKota.onPictureTaken(byte[], android.hardware.Camera):void");
    }
}
