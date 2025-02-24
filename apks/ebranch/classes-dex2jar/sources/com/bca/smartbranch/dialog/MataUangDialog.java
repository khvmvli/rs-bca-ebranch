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
import o.ReservasiListChosenActivity;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/MataUangDialog.class */
public class MataUangDialog extends BaseDialog implements AdapterView.OnItemClickListener {
    private Unbinder e;
    @BindView(2131297975)
    ListView lvContent;
    @BindArray(2130903077)
    String[] mataUang;
    @BindString(2131822235)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        this.lvContent.setAdapter((ListAdapter) ArrayAdapter.createFromResource(getActivity(), 2130903077, 2131493315));
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
        documentProvider.b().d(new ReservasiListChosenActivity(this.mataUang[i]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
