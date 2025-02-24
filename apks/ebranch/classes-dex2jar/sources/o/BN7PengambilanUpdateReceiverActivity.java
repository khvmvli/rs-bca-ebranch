package o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.TransactionActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.UbahVisaCardAdapter$ViewHolder_ViewBinding;
import o.onClickDetail;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity.class */
public final class BN7PengambilanUpdateReceiverActivity extends BaseActivityPostLoginKotlin implements GetHBPresenter.write, UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver {
    private final onChooseValueSumberPenghasilan M;
    private boolean N;
    private String S;
    public ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding h;
    public List<? extends DaftarTransferResponse.DaftarTransferOutput> k;
    public String l;
    public BankTransfer m;
    public Drawable n;

    /* renamed from: o */
    public Drawable f76o;
    public UpdateTxnTellerKUDetailPresenter p;
    public GetCustAcctListResponse s;
    public GetHBPresenter t;
    public static final write j = new write((byte) 0);
    private static final String v = Constants$ScionAnalytics$MessageType.DATA_MESSAGE;
    private static final String w = "ListAcct";
    private static final String y = "ADMIN_FEES";
    private static final String z = "SUMBER_DANA";
    private static final String I = "TUJUAN_TRANSAKSI";
    private static final String u = "DAFTAR_TRANSFER";
    private static final String A = "NO_REFF";
    public Map<Integer, View> f = new LinkedHashMap();
    private final String E = "BankTransferFormActivity";
    private final String G = "RTGS";
    private final String F = "LLG";
    private List<GetTxnTellerDetailKUResponse.TxnDetail> J = new ArrayList();
    private List<GetTxnTellerDetailKUResponse.TxnDetail> K = new ArrayList();
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> r = new ArrayList();
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> q = new ArrayList();
    private List<onClickDetail.RemoteActionCompatParcelizer> H = new ArrayList();
    private GetTxnTellerDetailKUResponse.TxnDetail L = new GetTxnTellerDetailKUResponse.TxnDetail();

    /* loaded from: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(0);
            BN7PengambilanUpdateReceiverActivity.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding invoke() {
            DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding c = DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding.c(BN7PengambilanUpdateReceiverActivity.this.getLayoutInflater().inflate(2131492896, (ViewGroup) null, false));
            subscribeReservationRescheduleEvent.d(c, "");
            return c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public BN7PengambilanUpdateReceiverActivity() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        this.M = new Page6KLFragment_ViewBinding(iconCompatParcelizer, null, 2);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.M.d()).e;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.E;
        h(this.E);
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0c02 A[SYNTHETIC] */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void c(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 3277
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BN7PengambilanUpdateReceiverActivity.c(android.os.Bundle):void");
    }

    @Override // o.getView
    public final void c(Fragment fragment) {
        subscribeReservationRescheduleEvent.e(fragment, "");
        c(fragment);
        try {
            String tag = fragment.getTag();
            UbahVisaCardAdapter$ViewHolder_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = UbahVisaCardAdapter$ViewHolder_ViewBinding.a;
            if (subscribeReservationRescheduleEvent.b((Object) tag, (Object) UbahVisaCardAdapter$ViewHolder_ViewBinding.d)) {
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = this.h;
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = null;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding.m.setVisibility(8);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3.a.setVisibility(0);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4.k.setVisibility(8);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5.c.setVisibility(0);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6.r.setVisibility(8);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7.d.setVisibility(0);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8.p.setBackgroundResource(2131231203);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9.p.setTextColor(getResources().getColor(2131099772));
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10.p.setVisibility(0);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = null;
                }
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11.b.setVisibility(8);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = null;
                }
                ProgressBar progressBar = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12.g;
                subscribeReservationRescheduleEvent.d(progressBar, "");
                subscribeReservationRescheduleEvent.e(progressBar, "");
                progressBar.startAnimation(new getCardName(progressBar, 100.0f));
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 = null;
                }
                ProgressBar progressBar2 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13.l;
                subscribeReservationRescheduleEvent.d(progressBar2, "");
                subscribeReservationRescheduleEvent.e(progressBar2, "");
                progressBar2.startAnimation(new getCardName(progressBar2, 100.0f));
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = this.h;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                }
                ProgressBar progressBar3 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2.n;
                subscribeReservationRescheduleEvent.d(progressBar3, "");
                subscribeReservationRescheduleEvent.e(progressBar3, "");
                progressBar3.startAnimation(new getCardName(progressBar3, 100.0f));
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("FormActivity : ");
            sb.append(e);
            Log.i("EBRANCH", sb.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        E();
        subscribeReservationRescheduleEvent.c((Object) str);
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.M.d()).c, str, 0);
        subscribeReservationRescheduleEvent.d(a, "");
        a.g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public final void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(tarikanReservasiUbahTransaksiActivity_ViewBinding, "");
        if (subscribeReservationRescheduleEvent.b((Object) tarikanReservasiUbahTransaksiActivity_ViewBinding.a, (Object) "Y")) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.t;
        if (getHBPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            getHBPresenter = null;
        }
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
        UpdateTxnTellerKUDetailPresenter updateTxnTellerKUDetailPresenter = this.p;
        if (updateTxnTellerKUDetailPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            updateTxnTellerKUDetailPresenter = null;
        }
        Call<OpenAccountSuccessActivity<Object>> call2 = updateTxnTellerKUDetailPresenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        updateTxnTellerKUDetailPresenter.a = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z2;
        subscribeReservationRescheduleEvent.e(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
        } else if (itemId != 2131298038) {
            z2 = onOptionsItemSelected(menuItem);
            return z2;
        } else {
            YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
            yakinKeluarDialog.d = "transaction_teller";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
        }
        z2 = true;
        return z2;
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void u() {
        E();
        Intent intent = new Intent(this, TransactionActivity.class);
        intent.putExtra("is_update", true);
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) this);
    }

    @Override // com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void x() {
        N();
    }

    public final void y() {
        if (J() != null) {
            GetHBPresenter getHBPresenter = this.t;
            if (getHBPresenter == null) {
                subscribeReservationRescheduleEvent.e("");
                getHBPresenter = null;
            }
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(F(), J().getSessionId(), J().getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE  
                  (r0v8 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x004a: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r7v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: o.BN7PengambilanUpdateReceiverActivity.y():void, file: classes-dex2jar.jar:o/BN7PengambilanUpdateReceiverActivity.class
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
                com.bca.smartbranch.data.localdb.User r0 = r0.J()
                if (r0 == 0) goto L_0x0052
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.t
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L_0x0013
                goto L_0x001a
            L_0x0013:
                java.lang.String r0 = ""
                o.subscribeReservationRescheduleEvent.e(r0)
                r0 = 0
                r7 = r0
            L_0x001a:
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.F()
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.J()
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.J()
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
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BN7PengambilanUpdateReceiverActivity.y():void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:154:0x06aa, code lost:
            if ((r0 == null || r0.length() == 0) == false) goto L_0x06ad;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void z() {
            /*
            // Method dump skipped, instructions count: 2165
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BN7PengambilanUpdateReceiverActivity.z():void");
        }
    }
