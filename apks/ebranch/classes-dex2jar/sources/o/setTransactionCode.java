package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.isFromForm;
/* loaded from: classes-dex2jar.jar:o/setTransactionCode.class */
public final class setTransactionCode extends isFromForm.RemoteActionCompatParcelizer {
    private final setTnxStatus i;

    public setTransactionCode(boolean z, setTnxStatus settnxstatus) throws IOException {
        this.b = z;
        this.i = settnxstatus;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.j = settnxstatus.b(allocate, 16);
        this.d = settnxstatus.a(allocate, 32);
        this.h = settnxstatus.a(allocate, 40);
        this.c = settnxstatus.b(allocate, 54);
        this.a = settnxstatus.b(allocate, 56);
        this.e = settnxstatus.b(allocate, 58);
        this.f = settnxstatus.b(allocate, 60);
        this.g = settnxstatus.b(allocate, 62);
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm.write a(int i) throws IOException {
        return new isFromForm.write(this.i, this, 0) { // from class: o.Reservation$$Parcelable
            {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(r10.b ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                this.a = r9.d(allocate, r10.h + ((long) (r11 * r10.e)) + 44);
            }
        };
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm.IconCompatParcelizer b(long j) throws IOException {
        return new setTypeTransaction(this.i, this, j);
    }

    @Override // o.isFromForm.RemoteActionCompatParcelizer
    public final isFromForm$MediaBrowserCompat$CustomActionResultReceiver e(long j, int i) throws IOException {
        return new Reservation(this.i, this, j, i);
    }
}
