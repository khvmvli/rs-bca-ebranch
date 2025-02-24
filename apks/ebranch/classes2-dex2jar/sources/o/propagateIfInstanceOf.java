package o;

import android.util.Log;
/* loaded from: classes2-dex2jar.jar:o/propagateIfInstanceOf.class */
public final class propagateIfInstanceOf {
    public static propagate<?> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(ArrayListAccumulator arrayListAccumulator) {
        if (a.a.g) {
            String str = a.a.h;
            String str2 = str;
            if (str == null) {
                str2 = documentProvider.a;
            }
            Log.i(str2, "Error dialog manager received exception", arrayListAccumulator.a);
        }
    }
}
