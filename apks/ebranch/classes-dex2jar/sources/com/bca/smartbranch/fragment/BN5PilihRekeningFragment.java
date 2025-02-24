package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.BN6PembayaranActivity;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.adapter.NomorRekeningBNAdapter;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.BN5KonfirmasiTransaksiDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.CheckOTPSessionPresenter;
import com.bca.smartbranch.presenter.GetRatePresenter;
import com.bca.smartbranch.presenter.SubmitBankNotesPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import o.CategoryListAdapter$CategoryListVH_ViewBinding;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.InfoTellerActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.isDetached;
import o.isDetached$MediaBrowserCompat$CustomActionResultReceiver;
import o.ivfotoProfil;
import o.onChooseJenisMataUang;
import o.onChooseLanjut;
import o.retakePicture;
import o.setOnStartEnterTransitionListener;
import o.togglePIN;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5PilihRekeningFragment.class */
public class BN5PilihRekeningFragment extends BaseFragment implements SubmitBankNotesPresenter.RemoteActionCompatParcelizer, GetRatePresenter.IconCompatParcelizer, CheckOTPSessionPresenter.RemoteActionCompatParcelizer {
    private List<DaftarTransferAdapter$DaftarTransferVH> a = new ArrayList();
    private List<ConfirmSubMastercardAdapter$ViewHolder.read> d;
    private SubmitBankNotesPresenter f;
    private CheckOTPSessionPresenter g;
    private ConfirmSubMastercardAdapter$ViewHolder h;
    private GetRatePresenter i;
    private NomorRekeningBNAdapter j;
    private User m;
    @BindView(2131298333)
    setOnStartEnterTransitionListener rvNomorRekening;
    @BindView(2131299126)
    TextView tvErrorNoRek;

    private void e() {
        User user = this.m;
        String imei = user != null ? user.getImei() : "";
        User user2 = this.m;
        String sessionId = user2 != null ? user2.getSessionId() : "";
        User user3 = this.m;
        String email = user3 != null ? user3.getEmail() : "";
        togglePIN togglepin = new togglePIN();
        togglepin.j = imei;
        togglepin.g = sessionId;
        togglepin.i = email;
        togglepin.a = this.d.get(this.j.e).b;
        togglepin.e = this.h.a.replaceAll(",", "");
        togglepin.c = this.h.n.e;
        togglepin.d = this.h.c;
        togglepin.b = this.h.b;
        SubmitBankNotesPresenter submitBankNotesPresenter = this.f;
        submitBankNotesPresenter.c.i_();
        Call<OpenAccountSuccessActivity<SubmitBankNotesResponse>> e = submitBankNotesPresenter.apiService.e(togglepin);
        submitBankNotesPresenter.d = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d4: INVOKE  
              (r0v24 'e' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.SubmitBankNotesResponse>>)
              (wrap: com.bca.smartbranch.presenter.SubmitBankNotesPresenter$1 : 0x00d1: CONSTRUCTOR  (r1v25 com.bca.smartbranch.presenter.SubmitBankNotesPresenter$1 A[REMOVE]) = (r0v19 'submitBankNotesPresenter' com.bca.smartbranch.presenter.SubmitBankNotesPresenter) call: com.bca.smartbranch.presenter.SubmitBankNotesPresenter.1.<init>(com.bca.smartbranch.presenter.SubmitBankNotesPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.BN5PilihRekeningFragment.e():void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5PilihRekeningFragment.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.SubmitBankNotesPresenter, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.BN5PilihRekeningFragment.e():void");
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void a() {
        h();
        d(2131296811, this, new BN5PilihNomorOTPFragment(), "BN5PilihRekeningFragment");
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer
    public final void a(SubmitBankNotesResponse submitBankNotesResponse) {
        h();
        Intent intent = new Intent(getContext(), BN6PembayaranActivity.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(submitBankNotesResponse.getTxnDataOutput()));
        intent.putExtra("tujuan_pembelian", this.h.n.a);
        startActivity(intent);
        getActivity().finish();
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void b() {
        e();
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493163;
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void c(onChooseLanjut onchooselanjut) {
        this.h.l = Double.valueOf(onchooselanjut.e).doubleValue();
        this.h.f82o = new BigDecimal(this.h.l).multiply(BigDecimal.valueOf(Double.valueOf(this.h.a.replaceAll(",", "")).doubleValue())).setScale(2, RoundingMode.HALF_UP);
        int compare = Double.compare(this.h.f, this.h.l);
        if (compare > 0 || compare < 0) {
            h();
            new BN5KonfirmasiTransaksiDialog().show(getFragmentManager(), "BN5KonfirmasiTransaksiDialog");
            return;
        }
        retakePicture retakepicture = new retakePicture();
        retakepicture.e = this.m.getEmail();
        retakepicture.c = this.m.getImei();
        retakepicture.d = this.m.getSessionId();
        this.g.e(retakepicture);
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void d() {
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer
    public final void f(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void g(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void h(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitBankNotesPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void i_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void j_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.CheckOTPSessionPresenter.RemoteActionCompatParcelizer
    public final void k_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @OnClick({2131296396})
    public void lanjut() {
        if (this.j.e < 0) {
            this.tvErrorNoRek.setVisibility(0);
            return;
        }
        this.h.i = this.d.get(this.j.e);
        String str = this.h.j.b;
        String str2 = this.h.j.f;
        InfoTellerActivity infoTellerActivity = new InfoTellerActivity();
        infoTellerActivity.a = this.m.getEmail();
        infoTellerActivity.c = this.m.getImei();
        infoTellerActivity.e = this.m.getSessionId();
        infoTellerActivity.b = str;
        if (!str.equals("USD")) {
            infoTellerActivity.d = "";
        } else if (str2.contains("Mulus")) {
            infoTellerActivity.d = "M";
        } else if (str2.contains("Cap")) {
            infoTellerActivity.d = "C";
        }
        this.i.b(infoTellerActivity);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        GetRatePresenter getRatePresenter = this.i;
        Call<OpenAccountSuccessActivity<onChooseLanjut>> call = getRatePresenter.e;
        if (call != null) {
            call.cancel();
        }
        getRatePresenter.d = null;
        SubmitBankNotesPresenter submitBankNotesPresenter = this.f;
        Call<OpenAccountSuccessActivity<SubmitBankNotesResponse>> call2 = submitBankNotesPresenter.d;
        if (call2 != null) {
            call2.cancel();
        }
        submitBankNotesPresenter.c = null;
        CheckOTPSessionPresenter checkOTPSessionPresenter = this.g;
        Call<OpenAccountSuccessActivity> call3 = checkOTPSessionPresenter.c;
        if (call3 != null) {
            call3.cancel();
        }
        checkOTPSessionPresenter.a = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSelectNoRek(ivfotoProfil ivfotoprofil) {
        this.tvErrorNoRek.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        GetRatePresenter getRatePresenter = new GetRatePresenter();
        this.i = getRatePresenter;
        getRatePresenter.d = this;
        SubmitBankNotesPresenter submitBankNotesPresenter = new SubmitBankNotesPresenter();
        this.f = submitBankNotesPresenter;
        submitBankNotesPresenter.c = this;
        CheckOTPSessionPresenter checkOTPSessionPresenter = new CheckOTPSessionPresenter();
        this.g = checkOTPSessionPresenter;
        checkOTPSessionPresenter.a = this;
        this.m = ((FormBankNotesActivity) getActivity()).w();
        ConfirmSubMastercardAdapter$ViewHolder confirmSubMastercardAdapter$ViewHolder = ((FormBankNotesActivity) getActivity()).n;
        this.h = confirmSubMastercardAdapter$ViewHolder;
        List<ConfirmSubMastercardAdapter$ViewHolder.read> list = confirmSubMastercardAdapter$ViewHolder.d;
        this.d = list;
        for (ConfirmSubMastercardAdapter$ViewHolder.read read : list) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = read.e;
            daftarTransferAdapter$DaftarTransferVH.d = false;
            this.a.add(daftarTransferAdapter$DaftarTransferVH);
        }
        this.j = new NomorRekeningBNAdapter(getContext(), this.a);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvNomorRekening;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvNomorRekening.setAdapter(this.j);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeCancelBankNotesEvent(onChooseJenisMataUang onchoosejenismatauang) {
        isDetached fragmentManager = getFragmentManager();
        fragmentManager.e(new isDetached$MediaBrowserCompat$CustomActionResultReceiver(fragmentManager, "BN3PilihCabangFragment", -1, 0), false);
        getActivity().onBackPressed();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSubmitBankNotesEvent(CategoryListAdapter$CategoryListVH_ViewBinding categoryListAdapter$CategoryListVH_ViewBinding) {
        e();
    }
}
