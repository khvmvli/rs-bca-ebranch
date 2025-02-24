package o;

import android.os.Build;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setOnSearchClickListener.class */
public class setOnSearchClickListener {
    public static void b(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            setOnQueryTextListener.e(view, charSequence);
        }
    }
}
