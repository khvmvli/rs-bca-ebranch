package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/setWarkat.class */
public final class setWarkat {
    public final TextView a;
    public final TextView b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;

    private setWarkat(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.c = linearLayout;
        this.e = textView;
        this.b = textView2;
        this.a = textView3;
        this.d = textView4;
    }

    public static setWarkat b(View view) {
        int i = setCurrencyName.IconCompatParcelizer.g;
        TextView textView = (TextView) setRotation.a(view, i);
        if (textView != null) {
            i = setCurrencyName.IconCompatParcelizer.k;
            TextView textView2 = (TextView) setRotation.a(view, i);
            if (textView2 != null) {
                i = setCurrencyName.IconCompatParcelizer.u;
                TextView textView3 = (TextView) setRotation.a(view, i);
                if (textView3 != null) {
                    i = setCurrencyName.IconCompatParcelizer.U;
                    TextView textView4 = (TextView) setRotation.a(view, i);
                    if (textView4 != null) {
                        return new setWarkat((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
