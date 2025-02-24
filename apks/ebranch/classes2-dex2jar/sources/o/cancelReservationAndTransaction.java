package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes2-dex2jar.jar:o/cancelReservationAndTransaction.class */
public class cancelReservationAndTransaction<V extends View> extends CoordinatorLayout.write<V> {
    private int a = 0;
    private int b = 0;
    private submit d;

    public cancelReservationAndTransaction() {
    }

    public cancelReservationAndTransaction(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i) {
        submit submit = this.d;
        if (submit == null) {
            this.a = i;
            return false;
        } else if (!submit.f || submit.a == i) {
            return false;
        } else {
            submit.a = i;
            submit.b();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.d(v, i);
    }

    public int d() {
        submit submit = this.d;
        return submit != null ? submit.a : 0;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.d == null) {
            this.d = new submit(v);
        }
        submit submit = this.d;
        submit.c = submit.h.getTop();
        submit.e = submit.h.getLeft();
        this.d.b();
        int i2 = this.a;
        if (i2 != 0) {
            submit submit2 = this.d;
            if (submit2.f && submit2.a != i2) {
                submit2.a = i2;
                submit2.b();
            }
            this.a = 0;
        }
        int i3 = this.b;
        if (i3 == 0) {
            return true;
        }
        submit submit3 = this.d;
        if (submit3.b && submit3.d != i3) {
            submit3.d = i3;
            submit3.b();
        }
        this.b = 0;
        return true;
    }
}
