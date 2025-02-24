package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setKeepHint.class */
public final class setKeepHint extends setMask {
    public boolean a;
    private setCharRepresentation d;
    public List<Object> e;

    @Override // o.setScaleX
    public final int d() {
        return this.a ? this.e.size() * 100 : this.e.size();
    }

    @Override // o.setMask
    public final View e(int i, View view, ViewGroup viewGroup) {
        List<Object> list = this.e;
        if (this.a) {
            i %= list.size();
        }
        list.get(i);
        setCharRepresentation setcharrepresentation = this.d;
        if (this.a) {
            this.e.size();
        }
        return setcharrepresentation.e();
    }
}
