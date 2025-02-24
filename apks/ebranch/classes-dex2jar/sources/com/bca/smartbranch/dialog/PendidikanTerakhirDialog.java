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
import com.bca.smartbranch.adapter.PendidikanTerakhirAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ReservasiCSOActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PendidikanTerakhirDialog.class */
public class PendidikanTerakhirDialog extends BaseDialog {
    private PendidikanTerakhirAdapter b;
    private boolean c;
    private Unbinder d;
    private List<DaftarTransferAdapter$DaftarTransferVH> e = new ArrayList();
    @BindArray(2130903082)
    String[] listPendidikan;
    @BindArray(2130903083)
    String[] listPendidikanPelajar;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822247)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        int i;
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        boolean z = getArguments() != null ? getArguments().getBoolean("isStudent") : false;
        this.c = z;
        String[] strArr = z ? this.listPendidikanPelajar : this.listPendidikan;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= strArr.length) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(strArr[i3])) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (String str : strArr) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.e.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.b = new PendidikanTerakhirAdapter(getContext(), this.e);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.b);
        this.tvTitle.setText(this.title);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        if (this.c) {
            documentProvider.b().d(new ReservasiCSOActivity_ViewBinding(this.listPendidikanPelajar[this.b.b]));
        } else {
            documentProvider.b().d(new ReservasiCSOActivity_ViewBinding(this.listPendidikan[this.b.b]));
        }
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
        this.d.unbind();
    }
}
