package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/ListNegaraBagianAdapter$ListNegaraAdapterVH.class */
public final class ListNegaraBagianAdapter$ListNegaraAdapterVH {
    public final TextView a;
    public final setWeightSum b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    private final setWeightSum i;

    private ListNegaraBagianAdapter$ListNegaraAdapterVH(setWeightSum setweightsum, setWeightSum setweightsum2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.i = setweightsum;
        this.b = setweightsum2;
        this.d = textView;
        this.e = textView2;
        this.a = textView3;
        this.c = textView4;
    }

    public static ListNegaraBagianAdapter$ListNegaraAdapterVH a(View view) {
        setWeightSum setweightsum = (setWeightSum) view;
        int i = 2131299314;
        TextView textView = (TextView) setRotation.a(view, 2131299314);
        if (textView != null) {
            TextView textView2 = (TextView) setRotation.a(view, 2131299417);
            if (textView2 != null) {
                TextView textView3 = (TextView) setRotation.a(view, 2131299496);
                if (textView3 != null) {
                    TextView textView4 = (TextView) setRotation.a(view, 2131299681);
                    if (textView4 != null) {
                        return new ListNegaraBagianAdapter$ListNegaraAdapterVH(setweightsum, setweightsum, textView, textView2, textView3, textView4);
                    }
                    i = 2131299681;
                } else {
                    i = 2131299496;
                }
            } else {
                i = 2131299417;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
