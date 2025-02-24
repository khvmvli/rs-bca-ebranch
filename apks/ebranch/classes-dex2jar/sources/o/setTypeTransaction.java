package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/setTypeTransaction.class */
public final class setTypeTransaction extends isFromForm.IconCompatParcelizer {
    public setTypeTransaction(setTnxStatus settnxstatus, isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(remoteActionCompatParcelizer.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = remoteActionCompatParcelizer.d + (j * ((long) remoteActionCompatParcelizer.c));
        this.b = settnxstatus.d(allocate, j2);
        this.a = settnxstatus.a(allocate, 8 + j2);
        this.e = settnxstatus.a(allocate, 16 + j2);
        this.c = settnxstatus.a(allocate, j2 + 40);
    }
}
