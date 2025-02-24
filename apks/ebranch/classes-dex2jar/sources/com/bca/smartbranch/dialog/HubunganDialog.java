package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/HubunganDialog.class */
public class HubunganDialog extends BaseDialog implements AdapterView.OnItemClickListener {
    private Unbinder a;
    List<CategoryResponse> b;
    @BindView(2131297975)
    ListView lvContent;
    @BindString(2131822211)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        ArrayList arrayList = new ArrayList();
        for (CategoryResponse categoryResponse : this.b) {
            arrayList.add(categoryResponse.getDescription());
        }
        this.lvContent.setAdapter((ListAdapter) new ArrayAdapter(getContext(), 2131493315, arrayList));
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
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
