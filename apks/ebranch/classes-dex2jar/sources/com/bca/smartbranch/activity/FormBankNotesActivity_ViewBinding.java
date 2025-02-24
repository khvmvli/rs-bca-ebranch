package com.bca.smartbranch.activity;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import o.copyWindowDataInto;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormBankNotesActivity_ViewBinding.class */
public class FormBankNotesActivity_ViewBinding implements Unbinder {
    private FormBankNotesActivity b;

    public FormBankNotesActivity_ViewBinding(FormBankNotesActivity formBankNotesActivity, View view) {
        this.b = formBankNotesActivity;
        formBankNotesActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        formBankNotesActivity.rlToolbar = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298304, "field 'rlToolbar'", RelativeLayout.class);
        formBankNotesActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        formBankNotesActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        formBankNotesActivity.llMainIndicator = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297767, "field 'llMainIndicator'", LinearLayout.class);
        formBankNotesActivity.tvIndicator1 = (TextView) Utils.findRequiredViewAsType(view, 2131299276, "field 'tvIndicator1'", TextView.class);
        formBankNotesActivity.pbIndicator1 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298111, "field 'pbIndicator1'", ProgressBar.class);
        formBankNotesActivity.tvIndicator2 = (TextView) Utils.findRequiredViewAsType(view, 2131299277, "field 'tvIndicator2'", TextView.class);
        formBankNotesActivity.pbIndicator2 = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298112, "field 'pbIndicator2'", ProgressBar.class);
        formBankNotesActivity.tvIndicator3 = (TextView) Utils.findRequiredViewAsType(view, 2131299278, "field 'tvIndicator3'", TextView.class);
        formBankNotesActivity.ivIndicatorClear1 = (ImageView) Utils.findRequiredViewAsType(view, 2131297377, "field 'ivIndicatorClear1'", ImageView.class);
        formBankNotesActivity.ivIndicatorClear2 = (ImageView) Utils.findRequiredViewAsType(view, 2131297379, "field 'ivIndicatorClear2'", ImageView.class);
        formBankNotesActivity.ivIndicatorClear3 = (ImageView) Utils.findRequiredViewAsType(view, 2131297381, "field 'ivIndicatorClear3'", ImageView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        formBankNotesActivity.drawableIndicatorOn = copyWindowDataInto.b(context, 2131231203);
        formBankNotesActivity.drawableIndicatorOff = copyWindowDataInto.b(context, 2131231202);
        formBankNotesActivity.toolbarTitlePembelianMataUang = resources.getString(2131822242);
        formBankNotesActivity.toolbarTitlePilihCabang = resources.getString(2131822045);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FormBankNotesActivity formBankNotesActivity = this.b;
        if (formBankNotesActivity != null) {
            this.b = null;
            formBankNotesActivity.toolbar = null;
            formBankNotesActivity.rlToolbar = null;
            formBankNotesActivity.llMain = null;
            formBankNotesActivity.txtToolbarTitle = null;
            formBankNotesActivity.llMainIndicator = null;
            formBankNotesActivity.tvIndicator1 = null;
            formBankNotesActivity.pbIndicator1 = null;
            formBankNotesActivity.tvIndicator2 = null;
            formBankNotesActivity.pbIndicator2 = null;
            formBankNotesActivity.tvIndicator3 = null;
            formBankNotesActivity.ivIndicatorClear1 = null;
            formBankNotesActivity.ivIndicatorClear2 = null;
            formBankNotesActivity.ivIndicatorClear3 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
