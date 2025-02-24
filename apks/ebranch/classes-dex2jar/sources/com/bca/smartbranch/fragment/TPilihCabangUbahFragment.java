package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.TarikanTransaksiActivity;
import com.bca.smartbranch.activity.TarikanUbahTransaksiActivity;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.TPilihCabangUbahFragment;
import com.bca.smartbranch.presenter.BranchDetailPresenter;
import com.bca.smartbranch.presenter.GetAreaPresenter;
import com.bca.smartbranch.presenter.GetBranchPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.EditDaftarTransferBTActivity;
import o.InfoFullAmountORActivity;
import o.InfoJenisKartuActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormActivity;
import o.PenggantianKeyBCAActivity;
import o.PilihKantorCabangTarikanActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanTransaksiActivity_ViewBinding;
import o.capturePic;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseMenu;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TPilihCabangUbahFragment.class */
public class TPilihCabangUbahFragment extends BaseFragment implements GetAreaPresenter.write, GetBranchPresenter.IconCompatParcelizer, TextWatcher, BranchDetailPresenter.RemoteActionCompatParcelizer {
    @BindView(2131296339)
    public AutoCompleteTextView atvArea;
    @BindView(2131296340)
    AutoCompleteTextView atvKota;
    @BindView(2131297008)
    EditText etKantorCabang;
    @BindViews({2131296340, 2131296339, 2131297008})
    List<View> fieldList;
    private GetAreaPresenter g;
    private BranchDetailPresenter h;
    private GetBranchPresenter i;
    @BindViews({2131298580, 2131298495, 2131298518})
    List<LogoutDialog_ViewBinding> inputLayoutList;
    @BindView(2131298420)
    ScrollView lnActivityMain;
    @BindString(2131822092)
    String retry;
    @BindView(2131298495)
    LogoutDialog_ViewBinding tilArea;
    @BindView(2131298518)
    LogoutDialog_ViewBinding tilCabang;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindViews({2131299056, 2131298974, 2131299031})
    List<TextView> tvErrors;
    private List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> f = new ArrayList();
    private List<String> d = new ArrayList();
    private List<GetBranchReservationResponse.ReservationBranch> j = new ArrayList();
    private String a = "";

    private void a() {
        this.j.clear();
        this.i.b(new InfoJenisKartuActivity(this.e.getEmail(), this.e.getSessionId(), this.atvKota.getText().toString(), this.atvArea.getText().toString(), this.e.getImei()));
    }

    private void f() {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.inputLayoutList) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
    }

    @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        f();
        if (editable == this.atvKota.getEditableText() && this.atvKota.isFocused()) {
            this.atvArea.setText("");
            this.etKantorCabang.setText("");
            if (!this.f.contains(this.atvKota.getText().toString())) {
                return;
            }
        } else if (editable == this.atvArea.getEditableText() && this.atvArea.isFocused()) {
            if (this.a.length() > 0) {
                String str = this.a;
                if (str.substring(0, str.length() - 1).equals(this.atvArea.getText().toString())) {
                    this.a = "";
                    this.atvArea.setText("");
                    this.etKantorCabang.setText("");
                    if (!this.atvArea.getText().toString().isEmpty() && !this.d.contains(this.atvArea.getText().toString())) {
                        return;
                    }
                }
            }
            this.a = this.atvArea.getText().toString();
            this.etKantorCabang.setText("");
            if (!this.atvArea.getText().toString().isEmpty()) {
                return;
            }
        } else {
            return;
        }
        a();
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write, com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer
    public final void b() {
        g();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        documentProvider.b().c(this);
        this.g = new GetAreaPresenter();
        this.i = new GetBranchPresenter();
        this.h = new BranchDetailPresenter();
        this.g.a = this;
        this.i.b = this;
        this.h.d = this;
        this.f = ((TarikanUbahTransaksiActivity) getActivity()).t;
        ArrayList arrayList = new ArrayList();
        for (PenggantianKeyBCAActivity.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.f) {
            arrayList.add(remoteActionCompatParcelizer.c);
        }
        this.atvKota.setAdapter(new EditDaftarTransferBTActivity(getContext(), arrayList));
        if (((TarikanUbahTransaksiActivity) getActivity()).r != null) {
            this.atvKota.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getCity());
            this.atvArea.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getBranchAddress());
            this.etKantorCabang.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getBranchName());
        }
        if (!this.atvKota.getText().toString().isEmpty()) {
            this.tilKota.setHintEnabled(true);
        }
        if (!this.atvArea.getText().toString().isEmpty()) {
            this.tilArea.setHintEnabled(true);
        }
        if (!this.etKantorCabang.getText().toString().isEmpty()) {
            this.tilCabang.setHintEnabled(true);
        }
        this.atvKota.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.isSelected
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                TPilihCabangUbahFragment.this.atvArea.requestFocus();
            }
        });
        this.atvKota.addTextChangedListener(this);
        this.atvArea.addTextChangedListener(this);
    }

    @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer
    public final void b(String str) {
        h();
        if (!this.atvArea.getText().toString().isEmpty()) {
            this.tvErrors.get(1).setVisibility(0);
            this.tvErrors.get(1).setText(str);
            this.atvArea.requestFocus();
        } else if (!this.atvKota.getText().toString().isEmpty()) {
            this.tvErrors.get(0).setVisibility(0);
            this.tvErrors.get(0).setText(str);
            this.atvKota.requestFocus();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493277;
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write, com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write
    public final void c(onChooseMenu onchoosemenu) {
        this.d = onchoosemenu.b;
        this.atvArea.setAdapter(new EditDaftarTransferBTActivity(getContext(), this.d));
        h();
    }

    @OnClick({2131296382})
    public void cabangTerdekat(View view) {
        ((TarikanUbahTransaksiActivity) getActivity()).b(false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void clearValueFieldReservationEvent(TarikanTransaksiActivity_ViewBinding tarikanTransaksiActivity_ViewBinding) {
        Iterator<View> it = this.fieldList.iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).getText().clear();
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.inputLayoutList) {
            logoutDialog_ViewBinding.setHintEnabled(false);
        }
        this.d.clear();
        this.atvArea.setAdapter(new ArrayAdapter(getContext(), 17367049, this.d));
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write
    public final void d() {
        h();
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write, com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void d(OutwardRemittanceFormActivity outwardRemittanceFormActivity) {
        h();
        ((TarikanUbahTransaksiActivity) getActivity()).q = outwardRemittanceFormActivity.b;
        ((TarikanUbahTransaksiActivity) getActivity()).b(true);
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write
    public final void e() {
        h();
    }

    @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer
    public final void e(GetBranchReservationResponse getBranchReservationResponse) {
        this.j = getBranchReservationResponse.a;
        h();
    }

    @Override // com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnActivityMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetAreaPresenter.write, com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.BranchDetailPresenter.RemoteActionCompatParcelizer
    public final void h(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetBranchPresenter.IconCompatParcelizer
    public final void i(String str) {
        h();
        if (!this.atvArea.getText().toString().isEmpty()) {
            this.tvErrors.get(1).setVisibility(0);
            this.tvErrors.get(1).setText(str);
            this.atvArea.requestFocus();
        }
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        f();
        if (this.etKantorCabang.getText().toString().isEmpty()) {
            this.tvErrors.get(2).setVisibility(0);
            this.tvErrors.get(2).setText(getString(2131820748));
            this.etKantorCabang.requestFocus();
        }
        if (this.atvArea.getText().toString().isEmpty() || this.d.contains(this.atvArea.getText().toString())) {
            if (this.atvKota.getText().toString().isEmpty()) {
                this.tvErrors.get(0).setVisibility(0);
                this.tvErrors.get(0).setText(getString(2131820760));
                this.atvKota.requestFocus();
            } else if (!this.f.contains(this.atvKota.getText().toString())) {
                this.tvErrors.get(0).setVisibility(0);
                this.tvErrors.get(0).setText(getString(2131820762));
                this.atvKota.requestFocus();
            }
            if (this.tvErrors.get(0).getVisibility() == 8 && this.tvErrors.get(1).getVisibility() == 8 && this.tvErrors.get(2).getVisibility() == 8) {
                BranchDetailPresenter branchDetailPresenter = this.h;
                Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity>> c = branchDetailPresenter.apiService.c(new capturePic(((TarikanTransaksiActivity) getActivity()).s.getBranchCode()));
                branchDetailPresenter.c = c;
                c.enqueue(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0196: INVOKE  
                      (r0v36 'c' retrofit2.Call<o.OpenAccountSuccessActivity<o.OutwardRemittanceFormActivity>>)
                      (wrap: com.bca.smartbranch.presenter.BranchDetailPresenter$2 : 0x0193: CONSTRUCTOR  (r1v9 com.bca.smartbranch.presenter.BranchDetailPresenter$2 A[REMOVE]) = (r0v32 'branchDetailPresenter' com.bca.smartbranch.presenter.BranchDetailPresenter) call: com.bca.smartbranch.presenter.BranchDetailPresenter.2.<init>(com.bca.smartbranch.presenter.BranchDetailPresenter):void type: CONSTRUCTOR)
                     type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.TPilihCabangUbahFragment.lanjut(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/TPilihCabangUbahFragment.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.BranchDetailPresenter, state: GENERATED_AND_UNLOADED
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
                    	... 31 more
                    */
                /*
                // Method dump skipped, instructions count: 412
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.TPilihCabangUbahFragment.lanjut(android.view.View):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
                getPromotion.d(getContext());
                ((TarikanUbahTransaksiActivity) getActivity()).q = null;
                ((TarikanUbahTransaksiActivity) getActivity()).r = null;
                e(2131296811, new TarikanUbahInfoBiayaFragment(), "TarikanUbahInfoBiayaFragment");
            }

            @OnFocusChange({2131296340, 2131296339})
            public void onChange(View view, boolean z) {
                if (z) {
                    switch (view.getId()) {
                        case 2131296339:
                            this.tilArea.setHintEnabled(true);
                            f();
                            this.atvArea.setCursorVisible(false);
                            if (this.atvKota.getText().toString().isEmpty()) {
                                this.tvErrors.get(0).setVisibility(0);
                                this.tvErrors.get(0).setText(getString(2131820760));
                                this.atvKota.requestFocus();
                                return;
                            } else if (!this.f.contains(this.atvKota.getText().toString())) {
                                this.tvErrors.get(0).setVisibility(0);
                                this.tvErrors.get(0).setText(getString(2131820762));
                                this.atvKota.requestFocus();
                                return;
                            } else {
                                this.atvArea.setCursorVisible(true);
                                this.g.c(new InfoFullAmountORActivity(this.e.getEmail(), this.e.getSessionId(), this.atvKota.getText().toString(), this.e.getImei()));
                                return;
                            }
                        case 2131296340:
                            this.tilKota.setHintEnabled(true);
                            return;
                        default:
                            return;
                    }
                } else {
                    switch (view.getId()) {
                        case 2131296339:
                            if (this.atvArea.getText().toString().isEmpty()) {
                                this.tilArea.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131296340:
                            if (this.atvKota.getText().toString().isEmpty()) {
                                this.tilKota.setHintEnabled(false);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseKantorCabangTarikanEvent(PilihKantorCabangTarikanActivity pilihKantorCabangTarikanActivity) {
                ((TarikanUbahTransaksiActivity) getActivity()).r = pilihKantorCabangTarikanActivity.c;
                if (this.atvKota.getText().toString().isEmpty()) {
                    this.atvKota.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getCity());
                    this.tilKota.setHintEnabled(true);
                }
                if (this.atvArea.getText().toString().isEmpty()) {
                    this.atvArea.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getBranchAddress());
                    this.tilArea.setHintEnabled(true);
                }
                this.tilCabang.setHintEnabled(true);
                this.etKantorCabang.setText(((TarikanUbahTransaksiActivity) getActivity()).r.getBranchName());
            }

            @Override // androidx.fragment.app.Fragment
            public void onDestroy() {
                documentProvider.b().e(this);
                onDestroy();
                GetAreaPresenter getAreaPresenter = this.g;
                Call<OpenAccountSuccessActivity<onChooseMenu>> call = getAreaPresenter.c;
                if (call != null) {
                    call.cancel();
                }
                getAreaPresenter.a = null;
                GetBranchPresenter getBranchPresenter = this.i;
                Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> call2 = getBranchPresenter.c;
                if (call2 != null) {
                    call2.cancel();
                }
                getBranchPresenter.b = null;
                BranchDetailPresenter branchDetailPresenter = this.h;
                Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity>> call3 = branchDetailPresenter.c;
                if (call3 != null) {
                    call3.cancel();
                }
                branchDetailPresenter.c = null;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @OnClick({2131297008})
            public void showKantorCabang(View view) {
                f();
                this.etKantorCabang.setCursorVisible(false);
                if (this.atvArea.getText().toString().isEmpty() || this.d.contains(this.atvArea.getText().toString())) {
                    if (this.atvKota.getText().toString().isEmpty()) {
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(getString(2131820760));
                        this.atvKota.requestFocus();
                    } else if (!this.f.contains(this.atvKota.getText().toString())) {
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(getString(2131820762));
                        this.atvKota.requestFocus();
                    }
                    if (this.tvErrors.get(0).getVisibility() == 8 && this.tvErrors.get(1).getVisibility() == 8 && !this.j.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("city", this.atvKota.getText().toString());
                        bundle.putString("area", this.atvArea.getText().toString());
                        bundle.putParcelable("listBranch", ListUtil.OneItemImmutableList.e(this.j));
                        Intent intent = new Intent(getContext(), com.bca.smartbranch.activity.PilihKantorCabangTarikanActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                this.tvErrors.get(1).setVisibility(0);
                this.tvErrors.get(1).setText(getString(2131820722));
                this.atvArea.requestFocus();
            }
        }
