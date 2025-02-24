package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import o.BaseDialogKotlin;
import o.JenisPekerjaanDialog;
/* loaded from: classes2-dex2jar.jar:o/LinkActivationDialog_ViewBinding.class */
final class LinkActivationDialog_ViewBinding extends LinkActivationDialog {
    static final boolean c = true;
    AccessibilityManager d;
    StateListDrawable h;
    ValueAnimator i;
    ValueAnimator j;

    /* renamed from: o  reason: collision with root package name */
    JenisKodeBankDialog f39o;
    final TextWatcher g = new GuestWarningWebViewDialog() { // from class: o.LinkActivationDialog_ViewBinding.5
        /* JADX WARN: Type inference failed for: r0v20, types: [o.clickedOk, android.view.View] */
        @Override // o.GuestWarningWebViewDialog, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText = LinkActivationDialog_ViewBinding.this.k.f;
            if (editText instanceof AutoCompleteTextView) {
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (LinkActivationDialog_ViewBinding.this.d.isTouchExplorationEnabled()) {
                    if ((autoCompleteTextView.getKeyListener() != null) && !LinkActivationDialog_ViewBinding.this.n.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new Runnable() { // from class: o.LinkActivationDialog_ViewBinding.5.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean isPopupShowing = autoCompleteTextView.isPopupShowing();
                        LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding = LinkActivationDialog_ViewBinding.this;
                        if (linkActivationDialog_ViewBinding.f != isPopupShowing) {
                            linkActivationDialog_ViewBinding.f = isPopupShowing;
                            linkActivationDialog_ViewBinding.i.cancel();
                            linkActivationDialog_ViewBinding.j.start();
                        }
                        LinkActivationDialog_ViewBinding.this.b = isPopupShowing;
                    }
                });
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    };
    final View.OnFocusChangeListener l = new View.OnFocusChangeListener() { // from class: o.LinkActivationDialog_ViewBinding.2
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            LinkActivationDialog_ViewBinding.this.k.setEndIconActivated(z);
            if (!z) {
                LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding = LinkActivationDialog_ViewBinding.this;
                if (linkActivationDialog_ViewBinding.f) {
                    linkActivationDialog_ViewBinding.f = false;
                    linkActivationDialog_ViewBinding.i.cancel();
                    linkActivationDialog_ViewBinding.j.start();
                }
                LinkActivationDialog_ViewBinding.this.b = false;
            }
        }
    };
    final LogoutDialog_ViewBinding$IconCompatParcelizer a = new LogoutDialog_ViewBinding$IconCompatParcelizer(this.k) { // from class: o.LinkActivationDialog_ViewBinding.4
        @Override // o.LogoutDialog_ViewBinding$IconCompatParcelizer
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            b(view, getchildfragmentmanager);
            if (!(LinkActivationDialog_ViewBinding.this.k.f.getKeyListener() != null)) {
                getchildfragmentmanager.b(Spinner.class.getName());
            }
            if (getchildfragmentmanager.u()) {
                getchildfragmentmanager.d((CharSequence) null);
            }
        }

        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            d(view, accessibilityEvent);
            EditText editText = LinkActivationDialog_ViewBinding.this.k.f;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                boolean z = true;
                if (accessibilityEvent.getEventType() == 1 && LinkActivationDialog_ViewBinding.this.d.isTouchExplorationEnabled()) {
                    if (LinkActivationDialog_ViewBinding.this.k.f.getKeyListener() == null) {
                        z = false;
                    }
                    if (!z) {
                        LinkActivationDialog_ViewBinding.a(LinkActivationDialog_ViewBinding.this, autoCompleteTextView);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    };
    private final LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver p = new LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.LinkActivationDialog_ViewBinding.1
        /* JADX WARN: Type inference failed for: r0v35, types: [o.clickedOk, android.view.View] */
        @Override // o.LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
        public final void b(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
            LayerDrawable layerDrawable;
            EditText editText = logoutDialog_ViewBinding.f;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding = LinkActivationDialog_ViewBinding.this;
                if (LinkActivationDialog_ViewBinding.c) {
                    int i = linkActivationDialog_ViewBinding.k.e;
                    if (i == 2) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(linkActivationDialog_ViewBinding.f39o);
                    } else if (i == 1) {
                        autoCompleteTextView.setDropDownBackgroundDrawable(linkActivationDialog_ViewBinding.h);
                    }
                }
                LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding2 = LinkActivationDialog_ViewBinding.this;
                boolean z = false;
                if (!(autoCompleteTextView.getKeyListener() != null)) {
                    int i2 = linkActivationDialog_ViewBinding2.k.e;
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = linkActivationDialog_ViewBinding2.k;
                    int i3 = logoutDialog_ViewBinding2.e;
                    if (i3 == 1 || i3 == 2) {
                        JenisKodeBankDialog jenisKodeBankDialog = logoutDialog_ViewBinding2.b;
                        int c2 = HubunganDialog_ViewBinding.c(autoCompleteTextView.getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.f8o, autoCompleteTextView.getClass().getCanonicalName());
                        int[][] iArr = {new int[]{16842919}, new int[0]};
                        if (i2 == 2) {
                            int c3 = HubunganDialog_ViewBinding.c(autoCompleteTextView.getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, autoCompleteTextView.getClass().getCanonicalName());
                            JenisKodeBankDialog jenisKodeBankDialog2 = new JenisKodeBankDialog(jenisKodeBankDialog.F.l);
                            int a = isRound.a(isRound.b(c3, Math.round(((float) Color.alpha(c3)) * 0.1f)), c2);
                            jenisKodeBankDialog2.c(new ColorStateList(iArr, new int[]{a, 0}));
                            if (LinkActivationDialog_ViewBinding.c) {
                                jenisKodeBankDialog2.setTint(c3);
                                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a, c3});
                                JenisKodeBankDialog jenisKodeBankDialog3 = new JenisKodeBankDialog(jenisKodeBankDialog.F.l);
                                jenisKodeBankDialog3.setTint(-1);
                                layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jenisKodeBankDialog2, jenisKodeBankDialog3), jenisKodeBankDialog});
                            } else {
                                layerDrawable = new LayerDrawable(new Drawable[]{jenisKodeBankDialog2, jenisKodeBankDialog});
                            }
                            findFragmentByWho.b(autoCompleteTextView, layerDrawable);
                        } else if (i2 == 1) {
                            int i4 = linkActivationDialog_ViewBinding2.k.c;
                            int[] iArr2 = {isRound.a(isRound.b(i4, Math.round(((float) Color.alpha(i4)) * 0.1f)), c2), i4};
                            if (LinkActivationDialog_ViewBinding.c) {
                                findFragmentByWho.b(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jenisKodeBankDialog, jenisKodeBankDialog));
                            } else {
                                JenisKodeBankDialog jenisKodeBankDialog4 = new JenisKodeBankDialog(jenisKodeBankDialog.F.l);
                                jenisKodeBankDialog4.c(new ColorStateList(iArr, iArr2));
                                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{jenisKodeBankDialog, jenisKodeBankDialog4});
                                int t = findFragmentByWho.t(autoCompleteTextView);
                                int paddingTop = autoCompleteTextView.getPaddingTop();
                                int s = findFragmentByWho.s(autoCompleteTextView);
                                int paddingBottom = autoCompleteTextView.getPaddingBottom();
                                findFragmentByWho.b(autoCompleteTextView, layerDrawable2);
                                findFragmentByWho.c(autoCompleteTextView, t, paddingTop, s, paddingBottom);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding3 = LinkActivationDialog_ViewBinding.this;
                autoCompleteTextView.setOnTouchListener(new View.OnTouchListener(autoCompleteTextView) { // from class: o.LinkActivationDialog_ViewBinding.8
                    final /* synthetic */ AutoCompleteTextView e;

                    {
                        this.e = r5;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 1) {
                            return false;
                        }
                        if (LinkActivationDialog_ViewBinding.this.e()) {
                            LinkActivationDialog_ViewBinding.this.b = false;
                        }
                        LinkActivationDialog_ViewBinding.a(LinkActivationDialog_ViewBinding.this, this.e);
                        return false;
                    }
                });
                autoCompleteTextView.setOnFocusChangeListener(linkActivationDialog_ViewBinding3.l);
                if (LinkActivationDialog_ViewBinding.c) {
                    autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.LinkActivationDialog_ViewBinding.10
                        @Override // android.widget.AutoCompleteTextView.OnDismissListener
                        public final void onDismiss() {
                            LinkActivationDialog_ViewBinding.this.b = true;
                            LinkActivationDialog_ViewBinding.this.e = System.currentTimeMillis();
                            LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding4 = LinkActivationDialog_ViewBinding.this;
                            if (linkActivationDialog_ViewBinding4.f) {
                                linkActivationDialog_ViewBinding4.f = false;
                                linkActivationDialog_ViewBinding4.i.cancel();
                                linkActivationDialog_ViewBinding4.j.start();
                            }
                        }
                    });
                }
                autoCompleteTextView.setThreshold(0);
                autoCompleteTextView.removeTextChangedListener(LinkActivationDialog_ViewBinding.this.g);
                autoCompleteTextView.addTextChangedListener(LinkActivationDialog_ViewBinding.this.g);
                logoutDialog_ViewBinding.setEndIconCheckable(true);
                logoutDialog_ViewBinding.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() != null) {
                    z = true;
                }
                if (!z) {
                    findFragmentByWho.j((View) LinkActivationDialog_ViewBinding.this.n, 2);
                }
                logoutDialog_ViewBinding.setTextInputAccessibilityDelegate(LinkActivationDialog_ViewBinding.this.a);
                logoutDialog_ViewBinding.setEndIconVisible(true);
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    };
    private final LogoutDialog_ViewBinding$RemoteActionCompatParcelizer s = new LogoutDialog_ViewBinding$RemoteActionCompatParcelizer() { // from class: o.LinkActivationDialog_ViewBinding.7
        @Override // o.LogoutDialog_ViewBinding$RemoteActionCompatParcelizer
        public final void d(LogoutDialog_ViewBinding logoutDialog_ViewBinding, int i) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) logoutDialog_ViewBinding.f;
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new Runnable() { // from class: o.LinkActivationDialog_ViewBinding.7.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        autoCompleteTextView.removeTextChangedListener(LinkActivationDialog_ViewBinding.this.g);
                    }
                });
                if (autoCompleteTextView.getOnFocusChangeListener() == LinkActivationDialog_ViewBinding.this.l) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (LinkActivationDialog_ViewBinding.c) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    };
    boolean b = false;
    boolean f = false;
    long e = Long.MAX_VALUE;

    LinkActivationDialog_ViewBinding(LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        super(logoutDialog_ViewBinding);
    }

    static /* synthetic */ void a(LinkActivationDialog_ViewBinding linkActivationDialog_ViewBinding, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (linkActivationDialog_ViewBinding.e()) {
                linkActivationDialog_ViewBinding.b = false;
            }
            if (!linkActivationDialog_ViewBinding.b) {
                if (c) {
                    boolean z = linkActivationDialog_ViewBinding.f;
                    boolean z2 = !z;
                    if (z != z2) {
                        linkActivationDialog_ViewBinding.f = z2;
                        linkActivationDialog_ViewBinding.i.cancel();
                        linkActivationDialog_ViewBinding.j.start();
                    }
                } else {
                    linkActivationDialog_ViewBinding.f = !linkActivationDialog_ViewBinding.f;
                    linkActivationDialog_ViewBinding.n.toggle();
                }
                if (linkActivationDialog_ViewBinding.f) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            linkActivationDialog_ViewBinding.b = false;
        }
    }

    private ValueAnimator c(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(unbindViews.c);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.LinkActivationDialog_ViewBinding.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinkActivationDialog_ViewBinding.this.n.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    private JenisKodeBankDialog c(float f, float f2, float f3, int i) {
        JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(f);
        remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(f);
        remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(f2);
        remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(f2);
        JenisPekerjaanDialog jenisPekerjaanDialog = new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0);
        JenisKodeBankDialog a = JenisKodeBankDialog.a(this.m, f3);
        a.setShapeAppearanceModel(jenisPekerjaanDialog);
        if (a.F.h == null) {
            a.F.h = new Rect();
        }
        a.F.h.set(0, i, 0, i);
        a.invalidateSelf();
        return a;
    }

    @Override // o.LinkActivationDialog
    final boolean a() {
        return true;
    }

    @Override // o.LinkActivationDialog
    final void d() {
        float dimensionPixelOffset = (float) this.m.getResources().getDimensionPixelOffset(BaseDialogKotlin.read.ab);
        float dimensionPixelOffset2 = (float) this.m.getResources().getDimensionPixelOffset(BaseDialogKotlin.read.T);
        int dimensionPixelOffset3 = this.m.getResources().getDimensionPixelOffset(BaseDialogKotlin.read.X);
        JenisKodeBankDialog c2 = c(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        JenisKodeBankDialog c3 = c(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f39o = c2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.h = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, c2);
        this.h.addState(new int[0], c3);
        this.k.setEndIconDrawable(setPrimaryBackground.c(this.m, c ? BaseDialogKotlin.IconCompatParcelizer.e : BaseDialogKotlin.IconCompatParcelizer.b));
        this.k.setEndIconContentDescription(this.k.getResources().getText(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.j));
        this.k.setEndIconOnClickListener(new View.OnClickListener() { // from class: o.LinkActivationDialog_ViewBinding.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkActivationDialog_ViewBinding.a(LinkActivationDialog_ViewBinding.this, (AutoCompleteTextView) LinkActivationDialog_ViewBinding.this.k.f);
            }
        });
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.k;
        LogoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.p;
        logoutDialog_ViewBinding.o.add(logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        if (logoutDialog_ViewBinding.f != null) {
            logoutDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding);
        }
        this.k.n.add(this.s);
        this.i = c(67, 0.0f, 1.0f);
        ValueAnimator c4 = c(50, 1.0f, 0.0f);
        this.j = c4;
        c4.addListener(new AnimatorListenerAdapter() { // from class: o.LinkActivationDialog_ViewBinding.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                LinkActivationDialog_ViewBinding.this.n.setChecked(LinkActivationDialog_ViewBinding.this.f);
                LinkActivationDialog_ViewBinding.this.i.start();
            }
        });
        this.d = (AccessibilityManager) this.m.getSystemService("accessibility");
    }

    boolean e() {
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    @Override // o.LinkActivationDialog
    final boolean e(int i) {
        return i != 0;
    }
}
