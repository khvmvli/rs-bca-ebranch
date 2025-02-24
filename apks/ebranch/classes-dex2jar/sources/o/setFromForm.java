package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/setFromForm.class */
public final class setFromForm extends isFromForm.RemoteActionCompatParcelizer {
    private final setTnxStatus i;

    public setFromForm(boolean z, setTnxStatus settnxstatus) throws IOException {
        this.b = z;
        this.i = settnxstatus;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.j = settnxstatus.b(allocate, 16);
        this.d = settnxstatus.d(allocate, 28);
        this.h = settnxstatus.d(allocate, 32);
        this.c = settnxstatus.b(allocate, 42);
        this.a = settnxstatus.b(allocate, 44);
        this.e = settnxstatus.b(allocate, 46);
        this.f = settnxstatus.b(allocate, 48);
        this.g = settnxstatus.b(allocate, 50);
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm.write a(int i) throws IOException {
        return new setTypeReservation(this.i, this, 0);
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm.IconCompatParcelizer b(long j) throws IOException {
        return new getTypeTransaction2(this.i, this, j);
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm$MediaBrowserCompat$CustomActionResultReceiver e(long j, int i) throws IOException {
        return new getTransactionCode(this.i, this, j, i);
    }
}
