package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import o.GetBranchROResponse;
/* loaded from: classes-dex2jar.jar:o/setEmergencyCloseEndDate.class */
public final class setEmergencyCloseEndDate implements setEmergencyCloseStartDate<Bitmap, BitmapDrawable> {
    private final Resources c;

    public setEmergencyCloseEndDate(Resources resources) {
        if (resources != null) {
            this.c = resources;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setEmergencyCloseStartDate
    public final setIbanFlag<BitmapDrawable> e(setIbanFlag<Bitmap> setibanflag, CategoryResponse categoryResponse) {
        Resources resources = this.c;
        if (setibanflag == null) {
            return null;
        }
        return new GetBranchROResponse.DetailBranch(resources, setibanflag);
    }
}
