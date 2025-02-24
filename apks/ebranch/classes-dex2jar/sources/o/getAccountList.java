package o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/getAccountList.class */
public final class getAccountList extends CreateQueueReservationResponse<InputStream> {
    public getAccountList(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // o.CreateQueueReservationResponse
    protected final /* synthetic */ void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.CreateQueueReservationResponse
    protected final /* synthetic */ InputStream d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<InputStream> e() {
        return InputStream.class;
    }
}
