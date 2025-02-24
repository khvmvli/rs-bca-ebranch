package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
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
import com.bca.smartbranch.adapter.ListNegaraORAdapter;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.CountriesORPresenter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormUbahActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.onChooseNegara;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraORActivity.class */
public class PilihNegaraORActivity extends BaseActivityPostLogin implements TextWatcher, CountriesORPresenter.IconCompatParcelizer {
    @BindView(2131296980)
    EditText etFilter;
    List<OutwardRemittanceFormUbahActivity.write> f = new ArrayList();
    @BindView(2131297813)
    LinearLayout llNegaraTidakDitemukan;
    private ListNegaraORAdapter n;
    private boolean p;
    private CountriesORPresenter q;
    private boolean r;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    private boolean s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    private void t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", this.m.getEmail());
            jSONObject.put("SessionId", this.m.getSessionId());
            jSONObject.put("IMEI", this.m.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String obj = new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
        CountriesORPresenter countriesORPresenter = this.q;
        countriesORPresenter.d.s();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> b = countriesORPresenter.apiService.b(obj);
        countriesORPresenter.e = b;
        b.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0087: INVOKE  
              (r0v10 'b' retrofit2.Call<o.OpenAccountSuccessActivity<o.OutwardRemittanceFormUbahActivity>>)
              (wrap: com.bca.smartbranch.presenter.CountriesORPresenter$5 : 0x0084: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.CountriesORPresenter$5 A[REMOVE]) = (r0v5 'countriesORPresenter' com.bca.smartbranch.presenter.CountriesORPresenter) call: com.bca.smartbranch.presenter.CountriesORPresenter.5.<init>(com.bca.smartbranch.presenter.CountriesORPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.PilihNegaraORActivity.t():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihNegaraORActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.CountriesORPresenter, state: GENERATED_AND_UNLOADED
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
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "Email"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getEmail()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            r0 = r8
            java.lang.String r1 = "SessionId"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getSessionId()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            r0 = r8
            java.lang.String r1 = "IMEI"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getImei()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            goto L_0x003a
        L_0x0035:
            r9 = move-exception
            r0 = r9
            r0.printStackTrace()
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r8
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r4.getBytes(r5)
            r5 = 2
            byte[] r4 = android.util.Base64.encode(r4, r5)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r4, r5)
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r0.reverse()
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r7
            com.bca.smartbranch.presenter.CountriesORPresenter r0 = r0.q
            r9 = r0
            r0 = r9
            com.bca.smartbranch.presenter.CountriesORPresenter$IconCompatParcelizer r0 = r0.d
            r0.s()
            r0 = r9
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            retrofit2.Call r0 = r0.b(r1)
            r8 = r0
            r0 = r9
            r1 = r8
            r0.e = r1
            r0 = r8
            com.bca.smartbranch.presenter.CountriesORPresenter$5 r1 = new com.bca.smartbranch.presenter.CountriesORPresenter$5
            r2 = r1
            r3 = r9
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.PilihNegaraORActivity.t():void");
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void a(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (OutwardRemittanceFormUbahActivity.write write : this.f) {
            if (write.a.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(write);
            }
        }
        ListNegaraORAdapter listNegaraORAdapter = this.n;
        listNegaraORAdapter.b = arrayList;
        listNegaraORAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llNegaraTidakDitemukan.setVisibility(0);
        } else {
            this.llNegaraTidakDitemukan.setVisibility(8);
        }
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void b(String str) {
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

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
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
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        Bundle extras = getIntent().getExtras();
        this.txtToolbarTitle.setText(extras.getString("title", "Pilih Negara"));
        this.r = extras.getBoolean("is_from_reservation", false);
        this.p = extras.getBoolean("is_from_edit", false);
        this.s = extras.getBoolean("is_save_draft_and_hit_service", false);
        this.etFilter.addTextChangedListener(this);
        CountriesORPresenter countriesORPresenter = new CountriesORPresenter();
        this.q = countriesORPresenter;
        countriesORPresenter.d = this;
        t();
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void d(OutwardRemittanceFormUbahActivity outwardRemittanceFormUbahActivity) {
        this.f = outwardRemittanceFormUbahActivity.a;
        this.n = new ListNegaraORAdapter(this, outwardRemittanceFormUbahActivity.a);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.n);
        this.va.setDisplayedChild(2);
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(onChooseNegara onchoosenegara) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("Y") && !this.s) {
            getPromotion.d(this);
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.r) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CountriesORPresenter countriesORPresenter = this.q;
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> call = countriesORPresenter.e;
        if (call != null) {
            call.cancel();
        }
        countriesORPresenter.e = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.r) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            } else if (this.p) {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            } else if (this.s) {
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
        setCardSlogan.e().b = "PilihNegaraORActivity";
        this.j = "PilihNegaraORActivity";
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
        t();
    }

    @Override // com.bca.smartbranch.presenter.CountriesORPresenter.IconCompatParcelizer
    public final void s() {
        this.va.setDisplayedChild(0);
    }
}
