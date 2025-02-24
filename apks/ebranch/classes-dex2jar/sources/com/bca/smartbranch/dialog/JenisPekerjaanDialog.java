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
import com.bca.smartbranch.adapter.JenisPekerjaanAdapter;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ListUtil;
import o.RegistrationSuccessActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisPekerjaanDialog.class */
public class JenisPekerjaanDialog extends BaseDialog {
    private Unbinder a;
    private JenisPekerjaanAdapter b;
    private List<DaftarTransferAdapter$DaftarTransferVH> d = new ArrayList();
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822231)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
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
        this.b = new JenisPekerjaanAdapter(getContext(), this.e);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.b);
        this.tvTitle.setText(this.title);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new RegistrationSuccessActivity_ViewBinding(this.b.e, this.b.b));
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493089;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
