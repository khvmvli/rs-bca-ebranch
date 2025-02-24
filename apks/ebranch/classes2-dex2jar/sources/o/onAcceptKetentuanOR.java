package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import o.OR5DataPenerimaFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/onAcceptKetentuanOR.class */
public class onAcceptKetentuanOR extends pilihNegaraBagian {
    public onAcceptKetentuanOR(Context context) {
        super(context);
    }

    public onAcceptKetentuanOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public onAcceptKetentuanOR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.pilihTipeTujuanTransaksiPenerima
    protected final void b(final float f) {
        if (this.d != null) {
            this.c.removeCallbacksAndMessages(this.e);
        }
        for (final onDismissWarningDialog ondismisswarningdialog : this.b) {
            final int intValue = ((Integer) ondismisswarningdialog.getTag()).intValue();
            final double ceil = Math.ceil((double) f);
            if (((double) intValue) > ceil) {
                ondismisswarningdialog.setEmpty();
            } else {
                this.d = new Runnable() { // from class: o.onAcceptKetentuanOR.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((double) intValue) == ceil) {
                            ondismisswarningdialog.setPartialFilled(f);
                        } else {
                            ondismisswarningdialog.setFilled();
                        }
                        if (((float) intValue) == f) {
                            Animation loadAnimation = AnimationUtils.loadAnimation(onAcceptKetentuanOR.this.getContext(), OR5DataPenerimaFragment_ViewBinding.write.e);
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(onAcceptKetentuanOR.this.getContext(), OR5DataPenerimaFragment_ViewBinding.write.d);
                            ondismisswarningdialog.startAnimation(loadAnimation);
                            ondismisswarningdialog.startAnimation(loadAnimation2);
                        }
                    }
                };
                d(this.d, 15);
            }
        }
    }
}
