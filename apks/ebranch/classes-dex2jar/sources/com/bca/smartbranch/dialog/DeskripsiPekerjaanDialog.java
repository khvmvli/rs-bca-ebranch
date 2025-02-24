package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.DeskripsiPekerjaanAdapter;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ListUtil;
import o.RegistrationActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DeskripsiPekerjaanDialog.class */
public class DeskripsiPekerjaanDialog extends BaseDialog {
    private DeskripsiPekerjaanAdapter a;
    private List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();
    private Unbinder c;
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822204)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.c = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list = (List) ListUtil.OneItemImmutableList.a(arguments.getParcelable("list_data"));
        this.e = list;
        for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput : list) {
            if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(dataPekerjaanOutput.getDescription())) {
                dataPekerjaanOutput.setSelected(true);
            } else {
                dataPekerjaanOutput.setSelected(false);
            }
        }
        if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals("")) {
            this.e.get(0).setSelected(true);
        }
        this.a = new DeskripsiPekerjaanAdapter(getContext(), this.e);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.a);
        this.tvTitle.setText(this.title);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new RegistrationActivity(this.a.b, this.a.e));
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493089;
    }
}
