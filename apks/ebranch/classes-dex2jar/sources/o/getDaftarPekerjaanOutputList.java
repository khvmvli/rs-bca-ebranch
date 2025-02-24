package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getDaftarPekerjaanOutputList.class */
public final class getDaftarPekerjaanOutputList {
    public final List<ImageHeaderParser> c = new ArrayList();

    public final List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        synchronized (this) {
            list = this.c;
        }
        return list;
    }
}
