package o;

import java.io.File;
/* loaded from: classes-dex2jar.jar:o/setProductTypeName.class */
public interface setProductTypeName {

    /* loaded from: classes-dex2jar.jar:o/setProductTypeName$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        setProductTypeName c();
    }

    /* loaded from: classes-dex2jar.jar:o/setProductTypeName$write.class */
    public interface write {
        boolean b(File file);
    }

    void a(setCode setcode, write write2);

    File e(setCode setcode);
}
