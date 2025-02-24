package o;

import android.os.Bundle;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/getContext.class */
public interface getContext {

    /* loaded from: classes-dex2jar.jar:o/getContext$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends write {
    }

    /* loaded from: classes-dex2jar.jar:o/getContext$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends write {
    }

    /* loaded from: classes-dex2jar.jar:o/getContext$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends write {
    }

    /* loaded from: classes-dex2jar.jar:o/getContext$read.class */
    public static final class read extends write {
    }

    /* loaded from: classes-dex2jar.jar:o/getContext$write.class */
    public static abstract class write {
        Bundle c;
    }

    boolean b(View view);
}
