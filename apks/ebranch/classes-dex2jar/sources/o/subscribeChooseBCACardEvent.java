package o;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import o.MenuEbranchAdapter$MenuEbranchAdapterVH;
import o.MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding;
import o.PlaybackStateCompat;
import o.TxnBerkalaDetailActivity;
import o.detailBCAFullPayment;
import o.setCheckable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
/* loaded from: classes-dex2jar.jar:o/subscribeChooseBCACardEvent.class */
public final class subscribeChooseBCACardEvent extends BaseActivityPostLoginKotlin implements UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer {
    private final onChooseValueSumberPenghasilan h;
    private final onChooseValueSumberPenghasilan k;
    private detailBCAFullPayment.read l;
    private ActivityResultRegistry$1<Intent> n;
    public Map<Integer, View> f = new LinkedHashMap();
    private final String j = "DetailDaftarPemilikSumberDanaActivity";
    private String m = DaftarPemilikSumberDanaMenuActivity.f;

    /* loaded from: classes-dex2jar.jar:o/subscribeChooseBCACardEvent$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(0);
            subscribeChooseBCACardEvent.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH invoke() {
            View inflate = subscribeChooseBCACardEvent.this.getLayoutInflater().inflate(2131492931, (ViewGroup) null, false);
            int i = 2131296389;
            Button button = (Button) setRotation.a(inflate, 2131296389);
            if (button != null) {
                Button button2 = (Button) setRotation.a(inflate, 2131296457);
                if (button2 != null) {
                    LogoutDialog a = setRotation.a(inflate, 2131296932);
                    if (a != null) {
                        LogoutDialog a2 = setRotation.a(inflate, 2131297062);
                        if (a2 != null) {
                            LogoutDialog a3 = setRotation.a(inflate, 2131297094);
                            if (a3 != null) {
                                LogoutDialog a4 = setRotation.a(inflate, 2131297107);
                                if (a4 != null) {
                                    LogoutDialog a5 = setRotation.a(inflate, 2131297126);
                                    if (a5 != null) {
                                        View a6 = setRotation.a(inflate, 2131297500);
                                        if (a6 != null) {
                                            ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding b = ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.b(a6);
                                            LinearLayout linearLayout = (LinearLayout) inflate;
                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298481);
                                            if (logoutDialog_ViewBinding != null) {
                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298609);
                                                if (logoutDialog_ViewBinding2 != null) {
                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298640);
                                                    if (logoutDialog_ViewBinding3 != null) {
                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298647);
                                                        if (logoutDialog_ViewBinding4 != null) {
                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298653);
                                                            if (logoutDialog_ViewBinding5 != null) {
                                                                HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH = new HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH(linearLayout, button, button2, a, a2, a3, a4, a5, b, linearLayout, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5);
                                                                subscribeReservationRescheduleEvent.d(hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH, "");
                                                                return hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH;
                                                            }
                                                            i = 2131298653;
                                                        } else {
                                                            i = 2131298647;
                                                        }
                                                    } else {
                                                        i = 2131298640;
                                                    }
                                                } else {
                                                    i = 2131298609;
                                                }
                                            } else {
                                                i = 2131298481;
                                            }
                                        } else {
                                            i = 2131297500;
                                        }
                                    } else {
                                        i = 2131297126;
                                    }
                                } else {
                                    i = 2131297107;
                                }
                            } else {
                                i = 2131297094;
                            }
                        } else {
                            i = 2131297062;
                        }
                    } else {
                        i = 2131296932;
                    }
                } else {
                    i = 2131296457;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeChooseBCACardEvent$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<UpdateDeleteDaftarPemilikSumberDanaPresenter> {
        public static final read e = new read();

        read() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ UpdateDeleteDaftarPemilikSumberDanaPresenter invoke() {
            return new UpdateDeleteDaftarPemilikSumberDanaPresenter();
        }
    }

    public subscribeChooseBCACardEvent() {
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.h = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
        read read2 = read.e;
        subscribeReservationRescheduleEvent.e(read2, "");
        this.k = new Page6KLFragment_ViewBinding(read2, null, 2);
        ActivityResultRegistry$1<Intent> c = c(new setCheckable.write(), new PlaybackStateCompat.CustomAction() { // from class: o.CC2AskAccountActivity_ViewBinding
            @Override // o.PlaybackStateCompat.CustomAction
            public final void a(Object obj) {
                subscribeChooseBCACardEvent.d(subscribeChooseBCACardEvent.this, (ComponentActivity$3) obj);
            }
        });
        subscribeReservationRescheduleEvent.d(c, "");
        this.n = c;
    }

    public static /* synthetic */ void d(subscribeChooseBCACardEvent subscribechoosebcacardevent, View view) {
        subscribeReservationRescheduleEvent.e(subscribechoosebcacardevent, "");
        MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding = new MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding();
        isDetached l = subscribechoosebcacardevent.l();
        MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer = MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.b;
        menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.show(l, MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.f);
    }

    public static /* synthetic */ void d(subscribeChooseBCACardEvent subscribechoosebcacardevent, ComponentActivity$3 componentActivity$3) {
        subscribeReservationRescheduleEvent.e(subscribechoosebcacardevent, "");
        if (componentActivity$3.b == -1) {
            subscribechoosebcacardevent.finish();
        }
    }

    public static /* synthetic */ void e(subscribeChooseBCACardEvent subscribechoosebcacardevent, View view) {
        subscribeReservationRescheduleEvent.e(subscribechoosebcacardevent, "");
        Intent intent = new Intent(subscribechoosebcacardevent, CC5STujuanCCTambahanActivity_ViewBinding.class);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, subscribechoosebcacardevent.l);
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
        intent.putExtra(DaftarPemilikSumberDanaMenuActivity.m, subscribechoosebcacardevent.m);
        subscribechoosebcacardevent.n.e(intent, null);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d()).h;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.j;
        h(this.j);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void a(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void b(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void c(Bundle bundle) {
        String str;
        c(bundle);
        ((UpdateDeleteDaftarPemilikSumberDanaPresenter) this.k.d()).a = this;
        Bundle extras = getIntent().getExtras();
        String str2 = null;
        if (extras != null) {
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
            String str3 = DaftarPemilikSumberDanaMenuActivity.m;
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer2 = DaftarPemilikSumberDanaMenuActivity.j;
            str = extras.getString(str3, DaftarPemilikSumberDanaMenuActivity.f);
        } else {
            str = null;
        }
        String str4 = str;
        if (str == null) {
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer3 = DaftarPemilikSumberDanaMenuActivity.j;
            str4 = DaftarPemilikSumberDanaMenuActivity.f;
        }
        this.m = str4;
        this.l = extras != null ? (detailBCAFullPayment.read) extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE) : null;
        b(((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d()).g.d);
        i();
        setBackgroundResource i = i();
        boolean z = true;
        if (i != null) {
            i.d(true);
        }
        setBackgroundResource i2 = i();
        if (i2 != null) {
            i2.d("");
        }
        ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d()).g.c.setText(getResources().getString(2131822484));
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d();
        detailBCAFullPayment.read read2 = this.l;
        if (read2 != null) {
            str2 = read2.a;
        }
        if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "KTP")) {
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.m.setVisibility(8);
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.f91o.setHint(getResources().getString(2131821933));
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.l.setHint(getResources().getString(2131821553));
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.n.setHint(getResources().getString(2131821057));
        } else {
            if (!subscribeReservationRescheduleEvent.b((Object) str2, (Object) "Paspor")) {
                String upperCase = "Paspor".toUpperCase(Locale.ROOT);
                subscribeReservationRescheduleEvent.d(upperCase, "");
                z = subscribeReservationRescheduleEvent.b((Object) str2, (Object) upperCase);
            }
            if (z) {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.m.setVisibility(8);
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.f91o.setHint(getResources().getString(2131821937));
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.l.setHint(getResources().getString(2131821187));
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.n.setHint(getResources().getString(2131821061));
            } else if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "SIUP")) {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.m.setVisibility(8);
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.n.setVisibility(8);
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.k.setVisibility(8);
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.f91o.setHint(getResources().getString(2131821534));
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.l.setHint(getResources().getString(2131821192));
            } else {
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.l.setVisibility(8);
                hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.n.setVisibility(8);
                String str5 = this.m;
                DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer4 = DaftarPemilikSumberDanaMenuActivity.j;
                if (subscribeReservationRescheduleEvent.b((Object) str5, (Object) DaftarPemilikSumberDanaMenuActivity.k)) {
                    hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.f91o.setHint(getResources().getString(2131821931));
                } else {
                    hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.f91o.setHint(getResources().getString(2131821919));
                }
            }
        }
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2 = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d();
        detailBCAFullPayment.read read3 = this.l;
        if (read3 != null) {
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2.e.setText(read3.e);
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2.f.setText(read3.c);
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2.i.setText(read3.c);
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2.b.setText(read3.d);
            hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH2.c.setText(read3.b);
        }
        HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH3 = (HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d();
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH3.a.setOnClickListener(new View.OnClickListener() { // from class: o.subscribeRemoveBCACardEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                subscribeChooseBCACardEvent.e(subscribeChooseBCACardEvent.this, view);
            }
        });
        hubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH3.d.setOnClickListener(new View.OnClickListener() { // from class: o.CC3ChooseBCACardActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                subscribeChooseBCACardEvent.d(subscribeChooseBCACardEvent.this, view);
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void c(String str) {
        E();
        subscribeReservationRescheduleEvent.c((Object) str);
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, ((HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH) this.h.d()).j, str, 0);
        subscribeReservationRescheduleEvent.d(a, "");
        a.g();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void d(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void e(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onDeleteEventDialog(TxnBerkalaDetailActivity txnBerkalaDetailActivity) {
        subscribeReservationRescheduleEvent.e(txnBerkalaDetailActivity, "");
        String str = txnBerkalaDetailActivity.d;
        TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer = TxnBerkalaDetailActivity.c;
        if (subscribeReservationRescheduleEvent.b((Object) str, (Object) TxnBerkalaDetailActivity.a)) {
            UpdateDeleteDaftarPemilikSumberDanaPresenter updateDeleteDaftarPemilikSumberDanaPresenter = (UpdateDeleteDaftarPemilikSumberDanaPresenter) this.k.d();
            InfoProductActivity_ViewBinding infoProductActivity_ViewBinding = new InfoProductActivity_ViewBinding(J().getEmail(), J().getSessionId(), J().getImei(), null, 8);
            detailBCAFullPayment.read read2 = this.l;
            setIncomeDisplayAmount setincomedisplayamount = null;
            onChooseMenueBranchEvent onchoosemenuebranchevent = new onChooseMenueBranchEvent(read2 != null ? read2.h : null, null, null, null, 14);
            UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer iconCompatParcelizer2 = updateDeleteDaftarPemilikSumberDanaPresenter.a;
            if (iconCompatParcelizer2 != null) {
                iconCompatParcelizer2.p();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Email", infoProductActivity_ViewBinding.d);
                jSONObject.put("SessionId", infoProductActivity_ViewBinding.c);
                jSONObject.put("IMEI", infoProductActivity_ViewBinding.e);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String jSONObject2 = jSONObject.toString();
            subscribeReservationRescheduleEvent.d(jSONObject2, "");
            Charset charset = StandardCharsets.UTF_8;
            subscribeReservationRescheduleEvent.d(charset, "");
            byte[] bytes = jSONObject2.getBytes(charset);
            subscribeReservationRescheduleEvent.d(bytes, "");
            byte[] encode = Base64.encode(bytes, 2);
            subscribeReservationRescheduleEvent.d(encode, "");
            Charset charset2 = StandardCharsets.UTF_8;
            subscribeReservationRescheduleEvent.d(charset2, "");
            String obj = new StringBuilder(new String(encode, charset2)).reverse().toString();
            subscribeReservationRescheduleEvent.d(obj, "");
            setincomedisplayamount = updateDeleteDaftarPemilikSumberDanaPresenter.apiService;
            if (setincomedisplayamount == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            Call<OpenAccountSuccessActivity<Object>> e2 = setincomedisplayamount.e(obj, onchoosemenuebranchevent);
            updateDeleteDaftarPemilikSumberDanaPresenter.b = e2;
            if (e2 != null) {
                e2.enqueue((Callback) new UpdateDeleteDaftarPemilikSumberDanaPresenter.read());
                return;
            }
            return;
        }
        TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer3 = TxnBerkalaDetailActivity.c;
        if (subscribeReservationRescheduleEvent.b((Object) str, (Object) TxnBerkalaDetailActivity.b)) {
            finish();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        documentProvider.b().e(this);
        ((UpdateDeleteDaftarPemilikSumberDanaPresenter) this.k.d()).c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        subscribeReservationRescheduleEvent.e(menuItem, "");
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onStop() {
        onStop();
        documentProvider.b().e(this);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void p() {
        N();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void q() {
        E();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void t() {
        E();
        Bundle bundle = new Bundle();
        MenuEbranchAdapter$MenuEbranchAdapterVH.write write = MenuEbranchAdapter$MenuEbranchAdapterVH.c;
        bundle.putBoolean(MenuEbranchAdapter$MenuEbranchAdapterVH.b, false);
        MenuEbranchAdapter$MenuEbranchAdapterVH menuEbranchAdapter$MenuEbranchAdapterVH = new MenuEbranchAdapter$MenuEbranchAdapterVH();
        menuEbranchAdapter$MenuEbranchAdapterVH.setArguments(bundle);
        isDetached l = l();
        MenuEbranchAdapter$MenuEbranchAdapterVH.write write2 = MenuEbranchAdapter$MenuEbranchAdapterVH.c;
        menuEbranchAdapter$MenuEbranchAdapterVH.show(l, MenuEbranchAdapter$MenuEbranchAdapterVH.f);
    }
}
