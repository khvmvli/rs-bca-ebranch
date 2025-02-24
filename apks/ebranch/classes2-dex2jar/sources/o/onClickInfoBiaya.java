package o;

import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2-dex2jar.jar:o/onClickInfoBiaya.class */
public final class onClickInfoBiaya {
    /* JADX INFO: Access modifiers changed from: private */
    public static long a(InputStream inputStream, OutputStream outputStream, int i) {
        subscribeReservationRescheduleEvent.e(inputStream, "");
        subscribeReservationRescheduleEvent.e(outputStream, "");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
