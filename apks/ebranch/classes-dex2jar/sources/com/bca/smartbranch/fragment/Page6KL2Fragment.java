package com.bca.smartbranch.fragment;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindArray;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.BidangPekerjaanDialog;
import com.bca.smartbranch.dialog.DeskripsiPekerjaanDialog;
import com.bca.smartbranch.dialog.JenisPekerjaanDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PenghasilanPerTahunDialog;
import com.bca.smartbranch.dialog.SumberPenghasilanDialog;
import com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter;
import com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.PilihTujuanTransaksiORActivity_ViewBinding;
import o.RegistrationActivity;
import o.RegistrationSuccessActivity_ViewBinding;
import o.ReservasiSuccessActivity;
import o.ReservasiTellerSuccessActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setPadding;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class */
public class Page6KL2Fragment extends BaseFragment implements TextWatcher, Validator.ValidationListener, GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> a;
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> d;
    @BindView(2131296966)
    @NotEmpty(messageResId = 2131820745, trim = true)
    @Order(3)
    EditText etBidangPekerjaan;
    @BindView(2131296973)
    @NotEmpty(messageResId = 2131820775, trim = true)
    @Order(2)
    EditText etDescPekerjaan;
    @BindViews({2131297140, 2131296973, 2131296966, 2131297202, 2131297146, 2131297145})
    List<View> etFields;
    @BindView(2131297140)
    @NotEmpty(messageResId = 2131820817, trim = true)
    @Order(1)
    EditText etPekerjaan;
    @BindView(2131297145)
    @NotEmpty(messageResId = 2131820989, trim = true)
    @Order(6)
    EditText etPenghasilan;
    @BindView(2131297146)
    @NotEmpty(messageResId = 2131820807, trim = true)
    @Order(5)
    EditText etPenghasilanLain;
    @BindView(2131297202)
    @NotEmpty(messageResId = 2131820806, trim = true)
    @Order(4)
    EditText etSumberPenghasilan;
    private GetDaftarPekerjaanPresenter f;
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> g;
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> h;
    private Validator i;
    private ViewAnimator j;
    @BindArray(2130903084)
    String[] listPenghasilanPerTahun;
    @BindArray(2130903096)
    String[] listSumberPenghasilan;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131298516)
    LogoutDialog_ViewBinding tilBidangPekerjaan;
    @BindView(2131298524)
    LogoutDialog_ViewBinding tilDescPekerjaan;
    @BindViews({2131298684, 2131298524, 2131298516, 2131298734, 2131298688, 2131298687})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298684)
    LogoutDialog_ViewBinding tilPekerjaan;
    @BindView(2131298687)
    LogoutDialog_ViewBinding tilPenghasilan;
    @BindView(2131298688)
    LogoutDialog_ViewBinding tilPenghasilanLain;
    @BindView(2131298734)
    LogoutDialog_ViewBinding tilSumberPenghasilan;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindViews({2131299153, 2131299003, 2131298995, 2131299202, 2131299156, 2131299155})
    List<TextView> tvErrors;

    private void b(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
        this.a = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
        if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
            for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput : this.a) {
                if (dataPekerjaanOutput.getDescription().contains("Pelajar")) {
                    ((FormActivity) getActivity()).n.setJob(dataPekerjaanOutput.getCode());
                    ((FormActivity) getActivity()).n.setJobValue(dataPekerjaanOutput.getDescription());
                    this.etPekerjaan.setText(dataPekerjaanOutput.getDescription());
                    this.tilPekerjaan.setHintEnabled(true);
                    this.etPekerjaan.setEnabled(false);
                }
            }
        }
        if (this.etPekerjaan.getText().toString().isEmpty()) {
            this.j.setDisplayedChild(2);
            return;
        }
        String str = "";
        for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput2 : this.a) {
            if (dataPekerjaanOutput2.getDescription().equalsIgnoreCase(this.etPekerjaan.getText().toString())) {
                str = dataPekerjaanOutput2.getNextCategory();
            }
        }
        if (!str.equalsIgnoreCase("-")) {
            GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
            Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = getDaftarPekerjaanPresenter.apiService.g(str);
            getDaftarPekerjaanPresenter.b = g;
            g.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: INVOKE  
                  (r0v54 'g' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse>>)
                  (wrap: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$4 : 0x00ff: CONSTRUCTOR  (r1v11 com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$4 A[REMOVE]) = (r0v51 'getDaftarPekerjaanPresenter' com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter) call: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.4.<init>(com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.Page6KL2Fragment.a(com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter, state: GENERATED_AND_UNLOADED
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
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 379
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.a(com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse):void");
        }

        @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void a(String str) {
            h();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, -1).g();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            getPromotion.a(editable);
            if (editable == this.etPenghasilanLain.getEditableText()) {
                EditText editText = this.etPenghasilanLain;
                if (this.tvErrors.get(this.etFields.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
                    b(this.etFields.indexOf(editText));
                }
                ((FormActivity) getActivity()).n.setIncomeSourceOthers(editable.toString());
            }
        }

        @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void b() {
            this.j.setDisplayedChild(0);
        }

        @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void b(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
            h();
            this.h = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
            ((FormActivity) getActivity()).n.setOccupation(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation());
            ((FormActivity) getActivity()).n.setBusinessField(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField());
            if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation().isEmpty()) {
                ((FormActivity) getActivity()).n.setOccupationFlagFreeText("Y");
            } else {
                ((FormActivity) getActivity()).n.setOccupationFlagFreeText("N");
            }
            if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField().isEmpty()) {
                ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("Y");
            } else {
                ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("N");
            }
        }

        @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void b(String str) {
            h();
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, str, 0).g();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // com.bca.smartbranch.fragment.BaseFragment
        protected final int c() {
            return 2131493137;
        }

        @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
        public final void c(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
            this.d = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
            if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getNextCategory() != null) {
                this.tilDescPekerjaan.setVisibility(0);
                if (!this.etDescPekerjaan.getText().toString().isEmpty()) {
                    String str = "";
                    for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput : this.d) {
                        if (dataPekerjaanOutput.getDescription().equalsIgnoreCase(this.etDescPekerjaan.getText().toString())) {
                            str = dataPekerjaanOutput.getNextCategory();
                        }
                    }
                    GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
                    Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = getDaftarPekerjaanPresenter.apiService.g(str);
                    getDaftarPekerjaanPresenter.b = g;
                    g.enqueue(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: INVOKE  
                          (r0v65 'g' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse>>)
                          (wrap: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$2 : 0x008a: CONSTRUCTOR  (r1v23 com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$2 A[REMOVE]) = (r0v62 'getDaftarPekerjaanPresenter' com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter) call: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.2.<init>(com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter):void type: CONSTRUCTOR)
                         type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.Page6KL2Fragment.c(com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter, state: GENERATED_AND_UNLOADED
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
                        	... 27 more
                        */
                    /*
                    // Method dump skipped, instructions count: 340
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.c(com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse):void");
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void c(String str) {
                    this.tvErrorMessage.setText(str);
                    this.j.setDisplayedChild(1);
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void d(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
                    h();
                    this.g = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getNextCategory() != null) {
                        this.tilBidangPekerjaan.setVisibility(0);
                        return;
                    }
                    this.tilBidangPekerjaan.setVisibility(8);
                    ((FormActivity) getActivity()).n.setOccupation(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation());
                    ((FormActivity) getActivity()).n.setBusinessField(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField());
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation().isEmpty()) {
                        ((FormActivity) getActivity()).n.setOccupationFlagFreeText("Y");
                    } else {
                        ((FormActivity) getActivity()).n.setOccupationFlagFreeText("N");
                    }
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField().isEmpty()) {
                        ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("Y");
                    } else {
                        ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("N");
                    }
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void d(String str) {
                    this.tvErrorMessage.setText(str);
                    this.j.setDisplayedChild(1);
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void e() {
                    g();
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void e(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
                    h();
                    this.d = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getNextCategory() != null) {
                        this.tilDescPekerjaan.setVisibility(0);
                        this.tilBidangPekerjaan.setVisibility(8);
                        return;
                    }
                    this.tilDescPekerjaan.setVisibility(8);
                    this.tilBidangPekerjaan.setVisibility(8);
                    ((FormActivity) getActivity()).n.setOccupation(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation());
                    ((FormActivity) getActivity()).n.setBusinessField(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField());
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation().isEmpty()) {
                        ((FormActivity) getActivity()).n.setOccupationFlagFreeText("Y");
                    } else {
                        ((FormActivity) getActivity()).n.setOccupationFlagFreeText("N");
                    }
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField().isEmpty()) {
                        ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("Y");
                    } else {
                        ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("N");
                    }
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void e(String str) {
                    h();
                    Bundle bundle = new Bundle();
                    bundle.putString("MessageDialogContent", str);
                    MessageDialog messageDialog = new MessageDialog();
                    messageDialog.setArguments(bundle);
                    messageDialog.show(getActivity().l(), "MessageDialog");
                }

                @Stetho$Initializer$RealSocketHandlerFactory
                public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
                    this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6KL2Fragment.2
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setJob("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setJobValue("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setOccupation("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setOccupationValue("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setBusinessField("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setBusinessFieldValue("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setIncomeSource("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setIncomeSourceValue("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setIncomeSourceOthers("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setSalary("");
                            ((FormActivity) Page6KL2Fragment.this.getActivity()).n.setSalaryValue("");
                        }
                    });
                    e(2131296811, new Page6KLFragment(), "Page6KLFragment");
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void h(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
                    this.g = getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList();
                    if (getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getNextCategory() != null) {
                        this.tilBidangPekerjaan.setVisibility(0);
                    } else {
                        this.tilBidangPekerjaan.setVisibility(8);
                        ((FormActivity) getActivity()).n.setOccupation(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getOccupation());
                        ((FormActivity) getActivity()).n.setBusinessField(getDaftarPekerjaanResponse.getDaftarPekerjaanOutputList().get(0).getBusinessField());
                        if (((FormActivity) getActivity()).n.getOccupation().isEmpty()) {
                            ((FormActivity) getActivity()).n.setOccupationFlagFreeText("Y");
                        } else {
                            ((FormActivity) getActivity()).n.setOccupationFlagFreeText("N");
                        }
                        if (((FormActivity) getActivity()).n.getBusinessField().isEmpty()) {
                            ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("Y");
                        } else {
                            ((FormActivity) getActivity()).n.setBusinessFieldFlagFreeText("N");
                        }
                    }
                    this.j.setDisplayedChild(2);
                }

                @Override // com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver
                public final void i(String str) {
                    this.tvErrorMessage.setText(str);
                    this.j.setDisplayedChild(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v1, types: [int] */
                /* JADX WARN: Type inference failed for: r5v4 */
                @OnClick({2131296396})
                public void next(View view) {
                    getPromotion.d(getActivity());
                    int i = ((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar");
                    while (i < this.etFields.size()) {
                        this.tvErrors.get(i).setVisibility(8);
                        this.tilForms.get(i).setBackgroundResource(2131230847);
                        i = (i == true ? 1 : 0) + 1;
                    }
                    this.i.validate();
                }

                @OnFocusChange({2131297146})
                public void onChange(View view, boolean z) {
                    if (z) {
                        this.tilPenghasilanLain.setHintEnabled(true);
                    } else if (this.etPenghasilanLain.getText().toString().isEmpty()) {
                        this.tilPenghasilanLain.setHintEnabled(false);
                    }
                }

                @Stetho$Initializer$RealSocketHandlerFactory
                public void onChooseValueBidangPekerjaan(PilihTujuanTransaksiORActivity_ViewBinding pilihTujuanTransaksiORActivity_ViewBinding) {
                    b(this.etFields.indexOf(this.etBidangPekerjaan));
                    if (this.g.get(pilihTujuanTransaksiORActivity_ViewBinding.a).getDescription() != null) {
                        ((FormActivity) getActivity()).n.setBusinessFieldValue(this.g.get(pilihTujuanTransaksiORActivity_ViewBinding.a).getDescription());
                    }
                    this.tilBidangPekerjaan.setHintEnabled(true);
                    this.etBidangPekerjaan.setError(null);
                    this.etBidangPekerjaan.setText(this.g.get(pilihTujuanTransaksiORActivity_ViewBinding.a).getDescription());
                    if (!this.g.get(pilihTujuanTransaksiORActivity_ViewBinding.a).getNextCategory().equalsIgnoreCase("-")) {
                        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
                        String nextCategory = this.g.get(pilihTujuanTransaksiORActivity_ViewBinding.a).getNextCategory();
                        getDaftarPekerjaanPresenter.c.e();
                        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = getDaftarPekerjaanPresenter.apiService.g(nextCategory);
                        getDaftarPekerjaanPresenter.b = g;
                        g.enqueue(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: INVOKE  
                              (r0v29 'g' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse>>)
                              (wrap: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$6 : 0x00c4: CONSTRUCTOR  (r1v19 com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$6 A[REMOVE]) = (r0v19 'getDaftarPekerjaanPresenter' com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter) call: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.6.<init>(com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter):void type: CONSTRUCTOR)
                             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueBidangPekerjaan(o.PilihTujuanTransaksiORActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter, state: GENERATED_AND_UNLOADED
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
                            	... 23 more
                            */
                        /*
                            this = this;
                            r0 = r5
                            r1 = r5
                            java.util.List<android.view.View> r1 = r1.etFields
                            r2 = r5
                            android.widget.EditText r2 = r2.etBidangPekerjaan
                            int r1 = r1.indexOf(r2)
                            r0.b(r1)
                            r0 = r5
                            java.util.List<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput> r0 = r0.g
                            r1 = r6
                            int r1 = r1.a
                            java.lang.Object r0 = r0.get(r1)
                            com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput r0 = (com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse.DataPekerjaanOutput) r0
                            java.lang.String r0 = r0.getDescription()
                            if (r0 == 0) goto L_0x0047
                            r0 = r5
                            o.getView r0 = r0.getActivity()
                            com.bca.smartbranch.activity.FormActivity r0 = (com.bca.smartbranch.activity.FormActivity) r0
                            com.bca.smartbranch.data.localdb.Account r0 = r0.n
                            r1 = r5
                            java.util.List<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput> r1 = r1.g
                            r2 = r6
                            int r2 = r2.a
                            java.lang.Object r1 = r1.get(r2)
                            com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput r1 = (com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse.DataPekerjaanOutput) r1
                            java.lang.String r1 = r1.getDescription()
                            r0.setBusinessFieldValue(r1)
                        L_0x0047:
                            r0 = r5
                            o.LogoutDialog_ViewBinding r0 = r0.tilBidangPekerjaan
                            r1 = 1
                            r0.setHintEnabled(r1)
                            r0 = r5
                            android.widget.EditText r0 = r0.etBidangPekerjaan
                            r1 = 0
                            r0.setError(r1)
                            r0 = r5
                            android.widget.EditText r0 = r0.etBidangPekerjaan
                            r1 = r5
                            java.util.List<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput> r1 = r1.g
                            r2 = r6
                            int r2 = r2.a
                            java.lang.Object r1 = r1.get(r2)
                            com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput r1 = (com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse.DataPekerjaanOutput) r1
                            java.lang.String r1 = r1.getDescription()
                            r0.setText(r1)
                            r0 = r5
                            java.util.List<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput> r0 = r0.g
                            r1 = r6
                            int r1 = r1.a
                            java.lang.Object r0 = r0.get(r1)
                            com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput r0 = (com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse.DataPekerjaanOutput) r0
                            java.lang.String r0 = r0.getNextCategory()
                            java.lang.String r1 = "-"
                            boolean r0 = r0.equalsIgnoreCase(r1)
                            if (r0 != 0) goto L_0x00cc
                            r0 = r5
                            com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter r0 = r0.f
                            r7 = r0
                            r0 = r5
                            java.util.List<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput> r0 = r0.g
                            r1 = r6
                            int r1 = r1.a
                            java.lang.Object r0 = r0.get(r1)
                            com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput r0 = (com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse.DataPekerjaanOutput) r0
                            java.lang.String r0 = r0.getNextCategory()
                            r6 = r0
                            r0 = r7
                            com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.c
                            r0.e()
                            r0 = r7
                            o.setIncomeDisplayAmount r0 = r0.apiService
                            r1 = r6
                            retrofit2.Call r0 = r0.g(r1)
                            r6 = r0
                            r0 = r7
                            r1 = r6
                            r0.b = r1
                            r0 = r6
                            com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$6 r1 = new com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$6
                            r2 = r1
                            r3 = r7
                            r2.<init>()
                            r0.enqueue(r1)
                        L_0x00cc:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueBidangPekerjaan(o.PilihTujuanTransaksiORActivity_ViewBinding):void");
                    }

                    @Stetho$Initializer$RealSocketHandlerFactory
                    public void onChooseValueDescPekerjaan(RegistrationActivity registrationActivity) {
                        b(this.etFields.indexOf(this.etDescPekerjaan));
                        b(this.etFields.indexOf(this.etBidangPekerjaan));
                        if (this.d.get(registrationActivity.d).getDescription() != null) {
                            ((FormActivity) getActivity()).n.setOccupationValue(this.d.get(registrationActivity.d).getDescription());
                        }
                        ((FormActivity) getActivity()).n.setBusinessFieldValue("");
                        this.tilDescPekerjaan.setHintEnabled(true);
                        this.etDescPekerjaan.setError(null);
                        this.etDescPekerjaan.setText(this.d.get(registrationActivity.d).getDescription());
                        this.tilBidangPekerjaan.setHintEnabled(false);
                        this.etBidangPekerjaan.setText("");
                        if (this.d.get(registrationActivity.d).getNextCategory().equalsIgnoreCase("-")) {
                            this.tilBidangPekerjaan.setVisibility(8);
                            return;
                        }
                        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
                        String nextCategory = this.d.get(registrationActivity.d).getNextCategory();
                        getDaftarPekerjaanPresenter.c.e();
                        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = getDaftarPekerjaanPresenter.apiService.g(nextCategory);
                        getDaftarPekerjaanPresenter.b = g;
                        g.enqueue(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: INVOKE  
                              (r0v38 'g' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse>>)
                              (wrap: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$5 : 0x00ff: CONSTRUCTOR  (r1v25 com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$5 A[REMOVE]) = (r0v28 'getDaftarPekerjaanPresenter' com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter) call: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.5.<init>(com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter):void type: CONSTRUCTOR)
                             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueDescPekerjaan(o.RegistrationActivity):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter, state: GENERATED_AND_UNLOADED
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
                            	... 19 more
                            */
                        /*
                        // Method dump skipped, instructions count: 264
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueDescPekerjaan(o.RegistrationActivity):void");
                    }

                    @Stetho$Initializer$RealSocketHandlerFactory
                    public void onChooseValueJenisPekerjaan(RegistrationSuccessActivity_ViewBinding registrationSuccessActivity_ViewBinding) {
                        b(this.etFields.indexOf(this.etPekerjaan));
                        b(this.etFields.indexOf(this.etDescPekerjaan));
                        b(this.etFields.indexOf(this.etBidangPekerjaan));
                        if (this.a.get(registrationSuccessActivity_ViewBinding.e).getCode() != null) {
                            ((FormActivity) getActivity()).n.setJob(this.a.get(registrationSuccessActivity_ViewBinding.e).getCode());
                        }
                        if (this.a.get(registrationSuccessActivity_ViewBinding.e).getDescription() != null) {
                            ((FormActivity) getActivity()).n.setJobValue(this.a.get(registrationSuccessActivity_ViewBinding.e).getDescription());
                        }
                        ((FormActivity) getActivity()).n.setOccupationValue("");
                        ((FormActivity) getActivity()).n.setBusinessFieldValue("");
                        this.tilPekerjaan.setHintEnabled(true);
                        this.etPekerjaan.setError(null);
                        this.etPekerjaan.setText(this.a.get(registrationSuccessActivity_ViewBinding.e).getDescription());
                        this.tilDescPekerjaan.setHintEnabled(false);
                        this.etDescPekerjaan.setText("");
                        this.tilBidangPekerjaan.setHintEnabled(false);
                        this.etBidangPekerjaan.setText("");
                        if (this.a.get(registrationSuccessActivity_ViewBinding.e).getNextCategory().equalsIgnoreCase("-")) {
                            this.tilDescPekerjaan.setVisibility(8);
                            this.tilBidangPekerjaan.setVisibility(8);
                            ((FormActivity) getActivity()).n.setOccupation(this.a.get(registrationSuccessActivity_ViewBinding.e).getOccupation());
                            ((FormActivity) getActivity()).n.setBusinessField(this.a.get(registrationSuccessActivity_ViewBinding.e).getBusinessField());
                            return;
                        }
                        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
                        String nextCategory = this.a.get(registrationSuccessActivity_ViewBinding.e).getNextCategory();
                        getDaftarPekerjaanPresenter.c.e();
                        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g = getDaftarPekerjaanPresenter.apiService.g(nextCategory);
                        getDaftarPekerjaanPresenter.b = g;
                        g.enqueue(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b2: INVOKE  
                              (r0v52 'g' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse>>)
                              (wrap: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$1 : 0x01af: CONSTRUCTOR  (r1v33 com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter$1 A[REMOVE]) = (r0v42 'getDaftarPekerjaanPresenter' com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter) call: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter.1.<init>(com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter):void type: CONSTRUCTOR)
                             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueJenisPekerjaan(o.RegistrationSuccessActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter, state: GENERATED_AND_UNLOADED
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
                            	... 19 more
                            */
                        /*
                        // Method dump skipped, instructions count: 440
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueJenisPekerjaan(o.RegistrationSuccessActivity_ViewBinding):void");
                    }

                    @Stetho$Initializer$RealSocketHandlerFactory
                    public void onChooseValuePenghasilanPerTahun(ReservasiSuccessActivity reservasiSuccessActivity) {
                        b(this.etFields.indexOf(this.etPenghasilan));
                        this.etPenghasilan.setError(null);
                        this.tilPenghasilan.setHintEnabled(true);
                        this.etPenghasilan.setText(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentName().getIndonesian());
                        ((FormActivity) getActivity()).n.setSalary(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentOrder());
                        ((FormActivity) getActivity()).n.setSalaryValue(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentName().getIndonesian());
                    }

                    @Stetho$Initializer$RealSocketHandlerFactory
                    public void onChooseValueSumberPenghasilan(ReservasiTellerSuccessActivity_ViewBinding reservasiTellerSuccessActivity_ViewBinding) {
                        b(this.etFields.indexOf(this.etSumberPenghasilan));
                        b(this.etFields.indexOf(this.etPenghasilanLain));
                        this.etSumberPenghasilan.setError(null);
                        this.tilSumberPenghasilan.setHintEnabled(true);
                        this.etSumberPenghasilan.setText(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentName().getIndonesian());
                        ((FormActivity) getActivity()).n.setIncomeSource(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentOrder());
                        ((FormActivity) getActivity()).n.setIncomeSourceValue(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentName().getIndonesian());
                        setMessage setmessage = new setMessage();
                        if (((FormActivity) getActivity()).w.size() == reservasiTellerSuccessActivity_ViewBinding.d + 1) {
                            setmessage.c(this.tilPenghasilanLain);
                            return;
                        }
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.tilPenghasilanLain;
                        setmessage.a = logoutDialog_ViewBinding.getMeasuredHeight();
                        setmessage.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e4: IPUT  
                              (wrap: o.setMessage$1 : 0x00e1: CONSTRUCTOR  (r1v37 o.setMessage$1 A[REMOVE]) = (r0v16 'setmessage' o.setMessage), (r0v23 'logoutDialog_ViewBinding' o.LogoutDialog_ViewBinding) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v16 'setmessage' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueSumberPenghasilan(o.ReservasiTellerSuccessActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6KL2Fragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                        // Method dump skipped, instructions count: 246
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6KL2Fragment.onChooseValueSumberPenghasilan(o.ReservasiTellerSuccessActivity_ViewBinding):void");
                    }

                    @OnClick({2131296446})
                    public void onClickRetry(View view) {
                        this.f.d("occupation");
                    }

                    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
                    public void onDestroyView() {
                        onDestroyView();
                        this.c.close();
                        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = this.f;
                        Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> call = getDaftarPekerjaanPresenter.b;
                        if (call != null) {
                            call.cancel();
                        }
                        getDaftarPekerjaanPresenter.c = null;
                        documentProvider.b().e(this);
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
                    public void onValidationFailed(List<ValidationError> list) {
                        EditText editText = null;
                        for (ValidationError validationError : list) {
                            View view = validationError.getView();
                            String message = validationError.getFailedRules().get(0).getMessage(getContext());
                            if (view instanceof EditText) {
                                EditText editText2 = editText;
                                if (editText == null) {
                                    editText2 = (EditText) view;
                                }
                                switch (view.getId()) {
                                    case 2131296966:
                                        this.tvErrors.get(2).setVisibility(0);
                                        this.tvErrors.get(2).setText(message);
                                        this.tilBidangPekerjaan.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    case 2131296973:
                                        this.tvErrors.get(1).setVisibility(0);
                                        this.tvErrors.get(1).setText(message);
                                        this.tilDescPekerjaan.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    case 2131297140:
                                        this.tvErrors.get(0).setVisibility(0);
                                        this.tvErrors.get(0).setText(message);
                                        this.tilPekerjaan.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    case 2131297145:
                                        this.tvErrors.get(5).setVisibility(0);
                                        this.tvErrors.get(5).setText(message);
                                        this.tilPenghasilan.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    case 2131297146:
                                        this.tvErrors.get(4).setVisibility(0);
                                        this.tvErrors.get(4).setText(message);
                                        this.tilPenghasilanLain.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    case 2131297202:
                                        this.tvErrors.get(3).setVisibility(0);
                                        this.tvErrors.get(3).setText(message);
                                        this.tilSumberPenghasilan.setBackgroundResource(2131230870);
                                        editText = editText2;
                                        continue;
                                    default:
                                        editText = editText2;
                                        continue;
                                }
                            } else {
                                b(this.llMain, message);
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
                    public void onValidationSucceeded() {
                        char c;
                        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
                        String job = ((FormActivity) getActivity()).n.getJob();
                        job.hashCode();
                        int hashCode = job.hashCode();
                        if (hashCode == 1567) {
                            if (job.equals(ReservasiOnline.LAYANAN_GIRO)) {
                                c = '\t';
                            }
                            c = 65535;
                        } else if (hashCode == 1574) {
                            if (job.equals(ReservasiOnline.INTERNET_MOBILE_BANKING)) {
                                c = '\n';
                            }
                            c = 65535;
                        } else if (hashCode != 1575) {
                            switch (hashCode) {
                                case 49:
                                    if (job.equals("1")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 50:
                                    if (job.equals("2")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 51:
                                    if (job.equals("3")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                                    if (job.equals("4")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 53:
                                    if (job.equals("5")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 54:
                                    if (job.equals("6")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 55:
                                    if (job.equals("7")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 56:
                                    if (job.equals("8")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 57:
                                    if (job.equals("9")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                        } else {
                            if (job.equals("18")) {
                                c = 11;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                c(2131296811, new Page6LLFragment(), "Page6LLFragment");
                                return;
                            case 1:
                                c(2131296811, new Page6PLFragment(), "Page6PLFragment");
                                return;
                            case 2:
                                c(2131296811, new Page6MLFragment(), "Page6MLFragment");
                                return;
                            case 3:
                                c(2131296811, new Page6MLFragment(), "Page6MLFragment");
                                return;
                            case 4:
                                c(2131296811, new Page6MLFragment(), "Page6MLFragment");
                                return;
                            case 5:
                                c(2131296811, new Page6MLFragment(), "Page6MLFragment");
                                return;
                            case 6:
                                c(2131296811, new Page6MLFragment(), "Page6MLFragment");
                                return;
                            case 7:
                                c(2131296811, new Page6NLFragment(), "Page6NLFragment");
                                return;
                            case '\b':
                                c(2131296811, new Page6NLFragment(), "Page6NLFragment");
                                return;
                            case '\t':
                                c(2131296811, new Page6NLFragment(), "Page6NLFragment");
                                return;
                            case '\n':
                                c(2131296811, new Page6OLFragment(), "Page6OLFragment");
                                return;
                            case 11:
                                c(2131296811, new Page6OLFragment(), "Page6OLFragment");
                                return;
                            default:
                                return;
                        }
                    }

                    @Override // androidx.fragment.app.Fragment
                    public void onViewCreated(View view, Bundle bundle) {
                        onViewCreated(view, bundle);
                        this.j = (ViewAnimator) view.findViewById(2131299751);
                        setHasOptionsMenu(true);
                        documentProvider.b().c(this);
                        this.c = Realm.getDefaultInstance();
                        ((setPadding) getActivity()).i();
                        ((setPadding) getActivity()).i().d(true);
                        ((setPadding) getActivity()).i().d("");
                        GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter = new GetDaftarPekerjaanPresenter();
                        this.f = getDaftarPekerjaanPresenter;
                        getDaftarPekerjaanPresenter.c = this;
                        Validator validator = new Validator(this);
                        this.i = validator;
                        validator.setValidationListener(this);
                        if (!((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                            this.etPekerjaan.setEnabled(true);
                            this.tilPekerjaan.setBackgroundResource(2131230847);
                            this.tilPekerjaan.setHintTextAppearance(2131886846);
                            this.tilPekerjaan.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
                        }
                        ((FormActivity) getActivity()).n.setCurrentPage("Page6KL2Fragment");
                        this.etPekerjaan.setText(((FormActivity) getActivity()).n.getJobValue());
                        this.etDescPekerjaan.setText(((FormActivity) getActivity()).n.getOccupationValue());
                        this.etBidangPekerjaan.setText(((FormActivity) getActivity()).n.getBusinessFieldValue());
                        this.etSumberPenghasilan.setText(((FormActivity) getActivity()).n.getIncomeSourceValue());
                        if ("Lainnya".equals(this.etSumberPenghasilan.getText().toString())) {
                            this.tilPenghasilanLain.setVisibility(0);
                            this.etPenghasilanLain.setText(((FormActivity) getActivity()).n.getIncomeSourceOthers());
                        }
                        this.etPenghasilan.setText(((FormActivity) getActivity()).n.getSalaryValue());
                        this.etPenghasilanLain.addTextChangedListener(this);
                        if (!this.etPenghasilan.getText().toString().isEmpty()) {
                            this.tilPenghasilan.setHintEnabled(true);
                        }
                        if (!this.etDescPekerjaan.getText().toString().isEmpty()) {
                            this.tilDescPekerjaan.setHintEnabled(true);
                        }
                        if (!this.etBidangPekerjaan.getText().toString().isEmpty()) {
                            this.tilBidangPekerjaan.setHintEnabled(true);
                        }
                        if (!this.etPekerjaan.getText().toString().isEmpty()) {
                            this.tilPekerjaan.setHintEnabled(true);
                        }
                        if (!this.etSumberPenghasilan.getText().toString().isEmpty()) {
                            this.tilSumberPenghasilan.setHintEnabled(true);
                        }
                        if (!this.etPenghasilanLain.getText().toString().isEmpty()) {
                            this.tilPenghasilanLain.setHintEnabled(true);
                        }
                        this.f.d("occupation");
                    }

                    @OnClick({2131296966})
                    public void showBidangPekerjaanDialog(View view) {
                        BidangPekerjaanDialog bidangPekerjaanDialog = new BidangPekerjaanDialog();
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etBidangPekerjaan.getText().toString());
                        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.g));
                        bidangPekerjaanDialog.setArguments(bundle);
                        bidangPekerjaanDialog.show(getFragmentManager(), "BidangPekerjaanDialog");
                    }

                    @OnClick({2131296973})
                    public void showDescPekerjaanDialog(View view) {
                        DeskripsiPekerjaanDialog deskripsiPekerjaanDialog = new DeskripsiPekerjaanDialog();
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etDescPekerjaan.getText().toString());
                        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.d));
                        deskripsiPekerjaanDialog.setArguments(bundle);
                        deskripsiPekerjaanDialog.show(getFragmentManager(), "DeskripsiPekerjaanDialog");
                    }

                    @OnClick({2131297140})
                    public void showPekerjaanDialog(View view) {
                        JenisPekerjaanDialog jenisPekerjaanDialog = new JenisPekerjaanDialog();
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPekerjaan.getText().toString());
                        bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(this.a));
                        jenisPekerjaanDialog.setArguments(bundle);
                        jenisPekerjaanDialog.show(getFragmentManager(), "JenisPekerjaanDialog");
                    }

                    @OnClick({2131297145})
                    public void showPenghasilanPerTahunDialog(View view) {
                        PenghasilanPerTahunDialog penghasilanPerTahunDialog = new PenghasilanPerTahunDialog(((FormActivity) getActivity()).x);
                        Bundle bundle = new Bundle();
                        bundle.putString("title", getString(2131822027));
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPenghasilan.getText().toString());
                        penghasilanPerTahunDialog.setArguments(bundle);
                        penghasilanPerTahunDialog.show(getFragmentManager(), "PenghasilanPerTahunDialog");
                    }

                    @OnClick({2131297202})
                    public void showSumberPenghasilanDialog(View view) {
                        SumberPenghasilanDialog sumberPenghasilanDialog = new SumberPenghasilanDialog(((FormActivity) getActivity()).w);
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberPenghasilan.getText().toString());
                        sumberPenghasilanDialog.setArguments(bundle);
                        sumberPenghasilanDialog.show(getFragmentManager(), "SumberPenghasilanDialog");
                    }
                }
