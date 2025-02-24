package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/ListNegaraORAdapter$ListNegaraORAdapterVH.class */
public final class ListNegaraORAdapter$ListNegaraORAdapterVH {
    public final ImageView a;
    public final setInputType b;
    public final TextView c;
    public final RelativeLayout d;
    public final RelativeLayout e;

    private ListNegaraORAdapter$ListNegaraORAdapterVH(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, setInputType setinputtype, ImageView imageView, TextView textView) {
        this.e = relativeLayout;
        this.d = relativeLayout2;
        this.b = setinputtype;
        this.a = imageView;
        this.c = textView;
    }

    public static ListNegaraORAdapter$ListNegaraORAdapterVH c(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = setCurrencyName.IconCompatParcelizer.ae;
        setInputType setinputtype = (setInputType) setRotation.a(view, setCurrencyName.IconCompatParcelizer.ae);
        if (setinputtype != null) {
            ImageView imageView = (ImageView) setRotation.a(view, 2131298789);
            if (imageView != null) {
                TextView textView = (TextView) setRotation.a(view, 2131298790);
                if (textView != null) {
                    return new ListNegaraORAdapter$ListNegaraORAdapterVH(relativeLayout, relativeLayout, setinputtype, imageView, textView);
                }
                i = 2131298790;
            } else {
                i = 2131298789;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
