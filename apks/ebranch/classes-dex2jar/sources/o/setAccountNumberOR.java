package o;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.activity.TransactionActivity;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.localdb.KliringTemp;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.data.localdb.WarkatTemp;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.presenter.SubmitKliringCompletePresenter;
import com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.FormReservasiUbahTellerActivity_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/setAccountNumberOR.class */
public final class setAccountNumberOR extends BaseFragmentKotlin implements SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver {
    public static final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer((byte) 0);
    public Map<Integer, View> a = new LinkedHashMap();
    private final ArrayList<Object> b = new ArrayList<>();
    private ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding d;
    private final onChooseValueSumberPenghasilan e;
    private FormReservasiUbahTellerActivity_ViewBinding.write g;
    private final onChooseValueSumberPenghasilan h;
    private Integer l;
    private WarkatTemp n;

    /* loaded from: classes-dex2jar.jar:o/setAccountNumberOR$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends AsyncTask<Void, Void, Void> {
        IconCompatParcelizer() {
            setAccountNumberOR.this = r4;
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            subscribeReservationRescheduleEvent.e(voidArr, "");
            setAccountNumberOR.this.b.add(new ConfirmMastercardAdapter$ViewHolder("Title", ""));
            setAccountNumberOR.this.b.add(new ConfirmMastercardAdapter$ViewHolder("Penerima Data", setAccountNumberOR.b(setAccountNumberOR.this)));
            ArrayList<WarkatTemp> arrayList = setAccountNumberOR.b(setAccountNumberOR.this).j;
            if (arrayList != null) {
                ArrayList<WarkatTemp> arrayList2 = arrayList;
                setAccountNumberOR setaccountnumberor = setAccountNumberOR.this;
                for (WarkatTemp warkatTemp : arrayList2) {
                    setaccountnumberor.b.add(new ConfirmMastercardAdapter$ViewHolder("Item Warkat", warkatTemp));
                }
            }
            setAccountNumberOR.this.b.add(new ConfirmMastercardAdapter$ViewHolder("Total Warkat", Double.valueOf(setAccountNumberOR.b(setAccountNumberOR.this).r)));
            return null;
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Void r5) {
            onPostExecute(r5);
            setAccountNumberOR setaccountnumberor = setAccountNumberOR.this;
            ArrayList<WarkatTemp> arrayList = setAccountNumberOR.b(setaccountnumberor).j;
            setAccountNumberOR.b(setaccountnumberor, 0, arrayList != null ? arrayList.size() : 0);
            setAccountNumberOR.e(setAccountNumberOR.this);
            setAccountNumberOR.j(setAccountNumberOR.this);
            setAccountNumberOR.c(setAccountNumberOR.this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setAccountNumberOR$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAccountNumberOR$read.class */
    public static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<FormReservasiUbahTellerActivity_ViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            setAccountNumberOR.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ FormReservasiUbahTellerActivity_ViewBinding invoke() {
            getView requireActivity = setAccountNumberOR.this.requireActivity();
            subscribeReservationRescheduleEvent.d(requireActivity, "");
            return new FormReservasiUbahTellerActivity_ViewBinding(requireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAccountNumberOR$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<SubmitKliringCompletePresenter> {
        public static final write e = new write();

        write() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ SubmitKliringCompletePresenter invoke() {
            return new SubmitKliringCompletePresenter();
        }
    }

    public setAccountNumberOR() {
        read read2 = new read();
        subscribeReservationRescheduleEvent.e(read2, "");
        this.h = new Page6KLFragment_ViewBinding(read2, null, 2);
        write write2 = write.e;
        subscribeReservationRescheduleEvent.e(write2, "");
        this.e = new Page6KLFragment_ViewBinding(write2, null, 2);
    }

    private final void a(int i) {
        if (i > 0) {
            LayoutInflater from = LayoutInflater.from(requireContext());
            int i2 = 0;
            while (i2 < i) {
                ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = this.d;
                subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding);
                View inflate = from.inflate(2131493364, (ViewGroup) listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.j, false);
                subscribeReservationRescheduleEvent.d(inflate, "");
                View findViewById = inflate.findViewById(2131299637);
                subscribeReservationRescheduleEvent.d(findViewById, "");
                TextView textView = (TextView) findViewById;
                StringBuilder sb = new StringBuilder("Data Warkat ");
                i2++;
                sb.append(i2);
                textView.setText(sb.toString());
                ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding2 = this.d;
                subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding2);
                listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding2.j.addView(inflate);
            }
        }
    }

    public static final /* synthetic */ KliringTemp b(setAccountNumberOR setaccountnumberor) {
        getView activity = setaccountnumberor.getActivity();
        if (activity != null) {
            return ((subscribeUbahVisaCardEvent) activity).y;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    public static final /* synthetic */ void b(setAccountNumberOR setaccountnumberor, int i, int i2) {
        ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = setaccountnumberor.d;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding);
        listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.g.setVisibility(0);
        setaccountnumberor.a(i2);
    }

    public static final /* synthetic */ void c(setAccountNumberOR setaccountnumberor) {
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) setaccountnumberor.requireActivity();
        boolean z = true;
        ((FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d()).j = true;
        ((FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d()).f = setaccountnumberor.g().getVerified().equals("Y");
        FormReservasiUbahTellerActivity_ViewBinding formReservasiUbahTellerActivity_ViewBinding = (FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d();
        if (!setaccountnumberor.g().getVerified().equals("N") || subscribeubahvisacardevent.f == null || ((Boolean) subscribeubahvisacardevent.u.d()).booleanValue()) {
            z = false;
        }
        formReservasiUbahTellerActivity_ViewBinding.h = z;
        ((FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d()).a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x05ae, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x05b1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0626, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x0629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x069e, code lost:
        if ((r0 == null || r0.length() == 0) == false) goto L_0x06cd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01aa, code lost:
        if ((r0.c.length() == 0) != false) goto L_0x01ad;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0385  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void c(o.setAccountNumberOR r9, android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 2810
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAccountNumberOR.c(o.setAccountNumberOR, android.view.View):void");
    }

    private final void c(boolean z) {
        if (this.n != null) {
            getView activity = getActivity();
            if (activity != null) {
                ArrayList<WarkatTemp> arrayList = ((subscribeUbahVisaCardEvent) activity).y.j;
                int i = 0;
                if (arrayList != null) {
                    Integer num = this.l;
                    arrayList.remove(num != null ? num.intValue() : 0);
                }
                getView activity2 = getActivity();
                if (activity2 != null) {
                    ArrayList<WarkatTemp> arrayList2 = ((subscribeUbahVisaCardEvent) activity2).y.j;
                    if (arrayList2 != null) {
                        Integer num2 = this.l;
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                        arrayList2.add(i, this.n);
                    }
                    if (z) {
                        ((FormReservasiUbahTellerActivity_ViewBinding) this.h.d()).a.b();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
    }

    public static /* synthetic */ void d(setAccountNumberOR setaccountnumberor) {
        subscribeReservationRescheduleEvent.e(setaccountnumberor, "");
        FormReservasiUbahTellerActivity_ViewBinding formReservasiUbahTellerActivity_ViewBinding = (FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d();
        ArrayList<Object> arrayList = setaccountnumberor.b;
        subscribeReservationRescheduleEvent.e(arrayList, "");
        formReservasiUbahTellerActivity_ViewBinding.g = arrayList;
        formReservasiUbahTellerActivity_ViewBinding.b = arrayList.size();
        User g = setaccountnumberor.g();
        subscribeReservationRescheduleEvent.e(g, "");
        formReservasiUbahTellerActivity_ViewBinding.i = g;
        formReservasiUbahTellerActivity_ViewBinding.a.b();
        getView activity = setaccountnumberor.getActivity();
        if (activity != null) {
            ArrayList<WarkatTemp> arrayList2 = ((subscribeUbahVisaCardEvent) activity).y.j;
            setaccountnumberor.e(8, arrayList2 != null ? arrayList2.size() : 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    private final void e(int i, int i2) {
        ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = this.d;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding);
        listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.g.setVisibility(i);
        a(i2);
    }

    public static final /* synthetic */ void e(setAccountNumberOR setaccountnumberor) {
        ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = setaccountnumberor.d;
        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.n;
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(setaccountnumberor.requireContext()));
        setonstartentertransitionlistener.setAdapter((FormReservasiUbahTellerActivity_ViewBinding) setaccountnumberor.h.d());
        new Handler().postDelayed(new Runnable() { // from class: o.getTxnNotes
            @Override // java.lang.Runnable
            public final void run() {
                setAccountNumberOR.d(setAccountNumberOR.this);
            }
        }, 450);
    }

    public static final /* synthetic */ void j(setAccountNumberOR setaccountnumberor) {
        Button button;
        ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = setaccountnumberor.d;
        if (listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding != null && (button = listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.e) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: o.getTxnAmount
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAccountNumberOR.c(setAccountNumberOR.this, view);
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void OnUpdateKliringPenerimaDataClick(UbahProfilActivity ubahProfilActivity) {
        String str;
        List<GetCustAcctListResponse.AccountData> accountList;
        GetCustAcctListResponse.AccountData accountData;
        List<GetCustAcctListResponse.AccountData> accountList2;
        subscribeReservationRescheduleEvent.e(ubahProfilActivity, "");
        if (subscribeReservationRescheduleEvent.b((Object) ubahProfilActivity.c, (Object) "nomorRekening") && g().getVerified() != null && !g().getVerified().equals("N") && ((subscribeUbahVisaCardEvent) requireActivity()).v != null) {
            GetCustAcctListResponse getCustAcctListResponse = ((subscribeUbahVisaCardEvent) requireActivity()).v;
            if (!((getCustAcctListResponse == null || (accountList2 = getCustAcctListResponse.getAccountList()) == null || !accountList2.isEmpty()) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("PilihRekeningDialogTitle", requireActivity().getResources().getString(2131822258));
                PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
                pilihRekeningDialog.setArguments(bundle);
                pilihRekeningDialog.e = ((subscribeUbahVisaCardEvent) requireActivity()).v;
                String str2 = ubahProfilActivity.e;
                boolean z = true;
                if (str2 != null) {
                    z = str2.length() == 0;
                }
                if (z) {
                    GetCustAcctListResponse getCustAcctListResponse2 = ((subscribeUbahVisaCardEvent) requireActivity()).v;
                    str = (getCustAcctListResponse2 == null || (accountList = getCustAcctListResponse2.getAccountList()) == null || (accountData = accountList.get(0)) == null) ? null : accountData.getAccountNumber();
                } else {
                    str = ubahProfilActivity.e;
                }
                pilihRekeningDialog.c = str;
                pilihRekeningDialog.show(getParentFragmentManager(), "PilihRekeningDialog");
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        f();
        Intent intent = new Intent(requireActivity(), TransactionActivity.class);
        intent.putExtra("is_update", true);
        startActivity(intent);
        requireActivity().finishAfterTransition();
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(requireActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(requireActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        f();
        Bundle bundle = new Bundle();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        bundle.putString("MessageDialogContent", str2);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d() {
        h();
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(requireActivity().l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.a.clear();
    }

    @Override // com.bca.smartbranch.presenter.SubmitKliringCompletePresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((subscribeUbahVisaCardEvent) requireActivity()).t();
        if (((Boolean) ((subscribeUbahVisaCardEvent) requireActivity()).s.d()).booleanValue()) {
            setOnHierarchyChangeListener.a((Activity) ((subscribeUbahVisaCardEvent) requireActivity()));
        } else {
            ((subscribeUbahVisaCardEvent) requireActivity()).a(2131296811, new getImei(), "K2DataWarkatFragment");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseBankTujuan(goDeleteAccount godeleteaccount) {
        subscribeReservationRescheduleEvent.e(godeleteaccount, "");
        WarkatTemp warkatTemp = this.n;
        if (warkatTemp != null) {
            String str = godeleteaccount.a;
            subscribeReservationRescheduleEvent.e(str, "");
            warkatTemp.g = str;
        }
        WarkatTemp warkatTemp2 = this.n;
        if (warkatTemp2 != null) {
            String str2 = godeleteaccount.c;
            subscribeReservationRescheduleEvent.e(str2, "");
            warkatTemp2.d = str2;
        }
        WarkatTemp warkatTemp3 = this.n;
        if (warkatTemp3 != null) {
            String str3 = godeleteaccount.d;
            subscribeReservationRescheduleEvent.e(str3, "");
            warkatTemp3.j = str3;
        }
        c(true);
        documentProvider.b().d(new togglePINLama("", "warkatBankReset", 0, godeleteaccount.a, 4));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseJenisWarkat(onIsiFormReservasiEvent onisiformreservasievent) {
        subscribeReservationRescheduleEvent.e(onisiformreservasievent, "");
        WarkatTemp warkatTemp = this.n;
        if (warkatTemp != null) {
            String str = onisiformreservasievent.b;
            subscribeReservationRescheduleEvent.e(str, "");
            warkatTemp.e = str;
        }
        WarkatTemp warkatTemp2 = this.n;
        if (warkatTemp2 != null) {
            String str2 = CheckOTPSessionPresenter.d(onisiformreservasievent.b, "cek", true) ? "00" : ReservasiOnline.LAYANAN_GIRO;
            subscribeReservationRescheduleEvent.e(str2, "");
            warkatTemp2.c = str2;
        }
        c(true);
        documentProvider.b().d(new togglePINLama("", "jenisWarkatReset", 0, onisiformreservasievent.b, 4));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseNomorRekening(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity, "");
        getView activity = getActivity();
        if (activity != null) {
            KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
            String str = reservasiROSuccessActivity.d;
            subscribeReservationRescheduleEvent.d(str, "");
            subscribeReservationRescheduleEvent.e(str, "");
            kliringTemp.h = str;
            documentProvider b = documentProvider.b();
            String str2 = reservasiROSuccessActivity.d;
            subscribeReservationRescheduleEvent.d(str2, "");
            b.d(new togglePINLama("", "nomorRekeningReset", 0, str2, 4));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSumberDana(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiTellerOActivity_ViewBinding, "");
        getView activity = getActivity();
        if (activity != null) {
            KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
            String str = reservasiTellerOActivity_ViewBinding.a;
            subscribeReservationRescheduleEvent.d(str, "");
            subscribeReservationRescheduleEvent.e(str, "");
            kliringTemp.m = str;
            getView activity2 = getActivity();
            if (activity2 != null) {
                KliringTemp kliringTemp2 = ((subscribeUbahVisaCardEvent) activity2).y;
                String str2 = reservasiTellerOActivity_ViewBinding.d;
                subscribeReservationRescheduleEvent.d(str2, "");
                subscribeReservationRescheduleEvent.e(str2, "");
                kliringTemp2.l = str2;
                documentProvider b = documentProvider.b();
                String str3 = reservasiTellerOActivity_ViewBinding.a;
                subscribeReservationRescheduleEvent.d(str3, "");
                b.d(new togglePINLama("", "sumberDanaReset", 0, str3, 4));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTanggalJatuhTempo(ReservasiTellerOActivity reservasiTellerOActivity) {
        subscribeReservationRescheduleEvent.e(reservasiTellerOActivity, "");
        getView activity = getActivity();
        if (activity != null) {
            KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
            if (kliringTemp != null) {
                String str = reservasiTellerOActivity.b;
                subscribeReservationRescheduleEvent.d(str, "");
                subscribeReservationRescheduleEvent.e(str, "");
                kliringTemp.k = str;
            }
            documentProvider b = documentProvider.b();
            String str2 = reservasiTellerOActivity.b;
            subscribeReservationRescheduleEvent.d(str2, "");
            b.d(new togglePINLama("", "tanggalJatuhTempoReset", 0, str2, 4));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTipeNasabah(ResetAccountActivity_ViewBinding resetAccountActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(resetAccountActivity_ViewBinding, "");
        if (subscribeReservationRescheduleEvent.b((Object) resetAccountActivity_ViewBinding.b, (Object) "auto_select")) {
            getView activity = getActivity();
            if (activity != null) {
                KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
                String str = resetAccountActivity_ViewBinding.c;
                subscribeReservationRescheduleEvent.e(str, "");
                kliringTemp.f29o = str;
                getView activity2 = getActivity();
                if (activity2 != null) {
                    KliringTemp kliringTemp2 = ((subscribeUbahVisaCardEvent) activity2).y;
                    String valueOf = String.valueOf(resetAccountActivity_ViewBinding.d);
                    subscribeReservationRescheduleEvent.e(valueOf, "");
                    kliringTemp2.p = valueOf;
                    ((subscribeUbahVisaCardEvent) requireActivity()).e(resetAccountActivity_ViewBinding.d);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        getView activity3 = getActivity();
        if (activity3 != null) {
            KliringTemp kliringTemp3 = ((subscribeUbahVisaCardEvent) activity3).y;
            String str2 = resetAccountActivity_ViewBinding.c;
            subscribeReservationRescheduleEvent.e(str2, "");
            kliringTemp3.f29o = str2;
            getView activity4 = getActivity();
            if (activity4 != null) {
                KliringTemp kliringTemp4 = ((subscribeUbahVisaCardEvent) activity4).y;
                String valueOf2 = String.valueOf(resetAccountActivity_ViewBinding.d);
                subscribeReservationRescheduleEvent.e(valueOf2, "");
                kliringTemp4.p = valueOf2;
                getView activity5 = getActivity();
                if (activity5 != null) {
                    KliringTemp kliringTemp5 = ((subscribeUbahVisaCardEvent) activity5).y;
                    subscribeReservationRescheduleEvent.e("", "");
                    kliringTemp5.m = "";
                    getView activity6 = getActivity();
                    if (activity6 != null) {
                        KliringTemp kliringTemp6 = ((subscribeUbahVisaCardEvent) activity6).y;
                        subscribeReservationRescheduleEvent.e("", "");
                        kliringTemp6.l = "";
                        ((subscribeUbahVisaCardEvent) requireActivity()).e(resetAccountActivity_ViewBinding.d);
                        documentProvider.b().d(new togglePINLama("", "tipeNasabahReset", 0, resetAccountActivity_ViewBinding.c, 4));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTujuanTransaksi(SyaratKetentuanActivity syaratKetentuanActivity) {
        subscribeReservationRescheduleEvent.e(syaratKetentuanActivity, "");
        getView activity = getActivity();
        if (activity != null) {
            KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
            String str = syaratKetentuanActivity.c;
            subscribeReservationRescheduleEvent.d(str, "");
            subscribeReservationRescheduleEvent.e(str, "");
            kliringTemp.s = str;
            getView activity2 = getActivity();
            if (activity2 != null) {
                KliringTemp kliringTemp2 = ((subscribeUbahVisaCardEvent) activity2).y;
                String str2 = syaratKetentuanActivity.a;
                subscribeReservationRescheduleEvent.d(str2, "");
                subscribeReservationRescheduleEvent.e(str2, "");
                kliringTemp2.t = str2;
                documentProvider b = documentProvider.b();
                String str3 = syaratKetentuanActivity.c;
                subscribeReservationRescheduleEvent.d(str3, "");
                b.d(new togglePINLama("", "tujuanTransaksiReset", 0, str3, 4));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        documentProvider.b().c(this);
        View inflate = layoutInflater.inflate(2131493190, viewGroup, false);
        int i = 2131296438;
        Button button = (Button) setRotation.a(inflate, 2131296438);
        if (button != null) {
            setTypeface settypeface = (setTypeface) setRotation.a(inflate, 2131296457);
            if (settypeface != null) {
                setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) setRotation.a(inflate, 2131297303);
                if (setdropdownhorizontaloffset != null) {
                    setDropDownHorizontalOffset setdropdownhorizontaloffset2 = (setDropDownHorizontalOffset) setRotation.a(inflate, 2131297305);
                    if (setdropdownhorizontaloffset2 != null) {
                        LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297484);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate, 2131297486);
                            if (linearLayout2 != null) {
                                setWeightSum setweightsum = (setWeightSum) setRotation.a(inflate, 2131297505);
                                if (setweightsum != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate, 2131297569);
                                    if (linearLayout3 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) setRotation.a(inflate, 2131297965);
                                        if (relativeLayout != null) {
                                            setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, 2131298321);
                                            if (setonstartentertransitionlistener != null) {
                                                setTypeface settypeface2 = (setTypeface) setRotation.a(inflate, 2131299636);
                                                if (settypeface2 != null) {
                                                    setTypeface settypeface3 = (setTypeface) setRotation.a(inflate, 2131299638);
                                                    if (settypeface3 != null) {
                                                        this.d = new ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding((setWeightSum) inflate, button, settypeface, setdropdownhorizontaloffset, setdropdownhorizontaloffset2, linearLayout, linearLayout2, setweightsum, linearLayout3, relativeLayout, setonstartentertransitionlistener, settypeface2, settypeface3);
                                                        ((SubmitKliringCompletePresenter) this.e.d()).b = this;
                                                        ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding = this.d;
                                                        subscribeReservationRescheduleEvent.c(listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding);
                                                        setWeightSum setweightsum2 = listBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.i;
                                                        subscribeReservationRescheduleEvent.d(setweightsum2, "");
                                                        return setweightsum2;
                                                    }
                                                    i = 2131299638;
                                                } else {
                                                    i = 2131299636;
                                                }
                                            } else {
                                                i = 2131298321;
                                            }
                                        } else {
                                            i = 2131297965;
                                        }
                                    } else {
                                        i = 2131297569;
                                    }
                                } else {
                                    i = 2131297505;
                                }
                            } else {
                                i = 2131297486;
                            }
                        } else {
                            i = 2131297484;
                        }
                    } else {
                        i = 2131297305;
                    }
                } else {
                    i = 2131297303;
                }
            } else {
                i = 2131296457;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        this.d = null;
        this.a.clear();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onUpdatePenerimaData(onChooseCameraEvent onchoosecameraevent) {
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) requireActivity();
        String str = onchoosecameraevent != null ? onchoosecameraevent.e : null;
        if (str != null) {
            String str2 = "";
            switch (str.hashCode()) {
                case -1843639952:
                    if (str.equals("nomorHandphone")) {
                        getView activity = getActivity();
                        if (activity != null) {
                            KliringTemp kliringTemp = ((subscribeUbahVisaCardEvent) activity).y;
                            String valueOf = String.valueOf(onchoosecameraevent.d);
                            subscribeReservationRescheduleEvent.e(valueOf, "");
                            kliringTemp.i = valueOf;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                    return;
                case -1544141433:
                    if (str.equals("beritaAcara")) {
                        getView activity2 = getActivity();
                        if (activity2 != null) {
                            KliringTemp kliringTemp2 = ((subscribeUbahVisaCardEvent) activity2).y;
                            String valueOf2 = String.valueOf(onchoosecameraevent.d);
                            subscribeReservationRescheduleEvent.e(valueOf2, "");
                            kliringTemp2.a = valueOf2;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                    return;
                case -1375230092:
                    if (str.equals("sumberDana") && !((subscribeUbahVisaCardEvent) requireActivity()).A.isEmpty()) {
                        String str3 = onchoosecameraevent.d;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        subscribeubahvisacardevent.c(str2);
                        return;
                    }
                    return;
                case -202009385:
                    if (str.equals("tanggalJatuhTempo")) {
                        subscribeubahvisacardevent.w();
                        return;
                    }
                    return;
                case 190070736:
                    if (str.equals("nomorRekening")) {
                        getView activity3 = getActivity();
                        if (activity3 != null) {
                            KliringTemp kliringTemp3 = ((subscribeUbahVisaCardEvent) activity3).y;
                            String valueOf3 = String.valueOf(onchoosecameraevent.d);
                            subscribeReservationRescheduleEvent.e(valueOf3, "");
                            kliringTemp3.h = valueOf3;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                    return;
                case 1185748487:
                    if (str.equals("penerimaDana")) {
                        getView activity4 = getActivity();
                        if (activity4 != null) {
                            KliringTemp kliringTemp4 = ((subscribeUbahVisaCardEvent) activity4).y;
                            String valueOf4 = String.valueOf(onchoosecameraevent.d);
                            subscribeReservationRescheduleEvent.e(valueOf4, "");
                            kliringTemp4.f = valueOf4;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                    return;
                case 1303768734:
                    if (str.equals("tipeNasabah")) {
                        String str4 = onchoosecameraevent.d;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        subscribeubahvisacardevent.i(str2);
                        return;
                    }
                    return;
                case 1352605167:
                    if (str.equals("tujuanTransaksi") && !((subscribeUbahVisaCardEvent) requireActivity()).E.isEmpty()) {
                        String str5 = onchoosecameraevent.d;
                        if (str5 != null) {
                            str2 = str5;
                        }
                        subscribeubahvisacardevent.f(str2);
                        return;
                    }
                    return;
                case 1644356613:
                    if (str.equals("kodeNegara")) {
                        getView activity5 = getActivity();
                        if (activity5 != null) {
                            KliringTemp kliringTemp5 = ((subscribeUbahVisaCardEvent) activity5).y;
                            String valueOf5 = String.valueOf(onchoosecameraevent.d);
                            subscribeReservationRescheduleEvent.e(valueOf5, "");
                            kliringTemp5.g = valueOf5;
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01da, code lost:
        if (r0 == null) goto L_0x01dd;
     */
    @o.Stetho$Initializer$RealSocketHandlerFactory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onUpdateWarkat(o.AgamaAdapter$AgamaVH r6) {
        /*
        // Method dump skipped, instructions count: 511
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAccountNumberOR.onUpdateWarkat(o.AgamaAdapter$AgamaVH):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        ((subscribeUbahVisaCardEvent) requireActivity()).p();
        new IconCompatParcelizer().execute(new Void[0]);
    }
}
