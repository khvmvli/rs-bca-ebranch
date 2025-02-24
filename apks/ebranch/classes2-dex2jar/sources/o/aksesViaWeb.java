package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes2-dex2jar.jar:o/aksesViaWeb.class */
public final class aksesViaWeb {
    public static TextView c(setInputType setinputtype, CharSequence charSequence) {
        for (int i = 0; i < setinputtype.getChildCount(); i++) {
            View childAt = setinputtype.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }
}
