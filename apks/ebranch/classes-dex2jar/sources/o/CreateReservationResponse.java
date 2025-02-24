package o;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/CreateReservationResponse.class */
public final class CreateReservationResponse implements setReservationTime<InputStream> {
    public final GetBranchROResponse$$Parcelable a;

    public CreateReservationResponse(InputStream inputStream, DetailTransactionResponse detailTransactionResponse) {
        GetBranchROResponse$$Parcelable getBranchROResponse$$Parcelable = new GetBranchROResponse$$Parcelable(inputStream, detailTransactionResponse);
        this.a = getBranchROResponse$$Parcelable;
        getBranchROResponse$$Parcelable.mark(5242880);
    }

    @Override // o.setReservationTime
    public final /* synthetic */ InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }

    @Override // o.setReservationTime
    public final void d() {
        this.a.d();
    }
}
