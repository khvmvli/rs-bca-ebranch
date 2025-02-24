package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.TahunBulanAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import o.AgamaAdapter$AgamaVH_ViewBinding;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ExpiredDateDialog.class */
public class ExpiredDateDialog extends BaseDialog {
    private TahunBulanAdapter d;
    private Unbinder e;
    private TahunBulanAdapter i;
    @BindView(2131298319)
    setOnStartEnterTransitionListener rvBulan;
    @BindView(2131298335)
    setOnStartEnterTransitionListener rvTahun;
    @BindView(2131299615)
    TextView tvTitle;
    private List<String> j = new ArrayList();
    private List<String> c = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> a = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        String str;
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments != null) {
            this.tvTitle.setText(arguments.getString("title"));
            str2 = arguments.getString("tahun", "");
            str = arguments.getString("bulan", "");
        } else {
            str = "";
        }
        int i = Calendar.getInstance().get(1);
        int i2 = 0;
        for (int i3 = i; i3 <= i + 10; i3++) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = String.valueOf(i3);
            if (!str2.isEmpty()) {
                StringBuilder sb = new StringBuilder("20");
                sb.append(str2);
                if (i3 == Integer.parseInt(sb.toString())) {
                    daftarTransferAdapter$DaftarTransferVH.d = true;
                    i2 = i3;
                } else {
                    daftarTransferAdapter$DaftarTransferVH.d = false;
                }
            } else if (i3 == i) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            daftarTransferAdapter$DaftarTransferVH.a = DaftarTransferAdapter$DaftarTransferVH.b;
            this.a.add(daftarTransferAdapter$DaftarTransferVH);
        }
        int i4 = 0;
        for (int i5 = 1; i5 <= 12; i5++) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH2 = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH2.e = String.valueOf(i5);
            if (!str.isEmpty()) {
                if (i5 == Integer.parseInt(str)) {
                    daftarTransferAdapter$DaftarTransferVH2.d = true;
                    i4 = i5;
                } else {
                    daftarTransferAdapter$DaftarTransferVH2.d = false;
                }
            } else if (i5 == 1) {
                daftarTransferAdapter$DaftarTransferVH2.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH2.d = false;
            }
            daftarTransferAdapter$DaftarTransferVH2.a = DaftarTransferAdapter$DaftarTransferVH.c;
            this.b.add(daftarTransferAdapter$DaftarTransferVH2);
        }
        this.i = new TahunBulanAdapter(getContext(), this.a);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvTahun;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvTahun.setAdapter(this.i);
        if (!str2.isEmpty()) {
            this.rvTahun.c(i2);
        }
        this.d = new TahunBulanAdapter(getContext(), this.b);
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvBulan;
        getContext();
        setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvBulan.setAdapter(this.d);
        if (!str.isEmpty()) {
            this.rvBulan.c(i4);
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493066;
    }

    @OnClick({2131298874})
    public void onClickBtnCancel() {
        getDialog().dismiss();
    }

    @OnClick({2131299503})
    public void onClickBtnOk() {
        getDialog().dismiss();
        documentProvider b = documentProvider.b();
        String tag = getTag();
        int i = 0;
        int intValue = this.i.b >= 0 ? Integer.valueOf(this.a.get(this.i.b).e).intValue() : 0;
        if (this.d.b >= 0) {
            i = Integer.valueOf(this.b.get(this.d.b).e).intValue();
        }
        b.d(new AgamaAdapter$AgamaVH_ViewBinding(tag, intValue, i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
