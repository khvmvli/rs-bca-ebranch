package o;

import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes2-dex2jar.jar:o/documentProvider$1.class */
final /* synthetic */ class documentProvider$1 {
    static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        c = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            c[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            c[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            c[ThreadMode.BACKGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            c[ThreadMode.ASYNC.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
