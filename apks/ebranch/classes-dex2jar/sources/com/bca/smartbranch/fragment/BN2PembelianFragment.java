package com.bca.smartbranch.fragment;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetRateBNDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SuratPernyataanBNDialog;
import com.bca.smartbranch.presenter.GetAvailableBranchPresenter;
import com.bca.smartbranch.presenter.GetRatePresenter;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.ConfirmSubVisaAdapter$ViewHolder;
import o.DaftarTransferBTAdapter$DaftarTransferORVH;
import o.InfoTellerActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.PilihJabatanActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.detailKirimanUangNormal;
import o.detailKirimanUangNormal$MediaBrowserCompat$CustomActionResultReceiver;
import o.documentProvider;
import o.eventJenisIdentitas;
import o.getPromotion;
import o.onChooseJenisMataUang;
import o.onChooseLanjut;
import o.setTypeface;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN2PembelianFragment.class */
public class BN2PembelianFragment extends BaseFragment implements TextWatcher, Validator.ValidationListener, GetRatePresenter.IconCompatParcelizer, GetAvailableBranchPresenter.write {
    private BigDecimal a;
    private double d;
    @BindView(2131297007)
    @NotEmpty(messageResId = 2131820906, trim = true)
    @Order(2)
    EditText etJumlahBeli;
    private boolean f = true;
    private int g;
    private ConfirmSubMastercardAdapter$ViewHolder h;
    private GetRatePresenter i;
    @BindView(2131297396)
    ImageView ivMataUang;
    private GetAvailableBranchPresenter j;
    private List<ConfirmSubVisaAdapter$ViewHolder> k;
    private BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver l;
    @BindArray(2130903078)
    String[] listMataUang;
    @BindArray(2130903079)
    TypedArray listMataUangImage;
    @BindArray(2130903080)
    String[] listMataUangKode;
    @BindArray(2130903102)
    String[] listTujuanPembelian;
    @BindArray(2130903103)
    String[] listTujuanPembelianKode;
    @BindView(2131297754)
    LinearLayout llKurs;
    @BindView(2131297558)
    LinearLayout llPesan;
    @BindView(2131297967)
    LinearLayout lnPecahanUang;
    private Validator m;
    @BindString(2131821021)
    String messageMaxTotalPembelian;
    @BindString(2131820906)
    String messageNominalEmpty;
    private User n;

    /* renamed from: o */
    private ConfirmSubVisaAdapter$ViewHolder f31o;
    private int q;
    private List<DaftarTransferBTAdapter$DaftarTransferORVH> r;
    @BindView(2131298394)
    Spinner spMataUang;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131299137)
    TextView tvErrorNominal;
    @BindView(2131299385)
    TextView tvKurs;
    @BindView(2131299401)
    TextView tvMataUang;
    @BindView(2131299677)
    setTypeface tvTotal;

    public void a() {
        InfoTellerActivity infoTellerActivity = new InfoTellerActivity();
        infoTellerActivity.a = this.n.getEmail();
        infoTellerActivity.c = this.n.getImei();
        infoTellerActivity.e = this.n.getSessionId();
        infoTellerActivity.b = this.f31o.b;
        if (this.f31o.b.equals("USD")) {
            infoTellerActivity.d = this.f31o.a;
        } else {
            infoTellerActivity.d = "";
        }
        this.i.b(infoTellerActivity);
    }

    private void b() {
        this.k = new ArrayList();
        List<detailKirimanUangNormal.RemoteActionCompatParcelizer> list = ((FormBankNotesActivity) getActivity()).f;
        ConfirmSubVisaAdapter$ViewHolder confirmSubVisaAdapter$ViewHolder = new ConfirmSubVisaAdapter$ViewHolder();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            ArrayList<Integer> arrayList3 = new ArrayList<>();
            int i2 = 0;
            String str = "";
            String str2 = str;
            Integer num = 0;
            for (detailKirimanUangNormal$MediaBrowserCompat$CustomActionResultReceiver detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver : list.get(i).e) {
                if (detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.b.equals("C")) {
                    arrayList2.add(detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.c);
                    num = detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.e;
                    str2 = detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.a;
                } else {
                    arrayList3.add(detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.c);
                    i2 = detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.e;
                    str = detailkirimanuangnormal_mediabrowsercompat_customactionresultreceiver.a;
                }
            }
            confirmSubVisaAdapter$ViewHolder = confirmSubVisaAdapter$ViewHolder;
            if (!arrayList3.isEmpty()) {
                ConfirmSubVisaAdapter$ViewHolder confirmSubVisaAdapter$ViewHolder2 = new ConfirmSubVisaAdapter$ViewHolder();
                confirmSubVisaAdapter$ViewHolder2.b = list.get(i).a;
                confirmSubVisaAdapter$ViewHolder2.e = i(list.get(i).a);
                confirmSubVisaAdapter$ViewHolder2.f = str;
                confirmSubVisaAdapter$ViewHolder2.a = "M";
                confirmSubVisaAdapter$ViewHolder2.d = i2;
                Collections.sort(arrayList3);
                confirmSubVisaAdapter$ViewHolder2.c = arrayList3;
                arrayList.add(confirmSubVisaAdapter$ViewHolder2);
                confirmSubVisaAdapter$ViewHolder = confirmSubVisaAdapter$ViewHolder;
                if (confirmSubVisaAdapter$ViewHolder2.b.equals("USD")) {
                    confirmSubVisaAdapter$ViewHolder = confirmSubVisaAdapter$ViewHolder2;
                }
            }
            if (!arrayList2.isEmpty()) {
                ConfirmSubVisaAdapter$ViewHolder confirmSubVisaAdapter$ViewHolder3 = new ConfirmSubVisaAdapter$ViewHolder();
                confirmSubVisaAdapter$ViewHolder3.b = list.get(i).a;
                confirmSubVisaAdapter$ViewHolder3.e = i(list.get(i).a);
                confirmSubVisaAdapter$ViewHolder3.f = str2;
                confirmSubVisaAdapter$ViewHolder3.a = "C";
                confirmSubVisaAdapter$ViewHolder3.d = num;
                Collections.sort(arrayList2);
                confirmSubVisaAdapter$ViewHolder3.c = arrayList2;
                arrayList.add(confirmSubVisaAdapter$ViewHolder3);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: o.TransaksiBerkalaAdapter$TransaksiBerkalaVH_ViewBinding
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((ConfirmSubVisaAdapter$ViewHolder) obj).f.compareTo(((ConfirmSubVisaAdapter$ViewHolder) obj2).f);
            }
        });
        this.k.add(confirmSubVisaAdapter$ViewHolder);
        this.k.addAll(arrayList);
    }

    static /* synthetic */ void b(BN2PembelianFragment bN2PembelianFragment) {
        bN2PembelianFragment.k.remove(0);
        Collections.sort(bN2PembelianFragment.k, new Comparator() { // from class: o.TransaksiBerhasilAdapter$HeaderTransaksiTertundaVH_ViewBinding
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((ConfirmSubVisaAdapter$ViewHolder) obj).f.compareTo(((ConfirmSubVisaAdapter$ViewHolder) obj2).f);
            }
        });
        bN2PembelianFragment.k.add(0, bN2PembelianFragment.f31o);
        bN2PembelianFragment.l.notifyDataSetChanged();
    }

    private void e() {
        this.tvMataUang.setText(this.f31o.b);
        f();
    }

    static /* synthetic */ void e(BN2PembelianFragment bN2PembelianFragment) {
        bN2PembelianFragment.tvMataUang.setText(bN2PembelianFragment.f31o.b);
        bN2PembelianFragment.f();
    }

    private void f() {
        this.lnPecahanUang.removeAllViews();
        for (final int i = 0; i < this.f31o.c.size(); i++) {
            View inflate = getLayoutInflater().inflate(2131493300, (ViewGroup) null);
            final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297979);
            TextView textView = (TextView) inflate.findViewById(2131299615);
            StringBuilder sb = new StringBuilder("Pecahan ");
            sb.append(getPromotion.h(String.valueOf(this.f31o.c.get(i))));
            textView.setText(sb.toString());
            if (i == 0) {
                linearLayout.setSelected(true);
                this.g = i;
            }
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.BN2PembelianFragment.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    for (int i2 = 0; i2 < BN2PembelianFragment.this.lnPecahanUang.getChildCount(); i2++) {
                        ((LinearLayout) BN2PembelianFragment.this.lnPecahanUang.getChildAt(i2).findViewById(2131297979)).setSelected(false);
                    }
                    linearLayout.setSelected(true);
                    int i3 = BN2PembelianFragment.this.g;
                    int i4 = i;
                    if (i3 != i4) {
                        BN2PembelianFragment.this.g = i4;
                        if (BN2PembelianFragment.this.tvErrorNominal.getVisibility() == 0 && !BN2PembelianFragment.this.tvErrorNominal.getText().toString().equals(BN2PembelianFragment.this.getString(2131820906))) {
                            BN2PembelianFragment.this.tvErrorNominal.setVisibility(8);
                            BN2PembelianFragment.this.llPesan.setBackgroundResource(2131230832);
                        }
                        if (!BN2PembelianFragment.this.etJumlahBeli.getText().toString().isEmpty()) {
                            if (BigDecimal.valueOf(Double.parseDouble(BN2PembelianFragment.this.etJumlahBeli.getText().toString().replaceAll(",", ""))).remainder(new BigDecimal(BN2PembelianFragment.this.f31o.c.get(BN2PembelianFragment.this.g).intValue())).compareTo(BigDecimal.ZERO) != 0) {
                                BN2PembelianFragment.this.tvErrorNominal.setText(BN2PembelianFragment.this.getString(2131821959));
                                BN2PembelianFragment.this.tvErrorNominal.setVisibility(0);
                                BN2PembelianFragment.this.llPesan.setBackgroundResource(2131230871);
                            }
                        }
                    }
                }
            });
            this.lnPecahanUang.addView(inflate);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int i(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case 65168:
                if (str.equals("AUD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 66470:
                if (str.equals("CAD")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 66689:
                if (str.equals("CHF")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 66894:
                if (str.equals("CNY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 67748:
                if (str.equals("DKK")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 69026:
                if (str.equals("EUR")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 70357:
                if (str.equals("GBP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 71585:
                if (str.equals("HKD")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 73683:
                if (str.equals("JPY")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 77816:
                if (str.equals("NZD")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 81860:
                if (str.equals("SAR")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 81977:
                if (str.equals("SEK")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 82032:
                if (str.equals("SGD")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83022:
                if (str.equals("THB")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 84326:
                if (str.equals("USD")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 7:
            case '\t':
            case '\f':
            case 14:
                return 2131231046;
            case 2:
                return 2131231033;
            case 3:
                return 2131231034;
            case 4:
                return 2131231035;
            case 5:
                return 2131231036;
            case 6:
                return 2131231037;
            case '\b':
                return 2131231039;
            case '\n':
                return 2131231041;
            case 11:
                return 2131231042;
            case '\r':
                return 2131231044;
            default:
                return 0;
        }
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetRateBNDialog errorGetRateBNDialog = new ErrorGetRateBNDialog();
        errorGetRateBNDialog.setArguments(bundle);
        errorGetRateBNDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etJumlahBeli.getEditableText()) {
            if (!this.etJumlahBeli.getText().toString().isEmpty()) {
                this.a = new BigDecimal(this.d).multiply(BigDecimal.valueOf(Double.parseDouble(this.etJumlahBeli.getText().toString().replaceAll(",", "")))).setScale(2, RoundingMode.HALF_UP);
                this.etJumlahBeli.removeTextChangedListener(this);
                int length = this.etJumlahBeli.length();
                EditText editText = this.etJumlahBeli;
                editText.setText(getPromotion.h(editText.getText().toString()));
                if (!this.etJumlahBeli.getText().toString().isEmpty()) {
                    this.tvTotal.setText(getPromotion.a(this.a.toString()));
                    this.tvTotal.setTextColor(getContext().getResources().getColor(2131099813));
                } else {
                    this.tvTotal.setText("0.00");
                    this.tvTotal.setTextColor(getContext().getResources().getColor(2131099814));
                }
                int length2 = (this.q + this.etJumlahBeli.length()) - length;
                if (length2 > 0) {
                    this.etJumlahBeli.setSelection(length2);
                } else {
                    this.etJumlahBeli.setSelection(0);
                }
                this.etJumlahBeli.addTextChangedListener(this);
            } else {
                this.tvTotal.setText("0.00");
                this.tvTotal.setTextColor(getContext().getResources().getColor(2131099814));
            }
        }
        if (this.tvErrorNominal.getVisibility() != 0) {
            return;
        }
        if (this.tvErrorNominal.getText().toString().equals(this.messageMaxTotalPembelian)) {
            if (this.a.doubleValue() < 3.0E7d) {
                this.tvErrorNominal.setVisibility(8);
                this.llPesan.setBackgroundResource(2131230832);
            }
        } else if (this.tvErrorNominal.getText().toString().equals(getString(2131821959))) {
            if (!this.etJumlahBeli.getText().toString().isEmpty()) {
                if (BigDecimal.valueOf(Double.parseDouble(this.etJumlahBeli.getText().toString().replaceAll(",", ""))).remainder(new BigDecimal(this.f31o.c.get(this.g).intValue())).compareTo(BigDecimal.ZERO) == 0) {
                    this.tvErrorNominal.setVisibility(8);
                    this.llPesan.setBackgroundResource(2131230832);
                }
            }
        } else if (this.tvErrorNominal.getText().toString().equals(getString(2131820906)) && !this.etJumlahBeli.getText().toString().isEmpty()) {
            this.tvErrorNominal.setVisibility(8);
            this.llPesan.setBackgroundResource(2131230832);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.n.getImei());
        bundle.putString("email", this.n.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493160;
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetRateBNDialog errorGetRateBNDialog = new ErrorGetRateBNDialog();
        errorGetRateBNDialog.setArguments(bundle);
        errorGetRateBNDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void c(onChooseLanjut onchooselanjut) {
        h();
        this.d = Double.valueOf(onchooselanjut.e).doubleValue();
        this.etJumlahBeli.getText().clear();
        this.tvTotal.setText("0.00");
        this.tvTotal.setTextColor(getContext().getResources().getColor(2131099814));
        String str = onchooselanjut.e;
        this.llKurs.setVisibility(0);
        TextView textView = this.tvKurs;
        StringBuilder sb = new StringBuilder("1 ");
        sb.append(this.f31o.b);
        sb.append(" = ");
        sb.append(getPromotion.a(str));
        sb.append(" IDR");
        textView.setText(sb.toString());
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void e(String str) {
        h();
        this.tvErrorNominal.setVisibility(0);
        this.tvErrorNominal.setText(str);
        this.llPesan.setBackgroundResource(2131230871);
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void e(List<StockListBNResponse.StockBranch> list) {
        ((FormBankNotesActivity) getActivity()).n.j = this.f31o;
        ((FormBankNotesActivity) getActivity()).n.a = this.etJumlahBeli.getText().toString();
        ((FormBankNotesActivity) getActivity()).n.f = this.d;
        ((FormBankNotesActivity) getActivity()).n.m = this.a.doubleValue();
        ((FormBankNotesActivity) getActivity()).n.b = this.f31o.c.get(this.g).toString();
        h();
        BN3PilihCabangFragment bN3PilihCabangFragment = new BN3PilihCabangFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("branch", ListUtil.OneItemImmutableList.e(list));
        bN3PilihCabangFragment.setArguments(bundle);
        d(2131296811, this, bN3PilihCabangFragment, "BN3PilihCabangFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void f(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer
    public final void g(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        ErrorGetRateBNDialog errorGetRateBNDialog = new ErrorGetRateBNDialog();
        errorGetRateBNDialog.setArguments(bundle);
        errorGetRateBNDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void h(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.n.getImei());
        bundle.putString("email", this.n.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetRatePresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void i_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.GetAvailableBranchPresenter.write
    public final void j(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @OnClick({2131296396})
    public void lanjut() {
        getPromotion.d(getContext());
        this.tvErrorNominal.setVisibility(8);
        this.llPesan.setBackgroundResource(2131230832);
        this.m.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAgreementBN(PilihJabatanActivity_ViewBinding pilihJabatanActivity_ViewBinding) {
        if (pilihJabatanActivity_ViewBinding.e) {
            this.tvMataUang.getText();
            double doubleValue = Double.valueOf(this.etJumlahBeli.getText().toString().replaceAll(",", "")).doubleValue();
            GetAvailableBranchPresenter getAvailableBranchPresenter = this.j;
            String format = String.format("%.0f", Double.valueOf(doubleValue));
            String obj = this.f31o.c.get(this.g).toString();
            User user = this.n;
            getAvailableBranchPresenter.a.i_();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Email", user.getEmail());
                jSONObject.put("SessionId", user.getSessionId());
                jSONObject.put("IMEI", user.getImei());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Call<OpenAccountSuccessActivity<StockListBNResponse>> f = getAvailableBranchPresenter.apiService.f(format, obj, new StringBuilder(new String(Base64.encode(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2), StandardCharsets.UTF_8)).reverse().toString());
            getAvailableBranchPresenter.e = f;
            f.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00eb: INVOKE  
                  (r0v34 'f' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.StockListBNResponse>>)
                  (wrap: com.bca.smartbranch.presenter.GetAvailableBranchPresenter$3 : 0x00e8: CONSTRUCTOR  (r1v9 com.bca.smartbranch.presenter.GetAvailableBranchPresenter$3 A[REMOVE]) = (r0v15 'getAvailableBranchPresenter' com.bca.smartbranch.presenter.GetAvailableBranchPresenter) call: com.bca.smartbranch.presenter.GetAvailableBranchPresenter.3.<init>(com.bca.smartbranch.presenter.GetAvailableBranchPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.BN2PembelianFragment.onAgreementBN(o.PilihJabatanActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN2PembelianFragment.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetAvailableBranchPresenter, state: GENERATED_AND_UNLOADED
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
            // Method dump skipped, instructions count: 249
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.BN2PembelianFragment.onAgreementBN(o.PilihJabatanActivity_ViewBinding):void");
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
            GetAvailableBranchPresenter getAvailableBranchPresenter = this.j;
            Call<OpenAccountSuccessActivity<StockListBNResponse>> call2 = getAvailableBranchPresenter.e;
            if (call2 != null) {
                call2.cancel();
            }
            getAvailableBranchPresenter.a = null;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i2 == 0) {
                this.q = i + 1;
            } else {
                this.q = i;
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
                    if (view.getId() != 2131297007) {
                        editText = editText2;
                    } else {
                        this.tvErrorNominal.setVisibility(0);
                        this.tvErrorNominal.setText(message);
                        this.llPesan.setBackgroundResource(2131230871);
                        editText = editText2;
                    }
                } else {
                    KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, message, -1).g();
                }
            }
            EditText editText3 = editText;
            if (!this.etJumlahBeli.getText().toString().isEmpty()) {
                editText3 = editText;
                if (BigDecimal.valueOf(Double.parseDouble(this.etJumlahBeli.getText().toString().replaceAll(",", ""))).remainder(new BigDecimal(this.f31o.c.get(this.g).intValue())).compareTo(BigDecimal.ZERO) != 0) {
                    this.tvErrorNominal.setVisibility(0);
                    this.tvErrorNominal.setText(getString(2131821959));
                    this.llPesan.setBackgroundResource(2131230871);
                    editText3 = this.etJumlahBeli;
                }
            }
            if (editText3 != null) {
                editText3.requestFocus();
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationSucceeded() {
            this.tvMataUang.getText();
            if (BigDecimal.valueOf(Double.parseDouble(this.etJumlahBeli.getText().toString().replaceAll(",", ""))).remainder(new BigDecimal(this.f31o.c.get(this.g).intValue())).compareTo(BigDecimal.ZERO) != 0) {
                this.tvErrorNominal.setText(getString(2131821959));
                this.tvErrorNominal.setVisibility(0);
                this.llPesan.setBackgroundResource(2131230871);
                return;
            }
            new SuratPernyataanBNDialog().show(getFragmentManager(), "SuratPernyataanBNDialog");
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            onViewCreated(view, bundle);
            documentProvider.b().c(this);
            Validator validator = new Validator(this);
            this.m = validator;
            validator.setValidationListener(this);
            GetRatePresenter getRatePresenter = new GetRatePresenter();
            this.i = getRatePresenter;
            getRatePresenter.d = this;
            GetAvailableBranchPresenter getAvailableBranchPresenter = new GetAvailableBranchPresenter();
            this.j = getAvailableBranchPresenter;
            getAvailableBranchPresenter.a = this;
            this.n = ((FormBankNotesActivity) getActivity()).w();
            this.h = ((FormBankNotesActivity) getActivity()).n;
            this.r = new ArrayList();
            for (int i = 0; i < this.listTujuanPembelianKode.length; i++) {
                DaftarTransferBTAdapter$DaftarTransferORVH daftarTransferBTAdapter$DaftarTransferORVH = new DaftarTransferBTAdapter$DaftarTransferORVH();
                daftarTransferBTAdapter$DaftarTransferORVH.e = this.listTujuanPembelianKode[i];
                daftarTransferBTAdapter$DaftarTransferORVH.a = this.listTujuanPembelian[i];
                this.r.add(daftarTransferBTAdapter$DaftarTransferORVH);
            }
            b();
            this.f31o = this.k.get(0);
            e();
            a();
            BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver = new BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver(this, getContext(), this.k);
            this.l = bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver;
            this.spMataUang.setAdapter((SpinnerAdapter) bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver);
            this.spMataUang.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.bca.smartbranch.fragment.BN2PembelianFragment.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view2, int i2, long j) {
                    if (!BN2PembelianFragment.this.f31o.f.equals(((ConfirmSubVisaAdapter$ViewHolder) BN2PembelianFragment.this.k.get(i2)).f)) {
                        BN2PembelianFragment bN2PembelianFragment = BN2PembelianFragment.this;
                        bN2PembelianFragment.f31o = (ConfirmSubVisaAdapter$ViewHolder) bN2PembelianFragment.k.get(i2);
                        BN2PembelianFragment.this.a();
                    }
                    BN2PembelianFragment.e(BN2PembelianFragment.this);
                    BN2PembelianFragment.b(BN2PembelianFragment.this);
                    BN2PembelianFragment.this.spMataUang.setSelection(0, false);
                    BN2PembelianFragment.this.etJumlahBeli.setText("");
                    BN2PembelianFragment.this.etJumlahBeli.setEnabled(true);
                    BN2PembelianFragment.this.tvTotal.setText("0.00");
                    BN2PembelianFragment.this.tvTotal.setTextColor(BN2PembelianFragment.this.getContext().getResources().getColor(2131099814));
                    BN2PembelianFragment.this.llPesan.setBackgroundResource(2131230832);
                    BN2PembelianFragment.this.tvErrorNominal.setVisibility(8);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.etJumlahBeli.addTextChangedListener(this);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void retryGetRate(eventJenisIdentitas eventjenisidentitas) {
            if (eventjenisidentitas.d.booleanValue()) {
                a();
            } else {
                getActivity().onBackPressed();
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void subscribeCancelBankNotesEvent(onChooseJenisMataUang onchoosejenismatauang) {
            this.spMataUang.setSelection(0);
            this.etJumlahBeli.setText("");
            this.ivMataUang.setImageResource(0);
            this.tvTotal.setText("0.00");
            this.tvTotal.setTextColor(getContext().getResources().getColor(2131099814));
        }
    }
