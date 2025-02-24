package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DetailTujuanBNDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TujuanPembelianBNDialog;
import com.bca.smartbranch.presenter.GetCurrenciesBNPresenter;
import com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.DaftarTransferBTAdapter$DaftarTransferORVH;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.detailKirimanUangNormal;
import o.documentProvider;
import o.getPromotion;
import o.onChooseKantorCabangEvent;
import o.onClickTypeSetoran;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1TujuanPembelian.class */
public class BN1TujuanPembelian extends BaseFragment implements Validator.ValidationListener, GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private List<DaftarTransferBTAdapter$DaftarTransferORVH> a;
    @BindView(2131296396)
    Button btnLanjut;
    private ConfirmSubMastercardAdapter$ViewHolder d;
    @BindView(2131296974)
    @NotEmpty(messageResId = 2131820776, sequence = 1, trim = true)
    @Order(2)
    EditText etDetailTujuan;
    @BindView(2131297227)
    @NotEmpty(messageResId = 2131821024, sequence = 1, trim = true)
    @Order(1)
    EditText etTujuanPembelian;
    private Validator f;
    private List<DaftarTransferBTAdapter$DaftarTransferORVH> h;
    private GetCurrenciesBNPresenter j;
    @BindArray(2130903062)
    String[] listDetailInvestasi;
    @BindArray(2130903053)
    String[] listDetailInvestasiKode;
    @BindArray(2130903075)
    String[] listDetailKegiatanUsaha;
    @BindArray(2130903054)
    String[] listDetailKegiatanUsahaKode;
    @BindArray(2130903102)
    String[] listTujuanPembelian;
    @BindArray(2130903103)
    String[] listTujuanPembelianKode;
    @BindString(2131822092)
    String retry;
    @BindView(2131297766)
    LinearLayout svMain;
    @BindViews({2131298758, 2131298525})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindViews({2131299229, 2131299004})
    List<TextView> tvErrors;

    private List<DaftarTransferBTAdapter$DaftarTransferORVH> b() {
        if (this.etTujuanPembelian.getText().toString().equals(this.listTujuanPembelian[1])) {
            this.a = new ArrayList();
            for (int i = 0; i < this.listDetailKegiatanUsahaKode.length; i++) {
                DaftarTransferBTAdapter$DaftarTransferORVH daftarTransferBTAdapter$DaftarTransferORVH = new DaftarTransferBTAdapter$DaftarTransferORVH();
                daftarTransferBTAdapter$DaftarTransferORVH.e = this.listDetailKegiatanUsahaKode[i];
                daftarTransferBTAdapter$DaftarTransferORVH.a = this.listDetailKegiatanUsaha[i];
                this.a.add(daftarTransferBTAdapter$DaftarTransferORVH);
            }
        } else if (this.etTujuanPembelian.getText().toString().equals(this.listTujuanPembelian[2])) {
            this.a = new ArrayList();
            for (int i2 = 0; i2 < this.listDetailInvestasiKode.length; i2++) {
                DaftarTransferBTAdapter$DaftarTransferORVH daftarTransferBTAdapter$DaftarTransferORVH2 = new DaftarTransferBTAdapter$DaftarTransferORVH();
                daftarTransferBTAdapter$DaftarTransferORVH2.e = this.listDetailInvestasiKode[i2];
                daftarTransferBTAdapter$DaftarTransferORVH2.a = this.listDetailInvestasi[i2];
                this.a.add(daftarTransferBTAdapter$DaftarTransferORVH2);
            }
        }
        return this.a;
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getParentFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493159;
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(List<detailKirimanUangNormal.RemoteActionCompatParcelizer> list) {
        h();
        ((FormBankNotesActivity) getActivity()).f = list;
        d(2131296811, this, new BN2PembelianFragment(), "BN2PembelianFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getParentFragmentManager(), "AutoLogoutDialog");
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.f.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseDetailTujuan(onChooseKantorCabangEvent onchoosekantorcabangevent) {
        this.tvErrors.get(1).setVisibility(8);
        this.tilForms.get(1).setBackgroundResource(2131230847);
        this.etDetailTujuan.setText(onchoosekantorcabangevent.e.a);
        this.tilForms.get(1).setHintEnabled(true);
        this.d.n = onchoosekantorcabangevent.e;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseTujuanPembelian(onClickTypeSetoran onclicktypesetoran) {
        this.tvErrors.get(0).setVisibility(8);
        this.tilForms.get(0).setBackgroundResource(2131230847);
        this.etTujuanPembelian.setText(onclicktypesetoran.e.a);
        this.tilForms.get(0).setHintEnabled(true);
        if (onclicktypesetoran.e.e.equals("0")) {
            this.etDetailTujuan.setText("");
            this.tilForms.get(1).setHintEnabled(false);
            this.tilForms.get(1).setVisibility(0);
            return;
        }
        this.tilForms.get(1).setVisibility(8);
        this.etDetailTujuan.setText("");
        this.tilForms.get(1).setHintEnabled(false);
        this.tvErrors.get(1).setVisibility(8);
        this.tilForms.get(1).setBackgroundResource(2131230847);
        this.d.n = onclicktypesetoran.e;
    }

    @OnClick({2131297227})
    public void onClick(View view) {
        TujuanPembelianBNDialog tujuanPembelianBNDialog = new TujuanPembelianBNDialog();
        Bundle bundle = new Bundle();
        bundle.putString("value", this.etTujuanPembelian.getText().toString());
        bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.h));
        tujuanPembelianBNDialog.setArguments(bundle);
        tujuanPembelianBNDialog.show(getFragmentManager(), "TujuanPembelianBNDialog");
    }

    @OnClick({2131296974})
    public void onClickDetailTujuan(View view) {
        DetailTujuanBNDialog detailTujuanBNDialog = new DetailTujuanBNDialog();
        Bundle bundle = new Bundle();
        bundle.putString("value", this.etDetailTujuan.getText().toString());
        bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(b()));
        detailTujuanBNDialog.setArguments(bundle);
        detailTujuanBNDialog.show(getFragmentManager(), "DetailTujuanBNDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().e(this);
        GetCurrenciesBNPresenter getCurrenciesBNPresenter = this.j;
        Call<OpenAccountSuccessActivity<detailKirimanUangNormal>> call = getCurrenciesBNPresenter.a;
        if (call != null) {
            call.cancel();
        }
        getCurrenciesBNPresenter.d = null;
        onDestroyView();
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
                int id = view.getId();
                if (id == 2131296974) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilForms.get(1).setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297227) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilForms.get(0).setBackgroundResource(2131230870);
                    editText = editText2;
                }
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (((FormBankNotesActivity) getActivity()).f.isEmpty()) {
            GetCurrenciesBNPresenter getCurrenciesBNPresenter = this.j;
            String e = getPromotion.e(this.e);
            getCurrenciesBNPresenter.d.e();
            Call<OpenAccountSuccessActivity<detailKirimanUangNormal>> h = getCurrenciesBNPresenter.apiService.h(e);
            getCurrenciesBNPresenter.a = h;
            h.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE  
                  (r0v15 'h' retrofit2.Call<o.OpenAccountSuccessActivity<o.detailKirimanUangNormal>>)
                  (wrap: com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$5 : 0x003e: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$5 A[REMOVE]) = (r0v7 'getCurrenciesBNPresenter' com.bca.smartbranch.presenter.GetCurrenciesBNPresenter) call: com.bca.smartbranch.presenter.GetCurrenciesBNPresenter.5.<init>(com.bca.smartbranch.presenter.GetCurrenciesBNPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.BN1TujuanPembelian.onValidationSucceeded():void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN1TujuanPembelian.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetCurrenciesBNPresenter, state: GENERATED_AND_UNLOADED
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
                r0 = r6
                o.getView r0 = r0.getActivity()
                com.bca.smartbranch.activity.FormBankNotesActivity r0 = (com.bca.smartbranch.activity.FormBankNotesActivity) r0
                java.util.List<o.detailKirimanUangNormal$RemoteActionCompatParcelizer> r0 = r0.f
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0047
                r0 = r6
                com.bca.smartbranch.presenter.GetCurrenciesBNPresenter r0 = r0.j
                r7 = r0
                r0 = r6
                com.bca.smartbranch.data.localdb.User r0 = r0.e
                java.lang.String r0 = o.getPromotion.e(r0)
                r8 = r0
                r0 = r7
                com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.d
                r0.e()
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.h(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.a = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$5 r1 = new com.bca.smartbranch.presenter.GetCurrenciesBNPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
                return
            L_0x0047:
                r0 = r6
                r1 = 2131296811(0x7f09022b, float:1.821155E38)
                r2 = r6
                com.bca.smartbranch.fragment.BN2PembelianFragment r3 = new com.bca.smartbranch.fragment.BN2PembelianFragment
                r4 = r3
                r4.<init>()
                java.lang.String r4 = "BN2PembelianFragment"
                r0.d(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.BN1TujuanPembelian.onValidationSucceeded():void");
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            onViewCreated(view, bundle);
            documentProvider.b().c(this);
            GetCurrenciesBNPresenter getCurrenciesBNPresenter = new GetCurrenciesBNPresenter();
            this.j = getCurrenciesBNPresenter;
            getCurrenciesBNPresenter.d = this;
            Validator validator = new Validator(this);
            this.f = validator;
            validator.setValidationListener(this);
            this.d = ((FormBankNotesActivity) getActivity()).n;
            this.h = new ArrayList();
            for (int i = 0; i < this.listTujuanPembelianKode.length; i++) {
                DaftarTransferBTAdapter$DaftarTransferORVH daftarTransferBTAdapter$DaftarTransferORVH = new DaftarTransferBTAdapter$DaftarTransferORVH();
                daftarTransferBTAdapter$DaftarTransferORVH.e = this.listTujuanPembelianKode[i];
                daftarTransferBTAdapter$DaftarTransferORVH.a = this.listTujuanPembelian[i];
                this.h.add(daftarTransferBTAdapter$DaftarTransferORVH);
            }
        }
    }
