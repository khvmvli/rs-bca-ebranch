package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/isFromForm.class */
public interface isFromForm {

    /* loaded from: classes-dex2jar.jar:o/isFromForm$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        public long a;
        public long b;
        public long c;
        public long e;
    }

    /* loaded from: classes-dex2jar.jar:o/isFromForm$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        public int a;
        public boolean b;
        public int c;
        public long d;
        public int e;
        public int f;
        public int g;
        public long h;
        public int j;

        public abstract write a(int i) throws IOException;

        public abstract IconCompatParcelizer b(long j) throws IOException;

        public abstract isFromForm$MediaBrowserCompat$CustomActionResultReceiver e(long j, int i) throws IOException;
    }

    /* loaded from: classes-dex2jar.jar:o/isFromForm$write.class */
    public static abstract class write {
        public long a;
    }
}
