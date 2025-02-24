package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.PilihKecamatanActivity;
import com.bca.smartbranch.activity.PilihKelurahanActivity;
import com.bca.smartbranch.activity.PilihKodePosActivity;
import com.bca.smartbranch.activity.PilihKotaActivity;
import com.bca.smartbranch.activity.PilihNegaraActivity;
import com.bca.smartbranch.activity.PilihProvinsiActivity;
import com.bca.smartbranch.dialog.StatusTempatTinggalDialog;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.PilihKecamatanActivity_ViewBinding;
import o.PilihNegaraActivity_ViewBinding;
import o.PilihNegaraORActivity;
import o.ReservasiTellerSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onChooseKelurahan;
import o.onChooseKodePosHome;
import o.onChooseKotaKantor;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setPadding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6JLFragment.class */
public class Page6JLFragment extends BaseFragment implements Validator.ValidationListener, RadioGroup.OnCheckedChangeListener, TextWatcher {
    private Validator a;
    @BindView(2131296927)
    @NotEmpty(messageResId = 2131820727, sequence = 2, trim = true)
    @Order(2)
    EditText etAlamat;
    @BindViews({2131296927, 2131297167, 2131297170, 2131297014, 2131297011, 2131297033, 2131297022, 2131297198, 2131297161, 2131297080})
    List<View> etFields;
    @BindView(2131297011)
    @NotEmpty(messageResId = 2131821005, sequence = 7, trim = true)
    @Order(7)
    EditText etKecamatan;
    @BindView(2131297014)
    @NotEmpty(messageResId = 2131821029, sequence = 8, trim = true)
    @Order(8)
    EditText etKelurahan;
    @Order(9)
    @BindView(2131297022)
    @NotEmpty(messageResId = 2131820978, sequence = 9, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 10)
    EditText etKodePos;
    @BindView(2131297033)
    @NotEmpty(messageResId = 2131820761, sequence = 6, trim = true)
    @Order(6)
    EditText etKota;
    @BindView(2131297080)
    @NotEmpty(messageResId = 2131820880, sequence = 1, trim = true)
    @Order(1)
    EditText etNegara;
    @BindView(2131297161)
    @NotEmpty(messageResId = 2131820981, sequence = 5, trim = true)
    @Order(5)
    EditText etProvinsi;
    @BindView(2131297167)
    @NotEmpty(messageResId = 2131820987, sequence = 3, trim = true)
    @Order(3)
    EditText etRT;
    @BindView(2131297170)
    @NotEmpty(messageResId = 2131820988, sequence = 4, trim = true)
    @Order(4)
    EditText etRW;
    @BindView(2131297198)
    @NotEmpty(messageResId = 2131820801, sequence = 11, trim = true)
    @Order(10)
    EditText etStatusTempat;
    @BindArray(2130903093)
    String[] listStatusTempatTinggal;
    @BindView(2131297914)
    LinearLayout llAlamatTidakSama;
    @BindView(2131297688)
    LinearLayout llIndonesian;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindString(2131821318)
    String messageAlamatKTP;
    @BindString(2131821317)
    String messageAlamatKartuPelajar;
    @BindString(2131821319)
    String messageAlamatPaspor;
    @BindView(2131298131)
    RadioButton rbAlamatN;
    @BindView(2131298132)
    RadioButton rbAlamatY;
    @BindView(2131298212)
    RadioGroup rgAlamatSesuai;
    @BindView(2131298476)
    LogoutDialog_ViewBinding tilAlamat;
    @BindViews({2131298476, 2131298703, 2131298706, 2131298560, 2131298557, 2131298580, 2131298568, 2131298730, 2131298697, 2131298626})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298557)
    LogoutDialog_ViewBinding tilKecamatan;
    @BindView(2131298560)
    LogoutDialog_ViewBinding tilKelurahan;
    @BindView(2131298568)
    LogoutDialog_ViewBinding tilKodePos;
    @BindView(2131298580)
    LogoutDialog_ViewBinding tilKota;
    @BindView(2131298626)
    LogoutDialog_ViewBinding tilNegara;
    @BindView(2131298697)
    LogoutDialog_ViewBinding tilProvinsi;
    @BindView(2131298703)
    LogoutDialog_ViewBinding tilRt;
    @BindView(2131298706)
    LogoutDialog_ViewBinding tilRw;
    @BindView(2131298730)
    LogoutDialog_ViewBinding tilStatusTempat;
    @BindView(2131298831)
    TextView tvAskAlamat;
    @BindViews({2131298956, 2131299171, 2131299174, 2131299037, 2131299034, 2131299056, 2131299045, 2131299198, 2131299164, 2131299102})
    List<TextView> tvErrors;

    private void a(EditText editText) {
        if (this.tvErrors.get(this.etFields.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
            b(this.etFields.indexOf(editText));
        }
    }

    private void b() {
        for (int i = 0; i < this.etFields.size(); i++) {
            this.tvErrors.get(i).setVisibility(8);
            this.tilForms.get(i).setBackgroundResource(2131230847);
        }
    }

    private void b(int i) {
        this.tvErrors.get(i).setVisibility(8);
        this.tilForms.get(i).setBackgroundResource(2131230847);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        getPromotion.a(editable);
        if (editable == this.etAlamat.getEditableText()) {
            a(this.etAlamat);
            ((FormActivity) getActivity()).n.setResAddress(editable.toString());
        } else if (editable == this.etRT.getEditableText()) {
            a(this.etRT);
            ((FormActivity) getActivity()).n.setResRT(editable.toString());
        } else if (editable == this.etRW.getEditableText()) {
            a(this.etRW);
            ((FormActivity) getActivity()).n.setResRW(editable.toString());
        } else if (editable == this.etKelurahan.getEditableText()) {
            ((FormActivity) getActivity()).n.setResVillage(editable.toString());
        } else if (editable == this.etKecamatan.getEditableText()) {
            ((FormActivity) getActivity()).n.setResSubDistrict(editable.toString());
        } else if (editable == this.etKota.getEditableText()) {
            ((FormActivity) getActivity()).n.setResCity(editable.toString());
        } else if (editable == this.etKodePos.getEditableText()) {
            ((FormActivity) getActivity()).n.setResPostCode(editable.toString());
        } else if (editable == this.etProvinsi.getEditableText()) {
            ((FormActivity) getActivity()).n.setResProvince(editable.toString());
        } else if (editable == this.etNegara.getEditableText()) {
            ((FormActivity) getActivity()).n.setResCountry(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493135;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.Page6JLFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResCountry("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResHouseStatus("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResAddress("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResRT("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResRW("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResVillage("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResVillage("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResSubDistrict("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResCity("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResPostCode("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setFlagDifResidency("");
                ((FormActivity) Page6JLFragment.this.getActivity()).n.setResProvince("");
            }
        });
        e(2131296811, new Page6ILFragment(), "Page6ILFragment");
    }

    @OnFocusChange({2131296927, 2131297167, 2131297170})
    public void inputChange(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296927) {
                this.tilAlamat.setHintEnabled(true);
            } else if (id == 2131297167) {
                this.tilRt.setHintEnabled(true);
            } else if (id == 2131297170) {
                this.tilRw.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296927) {
                if (id2 != 2131297167) {
                    if (id2 == 2131297170 && this.etRW.getText().toString().isEmpty()) {
                        this.tilRw.setHintEnabled(false);
                    }
                } else if (this.etRT.getText().toString().isEmpty()) {
                    this.tilRt.setHintEnabled(false);
                }
            } else if (this.etAlamat.getText().toString().isEmpty()) {
                this.tilAlamat.setHintEnabled(false);
            }
        }
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        b();
        this.a.validate();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        setMessage setmessage = new setMessage();
        switch (i) {
            case 2131298131:
                setmessage.c(this.llAlamatTidakSama);
                ((FormActivity) getActivity()).n.setFlagDifResidency("Y");
                this.etNegara.setText(((FormActivity) getActivity()).n.getResCountry());
                this.etAlamat.setText(((FormActivity) getActivity()).n.getResAddress());
                this.etRT.setText(((FormActivity) getActivity()).n.getResRT());
                this.etRW.setText(((FormActivity) getActivity()).n.getResRW());
                this.etKelurahan.setText(((FormActivity) getActivity()).n.getResVillage());
                this.etKecamatan.setText(((FormActivity) getActivity()).n.getResSubDistrict());
                this.etKota.setText(((FormActivity) getActivity()).n.getResCity());
                this.etKodePos.setText(((FormActivity) getActivity()).n.getResPostCode());
                this.etProvinsi.setText(((FormActivity) getActivity()).n.getResProvince());
                return;
            case 2131298132:
                getPromotion.d(getActivity());
                LinearLayout linearLayout = this.llAlamatTidakSama;
                setmessage.a = linearLayout.getMeasuredHeight();
                setmessage.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: IPUT  
                      (wrap: o.setMessage$1 : 0x003c: CONSTRUCTOR  (r1v51 o.setMessage$1 A[REMOVE]) = (r0v0 'setmessage' o.setMessage), (r0v28 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v0 'setmessage' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6JLFragment.onCheckedChanged(android.widget.RadioGroup, int):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6JLFragment.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:266)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
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
                    	... 21 more
                    */
                /*
                // Method dump skipped, instructions count: 531
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6JLFragment.onCheckedChanged(android.widget.RadioGroup, int):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseKecamatan(onChooseKelurahan onchoosekelurahan) {
                b(this.etFields.indexOf(this.etKecamatan));
                b(this.etFields.indexOf(this.etKelurahan));
                b(this.etFields.indexOf(this.etKodePos));
                this.tilKelurahan.setVisibility(0);
                this.tilKelurahan.setHintEnabled(false);
                this.tilKodePos.setVisibility(8);
                this.etKelurahan.getText().clear();
                this.etKodePos.getText().clear();
                this.tilKecamatan.setHintEnabled(true);
                this.etKecamatan.setText(onchoosekelurahan.a);
                ((FormActivity) getActivity()).n.setResSubDistrict(onchoosekelurahan.a);
                ((FormActivity) getActivity()).n.setResVillage("");
                ((FormActivity) getActivity()).n.setResPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseKelurahan(PilihKecamatanActivity_ViewBinding pilihKecamatanActivity_ViewBinding) {
                b(this.etFields.indexOf(this.etKelurahan));
                b(this.etFields.indexOf(this.etKodePos));
                this.tilKodePos.setVisibility(0);
                this.tilKodePos.setHintEnabled(false);
                this.etKodePos.getText().clear();
                this.tilKelurahan.setHintEnabled(true);
                this.etKelurahan.setText(pilihKecamatanActivity_ViewBinding.e);
                ((FormActivity) getActivity()).n.setResVillage(pilihKecamatanActivity_ViewBinding.e);
                ((FormActivity) getActivity()).n.setResPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseKodePos(onChooseKodePosHome onchoosekodeposhome) {
                b(this.etFields.indexOf(this.etKodePos));
                this.tilKodePos.setHintEnabled(true);
                this.etKodePos.setText(onchoosekodeposhome.e);
                ((FormActivity) getActivity()).n.setResPostCode(onchoosekodeposhome.e);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseKota(onChooseKotaKantor onchoosekotakantor) {
                b(this.etFields.indexOf(this.etKota));
                b(this.etFields.indexOf(this.etKecamatan));
                b(this.etFields.indexOf(this.etKelurahan));
                b(this.etFields.indexOf(this.etKodePos));
                this.tilKecamatan.setVisibility(0);
                this.tilKecamatan.setHintEnabled(false);
                this.tilKelurahan.setVisibility(8);
                this.tilKodePos.setVisibility(8);
                this.etKecamatan.getText().clear();
                this.etKelurahan.getText().clear();
                this.etKodePos.getText().clear();
                this.tilKota.setHintEnabled(true);
                this.etKota.setText(onchoosekotakantor.a);
                ((FormActivity) getActivity()).n.setResCity(onchoosekotakantor.a);
                ((FormActivity) getActivity()).n.setResSubDistrict("");
                ((FormActivity) getActivity()).n.setResVillage("");
                ((FormActivity) getActivity()).n.setResPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseNegara(PilihNegaraActivity_ViewBinding pilihNegaraActivity_ViewBinding) {
                b(this.etFields.indexOf(this.etNegara));
                this.etNegara.setError(null);
                this.tilNegara.setHintEnabled(true);
                this.etNegara.setText(pilihNegaraActivity_ViewBinding.e);
                this.etAlamat.getText().clear();
                this.etRT.getText().clear();
                this.etRW.getText().clear();
                this.etKecamatan.getText().clear();
                this.etKelurahan.getText().clear();
                this.etKota.getText().clear();
                this.etKodePos.getText().clear();
                this.etProvinsi.getText().clear();
                this.tilAlamat.setVisibility(0);
                this.etAlamat.clearFocus();
                this.tilAlamat.setHintEnabled(false);
                this.tilRt.setHintEnabled(false);
                this.tilRw.setHintEnabled(false);
                this.tilKelurahan.setHintEnabled(false);
                this.tilKecamatan.setHintEnabled(false);
                this.tilKota.setHintEnabled(false);
                this.tilKodePos.setHintEnabled(false);
                this.tilProvinsi.setHintEnabled(false);
                this.tilKelurahan.setVisibility(8);
                this.tilKecamatan.setVisibility(8);
                this.tilKota.setVisibility(8);
                this.tilKodePos.setVisibility(8);
                b();
                ((FormActivity) getActivity()).n.setResCountry(pilihNegaraActivity_ViewBinding.e);
                ((FormActivity) getActivity()).n.setResAddress("");
                ((FormActivity) getActivity()).n.setResRT("");
                ((FormActivity) getActivity()).n.setResRW("");
                ((FormActivity) getActivity()).n.setResSubDistrict("");
                ((FormActivity) getActivity()).n.setResVillage("");
                ((FormActivity) getActivity()).n.setResCity("");
                ((FormActivity) getActivity()).n.setResPostCode("");
                if (pilihNegaraActivity_ViewBinding.e.equalsIgnoreCase("INDONESIA")) {
                    this.llIndonesian.setVisibility(0);
                } else {
                    this.llIndonesian.setVisibility(8);
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseProvinsi(PilihNegaraORActivity pilihNegaraORActivity) {
                b(this.etFields.indexOf(this.etProvinsi));
                b(this.etFields.indexOf(this.etKota));
                b(this.etFields.indexOf(this.etKecamatan));
                b(this.etFields.indexOf(this.etKelurahan));
                b(this.etFields.indexOf(this.etKodePos));
                this.tilKota.setVisibility(0);
                this.tilKota.setHintEnabled(false);
                this.tilKecamatan.setVisibility(8);
                this.tilKelurahan.setVisibility(8);
                this.tilKodePos.setVisibility(8);
                this.etKota.getText().clear();
                this.etKecamatan.getText().clear();
                this.etKelurahan.getText().clear();
                this.etKodePos.getText().clear();
                this.tilProvinsi.setHintEnabled(true);
                this.etProvinsi.setText(pilihNegaraORActivity.b);
                ((FormActivity) getActivity()).n.setResProvince(pilihNegaraORActivity.b);
                ((FormActivity) getActivity()).n.setResCity("");
                ((FormActivity) getActivity()).n.setResSubDistrict("");
                ((FormActivity) getActivity()).n.setResVillage("");
                ((FormActivity) getActivity()).n.setResPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueStatusTempatTinggal(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
                b(this.etFields.indexOf(this.etStatusTempat));
                this.etStatusTempat.setError(null);
                this.tilStatusTempat.setHintEnabled(true);
                this.etStatusTempat.setText(this.listStatusTempatTinggal[reservasiTellerSuccessActivity.d]);
                ((FormActivity) getActivity()).n.setHmHouseStatus(String.valueOf(reservasiTellerSuccessActivity.d + 1));
            }

            @OnClick({2131297011})
            public void onClickKecamatan(View view) {
                Intent intent = new Intent(getContext(), PilihKecamatanActivity.class);
                intent.putExtra("provinsi", this.etProvinsi.getText().toString());
                intent.putExtra("kota", this.etKota.getText().toString());
                startActivity(intent);
            }

            @OnClick({2131297014})
            public void onClickKelurahan(View view) {
                Intent intent = new Intent(getContext(), PilihKelurahanActivity.class);
                intent.putExtra("provinsi", this.etProvinsi.getText().toString());
                intent.putExtra("kota", this.etKota.getText().toString());
                intent.putExtra("kecamatan", this.etKecamatan.getText().toString());
                startActivity(intent);
            }

            @OnClick({2131297022})
            public void onClickKodePos(View view) {
                Intent intent = new Intent(getContext(), PilihKodePosActivity.class);
                intent.putExtra("provinsi", this.etProvinsi.getText().toString());
                intent.putExtra("kota", this.etKota.getText().toString());
                intent.putExtra("kecamatan", this.etKecamatan.getText().toString());
                intent.putExtra("kelurahan", this.etKelurahan.getText().toString());
                startActivity(intent);
            }

            @OnClick({2131297033})
            public void onClickKota(View view) {
                Intent intent = new Intent(getContext(), PilihKotaActivity.class);
                intent.putExtra("provinsi", this.etProvinsi.getText().toString());
                startActivity(intent);
            }

            @OnClick({2131297080})
            public void onClickNegara(View view) {
                startActivity(new Intent(getContext(), PilihNegaraActivity.class));
            }

            @OnClick({2131297161})
            public void onClickProvinsi(View view) {
                startActivity(new Intent(getContext(), PilihProvinsiActivity.class));
            }

            @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
            public void onDestroyView() {
                onDestroyView();
                this.c.close();
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
                            case 2131296927:
                                this.tvErrors.get(0).setVisibility(0);
                                this.tvErrors.get(0).setText(message);
                                this.tilAlamat.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297011:
                                this.tvErrors.get(4).setVisibility(0);
                                this.tvErrors.get(4).setText(message);
                                this.tilKecamatan.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297014:
                                this.tvErrors.get(3).setVisibility(0);
                                this.tvErrors.get(3).setText(message);
                                this.tilKelurahan.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297022:
                                this.tvErrors.get(6).setVisibility(0);
                                this.tvErrors.get(6).setText(message);
                                this.tilKodePos.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297033:
                                this.tvErrors.get(5).setVisibility(0);
                                this.tvErrors.get(5).setText(message);
                                this.tilKota.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297080:
                                this.tvErrors.get(9).setVisibility(0);
                                this.tvErrors.get(9).setText(message);
                                this.tilNegara.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297161:
                                this.tvErrors.get(8).setVisibility(0);
                                this.tvErrors.get(8).setText(message);
                                this.tilProvinsi.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297167:
                                this.tvErrors.get(1).setVisibility(0);
                                this.tvErrors.get(1).setText(message);
                                this.tilRt.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297170:
                                this.tvErrors.get(2).setVisibility(0);
                                this.tvErrors.get(2).setText(message);
                                this.tilRw.setBackgroundResource(2131230870);
                                editText = editText2;
                                continue;
                            case 2131297198:
                                this.tvErrors.get(7).setVisibility(0);
                                this.tvErrors.get(7).setText(message);
                                this.tilStatusTempat.setBackgroundResource(2131230870);
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

            @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
            public void onValidationSucceeded() {
                documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
                c(2131296811, new Page6KLFragment(), "Page6KLFragment");
            }

            @Override // androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                onViewCreated(view, bundle);
                setHasOptionsMenu(true);
                documentProvider.b().c(this);
                this.c = Realm.getDefaultInstance();
                ((setPadding) getActivity()).i();
                ((setPadding) getActivity()).i().d(true);
                String str = "";
                ((setPadding) getActivity()).i().d("");
                Validator validator = new Validator(this);
                this.a = validator;
                validator.setValidationListener(this);
                ((FormActivity) getActivity()).n.setCurrentPage("Page6JLFragment");
                String flagDifResidency = ((FormActivity) getActivity()).n.getFlagDifResidency();
                flagDifResidency.hashCode();
                if (flagDifResidency.equals("N")) {
                    this.rbAlamatY.setChecked(true);
                } else if (!flagDifResidency.equals("Y")) {
                    ((FormActivity) getActivity()).n.setFlagDifResidency("N");
                } else {
                    this.rbAlamatN.setChecked(true);
                    this.llAlamatTidakSama.setVisibility(0);
                }
                if (((FormActivity) getActivity()).n.getTypeID().equals("KTP")) {
                    this.tvAskAlamat.setText(this.messageAlamatKTP);
                } else if (((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
                    this.tvAskAlamat.setText(this.messageAlamatPaspor);
                } else if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                    this.tvAskAlamat.setText(this.messageAlamatKartuPelajar);
                }
                this.etNegara.setText(((FormActivity) getActivity()).n.getResCountry());
                if (!((FormActivity) getActivity()).n.getResCountry().isEmpty()) {
                    this.tilNegara.setHintEnabled(true);
                    this.tilAlamat.setVisibility(0);
                    this.tilAlamat.setHintEnabled(false);
                    if (this.etNegara.getText().toString().equalsIgnoreCase("INDONESIA")) {
                        this.llIndonesian.setVisibility(0);
                    } else {
                        this.llIndonesian.setVisibility(8);
                    }
                } else {
                    this.tilAlamat.setVisibility(8);
                    this.llIndonesian.setVisibility(8);
                }
                this.etAlamat.setText(((FormActivity) getActivity()).n.getResAddress());
                if (!((FormActivity) getActivity()).n.getResAddress().isEmpty()) {
                    this.tilAlamat.setHintEnabled(true);
                }
                this.etAlamat.setOnTouchListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01de: INVOKE  
                      (wrap: android.widget.EditText : 0x01d4: IGET  (r0v57 android.widget.EditText A[REMOVE]) = (r4v0 'this' com.bca.smartbranch.fragment.Page6JLFragment A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.fragment.Page6JLFragment.etAlamat android.widget.EditText)
                      (wrap: o.getPromotion$4 : 0x01db: CONSTRUCTOR  (r1v22 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.fragment.Page6JLFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6JLFragment.class
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
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
                // Method dump skipped, instructions count: 1062
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6JLFragment.onViewCreated(android.view.View, android.os.Bundle):void");
            }

            @OnClick({2131297198})
            public void showStatusTempatTinggalDialog(View view) {
                new StatusTempatTinggalDialog().show(getFragmentManager(), "StatusTempatTinggalDialog");
            }
        }
