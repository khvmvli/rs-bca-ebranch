package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/getIncomeDisplayAmount.class */
public class getIncomeDisplayAmount extends setOnStartEnterTransitionListener {
    private setOnStartEnterTransitionListener.IconCompatParcelizer aa = new setOnStartEnterTransitionListener.IconCompatParcelizer() { // from class: o.getIncomeDisplayAmount.5
        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void b() {
            setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = getIncomeDisplayAmount.this.g;
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null && getIncomeDisplayAmount.this.ac != null) {
                if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() == 0) {
                    getIncomeDisplayAmount.this.ac.setVisibility(0);
                    getIncomeDisplayAmount.this.setVisibility(8);
                    return;
                }
                getIncomeDisplayAmount.this.ac.setVisibility(8);
                getIncomeDisplayAmount.this.setVisibility(0);
            }
        }
    };
    private View ac;

    public getIncomeDisplayAmount(Context context) {
        super(context);
    }

    public getIncomeDisplayAmount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public getIncomeDisplayAmount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.setOnStartEnterTransitionListener
    public void setAdapter(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
        setAdapter(setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver);
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.a.registerObserver(this.aa);
        }
        this.aa.b();
    }

    public void setEmptyView(View view) {
        this.ac = view;
    }
}
