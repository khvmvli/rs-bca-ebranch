package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import o.BaseDialogKotlin;
import o.BaseKonfirmasiDialog;
import o.CancelAskTransaksiDialog;
import o.findFragmentByWho;
@Deprecated
/* loaded from: classes2-dex2jar.jar:com/google/android/material/transformation/FabTransformationSheetBehavior.class */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map<View, Integer> e;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected final boolean d(View view, View view2, boolean z, boolean z2) {
        CoordinatorLayout parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.e = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.read) && (childAt.getLayoutParams().g instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.e;
                        if (map != null && map.containsKey(childAt)) {
                            findFragmentByWho.j(childAt, this.e.get(childAt).intValue());
                        }
                    } else {
                        this.e.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        findFragmentByWho.j(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.e = null;
            }
        }
        return d(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected final FabTransformationBehavior.write e(Context context, boolean z) {
        int i = z ? BaseDialogKotlin.write.i : BaseDialogKotlin.write.h;
        FabTransformationBehavior.write write = new FabTransformationBehavior.write();
        write.e = BaseKonfirmasiDialog.b(context, i);
        write.d = new CancelAskTransaksiDialog(17, 0.0f, 0.0f);
        return write;
    }
}
