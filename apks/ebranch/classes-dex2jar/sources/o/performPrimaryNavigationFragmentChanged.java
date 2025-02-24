package o;

import java.util.HashMap;
/* loaded from: classes-dex2jar.jar:o/performPrimaryNavigationFragmentChanged.class */
public class performPrimaryNavigationFragmentChanged {
    public final HashMap<String, performPictureInPictureModeChanged> b = new HashMap<>();

    public final void b(String str, performPictureInPictureModeChanged performpictureinpicturemodechanged) {
        performPictureInPictureModeChanged put = this.b.put(str, performpictureinpicturemodechanged);
        if (put != null) {
            put.a();
        }
    }

    public final void e() {
        for (performPictureInPictureModeChanged performpictureinpicturemodechanged : this.b.values()) {
            performpictureinpicturemodechanged.c();
        }
        this.b.clear();
    }
}
