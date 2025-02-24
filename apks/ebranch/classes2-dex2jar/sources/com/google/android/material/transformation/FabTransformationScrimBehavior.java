package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o.BidangPekerjaanDialog_ViewBinding;
import o.initView;
@Deprecated
/* loaded from: classes2-dex2jar.jar:com/google/android/material/transformation/FabTransformationScrimBehavior.class */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final BidangPekerjaanDialog_ViewBinding b = new BidangPekerjaanDialog_ViewBinding(75, 150);
    private final BidangPekerjaanDialog_ViewBinding c = new BidangPekerjaanDialog_ViewBinding(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected final AnimatorSet c(View view, final View view2, final boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding = z ? this.b : this.c;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        bidangPekerjaanDialog_ViewBinding.b(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        initView.a(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationScrimBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    public final boolean c(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return e(coordinatorLayout, view, motionEvent);
    }
}
