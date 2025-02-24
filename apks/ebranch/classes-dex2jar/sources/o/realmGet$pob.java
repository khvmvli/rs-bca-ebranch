package o;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
/* loaded from: classes-dex2jar.jar:o/realmGet$pob.class */
public final class realmGet$pob implements realmGet$resSubDistrict {
    @Override // o.realmGet$resSubDistrict
    public final Exception getException(Status status) {
        return status.m != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
