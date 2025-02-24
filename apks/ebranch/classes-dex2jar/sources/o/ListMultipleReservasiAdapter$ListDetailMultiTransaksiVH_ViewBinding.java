package o;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.class */
public final class ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding {
    public final setRequestHeaders a;
    public final Button b;
    public final setMaxHeight c;
    public final View d;
    public final setMaxHeight e;
    public final setMaxHeight f;
    public final ImageView g;
    public final ListNegaraBagianAdapter$ListNegaraAdapterVH h;
    public final ImageView i;
    public final ImageView j;
    public final Space l;
    public final TextView m;

    private ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding(setMaxHeight setmaxheight, View view, Button button, setMaxHeight setmaxheight2, setMaxHeight setmaxheight3, setRequestHeaders setrequestheaders, ListNegaraBagianAdapter$ListNegaraAdapterVH listNegaraBagianAdapter$ListNegaraAdapterVH, ImageView imageView, ImageView imageView2, ImageView imageView3, Space space, TextView textView) {
        this.f = setmaxheight;
        this.d = view;
        this.b = button;
        this.e = setmaxheight2;
        this.c = setmaxheight3;
        this.a = setrequestheaders;
        this.h = listNegaraBagianAdapter$ListNegaraAdapterVH;
        this.g = imageView;
        this.i = imageView2;
        this.j = imageView3;
        this.l = space;
        this.m = textView;
    }

    public static ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding c(View view) {
        int i = 2131296372;
        View a = setRotation.a(view, 2131296372);
        if (a != null) {
            Button button = (Button) setRotation.a(view, 2131296386);
            if (button != null) {
                setMaxHeight setmaxheight = (setMaxHeight) view;
                setMaxHeight setmaxheight2 = (setMaxHeight) setRotation.a(view, 2131296801);
                if (setmaxheight2 != null) {
                    setRequestHeaders a2 = setRotation.a(view, 2131297240);
                    if (a2 != null) {
                        View a3 = setRotation.a(view, 2131297289);
                        if (a3 != null) {
                            ListNegaraBagianAdapter$ListNegaraAdapterVH a4 = ListNegaraBagianAdapter$ListNegaraAdapterVH.a(a3);
                            ImageView imageView = (ImageView) setRotation.a(view, 2131297424);
                            if (imageView != null) {
                                ImageView imageView2 = (ImageView) setRotation.a(view, 2131297425);
                                if (imageView2 != null) {
                                    ImageView imageView3 = (ImageView) setRotation.a(view, 2131297426);
                                    if (imageView3 != null) {
                                        Space space = (Space) setRotation.a(view, 2131298391);
                                        if (space != null) {
                                            TextView textView = (TextView) setRotation.a(view, 2131299741);
                                            if (textView != null) {
                                                return new ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding(setmaxheight, a, button, setmaxheight, setmaxheight2, a2, a4, imageView, imageView2, imageView3, space, textView);
                                            }
                                            i = 2131299741;
                                        } else {
                                            i = 2131298391;
                                        }
                                    } else {
                                        i = 2131297426;
                                    }
                                } else {
                                    i = 2131297425;
                                }
                            } else {
                                i = 2131297424;
                            }
                        } else {
                            i = 2131297289;
                        }
                    } else {
                        i = 2131297240;
                    }
                } else {
                    i = 2131296801;
                }
            } else {
                i = 2131296386;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
