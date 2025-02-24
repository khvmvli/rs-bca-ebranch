package o;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* loaded from: classes-dex2jar.jar:o/setDropDownWidth.class */
class setDropDownWidth {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputConnection e(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof setQueryRefinementEnabled) {
                    editorInfo.hintText = ((setQueryRefinementEnabled) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}
