package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.EditTransaksiBerkalaActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.HapusTransaksiBerkalaDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TransaksiBerkalaBerhasilDihapusDialog;
import com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter;
import o.InfoBankingtActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TransactionCSActivity_ViewBinding;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditTransaksiBerkalaActivity.class */
public class EditTransaksiBerkalaActivity extends BaseActivityPostLogin implements DeleteTxnBerkalaPresenter.read {
    @BindView(2131297065)
    LogoutDialog etNamaPemilik;
    @BindView(2131297119)
    LogoutDialog etNominal;
    private Bundle f;
    @BindView(2131297969)
    LinearLayout lnMain;
    private DeleteTxnBerkalaPresenter n;
    private String p;
    @BindString(2131822092)
    String retry;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822208)
    String toolbarTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* renamed from: y */
    public void s() {
        DeleteTxnBerkalaPresenter deleteTxnBerkalaPresenter = this.n;
        InfoBankingtActivity_ViewBinding infoBankingtActivity_ViewBinding = new InfoBankingtActivity_ViewBinding(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai", this.p);
        deleteTxnBerkalaPresenter.c.u();
        Call<OpenAccountSuccessActivity<Object>> e = deleteTxnBerkalaPresenter.apiService.e(infoBankingtActivity_ViewBinding);
        deleteTxnBerkalaPresenter.a = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: INVOKE  
              (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter$2 : 0x0047: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter$2 A[REMOVE]) = (r0v1 'deleteTxnBerkalaPresenter' com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter) call: com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.2.<init>(com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.EditTransaksiBerkalaActivity.y():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/EditTransaksiBerkalaActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            r0 = r8
            com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter r0 = r0.n
            r9 = r0
            o.InfoBankingtActivity_ViewBinding r0 = new o.InfoBankingtActivity_ViewBinding
            r1 = r0
            r2 = r8
            com.bca.smartbranch.data.localdb.User r2 = r2.m
            java.lang.String r2 = r2.getEmail()
            r3 = r8
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getSessionId()
            r4 = r8
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getImei()
            java.lang.String r5 = "Setoran Tunai"
            r6 = r8
            java.lang.String r6 = r6.p
            r1.<init>(r2, r3, r4, r5, r6)
            r10 = r0
            r0 = r9
            com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter$read r0 = r0.c
            r0.u()
            r0 = r9
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r10
            retrofit2.Call r0 = r0.e(r1)
            r10 = r0
            r0 = r9
            r1 = r10
            r0.a = r1
            r0 = r10
            com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter$2 r1 = new com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter$2
            r2 = r1
            r3 = r9
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.EditTransaksiBerkalaActivity.s():void");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void b(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitle);
        setResult(-1);
        DeleteTxnBerkalaPresenter deleteTxnBerkalaPresenter = new DeleteTxnBerkalaPresenter();
        this.n = deleteTxnBerkalaPresenter;
        deleteTxnBerkalaPresenter.c = this;
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        this.etNamaPemilik.setText(extras.getString("nama", ""));
        LogoutDialog logoutDialog = this.etNominal;
        StringBuilder sb = new StringBuilder("Rp. ");
        sb.append(getPromotion.i(this.f.getString("amount", "")));
        sb.append(",-");
        logoutDialog.setText(sb.toString());
        this.p = this.f.getString("token", "");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void d(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.lnMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.CC5UbahMastercardActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditTransaksiBerkalaActivity.this.s();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void e(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @OnClick({2131296389})
    public void hapus() {
        new HapusTransaksiBerkalaDialog().show(l(), "HapusTransaksiBerkalaDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onDeleteTxnBerkala(TransactionCSActivity_ViewBinding transactionCSActivity_ViewBinding) {
        s();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DeleteTxnBerkalaPresenter deleteTxnBerkalaPresenter = this.n;
        Call<OpenAccountSuccessActivity<Object>> call = deleteTxnBerkalaPresenter.a;
        if (call != null) {
            call.cancel();
        }
        deleteTxnBerkalaPresenter.c = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "EditTransaksiBerkalaActivity";
        this.j = "EditTransaksiBerkalaActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492949;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void t() {
        x();
        TransaksiBerkalaBerhasilDihapusDialog transaksiBerkalaBerhasilDihapusDialog = new TransaksiBerkalaBerhasilDihapusDialog();
        transaksiBerkalaBerhasilDihapusDialog.setArguments(this.f);
        transaksiBerkalaBerhasilDihapusDialog.show(l(), "TransaksiBerkalaBerhasilDihapusDialog");
    }

    @Override // com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter.read
    public final void u() {
        z();
    }
}
