package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormActivity;
import io.realm.Realm;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setPadding;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ELFragment.class */
public class Page6ELFragment extends BaseFragment {
    @BindView(2131296842)
    setSplitTrack cvKTP;
    @BindView(2131296839)
    setSplitTrack cvKartuPelajar;
    @BindView(2131296847)
    setSplitTrack cvPaspor;

    private void b() {
        this.cvKTP.setForeground(getResources().getDrawable(2131230842));
        this.cvPaspor.setForeground(getResources().getDrawable(2131230842));
        this.cvKartuPelajar.setForeground(getResources().getDrawable(2131230842));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493120;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        char c;
        ((FormActivity) getActivity()).n.setTypeID("");
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
            e(2131296811, new Page6DTahapanBCAFragment(), "Page6DTahapanBCAFragment");
        } else if (c == 1) {
            e(2131296811, new Page6DTahapanXpresiFragment(), "Page6DTahapanXpresiFragment");
        } else if (c == 2) {
            e(2131296811, new Page6DTapresFragment(), "Page6DTapresFragment");
        } else if (c == 3) {
            e(2131296811, new Page6DBCADollarFragment(), "Page6DBCADollarFragment");
        } else if (c == 4) {
            e(2131296811, new Page6CFragment(), "Page6CFragment");
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
        char c;
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        ((FormActivity) getActivity()).n.setCurrentPage("Page6ELFragment");
        if (!((FormActivity) getActivity()).p.equals("Tahapan Xpresi")) {
            this.cvKartuPelajar.setVisibility(8);
        }
        String typeID = ((FormActivity) getActivity()).n.getTypeID();
        typeID.hashCode();
        int hashCode = typeID.hashCode();
        if (hashCode == -1911516527) {
            if (typeID.equals("Paspor")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1012311122) {
            if (hashCode == 74759 && typeID.equals("KTP")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (typeID.equals("Kartu Pelajar")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.cvPaspor.setForeground(getResources().getDrawable(2131230841));
        } else if (c == 1) {
            this.cvKartuPelajar.setForeground(getResources().getDrawable(2131230841));
        } else if (c == 2) {
            this.cvKTP.setForeground(getResources().getDrawable(2131230841));
        }
    }

    @OnClick({2131297753})
    public void showKtpPage(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        b();
        this.cvKTP.setForeground(getResources().getDrawable(2131230841));
        ((FormActivity) getActivity()).n.setTypeID("KTP");
        c(2131296811, new Page6FLKTPFragment(), "Page6FLKTPFragment");
    }

    @OnClick({2131297840})
    public void showPasporPage(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        b();
        this.cvPaspor.setForeground(getResources().getDrawable(2131230841));
        ((FormActivity) getActivity()).n.setTypeID("Paspor");
        c(2131296811, new Page6FLPasporFragment(), "Page6FLPasporFragment");
    }

    @OnClick({2131297709})
    public void showPelajarPage(View view) {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        b();
        this.cvKartuPelajar.setForeground(getResources().getDrawable(2131230841));
        ((FormActivity) getActivity()).n.setTypeID("Kartu Pelajar");
        c(2131296811, new Page6FLKartuPelajarFragment(), "Page6FLKartuPelajarFragment");
    }
}
