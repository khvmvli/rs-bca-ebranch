package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.JenisKartuAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.RegistrationActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/JenisIdDialog.class */
public class JenisIdDialog extends BaseDialog {
    private JenisKartuAdapter a;
    private List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();
    @BindView(2131296419)
    Button btnSelanjutnya;
    private Unbinder e;
    @BindArray(2130903063)
    String[] jenisId;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822227)
    String title;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new RegistrationActivity_ViewBinding(this.jenisId[this.a.b]));
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
                if (i3 >= this.jenisId.length) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.jenisId[i3])) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        String[] strArr = this.jenisId;
        int i4 = 0;
        for (String str : strArr) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.b.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.a = new JenisKartuAdapter(getContext(), this.b);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.a);
        this.tvTitle.setText(this.title);
        this.btnSelanjutnya.setText(2131821398);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
