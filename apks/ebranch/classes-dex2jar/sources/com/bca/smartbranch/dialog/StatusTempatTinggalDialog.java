package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import o.ReservasiTellerSuccessActivity;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusTempatTinggalDialog.class */
public class StatusTempatTinggalDialog extends BaseDialog implements AdapterView.OnItemClickListener {
    private Unbinder d;
    @BindArray(2130903093)
    String[] data;
    @BindView(2131297975)
    ListView lvContent;
    @BindString(2131822270)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        this.lvContent.setAdapter((ListAdapter) ArrayAdapter.createFromResource(getActivity(), 2130903093, 2131493315));
        this.lvContent.setOnItemClickListener(this);
        this.tvTitle.setText(this.title);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493087;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiTellerSuccessActivity(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
