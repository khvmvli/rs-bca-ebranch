package o;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getTxnStatus.class */
public final class getTxnStatus extends CreateQueueReservationResponse<ParcelFileDescriptor> {
    public getTxnStatus(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // o.CreateQueueReservationResponse
    protected final /* synthetic */ void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o.CreateQueueReservationResponse
    protected final /* synthetic */ ParcelFileDescriptor d(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<ParcelFileDescriptor> e() {
        return ParcelFileDescriptor.class;
    }
}
