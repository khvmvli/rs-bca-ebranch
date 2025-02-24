package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import o.BaseDialogKotlin;
import o.BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver;
import o.BaseDialogKotlin$MediaSessionCompat$Token;
import o.HaloBCADialog;
import o.HubunganDialog_ViewBinding;
import o.HubunganKeuanganDialog_ViewBinding;
import o.MataUangDialog_ViewBinding;
import o.findFragmentByWho;
import o.getInsetsForType;
import o.isRound;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$RemoteActionCompatParcelizer.class */
public class BaseTransientBottomBar$RemoteActionCompatParcelizer extends FrameLayout {
    private static final View.OnTouchListener a = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer.3
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver b;
    final float c;
    BaseTransientBottomBar$IconCompatParcelizer d;
    int e;
    private PorterDuff.Mode f;
    private ColorStateList h;
    private final float i;

    public BaseTransientBottomBar$RemoteActionCompatParcelizer(Context context) {
        this(context, null);
    }

    public BaseTransientBottomBar$RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        super(MataUangDialog_ViewBinding.a(context, attributeSet, 0, 0), attributeSet);
        Drawable drawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fK);
        if (obtainStyledAttributes.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.fQ)) {
            findFragmentByWho.b(this, (float) obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.fQ, 0));
        }
        this.e = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fI, 0);
        this.i = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.fO, 1.0f);
        setBackgroundTintList(HubunganKeuanganDialog_ViewBinding.c(context2, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fN));
        setBackgroundTintMode(HaloBCADialog.d(obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fP, -1), PorterDuff.Mode.SRC_IN));
        this.c = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.fJ, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(a);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(BaseDialogKotlin.read.ae);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            int i = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t;
            int i2 = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.k;
            float f = this.i;
            int c = HubunganDialog_ViewBinding.c(getContext(), i, getClass().getCanonicalName());
            int c2 = HubunganDialog_ViewBinding.c(getContext(), i2, getClass().getCanonicalName());
            gradientDrawable.setColor(isRound.a(isRound.b(c2, Math.round(((float) Color.alpha(c2)) * f)), c));
            if (this.h != null) {
                drawable = getInsetsForType.h(gradientDrawable);
                getInsetsForType.e(drawable, this.h);
            } else {
                drawable = getInsetsForType.h(gradientDrawable);
            }
            findFragmentByWho.b(this, drawable);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver = this.b;
        if (baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver != null) {
            baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver.b();
        }
        findFragmentByWho.J(this);
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        BaseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver = this.b;
        if (baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver != null) {
            baseTransientBottomBar$MediaBrowserCompat$CustomActionResultReceiver.c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
        BaseTransientBottomBar$IconCompatParcelizer baseTransientBottomBar$IconCompatParcelizer = this.d;
        if (baseTransientBottomBar$IconCompatParcelizer != null) {
            baseTransientBottomBar$IconCompatParcelizer.b();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2 = drawable;
            if (this.h != null) {
                drawable2 = getInsetsForType.h(drawable.mutate());
                getInsetsForType.e(drawable2, this.h);
                getInsetsForType.d(drawable2, this.f);
            }
        }
        setBackgroundDrawable(drawable2);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable h = getInsetsForType.h(getBackground().mutate());
            getInsetsForType.e(h, colorStateList);
            getInsetsForType.d(h, this.f);
            if (h != getBackground()) {
                setBackgroundDrawable(h);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f = mode;
        if (getBackground() != null) {
            Drawable h = getInsetsForType.h(getBackground().mutate());
            getInsetsForType.d(h, mode);
            if (h != getBackground()) {
                setBackgroundDrawable(h);
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : a);
        setOnClickListener(onClickListener);
    }
}
