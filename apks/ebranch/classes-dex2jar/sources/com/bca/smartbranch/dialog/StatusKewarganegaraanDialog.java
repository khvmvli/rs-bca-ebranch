package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.StatusNPWPAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.documentProvider;
import o.onChooseProvinsiKantor;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusKewarganegaraanDialog.class */
public class StatusKewarganegaraanDialog extends BaseDialog {
    private StatusNPWPAdapter b;
    private List<DaftarTransferAdapter$DaftarTransferVH> c = new ArrayList();
    @BindArray(2130903089)
    String[] data;
    private Unbinder e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822266)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        int i;
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= this.data.length) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.data[i3])) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        String[] strArr = this.data;
        int i4 = 0;
        for (String str : strArr) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.c.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.b = new StatusNPWPAdapter(getContext(), this.c);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.b);
        this.tvTitle.setText(this.title);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new onChooseProvinsiKantor(getTag(), this.b.e, this.c.get(this.b.e).e));
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
