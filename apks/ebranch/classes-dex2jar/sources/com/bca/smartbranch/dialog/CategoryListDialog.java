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
import com.bca.smartbranch.adapter.CategoryListAdapter;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.ListUtil;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CategoryListDialog.class */
public class CategoryListDialog extends BaseDialog {
    private String c;
    private Unbinder d;
    private CategoryListAdapter e;
    private String f;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822198)
    String titleBankName;
    @BindString(2131822200)
    String titleBusinessField;
    @BindString(2131822247)
    String titleEducation;
    @BindString(2131822270)
    String titleHomeStatus;
    @BindString(2131822269)
    String titleMaritalStatus;
    @BindString(2131822228)
    String titleOccupationJabatan;
    @BindString(2131822239)
    String titleOccupationPekerjaan;
    @BindString(2131822211)
    String titleRelationship;
    @BindView(2131299615)
    TextView tvTitle;
    private List<CategoryResponse> b = new ArrayList();
    private List<DaftarTransferAdapter$DaftarTransferVH> a = new ArrayList();

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CategoryListDialog$write.class */
    public class write {
        public CategoryResponse a;
        public String c;
        public String d;

        public write(String str, CategoryResponse categoryResponse, String str2) {
            CategoryListDialog.this = r4;
            this.c = str;
            this.a = categoryResponse;
            this.d = str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        int i;
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        char c = 0;
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        this.b = (List) ListUtil.OneItemImmutableList.a(arguments.getParcelable("list_data"));
        this.c = arguments.getString("type_category");
        this.f = arguments.getString("TYPE_OCCUPATION");
        ArrayList<String> arrayList = new ArrayList();
        for (CategoryResponse categoryResponse : this.b) {
            arrayList.add(categoryResponse.getDescription());
        }
        if (arguments != null) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= arrayList.size()) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(arrayList.get(i3))) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (String str : arrayList) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.a.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.e = new CategoryListAdapter(getContext(), this.a);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.e);
        String str2 = this.c;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -1858338105:
                if (str2.equals("bankname")) {
                    break;
                }
                c = 65535;
                break;
            case -1621915162:
                if (str2.equals("maritalstatus")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -290756696:
                if (str2.equals("education")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -261851592:
                if (str2.equals("relationship")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 636205370:
                if (str2.equals("businessfield")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1615358283:
                if (str2.equals("occupation")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1812291985:
                if (str2.equals("homestatus")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.tvTitle.setText(this.titleBankName);
                return;
            case 1:
                this.tvTitle.setText(this.titleMaritalStatus);
                return;
            case 2:
                this.tvTitle.setText(this.titleEducation);
                return;
            case 3:
                this.tvTitle.setText(this.titleRelationship);
                return;
            case 4:
                this.tvTitle.setText(this.titleBusinessField);
                return;
            case 5:
                if (this.f.equalsIgnoreCase("pekerjaan")) {
                    this.tvTitle.setText(this.titleOccupationPekerjaan);
                    return;
                } else if (this.f.equalsIgnoreCase("jabatan")) {
                    this.tvTitle.setText(this.titleOccupationPekerjaan);
                    return;
                } else {
                    return;
                }
            case 6:
                this.tvTitle.setText(this.titleHomeStatus);
                return;
            default:
                return;
        }
    }

    @OnClick({2131296385})
    public void clickClose(View view) {
        getDialog().dismiss();
    }

    @OnClick({2131296419})
    public void clickPilih(View view) {
        getDialog().dismiss();
        documentProvider.b().d(new write(this.c, this.b.get(this.e.b), getTag()));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493089;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
