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
import com.bca.smartbranch.adapter.ListJenisMataUangAdapter;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.CurrenciesORPresenter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceFormUbahActivity_ViewBinding;
import o.PilihKantorCabangTarikanActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.getPromotion;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihJenisMataUangActivity.class */
public class PilihJenisMataUangActivity extends BaseActivityPostLogin implements TextWatcher, CurrenciesORPresenter.IconCompatParcelizer {
    @BindView(2131296980)
    EditText etFilter;
    private ListJenisMataUangAdapter f;
    @BindView(2131297605)
    LinearLayout llMataUangTidakDitemukan;
    private String n;
    private List<OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer> p = new ArrayList();
    private boolean q;
    private boolean r;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvListItem;
    private CurrenciesORPresenter s;
    private boolean t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299749)
    ViewAnimator va;

    private void s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", this.m.getEmail());
            jSONObject.put("SessionId", this.m.getSessionId());
            jSONObject.put("IMEI", this.m.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String obj = new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
        CurrenciesORPresenter currenciesORPresenter = this.s;
        String str = this.n;
        currenciesORPresenter.b.t();
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> g = currenciesORPresenter.apiService.g(str, obj);
        currenciesORPresenter.a = g;
        g.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: INVOKE  
              (r0v12 'g' retrofit2.Call<o.OpenAccountSuccessActivity<o.OutwardRemittanceFormUbahActivity_ViewBinding>>)
              (wrap: com.bca.smartbranch.presenter.CurrenciesORPresenter$5 : 0x008a: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.CurrenciesORPresenter$5 A[REMOVE]) = (r0v5 'currenciesORPresenter' com.bca.smartbranch.presenter.CurrenciesORPresenter) call: com.bca.smartbranch.presenter.CurrenciesORPresenter.5.<init>(com.bca.smartbranch.presenter.CurrenciesORPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.PilihJenisMataUangActivity.s():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihJenisMataUangActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.CurrenciesORPresenter, state: GENERATED_AND_UNLOADED
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
            r9 = r0
            r0 = r7
            com.bca.smartbranch.presenter.CurrenciesORPresenter r0 = r0.s
            r8 = r0
            r0 = r7
            java.lang.String r0 = r0.n
            r10 = r0
            r0 = r8
            com.bca.smartbranch.presenter.CurrenciesORPresenter$IconCompatParcelizer r0 = r0.b
            r0.t()
            r0 = r8
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r10
            r2 = r9
            retrofit2.Call r0 = r0.g(r1, r2)
            r9 = r0
            r0 = r8
            r1 = r9
            r0.a = r1
            r0 = r9
            com.bca.smartbranch.presenter.CurrenciesORPresenter$5 r1 = new com.bca.smartbranch.presenter.CurrenciesORPresenter$5
            r2 = r1
            r3 = r8
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.PilihJenisMataUangActivity.s():void");
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
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

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.p) {
            if (remoteActionCompatParcelizer.c.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase()) || remoteActionCompatParcelizer.a.toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(remoteActionCompatParcelizer);
            }
        }
        ListJenisMataUangAdapter listJenisMataUangAdapter = this.f;
        listJenisMataUangAdapter.e = arrayList;
        listJenisMataUangAdapter.a.b();
        if (arrayList.size() <= 0) {
            this.llMataUangTidakDitemukan.setVisibility(0);
        } else {
            this.llMataUangTidakDitemukan.setVisibility(8);
        }
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
    public final void b(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText("Pilih Jenis Mata Uang");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.n = extras.getString("countries", "");
            this.r = extras.getBoolean("is_from_reservation", false);
            this.q = extras.getBoolean("is_save_draft_and_hit_service", false);
            this.t = extras.getBoolean("is_from_edit", false);
        }
        CurrenciesORPresenter currenciesORPresenter = new CurrenciesORPresenter();
        this.s = currenciesORPresenter;
        currenciesORPresenter.b = this;
        this.etFilter.addTextChangedListener(this);
        s();
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
    public final void d(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
    public final void e(String str) {
        this.tvErrorMessage.setText(str);
        this.va.setDisplayedChild(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
    public final void e(OutwardRemittanceFormUbahActivity_ViewBinding outwardRemittanceFormUbahActivity_ViewBinding) {
        char c;
        List<OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer> list = outwardRemittanceFormUbahActivity_ViewBinding.b;
        this.p = list;
        Collections.sort(list, new Comparator() { // from class: o.showSubPengaturan
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) obj).c.compareToIgnoreCase(((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) obj2).c);
            }
        });
        ArrayList arrayList = new ArrayList();
        OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = null;
        OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = null;
        OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = null;
        OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = null;
        for (OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer6 : list) {
            String str = remoteActionCompatParcelizer6.c;
            str.hashCode();
            switch (str.hashCode()) {
                case 65168:
                    if (str.equals("AUD")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 66894:
                    if (str.equals("CNY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 69026:
                    if (str.equals("EUR")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 82032:
                    if (str.equals("SGD")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 84326:
                    if (str.equals("USD")) {
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
                remoteActionCompatParcelizer4 = remoteActionCompatParcelizer6;
            } else if (c == 1) {
                remoteActionCompatParcelizer3 = remoteActionCompatParcelizer6;
            } else if (c == 2) {
                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer6;
            } else if (c == 3) {
                remoteActionCompatParcelizer5 = remoteActionCompatParcelizer6;
            } else if (c == 4) {
                remoteActionCompatParcelizer = remoteActionCompatParcelizer6;
            }
        }
        if (remoteActionCompatParcelizer != null) {
            arrayList.add(remoteActionCompatParcelizer);
        }
        if (remoteActionCompatParcelizer2 != null) {
            arrayList.add(remoteActionCompatParcelizer2);
        }
        if (remoteActionCompatParcelizer5 != null) {
            arrayList.add(remoteActionCompatParcelizer5);
        }
        if (remoteActionCompatParcelizer3 != null) {
            arrayList.add(remoteActionCompatParcelizer3);
        }
        if (remoteActionCompatParcelizer4 != null) {
            arrayList.add(remoteActionCompatParcelizer4);
        }
        list.removeAll(arrayList);
        list.addAll(0, arrayList);
        this.f = new ListJenisMataUangAdapter(this, this.p);
        this.rvListItem.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvListItem.setAdapter(this.f);
        this.va.setDisplayedChild(2);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisMataUang(PilihKantorCabangTarikanActivity_ViewBinding pilihKantorCabangTarikanActivity_ViewBinding) {
        getPromotion.d(this);
        finish();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("Y") && !this.q) {
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
        CurrenciesORPresenter currenciesORPresenter = this.s;
        Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> call = currenciesORPresenter.a;
        if (call != null) {
            call.cancel();
        }
        currenciesORPresenter.a = null;
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
            if (this.r) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            } else if (this.t) {
                YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                yakinKeluarDialog.d = "transaction_teller";
                yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                return true;
            } else if (this.q) {
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
        setCardSlogan.e().b = "PilihJenisMataUangActivity";
        this.j = "PilihJenisMataUangActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492979;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296446})
    public void retry(View view) {
        s();
    }

    @Override // com.bca.smartbranch.presenter.CurrenciesORPresenter.IconCompatParcelizer
    public final void t() {
        this.va.setDisplayedChild(0);
    }
}
