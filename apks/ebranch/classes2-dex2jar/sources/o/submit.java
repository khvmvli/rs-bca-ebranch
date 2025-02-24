package o;

import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/submit.class */
final class submit {
    int a;
    int c;
    int d;
    int e;
    final View h;
    boolean f = true;
    boolean b = true;

    public submit(View view) {
        this.h = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        View view = this.h;
        findFragmentByWho.e(view, this.a - (view.getTop() - this.c));
        View view2 = this.h;
        findFragmentByWho.d(view2, this.d - (view2.getLeft() - this.e));
    }
}
