package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/getTypeTransaction2.class */
public final class getTypeTransaction2 extends isFromForm.IconCompatParcelizer {
    public getTypeTransaction2(setTnxStatus settnxstatus, isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(remoteActionCompatParcelizer.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = remoteActionCompatParcelizer.d + (j * ((long) remoteActionCompatParcelizer.c));
        this.b = settnxstatus.d(allocate, j2);
        this.a = settnxstatus.d(allocate, 4 + j2);
        this.e = settnxstatus.d(allocate, 8 + j2);
        this.c = settnxstatus.d(allocate, j2 + 20);
    }
}
