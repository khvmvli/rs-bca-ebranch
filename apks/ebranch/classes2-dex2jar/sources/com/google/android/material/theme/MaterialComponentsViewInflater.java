package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import o.CancelReservasiDialog_ViewBinding;
import o.CancelTransaksiDialog;
import o.HubunganKeuanganDialog;
import o.MasaBerlakuKTPDialog;
import o.MataUangDialog;
import o.setAdapter;
import o.setCheckMarkDrawable;
import o.setCompoundDrawables;
import o.setGroupDividerEnabled;
import o.setSupportImageTintMode;
import o.setTypeface;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/theme/MaterialComponentsViewInflater.class */
public class MaterialComponentsViewInflater extends setGroupDividerEnabled {
    public setCheckMarkDrawable a(Context context, AttributeSet attributeSet) {
        return new MasaBerlakuKTPDialog(context, attributeSet);
    }

    public setAdapter c(Context context, AttributeSet attributeSet) {
        return new CancelTransaksiDialog(context, attributeSet);
    }

    public setSupportImageTintMode e(Context context, AttributeSet attributeSet) {
        return new CancelReservasiDialog_ViewBinding(context, attributeSet);
    }

    public setCompoundDrawables f(Context context, AttributeSet attributeSet) {
        return new HubunganKeuanganDialog(context, attributeSet);
    }

    public setTypeface m(Context context, AttributeSet attributeSet) {
        return new MataUangDialog(context, attributeSet);
    }
}
