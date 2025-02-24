package o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* loaded from: classes-dex2jar.jar:o/setBranchCoordinator.class */
public final class setBranchCoordinator implements setEmergencyCloseStartDate<Bitmap, byte[]> {
    private final int d;
    private final Bitmap.CompressFormat e;

    public setBranchCoordinator() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    private setBranchCoordinator(Bitmap.CompressFormat compressFormat, int i) {
        this.e = compressFormat;
        this.d = 100;
    }

    @Override // o.setEmergencyCloseStartDate
    public final setIbanFlag<byte[]> e(setIbanFlag<Bitmap> setibanflag, CategoryResponse categoryResponse) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setibanflag.a().compress(this.e, this.d, byteArrayOutputStream);
        setibanflag.b();
        return new getFlagReservationCsoSolitaire(byteArrayOutputStream.toByteArray());
    }
}
