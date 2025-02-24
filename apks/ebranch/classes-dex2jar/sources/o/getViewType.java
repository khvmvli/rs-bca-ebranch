package o;

import java.io.File;
import o.setProductTypeName;
/* loaded from: classes-dex2jar.jar:o/getViewType.class */
public class getViewType implements setProductTypeName.RemoteActionCompatParcelizer {
    private final long b;
    private final RemoteActionCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/getViewType$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        File a();
    }

    public getViewType(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j) {
        this.b = j;
        this.e = remoteActionCompatParcelizer;
    }

    @Override // o.setProductTypeName.RemoteActionCompatParcelizer
    public final setProductTypeName c() {
        File a = this.e.a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return C0036setNoreffAnak.a(a, this.b);
        }
        return null;
    }
}
