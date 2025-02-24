package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.data.localdb.WarkatTemp;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.HapusTransaksiWarkatDialog;
import com.bca.smartbranch.dialog.HapusWarkatBerhasilDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.presenter.BankListPresenter;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getImei.class */
public final class getImei extends BaseFragmentKotlin implements BankListPresenter.IconCompatParcelizer {
    public static final read a = new read((byte) 0);
    private boolean c;
    private ListBankPenerbitAdapter$ListBankPenerbitAdapterVH d;
    private final onChooseValueSumberPenghasilan e;
    private final onChooseValueSumberPenghasilan g;
    private final onChooseValueSumberPenghasilan h;

    /* renamed from: o */
    private Warkat f149o;
    public Map<Integer, View> b = new LinkedHashMap();
    private int k = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getImei$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<BankListPresenter> {
        public static final RemoteActionCompatParcelizer a = new RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ BankListPresenter invoke() {
            return new BankListPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getImei$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getImei$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<subscribeUbahVisaCardEvent> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write() {
            super(0);
            getImei.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ subscribeUbahVisaCardEvent invoke() {
            return (subscribeUbahVisaCardEvent) getImei.this.requireActivity();
        }
    }

    public getImei() {
        getImei$MediaBrowserCompat$CustomActionResultReceiver getimei_mediabrowsercompat_customactionresultreceiver = getImei$MediaBrowserCompat$CustomActionResultReceiver.d;
        subscribeReservationRescheduleEvent.e(getimei_mediabrowsercompat_customactionresultreceiver, "");
        this.h = new Page6KLFragment_ViewBinding(getimei_mediabrowsercompat_customactionresultreceiver, null, 2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.a;
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.g = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
        write write2 = new write();
        subscribeReservationRescheduleEvent.e(write2, "");
        this.e = new Page6KLFragment_ViewBinding(write2, null, 2);
    }

    public static /* synthetic */ void a(getImei getimei, View view) {
        subscribeReservationRescheduleEvent.e(getimei, "");
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getimei.getString(2131822348));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getimei.getParentFragmentManager(), "MessageDialog");
    }

    private final void b() {
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH listBankPenerbitAdapter$ListBankPenerbitAdapterVH = this.d;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH);
        TextView textView = listBankPenerbitAdapter$ListBankPenerbitAdapterVH.n;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append(getPromotion.a(String.valueOf(((subscribeUbahVisaCardEvent) this.e.d()).b((ArrayList<WarkatTemp>) null, true))));
        sb.append(" IDR");
        textView.setText(sb.toString());
        if (!((subscribeUbahVisaCardEvent) this.e.d()).z.isEmpty()) {
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH.d.e.setVisibility(8);
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH.b.setVisibility(0);
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH.k.setVisibility(0);
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH.f.setVisibility(0);
            setWeightSum setweightsum = listBankPenerbitAdapter$ListBankPenerbitAdapterVH.e;
            if (((subscribeUbahVisaCardEvent) this.e.d()).z.size() >= 5) {
                i = 8;
            }
            setweightsum.setVisibility(i);
            return;
        }
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.d.e.setVisibility(0);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.d.d.setVisibility(4);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.e.setVisibility(8);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.b.setVisibility(8);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.k.setVisibility(8);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH.f.setVisibility(8);
    }

    public static /* synthetic */ void b(getImei getimei, View view) {
        subscribeReservationRescheduleEvent.e(getimei, "");
        if (!((subscribeUbahVisaCardEvent) getimei.requireActivity()).z.isEmpty()) {
            ((subscribeUbahVisaCardEvent) getimei.requireActivity()).r();
            ((subscribeUbahVisaCardEvent) getimei.requireActivity()).d(2131296811, new setAccountNumberOR(), "K3KonfirmasiWarkatFragment");
        }
    }

    private final void c() {
        Bundle bundle = new Bundle();
        if (this.c) {
            BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding = new BN5PilihNomorOTPFragment_ViewBinding();
            Warkat warkat = this.f149o;
            bundle.putString("warkatDetail", warkat == null ? bN5PilihNomorOTPFragment_ViewBinding.b(onSelectNoRek.b) : bN5PilihNomorOTPFragment_ViewBinding.a(warkat, warkat.getClass()));
            bundle.putInt("warkatPosition", this.k);
            bundle.putString("warkatAction", "edit");
        } else {
            bundle.putInt("warkatPosition", ((FormBankNotesActivity_ViewBinding) this.h.d()).c());
        }
        setEmail setemail = new setEmail();
        setemail.setArguments(bundle);
        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
        e(2131296811, setemail, "K2InputWarkatFragment");
    }

    public static /* synthetic */ void c(getImei getimei, View view) {
        subscribeReservationRescheduleEvent.e(getimei, "");
        getimei.c = false;
        getimei.c();
    }

    public static /* synthetic */ void c(getImei getimei, Realm realm) {
        subscribeReservationRescheduleEvent.e(getimei, "");
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) getimei.e.d();
        if (subscribeubahvisacardevent != null) {
            RealmList<Warkat> realmList = new RealmList<>();
            ArrayList<Warkat> arrayList = subscribeubahvisacardevent.z;
            int i = 10;
            subscribeReservationRescheduleEvent.e(arrayList, "");
            if (arrayList instanceof Collection) {
                i = arrayList.size();
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (Warkat warkat : arrayList) {
                arrayList2.add(Boolean.valueOf(realmList.add(warkat)));
            }
            Kliring kliring = subscribeubahvisacardevent.m;
            if (kliring != null) {
                kliring.setListWarkat(realmList);
            }
        }
    }

    public static /* synthetic */ void e(getImei getimei, View view) {
        subscribeReservationRescheduleEvent.e(getimei, "");
        getimei.h();
        getimei.c = false;
        ((BankListPresenter) getimei.g.d()).e(getimei.g());
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void a_(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void b(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getChildFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void b_(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("imei", g().getImei());
        bundle.putString("email", g().getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getChildFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final <T> void d(T t) {
        f();
        if (t != null) {
            ((subscribeUbahVisaCardEvent) requireActivity()).a((onClickMenu) t);
            c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.data.api.response.BankListLocalResponse");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.b.clear();
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void g_() {
        h();
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void n(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) this.e.d();
        boolean z = false;
        if (subscribeubahvisacardevent != null) {
            z = false;
            if (!subscribeubahvisacardevent.p) {
                z = true;
            }
        }
        if (z) {
            i().executeTransaction(new Realm.Transaction() { // from class: o.getSessionId
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    getImei.c(getImei.this, realm);
                }
            });
        }
        ((subscribeUbahVisaCardEvent) requireActivity()).a(2131296811, new getClearingCode(), "K1DataPenerimaDataFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        documentProvider.b().c(this);
        View inflate = layoutInflater.inflate(2131493189, viewGroup, false);
        int i = 2131296377;
        setWeightSum setweightsum = (setWeightSum) setRotation.a(inflate, 2131296377);
        if (setweightsum != null) {
            Button button = (Button) setRotation.a(inflate, 2131296415);
            if (button != null) {
                setMaxHeight setmaxheight = (setMaxHeight) setRotation.a(inflate, 2131296800);
                if (setmaxheight != null) {
                    View a2 = setRotation.a(inflate, 2131297290);
                    if (a2 != null) {
                        ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding c = ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.c(a2);
                        ImageView imageView = (ImageView) setRotation.a(inflate, 2131297427);
                        if (imageView != null) {
                            TextView textView = (TextView) setRotation.a(inflate, 2131297430);
                            if (textView != null) {
                                TextView textView2 = (TextView) setRotation.a(inflate, 2131297510);
                                if (textView2 != null) {
                                    TextView textView3 = (TextView) setRotation.a(inflate, 2131297511);
                                    if (textView3 != null) {
                                        setWeightSum setweightsum2 = (setWeightSum) setRotation.a(inflate, 2131297920);
                                        if (setweightsum2 != null) {
                                            setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, 2131298344);
                                            if (setonstartentertransitionlistener != null) {
                                                TextView textView4 = (TextView) setRotation.a(inflate, 2131299683);
                                                if (textView4 != null) {
                                                    ListBankPenerbitAdapter$ListBankPenerbitAdapterVH listBankPenerbitAdapter$ListBankPenerbitAdapterVH = new ListBankPenerbitAdapter$ListBankPenerbitAdapterVH((setWeightSum) inflate, setweightsum, button, setmaxheight, c, imageView, textView, textView2, textView3, setweightsum2, setonstartentertransitionlistener, textView4);
                                                    this.d = listBankPenerbitAdapter$ListBankPenerbitAdapterVH;
                                                    subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH);
                                                    setWeightSum setweightsum3 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH.g;
                                                    subscribeReservationRescheduleEvent.d(setweightsum3, "");
                                                    return setweightsum3;
                                                }
                                                i = 2131299683;
                                            } else {
                                                i = 2131298344;
                                            }
                                        } else {
                                            i = 2131297920;
                                        }
                                    } else {
                                        i = 2131297511;
                                    }
                                } else {
                                    i = 2131297510;
                                }
                            } else {
                                i = 2131297430;
                            }
                        } else {
                            i = 2131297427;
                        }
                    } else {
                        i = 2131297290;
                    }
                } else {
                    i = 2131296800;
                }
            } else {
                i = 2131296415;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onDeleteWarkatList(TransactionCSActivity transactionCSActivity) {
        Kliring kliring;
        RealmList<Warkat> listWarkat;
        if (transactionCSActivity != null) {
            ((subscribeUbahVisaCardEvent) this.e.d()).z.remove(transactionCSActivity.e);
        }
        if (!(transactionCSActivity == null || (kliring = ((subscribeUbahVisaCardEvent) this.e.d()).m) == null || (listWarkat = kliring.getListWarkat()) == null)) {
            listWarkat.remove(transactionCSActivity.e);
        }
        if (transactionCSActivity != null) {
            FormBankNotesActivity_ViewBinding formBankNotesActivity_ViewBinding = (FormBankNotesActivity_ViewBinding) this.h.d();
            int i = transactionCSActivity.e;
            formBankNotesActivity_ViewBinding.a.c(i, 1);
            formBankNotesActivity_ViewBinding.a.d(i, 1, null);
            formBankNotesActivity_ViewBinding.a.b();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("warkatPosition", transactionCSActivity != null ? transactionCSActivity.e : -1);
        HapusWarkatBerhasilDialog hapusWarkatBerhasilDialog = new HapusWarkatBerhasilDialog();
        hapusWarkatBerhasilDialog.setArguments(bundle);
        hapusWarkatBerhasilDialog.show(getChildFragmentManager(), "HapusWarkatBerhasilDialog");
        b();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
        ((BankListPresenter) this.g.d()).b();
        this.d = null;
        this.b.clear();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onEditWarkatList(ConfirmMastercardAdapter$ViewHolder_ViewBinding confirmMastercardAdapter$ViewHolder_ViewBinding) {
        Warkat warkat = null;
        Warkat warkat2 = null;
        int i = -1;
        if (CheckOTPSessionPresenter.d(confirmMastercardAdapter$ViewHolder_ViewBinding != null ? confirmMastercardAdapter$ViewHolder_ViewBinding.c : null, "edit", false)) {
            if (confirmMastercardAdapter$ViewHolder_ViewBinding != null) {
                warkat2 = confirmMastercardAdapter$ViewHolder_ViewBinding.d;
            }
            this.f149o = warkat2;
            if (confirmMastercardAdapter$ViewHolder_ViewBinding != null) {
                i = confirmMastercardAdapter$ViewHolder_ViewBinding.e;
            }
            this.k = i;
            this.c = true;
            c();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("warkatAction", confirmMastercardAdapter$ViewHolder_ViewBinding != null ? confirmMastercardAdapter$ViewHolder_ViewBinding.c : null);
        if (confirmMastercardAdapter$ViewHolder_ViewBinding != null) {
            i = confirmMastercardAdapter$ViewHolder_ViewBinding.e;
        }
        bundle.putInt("warkatPosition", i);
        BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding = new BN5PilihNomorOTPFragment_ViewBinding();
        if (confirmMastercardAdapter$ViewHolder_ViewBinding != null) {
            warkat = confirmMastercardAdapter$ViewHolder_ViewBinding.d;
        }
        bundle.putString("warkatDetail", warkat == null ? bN5PilihNomorOTPFragment_ViewBinding.b(onSelectNoRek.b) : bN5PilihNomorOTPFragment_ViewBinding.a(warkat, warkat.getClass()));
        HapusTransaksiWarkatDialog hapusTransaksiWarkatDialog = new HapusTransaksiWarkatDialog();
        hapusTransaksiWarkatDialog.setArguments(bundle);
        hapusTransaksiWarkatDialog.show(getChildFragmentManager(), "HapusTransaksiWarkatDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        ((BankListPresenter) this.g.d()).d = this;
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH listBankPenerbitAdapter$ListBankPenerbitAdapterVH = this.d;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = listBankPenerbitAdapter$ListBankPenerbitAdapterVH.k;
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(requireContext()));
        setonstartentertransitionlistener.setAdapter((FormBankNotesActivity_ViewBinding) this.h.d());
        FormBankNotesActivity_ViewBinding formBankNotesActivity_ViewBinding = (FormBankNotesActivity_ViewBinding) this.h.d();
        ArrayList<Warkat> arrayList = ((subscribeUbahVisaCardEvent) this.e.d()).z;
        subscribeReservationRescheduleEvent.e(arrayList, "");
        formBankNotesActivity_ViewBinding.b = arrayList;
        formBankNotesActivity_ViewBinding.a.e(0, 1);
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH listBankPenerbitAdapter$ListBankPenerbitAdapterVH2 = this.d;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH2);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.d.d.setVisibility(4);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.d.m.setText(requireContext().getString(2131822347));
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.c.setOnClickListener(new View.OnClickListener() { // from class: o.UpdateTxnTellerDetailRequest

            /* loaded from: classes-dex2jar.jar:o/UpdateTxnTellerDetailRequest$InputSchema.class */
            public final /* synthetic */ class InputSchema implements View.OnClickListener {
                public final /* synthetic */ setEmail d;

                public /* synthetic */ InputSchema(setEmail setemail) {
                    this.d = setemail;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setEmail.a(this.d, view);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getImei.a(getImei.this, view2);
            }
        });
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.d.b.setOnClickListener(new View.OnClickListener() { // from class: o.getEmail
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getImei.e(getImei.this, view2);
            }
        });
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.e.setOnClickListener(new View.OnClickListener() { // from class: o.setImei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getImei.c(getImei.this, view2);
            }
        });
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH2.b.setOnClickListener(new View.OnClickListener() { // from class: o.getInputSchema
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                getImei.b(getImei.this, view2);
            }
        });
        b();
    }

    @Override // com.bca.smartbranch.presenter.BankListPresenter.IconCompatParcelizer
    public final void u(String str) {
        f();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getParentFragmentManager(), "MessageDialog");
    }
}
