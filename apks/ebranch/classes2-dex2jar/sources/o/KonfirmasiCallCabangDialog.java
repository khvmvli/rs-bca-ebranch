package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/KonfirmasiCallCabangDialog.class */
final class KonfirmasiCallCabangDialog extends LinkActivationDialog {
    private AnimatorSet b;
    private ValueAnimator i;
    final TextWatcher c = new TextWatcher() { // from class: o.KonfirmasiCallCabangDialog.1
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
            if ((r4.length() > 0) != false) goto L_0x003f;
         */
        @Override // android.text.TextWatcher
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void afterTextChanged(android.text.Editable r4) {
            /*
                r3 = this;
                r0 = r3
                o.KonfirmasiCallCabangDialog r0 = o.KonfirmasiCallCabangDialog.this
                o.LogoutDialog_ViewBinding r0 = r0.k
                java.lang.CharSequence r0 = r0.y
                if (r0 == 0) goto L_0x000e
                return
            L_0x000e:
                r0 = r3
                o.KonfirmasiCallCabangDialog r0 = o.KonfirmasiCallCabangDialog.this
                r5 = r0
                r0 = r5
                o.LogoutDialog_ViewBinding r0 = r0.k
                boolean r0 = r0.hasFocus()
                r6 = r0
                r0 = 1
                r7 = r0
                r0 = r6
                if (r0 == 0) goto L_0x003c
                r0 = r4
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0031
                r0 = 1
                r8 = r0
                goto L_0x0034
            L_0x0031:
                r0 = 0
                r8 = r0
            L_0x0034:
                r0 = r8
                if (r0 == 0) goto L_0x003c
                goto L_0x003f
            L_0x003c:
                r0 = 0
                r7 = r0
            L_0x003f:
                r0 = r5
                r1 = r7
                r0.b(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.KonfirmasiCallCabangDialog.AnonymousClass1.afterTextChanged(android.text.Editable):void");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };
    final View.OnFocusChangeListener e = new View.OnFocusChangeListener() { // from class: o.KonfirmasiCallCabangDialog.5
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            boolean isEmpty = TextUtils.isEmpty(((EditText) view).getText());
            KonfirmasiCallCabangDialog konfirmasiCallCabangDialog = KonfirmasiCallCabangDialog.this;
            boolean z2 = true;
            if (!(!isEmpty) || !z) {
                z2 = false;
            }
            konfirmasiCallCabangDialog.b(z2);
        }
    };
    private final LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver a = new LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.KonfirmasiCallCabangDialog.2
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x0031;
         */
        @Override // o.LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void b(o.LogoutDialog_ViewBinding r4) {
            /*
                r3 = this;
                r0 = r4
                android.widget.EditText r0 = r0.f
                r5 = r0
                r0 = r5
                boolean r0 = r0.hasFocus()
                r6 = r0
                r0 = 1
                r7 = r0
                r0 = r6
                if (r0 == 0) goto L_0x002e
                r0 = r5
                android.text.Editable r0 = r0.getText()
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0023
                r0 = 1
                r8 = r0
                goto L_0x0026
            L_0x0023:
                r0 = 0
                r8 = r0
            L_0x0026:
                r0 = r8
                if (r0 == 0) goto L_0x002e
                goto L_0x0031
            L_0x002e:
                r0 = 0
                r7 = r0
            L_0x0031:
                r0 = r4
                r1 = r7
                r0.setEndIconVisible(r1)
                r0 = r4
                r1 = 0
                r0.setEndIconCheckable(r1)
                r0 = r5
                r1 = r3
                o.KonfirmasiCallCabangDialog r1 = o.KonfirmasiCallCabangDialog.this
                android.view.View$OnFocusChangeListener r1 = r1.e
                r0.setOnFocusChangeListener(r1)
                r0 = r5
                r1 = r3
                o.KonfirmasiCallCabangDialog r1 = o.KonfirmasiCallCabangDialog.this
                android.text.TextWatcher r1 = r1.c
                r0.removeTextChangedListener(r1)
                r0 = r5
                r1 = r3
                o.KonfirmasiCallCabangDialog r1 = o.KonfirmasiCallCabangDialog.this
                android.text.TextWatcher r1 = r1.c
                r0.addTextChangedListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.KonfirmasiCallCabangDialog.AnonymousClass2.b(o.LogoutDialog_ViewBinding):void");
        }
    };
    private final LogoutDialog_ViewBinding$RemoteActionCompatParcelizer d = new LogoutDialog_ViewBinding$RemoteActionCompatParcelizer() { // from class: o.KonfirmasiCallCabangDialog.3
        @Override // o.LogoutDialog_ViewBinding$RemoteActionCompatParcelizer
        public final void d(LogoutDialog_ViewBinding logoutDialog_ViewBinding, int i) {
            final EditText editText = logoutDialog_ViewBinding.f;
            if (editText != null && i == 2) {
                editText.post(new Runnable() { // from class: o.KonfirmasiCallCabangDialog.3.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        editText.removeTextChangedListener(KonfirmasiCallCabangDialog.this.c);
                    }
                });
                if (editText.getOnFocusChangeListener() == KonfirmasiCallCabangDialog.this.e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    };

    KonfirmasiCallCabangDialog(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        super(logoutDialog_ViewBinding);
    }

    private ValueAnimator b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(unbindViews.c);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.KonfirmasiCallCabangDialog.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KonfirmasiCallCabangDialog.this.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [o.clickedOk, android.view.View] */
    void b(boolean z) {
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.k;
        boolean z2 = true;
        if ((logoutDialog_ViewBinding.m.getVisibility() == 0 && logoutDialog_ViewBinding.l.getVisibility() == 0) != z) {
            z2 = false;
        }
        if (z && !this.b.isRunning()) {
            this.i.cancel();
            this.b.start();
            if (z2) {
                this.b.end();
            }
        } else if (!z) {
            this.b.cancel();
            this.i.start();
            if (z2) {
                this.i.end();
            }
        }
    }

    @Override // o.LinkActivationDialog
    final void d() {
        this.k.setEndIconDrawable(setPrimaryBackground.c(this.m, BaseDialogKotlin.IconCompatParcelizer.i));
        this.k.setEndIconContentDescription(this.k.getResources().getText(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.e));
        this.k.setEndIconOnClickListener(new View.OnClickListener() { // from class: o.KonfirmasiCallCabangDialog.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Editable text = KonfirmasiCallCabangDialog.this.k.f.getText();
                if (text != null) {
                    text.clear();
                }
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = KonfirmasiCallCabangDialog.this.k;
                logoutDialog_ViewBinding.d(logoutDialog_ViewBinding.l, logoutDialog_ViewBinding.k);
            }
        });
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.k;
        LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.a;
        logoutDialog_ViewBinding.o.add(logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        if (logoutDialog_ViewBinding.f != null) {
            logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding);
        }
        this.k.n.add(this.d);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(unbindViews.e);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.KonfirmasiCallCabangDialog.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                KonfirmasiCallCabangDialog.this.n.setScaleX(floatValue);
                KonfirmasiCallCabangDialog.this.n.setScaleY(floatValue);
            }
        });
        ValueAnimator b = b(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.playTogether(ofFloat, b);
        this.b.addListener(new AnimatorListenerAdapter() { // from class: o.KonfirmasiCallCabangDialog.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                KonfirmasiCallCabangDialog.this.k.setEndIconVisible(true);
            }
        });
        ValueAnimator b2 = b(1.0f, 0.0f);
        this.i = b2;
        b2.addListener(new AnimatorListenerAdapter() { // from class: o.KonfirmasiCallCabangDialog.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                KonfirmasiCallCabangDialog.this.k.setEndIconVisible(false);
            }
        });
    }

    @Override // o.LinkActivationDialog
    final void e(boolean z) {
        if (this.k.y != null) {
            b(z);
        }
    }
}
