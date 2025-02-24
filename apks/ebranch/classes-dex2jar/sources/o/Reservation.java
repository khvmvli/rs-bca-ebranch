package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/Reservation.class */
public final class Reservation extends isFromForm$MediaBrowserCompat$CustomActionResultReceiver {
    public Reservation(setTnxStatus settnxstatus, isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(remoteActionCompatParcelizer.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i << 4));
        this.a = settnxstatus.a(allocate, j2);
        this.e = settnxstatus.a(allocate, j2 + 8);
    }
}
