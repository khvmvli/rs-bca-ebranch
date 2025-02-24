package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/DetailOpenTellerActivity_ViewBinding.class */
public final class DetailOpenTellerActivity_ViewBinding extends setScaleX {
    private Context d;
    private final int[] e = {2131231189, 2131231190, 2131231191};
    private final int[] a = {2131821422, 2131821423, 2131821424};

    public DetailOpenTellerActivity_ViewBinding(Context context) {
        this.d = context;
    }

    @Override // o.setScaleX
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // o.setScaleX
    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    @Override // o.setScaleX
    public final int d() {
        return this.e.length;
    }

    @Override // o.setScaleX
    public final Object e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.d).inflate(2131493468, viewGroup, false);
        ((TextView) inflate.findViewById(2131298875)).setText(this.a[i]);
        ((ImageView) inflate.findViewById(2131297325)).setImageResource(this.e[i]);
        viewGroup.addView(inflate);
        return inflate;
    }
}
