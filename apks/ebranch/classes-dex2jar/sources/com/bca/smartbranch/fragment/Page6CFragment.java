package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.fragment.Page6CFragment;
import io.realm.Realm;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setOnHierarchyChangeListener;
import o.setPadding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6CFragment.class */
public class Page6CFragment extends BaseFragment implements RadioGroup.OnCheckedChangeListener {
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298232)
    RadioGroup rgTujuanPembukaan;
    @BindView(2131299416)
    TextView tvNama;

    public final /* synthetic */ void a() {
        Account account = (Account) this.c.where(Account.class).equalTo("id", Long.valueOf(((FormActivity) getActivity()).n.getId())).findFirst();
        if (account != null && account.isValid()) {
            account.deleteFromRealm();
            documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493115;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        if (!((FormActivity) getActivity()).q) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: o.getTransactionNotes1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    Page6CFragment.this.a();
                }
            });
        }
        setOnHierarchyChangeListener.a((Activity) getActivity());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        char c;
        int indexOfChild = radioGroup.indexOfChild(radioGroup.findViewById(i));
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        ((FormActivity) getActivity()).n.setPurposePemRek(String.valueOf(indexOfChild + 1));
        ((FormActivity) getActivity()).n.setEmailAddr(((FormActivity) getActivity()).r.getEmail());
        ((FormActivity) getActivity()).n.setFlagGuest(((FormActivity) getActivity()).r.isMember() ? "N" : "Y");
        String str = ((FormActivity) getActivity()).p;
        str.hashCode();
        switch (str.hashCode()) {
            case -748993769:
                if (str.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -245309302:
                if (str.equals("Tahapan Xpresi")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 164545469:
                if (str.equals("Tapres BCA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1076132060:
                if (str.equals("BCA Dollar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1726066065:
                if (str.equals("DEPOSITO")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            c(2131296811, new Page6DTahapanBCAFragment(), "Page6DTahapanBCAFragment");
        } else if (c == 1) {
            c(2131296811, new Page6DTahapanXpresiFragment(), "Page6DTahapanXpresiFragment");
        } else if (c == 2) {
            c(2131296811, new Page6DTapresFragment(), "Page6DTapresFragment");
        } else if (c == 3) {
            c(2131296811, new Page6DBCADollarFragment(), "Page6DBCADollarFragment");
        } else if (c == 4) {
            c(2131296811, new Page6ELFragment(), "Page6ELFragment");
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        if (((FormActivity) getActivity()).r.isMember()) {
            String[] split = ((FormActivity) getActivity()).r.getName().split(" ");
            if (split.length > 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(split[0]);
                sb.append(" ");
                sb.append(split[1]);
                sb.append("....");
                str = sb.toString();
            } else {
                str = ((FormActivity) getActivity()).r.getName();
            }
        } else {
            str = "Guest";
        }
        TextView textView = this.tvNama;
        StringBuilder sb2 = new StringBuilder("Hai ");
        sb2.append(str);
        sb2.append(",");
        textView.setText(Html.fromHtml(sb2.toString()));
        if (((FormActivity) getActivity()).n.isValid()) {
            ((FormActivity) getActivity()).n.setCurrentPage("Page6CFragment");
        }
        this.rgTujuanPembukaan.setOnCheckedChangeListener(this);
    }
}
