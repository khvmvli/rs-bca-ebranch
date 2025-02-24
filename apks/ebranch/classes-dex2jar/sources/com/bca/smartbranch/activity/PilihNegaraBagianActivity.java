package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.adapter.ListNegaraBagianAdapter;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.CountryStatePresenter;
import java.util.ArrayList;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.PilihNegaraActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.detailLCS;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraBagianActivity.class */
public class PilihNegaraBagianActivity extends BaseActivityPostLogin implements TextWatcher, CountryStatePresenter.RemoteActionCompatParcelizer {
    @BindView(2131296980)
    EditText etFilter;
    List<detailLCS.read> f = new ArrayList();
    @BindView(2131297813)
    LinearLayout llNegaraTidakDitemukan;
    private ListNegaraBagianAdapter n;
    private boolean p;
    private CountryStatePresenter q;
    private String r;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    private boolean s;
    private boolean t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298890)
    TextView tvData;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    private void s() {
        CountryStatePresenter countryStatePresenter = this.q;
        String str = this.r;
        String e = getPromotion.e(this.m);
        countryStatePresenter.b.t();
        Call<OpenAccountSuccessActivity<detailLCS>> b = countryStatePresenter.apiService.b(str, e);
        countryStatePresenter.d = b;
        b.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: INVOKE  
              (r0v11 'b' retrofit2.Call<o.OpenAccountSuccessActivity<o.detailLCS>>)
              (wrap: com.bca.smartbranch.presenter.CountryStatePresenter$2 : 0x0032: CONSTRUCTOR  (r1v2 com.bca.smartbranch.presenter.CountryStatePresenter$2 A[REMOVE]) = (r0v1 'countryStatePresenter' com.bca.smartbranch.presenter.CountryStatePresenter) call: com.bca.smartbranch.presenter.CountryStatePresenter.2.<init>(com.bca.smartbranch.presenter.CountryStatePresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.PilihNegaraBagianActivity.s():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraBagianActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.CountryStatePresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r5
            com.bca.smartbranch.presenter.CountryStatePresenter r0 = r0.q
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.r
            r7 = r0
            r0 = r5
            com.bca.smartbranch.data.localdb.User r0 = r0.m
            java.lang.String r0 = o.getPromotion.e(r0)
            r8 = r0
            r0 = r6
            com.bca.smartbranch.presenter.CountryStatePresenter$RemoteActionCompatParcelizer r0 = r0.b
            r0.t()
            r0 = r6
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r7
            r2 = r8
            retrofit2.Call r0 = r0.b(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r8
            r0.d = r1
            r0 = r8
            com.bca.smartbranch.presenter.CountryStatePresenter$2 r1 = new com.bca.smartbranch.presenter.CountryStatePresenter$2
            r2 = r1
            r3 = r6
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.PilihNegaraBagianActivity.s():void");
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void a(detailLCS detaillcs) {
        this.f = detaillcs.a;
        this.n = new ListNegaraBagianAdapter(this, detaillcs.a);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
        this.va.setDisplayedChild(2);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (detailLCS.read read : this.f) {
            if (read.b.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(read);
            }
        }
        ListNegaraBagianAdapter listNegaraBagianAdapter = this.n;
        listNegaraBagianAdapter.b = arrayList;
        listNegaraBagianAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llNegaraTidakDitemukan.setVisibility(0);
        } else {
            this.llNegaraTidakDitemukan.setVisibility(8);
        }
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void c(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        CountryStatePresenter countryStatePresenter = new CountryStatePresenter();
        this.q = countryStatePresenter;
        countryStatePresenter.b = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Pilih Negara Bagian");
        this.tvData.setText("Negara Bagian");
        this.etFilter.addTextChangedListener(this);
        if (extras != null) {
            if (extras.getString("country").equalsIgnoreCase("Australia")) {
                this.r = "AU";
            } else {
                this.r = "US";
            }
            this.t = extras.getBoolean("is_from_reservation", false);
            this.p = extras.getBoolean("is_save_draft_and_hit_service", false);
            this.s = extras.getBoolean("is_from_edit", false);
        }
        s();
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(PilihNegaraActivity pilihNegaraActivity) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("Y") && !this.p) {
            getPromotion.d(this);
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.t) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        CountryStatePresenter countryStatePresenter = this.q;
        Call<OpenAccountSuccessActivity<detailLCS>> call = countryStatePresenter.d;
        if (call != null) {
            call.cancel();
        }
        countryStatePresenter.d = null;
        onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.t) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            } else if (this.s) {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            } else if (this.p) {
                SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                simpanDraftDialog.b = "transaction_teller";
                simpanDraftDialog.show(l(), "SimpanDraftDialog");
                return true;
            } else {
                new SimpanDraftAndHitServiceDialog().show(l(), "SimpanDraftAndHitServiceDialog");
                return true;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PilihNegaraBagianActivity";
        this.j = "PilihNegaraBagianActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492983;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        s();
    }

    @Override // com.bca.smartbranch.presenter.CountryStatePresenter.RemoteActionCompatParcelizer
    public final void t() {
        this.va.setDisplayedChild(0);
    }
}
