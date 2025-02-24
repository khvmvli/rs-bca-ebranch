package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/setTypeReservation.class */
public final class setTypeReservation extends isFromForm.write {
    public setTypeReservation(setTnxStatus settnxstatus, isFromForm.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(remoteActionCompatParcelizer.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = settnxstatus.d(allocate, remoteActionCompatParcelizer.h + ((long) (i * remoteActionCompatParcelizer.e)) + 28);
    }
}
