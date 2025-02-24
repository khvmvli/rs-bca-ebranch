package o;

import android.content.Context;
import android.util.AttributeSet;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:o/setState.class */
public class setState extends setId {
    public setState(Context context) {
        super(context);
    }

    public setState(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setState(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setId
    public final void a(AttributeSet attributeSet) {
        a(attributeSet);
        this.f = false;
    }

    @Override // o.setId
    public final void e() {
        setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) getLayoutParams();
        remoteActionCompatParcelizer.ao.n(0);
        remoteActionCompatParcelizer.ao.i(0);
    }

    @Override // o.setId, android.view.View
    public void onAttachedToWindow() {
        onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        setElevation(f);
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        b();
    }
}
