package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/CameraDialog.class */
public abstract class CameraDialog extends cancelReservationAndTransaction<View> {
    public int d;
    protected final Rect b = new Rect();
    final Rect c = new Rect();
    private int e = 0;

    public CameraDialog() {
    }

    public CameraDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final int a(View view) {
        int i = 0;
        if (this.d != 0) {
            float b = b(view);
            i = this.d;
            int i2 = (int) (b * ((float) i));
            if (i2 < 0) {
                i = 0;
            } else if (i2 <= i) {
                i = i2;
            }
        }
        return i;
    }

    protected float b(View view) {
        return 1.0f;
    }

    protected final int b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.cancelReservationAndTransaction
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View d = d(coordinatorLayout.a(view));
        if (d != null) {
            CoordinatorLayout.read layoutParams = view.getLayoutParams();
            Rect rect = this.b;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, d.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + d.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            WindowInsetsCompat windowInsetsCompat = coordinatorLayout.i;
            if (windowInsetsCompat != null && findFragmentByWho.h(coordinatorLayout) && !findFragmentByWho.h(view)) {
                rect.left += windowInsetsCompat.i();
                rect.right -= windowInsetsCompat.f();
            }
            Rect rect2 = this.c;
            int i2 = layoutParams.d;
            if (i2 == 0) {
                i2 = 8388659;
            }
            onGetLayoutInflater.b(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a = a(d);
            view.layout(rect2.left, rect2.top - a, rect2.right, rect2.bottom - a);
            this.e = rect2.top - d.getBottom();
            return;
        }
        b(coordinatorLayout, view, i);
        this.e = 0;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View d;
        int i5;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (d = d(coordinatorLayout.a(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            i5 = size;
            if (findFragmentByWho.h(d)) {
                WindowInsetsCompat windowInsetsCompat = coordinatorLayout.i;
                i5 = size;
                if (windowInsetsCompat != null) {
                    i5 = size + windowInsetsCompat.h() + windowInsetsCompat.j();
                }
            }
        } else {
            i5 = coordinatorLayout.getHeight();
        }
        int e = e(d);
        coordinatorLayout.d(view, i, i2, View.MeasureSpec.makeMeasureSpec((i5 + e) - d.getMeasuredHeight(), i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public final void c(int i) {
        this.d = i;
    }

    protected abstract View d(List<View> list);

    public int e(View view) {
        return view.getMeasuredHeight();
    }
}
