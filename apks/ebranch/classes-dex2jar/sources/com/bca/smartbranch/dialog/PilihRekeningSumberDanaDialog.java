package com.bca.smartbranch.dialog;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.RekeningSumberDanaAdapter;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ReservasiROSuccessActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PilihRekeningSumberDanaDialog.class */
public class PilihRekeningSumberDanaDialog extends BaseDialog implements TextWatcher {
    public GetCustAcctListResponse d;
    @BindView(2131297176)
    EditText etSearch;
    private RekeningSumberDanaAdapter h;
    private Unbinder i;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822255)
    String title;
    @BindView(2131299615)
    TextView tvTitle;
    List<String> e = new ArrayList();
    List<DaftarTransferAdapter$DaftarTransferVH> a = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> c = new ArrayList();
    public String b = "";

    private void c() {
        boolean z = true;
        for (String str : this.e) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (this.b.isEmpty() && z) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
                z = false;
            } else if (this.b.isEmpty() || !str.contains(this.b)) {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            }
            this.c.add(daftarTransferAdapter$DaftarTransferVH);
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        RekeningSumberDanaAdapter rekeningSumberDanaAdapter = new RekeningSumberDanaAdapter(getContext(), this.c);
        this.h = rekeningSumberDanaAdapter;
        this.rvContent.setAdapter(rekeningSumberDanaAdapter);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.toString().length() > 0) {
            this.a.clear();
            for (DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH : this.c) {
                if (daftarTransferAdapter$DaftarTransferVH.e.toLowerCase().contains(editable.toString().toLowerCase())) {
                    this.a.add(daftarTransferAdapter$DaftarTransferVH);
                } else {
                    daftarTransferAdapter$DaftarTransferVH.d = false;
                }
            }
            RekeningSumberDanaAdapter rekeningSumberDanaAdapter = this.h;
            rekeningSumberDanaAdapter.e = this.a;
            rekeningSumberDanaAdapter.b = null;
            rekeningSumberDanaAdapter.f = -1;
            rekeningSumberDanaAdapter.a.b();
            return;
        }
        RekeningSumberDanaAdapter rekeningSumberDanaAdapter2 = this.h;
        rekeningSumberDanaAdapter2.e = this.c;
        rekeningSumberDanaAdapter2.b = null;
        rekeningSumberDanaAdapter2.f = -1;
        rekeningSumberDanaAdapter2.a.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.i = ButterKnife.bind(this, view);
        for (GetCustAcctListResponse.AccountData accountData : this.d.getAccountList()) {
            List<String> list = this.e;
            StringBuilder sb = new StringBuilder();
            sb.append(accountData.getAccountNumber());
            sb.append(" - ");
            sb.append(accountData.getAccountType());
            list.add(sb.toString());
        }
        getDialog().setCanceledOnTouchOutside(false);
        this.tvTitle.setText(this.title);
        this.etSearch.addTextChangedListener(this);
        c();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493095;
    }

    @OnClick({2131296385})
    public void onClickClose(View view) {
        dismiss();
    }

    @OnClick({2131296419})
    public void onClickPilih(View view) {
        if (this.h.f >= 0) {
            documentProvider.b().d(new ReservasiROSuccessActivity(this.h.e()));
        }
        dismiss();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @OnClick({2131296852})
    public void search() {
        this.etSearch.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.etSearch, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.i.unbind();
    }
}
