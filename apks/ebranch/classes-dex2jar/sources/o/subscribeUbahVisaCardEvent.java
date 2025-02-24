package o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.BranchMapActivity;
import com.bca.smartbranch.activity.BranchMapTarikanActivity;
import com.bca.smartbranch.activity.DetailOpenTellerActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.ReservasiTellerSuccessActivity;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.KliringTemp;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.data.localdb.WarkatTemp;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DraftBerhasilDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.TipeNasabahKliringDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.ListUtil;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.onClickMenu;
import o.onClickSetun;
import o.showInfoValueTodayOR;
import retrofit2.Call;
import retrofit2.Callback;
/* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent.class */
public final class subscribeUbahVisaCardEvent extends BaseActivityPostLoginKotlin implements KliringPresenter.RemoteActionCompatParcelizer, TxnTellerPresenter.IconCompatParcelizer, GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    public static final write j = new write((byte) 0);
    private Bundle F;
    private final onChooseValueSumberPenghasilan G;
    public final onChooseValueSumberPenghasilan I;
    private boolean J;
    private boolean M;
    private boolean N;
    private final onChooseValueSumberPenghasilan O;
    private final onChooseValueSumberPenghasilan P;
    private final onChooseValueSumberPenghasilan R;
    private final onChooseValueSumberPenghasilan S;
    private ListFormTeller T;
    private TxnTellerResponse U;
    private String X;
    public Kliring f;
    public Drawable l;
    public Kliring m;
    public Drawable n;

    /* renamed from: o */
    public final onChooseValueSumberPenghasilan f295o;
    public boolean p;
    public boolean q;
    public final onChooseValueSumberPenghasilan r;
    public final onChooseValueSumberPenghasilan s;
    public boolean t;
    public final onChooseValueSumberPenghasilan u;
    public GetCustAcctListResponse v;
    public final onChooseValueSumberPenghasilan w;
    public Map<Integer, View> h = new LinkedHashMap();
    public Long k = -1L;
    private List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> H = new ArrayList();
    public KliringTemp y = new KliringTemp(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0.0d, 524287);
    public ArrayList<Warkat> z = new ArrayList<>();
    private List<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> Q = new ArrayList();
    private List<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> V = new ArrayList();
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> A = new ArrayList();
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> E = new ArrayList();
    private ArrayList<Long> L = new ArrayList<>();
    private onClickMenu K = new onClickMenu(null, 1);

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t).e;
            String str2 = ((OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) t2).e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$MediaDescriptionCompat.class */
    static final class MediaDescriptionCompat extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat() {
            super(0);
            subscribeUbahVisaCardEvent.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ Boolean invoke() {
            Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
            boolean z = false;
            if (extras != null) {
                z = extras.getBoolean("isUbahForm", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$MediaMetadataCompat.class */
    static final class MediaMetadataCompat extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<KliringPresenter> {
        public static final MediaMetadataCompat e = new MediaMetadataCompat();

        MediaMetadataCompat() {
            super(0);
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ KliringPresenter invoke() {
            return new KliringPresenter();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$RatingCompat.class */
    static final class RatingCompat extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat() {
            super(0);
            subscribeUbahVisaCardEvent.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ String invoke() {
            Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
            String string = "";
            string = extras != null ? extras.getString("token_ubah_tunda", "") : null;
            if (string == null) {
            }
            return string;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(0);
            subscribeUbahVisaCardEvent.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ Boolean invoke() {
            Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
            boolean z = false;
            if (extras != null) {
                z = extras.getBoolean("hide_save_draft", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<JenisKartuAdapter$JenisKartuVH> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read() {
            super(0);
            subscribeUbahVisaCardEvent.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ JenisKartuAdapter$JenisKartuVH invoke() {
            View inflate = subscribeUbahVisaCardEvent.this.getLayoutInflater().inflate(2131492963, (ViewGroup) null, false);
            int i = 2131296811;
            FrameLayout frameLayout = (FrameLayout) setRotation.a(inflate, 2131296811);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                View a = setRotation.a(inflate, 2131297767);
                if (a != null) {
                    ImageView imageView = (ImageView) setRotation.a(a, 2131297377);
                    int i2 = 2131297379;
                    if (imageView != null) {
                        ImageView imageView2 = (ImageView) setRotation.a(a, 2131297379);
                        if (imageView2 != null) {
                            ImageView imageView3 = (ImageView) setRotation.a(a, 2131297381);
                            if (imageView3 != null) {
                                LinearLayout linearLayout2 = (LinearLayout) a;
                                ProgressBar progressBar = (ProgressBar) setRotation.a(a, 2131298111);
                                if (progressBar != null) {
                                    ProgressBar progressBar2 = (ProgressBar) setRotation.a(a, 2131298112);
                                    if (progressBar2 != null) {
                                        TextView textView = (TextView) setRotation.a(a, 2131299276);
                                        if (textView != null) {
                                            TextView textView2 = (TextView) setRotation.a(a, 2131299277);
                                            if (textView2 != null) {
                                                TextView textView3 = (TextView) setRotation.a(a, 2131299278);
                                                if (textView3 != null) {
                                                    ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH listMultipleReservasiAdapter$ListDetailMultiTransaksiVH = new ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH(linearLayout2, imageView, imageView2, imageView3, linearLayout2, progressBar, progressBar2, textView, textView2, textView3);
                                                    LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate, 2131297768);
                                                    if (linearLayout3 != null) {
                                                        View a2 = setRotation.a(inflate, 2131298788);
                                                        if (a2 != null) {
                                                            JenisKartuAdapter$JenisKartuVH jenisKartuAdapter$JenisKartuVH = new JenisKartuAdapter$JenisKartuVH(linearLayout, frameLayout, linearLayout, listMultipleReservasiAdapter$ListDetailMultiTransaksiVH, linearLayout3, ListNegaraORAdapter$ListNegaraORAdapterVH.c(a2));
                                                            subscribeReservationRescheduleEvent.d(jenisKartuAdapter$JenisKartuVH, "");
                                                            return jenisKartuAdapter$JenisKartuVH;
                                                        }
                                                        i = 2131298788;
                                                    } else {
                                                        i = 2131297768;
                                                    }
                                                } else {
                                                    i2 = 2131299278;
                                                }
                                            } else {
                                                i2 = 2131299277;
                                            }
                                        } else {
                                            i2 = 2131299276;
                                        }
                                    } else {
                                        i2 = 2131298112;
                                    }
                                } else {
                                    i2 = 2131298111;
                                }
                            } else {
                                i2 = 2131297381;
                            }
                        }
                    } else {
                        i2 = 2131297377;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(a.getResources().getResourceName(i2)));
                }
                i = 2131297767;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public subscribeUbahVisaCardEvent() {
        read read2 = new read();
        subscribeReservationRescheduleEvent.e(read2, "");
        this.f295o = new Page6KLFragment_ViewBinding(read2, null, 2);
        subscribeUbahVisaCardEvent$MediaBrowserCompat$ItemReceiver subscribeubahvisacardevent_mediabrowsercompat_itemreceiver = new pilihNoRek<Integer>() { // from class: o.subscribeUbahVisaCardEvent$MediaBrowserCompat$ItemReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ Integer invoke() {
                Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
                return Integer.valueOf(extras != null ? extras.getInt("kliring_pos") : 0);
            }
        };
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediabrowsercompat_itemreceiver, "");
        this.w = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediabrowsercompat_itemreceiver, null, 2);
        subscribeUbahVisaCardEvent$MediaBrowserCompat$CustomActionResultReceiver subscribeubahvisacardevent_mediabrowsercompat_customactionresultreceiver = new pilihNoRek<Boolean>() { // from class: o.subscribeUbahVisaCardEvent$MediaBrowserCompat$CustomActionResultReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ Boolean invoke() {
                Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
                boolean z = false;
                if (extras != null) {
                    z = extras.getBoolean("isAutoFill", false);
                }
                return Boolean.valueOf(z);
            }
        };
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediabrowsercompat_customactionresultreceiver, "");
        this.r = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediabrowsercompat_customactionresultreceiver, null, 2);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.G = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat();
        subscribeReservationRescheduleEvent.e(mediaDescriptionCompat, "");
        this.s = new Page6KLFragment_ViewBinding(mediaDescriptionCompat, null, 2);
        subscribeUbahVisaCardEvent$MediaBrowserCompat$SearchResultReceiver subscribeubahvisacardevent_mediabrowsercompat_searchresultreceiver = new pilihNoRek<Boolean>() { // from class: o.subscribeUbahVisaCardEvent$MediaBrowserCompat$SearchResultReceiver
            @Override // o.pilihNoRek
            public final /* synthetic */ Boolean invoke() {
                Bundle extras = subscribeUbahVisaCardEvent.this.getIntent().getExtras();
                boolean z = false;
                if (extras != null) {
                    z = extras.getBoolean("isUbahFormEnabled", false);
                }
                return Boolean.valueOf(z);
            }
        };
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediabrowsercompat_searchresultreceiver, "");
        this.u = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediabrowsercompat_searchresultreceiver, null, 2);
        RatingCompat ratingCompat = new RatingCompat();
        subscribeReservationRescheduleEvent.e(ratingCompat, "");
        this.I = new Page6KLFragment_ViewBinding(ratingCompat, null, 2);
        subscribeUbahVisaCardEvent$MediaSessionCompat$ResultReceiverWrapper subscribeubahvisacardevent_mediasessioncompat_resultreceiverwrapper = subscribeUbahVisaCardEvent$MediaSessionCompat$ResultReceiverWrapper.a;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediasessioncompat_resultreceiverwrapper, "");
        this.P = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediasessioncompat_resultreceiverwrapper, null, 2);
        MediaMetadataCompat mediaMetadataCompat = MediaMetadataCompat.e;
        subscribeReservationRescheduleEvent.e(mediaMetadataCompat, "");
        this.R = new Page6KLFragment_ViewBinding(mediaMetadataCompat, null, 2);
        subscribeUbahVisaCardEvent$MediaBrowserCompat$MediaItem subscribeubahvisacardevent_mediabrowsercompat_mediaitem = subscribeUbahVisaCardEvent$MediaBrowserCompat$MediaItem.a;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediabrowsercompat_mediaitem, "");
        this.O = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediabrowsercompat_mediaitem, null, 2);
        subscribeUbahVisaCardEvent$MediaSessionCompat$Token subscribeubahvisacardevent_mediasessioncompat_token = subscribeUbahVisaCardEvent$MediaSessionCompat$Token.b;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent_mediasessioncompat_token, "");
        this.S = new Page6KLFragment_ViewBinding(subscribeubahvisacardevent_mediasessioncompat_token, null, 2);
    }

    public static /* synthetic */ int a(TxnTellerRequest.TxnDataInput txnDataInput, TxnTellerRequest.TxnDataInput txnDataInput2) {
        subscribeReservationRescheduleEvent.e(txnDataInput, "");
        subscribeReservationRescheduleEvent.e(txnDataInput2, "");
        long longValue = txnDataInput.getCreatedAt().longValue();
        Long createdAt = txnDataInput2.getCreatedAt();
        subscribeReservationRescheduleEvent.d(createdAt, "");
        return subscribeReservationRescheduleEvent.a(longValue, createdAt.longValue());
    }

    private final void a(int i) {
        if (i == 1) {
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.f.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.b.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.f.setBackgroundResource(2131231203);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.f.setTextColor(getResources().getColor(2131099772));
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setBackgroundResource(2131231202);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setTextColor(getResources().getColor(2131099815));
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setBackgroundResource(2131231202);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setTextColor(getResources().getColor(2131099815));
        } else if (i == 2) {
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.f.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.b.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.d.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setBackgroundResource(2131231203);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setTextColor(getResources().getColor(2131099772));
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setBackgroundResource(2131231202);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setTextColor(getResources().getColor(2131099815));
        } else if (i == 3) {
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.f.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.b.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.i.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.d.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setVisibility(0);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.a.setVisibility(8);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setBackgroundResource(2131231203);
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.j.setTextColor(getResources().getColor(2131099772));
        } else if (i == 4) {
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.c.setVisibility(8);
        }
    }

    private void a(Realm realm) {
        subscribeReservationRescheduleEvent.e(realm, "");
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        this.T = listFormTeller;
        if (listFormTeller != null) {
            subscribeReservationRescheduleEvent.c(listFormTeller);
            if (listFormTeller.getSetoranList() != null) {
                ListFormTeller listFormTeller2 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller2);
                if (listFormTeller2.getSetoranList().isValid()) {
                    ListFormTeller listFormTeller3 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller3);
                    listFormTeller3.getSetoranList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller4 = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller4);
            if (listFormTeller4.getTarikanList() != null) {
                ListFormTeller listFormTeller5 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller5);
                if (listFormTeller5.getTarikanList().isValid()) {
                    ListFormTeller listFormTeller6 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller6);
                    listFormTeller6.getTarikanList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller7 = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller7);
            if (listFormTeller7.getKirimanUangList() != null) {
                ListFormTeller listFormTeller8 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller8);
                if (listFormTeller8.getKirimanUangList().isValid()) {
                    ListFormTeller listFormTeller9 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller9);
                    listFormTeller9.getKirimanUangList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller10 = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller10);
            if (listFormTeller10.getKliringList() != null) {
                ListFormTeller listFormTeller11 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller11);
                if (listFormTeller11.getKliringList().isValid()) {
                    ListFormTeller listFormTeller12 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller12);
                    listFormTeller12.getKliringList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller13 = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller13);
            if (listFormTeller13.getBankTransferList() != null) {
                ListFormTeller listFormTeller14 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller14);
                if (listFormTeller14.getBankTransferList().isValid()) {
                    ListFormTeller listFormTeller15 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller15);
                    listFormTeller15.getBankTransferList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller16 = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller16);
            if (listFormTeller16.getKliringList() != null) {
                ListFormTeller listFormTeller17 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller17);
                if (listFormTeller17.getKliringList().isValid()) {
                    ListFormTeller listFormTeller18 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller18);
                    listFormTeller18.getKliringList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller19 = this.T;
            if (listFormTeller19 != null) {
                subscribeReservationRescheduleEvent.c(listFormTeller19);
                if (listFormTeller19.isValid()) {
                    ListFormTeller listFormTeller20 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller20);
                    listFormTeller20.deleteFromRealm();
                }
            }
        }
    }

    public static /* synthetic */ void a(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        RealmResults<Kliring> findAll;
        RealmList<Warkat> listWarkat;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        if (!subscribeubahvisacardevent.M && (findAll = subscribeubahvisacardevent.H().where(Kliring.class).findAll()) != null && findAll.size() > 0) {
            for (Kliring kliring : findAll) {
                if (!(kliring == null || (listWarkat = kliring.getListWarkat()) == null)) {
                    listWarkat.deleteAllFromRealm();
                }
                if (kliring != null) {
                    kliring.deleteFromRealm();
                }
            }
        }
        subscribeubahvisacardevent.a(subscribeubahvisacardevent.H());
    }

    public static /* synthetic */ void b(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        RealmQuery where = subscribeubahvisacardevent.H().where(Kliring.class);
        Kliring kliring = subscribeubahvisacardevent.m;
        Kliring kliring2 = (Kliring) where.equalTo("id", kliring != null ? Long.valueOf(kliring.getId()) : null).findFirst();
        if (kliring2 != null) {
            kliring2.getListWarkat().deleteAllFromRealm();
            kliring2.deleteFromRealm();
            documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r11 == false) goto L_0x00e2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (o.subscribeReservationRescheduleEvent.a((java.lang.Double) r6, 0.0d) == false) goto L_0x00e2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) r6, (java.lang.Object) 0) == false) goto L_0x00e2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) r6, (java.lang.Object) 0L) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final <T> T c(T r5, T r6) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.c(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* synthetic */ void c(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        RealmResults<Kliring> findAll;
        RealmList<Warkat> listWarkat;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        if (!subscribeubahvisacardevent.M && (findAll = subscribeubahvisacardevent.H().where(Kliring.class).findAll()) != null && findAll.size() > 0) {
            for (Kliring kliring : findAll) {
                if (!(kliring == null || (listWarkat = kliring.getListWarkat()) == null)) {
                    listWarkat.deleteAllFromRealm();
                }
                if (kliring != null) {
                    kliring.deleteFromRealm();
                }
            }
        }
        subscribeubahvisacardevent.a(subscribeubahvisacardevent.H());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r12 == false) goto L_0x0102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (o.subscribeReservationRescheduleEvent.a((java.lang.Double) r6, 0.0d) == false) goto L_0x0102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) r6, (java.lang.Object) 0) == false) goto L_0x0102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (o.subscribeReservationRescheduleEvent.b((java.lang.Object) r6, (java.lang.Object) 0L) == false) goto L_0x0102;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final <T> T d(T r5, T r6) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* synthetic */ void d(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        RealmList<Warkat> listWarkat;
        WarkatTemp warkatTemp;
        WarkatTemp warkatTemp2;
        WarkatTemp warkatTemp3;
        WarkatTemp warkatTemp4;
        WarkatTemp warkatTemp5;
        WarkatTemp warkatTemp6;
        WarkatTemp warkatTemp7;
        WarkatTemp warkatTemp8;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        Kliring kliring = subscribeubahvisacardevent.m;
        if (kliring != null) {
            kliring.setId(subscribeubahvisacardevent.y.d);
        }
        Kliring kliring2 = subscribeubahvisacardevent.m;
        if (kliring2 != null) {
            kliring2.setNamaPenerima(subscribeubahvisacardevent.y.f);
        }
        Kliring kliring3 = subscribeubahvisacardevent.m;
        if (kliring3 != null) {
            kliring3.setNomorRekening(subscribeubahvisacardevent.y.h);
        }
        Kliring kliring4 = subscribeubahvisacardevent.m;
        if (kliring4 != null) {
            kliring4.setKodeNegara(subscribeubahvisacardevent.y.g);
        }
        Kliring kliring5 = subscribeubahvisacardevent.m;
        if (kliring5 != null) {
            kliring5.setNomorHp(getPromotion.a(subscribeubahvisacardevent.J(), subscribeubahvisacardevent.y.i));
        }
        Kliring kliring6 = subscribeubahvisacardevent.m;
        if (kliring6 != null) {
            kliring6.setBeritaAcara(subscribeubahvisacardevent.y.a);
        }
        Kliring kliring7 = subscribeubahvisacardevent.m;
        if (kliring7 != null) {
            kliring7.setTanggalJatuhTempo(subscribeubahvisacardevent.y.k);
        }
        Kliring kliring8 = subscribeubahvisacardevent.m;
        if (kliring8 != null) {
            kliring8.setTipeNasabah(subscribeubahvisacardevent.y.f29o);
        }
        Kliring kliring9 = subscribeubahvisacardevent.m;
        if (kliring9 != null) {
            kliring9.setTipeNasabahId(subscribeubahvisacardevent.y.p);
        }
        Kliring kliring10 = subscribeubahvisacardevent.m;
        if (kliring10 != null) {
            kliring10.setSumberDana(subscribeubahvisacardevent.y.m);
        }
        Kliring kliring11 = subscribeubahvisacardevent.m;
        if (!(kliring11 == null || (listWarkat = kliring11.getListWarkat()) == null)) {
            RealmList<Warkat> realmList = listWarkat;
            int i = 10;
            subscribeReservationRescheduleEvent.e(realmList, "");
            if (realmList instanceof Collection) {
                i = realmList.size();
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Warkat warkat : realmList) {
                if (i2 >= 0) {
                    Warkat warkat2 = warkat;
                    ArrayList<WarkatTemp> arrayList2 = subscribeubahvisacardevent.y.j;
                    warkat2.setId((arrayList2 == null || (warkatTemp8 = arrayList2.get(i2)) == null) ? 0 : warkatTemp8.a);
                    ArrayList<WarkatTemp> arrayList3 = subscribeubahvisacardevent.y.j;
                    warkat2.setNomorWarkat((arrayList3 == null || (warkatTemp7 = arrayList3.get(i2)) == null) ? null : warkatTemp7.f);
                    ArrayList<WarkatTemp> arrayList4 = subscribeubahvisacardevent.y.j;
                    warkat2.setNamaBank((arrayList4 == null || (warkatTemp6 = arrayList4.get(i2)) == null) ? null : warkatTemp6.g);
                    ArrayList<WarkatTemp> arrayList5 = subscribeubahvisacardevent.y.j;
                    warkat2.setKodeBank((arrayList5 == null || (warkatTemp5 = arrayList5.get(i2)) == null) ? null : warkatTemp5.d);
                    ArrayList<WarkatTemp> arrayList6 = subscribeubahvisacardevent.y.j;
                    warkat2.setLocalClearingCodeBank((arrayList6 == null || (warkatTemp4 = arrayList6.get(i2)) == null) ? null : warkatTemp4.j);
                    ArrayList<WarkatTemp> arrayList7 = subscribeubahvisacardevent.y.j;
                    warkat2.setJenisWarkat((arrayList7 == null || (warkatTemp3 = arrayList7.get(i2)) == null) ? null : warkatTemp3.e);
                    ArrayList<WarkatTemp> arrayList8 = subscribeubahvisacardevent.y.j;
                    warkat2.setKodeJenisWarkat((arrayList8 == null || (warkatTemp2 = arrayList8.get(i2)) == null) ? null : warkatTemp2.c);
                    ArrayList<WarkatTemp> arrayList9 = subscribeubahvisacardevent.y.j;
                    warkat2.setNominal((arrayList9 == null || (warkatTemp = arrayList9.get(i2)) == null) ? null : Double.valueOf(warkatTemp.h));
                    ArrayList<WarkatTemp> arrayList10 = subscribeubahvisacardevent.y.j;
                    String str = null;
                    if (arrayList10 != null) {
                        WarkatTemp warkatTemp9 = arrayList10.get(i2);
                        str = null;
                        if (warkatTemp9 != null) {
                            str = warkatTemp9.b;
                        }
                    }
                    warkat2.setJatuhTempo(str);
                    arrayList.add(onCLickStatusNpwp.e);
                    i2++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
        Kliring kliring12 = subscribeubahvisacardevent.m;
        if (kliring12 != null) {
            kliring12.setTotalWarkat(subscribeubahvisacardevent.y.r);
        }
        Kliring kliring13 = subscribeubahvisacardevent.m;
        if (kliring13 != null) {
            kliring13.setTujuanTransaksi(subscribeubahvisacardevent.y.s);
        }
        Kliring kliring14 = subscribeubahvisacardevent.m;
        if (kliring14 != null) {
            kliring14.setTujuanTransaksiCode(subscribeubahvisacardevent.y.t);
        }
        Kliring kliring15 = subscribeubahvisacardevent.m;
        if (kliring15 != null) {
            kliring15.setSumberDanaCode(subscribeubahvisacardevent.y.l);
        }
        Kliring kliring16 = subscribeubahvisacardevent.m;
        if (kliring16 != null) {
            kliring16.setAccType(subscribeubahvisacardevent.y.b);
        }
        Kliring kliring17 = subscribeubahvisacardevent.m;
        if (kliring17 != null) {
            kliring17.setSaranaPembayaranPengirim(subscribeubahvisacardevent.y.n);
        }
        Kliring kliring18 = subscribeubahvisacardevent.m;
        if (kliring18 != null) {
            kliring18.setCreatedAt(subscribeubahvisacardevent.y.e);
        }
        Kliring kliring19 = subscribeubahvisacardevent.m;
        if (kliring19 != null) {
            kliring19.setCurrentPage(subscribeubahvisacardevent.y.c);
        }
        Kliring kliring20 = subscribeubahvisacardevent.m;
        if (kliring20 != null) {
            kliring20.setSequenceId(((Number) subscribeubahvisacardevent.w.d()).intValue());
        }
    }

    public static void e(Editable editable, EditText editText, TextWatcher textWatcher, onClickInfo<? super String, ? super Double, onCLickStatusNpwp> onclickinfo) {
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(textWatcher, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        Editable text = editText.getText();
        boolean z = true;
        if (text == null || text.length() == 0) {
            onclickinfo.invoke("", Double.valueOf(0.0d));
        } else if (editable == editText.getEditableText()) {
            editText.removeTextChangedListener(textWatcher);
            String c = getPromotion.c(CheckOTPSessionPresenter.a(editText.getText().toString(), ",", "", false), 12, 2);
            subscribeReservationRescheduleEvent.d(c, "");
            String str = c;
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                String replace = c.replace(",", "");
                subscribeReservationRescheduleEvent.d(replace, "");
                onclickinfo.invoke(c, Double.valueOf(Double.parseDouble(replace)));
            }
            editText.setText(str);
            editText.setSelection(editText.length());
            editText.addTextChangedListener(textWatcher);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032e  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void e(o.subscribeUbahVisaCardEvent r7, io.realm.Realm r8) {
        /*
        // Method dump skipped, instructions count: 5347
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.e(o.subscribeUbahVisaCardEvent, io.realm.Realm):void");
    }

    private final void e(boolean z, String str) {
        TxnTellerResponse txnTellerResponse;
        TxnTellerPresenter txnTellerPresenter = (TxnTellerPresenter) this.P.d();
        txnTellerPresenter.d.b(txnTellerPresenter.c);
        if (!this.M && (txnTellerResponse = this.U) != null) {
            subscribeReservationRescheduleEvent.c(txnTellerResponse);
            String noReff = txnTellerResponse.getTxnDataOutput().getNoReff();
            String str2 = "";
            subscribeReservationRescheduleEvent.d(noReff, "");
            TxnTellerResponse txnTellerResponse2 = this.U;
            subscribeReservationRescheduleEvent.c(txnTellerResponse2);
            if (txnTellerResponse2.getTxnDataOutput().getDescriptionList() != null) {
                TxnTellerResponse txnTellerResponse3 = this.U;
                subscribeReservationRescheduleEvent.c(txnTellerResponse3);
                txnTellerResponse3.getTxnDataOutput().getDescriptionList().get(0).getKey();
            }
            TxnTellerResponse txnTellerResponse4 = this.U;
            subscribeReservationRescheduleEvent.c(txnTellerResponse4);
            if (txnTellerResponse4.getTxnDataOutput().getDescriptionList() != null) {
                TxnTellerResponse txnTellerResponse5 = this.U;
                subscribeReservationRescheduleEvent.c(txnTellerResponse5);
                txnTellerResponse5.getTxnDataOutput().getDescriptionList().get(0).getValue();
            }
            TxnTellerResponse txnTellerResponse6 = this.U;
            subscribeReservationRescheduleEvent.c(txnTellerResponse6);
            subscribeReservationRescheduleEvent.d(txnTellerResponse6.getTxnDataOutput().getNote(), "");
            if (J() != null) {
                str2 = J().getEmail();
            }
            if (this.q) {
                Reservation reservation = new Reservation();
                reservation.setTypeTransaction("Transaksi Teller");
                reservation.setTypeReservation("NEW_RESERVATION");
                reservation.setTxnType("Transaksi Teller");
                reservation.setNoReff(noReff);
                reservation.setTnxStatus("8");
                reservation.setTransactionCode(this.X);
                Intent intent = new Intent(this, BranchMapActivity.class);
                intent.putExtra("reff_no", reservation.getNoReff());
                intent.putExtra("type_transaksi", reservation.getTypeTransaction());
                intent.putExtra("type_reservation", reservation.getTypeReservation());
                intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
                TxnTellerResponse txnTellerResponse7 = this.U;
                subscribeReservationRescheduleEvent.c(txnTellerResponse7);
                intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(txnTellerResponse7.getTxnDataOutput()));
                intent.putExtra("is_tartun_jumbes", this.N);
                startActivity(intent);
                setOnHierarchyChangeListener.d((Activity) this);
                return;
            }
            Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
            TxnTellerResponse txnTellerResponse8 = this.U;
            subscribeReservationRescheduleEvent.c(txnTellerResponse8);
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse8.getTxnDataOutput()));
            intent2.putExtra("email", str2);
            intent2.putExtra("no_reff", noReff);
            if (z) {
                intent2.putExtra("email_success", str);
            }
            startActivity(intent2);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v172, types: [io.realm.RealmModel, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void g(o.subscribeUbahVisaCardEvent r4, io.realm.Realm r5) {
        /*
        // Method dump skipped, instructions count: 1303
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.g(o.subscribeUbahVisaCardEvent, io.realm.Realm):void");
    }

    public static /* synthetic */ void h(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        subscribeubahvisacardevent.T = listFormTeller;
        if (listFormTeller == null) {
            subscribeubahvisacardevent.T = (ListFormTeller) realm.createObject(ListFormTeller.class, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static /* synthetic */ void j(subscribeUbahVisaCardEvent subscribeubahvisacardevent, Realm realm) {
        RealmList<Kliring> kliringList;
        RealmList<BankTransfer> bankTransferList;
        RealmList<Tarikan> tarikanList;
        RealmList<Tarikan> tarikanList2;
        RealmList<Setoran> setoranList;
        subscribeReservationRescheduleEvent.e(subscribeubahvisacardevent, "");
        subscribeReservationRescheduleEvent.e(realm, "");
        subscribeubahvisacardevent.T = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        StringBuilder sb = new StringBuilder();
        new ArrayList();
        ListFormTeller listFormTeller = subscribeubahvisacardevent.T;
        RealmList<Tarikan> realmList = null;
        if ((listFormTeller == null || (setoranList = listFormTeller.getSetoranList()) == null) ? false : setoranList.isEmpty()) {
            ListFormTeller listFormTeller2 = subscribeubahvisacardevent.T;
            RealmList<Setoran> setoranList2 = listFormTeller2 != null ? listFormTeller2.getSetoranList() : null;
            subscribeReservationRescheduleEvent.c(setoranList2);
            Iterator<Setoran> it = setoranList2.iterator();
            while (it.hasNext()) {
                it.next();
                String obj = sb.toString();
                subscribeReservationRescheduleEvent.d(obj, "");
                if (!(obj.length() == 0)) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.SETORAN_TUNAI);
            }
        }
        ListFormTeller listFormTeller3 = subscribeubahvisacardevent.T;
        if ((listFormTeller3 == null || (tarikanList2 = listFormTeller3.getTarikanList()) == null) ? false : tarikanList2.isEmpty()) {
            ListFormTeller listFormTeller4 = subscribeubahvisacardevent.T;
            RealmList<Tarikan> tarikanList3 = listFormTeller4 != null ? listFormTeller4.getTarikanList() : null;
            subscribeReservationRescheduleEvent.c(tarikanList3);
            Iterator<Tarikan> it2 = tarikanList3.iterator();
            while (it2.hasNext()) {
                it2.next();
                String obj2 = sb.toString();
                subscribeReservationRescheduleEvent.d(obj2, "");
                if (!(obj2.length() == 0)) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.TARIKAN_TUNAI);
            }
        }
        ListFormTeller listFormTeller5 = subscribeubahvisacardevent.T;
        if ((listFormTeller5 == null || (tarikanList = listFormTeller5.getTarikanList()) == null) ? false : tarikanList.isEmpty()) {
            ListFormTeller listFormTeller6 = subscribeubahvisacardevent.T;
            RealmList<KirimanUang> kirimanUangList = listFormTeller6 != null ? listFormTeller6.getKirimanUangList() : null;
            subscribeReservationRescheduleEvent.c(kirimanUangList);
            Iterator<KirimanUang> it3 = kirimanUangList.iterator();
            while (it3.hasNext()) {
                it3.next();
                String obj3 = sb.toString();
                subscribeReservationRescheduleEvent.d(obj3, "");
                if (!(obj3.length() == 0)) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.OUTWARD_REMITTANCE);
            }
        }
        ListFormTeller listFormTeller7 = subscribeubahvisacardevent.T;
        if ((listFormTeller7 == null || (bankTransferList = listFormTeller7.getBankTransferList()) == null) ? false : bankTransferList.isEmpty()) {
            ListFormTeller listFormTeller8 = subscribeubahvisacardevent.T;
            RealmList<BankTransfer> bankTransferList2 = listFormTeller8 != null ? listFormTeller8.getBankTransferList() : null;
            subscribeReservationRescheduleEvent.c(bankTransferList2);
            Iterator<BankTransfer> it4 = bankTransferList2.iterator();
            while (it4.hasNext()) {
                it4.next();
                String obj4 = sb.toString();
                subscribeReservationRescheduleEvent.d(obj4, "");
                if (!(obj4.length() == 0)) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.KIRIMAN_UANG);
            }
        }
        ListFormTeller listFormTeller9 = subscribeubahvisacardevent.T;
        if ((listFormTeller9 == null || (kliringList = listFormTeller9.getKliringList()) == null) ? false : kliringList.isEmpty()) {
            ListFormTeller listFormTeller10 = subscribeubahvisacardevent.T;
            RealmList<Kliring> kliringList2 = listFormTeller10 != null ? listFormTeller10.getKliringList() : null;
            subscribeReservationRescheduleEvent.c(kliringList2);
            Iterator<Kliring> it5 = kliringList2.iterator();
            while (it5.hasNext()) {
                it5.next();
                String obj5 = sb.toString();
                subscribeReservationRescheduleEvent.d(obj5, "");
                if (!(obj5.length() == 0)) {
                    sb.append(",");
                }
                sb.append(ReservasiOnline.KLIRING);
            }
        }
        subscribeubahvisacardevent.X = sb.toString();
        ListFormTeller listFormTeller11 = subscribeubahvisacardevent.T;
        if ((listFormTeller11 != null ? listFormTeller11.getTarikanList() : null) != null) {
            ListFormTeller listFormTeller12 = subscribeubahvisacardevent.T;
            RealmList<Tarikan> tarikanList4 = listFormTeller12 != null ? listFormTeller12.getTarikanList() : null;
            subscribeReservationRescheduleEvent.c(tarikanList4);
            if (!tarikanList4.isEmpty()) {
                ListFormTeller listFormTeller13 = subscribeubahvisacardevent.T;
                if (listFormTeller13 != null) {
                    realmList = listFormTeller13.getTarikanList();
                }
                subscribeReservationRescheduleEvent.c(realmList);
                Iterator<Tarikan> it6 = realmList.iterator();
                while (it6.hasNext()) {
                    Tarikan next = it6.next();
                    String jumlah = next.getJumlah();
                    subscribeReservationRescheduleEvent.d(jumlah, "");
                    String jumlah2 = jumlah.length() == 0 ? "0" : next.getJumlah();
                    subscribeReservationRescheduleEvent.d(jumlah2, "");
                    if (Long.parseLong(jumlah2) > 100000000) {
                        subscribeubahvisacardevent.N = true;
                    }
                }
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).c;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = "KliringActivity";
        h("KliringActivity");
    }

    public final void a(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
        getuservisiblehint.e(2130772009, 2130772012);
        subscribeReservationRescheduleEvent.c(fragment);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.c();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        E();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        try {
            e(false, str2);
        } catch (IllegalStateException e) {
        }
    }

    public final void a(onClickMenu onclickmenu) {
        subscribeReservationRescheduleEvent.e(onclickmenu, "");
        onClickMenu.read read2 = onClickMenu.a;
        List<onClickMenu.write> list = onclickmenu.c;
        PenerimaFragment penerimaFragment = list;
        if (list == null) {
            penerimaFragment = PenerimaFragment.b;
        }
        List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> e = onClickMenu.read.e(penerimaFragment);
        subscribeReservationRescheduleEvent.e(e, "");
        ArrayList arrayList = new ArrayList(e);
        if (arrayList.size() > 1) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            subscribeReservationRescheduleEvent.e(arrayList, "");
            subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, iconCompatParcelizer);
            }
        }
        this.H = arrayList;
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        E();
        Bundle bundle = new Bundle();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        bundle.putString("MessageDialogContent", str2);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [double] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final double b(java.util.ArrayList<com.bca.smartbranch.data.localdb.WarkatTemp> r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.b(java.util.ArrayList, boolean):double");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
        E();
        this.v = getCustAcctListResponse;
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
        E();
        H().executeTransaction(new Realm.Transaction() { // from class: o.onGetHBEvent
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                subscribeUbahVisaCardEvent.c(subscribeUbahVisaCardEvent.this, realm);
            }
        });
        if (this.M) {
            DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
            draftBerhasilDialog.a = "transaction_teller";
            draftBerhasilDialog.show(l(), "DraftBerhasilDialog");
        } else if (txnTellerResponse != null) {
            Intent intent = new Intent(this, ReservasiTellerSuccessActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse));
            bundle.putBoolean("is_single_process", true);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Response Kliring null", 1).show();
        }
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b_(String str) {
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
        onCLickStatusNpwp onclickstatusnpwp;
        RealmList<Warkat> listWarkat;
        RealmList<Warkat> listWarkat2;
        Warkat warkat;
        RealmList<Warkat> listWarkat3;
        Warkat warkat2;
        RealmList<Warkat> listWarkat4;
        Warkat warkat3;
        RealmList<Warkat> listWarkat5;
        Warkat warkat4;
        RealmList<Warkat> listWarkat6;
        Warkat warkat5;
        RealmList<Warkat> listWarkat7;
        Warkat warkat6;
        RealmList<Warkat> listWarkat8;
        Warkat warkat7;
        RealmList<Warkat> listWarkat9;
        Warkat warkat8;
        RealmList<Warkat> listWarkat10;
        Warkat warkat9;
        RealmList<Warkat> listWarkat11;
        RealmList<Warkat> listWarkat12;
        Warkat warkat10;
        RealmList<Warkat> listWarkat13;
        Warkat warkat11;
        RealmList<Warkat> listWarkat14;
        Warkat warkat12;
        RealmList<Warkat> listWarkat15;
        Warkat warkat13;
        RealmList<Warkat> listWarkat16;
        Warkat warkat14;
        RealmList<Warkat> listWarkat17;
        Warkat warkat15;
        RealmList<Warkat> listWarkat18;
        Warkat warkat16;
        RealmList<Warkat> listWarkat19;
        Warkat warkat17;
        RealmList<Warkat> listWarkat20;
        Warkat warkat18;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        Parcelable parcelable5;
        c(bundle);
        invalidateOptionsMenu();
        ((KliringPresenter) this.R.d()).d = this;
        ((TxnTellerPresenter) this.P.d()).d = this;
        ((GetHBPresenter) this.O.d()).e = this;
        ((SendEmailTransactionSuccessPresenter) this.S.d()).b = this;
        this.F = getIntent().getExtras();
        H().executeTransaction(new Realm.Transaction() { // from class: o.CC8FormKartuKreditActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                subscribeUbahVisaCardEvent.h(subscribeUbahVisaCardEvent.this, realm);
            }
        });
        Bundle bundle2 = this.F;
        if (!(bundle2 == null || (parcelable5 = bundle2.getParcelable("SUMBER_DANA")) == null)) {
            Object a = ListUtil.OneItemImmutableList.a(parcelable5);
            subscribeReservationRescheduleEvent.d(a, "");
            this.Q = (List) a;
        }
        Bundle bundle3 = this.F;
        if (!(bundle3 == null || (parcelable4 = bundle3.getParcelable("TUJUAN_TRANSAKSI")) == null)) {
            Object a2 = ListUtil.OneItemImmutableList.a(parcelable4);
            subscribeReservationRescheduleEvent.d(a2, "");
            this.V = (List) a2;
        }
        Bundle bundle4 = this.F;
        if (!(bundle4 == null || (parcelable3 = bundle4.getParcelable("AVAILABLE_DATE")) == null)) {
            Object a3 = ListUtil.OneItemImmutableList.a(parcelable3);
            subscribeReservationRescheduleEvent.d(a3, "");
            this.L = (ArrayList) a3;
        }
        Bundle bundle5 = this.F;
        if (!(bundle5 == null || (parcelable2 = bundle5.getParcelable("Kliring_first_row")) == null)) {
            this.f = (Kliring) ListUtil.OneItemImmutableList.a(parcelable2);
        }
        Bundle bundle6 = this.F;
        if (!(bundle6 == null || (parcelable = bundle6.getParcelable("BANK_LOCAL_LIST")) == null)) {
            Object a4 = ListUtil.OneItemImmutableList.a(parcelable);
            subscribeReservationRescheduleEvent.d(a4, "");
            onClickMenu onclickmenu = (onClickMenu) a4;
            this.K = onclickmenu;
            a(onclickmenu);
        }
        Bundle bundle7 = this.F;
        this.p = bundle7 != null && bundle7.getBoolean("is_from_reservation", false);
        Bundle bundle8 = this.F;
        String str = null;
        this.k = bundle8 != null ? Long.valueOf(bundle8.getLong("id_reservation", 0)) : null;
        Bundle bundle9 = this.F;
        this.J = bundle9 != null && bundle9.getBoolean("is_draft", false);
        if (J().getVerified().equals("Y")) {
            GetCustAcctListResponse getCustAcctListResponse = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("list_acct"));
            this.v = getCustAcctListResponse;
            if (getCustAcctListResponse == null) {
                KliringPresenter kliringPresenter = (KliringPresenter) this.R.d();
                User J = J();
                subscribeReservationRescheduleEvent.e(J, "");
                kliringPresenter.c = J;
                kliringPresenter.e = getPromotion.e(J);
                if (subscribeReservationRescheduleEvent.b((Object) J.getVerified(), (Object) "Y")) {
                    KliringPresenter.RemoteActionCompatParcelizer remoteActionCompatParcelizer = kliringPresenter.d;
                    subscribeReservationRescheduleEvent.c(remoteActionCompatParcelizer);
                    remoteActionCompatParcelizer.g_();
                    setIncomeDisplayAmount setincomedisplayamount = kliringPresenter.apiService;
                    if (setincomedisplayamount == null) {
                        subscribeReservationRescheduleEvent.e("");
                        setincomedisplayamount = null;
                    }
                    String str2 = kliringPresenter.e;
                    User user = kliringPresenter.c;
                    Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b = setincomedisplayamount.b(str2, user != null ? user.getEmail() : null, "Kliring");
                    kliringPresenter.b = b;
                    if (b != null) {
                        b.enqueue((Callback) new KliringPresenter.IconCompatParcelizer());
                    }
                }
            }
        }
        b(((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).j.b);
        i();
        setBackgroundResource i = i();
        if (i != null) {
            i.d(true);
        }
        setBackgroundResource i2 = i();
        if (i2 != null) {
            i2.d("");
        }
        ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).j.c.setText(getResources().getString(2131821802));
        Drawable drawable = getResources().getDrawable(2131231203, null);
        subscribeReservationRescheduleEvent.d(drawable, "");
        subscribeReservationRescheduleEvent.e(drawable, "");
        this.n = drawable;
        Drawable drawable2 = getResources().getDrawable(2131231202, null);
        subscribeReservationRescheduleEvent.d(drawable2, "");
        subscribeReservationRescheduleEvent.e(drawable2, "");
        this.l = drawable2;
        if (((Boolean) this.s.d()).booleanValue()) {
            ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.c.setVisibility(8);
        }
        double d = 0.0d;
        int i3 = 10;
        if (this.J) {
            RealmQuery where = H().where(Kliring.class);
            Bundle bundle10 = this.F;
            subscribeReservationRescheduleEvent.c(bundle10);
            Kliring kliring = (Kliring) where.equalTo("id", Long.valueOf(bundle10.getLong("transaksi_kliring_id", 0))).findFirst();
            if (kliring != null) {
                Kliring kliring2 = new Kliring();
                this.m = kliring2;
                long id = kliring.getId();
                Kliring kliring3 = this.f;
                Long l = (Long) c(Long.valueOf(id), kliring3 != null ? Long.valueOf(kliring3.getId()) : null);
                kliring2.setId(l != null ? l.longValue() : 0);
                String namaPenerima = kliring.getNamaPenerima();
                if (J().getVerified().equals("Y")) {
                    namaPenerima = J().getName();
                }
                Kliring kliring4 = this.m;
                if (kliring4 != null) {
                    Kliring kliring5 = this.f;
                    kliring4.setNamaPenerima((String) c(namaPenerima, kliring5 != null ? kliring5.getNamaPenerima() : null));
                }
                Kliring kliring6 = this.m;
                if (kliring6 != null) {
                    String nomorRekening = kliring.getNomorRekening();
                    Kliring kliring7 = this.f;
                    kliring6.setNomorRekening((String) c(nomorRekening, kliring7 != null ? kliring7.getNomorRekening() : null));
                }
                Kliring kliring8 = this.m;
                if (kliring8 != null) {
                    String kodeNegara = kliring.getKodeNegara();
                    Kliring kliring9 = this.f;
                    kliring8.setKodeNegara((String) c(kodeNegara, kliring9 != null ? kliring9.getKodeNegara() : null));
                }
                Kliring kliring10 = this.m;
                if (kliring10 != null) {
                    String a5 = getPromotion.a(J(), kliring.getNomorHp());
                    User J2 = J();
                    Kliring kliring11 = this.f;
                    kliring10.setNomorHp((String) c(a5, getPromotion.a(J2, kliring11 != null ? kliring11.getNomorHp() : null)));
                }
                Kliring kliring12 = this.m;
                if (kliring12 != null) {
                    String beritaAcara = kliring.getBeritaAcara();
                    Kliring kliring13 = this.f;
                    kliring12.setBeritaAcara((String) c(beritaAcara, kliring13 != null ? kliring13.getBeritaAcara() : null));
                }
                Kliring kliring14 = this.m;
                if (kliring14 != null) {
                    String tanggalJatuhTempo = kliring.getTanggalJatuhTempo();
                    Kliring kliring15 = this.f;
                    kliring14.setTanggalJatuhTempo((String) c(tanggalJatuhTempo, kliring15 != null ? kliring15.getTanggalJatuhTempo() : null));
                }
                String tipeNasabah = kliring.getTipeNasabah();
                Kliring kliring16 = this.f;
                String str3 = (String) c(tipeNasabah, kliring16 != null ? kliring16.getTipeNasabah() : null);
                String tipeNasabahId = kliring.getTipeNasabahId();
                Kliring kliring17 = this.f;
                String str4 = (String) c(tipeNasabahId, kliring17 != null ? kliring17.getTipeNasabahId() : null);
                if (subscribeReservationRescheduleEvent.b((Object) J().getVerified(), (Object) "Y")) {
                    str3 = "Individu";
                    str4 = "0";
                }
                Kliring kliring18 = this.m;
                if (kliring18 != null) {
                    kliring18.setTipeNasabah(str3);
                }
                Kliring kliring19 = this.m;
                if (kliring19 != null) {
                    kliring19.setTipeNasabahId(str4);
                }
                Kliring kliring20 = this.m;
                if (kliring20 != null) {
                    String sumberDana = kliring.getSumberDana();
                    Kliring kliring21 = this.f;
                    kliring20.setSumberDana((String) c(sumberDana, kliring21 != null ? kliring21.getSumberDana() : null));
                }
                RealmList<Warkat> listWarkat21 = kliring.getListWarkat();
                subscribeReservationRescheduleEvent.d(listWarkat21, "");
                RealmList<Warkat> realmList = listWarkat21;
                subscribeReservationRescheduleEvent.e(realmList, "");
                if (realmList instanceof Collection) {
                    i3 = realmList.size();
                }
                ArrayList arrayList = new ArrayList(i3);
                int i4 = 0;
                for (Warkat warkat19 : realmList) {
                    if (i4 >= 0) {
                        Warkat warkat20 = warkat19;
                        Warkat warkat21 = new Warkat();
                        long id2 = warkat20.getId();
                        Kliring kliring22 = this.f;
                        Long l2 = (Long) d(Long.valueOf(id2), (kliring22 == null || (listWarkat20 = kliring22.getListWarkat()) == null || (warkat18 = listWarkat20.get(i4)) == null) ? null : Long.valueOf(warkat18.getId()));
                        warkat21.setId(l2 != null ? l2.longValue() : 0);
                        String nomorWarkat = warkat20.getNomorWarkat();
                        Kliring kliring23 = this.f;
                        warkat21.setNomorWarkat((String) d(nomorWarkat, (kliring23 == null || (listWarkat19 = kliring23.getListWarkat()) == null || (warkat17 = listWarkat19.get(i4)) == null) ? null : warkat17.getNomorWarkat()));
                        String namaBank = warkat20.getNamaBank();
                        Kliring kliring24 = this.f;
                        warkat21.setNamaBank((String) d(namaBank, (kliring24 == null || (listWarkat18 = kliring24.getListWarkat()) == null || (warkat16 = listWarkat18.get(i4)) == null) ? null : warkat16.getNamaBank()));
                        String kodeBank = warkat20.getKodeBank();
                        Kliring kliring25 = this.f;
                        warkat21.setKodeBank((String) d(kodeBank, (kliring25 == null || (listWarkat17 = kliring25.getListWarkat()) == null || (warkat15 = listWarkat17.get(i4)) == null) ? null : warkat15.getKodeBank()));
                        String localClearingCodeBank = warkat20.getLocalClearingCodeBank();
                        Kliring kliring26 = this.f;
                        warkat21.setLocalClearingCodeBank((String) d(localClearingCodeBank, (kliring26 == null || (listWarkat16 = kliring26.getListWarkat()) == null || (warkat14 = listWarkat16.get(i4)) == null) ? null : warkat14.getLocalClearingCodeBank()));
                        String jenisWarkat = warkat20.getJenisWarkat();
                        Kliring kliring27 = this.f;
                        warkat21.setJenisWarkat((String) d(jenisWarkat, (kliring27 == null || (listWarkat15 = kliring27.getListWarkat()) == null || (warkat13 = listWarkat15.get(i4)) == null) ? null : warkat13.getJenisWarkat()));
                        String kodeJenisWarkat = warkat20.getKodeJenisWarkat();
                        Kliring kliring28 = this.f;
                        warkat21.setKodeJenisWarkat((String) d(kodeJenisWarkat, (kliring28 == null || (listWarkat14 = kliring28.getListWarkat()) == null || (warkat12 = listWarkat14.get(i4)) == null) ? null : warkat12.getKodeJenisWarkat()));
                        Double nominal = warkat20.getNominal();
                        Kliring kliring29 = this.f;
                        warkat21.setNominal((Double) d(nominal, (kliring29 == null || (listWarkat13 = kliring29.getListWarkat()) == null || (warkat11 = listWarkat13.get(i4)) == null) ? null : warkat11.getNominal()));
                        String jatuhTempo = warkat20.getJatuhTempo();
                        Kliring kliring30 = this.f;
                        warkat21.setJatuhTempo((String) d(jatuhTempo, (kliring30 == null || (listWarkat12 = kliring30.getListWarkat()) == null || (warkat10 = listWarkat12.get(i4)) == null) ? null : warkat10.getJatuhTempo()));
                        onCLickStatusNpwp onclickstatusnpwp2 = onCLickStatusNpwp.e;
                        this.z.add(warkat21);
                        Kliring kliring31 = this.m;
                        arrayList.add((kliring31 == null || (listWarkat11 = kliring31.getListWarkat()) == null) ? null : Boolean.valueOf(listWarkat11.add(warkat21)));
                        i4++;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                Kliring kliring32 = this.m;
                if (kliring32 != null) {
                    double totalWarkat = kliring.getTotalWarkat();
                    Kliring kliring33 = this.f;
                    Double d2 = (Double) c(Double.valueOf(totalWarkat), kliring33 != null ? Double.valueOf(kliring33.getTotalWarkat()) : null);
                    if (d2 != null) {
                        d = d2.doubleValue();
                    }
                    kliring32.setTotalWarkat(d);
                }
                Kliring kliring34 = this.m;
                if (kliring34 != null) {
                    String tujuanTransaksi = kliring.getTujuanTransaksi();
                    Kliring kliring35 = this.f;
                    kliring34.setTujuanTransaksi((String) c(tujuanTransaksi, kliring35 != null ? kliring35.getTujuanTransaksi() : null));
                }
                Kliring kliring36 = this.m;
                if (kliring36 != null) {
                    String tujuanTransaksiCode = kliring.getTujuanTransaksiCode();
                    Kliring kliring37 = this.f;
                    kliring36.setTujuanTransaksiCode((String) c(tujuanTransaksiCode, kliring37 != null ? kliring37.getTujuanTransaksiCode() : null));
                }
                Kliring kliring38 = this.m;
                if (kliring38 != null) {
                    String sumberDanaCode = kliring.getSumberDanaCode();
                    Kliring kliring39 = this.f;
                    kliring38.setSumberDanaCode((String) c(sumberDanaCode, kliring39 != null ? kliring39.getSumberDanaCode() : null));
                }
                Kliring kliring40 = this.m;
                if (kliring40 != null) {
                    String accType = kliring.getAccType();
                    Kliring kliring41 = this.f;
                    kliring40.setAccType((String) c(accType, kliring41 != null ? kliring41.getAccType() : null));
                }
                Kliring kliring42 = this.m;
                if (kliring42 != null) {
                    String saranaPembayaranPengirim = kliring.getSaranaPembayaranPengirim();
                    Kliring kliring43 = this.f;
                    kliring42.setSaranaPembayaranPengirim((String) c(saranaPembayaranPengirim, kliring43 != null ? kliring43.getSaranaPembayaranPengirim() : null));
                }
                Kliring kliring44 = this.m;
                if (kliring44 != null) {
                    long createdAt = kliring.getCreatedAt();
                    Kliring kliring45 = this.f;
                    Long l3 = (Long) c(Long.valueOf(createdAt), kliring45 != null ? Long.valueOf(kliring45.getCreatedAt()) : null);
                    kliring44.setCreatedAt(l3 != null ? l3.longValue() : 0);
                }
                Kliring kliring46 = this.m;
                if (kliring46 != null) {
                    String currentPage = kliring.getCurrentPage();
                    Kliring kliring47 = this.f;
                    kliring46.setCurrentPage((String) c(currentPage, kliring47 != null ? kliring47.getCurrentPage() : null));
                }
                onCLickStatusNpwp onclickstatusnpwp3 = onCLickStatusNpwp.e;
                onCLickStatusNpwp onclickstatusnpwp4 = onCLickStatusNpwp.e;
            }
        } else {
            this.m = new Kliring();
            if (this.p) {
                Kliring kliring48 = (Kliring) H().where(Kliring.class).equalTo("id", this.k).findFirst();
                if (kliring48 != null) {
                    Kliring kliring49 = this.m;
                    if (kliring49 != null) {
                        long id3 = kliring48.getId();
                        Kliring kliring50 = this.f;
                        Long l4 = (Long) c(Long.valueOf(id3), kliring50 != null ? Long.valueOf(kliring50.getId()) : null);
                        kliring49.setId(l4 != null ? l4.longValue() : 0);
                    }
                    Kliring kliring51 = this.m;
                    if (kliring51 != null) {
                        String namaPenerima2 = kliring48.getNamaPenerima();
                        Kliring kliring52 = this.f;
                        kliring51.setNamaPenerima((String) c(namaPenerima2, kliring52 != null ? kliring52.getNamaPenerima() : null));
                    }
                    Kliring kliring53 = this.m;
                    if (kliring53 != null) {
                        String nomorRekening2 = kliring48.getNomorRekening();
                        Kliring kliring54 = this.f;
                        kliring53.setNomorRekening((String) c(nomorRekening2, kliring54 != null ? kliring54.getNomorRekening() : null));
                    }
                    Kliring kliring55 = this.m;
                    if (kliring55 != null) {
                        String kodeNegara2 = kliring48.getKodeNegara();
                        Kliring kliring56 = this.f;
                        kliring55.setKodeNegara((String) c(kodeNegara2, kliring56 != null ? kliring56.getKodeNegara() : null));
                    }
                    Kliring kliring57 = this.m;
                    if (kliring57 != null) {
                        String a6 = getPromotion.a(J(), kliring48.getNomorHp());
                        User J3 = J();
                        Kliring kliring58 = this.f;
                        kliring57.setNomorHp((String) c(a6, getPromotion.a(J3, kliring58 != null ? kliring58.getNomorHp() : null)));
                    }
                    Kliring kliring59 = this.m;
                    if (kliring59 != null) {
                        String beritaAcara2 = kliring48.getBeritaAcara();
                        Kliring kliring60 = this.f;
                        kliring59.setBeritaAcara((String) c(beritaAcara2, kliring60 != null ? kliring60.getBeritaAcara() : null));
                    }
                    Kliring kliring61 = this.m;
                    if (kliring61 != null) {
                        String tanggalJatuhTempo2 = kliring48.getTanggalJatuhTempo();
                        Kliring kliring62 = this.f;
                        kliring61.setTanggalJatuhTempo((String) c(tanggalJatuhTempo2, kliring62 != null ? kliring62.getTanggalJatuhTempo() : null));
                    }
                    Kliring kliring63 = this.m;
                    if (kliring63 != null) {
                        String tipeNasabah2 = kliring48.getTipeNasabah();
                        Kliring kliring64 = this.f;
                        kliring63.setTipeNasabah((String) c(tipeNasabah2, kliring64 != null ? kliring64.getTipeNasabah() : null));
                    }
                    Kliring kliring65 = this.m;
                    if (kliring65 != null) {
                        String tipeNasabahId2 = kliring48.getTipeNasabahId();
                        Kliring kliring66 = this.f;
                        kliring65.setTipeNasabahId((String) c(tipeNasabahId2, kliring66 != null ? kliring66.getTipeNasabahId() : null));
                    }
                    Kliring kliring67 = this.m;
                    if (kliring67 != null) {
                        String sumberDana2 = kliring48.getSumberDana();
                        Kliring kliring68 = this.f;
                        kliring67.setSumberDana((String) c(sumberDana2, kliring68 != null ? kliring68.getSumberDana() : null));
                    }
                    RealmList<Warkat> listWarkat22 = kliring48.getListWarkat();
                    subscribeReservationRescheduleEvent.d(listWarkat22, "");
                    RealmList<Warkat> realmList2 = listWarkat22;
                    subscribeReservationRescheduleEvent.e(realmList2, "");
                    if (realmList2 instanceof Collection) {
                        i3 = realmList2.size();
                    }
                    ArrayList arrayList2 = new ArrayList(i3);
                    int i5 = 0;
                    for (Warkat warkat22 : realmList2) {
                        if (i5 >= 0) {
                            Warkat warkat23 = warkat22;
                            Warkat warkat24 = new Warkat();
                            long id4 = warkat23.getId();
                            Kliring kliring69 = this.f;
                            Long l5 = (Long) d(Long.valueOf(id4), (kliring69 == null || (listWarkat10 = kliring69.getListWarkat()) == null || (warkat9 = listWarkat10.get(i5)) == null) ? null : Long.valueOf(warkat9.getId()));
                            warkat24.setId(l5 != null ? l5.longValue() : 0);
                            String nomorWarkat2 = warkat23.getNomorWarkat();
                            Kliring kliring70 = this.f;
                            warkat24.setNomorWarkat((String) d(nomorWarkat2, (kliring70 == null || (listWarkat9 = kliring70.getListWarkat()) == null || (warkat8 = listWarkat9.get(i5)) == null) ? null : warkat8.getNomorWarkat()));
                            String namaBank2 = warkat23.getNamaBank();
                            Kliring kliring71 = this.f;
                            warkat24.setNamaBank((String) d(namaBank2, (kliring71 == null || (listWarkat8 = kliring71.getListWarkat()) == null || (warkat7 = listWarkat8.get(i5)) == null) ? null : warkat7.getNamaBank()));
                            String kodeBank2 = warkat23.getKodeBank();
                            Kliring kliring72 = this.f;
                            warkat24.setKodeBank((String) d(kodeBank2, (kliring72 == null || (listWarkat7 = kliring72.getListWarkat()) == null || (warkat6 = listWarkat7.get(i5)) == null) ? null : warkat6.getKodeBank()));
                            String localClearingCodeBank2 = warkat23.getLocalClearingCodeBank();
                            Kliring kliring73 = this.f;
                            warkat24.setLocalClearingCodeBank((String) d(localClearingCodeBank2, (kliring73 == null || (listWarkat6 = kliring73.getListWarkat()) == null || (warkat5 = listWarkat6.get(i5)) == null) ? null : warkat5.getLocalClearingCodeBank()));
                            String jenisWarkat2 = warkat23.getJenisWarkat();
                            Kliring kliring74 = this.f;
                            warkat24.setJenisWarkat((String) d(jenisWarkat2, (kliring74 == null || (listWarkat5 = kliring74.getListWarkat()) == null || (warkat4 = listWarkat5.get(i5)) == null) ? null : warkat4.getJenisWarkat()));
                            String kodeJenisWarkat2 = warkat23.getKodeJenisWarkat();
                            Kliring kliring75 = this.f;
                            warkat24.setKodeJenisWarkat((String) d(kodeJenisWarkat2, (kliring75 == null || (listWarkat4 = kliring75.getListWarkat()) == null || (warkat3 = listWarkat4.get(i5)) == null) ? null : warkat3.getKodeJenisWarkat()));
                            Double nominal2 = warkat23.getNominal();
                            Kliring kliring76 = this.f;
                            warkat24.setNominal((Double) d(nominal2, (kliring76 == null || (listWarkat3 = kliring76.getListWarkat()) == null || (warkat2 = listWarkat3.get(i5)) == null) ? null : warkat2.getNominal()));
                            String jatuhTempo2 = warkat23.getJatuhTempo();
                            Kliring kliring77 = this.f;
                            warkat24.setJatuhTempo((String) d(jatuhTempo2, (kliring77 == null || (listWarkat2 = kliring77.getListWarkat()) == null || (warkat = listWarkat2.get(i5)) == null) ? null : warkat.getJatuhTempo()));
                            onCLickStatusNpwp onclickstatusnpwp5 = onCLickStatusNpwp.e;
                            this.z.add(warkat24);
                            Kliring kliring78 = this.m;
                            arrayList2.add((kliring78 == null || (listWarkat = kliring78.getListWarkat()) == null) ? null : Boolean.valueOf(listWarkat.add(warkat24)));
                            i5++;
                        } else {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                    }
                    Kliring kliring79 = this.m;
                    if (kliring79 != null) {
                        double totalWarkat2 = kliring48.getTotalWarkat();
                        Kliring kliring80 = this.f;
                        Double d3 = (Double) c(Double.valueOf(totalWarkat2), kliring80 != null ? Double.valueOf(kliring80.getTotalWarkat()) : null);
                        if (d3 != null) {
                            d = d3.doubleValue();
                        }
                        kliring79.setTotalWarkat(d);
                    }
                    Kliring kliring81 = this.m;
                    if (kliring81 != null) {
                        String tujuanTransaksi2 = kliring48.getTujuanTransaksi();
                        Kliring kliring82 = this.f;
                        kliring81.setTujuanTransaksi((String) c(tujuanTransaksi2, kliring82 != null ? kliring82.getTujuanTransaksi() : null));
                    }
                    Kliring kliring83 = this.m;
                    if (kliring83 != null) {
                        String tujuanTransaksiCode2 = kliring48.getTujuanTransaksiCode();
                        Kliring kliring84 = this.f;
                        kliring83.setTujuanTransaksiCode((String) c(tujuanTransaksiCode2, kliring84 != null ? kliring84.getTujuanTransaksiCode() : null));
                    }
                    Kliring kliring85 = this.m;
                    if (kliring85 != null) {
                        String sumberDanaCode2 = kliring48.getSumberDanaCode();
                        Kliring kliring86 = this.f;
                        kliring85.setSumberDanaCode((String) c(sumberDanaCode2, kliring86 != null ? kliring86.getSumberDanaCode() : null));
                    }
                    Kliring kliring87 = this.m;
                    if (kliring87 != null) {
                        String accType2 = kliring48.getAccType();
                        Kliring kliring88 = this.f;
                        kliring87.setAccType((String) c(accType2, kliring88 != null ? kliring88.getAccType() : null));
                    }
                    Kliring kliring89 = this.m;
                    if (kliring89 != null) {
                        String saranaPembayaranPengirim2 = kliring48.getSaranaPembayaranPengirim();
                        Kliring kliring90 = this.f;
                        kliring89.setSaranaPembayaranPengirim((String) c(saranaPembayaranPengirim2, kliring90 != null ? kliring90.getSaranaPembayaranPengirim() : null));
                    }
                    Kliring kliring91 = this.m;
                    if (kliring91 != null) {
                        long createdAt2 = kliring48.getCreatedAt();
                        Kliring kliring92 = this.f;
                        Long l6 = (Long) c(Long.valueOf(createdAt2), kliring92 != null ? Long.valueOf(kliring92.getCreatedAt()) : null);
                        kliring91.setCreatedAt(l6 != null ? l6.longValue() : 0);
                    }
                    Kliring kliring93 = this.m;
                    if (kliring93 != null) {
                        String currentPage2 = kliring48.getCurrentPage();
                        subscribeReservationRescheduleEvent.d(currentPage2, "");
                        String currentPage3 = currentPage2.length() == 0 ? "K1DataPenerimaDataFragment" : kliring48.getCurrentPage();
                        Kliring kliring94 = this.f;
                        kliring93.setCurrentPage((String) c(currentPage3, kliring94 != null ? kliring94.getCurrentPage() : null));
                    }
                    onCLickStatusNpwp onclickstatusnpwp6 = onCLickStatusNpwp.e;
                    onclickstatusnpwp = onCLickStatusNpwp.e;
                } else {
                    onclickstatusnpwp = null;
                }
                if (onclickstatusnpwp == null) {
                    Kliring kliring95 = this.f;
                    if (kliring95 != null) {
                        this.m = kliring95;
                    }
                    Kliring kliring96 = this.m;
                    if (kliring96 != null) {
                        Long l7 = this.k;
                        kliring96.setId(l7 != null ? l7.longValue() : 0);
                    }
                    Kliring kliring97 = this.m;
                    if (kliring97 != null) {
                        Long l8 = this.k;
                        kliring97.setCreatedAt(l8 != null ? l8.longValue() : 0);
                    }
                    onCLickStatusNpwp onclickstatusnpwp7 = onCLickStatusNpwp.e;
                }
            } else {
                Kliring kliring98 = this.f;
                if (kliring98 != null) {
                    this.m = kliring98;
                }
                Kliring kliring99 = this.m;
                if (kliring99 != null) {
                    kliring99.setId(System.currentTimeMillis());
                }
                Kliring kliring100 = this.m;
                if (kliring100 != null) {
                    kliring100.setCreatedAt(System.currentTimeMillis());
                }
            }
        }
        t();
        Kliring kliring101 = this.m;
        if (kliring101 != null) {
            str = kliring101.getCurrentPage();
        }
        if (subscribeReservationRescheduleEvent.b((Object) str, (Object) "K3KonfirmasiWarkatFragment")) {
            d(2131296811, new setAccountNumberOR(), "K3KonfirmasiWarkatFragment");
        } else if (subscribeReservationRescheduleEvent.b((Object) str, (Object) "K2DataWarkatFragment")) {
            d(2131296811, new getImei(), "K2DataWarkatFragment");
        } else {
            d(2131296811, new getClearingCode(), "K1DataPenerimaDataFragment");
        }
    }

    @Override // o.getView
    public final void c(Fragment fragment) {
        subscribeReservationRescheduleEvent.e(fragment, "");
        c(fragment);
        try {
            String tag = fragment.getTag();
            if (tag != null) {
                switch (tag.hashCode()) {
                    case -420224419:
                        if (tag.equals("K3KonfirmasiWarkatFragment")) {
                            ProgressBar progressBar = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.e;
                            subscribeReservationRescheduleEvent.d(progressBar, "");
                            progressBar.startAnimation(new getCardName(progressBar, 100.0f));
                            ProgressBar progressBar2 = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.h;
                            subscribeReservationRescheduleEvent.d(progressBar2, "");
                            progressBar2.startAnimation(new getCardName(progressBar2, 100.0f));
                            a(3);
                            Kliring kliring = this.m;
                            if (kliring != null) {
                                kliring.setCurrentPage("K3KonfirmasiWarkatFragment");
                                return;
                            }
                            return;
                        }
                        return;
                    case -30317367:
                        if (tag.equals("SubmitKliringCompleteFragment")) {
                            a(4);
                            return;
                        }
                        return;
                    case 1007986263:
                        if (tag.equals("K2DataWarkatFragment")) {
                            ProgressBar progressBar3 = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.e;
                            subscribeReservationRescheduleEvent.d(progressBar3, "");
                            progressBar3.startAnimation(new getCardName(progressBar3, 100.0f));
                            ProgressBar progressBar4 = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.h;
                            subscribeReservationRescheduleEvent.d(progressBar4, "");
                            progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                            a(2);
                            Kliring kliring2 = this.m;
                            if (kliring2 != null) {
                                kliring2.setCurrentPage("K2DataWarkatFragment");
                                return;
                            }
                            return;
                        }
                        return;
                    case 1069412961:
                        if (tag.equals("K1DataPenerimaDataFragment")) {
                            ProgressBar progressBar5 = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.e;
                            subscribeReservationRescheduleEvent.d(progressBar5, "");
                            progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
                            ProgressBar progressBar6 = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.h;
                            subscribeReservationRescheduleEvent.d(progressBar6, "");
                            progressBar6.startAnimation(new getCardName(progressBar6, 0.0f));
                            a(1);
                            Kliring kliring3 = this.m;
                            if (kliring3 != null) {
                                kliring3.setCurrentPage("K1DataPenerimaDataFragment");
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("KliringActivity : ");
            sb.append(e.getMessage());
            Log.i("EBRANCH", sb.toString());
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        this.U = txnTellerResponse;
        String imei = J() != null ? J().getImei() : Settings.Secure.getString(getContentResolver(), "android_id");
        if (J() != null) {
            J().getSessionId();
        }
        String str = J() != null ? "N" : "Y";
        String email = J() != null ? J().getEmail() : "";
        subscribeReservationRescheduleEvent.d(email, "");
        String str2 = email;
        if (email.length() == 0) {
            ListFormTeller listFormTeller = this.T;
            subscribeReservationRescheduleEvent.c(listFormTeller);
            if (!listFormTeller.getSetoranList().isEmpty()) {
                ListFormTeller listFormTeller2 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller2);
                Setoran setoran = listFormTeller2.getSetoranList().get(0);
                subscribeReservationRescheduleEvent.c(setoran);
                str2 = setoran.getSenderEmail();
            } else {
                ListFormTeller listFormTeller3 = this.T;
                subscribeReservationRescheduleEvent.c(listFormTeller3);
                str2 = email;
                if (!listFormTeller3.getTarikanList().isEmpty()) {
                    ListFormTeller listFormTeller4 = this.T;
                    subscribeReservationRescheduleEvent.c(listFormTeller4);
                    Tarikan tarikan = listFormTeller4.getTarikanList().get(0);
                    subscribeReservationRescheduleEvent.c(tarikan);
                    str2 = tarikan.getEmail();
                }
            }
        }
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = (SendEmailTransactionSuccessPresenter) this.S.d();
        String e = getPromotion.e(J(), str, imei, str2);
        subscribeReservationRescheduleEvent.c(txnTellerResponse);
        sendEmailTransactionSuccessPresenter.a(e, str2, new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    public final void c(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, str);
        ReviewSubMastercardAdapter$ViewHolder reviewSubMastercardAdapter$ViewHolder = new ReviewSubMastercardAdapter$ViewHolder(this.A);
        reviewSubMastercardAdapter$ViewHolder.setArguments(bundle);
        reviewSubMastercardAdapter$ViewHolder.show(l(), "SumberDanaBankTransferDialog");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        E();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        try {
            e(false, str2);
        } catch (IllegalStateException e) {
        }
    }

    public final void d(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.c();
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void d(List<clikedKeyHilang> list) {
        subscribeReservationRescheduleEvent.e(list, "");
    }

    public final boolean d(List<? extends TextView> list, List<? extends LogoutDialog_ViewBinding> list2, List<? extends View> list3, EditText editText, int i, String str) {
        LogoutDialog_ViewBinding logoutDialog_ViewBinding;
        EditText editText2;
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2;
        EditText editText3;
        subscribeReservationRescheduleEvent.e(list, "");
        subscribeReservationRescheduleEvent.e(list3, "");
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(str, "");
        boolean z = true;
        boolean z2 = true;
        if (editText.getText().length() >= i) {
            if (str.length() == 0) {
                if (!(list2 == null || (logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) list2.get(list3.indexOf(editText))) == null || (editText3 = logoutDialog_ViewBinding2.f) == null)) {
                    editText3.setHintTextColor(getResources().getColor(2131099731));
                }
                int indexOf = list3.indexOf(editText);
                ((TextView) list.get(indexOf)).setVisibility(8);
                ((LogoutDialog_ViewBinding) list2.get(indexOf)).setBackgroundResource(2131230847);
                return z;
            }
        }
        Editable text = editText.getText();
        subscribeReservationRescheduleEvent.d(text, "");
        if (text.length() != 0) {
            z2 = false;
        }
        if (!(!z2 || list2 == null || (logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) list2.get(list3.indexOf(editText))) == null || (editText2 = logoutDialog_ViewBinding.f) == null)) {
            editText2.setHintTextColor(getResources().getColor(2131099739));
        }
        int indexOf2 = list3.indexOf(editText);
        ((TextView) list.get(indexOf2)).setVisibility(0);
        ((LogoutDialog_ViewBinding) list2.get(indexOf2)).setBackgroundResource(2131230870);
        ((TextView) list.get(list3.indexOf(editText))).setText(str);
        z = false;
        return z;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        E();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        try {
            e(true, str2);
        } catch (IllegalStateException e) {
        }
    }

    public final void e(int i) {
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list = this.Q.get(i);
        subscribeReservationRescheduleEvent.e(list, "");
        this.A = new ArrayList(list);
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2 = this.V.get(i);
        subscribeReservationRescheduleEvent.e(list2, "");
        this.E = new ArrayList(list2);
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
    }

    public final void f(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, str);
        SexAdapter$SexVH_ViewBinding sexAdapter$SexVH_ViewBinding = new SexAdapter$SexVH_ViewBinding(this.E);
        sexAdapter$SexVH_ViewBinding.setArguments(bundle);
        sexAdapter$SexVH_ViewBinding.show(l(), "TujuanTransaksiBankTransferDialog");
    }

    public final void g(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding = new PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding();
        String string = getString(2131822055);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.f = string;
        subscribeReservationRescheduleEvent.e(str, "");
        penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.b = str;
        penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.show(l(), new PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding().getTag());
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        N();
    }

    public final void i(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, str);
        TipeNasabahKliringDialog tipeNasabahKliringDialog = new TipeNasabahKliringDialog();
        tipeNasabahKliringDialog.setArguments(bundle);
        tipeNasabahKliringDialog.show(l(), "TipeNasabahKliringDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void i_(String str) {
        E();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void l(String str) {
        E();
        Bundle bundle = new Bundle();
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        bundle.putString("MessageDialogContent", str2);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public final void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueKeluarFormReservation(onUbahFormReservasiEvent onubahformreservasievent) {
        subscribeReservationRescheduleEvent.e(onubahformreservasievent, "");
        if (subscribeReservationRescheduleEvent.b((Object) onubahformreservasievent.b, (Object) "Y")) {
            H().executeTransaction(new CekDokumenActivity(this));
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessEChannelActivity_ViewBinding, "");
        setAccountNumberOR setaccountnumberor = (setAccountNumberOR) l().findFragmentByTag("K3KonfirmasiWarkatFragment");
        if (setaccountnumberor != null && setaccountnumberor.isVisible()) {
            H().executeTransaction(new ubahBcaCard(this));
        }
        if (subscribeReservationRescheduleEvent.b((Object) reservasiSuccessEChannelActivity_ViewBinding.d, (Object) "N")) {
            H().executeTransaction(new Realm.Transaction() { // from class: o.CC7ReviewCreditCardActivity_ViewBinding
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    subscribeUbahVisaCardEvent.a(subscribeUbahVisaCardEvent.this, realm);
                }
            });
            H().executeTransaction(new CekDokumenActivity(this));
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        H().executeTransaction(new Realm.Transaction() { // from class: o.close
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                subscribeUbahVisaCardEvent.g(subscribeUbahVisaCardEvent.this, realm);
            }
        });
        ListFormTeller listFormTeller = this.T;
        if ((listFormTeller != null ? listFormTeller.getCountAll() : 0) > 0) {
            this.M = true;
            H().executeTransaction(new ChooseProductORDialog(this));
        }
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
        if (!((Boolean) this.G.d()).booleanValue() || menu == null) {
            return true;
        }
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (menu.getItem(i).getItemId() == 2131298038) {
                menu.getItem(i).setVisible(false);
            }
        }
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        ((KliringPresenter) this.R.d()).b();
        GetHBPresenter getHBPresenter = (GetHBPresenter) this.O.d();
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
        TxnTellerPresenter txnTellerPresenter = (TxnTellerPresenter) this.P.d();
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call2 = txnTellerPresenter.e;
        if (call2 != null) {
            call2.cancel();
        }
        txnTellerPresenter.d = null;
        documentProvider.b().e(this);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        subscribeReservationRescheduleEvent.e(menuItem, "");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (this.p) {
                new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                return true;
            }
            ListFormTeller listFormTeller = this.T;
            if (listFormTeller != null) {
                int i = 0;
                if (!(listFormTeller != null && listFormTeller.getCountAll() == 0)) {
                    SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
                    ListFormTeller listFormTeller2 = this.T;
                    if (listFormTeller2 != null) {
                        i = listFormTeller2.getCountAll();
                    }
                    simpanDraftAndHitServiceDialog.a = i;
                    simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
                    return true;
                }
            }
            if (!((Boolean) this.u.d()).booleanValue()) {
                SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                simpanDraftDialog.b = "transaction_teller";
                simpanDraftDialog.show(l(), "SimpanDraftDialog");
                return true;
            }
            YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
            yakinKeluarDialog.d = "transaction_teller";
            yakinKeluarDialog.show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onReservasiTellerEvent(BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding) {
        subscribeReservationRescheduleEvent.e(branchMapROItemAdapter$BranchMapROItemVH_ViewBinding, "");
        this.q = branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.d;
        String email = J() != null ? J().getEmail() : "";
        H().executeTransaction(new Realm.Transaction() { // from class: o.ubahVisaCard
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                subscribeUbahVisaCardEvent.j(subscribeUbahVisaCardEvent.this, realm);
            }
        });
        if (!this.N || this.q) {
            this.M = false;
            H().executeTransaction(new ChooseProductORDialog(this));
            return;
        }
        Intent intent = new Intent(this, BranchMapTarikanActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("no_reff", "");
        startActivity(intent);
    }

    public final void p() {
        RealmList<Warkat> listWarkat;
        onCLickStatusNpwp onclickstatusnpwp;
        KliringTemp kliringTemp = this.y;
        Kliring kliring = this.m;
        kliringTemp.d = kliring != null ? kliring.getId() : 0;
        KliringTemp kliringTemp2 = this.y;
        Kliring kliring2 = this.m;
        String str = null;
        String valueOf = String.valueOf(kliring2 != null ? kliring2.getNamaPenerima() : null);
        subscribeReservationRescheduleEvent.e(valueOf, "");
        kliringTemp2.f = valueOf;
        KliringTemp kliringTemp3 = this.y;
        Kliring kliring3 = this.m;
        String valueOf2 = String.valueOf(kliring3 != null ? kliring3.getNomorRekening() : null);
        subscribeReservationRescheduleEvent.e(valueOf2, "");
        kliringTemp3.h = valueOf2;
        KliringTemp kliringTemp4 = this.y;
        Kliring kliring4 = this.m;
        String valueOf3 = String.valueOf(kliring4 != null ? kliring4.getKodeNegara() : null);
        subscribeReservationRescheduleEvent.e(valueOf3, "");
        kliringTemp4.g = valueOf3;
        KliringTemp kliringTemp5 = this.y;
        User J = J();
        Kliring kliring5 = this.m;
        String a = getPromotion.a(J, String.valueOf(kliring5 != null ? kliring5.getNomorHp() : null));
        subscribeReservationRescheduleEvent.d(a, "");
        subscribeReservationRescheduleEvent.e(a, "");
        kliringTemp5.i = a;
        KliringTemp kliringTemp6 = this.y;
        Kliring kliring6 = this.m;
        String valueOf4 = String.valueOf(kliring6 != null ? kliring6.getBeritaAcara() : null);
        subscribeReservationRescheduleEvent.e(valueOf4, "");
        kliringTemp6.a = valueOf4;
        KliringTemp kliringTemp7 = this.y;
        Kliring kliring7 = this.m;
        String valueOf5 = String.valueOf(kliring7 != null ? kliring7.getTanggalJatuhTempo() : null);
        subscribeReservationRescheduleEvent.e(valueOf5, "");
        kliringTemp7.k = valueOf5;
        KliringTemp kliringTemp8 = this.y;
        Kliring kliring8 = this.m;
        String valueOf6 = String.valueOf(kliring8 != null ? kliring8.getTipeNasabah() : null);
        subscribeReservationRescheduleEvent.e(valueOf6, "");
        kliringTemp8.f29o = valueOf6;
        KliringTemp kliringTemp9 = this.y;
        Kliring kliring9 = this.m;
        String valueOf7 = String.valueOf(kliring9 != null ? kliring9.getTipeNasabahId() : null);
        subscribeReservationRescheduleEvent.e(valueOf7, "");
        kliringTemp9.p = valueOf7;
        KliringTemp kliringTemp10 = this.y;
        Kliring kliring10 = this.m;
        String valueOf8 = String.valueOf(kliring10 != null ? kliring10.getSumberDana() : null);
        subscribeReservationRescheduleEvent.e(valueOf8, "");
        kliringTemp10.m = valueOf8;
        ArrayList<WarkatTemp> arrayList = this.y.j;
        if (arrayList != null) {
            arrayList.clear();
        }
        Kliring kliring11 = this.m;
        if (!(kliring11 == null || (listWarkat = kliring11.getListWarkat()) == null)) {
            RealmList<Warkat> realmList = listWarkat;
            int i = 10;
            subscribeReservationRescheduleEvent.e(realmList, "");
            if (realmList instanceof Collection) {
                i = realmList.size();
            }
            ArrayList arrayList2 = new ArrayList(i);
            int i2 = 0;
            for (Warkat warkat : realmList) {
                if (i2 >= 0) {
                    Warkat warkat2 = warkat;
                    WarkatTemp warkatTemp = new WarkatTemp(0, null, null, null, null, null, null, 0.0d, null, 511);
                    warkatTemp.a = warkat2.getId();
                    String nomorWarkat = warkat2.getNomorWarkat();
                    subscribeReservationRescheduleEvent.d(nomorWarkat, "");
                    subscribeReservationRescheduleEvent.e(nomorWarkat, "");
                    warkatTemp.f = nomorWarkat;
                    String namaBank = warkat2.getNamaBank();
                    subscribeReservationRescheduleEvent.d(namaBank, "");
                    subscribeReservationRescheduleEvent.e(namaBank, "");
                    warkatTemp.g = namaBank;
                    String kodeBank = warkat2.getKodeBank();
                    subscribeReservationRescheduleEvent.d(kodeBank, "");
                    subscribeReservationRescheduleEvent.e(kodeBank, "");
                    warkatTemp.d = kodeBank;
                    String localClearingCodeBank = warkat2.getLocalClearingCodeBank();
                    subscribeReservationRescheduleEvent.d(localClearingCodeBank, "");
                    subscribeReservationRescheduleEvent.e(localClearingCodeBank, "");
                    warkatTemp.j = localClearingCodeBank;
                    String jenisWarkat = warkat2.getJenisWarkat();
                    subscribeReservationRescheduleEvent.d(jenisWarkat, "");
                    subscribeReservationRescheduleEvent.e(jenisWarkat, "");
                    warkatTemp.e = jenisWarkat;
                    String kodeJenisWarkat = warkat2.getKodeJenisWarkat();
                    subscribeReservationRescheduleEvent.d(kodeJenisWarkat, "");
                    subscribeReservationRescheduleEvent.e(kodeJenisWarkat, "");
                    warkatTemp.c = kodeJenisWarkat;
                    Double nominal = warkat2.getNominal();
                    subscribeReservationRescheduleEvent.d(nominal, "");
                    warkatTemp.h = nominal.doubleValue();
                    String jatuhTempo = warkat2.getJatuhTempo();
                    subscribeReservationRescheduleEvent.d(jatuhTempo, "");
                    subscribeReservationRescheduleEvent.e(jatuhTempo, "");
                    warkatTemp.b = jatuhTempo;
                    ArrayList<WarkatTemp> arrayList3 = this.y.j;
                    if (arrayList3 != null) {
                        arrayList3.add(i2, warkatTemp);
                        onclickstatusnpwp = onCLickStatusNpwp.e;
                    } else {
                        onclickstatusnpwp = null;
                    }
                    arrayList2.add(onclickstatusnpwp);
                    i2++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
        KliringTemp kliringTemp11 = this.y;
        Kliring kliring12 = this.m;
        kliringTemp11.r = kliring12 != null ? kliring12.getTotalWarkat() : 0.0d;
        KliringTemp kliringTemp12 = this.y;
        Kliring kliring13 = this.m;
        String valueOf9 = String.valueOf(kliring13 != null ? kliring13.getTujuanTransaksi() : null);
        subscribeReservationRescheduleEvent.e(valueOf9, "");
        kliringTemp12.s = valueOf9;
        KliringTemp kliringTemp13 = this.y;
        Kliring kliring14 = this.m;
        String valueOf10 = String.valueOf(kliring14 != null ? kliring14.getTujuanTransaksiCode() : null);
        subscribeReservationRescheduleEvent.e(valueOf10, "");
        kliringTemp13.t = valueOf10;
        KliringTemp kliringTemp14 = this.y;
        Kliring kliring15 = this.m;
        String valueOf11 = String.valueOf(kliring15 != null ? kliring15.getSumberDanaCode() : null);
        subscribeReservationRescheduleEvent.e(valueOf11, "");
        kliringTemp14.l = valueOf11;
        KliringTemp kliringTemp15 = this.y;
        Kliring kliring16 = this.m;
        String valueOf12 = String.valueOf(kliring16 != null ? kliring16.getAccType() : null);
        subscribeReservationRescheduleEvent.e(valueOf12, "");
        kliringTemp15.b = valueOf12;
        KliringTemp kliringTemp16 = this.y;
        Kliring kliring17 = this.m;
        String valueOf13 = String.valueOf(kliring17 != null ? kliring17.getSaranaPembayaranPengirim() : null);
        subscribeReservationRescheduleEvent.e(valueOf13, "");
        kliringTemp16.n = valueOf13;
        KliringTemp kliringTemp17 = this.y;
        Kliring kliring18 = this.m;
        kliringTemp17.e = kliring18 != null ? kliring18.getCreatedAt() : 0;
        KliringTemp kliringTemp18 = this.y;
        Kliring kliring19 = this.m;
        if (kliring19 != null) {
            str = kliring19.getCurrentPage();
        }
        String valueOf14 = String.valueOf(str);
        subscribeReservationRescheduleEvent.e(valueOf14, "");
        kliringTemp18.c = valueOf14;
    }

    public final View q() {
        LinearLayout linearLayout = ((JenisKartuAdapter$JenisKartuVH) this.f295o.d()).e.c;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    public final void r() {
        if (J() != null) {
            GetHBPresenter getHBPresenter = (GetHBPresenter) this.O.d();
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(F(), J().getSessionId(), J().getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: INVOKE  
                  (r0v9 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0045: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v5 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: o.subscribeUbahVisaCardEvent.r():void, file: classes-dex2jar.jar:o/subscribeUbahVisaCardEvent.class
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
                if (r0 != 0) goto L_0x0008
                return
            L_0x0008:
                r0 = r6
                o.onChooseValueSumberPenghasilan r0 = r0.O
                java.lang.Object r0 = r0.d()
                com.bca.smartbranch.presenter.GetHBPresenter r0 = (com.bca.smartbranch.presenter.GetHBPresenter) r0
                r7 = r0
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
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.subscribeUbahVisaCardEvent.r():void");
        }

        @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        public final void r(String str) {
            E();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        public final void s(String str) {
            E();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        public final void t() {
            Kliring kliring = this.m;
            String str = null;
            String tipeNasabah = kliring != null ? kliring.getTipeNasabah() : null;
            int i = 1;
            if (!(tipeNasabah == null || tipeNasabah.length() == 0)) {
                Kliring kliring2 = this.m;
                if (kliring2 != null) {
                    str = kliring2.getTipeNasabah();
                }
                if (!CheckOTPSessionPresenter.d(str, "Individu", false)) {
                    e(i);
                }
            }
            i = 0;
            e(i);
        }

        public final void w() {
            Calendar d = KliringPresenter.d((KliringPresenter) this.R.d(), 0, 1);
            showInfoValueTodayOR e = showInfoValueTodayOR.e(new showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver() { // from class: o.CC8FormKartuKreditActivity
                public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
                    documentProvider.b().d(new ReservasiTellerOActivity(getAnnualFeeBasicAmount.a(i, i2, i3)));
                }
            }, d.get(1), d.get(2), d.get(5));
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
            Calendar calendar = (Calendar) d.clone();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            oR2PilihProductFragment_ViewBinding.e = calendar;
            lewati lewati = e.d;
            if (lewati != null) {
                lewati.c.h();
            }
            d.add(5, 14);
            ArrayList arrayList = new ArrayList();
            ArrayList<Long> arrayList2 = this.L;
            int i = 10;
            subscribeReservationRescheduleEvent.e(arrayList2, "");
            if (arrayList2 instanceof Collection) {
                i = arrayList2.size();
            }
            ArrayList arrayList3 = new ArrayList(i);
            for (Number number : arrayList2) {
                Date e2 = getAnnualFeeBasicAmount.e("yyyyMMdd", String.valueOf(number.longValue()));
                Calendar instance = Calendar.getInstance();
                instance.setTime(e2);
                arrayList3.add(Boolean.valueOf(arrayList.add(instance)));
            }
            Object[] array = arrayList.toArray(new Calendar[arrayList.size()]);
            subscribeReservationRescheduleEvent.d(array, "");
            e.b.d((Calendar[]) array);
            lewati lewati2 = e.d;
            if (lewati2 != null) {
                lewati2.c.h();
            }
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding2 = e.b;
            Calendar calendar2 = (Calendar) d.clone();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            oR2PilihProductFragment_ViewBinding2.b = calendar2;
            lewati lewati3 = e.d;
            if (lewati3 != null) {
                lewati3.c.h();
            }
            int color = getResources().getColor(2131099765);
            e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
            e.show(getFragmentManager(), "TAG");
        }

        public final void x() {
            H().executeTransaction(new ubahBcaCard(this));
        }

        public final void y() {
            Intent intent = new Intent(this, onClickSetun.class);
            onClickSetun.RemoteActionCompatParcelizer remoteActionCompatParcelizer = onClickSetun.h;
            intent.putExtra(onClickSetun.r, false);
            onClickSetun.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = onClickSetun.h;
            intent.putExtra(onClickSetun.q, this.p);
            onClickSetun.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = onClickSetun.h;
            intent.putExtra(onClickSetun.u, ListUtil.OneItemImmutableList.e(this.H));
            startActivity(intent);
        }
    }
