package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.TahunBulanAdapter;
import java.util.ArrayList;
import java.util.List;
import o.AgamaAdapter$AgamaVH_ViewBinding;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihTahunBulanDialog.class */
public class PilihTahunBulanDialog extends BaseDialog {
    private TahunBulanAdapter b;
    private TahunBulanAdapter g;
    private Unbinder j;
    @BindView(2131298319)
    setOnStartEnterTransitionListener rvBulan;
    @BindView(2131298335)
    setOnStartEnterTransitionListener rvTahun;
    @BindColor(2131099803)
    int textColor;
    @BindColor(2131099804)
    int textSelectedColor;
    @BindView(2131299615)
    TextView tvTitle;
    private boolean c = false;
    private List<String> h = new ArrayList();
    private List<String> e = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> d = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        String str;
        bindViews(view);
        this.j = ButterKnife.bind(this, view);
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
        int i = 0;
        for (int i2 = 0; i2 <= 99; i2++) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = String.valueOf(i2);
            if (!str2.isEmpty()) {
                if (i2 == Integer.parseInt(str2)) {
                    daftarTransferAdapter$DaftarTransferVH.d = true;
                    i = i2;
                } else {
                    daftarTransferAdapter$DaftarTransferVH.d = false;
                }
            } else if (i2 == 0) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.d.add(daftarTransferAdapter$DaftarTransferVH);
        }
        int i3 = 0;
        for (int i4 = 0; i4 <= 11; i4++) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH2 = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH2.e = String.valueOf(i4);
            if (!str.isEmpty()) {
                if (i4 == Integer.parseInt(str)) {
                    daftarTransferAdapter$DaftarTransferVH2.d = true;
                    i3 = i4;
                } else {
                    daftarTransferAdapter$DaftarTransferVH2.d = false;
                }
            } else if (i4 == 0) {
                daftarTransferAdapter$DaftarTransferVH2.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH2.d = false;
            }
            this.a.add(daftarTransferAdapter$DaftarTransferVH2);
        }
        this.g = new TahunBulanAdapter(getContext(), this.d);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvTahun;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvTahun.setAdapter(this.g);
        if (!str2.isEmpty()) {
            this.rvTahun.c(i);
        }
        this.b = new TahunBulanAdapter(getContext(), this.a);
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.rvBulan;
        getContext();
        setonstartentertransitionlistener2.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvBulan.setAdapter(this.b);
        if (!str.isEmpty()) {
            this.rvBulan.c(i3);
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493096;
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
        int intValue = this.g.b >= 0 ? Integer.valueOf(this.d.get(this.g.b).e).intValue() : 0;
        if (this.b.b >= 0) {
            i = Integer.valueOf(this.a.get(this.b.b).e).intValue();
        }
        b.d(new AgamaAdapter$AgamaVH_ViewBinding(tag, intValue, i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.j.unbind();
    }
}
