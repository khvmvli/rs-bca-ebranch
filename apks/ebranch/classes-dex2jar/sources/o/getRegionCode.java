package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getRegionCode.class */
public final class getRegionCode implements setDescription<getProvince> {
    private static boolean d(setIbanFlag<getProvince> setibanflag, File file) {
        boolean z;
        try {
            getLimitMin.d(setibanflag.a().d.a.h.e().asReadOnlyBuffer(), file);
            z = true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            z = false;
        }
        return z;
    }

    @Override // o.setDescription
    public final setCategoryIn a(CategoryResponse categoryResponse) {
        return setCategoryIn.SOURCE;
    }

    @Override // o.setContentOrder
    public final /* synthetic */ boolean c(Object obj, File file, CategoryResponse categoryResponse) {
        return d((setIbanFlag) obj, file);
    }
}
