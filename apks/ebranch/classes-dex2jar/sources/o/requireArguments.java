package o;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes-dex2jar.jar:o/requireArguments.class */
public abstract class requireArguments {

    /* loaded from: classes-dex2jar.jar:o/requireArguments$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<D> {
    }

    public static <T extends performContextItemSelected & performStart> requireArguments d(T t) {
        return new requireHost(t, t.getViewModelStore());
    }

    public abstract void a();

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
