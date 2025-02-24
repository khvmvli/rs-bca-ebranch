package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/getTransactionCode.class */
public final class getTransactionCode extends isFromForm$MediaBrowserCompat$CustomActionResultReceiver {
    public getTransactionCode(setTnxStatus settnxstatus, isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(remoteActionCompatParcelizer.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i << 3));
        this.a = settnxstatus.d(allocate, j2);
        this.e = settnxstatus.d(allocate, j2 + 4);
    }
}
