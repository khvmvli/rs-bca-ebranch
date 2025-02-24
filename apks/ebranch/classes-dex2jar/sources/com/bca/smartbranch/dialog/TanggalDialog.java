package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.DatePicker;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import java.util.Calendar;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TanggalDialog.class */
public class TanggalDialog extends BaseDialog {
    private Unbinder c;
    @BindView(2131296858)
    DatePicker datePicker;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        this.datePicker.setMinDate((long) (Calendar.getInstance().get(1) - 60));
        this.datePicker.setMaxDate((long) (Calendar.getInstance().get(1) - 17));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493105;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.c.unbind();
    }
}
