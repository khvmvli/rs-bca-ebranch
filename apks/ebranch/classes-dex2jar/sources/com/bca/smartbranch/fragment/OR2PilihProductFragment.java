package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.InfoProductORActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import o.PilihNegaraORActivity_ViewBinding;
import o.PilihNegaraPemrekActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getUserVisibleHint;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR2PilihProductFragment.class */
public class OR2PilihProductFragment extends BaseFragment {
    @BindView(2131296397)
    Button btnLewati;
    @BindView(2131296831)
    setSplitTrack cvBCAFullPaymnet;
    @BindView(2131296841)
    setSplitTrack cvKirimanUangNormal;
    @BindView(2131296843)
    setSplitTrack cvLcs;
    @BindView(2131296845)
    setSplitTrack cvMulticurrency;
    @BindView(2131296850)
    setSplitTrack cvRtgs;

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493194;
    }

    @OnClick({2131298927})
    public void detailBCAFullPayment(View view) {
        Intent intent = new Intent(getContext(), InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822215));
        startActivity(intent);
    }

    @OnClick({2131298931})
    public void detailKirimanUangNormal(View view) {
        Intent intent = new Intent(getContext(), InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822218));
        startActivity(intent);
    }

    @OnClick({2131298932})
    public void detailLCS(View view) {
        Intent intent = new Intent(getContext(), InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822219));
        startActivity(intent);
    }

    @OnClick({2131298933})
    public void detailMultiCurrencyBCA(View view) {
        Intent intent = new Intent(getContext(), InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822220));
        startActivity(intent);
    }

    @OnClick({2131298934})
    public void detailRTGSCNY(View view) {
        Intent intent = new Intent(getContext(), InfoProductORActivity.class);
        intent.putExtra("product_type", getString(2131822221));
        startActivity(intent);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        e(2131296811, new OR2DataTransaksiAFragment(), "OR2DataTransaksiAFragment");
    }

    @OnClick({2131296397})
    public void lewati(View view) {
        ((OutwardRemittanceFormActivity) getActivity()).c("O");
        ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("O");
        c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
    }

    @OnClick({2131297726, 2131297541, 2131297775, 2131297760})
    public void onChooseMenu(View view) {
        ((OutwardRemittanceFormActivity) getActivity()).t();
        switch (view.getId()) {
            case 2131297541:
                ((OutwardRemittanceFormActivity) getActivity()).c("F");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("F");
                c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                return;
            case 2131297726:
                ((OutwardRemittanceFormActivity) getActivity()).c("O");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("O");
                c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                return;
            case 2131297760:
                ((OutwardRemittanceFormActivity) getActivity()).c("L");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("L");
                c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                return;
            case 2131297775:
                ((OutwardRemittanceFormActivity) getActivity()).c("M");
                ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("M");
                c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseORProduct(PilihNegaraPemrekActivity pilihNegaraPemrekActivity) {
        ((OutwardRemittanceFormActivity) getActivity()).c(pilihNegaraPemrekActivity.c);
        ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct(pilihNegaraPemrekActivity.c);
        OutwardRemittanceFormActivity outwardRemittanceFormActivity = (OutwardRemittanceFormActivity) getActivity();
        OR3DataTransaksiBFragment oR3DataTransaksiBFragment = new OR3DataTransaksiBFragment();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(outwardRemittanceFormActivity.l());
        getuservisiblehint.d(2131296811, oR3DataTransaksiBFragment, "OR3DataTransaksiBFragment", 2);
        getuservisiblehint.b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseProductOR(PilihNegaraORActivity_ViewBinding pilihNegaraORActivity_ViewBinding) {
        c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028c A[SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 750
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR2PilihProductFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
