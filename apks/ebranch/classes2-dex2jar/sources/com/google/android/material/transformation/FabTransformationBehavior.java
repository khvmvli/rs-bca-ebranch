package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.BaseDialogKotlin$MediaBrowserCompat$ItemReceiver;
import o.BaseInfoDialog;
import o.BaseKonfirmasiDialog;
import o.BaseKonfirmasiDialog_ViewBinding;
import o.BidangPekerjaanDialog_ViewBinding;
import o.CancelAskTransaksiDialog;
import o.CancelTransaksiDialog_ViewBinding;
import o.CategoryListDialog_ViewBinding;
import o.DeleteAccountFailedDialog;
import o.DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver;
import o.HaloBCADialog_ViewBinding;
import o.PilihHubunganPemilikSumberDanaDialog_ViewBinding;
import o.PilihJenisIdentitasPemilikSumberDanaDialog;
import o.findFragmentByWho;
import o.getContentView;
import o.initView;
import o.unbindViews;
@Deprecated
/* loaded from: classes2-dex2jar.jar:com/google/android/material/transformation/FabTransformationBehavior.class */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float b;
    private final int[] c;
    private float e;
    private final RectF g;
    private final Rect i;
    private final RectF j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2-dex2jar.jar:com/google/android/material/transformation/FabTransformationBehavior$write.class */
    public static final class write {
        public CancelAskTransaksiDialog d;
        public BaseKonfirmasiDialog e;
    }

    public FabTransformationBehavior() {
        this.i = new Rect();
        this.g = new RectF();
        this.j = new RectF();
        this.c = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.g = new RectF();
        this.j = new RectF();
        this.c = new int[2];
    }

    private static void a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private float b(View view, View view2, CancelAskTransaksiDialog cancelAskTransaksiDialog) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.g;
        RectF rectF2 = this.j;
        b(view, rectF);
        rectF.offset(this.b, this.e);
        b(view2, rectF2);
        int i = cancelAskTransaksiDialog.d & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + cancelAskTransaksiDialog.c;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + cancelAskTransaksiDialog.c;
    }

    private void b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.c;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private static float c(write write2, BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding, float f, float f2) {
        long j = bidangPekerjaanDialog_ViewBinding.d;
        long j2 = bidangPekerjaanDialog_ViewBinding.e;
        BidangPekerjaanDialog_ViewBinding c = write2.e.c("expansion");
        float f3 = ((float) (((c.d + c.e) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = bidangPekerjaanDialog_ViewBinding.c;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if (timeInterpolator == null) {
            timeInterpolator2 = unbindViews.d;
        }
        return f + (timeInterpolator2.getInterpolation(f3) * (f2 - f));
    }

    private float d(View view, View view2, CancelAskTransaksiDialog cancelAskTransaksiDialog) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.g;
        RectF rectF2 = this.j;
        b(view, rectF);
        rectF.offset(this.b, this.e);
        b(view2, rectF2);
        int i = cancelAskTransaksiDialog.d & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + cancelAskTransaksiDialog.e;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + cancelAskTransaksiDialog.e;
    }

    private static Pair<BidangPekerjaanDialog_ViewBinding, BidangPekerjaanDialog_ViewBinding> e(float f, float f2, boolean z, write write2) {
        BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding;
        BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            bidangPekerjaanDialog_ViewBinding2 = write2.e.c("translationXLinear");
            bidangPekerjaanDialog_ViewBinding = write2.e.c("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            bidangPekerjaanDialog_ViewBinding2 = write2.e.c("translationXCurveDownwards");
            bidangPekerjaanDialog_ViewBinding = write2.e.c("translationYCurveDownwards");
        } else {
            bidangPekerjaanDialog_ViewBinding2 = write2.e.c("translationXCurveUpwards");
            bidangPekerjaanDialog_ViewBinding = write2.e.c("translationYCurveUpwards");
        }
        return new Pair<>(bidangPekerjaanDialog_ViewBinding2, bidangPekerjaanDialog_ViewBinding);
    }

    private void e(View view, View view2, boolean z, boolean z2, write write2, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        DeleteAccountFailedDialog deleteAccountFailedDialog;
        if (view2 instanceof DeleteAccountFailedDialog) {
            final DeleteAccountFailedDialog deleteAccountFailedDialog2 = (DeleteAccountFailedDialog) view2;
            CancelAskTransaksiDialog cancelAskTransaksiDialog = write2.d;
            RectF rectF = this.g;
            RectF rectF2 = this.j;
            b(view, rectF);
            rectF.offset(this.b, this.e);
            b(view2, rectF2);
            rectF2.offset(-b(view, view2, cancelAskTransaksiDialog), 0.0f);
            float centerX = rectF.centerX() - rectF2.left;
            CancelAskTransaksiDialog cancelAskTransaksiDialog2 = write2.d;
            RectF rectF3 = this.g;
            RectF rectF4 = this.j;
            b(view, rectF3);
            rectF3.offset(this.b, this.e);
            b(view2, rectF4);
            rectF4.offset(0.0f, -d(view, view2, cancelAskTransaksiDialog2));
            float centerY = rectF3.centerY() - rectF4.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect = this.i;
            if (findFragmentByWho.G(floatingActionButton)) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.b(rect);
            }
            float width = ((float) this.i.width()) / 2.0f;
            BidangPekerjaanDialog_ViewBinding c = write2.e.c("expansion");
            if (z) {
                if (!z2) {
                    deleteAccountFailedDialog2.setRevealInfo(new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver(centerX, centerY, width));
                }
                if (z2) {
                    width = deleteAccountFailedDialog2.a().e;
                }
                Animator a = CancelTransaksiDialog_ViewBinding.a(deleteAccountFailedDialog2, centerX, centerY, HaloBCADialog_ViewBinding.a(centerX, centerY, 0.0f, 0.0f, f, f2));
                a.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a2 = deleteAccountFailedDialog2.a();
                        a2.e = Float.MAX_VALUE;
                        deleteAccountFailedDialog2.setRevealInfo(a2);
                    }
                });
                a(view2, c.d, (int) centerX, (int) centerY, width, list);
                deleteAccountFailedDialog = deleteAccountFailedDialog2;
                animator = a;
            } else {
                float f3 = deleteAccountFailedDialog2.a().e;
                animator = CancelTransaksiDialog_ViewBinding.a(deleteAccountFailedDialog2, centerX, centerY, width);
                long j = c.d;
                int i = (int) centerX;
                int i2 = (int) centerY;
                a(view2, j, i, i2, f3, list);
                long j2 = c.d;
                long j3 = c.e;
                BaseKonfirmasiDialog baseKonfirmasiDialog = write2.e;
                int size = baseKonfirmasiDialog.c.size();
                deleteAccountFailedDialog = deleteAccountFailedDialog2;
                long j4 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding = (BidangPekerjaanDialog_ViewBinding) baseKonfirmasiDialog.c.h[(i3 << 1) + 1];
                    j4 = Math.max(j4, bidangPekerjaanDialog_ViewBinding.d + bidangPekerjaanDialog_ViewBinding.e);
                }
                long j5 = j2 + j3;
                if (j5 < j4) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, width, width);
                    createCircularReveal.setStartDelay(j5);
                    createCircularReveal.setDuration(j4 - j5);
                    list.add(createCircularReveal);
                }
            }
            c.b(animator);
            list.add(animator);
            list2.add(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x023e: INVOKE  
                  (r19v0 'list2' java.util.List<android.animation.Animator$AnimatorListener>)
                  (wrap: o.CancelTransaksiDialog_ViewBinding$3 : 0x023b: CONSTRUCTOR  (r1v20 o.CancelTransaksiDialog_ViewBinding$3 A[REMOVE]) = (r11v2 'deleteAccountFailedDialog' o.DeleteAccountFailedDialog) call: o.CancelTransaksiDialog_ViewBinding.3.<init>(o.DeleteAccountFailedDialog):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.List.add(java.lang.Object):boolean in method: com.google.android.material.transformation.FabTransformationBehavior.e(android.view.View, android.view.View, boolean, boolean, com.google.android.material.transformation.FabTransformationBehavior$write, float, float, java.util.List<android.animation.Animator>, java.util.List<android.animation.Animator$AnimatorListener>):void, file: classes2-dex2jar.jar:com/google/android/material/transformation/FabTransformationBehavior.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.CancelTransaksiDialog_ViewBinding, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 23 more
                */
            /*
            // Method dump skipped, instructions count: 581
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.e(android.view.View, android.view.View, boolean, boolean, com.google.android.material.transformation.FabTransformationBehavior$write, float, float, java.util.List, java.util.List):void");
        }

        @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
        protected final AnimatorSet c(final View view, final View view2, final boolean z, boolean z2) {
            Animator animator;
            Animator animator2;
            Animator animator3;
            Animator animator4;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2;
            write e = e(view2.getContext(), z);
            if (z) {
                this.b = view.getTranslationX();
                this.e = view.getTranslationY();
            }
            List<Animator> arrayList = new ArrayList<>();
            List<Animator.AnimatorListener> arrayList2 = new ArrayList<>();
            float j = findFragmentByWho.j(view2) - findFragmentByWho.j(view);
            if (z) {
                if (!z2) {
                    view2.setTranslationZ(-j);
                }
                animator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
            } else {
                animator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -j);
            }
            e.e.c("elevation").b(animator);
            arrayList.add(animator);
            RectF rectF = this.g;
            float b = b(view, view2, e.d);
            float d = d(view, view2, e.d);
            Pair<BidangPekerjaanDialog_ViewBinding, BidangPekerjaanDialog_ViewBinding> e2 = e(b, d, z, e);
            BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding = (BidangPekerjaanDialog_ViewBinding) e2.first;
            BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding2 = (BidangPekerjaanDialog_ViewBinding) e2.second;
            if (z) {
                if (!z2) {
                    view2.setTranslationX(-b);
                    view2.setTranslationY(-d);
                }
                animator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
                animator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
                float f = -b;
                float f2 = -d;
                float c = c(e, bidangPekerjaanDialog_ViewBinding, f, 0.0f);
                float c2 = c(e, bidangPekerjaanDialog_ViewBinding2, f2, 0.0f);
                Rect rect = this.i;
                view2.getWindowVisibleDisplayFrame(rect);
                RectF rectF2 = this.g;
                rectF2.set(rect);
                RectF rectF3 = this.j;
                b(view2, rectF3);
                rectF3.offset(c, c2);
                rectF3.intersect(rectF2);
                rectF.set(rectF3);
            } else {
                animator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -b);
                animator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -d);
            }
            bidangPekerjaanDialog_ViewBinding.b(animator3);
            bidangPekerjaanDialog_ViewBinding2.b(animator2);
            arrayList.add(animator3);
            arrayList.add(animator2);
            float width = rectF.width();
            float height = rectF.height();
            float b2 = b(view, view2, e.d);
            float d2 = d(view, view2, e.d);
            Pair<BidangPekerjaanDialog_ViewBinding, BidangPekerjaanDialog_ViewBinding> e3 = e(b2, d2, z, e);
            BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding3 = (BidangPekerjaanDialog_ViewBinding) e3.first;
            BidangPekerjaanDialog_ViewBinding bidangPekerjaanDialog_ViewBinding4 = (BidangPekerjaanDialog_ViewBinding) e3.second;
            Property property = View.TRANSLATION_X;
            if (!z) {
                b2 = this.b;
            }
            Animator ofFloat = ObjectAnimator.ofFloat(view, property, b2);
            Animator ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, z ? d2 : this.e);
            bidangPekerjaanDialog_ViewBinding3.b(ofFloat);
            bidangPekerjaanDialog_ViewBinding4.b(ofFloat2);
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            boolean z3 = view2 instanceof DeleteAccountFailedDialog;
            if (z3 && (view instanceof ImageView)) {
                final DeleteAccountFailedDialog deleteAccountFailedDialog = (DeleteAccountFailedDialog) view2;
                final Drawable drawable = ((ImageView) view).getDrawable();
                if (drawable != null) {
                    drawable.mutate();
                    if (z) {
                        if (!z2) {
                            drawable.setAlpha(255);
                        }
                        objectAnimator2 = ObjectAnimator.ofInt(drawable, BaseKonfirmasiDialog_ViewBinding.c, 0);
                    } else {
                        objectAnimator2 = ObjectAnimator.ofInt(drawable, BaseKonfirmasiDialog_ViewBinding.c, 255);
                    }
                    objectAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            view2.invalidate();
                        }
                    });
                    e.e.c("iconFade").b(objectAnimator2);
                    arrayList.add(objectAnimator2);
                    arrayList2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator5) {
                            deleteAccountFailedDialog.setCircularRevealOverlayDrawable(null);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator5) {
                            deleteAccountFailedDialog.setCircularRevealOverlayDrawable(drawable);
                        }
                    });
                }
            }
            e(view, view2, z, z2, e, width, height, arrayList, arrayList2);
            if (z3) {
                DeleteAccountFailedDialog deleteAccountFailedDialog2 = (DeleteAccountFailedDialog) view2;
                ColorStateList c3 = findFragmentByWho.c(view);
                int colorForState = c3 != null ? c3.getColorForState(view.getDrawableState(), c3.getDefaultColor()) : 0;
                if (z) {
                    if (!z2) {
                        deleteAccountFailedDialog2.setCircularRevealScrimColor(colorForState);
                    }
                    objectAnimator = ObjectAnimator.ofInt(deleteAccountFailedDialog2, DeleteAccountFailedDialog.IconCompatParcelizer.b, 16777215 & colorForState);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(deleteAccountFailedDialog2, DeleteAccountFailedDialog.IconCompatParcelizer.b, colorForState);
                }
                objectAnimator.setEvaluator(BaseInfoDialog.a);
                e.e.c("color").b(objectAnimator);
                arrayList.add(objectAnimator);
            }
            boolean z4 = view2 instanceof ViewGroup;
            if (z4 && (!z3 || CategoryListDialog_ViewBinding.c != 0)) {
                View findViewById = view2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.M);
                ViewGroup viewGroup = null;
                if (findViewById != null) {
                    if (findViewById instanceof ViewGroup) {
                        viewGroup = (ViewGroup) findViewById;
                    }
                } else if ((view2 instanceof PilihJenisIdentitasPemilikSumberDanaDialog) || (view2 instanceof PilihHubunganPemilikSumberDanaDialog_ViewBinding)) {
                    View childAt = ((ViewGroup) view2).getChildAt(0);
                    if (childAt instanceof ViewGroup) {
                        viewGroup = (ViewGroup) childAt;
                    }
                } else if (z4) {
                    viewGroup = (ViewGroup) view2;
                }
                if (viewGroup != null) {
                    if (z) {
                        if (!z2) {
                            getContentView.a.set(viewGroup, Float.valueOf(0.0f));
                        }
                        animator4 = ObjectAnimator.ofFloat(viewGroup, getContentView.a, 1.0f);
                    } else {
                        animator4 = ObjectAnimator.ofFloat(viewGroup, getContentView.a, 0.0f);
                    }
                    e.e.c("contentFade").b(animator4);
                    arrayList.add(animator4);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            initView.a(animatorSet, arrayList);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator5) {
                    if (!z) {
                        view2.setVisibility(4);
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator5) {
                    if (z) {
                        view2.setVisibility(0);
                        view.setAlpha(0.0f);
                        view.setVisibility(4);
                    }
                }
            });
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                animatorSet.addListener(arrayList2.get(i));
            }
            return animatorSet;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r0 == r5.getId()) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final boolean c(android.view.View r5, android.view.View r6) {
            /*
                r4 = this;
                r0 = r5
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 == r1) goto L_0x003d
                r0 = r6
                boolean r0 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = r8
                r9 = r0
                r0 = r7
                if (r0 == 0) goto L_0x003a
                r0 = r6
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
                o.onClickYes r0 = r0.a
                int r0 = r0.d
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L_0x0037
                r0 = r8
                r9 = r0
                r0 = r10
                r1 = r5
                int r1 = r1.getId()
                if (r0 != r1) goto L_0x003a
            L_0x0037:
                r0 = 1
                r9 = r0
            L_0x003a:
                r0 = r9
                return r0
            L_0x003d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.c(android.view.View, android.view.View):boolean");
        }

        public final void d(CoordinatorLayout.read read) {
            if (read.a == 0) {
                read.a = 80;
            }
        }

        protected abstract write e(Context context, boolean z);
    }
