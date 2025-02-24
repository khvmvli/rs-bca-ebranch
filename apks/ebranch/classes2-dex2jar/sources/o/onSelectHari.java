package o;

import android.animation.Animator;
import o.getPivotY;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onSelectHari.class */
public abstract class onSelectHari<T extends Animator> {
    protected final float[] f = new float[2];
    protected final int[] h = new int[1];
    protected onClickCancel j;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSelectHari(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(onClickCancel onclickcancel) {
        this.j = onclickcancel;
    }

    public abstract void b();

    public abstract void c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    public abstract void d(getPivotY.IconCompatParcelizer iconCompatParcelizer);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();
}
