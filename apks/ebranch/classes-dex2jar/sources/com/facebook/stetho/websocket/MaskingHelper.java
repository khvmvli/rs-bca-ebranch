package com.facebook.stetho.websocket;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/websocket/MaskingHelper.class */
class MaskingHelper {
    MaskingHelper() {
    }

    public static void unmask(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = 0;
        int i4 = i;
        while (i2 > 0) {
            bArr2[i4] = (byte) ((byte) (bArr2[i4] ^ bArr[i3 % bArr.length]));
            i4++;
            i2--;
            i3++;
        }
    }
}
