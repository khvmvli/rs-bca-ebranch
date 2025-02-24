package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.MenuEbranchAdapter$MenuEbranchAdapterVH;
import o.TxnBerkalaDetailActivity;
import o.detailBCAFullPayment;
import o.subscribeTransaksiBatalEvent;
/* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding.class */
public final class CC5STujuanCCTambahanActivity_ViewBinding extends BaseActivityPostLoginKotlin implements UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer, View.OnFocusChangeListener {
    private final onChooseValueSumberPenghasilan f;
    private detailBCAFullPayment.read k;
    private List<? extends EditText> l;
    private List<? extends TextView> m;
    private final onChooseValueSumberPenghasilan n;

    /* renamed from: o */
    private List<? extends LogoutDialog_ViewBinding> f80o;
    public Map<Integer, View> h = new LinkedHashMap();
    private final String j = "EditDaftarPemilikSumberDanaActivity";
    private String p = DaftarPemilikSumberDanaMenuActivity.f;

    /* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver<String> customActionResultReceiver) {
            super(1);
            CC5STujuanCCTambahanActivity_ViewBinding.this = r4;
            this.d = customActionResultReceiver;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            CC5STujuanCCTambahanActivity_ViewBinding.this.a(0, (String) this.d.b);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver<String> customActionResultReceiver) {
            super(1);
            CC5STujuanCCTambahanActivity_ViewBinding.this = r4;
            this.d = customActionResultReceiver;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            CC5STujuanCCTambahanActivity_ViewBinding.this.a(3, (String) this.d.b);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(1);
            CC5STujuanCCTambahanActivity_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            CC5STujuanCCTambahanActivity_ViewBinding cC5STujuanCCTambahanActivity_ViewBinding = CC5STujuanCCTambahanActivity_ViewBinding.this;
            String string = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820912);
            subscribeReservationRescheduleEvent.d(string, "");
            cC5STujuanCCTambahanActivity_ViewBinding.a(2, string);
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<JenisIdAdapter$JenisIdVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            CC5STujuanCCTambahanActivity_ViewBinding.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ JenisIdAdapter$JenisIdVH invoke() {
            View inflate = CC5STujuanCCTambahanActivity_ViewBinding.this.getLayoutInflater().inflate(2131492945, (ViewGroup) null, false);
            Button button = (Button) setRotation.a(inflate, 2131296450);
            int i = 2131297603;
            if (button != null) {
                EditText editText = (EditText) setRotation.a(inflate, 2131296932);
                if (editText != null) {
                    getAnnualFeeAddOnAmount getannualfeeaddonamount = (getAnnualFeeAddOnAmount) setRotation.a(inflate, 2131296976);
                    if (getannualfeeaddonamount != null) {
                        EditText editText2 = (EditText) setRotation.a(inflate, 2131297062);
                        if (editText2 != null) {
                            EditText editText3 = (EditText) setRotation.a(inflate, 2131297094);
                            if (editText3 != null) {
                                EditText editText4 = (EditText) setRotation.a(inflate, 2131297107);
                                if (editText4 != null) {
                                    EditText editText5 = (EditText) setRotation.a(inflate, 2131297126);
                                    if (editText5 != null) {
                                        View a = setRotation.a(inflate, 2131297500);
                                        if (a != null) {
                                            ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding b = ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.b(a);
                                            LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297603);
                                            if (linearLayout != null) {
                                                LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298481);
                                                if (logoutDialog_ViewBinding != null) {
                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298527);
                                                    if (logoutDialog_ViewBinding2 != null) {
                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298609);
                                                        if (logoutDialog_ViewBinding3 != null) {
                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298640);
                                                            if (logoutDialog_ViewBinding4 != null) {
                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298647);
                                                                if (logoutDialog_ViewBinding5 != null) {
                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298653);
                                                                    if (logoutDialog_ViewBinding6 != null) {
                                                                        TextView textView = (TextView) setRotation.a(inflate, 2131298961);
                                                                        if (textView != null) {
                                                                            TextView textView2 = (TextView) setRotation.a(inflate, 2131299006);
                                                                            if (textView2 != null) {
                                                                                TextView textView3 = (TextView) setRotation.a(inflate, 2131299086);
                                                                                if (textView3 != null) {
                                                                                    TextView textView4 = (TextView) setRotation.a(inflate, 2131299115);
                                                                                    if (textView4 != null) {
                                                                                        TextView textView5 = (TextView) setRotation.a(inflate, 2131299121);
                                                                                        if (textView5 != null) {
                                                                                            TextView textView6 = (TextView) setRotation.a(inflate, 2131299126);
                                                                                            if (textView6 != null) {
                                                                                                JenisIdAdapter$JenisIdVH jenisIdAdapter$JenisIdVH = new JenisIdAdapter$JenisIdVH(linearLayout2, button, editText, getannualfeeaddonamount, editText2, editText3, editText4, editText5, b, linearLayout, linearLayout2, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, textView, textView2, textView3, textView4, textView5, textView6);
                                                                                                subscribeReservationRescheduleEvent.d(jenisIdAdapter$JenisIdVH, "");
                                                                                                return jenisIdAdapter$JenisIdVH;
                                                                                            }
                                                                                            i = 2131299126;
                                                                                        } else {
                                                                                            i = 2131299121;
                                                                                        }
                                                                                    } else {
                                                                                        i = 2131299115;
                                                                                    }
                                                                                } else {
                                                                                    i = 2131299086;
                                                                                }
                                                                            } else {
                                                                                i = 2131299006;
                                                                            }
                                                                        } else {
                                                                            i = 2131298961;
                                                                        }
                                                                    } else {
                                                                        i = 2131298653;
                                                                    }
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
                                                        i = 2131298527;
                                                    }
                                                } else {
                                                    i = 2131298481;
                                                }
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
                        i = 2131296976;
                    }
                } else {
                    i = 2131296932;
                }
            } else {
                i = 2131296450;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CC5STujuanCCTambahanActivity_ViewBinding$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write() {
            super(1);
            CC5STujuanCCTambahanActivity_ViewBinding.this = r4;
        }

        @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
        public final /* synthetic */ onCLickStatusNpwp a(String str) {
            subscribeReservationRescheduleEvent.e(str, "");
            CC5STujuanCCTambahanActivity_ViewBinding cC5STujuanCCTambahanActivity_ViewBinding = CC5STujuanCCTambahanActivity_ViewBinding.this;
            String string = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820920);
            subscribeReservationRescheduleEvent.d(string, "");
            cC5STujuanCCTambahanActivity_ViewBinding.a(1, string);
            return onCLickStatusNpwp.e;
        }
    }

    public CC5STujuanCCTambahanActivity_ViewBinding() {
        DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
        read read2 = new read();
        subscribeReservationRescheduleEvent.e(read2, "");
        this.f = new Page6KLFragment_ViewBinding(read2, null, 2);
        CC5STujuanCCTambahanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver cC5STujuanCCTambahanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = CC5STujuanCCTambahanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d;
        subscribeReservationRescheduleEvent.e(cC5STujuanCCTambahanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "");
        this.n = new Page6KLFragment_ViewBinding(cC5STujuanCCTambahanActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, null, 2);
    }

    public static /* synthetic */ void a(CC5STujuanCCTambahanActivity_ViewBinding cC5STujuanCCTambahanActivity_ViewBinding, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        subscribeReservationRescheduleEvent.e(cC5STujuanCCTambahanActivity_ViewBinding, "");
        getPromotion.d(cC5STujuanCCTambahanActivity_ViewBinding);
        List<? extends TextView> list = cC5STujuanCCTambahanActivity_ViewBinding.m;
        String str = null;
        List<? extends TextView> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        for (TextView textView : list2) {
            textView.setVisibility(8);
        }
        List<? extends LogoutDialog_ViewBinding> list3 = cC5STujuanCCTambahanActivity_ViewBinding.f80o;
        List<? extends LogoutDialog_ViewBinding> list4 = list3;
        if (list3 == null) {
            subscribeReservationRescheduleEvent.e("");
            list4 = null;
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : list4) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        JenisIdAdapter$JenisIdVH jenisIdAdapter$JenisIdVH = (JenisIdAdapter$JenisIdVH) cC5STujuanCCTambahanActivity_ViewBinding.f.d();
        if (!jenisIdAdapter$JenisIdVH.c.isShown() || !jenisIdAdapter$JenisIdVH.c.isEnabled()) {
            z = true;
        } else {
            subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = new subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver();
            String string = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820852);
            subscribeReservationRescheduleEvent.d(string, "");
            customActionResultReceiver.b = string;
            detailBCAFullPayment.read read2 = cC5STujuanCCTambahanActivity_ViewBinding.k;
            String str2 = read2 != null ? read2.a : null;
            if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "KTP")) {
                String string2 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820865);
                subscribeReservationRescheduleEvent.d(string2, "");
                customActionResultReceiver.b = string2;
            } else {
                if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "Paspor")) {
                    z6 = true;
                } else {
                    String upperCase = "Paspor".toUpperCase(Locale.ROOT);
                    subscribeReservationRescheduleEvent.d(upperCase, "");
                    z6 = subscribeReservationRescheduleEvent.b((Object) str2, (Object) upperCase);
                }
                if (z6) {
                    String string3 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820866);
                    subscribeReservationRescheduleEvent.d(string3, "");
                    customActionResultReceiver.b = string3;
                } else if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "SIUP")) {
                    String string4 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820863);
                    subscribeReservationRescheduleEvent.d(string4, "");
                    customActionResultReceiver.b = string4;
                } else {
                    String str3 = cC5STujuanCCTambahanActivity_ViewBinding.p;
                    DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
                    if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) DaftarPemilikSumberDanaMenuActivity.k)) {
                        String string5 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820863);
                        subscribeReservationRescheduleEvent.d(string5, "");
                        customActionResultReceiver.b = string5;
                    }
                }
            }
            EditText editText = jenisIdAdapter$JenisIdVH.c;
            subscribeReservationRescheduleEvent.d(editText, "");
            z = pilihNorek.c(editText, new IconCompatParcelizer(customActionResultReceiver));
        }
        if (!jenisIdAdapter$JenisIdVH.h.isShown() || !jenisIdAdapter$JenisIdVH.h.isEnabled()) {
            z2 = true;
        } else {
            EditText editText2 = jenisIdAdapter$JenisIdVH.h;
            subscribeReservationRescheduleEvent.d(editText2, "");
            z2 = pilihNorek.c(editText2, new write());
        }
        if (!jenisIdAdapter$JenisIdVH.g.isShown() || !jenisIdAdapter$JenisIdVH.g.isEnabled()) {
            z3 = true;
        } else {
            EditText editText3 = jenisIdAdapter$JenisIdVH.g;
            subscribeReservationRescheduleEvent.d(editText3, "");
            z3 = pilihNorek.c(editText3, new RemoteActionCompatParcelizer());
        }
        if (!jenisIdAdapter$JenisIdVH.a.isShown() || !jenisIdAdapter$JenisIdVH.a.isEnabled()) {
            z4 = true;
        } else {
            subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2 = new subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver();
            String string6 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820733);
            subscribeReservationRescheduleEvent.d(string6, "");
            customActionResultReceiver2.b = string6;
            detailBCAFullPayment.read read3 = cC5STujuanCCTambahanActivity_ViewBinding.k;
            String str4 = read3 != null ? read3.a : null;
            if (subscribeReservationRescheduleEvent.b((Object) str4, (Object) "KTP")) {
                String string7 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820733);
                subscribeReservationRescheduleEvent.d(string7, "");
                customActionResultReceiver2.b = string7;
            } else {
                if (subscribeReservationRescheduleEvent.b((Object) str4, (Object) "Paspor")) {
                    z5 = true;
                } else {
                    String upperCase2 = "Paspor".toUpperCase(Locale.ROOT);
                    subscribeReservationRescheduleEvent.d(upperCase2, "");
                    z5 = subscribeReservationRescheduleEvent.b((Object) str4, (Object) upperCase2);
                }
                if (z5) {
                    String string8 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820734);
                    subscribeReservationRescheduleEvent.d(string8, "");
                    customActionResultReceiver2.b = string8;
                }
            }
            EditText editText4 = jenisIdAdapter$JenisIdVH.a;
            subscribeReservationRescheduleEvent.d(editText4, "");
            z4 = pilihNorek.c(editText4, new MediaMetadataCompat(customActionResultReceiver2));
        }
        boolean z7 = true;
        if (jenisIdAdapter$JenisIdVH.b.isShown()) {
            z7 = true;
            if (jenisIdAdapter$JenisIdVH.b.isEnabled()) {
                String obj = jenisIdAdapter$JenisIdVH.b.getText().toString();
                String str5 = obj;
                if (str5 == null || str5.length() == 0) {
                    String string9 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820902);
                    subscribeReservationRescheduleEvent.d(string9, "");
                    cC5STujuanCCTambahanActivity_ViewBinding.a(4, string9);
                } else if (obj == null ? false : !obj.matches("[0-9]+")) {
                    String string10 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820904);
                    subscribeReservationRescheduleEvent.d(string10, "");
                    cC5STujuanCCTambahanActivity_ViewBinding.a(4, string10);
                } else if (obj.length() < 6) {
                    String string11 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820908);
                    subscribeReservationRescheduleEvent.d(string11, "");
                    cC5STujuanCCTambahanActivity_ViewBinding.a(4, string11);
                } else {
                    String substring = obj.substring(0, 2);
                    subscribeReservationRescheduleEvent.d(substring, "");
                    if (subscribeReservationRescheduleEvent.b((Object) substring, (Object) "00")) {
                        String string12 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820909);
                        subscribeReservationRescheduleEvent.d(string12, "");
                        cC5STujuanCCTambahanActivity_ViewBinding.a(4, string12);
                    } else {
                        z7 = true;
                        if (getPromotion.f(obj)) {
                            z7 = true;
                            if (obj.length() >= 6) {
                                String string13 = cC5STujuanCCTambahanActivity_ViewBinding.getResources().getString(2131820909);
                                subscribeReservationRescheduleEvent.d(string13, "");
                                cC5STujuanCCTambahanActivity_ViewBinding.a(4, string13);
                            }
                        }
                    }
                }
                z7 = false;
            }
        }
        if (z && z2 && z3 && z4 && z7) {
            UpdateDeleteDaftarPemilikSumberDanaPresenter updateDeleteDaftarPemilikSumberDanaPresenter = (UpdateDeleteDaftarPemilikSumberDanaPresenter) cC5STujuanCCTambahanActivity_ViewBinding.n.d();
            InfoProductActivity_ViewBinding infoProductActivity_ViewBinding = new InfoProductActivity_ViewBinding(cC5STujuanCCTambahanActivity_ViewBinding.J().getEmail(), cC5STujuanCCTambahanActivity_ViewBinding.J().getSessionId(), cC5STujuanCCTambahanActivity_ViewBinding.J().getImei(), null, 8);
            detailBCAFullPayment.read read4 = cC5STujuanCCTambahanActivity_ViewBinding.k;
            if (read4 != null) {
                str = read4.h;
            }
            updateDeleteDaftarPemilikSumberDanaPresenter.a(infoProductActivity_ViewBinding, new onChooseMenueBranchEvent(str, ((JenisIdAdapter$JenisIdVH) cC5STujuanCCTambahanActivity_ViewBinding.f.d()).c.getText().toString(), ((JenisIdAdapter$JenisIdVH) cC5STujuanCCTambahanActivity_ViewBinding.f.d()).a.getText().toString(), ((JenisIdAdapter$JenisIdVH) cC5STujuanCCTambahanActivity_ViewBinding.f.d()).b.getText().toString()));
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((JenisIdAdapter$JenisIdVH) this.f.d()).l;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.j;
        h(this.j);
    }

    public final void a(int i, String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        List<? extends TextView> list = this.m;
        List<? extends LogoutDialog_ViewBinding> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        ((TextView) list3.get(i)).setVisibility(0);
        List<? extends TextView> list4 = this.m;
        List<? extends TextView> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        ((TextView) list5.get(i)).setText(str);
        list2 = this.f80o;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        ((LogoutDialog_ViewBinding) list2.get(i)).setBackgroundResource(2131230870);
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
        EditText editText = ((JenisIdAdapter$JenisIdVH) this.f.d()).c;
        subscribeReservationRescheduleEvent.d(editText, "");
        EditText editText2 = ((JenisIdAdapter$JenisIdVH) this.f.d()).h;
        subscribeReservationRescheduleEvent.d(editText2, "");
        boolean z = true;
        EditText editText3 = ((JenisIdAdapter$JenisIdVH) this.f.d()).g;
        subscribeReservationRescheduleEvent.d(editText3, "");
        EditText editText4 = ((JenisIdAdapter$JenisIdVH) this.f.d()).a;
        subscribeReservationRescheduleEvent.d(editText4, "");
        EditText editText5 = ((JenisIdAdapter$JenisIdVH) this.f.d()).b;
        subscribeReservationRescheduleEvent.d(editText5, "");
        EditText[] editTextArr = {editText, editText2, editText3, editText4, editText5};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.l = asList;
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = ((JenisIdAdapter$JenisIdVH) this.f.d()).m;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = ((JenisIdAdapter$JenisIdVH) this.f.d()).q;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = ((JenisIdAdapter$JenisIdVH) this.f.d()).p;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = ((JenisIdAdapter$JenisIdVH) this.f.d()).f92o;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = ((JenisIdAdapter$JenisIdVH) this.f.d()).k;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.f80o = asList2;
        TextView textView = ((JenisIdAdapter$JenisIdVH) this.f.d()).r;
        subscribeReservationRescheduleEvent.d(textView, "");
        TextView textView2 = ((JenisIdAdapter$JenisIdVH) this.f.d()).x;
        subscribeReservationRescheduleEvent.d(textView2, "");
        TextView textView3 = ((JenisIdAdapter$JenisIdVH) this.f.d()).v;
        subscribeReservationRescheduleEvent.d(textView3, "");
        TextView textView4 = ((JenisIdAdapter$JenisIdVH) this.f.d()).s;
        subscribeReservationRescheduleEvent.d(textView4, "");
        TextView textView5 = ((JenisIdAdapter$JenisIdVH) this.f.d()).w;
        subscribeReservationRescheduleEvent.d(textView5, "");
        TextView[] textViewArr = {textView, textView2, textView3, textView4, textView5};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.m = asList3;
        ((UpdateDeleteDaftarPemilikSumberDanaPresenter) this.n.d()).a = this;
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
        this.p = str4;
        this.k = extras != null ? (detailBCAFullPayment.read) extras.getParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE) : null;
        b(((JenisIdAdapter$JenisIdVH) this.f.d()).j.d);
        i();
        setBackgroundResource i = i();
        if (i != null) {
            i.d(true);
        }
        setBackgroundResource i2 = i();
        if (i2 != null) {
            i2.d("");
        }
        ((JenisIdAdapter$JenisIdVH) this.f.d()).j.c.setText(getResources().getString(2131822484));
        JenisIdAdapter$JenisIdVH jenisIdAdapter$JenisIdVH = (JenisIdAdapter$JenisIdVH) this.f.d();
        detailBCAFullPayment.read read2 = this.k;
        if (read2 != null) {
            str2 = read2.a;
        }
        if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "KTP")) {
            jenisIdAdapter$JenisIdVH.q.setVisibility(8);
            jenisIdAdapter$JenisIdVH.m.setHint(getResources().getString(2131821933));
            jenisIdAdapter$JenisIdVH.p.setHint(getResources().getString(2131821553));
            jenisIdAdapter$JenisIdVH.f92o.setHint(getResources().getString(2131821057));
        } else {
            if (!subscribeReservationRescheduleEvent.b((Object) str2, (Object) "Paspor")) {
                String upperCase = "Paspor".toUpperCase(Locale.ROOT);
                subscribeReservationRescheduleEvent.d(upperCase, "");
                z = subscribeReservationRescheduleEvent.b((Object) str2, (Object) upperCase);
            }
            if (z) {
                jenisIdAdapter$JenisIdVH.q.setVisibility(8);
                jenisIdAdapter$JenisIdVH.m.setHint(getResources().getString(2131821937));
                jenisIdAdapter$JenisIdVH.p.setHint(getResources().getString(2131821187));
                jenisIdAdapter$JenisIdVH.f92o.setHint(getResources().getString(2131821061));
            } else if (subscribeReservationRescheduleEvent.b((Object) str2, (Object) "SIUP")) {
                jenisIdAdapter$JenisIdVH.q.setVisibility(8);
                jenisIdAdapter$JenisIdVH.f92o.setVisibility(8);
                jenisIdAdapter$JenisIdVH.k.setVisibility(8);
                jenisIdAdapter$JenisIdVH.m.setHint(getResources().getString(2131821534));
                jenisIdAdapter$JenisIdVH.p.setHint(getResources().getString(2131821192));
            } else {
                jenisIdAdapter$JenisIdVH.p.setVisibility(8);
                jenisIdAdapter$JenisIdVH.f92o.setVisibility(8);
                String str5 = this.p;
                DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer4 = DaftarPemilikSumberDanaMenuActivity.j;
                if (subscribeReservationRescheduleEvent.b((Object) str5, (Object) DaftarPemilikSumberDanaMenuActivity.k)) {
                    jenisIdAdapter$JenisIdVH.m.setHint(getResources().getString(2131821931));
                } else {
                    jenisIdAdapter$JenisIdVH.m.setHint(getResources().getString(2131821919));
                }
            }
        }
        EditText editText6 = jenisIdAdapter$JenisIdVH.c;
        CC5STujuanCCTambahanActivity_ViewBinding cC5STujuanCCTambahanActivity_ViewBinding = this;
        editText6.setOnFocusChangeListener(cC5STujuanCCTambahanActivity_ViewBinding);
        jenisIdAdapter$JenisIdVH.h.setOnFocusChangeListener(cC5STujuanCCTambahanActivity_ViewBinding);
        jenisIdAdapter$JenisIdVH.g.setOnFocusChangeListener(cC5STujuanCCTambahanActivity_ViewBinding);
        jenisIdAdapter$JenisIdVH.a.setOnFocusChangeListener(cC5STujuanCCTambahanActivity_ViewBinding);
        jenisIdAdapter$JenisIdVH.b.setOnFocusChangeListener(cC5STujuanCCTambahanActivity_ViewBinding);
        JenisIdAdapter$JenisIdVH jenisIdAdapter$JenisIdVH2 = (JenisIdAdapter$JenisIdVH) this.f.d();
        detailBCAFullPayment.read read3 = this.k;
        if (read3 != null) {
            jenisIdAdapter$JenisIdVH2.c.setText(read3.e);
            jenisIdAdapter$JenisIdVH2.h.setText(read3.c);
            jenisIdAdapter$JenisIdVH2.g.setText(read3.c);
            jenisIdAdapter$JenisIdVH2.a.setText(read3.d);
            jenisIdAdapter$JenisIdVH2.b.setText(read3.b);
        }
        ((JenisIdAdapter$JenisIdVH) this.f.d()).d.setOnClickListener(new View.OnClickListener() { // from class: o.CC5ChooseMastercardVisaActivity_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CC5STujuanCCTambahanActivity_ViewBinding.a(CC5STujuanCCTambahanActivity_ViewBinding.this, view);
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void c(String str) {
        E();
        subscribeReservationRescheduleEvent.c((Object) str);
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, ((JenisIdAdapter$JenisIdVH) this.f.d()).i, str, 0);
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        documentProvider.b().e(this);
        ((UpdateDeleteDaftarPemilikSumberDanaPresenter) this.n.d()).c();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        JenisIdAdapter$JenisIdVH jenisIdAdapter$JenisIdVH = (JenisIdAdapter$JenisIdVH) this.f.d();
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        if (z) {
            subscribeReservationRescheduleEvent.c(view);
            switch (view.getId()) {
                case 2131296932:
                    jenisIdAdapter$JenisIdVH.f92o.setHintEnabled(true);
                    return;
                case 2131297062:
                    jenisIdAdapter$JenisIdVH.m.setHintEnabled(true);
                    return;
                case 2131297094:
                    jenisIdAdapter$JenisIdVH.k.setHintEnabled(true);
                    return;
                case 2131297101:
                    jenisIdAdapter$JenisIdVH.p.setHintEnabled(true);
                    return;
                case 2131297107:
                    jenisIdAdapter$JenisIdVH.q.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            subscribeReservationRescheduleEvent.c(view);
            switch (view.getId()) {
                case 2131296932:
                    if (jenisIdAdapter$JenisIdVH.a.getText().toString().length() != 0) {
                        z5 = false;
                    }
                    if (z5) {
                        jenisIdAdapter$JenisIdVH.f92o.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297062:
                    if (jenisIdAdapter$JenisIdVH.c.getText().toString().length() != 0) {
                        z4 = false;
                    }
                    if (z4) {
                        jenisIdAdapter$JenisIdVH.m.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297094:
                    if (jenisIdAdapter$JenisIdVH.b.getText().toString().length() != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        jenisIdAdapter$JenisIdVH.k.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297101:
                    if (jenisIdAdapter$JenisIdVH.g.getText().toString().length() != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        jenisIdAdapter$JenisIdVH.p.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297107:
                    if (jenisIdAdapter$JenisIdVH.h.getText().toString().length() != 0) {
                        z6 = false;
                    }
                    if (z6) {
                        jenisIdAdapter$JenisIdVH.q.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onSuccessDialog(TxnBerkalaDetailActivity txnBerkalaDetailActivity) {
        subscribeReservationRescheduleEvent.e(txnBerkalaDetailActivity, "");
        String str = txnBerkalaDetailActivity.d;
        TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer = TxnBerkalaDetailActivity.c;
        if (subscribeReservationRescheduleEvent.b((Object) str, (Object) TxnBerkalaDetailActivity.e)) {
            Intent intent = new Intent();
            detailBCAFullPayment.read read2 = this.k;
            String str2 = null;
            String str3 = read2 != null ? read2.h : null;
            detailBCAFullPayment.read read3 = this.k;
            if (read3 != null) {
                str2 = read3.a;
            }
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, new detailBCAFullPayment.read(str3, ((JenisIdAdapter$JenisIdVH) this.f.d()).c.getText().toString(), str2, ((JenisIdAdapter$JenisIdVH) this.f.d()).h.getText().toString(), ((JenisIdAdapter$JenisIdVH) this.f.d()).a.getText().toString(), ((JenisIdAdapter$JenisIdVH) this.f.d()).b.getText().toString()));
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void p() {
        N();
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void q() {
        E();
        Bundle bundle = new Bundle();
        MenuEbranchAdapter$MenuEbranchAdapterVH.write write2 = MenuEbranchAdapter$MenuEbranchAdapterVH.c;
        bundle.putBoolean(MenuEbranchAdapter$MenuEbranchAdapterVH.b, true);
        MenuEbranchAdapter$MenuEbranchAdapterVH menuEbranchAdapter$MenuEbranchAdapterVH = new MenuEbranchAdapter$MenuEbranchAdapterVH();
        menuEbranchAdapter$MenuEbranchAdapterVH.setArguments(bundle);
        isDetached l = l();
        MenuEbranchAdapter$MenuEbranchAdapterVH.write write3 = MenuEbranchAdapter$MenuEbranchAdapterVH.c;
        menuEbranchAdapter$MenuEbranchAdapterVH.show(l, MenuEbranchAdapter$MenuEbranchAdapterVH.f);
    }

    @Override // com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter.IconCompatParcelizer
    public final void t() {
        E();
    }
}
