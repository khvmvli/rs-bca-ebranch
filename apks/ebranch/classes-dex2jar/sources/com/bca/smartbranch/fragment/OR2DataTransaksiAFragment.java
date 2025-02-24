package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.InfoFullAmountORActivity;
import com.bca.smartbranch.activity.InfoKursORActivity;
import com.bca.smartbranch.activity.InfoValueTodayORActivity;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.PilihJenisMataUangActivity;
import com.bca.smartbranch.activity.PilihNegaraORActivity;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.JenisKodeBankDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.GetCategoriesORPresenter;
import com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter;
import com.bca.smartbranch.presenter.VTandFAPresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.PilihBankPenerbitActivity_ViewBinding;
import o.PilihKantorCabangTarikanActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseNegara;
import o.onClickMinus;
import o.setPadding;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR2DataTransaksiAFragment.class */
public class OR2DataTransaksiAFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, RadioGroup.OnCheckedChangeListener, VTandFAPresenter.IconCompatParcelizer, KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, GetCategoriesORPresenter.write {
    private String a;
    private String d;
    @BindViews({2131296998, 2131297089, 2131297000, 2131297119})
    List<View> etForms;
    @BindView(2131296998)
    @NotEmpty(messageResId = 2131820814, sequence = 1, trim = true)
    @Order(1)
    EditText etJenisKodeBank;
    @BindView(2131297000)
    @NotEmpty(messageResId = 2131820815, sequence = 3, trim = true)
    @Order(3)
    EditText etJenisMataUang;
    @BindView(2131297089)
    @NotEmpty(messageResId = 2131820882, sequence = 2, trim = true)
    @Order(2)
    EditText etNegaraTujuan;
    @BindView(2131297119)
    @NotEmpty(messageResId = 2131820906, sequence = 4, trim = true)
    @Order(4)
    LogoutDialog etNominal;
    private int f;
    private GetCategoriesORPresenter g;
    private Validator h;
    private KategoriTujuanTransaksiORPresenter i;
    @BindView(2131297570)
    LinearLayout llCurrency;
    @BindView(2131297638)
    LinearLayout llFaVt;
    @BindView(2131297646)
    LinearLayout llFullAmount;
    @BindView(2131297690)
    LinearLayout llInfoKurs;
    @BindView(2131297830)
    LinearLayout llNominal;
    @BindView(2131297929)
    LinearLayout llValueToday;
    private VTandFAPresenter n;
    @BindView(2131298140)
    RadioButton rbFullAmountTidak;
    @BindView(2131298141)
    RadioButton rbFullAmountYa;
    @BindView(2131298191)
    RadioButton rbValueTodayTidak;
    @BindView(2131298192)
    RadioButton rbValueTodayYa;
    @BindView(2131298215)
    RadioGroup rgFullAmount;
    @BindView(2131298234)
    RadioGroup rgValueToday;
    @BindView(2131298420)
    ScrollView svMain;
    @BindViews({2131298546, 2131298635, 2131298548, 2131298665})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298546)
    LogoutDialog_ViewBinding tilJenisKodeBank;
    @BindView(2131298548)
    LogoutDialog_ViewBinding tilJenisMataUang;
    @BindView(2131298635)
    LogoutDialog_ViewBinding tilNegaraTujuan;
    @BindView(2131298665)
    LogoutDialog_ViewBinding tilNominal;
    @BindView(2131299137)
    TextView tvErrorNominal;
    @BindViews({2131299022, 2131299110, 2131299024, 2131299137})
    List<TextView> tvErrors;
    @BindView(2131299284)
    TextView tvInfoFullAmount;
    @BindView(2131299292)
    TextView tvInfoValueToday;
    @BindView(2131299308)
    TextView tvJenisMataUang;

    /* renamed from: o */
    private List<List<String>> f40o = new ArrayList();
    private List<PilihBankPenerbitActivity_ViewBinding.RemoteActionCompatParcelizer> j = new ArrayList();

    private void a() {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.llNominal.setBackgroundResource(2131230847);
    }

    private void b(String str, String str2) {
        if (this.j.size() > 0) {
            for (PilihBankPenerbitActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.j) {
                String str3 = remoteActionCompatParcelizer.e;
                String str4 = remoteActionCompatParcelizer.c;
                if (str.equalsIgnoreCase(str3) || str3.equalsIgnoreCase("A")) {
                    if (str2.equalsIgnoreCase(str4) || str4.equalsIgnoreCase("A")) {
                        ((OutwardRemittanceFormActivity) getActivity()).n.setProdukRekomendasi(remoteActionCompatParcelizer.a);
                    }
                }
            }
        }
    }

    private void c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Email", this.e.getEmail());
            jSONObject.put("SessionId", this.e.getSessionId());
            jSONObject.put("IMEI", this.e.getImei());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String obj = new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString();
        VTandFAPresenter vTandFAPresenter = this.n;
        vTandFAPresenter.e.b();
        Call<OpenAccountSuccessActivity<PilihBankPenerbitActivity_ViewBinding>> j = vTandFAPresenter.apiService.j(str, str2, obj);
        vTandFAPresenter.b = j;
        j.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008d: INVOKE  
              (r0v10 'j' retrofit2.Call<o.OpenAccountSuccessActivity<o.PilihBankPenerbitActivity_ViewBinding>>)
              (wrap: com.bca.smartbranch.presenter.VTandFAPresenter$3 : 0x008a: CONSTRUCTOR  (r1v4 com.bca.smartbranch.presenter.VTandFAPresenter$3 A[REMOVE]) = (r0v5 'vTandFAPresenter' com.bca.smartbranch.presenter.VTandFAPresenter) call: com.bca.smartbranch.presenter.VTandFAPresenter.3.<init>(com.bca.smartbranch.presenter.VTandFAPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment.c(java.lang.String, java.lang.String):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR2DataTransaksiAFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.VTandFAPresenter, state: GENERATED_AND_UNLOADED
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
            r10 = r0
            r0 = r10
            java.lang.String r1 = "Email"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.e     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getEmail()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            r0 = r10
            java.lang.String r1 = "SessionId"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.e     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getSessionId()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            r0 = r10
            java.lang.String r1 = "IMEI"
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.e     // Catch: JSONException -> 0x0035
            java.lang.String r2 = r2.getImei()     // Catch: JSONException -> 0x0035
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: JSONException -> 0x0035
            goto L_0x003c
        L_0x0035:
            r11 = move-exception
            r0 = r11
            r0.printStackTrace()
        L_0x003c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = new java.lang.String
            r3 = r2
            r4 = r10
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
            r11 = r0
            r0 = r7
            com.bca.smartbranch.presenter.VTandFAPresenter r0 = r0.n
            r10 = r0
            r0 = r10
            com.bca.smartbranch.presenter.VTandFAPresenter$IconCompatParcelizer r0 = r0.e
            r0.b()
            r0 = r10
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            r2 = r9
            r3 = r11
            retrofit2.Call r0 = r0.j(r1, r2, r3)
            r8 = r0
            r0 = r10
            r1 = r8
            r0.b = r1
            r0 = r8
            com.bca.smartbranch.presenter.VTandFAPresenter$3 r1 = new com.bca.smartbranch.presenter.VTandFAPresenter$3
            r2 = r1
            r3 = r10
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment.c(java.lang.String, java.lang.String):void");
    }

    private void c(List<List<String>> list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i).get(0);
                String str2 = list.get(i).get(1);
                if (str.equalsIgnoreCase("A")) {
                    if (!str2.equalsIgnoreCase("A")) {
                        e("N", str2);
                        e("Y", str2);
                    } else {
                        e("N", "N");
                        e("N", "Y");
                        e("Y", "N");
                        e("Y", "Y");
                    }
                } else if (!str2.equalsIgnoreCase("A")) {
                    e(str, str2);
                } else {
                    e(str, "N");
                    e(str, "Y");
                }
            }
        }
    }

    private void d() {
        this.f40o.clear();
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("");
        this.rbFullAmountTidak.setEnabled(true);
        this.rbFullAmountTidak.setAlpha(1.0f);
        this.rbFullAmountYa.setEnabled(true);
        this.rbFullAmountYa.setAlpha(1.0f);
        this.rbValueTodayTidak.setEnabled(true);
        this.rbValueTodayTidak.setAlpha(1.0f);
        this.rbValueTodayYa.setEnabled(true);
        this.rbValueTodayYa.setAlpha(1.0f);
        this.rbFullAmountTidak.setChecked(true);
        this.rbValueTodayTidak.setChecked(true);
    }

    private void e() {
        if (((OutwardRemittanceFormActivity) getActivity()).r.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Email", this.e.getEmail());
                jSONObject.put("SessionId", this.e.getSessionId());
                jSONObject.put("IMEI", this.e.getImei());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.i.d(new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString());
        } else if (((OutwardRemittanceFormActivity) getActivity()).w.isEmpty()) {
            this.g.c(getPromotion.e(this.e), "C015");
        } else {
            b(((OutwardRemittanceFormActivity) getActivity()).n.getFlagFullAmountTransaksi(), ((OutwardRemittanceFormActivity) getActivity()).n.getFlagValueTodayTransaksi());
            List asList = Arrays.asList(((OutwardRemittanceFormActivity) getActivity()).n.getProdukRekomendasi().split(","));
            if (asList.size() != 1 || !((String) asList.get(0)).equalsIgnoreCase("O")) {
                c(2131296811, new OR2PilihProductFragment(), "OR2PilihProductFragment");
                return;
            }
            ((OutwardRemittanceFormActivity) getActivity()).c("O");
            ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("O");
            c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
        }
    }

    private void e(View view) {
        this.tvErrors.get(this.etForms.indexOf(view)).setVisibility(8);
        this.tilForms.get(this.etForms.indexOf(view)).setBackgroundResource(2131230847);
    }

    private void e(String str, String str2) {
        this.f40o.add(new ArrayList());
        List<List<String>> list = this.f40o;
        list.get(list.size() - 1).add(str);
        List<List<String>> list2 = this.f40o;
        list2.get(list2.size() - 1).add(str2);
    }

    private void f(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f40o.size(); i++) {
            if (this.f40o.get(i).get(0).equalsIgnoreCase(str)) {
                arrayList.add(this.f40o.get(i).get(1));
            }
        }
        if (!arrayList.contains("N")) {
            this.rbValueTodayTidak.setEnabled(false);
            this.rbValueTodayTidak.setAlpha(0.5f);
            this.rbValueTodayYa.setChecked(true);
        } else {
            this.rbValueTodayTidak.setEnabled(true);
            this.rbValueTodayTidak.setAlpha(1.0f);
        }
        if (!arrayList.contains("Y")) {
            this.rbValueTodayYa.setEnabled(false);
            this.rbValueTodayYa.setAlpha(0.5f);
            this.rbValueTodayTidak.setChecked(true);
            return;
        }
        this.rbValueTodayYa.setEnabled(true);
        this.rbValueTodayYa.setAlpha(1.0f);
    }

    private void j(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f40o.size(); i++) {
            if (this.f40o.get(i).get(1).equalsIgnoreCase(str)) {
                arrayList.add(this.f40o.get(i).get(0));
            }
        }
        if (!arrayList.contains("N")) {
            this.rbFullAmountTidak.setEnabled(false);
            this.rbFullAmountTidak.setAlpha(0.5f);
            this.rbFullAmountYa.setChecked(true);
        } else {
            this.rbFullAmountTidak.setEnabled(true);
            this.rbFullAmountTidak.setAlpha(1.0f);
        }
        if (!arrayList.contains("Y")) {
            this.rbFullAmountYa.setEnabled(false);
            this.rbFullAmountYa.setAlpha(0.5f);
            this.rbFullAmountTidak.setChecked(true);
            return;
        }
        this.rbFullAmountYa.setEnabled(true);
        this.rbFullAmountYa.setAlpha(1.0f);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etNominal.getEditableText()) {
            this.etNominal.removeTextChangedListener(this);
            String replaceAll = this.etNominal.getText().toString().replaceAll("[^0-9.,]", "");
            String str = replaceAll;
            if (!this.etNominal.getText().toString().contains(",")) {
                str = replaceAll;
                if (this.etNominal.length() > 17) {
                    str = this.etNominal.getText().toString().substring(0, 17);
                }
            }
            String str2 = str;
            if (str.equals("0")) {
                str2 = "";
            }
            if (this.tvErrors.get(this.etForms.indexOf(this.etNominal)).getVisibility() == 0) {
                if (this.tvErrors.get(this.etForms.indexOf(this.etNominal)).getText().toString().equals(getString(2131820906))) {
                    if (!this.etNominal.getText().toString().isEmpty()) {
                        this.tvErrors.get(this.etForms.indexOf(this.etNominal)).setVisibility(8);
                        this.llNominal.setBackgroundResource(2131230847);
                    }
                } else if (!this.etNominal.getText().toString().isEmpty()) {
                    if (BigDecimal.valueOf(Double.parseDouble(this.etNominal.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() >= BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                        this.tvErrors.get(this.etForms.indexOf(this.etNominal)).setVisibility(8);
                        this.llNominal.setBackgroundResource(2131230847);
                    }
                }
            }
            this.etNominal.length();
            this.etNominal.setText(getPromotion.e(str2, 12, 2));
            this.etNominal.setSelection(this.etNominal.length());
            this.etNominal.addTextChangedListener(this);
            ((OutwardRemittanceFormActivity) getActivity()).n.setNominalTransaksi(getPromotion.j(this.etNominal.getText().toString()));
        }
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer
    public final void b() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void b(String str) {
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

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493193;
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void c(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse) {
        ((OutwardRemittanceFormActivity) getActivity()).r = kategoriTujuanTransaksiORResponse.getListData();
        this.g.c(getPromotion.e(this.e), "C015");
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void d(CategoriesORResponse categoriesORResponse) {
        h();
        ((OutwardRemittanceFormActivity) getActivity()).w = categoriesORResponse.getCategories();
        b(((OutwardRemittanceFormActivity) getActivity()).n.getFlagFullAmountTransaksi(), ((OutwardRemittanceFormActivity) getActivity()).n.getFlagValueTodayTransaksi());
        List asList = Arrays.asList(((OutwardRemittanceFormActivity) getActivity()).n.getProdukRekomendasi().split(","));
        if (asList.size() != 1 || !((String) asList.get(0)).equalsIgnoreCase("O")) {
            c(2131296811, new OR2PilihProductFragment(), "OR2PilihProductFragment");
            return;
        }
        ((OutwardRemittanceFormActivity) getActivity()).c("O");
        ((OutwardRemittanceFormActivity) getActivity()).n.setTypeOfProduct("O");
        c(2131296811, new OR3DataTransaksiBFragment(), "OR3DataTransaksiBFragment");
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer
    public final void d(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((OutwardRemittanceFormActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer
    public final void d(PilihBankPenerbitActivity_ViewBinding pilihBankPenerbitActivity_ViewBinding) {
        h();
        this.j = pilihBankPenerbitActivity_ViewBinding.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (PilihBankPenerbitActivity_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.j) {
            arrayList.add(Arrays.asList(remoteActionCompatParcelizer.e, remoteActionCompatParcelizer.c));
            arrayList2.add(remoteActionCompatParcelizer.e);
            arrayList3.add(remoteActionCompatParcelizer.c);
        }
        if (arrayList.size() > 0) {
            c(arrayList);
            if (!arrayList2.contains("A") && !arrayList2.contains("N")) {
                this.rbFullAmountTidak.setEnabled(false);
                this.rbFullAmountTidak.setAlpha(0.5f);
            }
            if (!arrayList2.contains("A") && !arrayList2.contains("Y")) {
                this.rbFullAmountYa.setEnabled(false);
                this.rbFullAmountYa.setAlpha(0.5f);
            }
            if (!arrayList3.contains("A") && !arrayList3.contains("N")) {
                this.rbValueTodayTidak.setEnabled(false);
                this.rbValueTodayTidak.setAlpha(0.5f);
            }
            if (!arrayList3.contains("A") && !arrayList3.contains("Y")) {
                this.rbValueTodayYa.setEnabled(false);
                this.rbValueTodayYa.setAlpha(0.5f);
            }
            String flagFullAmountTransaksi = ((OutwardRemittanceFormActivity) getActivity()).n.getFlagFullAmountTransaksi();
            String flagValueTodayTransaksi = ((OutwardRemittanceFormActivity) getActivity()).n.getFlagValueTodayTransaksi();
            boolean z = false;
            for (int i = 0; i < this.f40o.size(); i++) {
                z = z;
                if (flagFullAmountTransaksi.equalsIgnoreCase(this.f40o.get(i).get(0))) {
                    z = z;
                    if (flagValueTodayTransaksi.equalsIgnoreCase(this.f40o.get(i).get(1))) {
                        z = true;
                    }
                }
            }
            if (z) {
                flagFullAmountTransaksi.hashCode();
                if (flagFullAmountTransaksi.equals("N")) {
                    this.rbFullAmountTidak.setChecked(true);
                    this.tvInfoFullAmount.setVisibility(4);
                } else if (flagFullAmountTransaksi.equals("Y")) {
                    this.rbFullAmountYa.setChecked(true);
                    this.tvInfoFullAmount.setVisibility(0);
                }
                flagValueTodayTransaksi.hashCode();
                if (flagValueTodayTransaksi.equals("N")) {
                    this.rbValueTodayTidak.setChecked(true);
                    this.tvInfoValueToday.setVisibility(4);
                } else if (flagValueTodayTransaksi.equals("Y")) {
                    this.rbValueTodayYa.setChecked(true);
                    this.tvInfoValueToday.setVisibility(0);
                }
            } else {
                if (arrayList3.contains("A")) {
                    String str = (String) arrayList2.get(arrayList3.indexOf("A"));
                    if (str.equalsIgnoreCase("N") || str.equalsIgnoreCase("A")) {
                        this.rbValueTodayTidak.setChecked(true);
                        this.rbFullAmountTidak.setChecked(true);
                    } else if (str.equalsIgnoreCase("Y")) {
                        this.rbValueTodayYa.setChecked(true);
                        this.rbFullAmountYa.setChecked(true);
                    }
                } else if (arrayList2.contains("A")) {
                    String str2 = (String) arrayList2.get(arrayList2.indexOf("A"));
                    if (str2.equalsIgnoreCase("N") || str2.equalsIgnoreCase("A")) {
                        this.rbFullAmountTidak.setChecked(true);
                        this.rbValueTodayTidak.setChecked(true);
                    } else if (str2.equalsIgnoreCase("Y")) {
                        this.rbFullAmountYa.setChecked(true);
                        this.rbValueTodayYa.setChecked(true);
                    }
                } else {
                    if (((String) arrayList2.get(0)).equalsIgnoreCase("N")) {
                        this.rbFullAmountTidak.setChecked(true);
                    } else {
                        this.rbFullAmountYa.setChecked(true);
                    }
                    if (((String) arrayList3.get(0)).equalsIgnoreCase("N")) {
                        this.rbValueTodayTidak.setChecked(true);
                    }
                    this.rbValueTodayYa.setChecked(true);
                }
                if (this.rgFullAmount.getCheckedRadioButtonId() == 2131298141) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("Y");
                } else if (this.rgFullAmount.getCheckedRadioButtonId() == 2131298140) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("N");
                }
                if (this.rgValueToday.getCheckedRadioButtonId() == 2131298192) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("Y");
                } else if (this.rgValueToday.getCheckedRadioButtonId() == 2131298191) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("N");
                }
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.VTandFAPresenter.IconCompatParcelizer
    public final void e(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((OutwardRemittanceFormActivity) getActivity()).llMain, str, 0).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((OutwardRemittanceFormActivity) getActivity()).n.setJenisKodeBankTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setJenisMataUangTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNominalTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setProdukRekomendasi("");
        e(2131296811, new OR1DataPengirimFragment(), "OR1DataPengirimFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void g(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void g_() {
        g();
    }

    @OnFocusChange({2131297119})
    public void inputChange(View view, boolean z) {
        if (z) {
            if (view.getId() == 2131297119) {
                this.tilNominal.setHintEnabled(true);
            }
        } else if (view.getId() == 2131297119 && this.etNominal.getText().toString().isEmpty()) {
            this.tilNominal.setHintEnabled(false);
        }
    }

    @OnClick({2131296396})
    public void lanjut(View view) {
        getPromotion.d(getContext());
        a();
        this.h.validate();
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void o_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i) {
            case 2131298140:
                this.tvInfoFullAmount.setVisibility(4);
                if (!this.f40o.isEmpty()) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("N");
                    f("N");
                    return;
                }
                return;
            case 2131298141:
                this.tvInfoFullAmount.setVisibility(0);
                if (!this.f40o.isEmpty()) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagFullAmountTransaksi("Y");
                    f("Y");
                    return;
                }
                return;
            case 2131298191:
                this.tvInfoValueToday.setVisibility(4);
                if (!this.f40o.isEmpty()) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("N");
                    j("N");
                    return;
                }
                return;
            case 2131298192:
                this.tvInfoValueToday.setVisibility(0);
                if (!this.f40o.isEmpty()) {
                    ((OutwardRemittanceFormActivity) getActivity()).n.setFlagValueTodayTransaksi("Y");
                    j("Y");
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisKodeBank(onClickMinus onclickminus) {
        this.etJenisKodeBank.setError(null);
        this.tilJenisKodeBank.setHintEnabled(true);
        this.etJenisKodeBank.setText(onclickminus.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setJenisKodeBankTransaksi(onclickminus.e);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisMataUang(PilihKantorCabangTarikanActivity_ViewBinding pilihKantorCabangTarikanActivity_ViewBinding) {
        e(this.etJenisMataUang);
        e((View) this.etNominal);
        this.etJenisMataUang.setError(null);
        this.tilJenisMataUang.setHintEnabled(true);
        this.llCurrency.setVisibility(0);
        this.tvJenisMataUang.setText(pilihKantorCabangTarikanActivity_ViewBinding.c.substring(0, 3));
        this.a = pilihKantorCabangTarikanActivity_ViewBinding.c.substring(0, 3);
        this.etJenisMataUang.setText(pilihKantorCabangTarikanActivity_ViewBinding.c);
        d();
        a();
        this.etNominal.clearFocus();
        this.llNominal.setVisibility(0);
        this.llInfoKurs.setVisibility(0);
        ((OutwardRemittanceFormActivity) getActivity()).n.setJenisMataUangTransaksi(pilihKantorCabangTarikanActivity_ViewBinding.c);
        if (pilihKantorCabangTarikanActivity_ViewBinding.e != null) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setLimitMinNominalTransaksi(pilihKantorCabangTarikanActivity_ViewBinding.e);
        }
        if (pilihKantorCabangTarikanActivity_ViewBinding.b != null) {
            ((OutwardRemittanceFormActivity) getActivity()).n.setLimitMaxNominalTransaksi(pilihKantorCabangTarikanActivity_ViewBinding.b);
        }
        c(this.d, this.a);
        this.llFaVt.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraTujuan(onChooseNegara onchoosenegara) {
        e(this.etNegaraTujuan);
        e(this.etJenisMataUang);
        e((View) this.etNominal);
        this.llFaVt.setVisibility(8);
        this.etNegaraTujuan.setError(null);
        this.tilNegaraTujuan.setHintEnabled(true);
        this.etNegaraTujuan.setText(onchoosenegara.b);
        a();
        this.d = onchoosenegara.d;
        this.etJenisMataUang.setText("");
        this.tilJenisMataUang.setHintEnabled(false);
        this.tilJenisMataUang.setVisibility(0);
        this.etNominal.removeTextChangedListener(this);
        this.etNominal.setText("");
        this.etNominal.addTextChangedListener(this);
        this.tilNominal.setHintEnabled(false);
        this.llNominal.setVisibility(8);
        this.llCurrency.setVisibility(8);
        this.llInfoKurs.setVisibility(8);
        d();
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanTransaksi(onchoosenegara.b);
        ((OutwardRemittanceFormActivity) getActivity()).n.setISONegaraTujuanTransaksi(onchoosenegara.d);
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagIBAN(onchoosenegara.e);
        ((OutwardRemittanceFormActivity) getActivity()).n.setJenisMataUangTransaksi("");
        ((OutwardRemittanceFormActivity) getActivity()).n.setNominalTransaksi("");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
        VTandFAPresenter vTandFAPresenter = this.n;
        Call<OpenAccountSuccessActivity<PilihBankPenerbitActivity_ViewBinding>> call = vTandFAPresenter.b;
        if (call != null) {
            call.cancel();
        }
        vTandFAPresenter.b = null;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = this.i;
        Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> call2 = kategoriTujuanTransaksiORPresenter.c;
        if (call2 != null) {
            call2.cancel();
        }
        kategoriTujuanTransaksiORPresenter.c = null;
        GetCategoriesORPresenter getCategoriesORPresenter = this.g;
        Call<OpenAccountSuccessActivity<CategoriesORResponse>> call3 = getCategoriesORPresenter.d;
        if (call3 != null) {
            call3.cancel();
        }
        getCategoriesORPresenter.d = null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0) {
            this.f = i + 1;
        } else {
            this.f = i;
        }
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
                    case 2131296998:
                        this.tvErrors.get(0).setVisibility(0);
                        this.tvErrors.get(0).setText(message);
                        this.tilJenisKodeBank.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297000:
                        this.tvErrors.get(2).setVisibility(0);
                        this.tvErrors.get(2).setText(message);
                        this.tilJenisMataUang.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297089:
                        this.tvErrors.get(1).setVisibility(0);
                        this.tvErrors.get(1).setText(message);
                        this.tilNegaraTujuan.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297119:
                        this.tvErrors.get(3).setVisibility(0);
                        this.tvErrors.get(3).setText(message);
                        this.llNominal.setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    default:
                        editText = editText2;
                        continue;
                }
            } else {
                b(this.svMain, message);
            }
        }
        if (!((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().isEmpty() && !this.etNominal.getText().toString().isEmpty()) {
            if (BigDecimal.valueOf(Double.parseDouble(this.etNominal.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                this.tvErrorNominal.setVisibility(0);
                TextView textView = this.tvErrorNominal;
                StringBuilder sb = new StringBuilder("Nominal minimal ");
                sb.append(getPromotion.i(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().replace(".", ",")));
                sb.append(" ");
                sb.append(this.tvJenisMataUang.getText().toString());
                textView.setText(sb.toString());
                this.llNominal.setBackgroundResource(2131230870);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        ((OutwardRemittanceFormActivity) getActivity()).t();
        if (!((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().isEmpty()) {
            if (BigDecimal.valueOf(Double.parseDouble(this.etNominal.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                this.tvErrorNominal.setVisibility(0);
                TextView textView = this.tvErrorNominal;
                StringBuilder sb = new StringBuilder("Nominal minimal ");
                sb.append(getPromotion.i(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().replace(".", ",")));
                sb.append(" ");
                sb.append(this.tvJenisMataUang.getText().toString());
                textView.setText(sb.toString());
                this.llNominal.setBackgroundResource(2131230870);
                return;
            }
        }
        e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.h = validator;
        validator.setValidationListener(this);
        VTandFAPresenter vTandFAPresenter = new VTandFAPresenter();
        this.n = vTandFAPresenter;
        vTandFAPresenter.e = this;
        KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter = new KategoriTujuanTransaksiORPresenter();
        this.i = kategoriTujuanTransaksiORPresenter;
        kategoriTujuanTransaksiORPresenter.e = this;
        GetCategoriesORPresenter getCategoriesORPresenter = new GetCategoriesORPresenter();
        this.g = getCategoriesORPresenter;
        getCategoriesORPresenter.a = this;
        ((OutwardRemittanceFormActivity) getActivity()).c("");
        this.etJenisKodeBank.setText(((OutwardRemittanceFormActivity) getActivity()).n.getJenisKodeBankTransaksi());
        this.etNegaraTujuan.setText(((OutwardRemittanceFormActivity) getActivity()).n.getNegaraTujuanTransaksi());
        this.etJenisMataUang.setText(((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi());
        this.etNominal.setText(((OutwardRemittanceFormActivity) getActivity()).n.getNominalTransaksi());
        if (((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi() != null && !((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi().isEmpty()) {
            this.d = ((OutwardRemittanceFormActivity) getActivity()).n.getISONegaraTujuanTransaksi();
        }
        if (((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi() != null && !((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().isEmpty()) {
            this.a = ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3);
        }
        for (int i = 0; i < this.etForms.size(); i++) {
            this.tilForms.get(i).setHintEnabled(!((EditText) this.etForms.get(i)).getText().toString().isEmpty());
        }
        if (!this.etJenisMataUang.getText().toString().isEmpty()) {
            this.llCurrency.setVisibility(0);
            this.tvJenisMataUang.setText(this.etJenisMataUang.getText().toString().substring(0, 3));
        }
        if (!this.etNegaraTujuan.getText().toString().isEmpty()) {
            this.tilJenisMataUang.setVisibility(0);
        }
        if (!this.etJenisMataUang.getText().toString().isEmpty()) {
            this.llNominal.setVisibility(0);
            this.llFaVt.setVisibility(0);
            c(this.d, this.a);
        } else {
            this.rbFullAmountTidak.setChecked(true);
            this.tvInfoFullAmount.setVisibility(4);
            this.rbValueTodayTidak.setChecked(true);
            this.tvInfoValueToday.setVisibility(4);
        }
        if (Settings.Secure.getString(getContext().getContentResolver(), "default_input_method").toLowerCase().contains("samsung")) {
            this.etNominal.setInputType(3);
        }
        this.etNominal.addTextChangedListener(this);
        this.rgFullAmount.setOnCheckedChangeListener(this);
        this.rgValueToday.setOnCheckedChangeListener(this);
    }

    @OnClick({2131296998})
    public void pilihJenisKodeBank(View view) {
        new JenisKodeBankDialog().show(getFragmentManager(), "JenisKodeBankDialog");
    }

    @OnClick({2131297000})
    public void pilihJenisMataUang(View view) {
        Intent intent = new Intent(getContext(), PilihJenisMataUangActivity.class);
        intent.putExtra("countries", this.d);
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @OnClick({2131297089})
    public void pilihNegaraTujuan(View view) {
        Intent intent = new Intent(getContext(), PilihNegaraORActivity.class);
        intent.putExtra("title", "Pilih Negara");
        intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
        intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
        startActivity(intent);
    }

    @OnClick({2131299285, 2131297389})
    public void showInfoFullAmountOR(View view) {
        startActivity(new Intent(getContext(), InfoFullAmountORActivity.class));
    }

    @OnClick({2131299290})
    public void showInfoKursOR(View view) {
        startActivity(new Intent(getContext(), InfoKursORActivity.class));
    }

    @OnClick({2131299293, 2131297392})
    public void showInfoValueTodayOR(View view) {
        startActivity(new Intent(getContext(), InfoValueTodayORActivity.class));
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void t_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void u_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.GetCategoriesORPresenter.write
    public final void y_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((OutwardRemittanceFormActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter.IconCompatParcelizer
    public final void z_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).g();
    }
}
