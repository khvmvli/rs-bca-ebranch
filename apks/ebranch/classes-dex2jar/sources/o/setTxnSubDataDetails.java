package o;

import android.content.Context;
import java.io.File;
import o.getViewType;
/* loaded from: classes-dex2jar.jar:o/setTxnSubDataDetails.class */
public final class setTxnSubDataDetails extends getViewType {
    public setTxnSubDataDetails(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    private setTxnSubDataDetails(final Context context, final String str, long j) {
        super(new getViewType.RemoteActionCompatParcelizer() { // from class: o.setTxnSubDataDetails.1
            @Override // o.getViewType.RemoteActionCompatParcelizer
            public final File a() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, 262144000);
    }
}
