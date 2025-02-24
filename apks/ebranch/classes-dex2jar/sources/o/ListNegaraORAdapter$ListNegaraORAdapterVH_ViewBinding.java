package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.class */
public final class ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding {
    private final setInputType a;
    public final TextView c;
    public final setInputType d;

    private ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding(setInputType setinputtype, setInputType setinputtype2, TextView textView) {
        this.a = setinputtype;
        this.d = setinputtype2;
        this.c = textView;
    }

    public static ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding b(View view) {
        setInputType setinputtype = (setInputType) view;
        TextView textView = (TextView) setRotation.a(view, 2131298790);
        if (textView != null) {
            return new ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding(setinputtype, setinputtype, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131298790)));
    }
}
