package o;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding.class */
public final class ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding {
    public final Button a;
    private final LinearLayout d;
    public final TextView e;

    private ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding(LinearLayout linearLayout, Button button, TextView textView) {
        this.d = linearLayout;
        this.a = button;
        this.e = textView;
    }

    public static ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding b(View view) {
        int i = 2131296446;
        Button button = (Button) setRotation.a(view, 2131296446);
        if (button != null) {
            TextView textView = (TextView) setRotation.a(view, 2131299071);
            if (textView != null) {
                return new ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding((LinearLayout) view, button, textView);
            }
            i = 2131299071;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
