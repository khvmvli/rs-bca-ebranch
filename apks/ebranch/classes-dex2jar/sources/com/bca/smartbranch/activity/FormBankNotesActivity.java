package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.fragment.BN1NoATMFragment;
import com.bca.smartbranch.fragment.BN1TujuanPembelian;
import com.bca.smartbranch.presenter.GetHBPresenter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.detailKirimanUangNormal;
import o.documentProvider;
import o.getCardName;
import o.getPromotion;
import o.getUserVisibleHint;
import o.onChooseKecamatanHome;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormBankNotesActivity.class */
public class FormBankNotesActivity extends BaseActivityPostLogin implements GetHBPresenter.write {
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297766)
    public LinearLayout llMain;
    @BindView(2131297767)
    public LinearLayout llMainIndicator;
    public ConfirmSubMastercardAdapter$ViewHolder n;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    private GetHBPresenter r;
    @BindView(2131298304)
    RelativeLayout rlToolbar;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822242)
    String toolbarTitlePembelianMataUang;
    @BindString(2131822045)
    String toolbarTitlePilihCabang;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private Stack<String> p = new Stack<>();
    public List<detailKirimanUangNormal.RemoteActionCompatParcelizer> f = new ArrayList();

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormBankNotesActivity$read.class */
    public interface read {
        boolean e();
    }

    private void e(int i) {
        if (i == 1) {
            this.tvIndicator1.setBackgroundResource(2131231203);
            this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator2.setBackgroundResource(2131231202);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator1.setVisibility(0);
            this.ivIndicatorClear1.setVisibility(8);
        } else if (i == 2) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setBackgroundResource(2131231203);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
        } else if (i == 3) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setBackgroundResource(2131231203);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
        }
    }

    private void e(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    private void s() {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.r;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.FormBankNotesActivity.s():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/FormBankNotesActivity.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
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
                com.bca.smartbranch.data.localdb.User r0 = r0.m
                if (r0 == 0) goto L_0x0044
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.r
                r7 = r0
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.h
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.m
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.m
                java.lang.String r4 = r4.getImei()
                r1.<init>(r2, r3, r4)
                r8 = r0
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.e(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.b = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormBankNotesActivity.s():void");
        }

        @Override // o.getView
        public void c(Fragment fragment) {
            char c;
            c(fragment);
            try {
                String tag = fragment.getTag();
                switch (tag.hashCode()) {
                    case -1225355855:
                        if (tag.equals("BN3PilihCabangFragment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -166132444:
                        if (tag.equals("BN1NoATMFragment")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 71305455:
                        if (tag.equals("BN2PembelianFragment")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1284846997:
                        if (tag.equals("BN5PilihNomorOTPFragment")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1368033127:
                        if (tag.equals("BN1TujuanPembelian")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1568651930:
                        if (tag.equals("BN5PilihRekeningFragment")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1806352221:
                        if (tag.equals("BN5VerifikasiOTPFragment")) {
                            c = 5;
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
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(8);
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                    case 1:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(0);
                        e(1);
                        ProgressBar progressBar = this.pbIndicator1;
                        progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                    case 2:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(0);
                        e(1);
                        ProgressBar progressBar2 = this.pbIndicator1;
                        progressBar2.startAnimation(new getCardName(progressBar2, 100.0f));
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                    case 3:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(8);
                        e(2);
                        ProgressBar progressBar3 = this.pbIndicator2;
                        progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePilihCabang);
                        s();
                        break;
                    case 4:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(0);
                        e(2);
                        ProgressBar progressBar4 = this.pbIndicator2;
                        progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                    case 5:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(8);
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                    case 6:
                        this.rlToolbar.setVisibility(0);
                        this.llMainIndicator.setVisibility(0);
                        ProgressBar progressBar5 = this.pbIndicator2;
                        progressBar5.startAnimation(new getCardName(progressBar5, 100.0f));
                        e(3);
                        this.p.push(fragment.getTag());
                        this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                        s();
                        break;
                }
                invalidateOptionsMenu();
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder("FormActivity : ");
                sb.append(e);
                Log.i("EBRANCH", sb.toString());
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        public final void d(Bundle bundle) {
            d(bundle);
            GetHBPresenter getHBPresenter = new GetHBPresenter();
            this.r = getHBPresenter;
            getHBPresenter.e = this;
            b(this.toolbar);
            i();
            i().d(true);
            i().d("");
            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
            this.n = new ConfirmSubMastercardAdapter$ViewHolder();
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                CustDataResponse custDataResponse = (CustDataResponse) ListUtil.OneItemImmutableList.a(extras.getParcelable("data_cust"));
                ArrayList arrayList = new ArrayList();
                for (CustDataResponse.Phone phone : custDataResponse.getPhoneList()) {
                    ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver = new ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver();
                    confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver.e = phone.getPhoneID();
                    confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver.b = phone.getPhoneNumber();
                    arrayList.add(confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver);
                }
                ArrayList arrayList2 = new ArrayList();
                for (CustDataResponse.Account account : custDataResponse.getAccountList()) {
                    ConfirmSubMastercardAdapter$ViewHolder.read read2 = new ConfirmSubMastercardAdapter$ViewHolder.read();
                    read2.b = account.getAccountID();
                    read2.e = account.getAccountNumber();
                    arrayList2.add(read2);
                }
                this.n.e = arrayList;
                this.n.d = arrayList2;
            }
            if (this.m == null || !this.m.getVerified().equals("Y")) {
                e(2131296811, new BN1NoATMFragment(), "BN1NoATMFragment");
            } else {
                e(2131296811, new BN1TujuanPembelian(), "BN1TujuanPembelian");
            }
        }

        @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
        public void onBackPressed() {
            Fragment findFragmentById = l().findFragmentById(2131296811);
            if (!(findFragmentById instanceof read) || !((read) findFragmentById).e()) {
                onBackPressed();
                this.p.pop();
                if (!this.p.empty()) {
                    String peek = this.p.peek();
                    peek.hashCode();
                    char c = 65535;
                    switch (peek.hashCode()) {
                        case -1225355855:
                            if (peek.equals("BN3PilihCabangFragment")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -166132444:
                            if (peek.equals("BN1NoATMFragment")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 71305455:
                            if (peek.equals("BN2PembelianFragment")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1284846997:
                            if (peek.equals("BN5PilihNomorOTPFragment")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1368033127:
                            if (peek.equals("BN1TujuanPembelian")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1568651930:
                            if (peek.equals("BN5PilihRekeningFragment")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1806352221:
                            if (peek.equals("BN5VerifikasiOTPFragment")) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(8);
                            e(2);
                            ProgressBar progressBar = this.pbIndicator2;
                            progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                            this.txtToolbarTitle.setText(this.toolbarTitlePilihCabang);
                            break;
                        case 1:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(8);
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                        case 2:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(0);
                            e(1);
                            ProgressBar progressBar2 = this.pbIndicator1;
                            progressBar2.startAnimation(new getCardName(progressBar2, 100.0f));
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                        case 3:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(0);
                            e(2);
                            ProgressBar progressBar3 = this.pbIndicator2;
                            progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                        case 4:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(0);
                            e(1);
                            ProgressBar progressBar4 = this.pbIndicator1;
                            progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                        case 5:
                            this.rlToolbar.setVisibility(0);
                            this.llMainIndicator.setVisibility(0);
                            ProgressBar progressBar5 = this.pbIndicator2;
                            progressBar5.startAnimation(new getCardName(progressBar5, 100.0f));
                            e(3);
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                        case 6:
                            this.rlToolbar.setVisibility(8);
                            this.llMainIndicator.setVisibility(8);
                            this.txtToolbarTitle.setText(this.toolbarTitlePembelianMataUang);
                            break;
                    }
                    invalidateOptionsMenu();
                    return;
                }
                return;
            }
            documentProvider.b().d(new clickOrangSamaDenganPemilik());
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseBranch(onChooseKecamatanHome onchoosekecamatanhome) {
            this.n.c = onchoosekecamatanhome.c.getBranchCode();
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
            if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
                startActivity(new Intent(this, MainActivity.class));
                overridePendingTransition(2130772009, 2130772012);
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseValueYakinKeluarReservation(onUbahFormReservasiEvent onubahformreservasievent) {
            if (onubahformreservasievent.b.equals("Y")) {
                startActivity(new Intent(this, MainActivity.class));
                overridePendingTransition(2130772009, 2130772012);
            }
        }

        @Override // android.app.Activity
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(2131558409, menu);
            if (this.p.empty() || !this.p.peek().equals("BN3PilihCabangFragment")) {
                return true;
            }
            menu.getItem(0).setVisible(false);
            return true;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
        public void onDestroy() {
            GetHBPresenter getHBPresenter = this.r;
            Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
            if (call != null) {
                call.cancel();
            }
            getHBPresenter.e = null;
            onDestroy();
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            getPromotion.d(this);
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                return true;
            } else if (menuItem.getItemId() != 2131298038) {
                return onOptionsItemSelected(menuItem);
            } else {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "FormBankNotesActivity";
            this.j = "FormBankNotesActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492954;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }
    }
