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
import com.bca.smartbranch.adapter.SumberDanaAdapter;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ReservasiTellerOActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SumberDanaORDialog.class */
public class SumberDanaORDialog extends BaseDialog {
    private List<CategoriesORResponse.Category> a;
    private Unbinder b;
    private List<DaftarTransferAdapter$DaftarTransferVH> c = new ArrayList();
    @BindArray(2130903095)
    String[] dataSumberDana;
    private SumberDanaAdapter e;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822272)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    public SumberDanaORDialog(List<CategoriesORResponse.Category> list) {
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new ReservasiTellerOActivity_ViewBinding(this.a.get(this.e.b).getContentIn(), this.a.get(this.e.b).getContentOrder()));
    }

    @OnClick({2131296385})
    public void close() {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493089;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= this.a.size()) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.a.get(i3).getContentIn())) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (CategoriesORResponse.Category category : this.a) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = category.getContentIn();
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.c.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.e = new SumberDanaAdapter(getContext(), this.c);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.e);
        this.tvTitle.setText(this.title);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
