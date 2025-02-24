package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/ExpiredDateDialog.class */
public abstract class ExpiredDateDialog implements ExpiredDateDialog_ViewBinding {
    private BaseKonfirmasiDialog a;
    private final ArrayList<Animator.AnimatorListener> b = new ArrayList<>();
    private final Context c;
    private BaseKonfirmasiDialog d;
    final ExtendedFloatingActionButton e;
    private final ExitTransaksiDialog_ViewBinding h;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpiredDateDialog(ExtendedFloatingActionButton extendedFloatingActionButton, ExitTransaksiDialog_ViewBinding exitTransaksiDialog_ViewBinding) {
        this.e = extendedFloatingActionButton;
        this.c = extendedFloatingActionButton.getContext();
        this.h = exitTransaksiDialog_ViewBinding;
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public AnimatorSet a() {
        return e(d());
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public final void a(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        this.a = baseKonfirmasiDialog;
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public void b() {
        this.h.d = null;
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public void b(Animator animator) {
        ExitTransaksiDialog_ViewBinding exitTransaksiDialog_ViewBinding = this.h;
        Animator animator2 = exitTransaksiDialog_ViewBinding.d;
        if (animator2 != null) {
            animator2.cancel();
        }
        exitTransaksiDialog_ViewBinding.d = animator;
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public void c() {
        this.h.d = null;
    }

    public final BaseKonfirmasiDialog d() {
        BaseKonfirmasiDialog baseKonfirmasiDialog = this.a;
        if (baseKonfirmasiDialog != null) {
            return baseKonfirmasiDialog;
        }
        if (this.d == null) {
            this.d = BaseKonfirmasiDialog.b(this.c, j());
        }
        return this.d;
    }

    public final AnimatorSet e(BaseKonfirmasiDialog baseKonfirmasiDialog) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (baseKonfirmasiDialog.a.get("opacity") != null) {
            arrayList.add(baseKonfirmasiDialog.a("opacity", this.e, View.ALPHA));
        }
        if (baseKonfirmasiDialog.a.get("scale") != null) {
            arrayList.add(baseKonfirmasiDialog.a("scale", this.e, View.SCALE_Y));
            arrayList.add(baseKonfirmasiDialog.a("scale", this.e, View.SCALE_X));
        }
        if (baseKonfirmasiDialog.a.get("width") != null) {
            arrayList.add(baseKonfirmasiDialog.a("width", this.e, ExtendedFloatingActionButton.f));
        }
        if (baseKonfirmasiDialog.a.get("height") != null) {
            arrayList.add(baseKonfirmasiDialog.a("height", this.e, ExtendedFloatingActionButton.g));
        }
        if (baseKonfirmasiDialog.a.get("paddingStart") != null) {
            arrayList.add(baseKonfirmasiDialog.a("paddingStart", this.e, ExtendedFloatingActionButton.j));
        }
        if (baseKonfirmasiDialog.a.get("paddingEnd") != null) {
            arrayList.add(baseKonfirmasiDialog.a("paddingEnd", this.e, ExtendedFloatingActionButton.i));
        }
        if (baseKonfirmasiDialog.a.get("labelOpacity") == null) {
            z = false;
        }
        if (z) {
            arrayList.add(baseKonfirmasiDialog.a("labelOpacity", this.e, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: o.ExpiredDateDialog.5
                /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.TextView, android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
                @Override // android.util.Property
                public final /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
                    return Float.valueOf((((((float) Color.alpha(extendedFloatingActionButton2.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton2.q.getColorForState(extendedFloatingActionButton2.getDrawableState(), ExpiredDateDialog.this.e.q.getDefaultColor())))) * 1.0f) + 0.0f);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
                @Override // android.util.Property
                public final /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
                    Float f2 = f;
                    int colorForState = extendedFloatingActionButton2.q.getColorForState(extendedFloatingActionButton2.getDrawableState(), ExpiredDateDialog.this.e.q.getDefaultColor());
                    ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((f2.floatValue() * ((((float) Color.alpha(colorForState)) / 255.0f) - 0.0f)) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f2.floatValue() == 1.0f) {
                        extendedFloatingActionButton2.e(extendedFloatingActionButton2.q);
                    } else {
                        extendedFloatingActionButton2.e(valueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        initView.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // o.ExpiredDateDialog_ViewBinding
    public final List<Animator.AnimatorListener> e() {
        return this.b;
    }
}
