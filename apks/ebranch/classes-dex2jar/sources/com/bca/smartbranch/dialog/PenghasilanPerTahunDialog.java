package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.PenghasilanPerTahunAdapter;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ReservasiSuccessActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PenghasilanPerTahunDialog.class */
public class PenghasilanPerTahunDialog extends BaseDialog {
    private PenghasilanPerTahunAdapter a;
    private List<GetAcctOpeningCategoryDataResponse.Content> b;
    private List<DaftarTransferAdapter$DaftarTransferVH> c = new ArrayList();
    private String d;
    private Unbinder e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822252)
    String titleRes;
    @BindView(2131299615)
    public TextView tvTitle;

    public PenghasilanPerTahunDialog(List<GetAcctOpeningCategoryDataResponse.Content> list) {
        this.b = list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        int i;
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= this.b.size()) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.b.get(i3).getContentName().getIndonesian())) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (GetAcctOpeningCategoryDataResponse.Content content : this.b) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = content.getContentName().getIndonesian();
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.c.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.a = new PenghasilanPerTahunAdapter(getContext(), this.c);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.a);
        if (getArguments() != null) {
            this.d = getArguments().getString("title", null);
        }
        String str = this.d;
        if (str == null) {
            this.tvTitle.setText(this.titleRes);
        } else {
            this.tvTitle.setText(Html.fromHtml(str));
        }
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiSuccessActivity(this.a.e));
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
        this.e.unbind();
    }
}
