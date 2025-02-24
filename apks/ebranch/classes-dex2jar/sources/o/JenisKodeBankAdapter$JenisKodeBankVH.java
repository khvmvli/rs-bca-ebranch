package o;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewAnimator;
/* loaded from: classes-dex2jar.jar:o/JenisKodeBankAdapter$JenisKodeBankVH.class */
public final class JenisKodeBankAdapter$JenisKodeBankVH {
    public final ListNegaraORAdapter$ListNegaraORAdapterVH a;
    public final ProgressBar b;
    public final LinearLayout c;
    public final EditText d;
    public final ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding e;
    public final ViewAnimator g;
    public final LinearLayout h;
    public final setOnStartEnterTransitionListener i;
    public final TextView j;

    private JenisKodeBankAdapter$JenisKodeBankVH(LinearLayout linearLayout, EditText editText, ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding listProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding, ListNegaraORAdapter$ListNegaraORAdapterVH listNegaraORAdapter$ListNegaraORAdapterVH, LinearLayout linearLayout2, ProgressBar progressBar, setOnStartEnterTransitionListener setonstartentertransitionlistener, TextView textView, ViewAnimator viewAnimator) {
        this.h = linearLayout;
        this.d = editText;
        this.e = listProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding;
        this.a = listNegaraORAdapter$ListNegaraORAdapterVH;
        this.c = linearLayout2;
        this.b = progressBar;
        this.i = setonstartentertransitionlistener;
        this.j = textView;
        this.g = viewAnimator;
    }

    public static JenisKodeBankAdapter$JenisKodeBankVH c(View view) {
        int i = 2131296980;
        EditText editText = (EditText) setRotation.a(view, 2131296980);
        if (editText != null) {
            View a = setRotation.a(view, 2131297483);
            if (a != null) {
                ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding b = ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding.b(a);
                View a2 = setRotation.a(view, 2131297501);
                if (a2 != null) {
                    ListNegaraORAdapter$ListNegaraORAdapterVH c = ListNegaraORAdapter$ListNegaraORAdapterVH.c(a2);
                    LinearLayout linearLayout = (LinearLayout) setRotation.a(view, 2131297537);
                    if (linearLayout != null) {
                        ProgressBar progressBar = (ProgressBar) setRotation.a(view, 2131298110);
                        if (progressBar != null) {
                            setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(view, 2131298328);
                            if (setonstartentertransitionlistener != null) {
                                TextView textView = (TextView) setRotation.a(view, 2131298890);
                                if (textView != null) {
                                    ViewAnimator viewAnimator = (ViewAnimator) setRotation.a(view, 2131299749);
                                    if (viewAnimator != null) {
                                        return new JenisKodeBankAdapter$JenisKodeBankVH((LinearLayout) view, editText, b, c, linearLayout, progressBar, setonstartentertransitionlistener, textView, viewAnimator);
                                    }
                                    i = 2131299749;
                                } else {
                                    i = 2131298890;
                                }
                            } else {
                                i = 2131298328;
                            }
                        } else {
                            i = 2131298110;
                        }
                    } else {
                        i = 2131297537;
                    }
                } else {
                    i = 2131297501;
                }
            } else {
                i = 2131297483;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
