package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/getAllowEnterTransitionOverlap.class */
public final class getAllowEnterTransitionOverlap extends ClickableSpan {
    private final int a;
    private final getChildFragmentManager b;
    private final int d;

    public getAllowEnterTransitionOverlap(int i, getChildFragmentManager getchildfragmentmanager, int i2) {
        this.d = i;
        this.b = getchildfragmentmanager;
        this.a = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.b.b(this.a, bundle);
    }
}
