package o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CustomVersionedParcelable.class */
public final class CustomVersionedParcelable {
    static final ViewGroup.MarginLayoutParams c;
    LinearLayoutManager a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        c = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomVersionedParcelable(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    private static boolean e(View view) {
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition != null && layoutTransition.isChangingLayout()) {
            return true;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (e(viewGroup.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        int m = this.a.m();
        for (int i = 0; i < m; i++) {
            if (e(this.a.h(i))) {
                return true;
            }
        }
        return false;
    }
}
