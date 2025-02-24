package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/ListMultipleReservasiAdapter$ListMultipleReservasiVH.class */
public final class ListMultipleReservasiAdapter$ListMultipleReservasiVH {
    public final TextView a;
    public final setTag b;
    public final TextView c;
    public final View d;
    public final setMaxHeight e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    private ListMultipleReservasiAdapter$ListMultipleReservasiVH(setMaxHeight setmaxheight, setTag settag, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.e = setmaxheight;
        this.b = settag;
        this.d = view;
        this.c = textView;
        this.a = textView2;
        this.f = textView3;
        this.h = textView4;
        this.g = textView5;
    }

    public static ListMultipleReservasiAdapter$ListMultipleReservasiVH e(View view) {
        int i = 2131296346;
        setTag settag = (setTag) setRotation.a(view, 2131296346);
        if (settag != null) {
            View a = setRotation.a(view, 2131298372);
            if (a != null) {
                TextView textView = (TextView) setRotation.a(view, 2131299468);
                if (textView != null) {
                    TextView textView2 = (TextView) setRotation.a(view, 2131299485);
                    if (textView2 != null) {
                        TextView textView3 = (TextView) setRotation.a(view, 2131299518);
                        if (textView3 != null) {
                            TextView textView4 = (TextView) setRotation.a(view, 2131299519);
                            if (textView4 != null) {
                                TextView textView5 = (TextView) setRotation.a(view, 2131299660);
                                if (textView5 != null) {
                                    return new ListMultipleReservasiAdapter$ListMultipleReservasiVH((setMaxHeight) view, settag, a, textView, textView2, textView3, textView4, textView5);
                                }
                                i = 2131299660;
                            } else {
                                i = 2131299519;
                            }
                        } else {
                            i = 2131299518;
                        }
                    } else {
                        i = 2131299485;
                    }
                } else {
                    i = 2131299468;
                }
            } else {
                i = 2131298372;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
