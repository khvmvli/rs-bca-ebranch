package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.PilihBankPenerbitActivity;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.dialog.ExpiredDateDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.Realm;
import java.util.List;
import o.AgamaAdapter$AgamaVH_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.PilihBidangUsahaActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setMessage;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC18FormKartuKreditFragment.class */
public class CC18FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher {
    private List<CategoryResponse> a;
    private setMessage d = new setMessage();
    @BindView(2131296947)
    @NotEmpty(messageResId = 2131820741)
    @Order(1)
    EditText etBankPenerbit;
    @BindViews({2131296947, 2131297104, 2131297204})
    List<View> etFields;
    @BindView(2131297104)
    @NotEmpty(messageResId = 2131820888)
    @Order(2)
    EditText etNoKartuKredit;
    @BindView(2131297204)
    @NotEmpty(messageResId = 2131821011)
    @Order(3)
    EditText etTanggalExpired;
    private Validator g;
    @BindView(2131297535)
    LinearLayout llBankPenerbitLain;
    @BindView(2131298183)
    RadioButton rbTidak;
    @BindView(2131298194)
    RadioButton rbYa;
    @BindView(2131298218)
    RadioGroup rgKartuKredit;
    @BindView(2131298497)
    LogoutDialog_ViewBinding tilBankPenerbit;
    @BindViews({2131298497, 2131298650, 2131298736})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298650)
    LogoutDialog_ViewBinding tilNomorKartuKredit;
    @BindView(2131298736)
    LogoutDialog_ViewBinding tilTanggalExpired;
    @BindViews({2131298976, 2131299123, 2131299204})
    List<TextView> tvErrors;

    static /* synthetic */ void b(CC18FormKartuKreditFragment cC18FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC18FormKartuKreditFragment.tvErrors, cC18FormKartuKreditFragment.tilForms, cC18FormKartuKreditFragment.etFields, editText);
    }

    private void e() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void SubscribeExpiredDate(final AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        this.etTanggalExpired.setError(null);
        this.etTanggalExpired.setText(getString(2131822365, getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"), getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0")));
        this.tilTanggalExpired.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.6
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CCOtherBankCreditCard cCOtherBankCreditCard = ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0);
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0"));
                cCOtherBankCreditCard.setExpired(sb.toString());
            }
        });
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etTanggalExpired);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        getPromotion.a(editable);
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.9
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC18FormKartuKreditFragment.this.etNoKartuKredit.getEditableText()) {
                        CC18FormKartuKreditFragment cC18FormKartuKreditFragment = CC18FormKartuKreditFragment.this;
                        CC18FormKartuKreditFragment.b(cC18FormKartuKreditFragment, cC18FormKartuKreditFragment.etNoKartuKredit);
                        ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).setCardNumber(editable.toString());
                    }
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493175;
    }

    @OnClick({2131297204})
    public void clickTanggalExp(View view) {
        String str;
        String str2 = "";
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().isEmpty()) {
            str = ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(0, 2);
            str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(2, 4);
        } else {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", getString(2131822158));
        bundle.putString("tahun", str2);
        bundle.putString("bulan", str);
        ExpiredDateDialog expiredDateDialog = new ExpiredDateDialog();
        expiredDateDialog.setArguments(bundle);
        expiredDateDialog.show(getFragmentManager(), "ExpiredDateDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards() != null && !((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().isEmpty()) {
                    if (((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName() != null) {
                        ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName().deleteFromRealm();
                    }
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().deleteAllFromRealm();
                }
            }
        });
        e(2131296811, new CC17FormKartuKreditFragment(), "CC17FormKartuKreditFragment");
    }

    @OnClick({2131296396})
    public void next(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.g.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBankPenerbitEvent(final PilihBidangUsahaActivity_ViewBinding pilihBidangUsahaActivity_ViewBinding) {
        this.etBankPenerbit.setError(null);
        this.etBankPenerbit.setText(pilihBidangUsahaActivity_ViewBinding.a.getDescription());
        this.tilBankPenerbit.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.7
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName() != null) {
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName().deleteFromRealm();
                }
                Category category = (Category) realm.createObject(Category.class);
                category.setCode(pilihBidangUsahaActivity_ViewBinding.a.getCode());
                category.setDescription(pilihBidangUsahaActivity_ViewBinding.a.getDescription());
                ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).setBankName(category);
            }
        });
        getPromotion.b(this.tvErrors, this.tilForms, this.etFields, this.etBankPenerbit);
    }

    @OnFocusChange({2131297104})
    public void onChange(View view, boolean z) {
        if (z) {
            this.tilNomorKartuKredit.setHintEnabled(true);
        } else if (this.etNoKartuKredit.getText().toString().isEmpty()) {
            this.tilNomorKartuKredit.setHintEnabled(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            e();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.10
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            e();
        }
    }

    @OnClick({2131296947})
    public void onClickBankPenerbit() {
        Intent intent = new Intent(getContext(), PilihBankPenerbitActivity.class);
        intent.putExtra("list_data", ListUtil.OneItemImmutableList.e(this.a));
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards() != null && !((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().isEmpty()) {
                        if (((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName() != null) {
                            ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName().deleteFromRealm();
                        }
                        ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().deleteAllFromRealm();
                    }
                }
            });
            e(2131296811, new CC17FormKartuKreditFragment(), "CC17FormKartuKreditFragment");
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (((CC8FormKartuKreditActivity) getActivity()).p.isMember()) {
                new SimpanDraftDialog().show(getFragmentManager(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(getFragmentManager(), "YakinKeluarDialog");
            return true;
        }
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
                int id = view.getId();
                if (id == 2131296947) {
                    this.tvErrors.get(0).setVisibility(0);
                    this.tvErrors.get(0).setText(message);
                    this.tilBankPenerbit.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id == 2131297104) {
                    this.tvErrors.get(1).setVisibility(0);
                    this.tvErrors.get(1).setText(message);
                    this.tilNomorKartuKredit.setBackgroundResource(2131230870);
                    editText = editText2;
                } else if (id != 2131297204) {
                    editText = editText2;
                } else {
                    this.tvErrors.get(2).setVisibility(0);
                    this.tvErrors.get(2).setText(message);
                    this.tilTanggalExpired.setBackgroundResource(2131230870);
                    editText = editText2;
                }
            } else {
                b(((CC8FormKartuKreditActivity) getActivity()).llMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        c(2131296811, new CC19FormKartuKreditFragment(), "CC19FormKartuKreditFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        Validator validator = new Validator(this);
        this.g = validator;
        validator.setValidationListener(this);
        this.a = ((CC8FormKartuKreditActivity) getActivity()).s;
        String flagOtherCC = ((CC8FormKartuKreditActivity) getActivity()).n.getFlagOtherCC();
        flagOtherCC.hashCode();
        if (flagOtherCC.equals("N")) {
            this.rbTidak.setChecked(true);
            this.llBankPenerbitLain.setVisibility(8);
        } else if (!flagOtherCC.equals("Y")) {
            this.rbYa.setChecked(true);
            this.llBankPenerbitLain.setVisibility(0);
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.setFlagOtherCC("Y");
                    ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().add((CCOtherBankCreditCard) realm.createObject(CCOtherBankCreditCard.class));
                }
            });
        } else {
            this.rbYa.setChecked(true);
            this.llBankPenerbitLain.setVisibility(0);
            if (((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards() == null || ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().isEmpty()) {
                this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.5
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.setFlagOtherCC("Y");
                        ((CC8FormKartuKreditActivity) CC18FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().add((CCOtherBankCreditCard) realm.createObject(CCOtherBankCreditCard.class));
                    }
                });
            } else {
                this.etBankPenerbit.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName() == null ? "" : ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName().getDescription());
                this.etNoKartuKredit.setText(((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getCardNumber());
                if (!((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().isEmpty()) {
                    this.etTanggalExpired.setText(getString(2131822365, ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(0, 2), ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(2, 4)));
                }
                this.tilNomorKartuKredit.setHintEnabled(!this.etNoKartuKredit.getText().toString().isEmpty());
                this.tilBankPenerbit.setHintEnabled(!this.etBankPenerbit.getText().toString().isEmpty());
                this.tilTanggalExpired.setHintEnabled(true ^ this.etTanggalExpired.getText().toString().isEmpty());
            }
        }
        this.rgKartuKredit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, final int i) {
                CC18FormKartuKreditFragment.this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.1.1
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        int i2 = i;
                        if (i2 == 2131298183) {
                            setMessage setmessage = CC18FormKartuKreditFragment.this.d;
                            LinearLayout linearLayout = CC18FormKartuKreditFragment.this.llBankPenerbitLain;
                            setmessage.a = linearLayout.getMeasuredHeight();
                            setmessage.b = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0088: IPUT  
                                  (wrap: o.setMessage$1 : 0x0085: CONSTRUCTOR  (r1v3 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v10 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                  (r0v6 'setmessage' o.setMessage)
                                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.1.1.execute(io.realm.Realm):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC18FormKartuKreditFragment$1$1.class
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
                            // Method dump skipped, instructions count: 387
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC18FormKartuKreditFragment.AnonymousClass1.AnonymousClass1.execute(io.realm.Realm):void");
                        }
                    });
                }
            });
            this.etNoKartuKredit.addTextChangedListener(this);
        }
    }
