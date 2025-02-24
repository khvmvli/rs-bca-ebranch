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
import com.bca.smartbranch.adapter.DetailTujuanBNAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.DaftarTransferBTAdapter$DaftarTransferORVH;
import o.ListUtil;
import o.documentProvider;
import o.onChooseKantorCabangEvent;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DetailTujuanBNDialog.class */
public class DetailTujuanBNDialog extends BaseDialog {
    private List<DaftarTransferBTAdapter$DaftarTransferORVH> a = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();
    private DetailTujuanBNAdapter d;
    private Unbinder e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822187)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        int i;
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = (List) ListUtil.OneItemImmutableList.a(arguments.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= this.a.size()) {
                    break;
                }
                if (arguments.getString("value", "").equals(this.a.get(i3).a)) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (DaftarTransferBTAdapter$DaftarTransferORVH daftarTransferBTAdapter$DaftarTransferORVH : this.a) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = daftarTransferBTAdapter$DaftarTransferORVH.a;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.b.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.d = new DetailTujuanBNAdapter(getContext(), this.b);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.d);
        this.tvTitle.setText(this.title);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new onChooseKantorCabangEvent(this.a.get(this.d.b)));
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
