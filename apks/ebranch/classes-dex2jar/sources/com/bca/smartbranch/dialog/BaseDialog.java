package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bca.smartbranch.App;
import o.getText;
import o.onClickNegara;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BaseDialog.class */
public abstract class BaseDialog extends getText {
    @onClickNegara
    public SharedPreferences sharedPreferences;

    public void bindViews(View view) {
    }

    protected abstract int getContentView();

    protected void initView(View view) {
    }

    @Override // o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.getWindow().requestFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        onCreateDialog.getWindow().getAttributes().windowAnimations = 2131886328;
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(getContentView(), viewGroup, false);
        App.d().b(this);
        initView(inflate);
        bindViews(inflate);
        return inflate;
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        unbindViews();
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        getDialog().getWindow().setLayout(-1, -2);
    }

    public void unbindViews() {
    }
}
