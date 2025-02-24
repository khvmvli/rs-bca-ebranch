package o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.BranchMapActivity;
import com.bca.smartbranch.activity.BranchMapTarikanActivity;
import com.bca.smartbranch.activity.DetailOpenTellerActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.DraftBerhasilDialog;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftAndHitServiceDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.ListUtil;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding;
import o.TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding;
import o.UbahMasterCardAdapter$ViewHolder_ViewBinding;
import o.UbahSubMasterCardAdapter$ViewHolder;
import o.UbahVisaCardAdapter$ViewHolder_ViewBinding;
import o.onClickDetail;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:o/ubahData.class */
public final class ubahData extends BaseActivityPostLoginKotlin implements GetHBPresenter.write, TxnTellerPresenter.IconCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private final onChooseValueSumberPenghasilan N;
    private boolean O;
    private SendEmailTransactionSuccessPresenter P;
    private boolean Q;
    private boolean R;
    private Long S;
    private String T;
    private TxnTellerPresenter V;
    private TxnTellerResponse W;
    private String X;
    public List<? extends DaftarTransferResponse.DaftarTransferOutput> l;
    public ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding m;

    /* renamed from: o */
    public BankTransfer f296o;
    public GetCustAcctListResponse p;
    public boolean q;
    public Drawable r;
    public long s;
    public Drawable t;
    public GetHBPresenter w;
    public ListFormTeller y;
    public static final write h = new write((byte) 0);
    private static final String F = "is_from_reservation";
    private static final String J = "transaksi_teller_id";
    private static final String M = "TellerType";
    private static final String E = "id_reservation";
    private static final String G = "id_draft";
    private static final String H = "ListAcct";
    private static final String A = "ADMIN_FEES";
    private static final String I = "SUMBER_DANA";
    private static final String L = "TUJUAN_TRANSAKSI";
    private static final String z = "DAFTAR_TRANSFER";
    public Map<Integer, View> k = new LinkedHashMap();
    private final String K = "BankTransferFormActivity";
    public final String f = "RTGS";
    public final String j = "LLG";
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> u = new ArrayList();
    public List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> v = new ArrayList();
    public List<onClickDetail.RemoteActionCompatParcelizer> n = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/ubahData$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(0);
            ubahData.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding invoke() {
            DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding c = DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding.c(ubahData.this.getLayoutInflater().inflate(2131492896, (ViewGroup) null, false));
            subscribeReservationRescheduleEvent.d(c, "");
            return c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/ubahData$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public ubahData() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.N = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
    }

    private final void a(int i) {
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = null;
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = null;
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = null;
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = null;
        if (i == 1) {
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5.m.setBackgroundResource(2131231203);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6.m.setTextColor(getResources().getColor(2131099772));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7.k.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8.k.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9.r.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10.r.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11.p.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12.p.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding13.m.setVisibility(0);
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3.a.setVisibility(8);
        } else if (i == 2) {
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding14 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding14 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding14 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding14.m.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding15 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding15 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding15 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding15.a.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding16 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding16 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding16 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding16.k.setBackgroundResource(2131231203);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding17 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding17 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding17 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding17.k.setTextColor(getResources().getColor(2131099772));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding18 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding18 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding18 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding18.r.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding19 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding19 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding19 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding19.r.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding20 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding20 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding20 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding20.p.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding21 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding21 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding21 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding21.p.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding22 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding22 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding22 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding22.k.setVisibility(0);
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2.c.setVisibility(8);
        } else if (i == 3) {
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding23 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding23 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding23 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding23.m.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding24 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding24 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding24 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding24.a.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding25 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding25 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding25 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding25.k.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding26 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding26 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding26 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding26.c.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding27 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding27 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding27 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding27.r.setBackgroundResource(2131231203);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding28 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding28 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding28 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding28.r.setTextColor(getResources().getColor(2131099772));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding29 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding29 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding29 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding29.p.setBackgroundResource(2131231202);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding30 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding30 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding30 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding30.p.setTextColor(getResources().getColor(2131099815));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding31 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding31 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding31 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding31.r.setVisibility(0);
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding.d.setVisibility(8);
        } else if (i == 4) {
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding32 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding32 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding32 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding32.m.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding33 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding33 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding33 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding33.a.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding34 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding34 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding34 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding34.k.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding35 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding35 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding35 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding35.c.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding36 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding36 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding36 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding36.r.setVisibility(8);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding37 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding37 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding37 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding37.d.setVisibility(0);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding38 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding38 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding38 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding38.p.setBackgroundResource(2131231203);
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding39 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding39 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding39 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding39.p.setTextColor(getResources().getColor(2131099772));
            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding40 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding40 == null) {
                subscribeReservationRescheduleEvent.e("");
                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding40 = null;
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding40.p.setVisibility(0);
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = this.m;
            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4.b.setVisibility(8);
        }
    }

    public static /* synthetic */ void a(ubahData ubahdata, Realm realm) {
        subscribeReservationRescheduleEvent.e(ubahdata, "");
        RealmQuery where = ubahdata.H().where(BankTransfer.class);
        BankTransfer bankTransfer = ubahdata.f296o;
        BankTransfer bankTransfer2 = null;
        BankTransfer bankTransfer3 = null;
        if (bankTransfer == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer = null;
        }
        BankTransfer bankTransfer4 = (BankTransfer) where.equalTo("id", Long.valueOf(bankTransfer.getId())).findFirst();
        if (bankTransfer4 == null) {
            BankTransfer bankTransfer5 = ubahdata.f296o;
            if (bankTransfer5 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer5 = null;
            }
            BankTransfer bankTransfer6 = (BankTransfer) realm.createObject(BankTransfer.class, Long.valueOf(bankTransfer5.getId()));
            BankTransfer bankTransfer7 = ubahdata.f296o;
            if (bankTransfer7 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer7 = null;
            }
            bankTransfer6.setCurrentPage(bankTransfer7.getCurrentPage());
            BankTransfer bankTransfer8 = ubahdata.f296o;
            if (bankTransfer8 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer8 = null;
            }
            bankTransfer6.setCreatedAt(bankTransfer8.getCreatedAt());
            BankTransfer bankTransfer9 = ubahdata.f296o;
            if (bankTransfer9 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer9 = null;
            }
            bankTransfer6.setNamaPengirim(bankTransfer9.getNamaPengirim());
            BankTransfer bankTransfer10 = ubahdata.f296o;
            if (bankTransfer10 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer10 = null;
            }
            bankTransfer6.setNorekPengirim(bankTransfer10.getNorekPengirim());
            BankTransfer bankTransfer11 = ubahdata.f296o;
            if (bankTransfer11 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer11 = null;
            }
            bankTransfer6.setAlamatPengirim(bankTransfer11.getAlamatPengirim());
            BankTransfer bankTransfer12 = ubahdata.f296o;
            if (bankTransfer12 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer12 = null;
            }
            bankTransfer6.setTipeNasabahPengirim(bankTransfer12.getTipeNasabahPengirim());
            BankTransfer bankTransfer13 = ubahdata.f296o;
            if (bankTransfer13 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer13 = null;
            }
            bankTransfer6.setTipeNasabahPengirimId(bankTransfer13.getTipeNasabahPengirimId());
            BankTransfer bankTransfer14 = ubahdata.f296o;
            if (bankTransfer14 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer14 = null;
            }
            bankTransfer6.setStatusPendudukPengirim(bankTransfer14.getStatusPendudukPengirim());
            BankTransfer bankTransfer15 = ubahdata.f296o;
            if (bankTransfer15 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer15 = null;
            }
            bankTransfer6.setStatusKewarganegaraanPengirim(bankTransfer15.getStatusKewarganegaraanPengirim());
            BankTransfer bankTransfer16 = ubahdata.f296o;
            if (bankTransfer16 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer16 = null;
            }
            bankTransfer6.setNamaKontakPengirim(bankTransfer16.getNamaKontakPengirim());
            BankTransfer bankTransfer17 = ubahdata.f296o;
            if (bankTransfer17 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer17 = null;
            }
            bankTransfer6.setNoHpKontakPengirim(bankTransfer17.getNoHpKontakPengirim());
            BankTransfer bankTransfer18 = ubahdata.f296o;
            if (bankTransfer18 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer18 = null;
            }
            bankTransfer6.setNoTelpKontakPengirim(bankTransfer18.getNoTelpKontakPengirim());
            bankTransfer6.getPenerimaList().clear();
            BankTransfer bankTransfer19 = ubahdata.f296o;
            if (bankTransfer19 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer19 = null;
            }
            Iterator<BankTransferPenerima> it = bankTransfer19.getPenerimaList().iterator();
            while (it.hasNext()) {
                BankTransferPenerima next = it.next();
                subscribeReservationRescheduleEvent.d(next, "");
                BankTransferPenerima bankTransferPenerima = next;
                BankTransferPenerima bankTransferPenerima2 = new BankTransferPenerima();
                bankTransferPenerima2.setId(bankTransferPenerima.getId());
                bankTransferPenerima2.setNamaPenerima(bankTransferPenerima.getNamaPenerima());
                bankTransferPenerima2.setNorekPenerima(bankTransferPenerima.getNorekPenerima());
                bankTransferPenerima2.setBankTujuanPenerima(bankTransferPenerima.getBankTujuanPenerima());
                bankTransferPenerima2.setBankTujuanCode(bankTransferPenerima.getBankTujuanCode());
                bankTransferPenerima2.setBankTujuanOfficeCode(bankTransferPenerima.getBankTujuanOfficeCode());
                bankTransferPenerima2.setBankTujuanBIC(bankTransferPenerima.getBankTujuanBIC());
                bankTransferPenerima2.setNominalPenerima(bankTransferPenerima.getNominalPenerima());
                bankTransferPenerima2.setBeritaPenerima(bankTransferPenerima.getBeritaPenerima());
                bankTransferPenerima2.setAlamatPenerima(bankTransferPenerima.getAlamatPenerima());
                bankTransferPenerima2.setTipeNasabahPenerima(bankTransferPenerima.getTipeNasabahPenerima());
                bankTransferPenerima2.setTipeNasabahPenerimaId(bankTransferPenerima.getTipeNasabahPenerimaId());
                bankTransferPenerima2.setStatusPendudukPenerima(bankTransferPenerima.getStatusPendudukPenerima());
                bankTransferPenerima2.setStatusKewarganegaraanPenerima(bankTransferPenerima.getStatusKewarganegaraanPenerima());
                bankTransferPenerima2.setMetodePengirimanPenerima(bankTransferPenerima.getMetodePengirimanPenerima());
                bankTransferPenerima2.setBiayaTransfer(bankTransferPenerima.getBiayaTransfer());
                bankTransferPenerima2.setFlagDaftarTransfer(bankTransferPenerima.getFlagDaftarTransfer());
                bankTransfer6.getPenerimaList().add(bankTransferPenerima2);
            }
            BankTransfer bankTransfer20 = ubahdata.f296o;
            if (bankTransfer20 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer20 = null;
            }
            bankTransfer6.setTotalPembayaran(bankTransfer20.getTotalPembayaran());
            BankTransfer bankTransfer21 = ubahdata.f296o;
            if (bankTransfer21 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer21 = null;
            }
            bankTransfer6.setTotalNominal(bankTransfer21.getTotalNominal());
            BankTransfer bankTransfer22 = ubahdata.f296o;
            if (bankTransfer22 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer22 = null;
            }
            bankTransfer6.setTotalBiayaTransfer(bankTransfer22.getTotalBiayaTransfer());
            BankTransfer bankTransfer23 = ubahdata.f296o;
            if (bankTransfer23 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer23 = null;
            }
            bankTransfer6.setSaranaPembayaranPengirim(bankTransfer23.getSaranaPembayaranPengirim());
            BankTransfer bankTransfer24 = ubahdata.f296o;
            if (bankTransfer24 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer24 = null;
            }
            bankTransfer6.setSumberDanaTransaksi(bankTransfer24.getSumberDanaTransaksi());
            BankTransfer bankTransfer25 = ubahdata.f296o;
            if (bankTransfer25 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer25 = null;
            }
            bankTransfer6.setSumberDanaTransaksiCode(bankTransfer25.getSumberDanaTransaksiCode());
            BankTransfer bankTransfer26 = ubahdata.f296o;
            if (bankTransfer26 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer26 = null;
            }
            bankTransfer6.setTujuanTransaksi(bankTransfer26.getTujuanTransaksi());
            BankTransfer bankTransfer27 = ubahdata.f296o;
            if (bankTransfer27 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer27 = null;
            }
            bankTransfer6.setTujuanTransaksiCode(bankTransfer27.getTujuanTransaksiCode());
            BankTransfer bankTransfer28 = ubahdata.f296o;
            if (bankTransfer28 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer28 = null;
            }
            bankTransfer6.setJenisWarkatTransaksi(bankTransfer28.getJenisWarkatTransaksi());
            BankTransfer bankTransfer29 = ubahdata.f296o;
            if (bankTransfer29 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer29 = null;
            }
            bankTransfer6.setNoWarkatTransaksi(bankTransfer29.getNoWarkatTransaksi());
            BankTransfer bankTransfer30 = ubahdata.f296o;
            if (bankTransfer30 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer30 = null;
            }
            bankTransfer6.setWaktuPengirimanTransaksi(bankTransfer30.getWaktuPengirimanTransaksi());
            BankTransfer bankTransfer31 = ubahdata.f296o;
            if (bankTransfer31 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer31 = null;
            }
            bankTransfer6.setTanggalJatuhTempoTransaksi(bankTransfer31.getTanggalJatuhTempoTransaksi());
            bankTransfer3 = ubahdata.f296o;
            if (bankTransfer3 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            bankTransfer6.setAccType(bankTransfer3.getAccType());
            ubahdata.J().getBankTransfers().add(bankTransfer6);
            return;
        }
        BankTransfer bankTransfer32 = ubahdata.f296o;
        if (bankTransfer32 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer32 = null;
        }
        bankTransfer4.setCurrentPage(bankTransfer32.getCurrentPage());
        BankTransfer bankTransfer33 = ubahdata.f296o;
        if (bankTransfer33 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer33 = null;
        }
        bankTransfer4.setCreatedAt(bankTransfer33.getCreatedAt());
        BankTransfer bankTransfer34 = ubahdata.f296o;
        if (bankTransfer34 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer34 = null;
        }
        bankTransfer4.setNamaPengirim(bankTransfer34.getNamaPengirim());
        BankTransfer bankTransfer35 = ubahdata.f296o;
        if (bankTransfer35 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer35 = null;
        }
        bankTransfer4.setNorekPengirim(bankTransfer35.getNorekPengirim());
        BankTransfer bankTransfer36 = ubahdata.f296o;
        if (bankTransfer36 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer36 = null;
        }
        bankTransfer4.setAlamatPengirim(bankTransfer36.getAlamatPengirim());
        BankTransfer bankTransfer37 = ubahdata.f296o;
        if (bankTransfer37 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer37 = null;
        }
        bankTransfer4.setTipeNasabahPengirim(bankTransfer37.getTipeNasabahPengirim());
        BankTransfer bankTransfer38 = ubahdata.f296o;
        if (bankTransfer38 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer38 = null;
        }
        bankTransfer4.setTipeNasabahPengirimId(bankTransfer38.getTipeNasabahPengirimId());
        BankTransfer bankTransfer39 = ubahdata.f296o;
        if (bankTransfer39 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer39 = null;
        }
        bankTransfer4.setStatusPendudukPengirim(bankTransfer39.getStatusPendudukPengirim());
        BankTransfer bankTransfer40 = ubahdata.f296o;
        if (bankTransfer40 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer40 = null;
        }
        bankTransfer4.setStatusKewarganegaraanPengirim(bankTransfer40.getStatusKewarganegaraanPengirim());
        BankTransfer bankTransfer41 = ubahdata.f296o;
        if (bankTransfer41 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer41 = null;
        }
        bankTransfer4.setNamaKontakPengirim(bankTransfer41.getNamaKontakPengirim());
        BankTransfer bankTransfer42 = ubahdata.f296o;
        if (bankTransfer42 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer42 = null;
        }
        bankTransfer4.setNoHpKontakPengirim(bankTransfer42.getNoHpKontakPengirim());
        BankTransfer bankTransfer43 = ubahdata.f296o;
        if (bankTransfer43 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer43 = null;
        }
        bankTransfer4.setNoTelpKontakPengirim(bankTransfer43.getNoTelpKontakPengirim());
        bankTransfer4.getPenerimaList().clear();
        BankTransfer bankTransfer44 = ubahdata.f296o;
        if (bankTransfer44 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer44 = null;
        }
        Iterator<BankTransferPenerima> it2 = bankTransfer44.getPenerimaList().iterator();
        while (it2.hasNext()) {
            BankTransferPenerima next2 = it2.next();
            subscribeReservationRescheduleEvent.d(next2, "");
            BankTransferPenerima bankTransferPenerima3 = next2;
            BankTransferPenerima bankTransferPenerima4 = new BankTransferPenerima();
            bankTransferPenerima4.setId(bankTransferPenerima3.getId());
            bankTransferPenerima4.setNamaPenerima(bankTransferPenerima3.getNamaPenerima());
            bankTransferPenerima4.setNorekPenerima(bankTransferPenerima3.getNorekPenerima());
            bankTransferPenerima4.setBankTujuanPenerima(bankTransferPenerima3.getBankTujuanPenerima());
            bankTransferPenerima4.setBankTujuanCode(bankTransferPenerima3.getBankTujuanCode());
            bankTransferPenerima4.setBankTujuanOfficeCode(bankTransferPenerima3.getBankTujuanOfficeCode());
            bankTransferPenerima4.setBankTujuanBIC(bankTransferPenerima3.getBankTujuanBIC());
            bankTransferPenerima4.setNominalPenerima(bankTransferPenerima3.getNominalPenerima());
            bankTransferPenerima4.setBeritaPenerima(bankTransferPenerima3.getBeritaPenerima());
            bankTransferPenerima4.setAlamatPenerima(bankTransferPenerima3.getAlamatPenerima());
            bankTransferPenerima4.setTipeNasabahPenerima(bankTransferPenerima3.getTipeNasabahPenerima());
            bankTransferPenerima4.setTipeNasabahPenerimaId(bankTransferPenerima3.getTipeNasabahPenerimaId());
            bankTransferPenerima4.setStatusPendudukPenerima(bankTransferPenerima3.getStatusPendudukPenerima());
            bankTransferPenerima4.setStatusKewarganegaraanPenerima(bankTransferPenerima3.getStatusKewarganegaraanPenerima());
            bankTransferPenerima4.setMetodePengirimanPenerima(bankTransferPenerima3.getMetodePengirimanPenerima());
            bankTransferPenerima4.setBiayaTransfer(bankTransferPenerima3.getBiayaTransfer());
            bankTransferPenerima4.setFlagDaftarTransfer(bankTransferPenerima3.getFlagDaftarTransfer());
            bankTransfer4.getPenerimaList().add(bankTransferPenerima4);
        }
        BankTransfer bankTransfer45 = ubahdata.f296o;
        if (bankTransfer45 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer45 = null;
        }
        bankTransfer4.setTotalPembayaran(bankTransfer45.getTotalPembayaran());
        BankTransfer bankTransfer46 = ubahdata.f296o;
        if (bankTransfer46 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer46 = null;
        }
        bankTransfer4.setTotalNominal(bankTransfer46.getTotalNominal());
        BankTransfer bankTransfer47 = ubahdata.f296o;
        if (bankTransfer47 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer47 = null;
        }
        bankTransfer4.setTotalBiayaTransfer(bankTransfer47.getTotalBiayaTransfer());
        BankTransfer bankTransfer48 = ubahdata.f296o;
        if (bankTransfer48 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer48 = null;
        }
        bankTransfer4.setSaranaPembayaranPengirim(bankTransfer48.getSaranaPembayaranPengirim());
        BankTransfer bankTransfer49 = ubahdata.f296o;
        if (bankTransfer49 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer49 = null;
        }
        bankTransfer4.setSumberDanaTransaksi(bankTransfer49.getSumberDanaTransaksi());
        BankTransfer bankTransfer50 = ubahdata.f296o;
        if (bankTransfer50 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer50 = null;
        }
        bankTransfer4.setSumberDanaTransaksiCode(bankTransfer50.getSumberDanaTransaksiCode());
        BankTransfer bankTransfer51 = ubahdata.f296o;
        if (bankTransfer51 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer51 = null;
        }
        bankTransfer4.setTujuanTransaksi(bankTransfer51.getTujuanTransaksi());
        BankTransfer bankTransfer52 = ubahdata.f296o;
        if (bankTransfer52 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer52 = null;
        }
        bankTransfer4.setTujuanTransaksiCode(bankTransfer52.getTujuanTransaksiCode());
        BankTransfer bankTransfer53 = ubahdata.f296o;
        if (bankTransfer53 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer53 = null;
        }
        bankTransfer4.setJenisWarkatTransaksi(bankTransfer53.getJenisWarkatTransaksi());
        BankTransfer bankTransfer54 = ubahdata.f296o;
        if (bankTransfer54 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer54 = null;
        }
        bankTransfer4.setNoWarkatTransaksi(bankTransfer54.getNoWarkatTransaksi());
        BankTransfer bankTransfer55 = ubahdata.f296o;
        if (bankTransfer55 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer55 = null;
        }
        bankTransfer4.setWaktuPengirimanTransaksi(bankTransfer55.getWaktuPengirimanTransaksi());
        BankTransfer bankTransfer56 = ubahdata.f296o;
        if (bankTransfer56 == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer56 = null;
        }
        bankTransfer4.setTanggalJatuhTempoTransaksi(bankTransfer56.getTanggalJatuhTempoTransaksi());
        bankTransfer2 = ubahdata.f296o;
        if (bankTransfer2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        bankTransfer4.setAccType(bankTransfer2.getAccType());
    }

    private final void a(boolean z2, String str) {
        String str2;
        E();
        TxnTellerResponse txnTellerResponse = this.W;
        TxnTellerResponse txnTellerResponse2 = null;
        TxnTellerResponse txnTellerResponse3 = null;
        TxnTellerResponse txnTellerResponse4 = txnTellerResponse;
        if (txnTellerResponse == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerResponse4 = null;
        }
        String noReff = txnTellerResponse4.getTxnDataOutput().getNoReff();
        TxnTellerResponse txnTellerResponse5 = this.W;
        TxnTellerResponse txnTellerResponse6 = txnTellerResponse5;
        if (txnTellerResponse5 == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerResponse6 = null;
        }
        if (txnTellerResponse6.getTxnDataOutput().getDescriptionList() != null) {
            TxnTellerResponse txnTellerResponse7 = this.W;
            TxnTellerResponse txnTellerResponse8 = txnTellerResponse7;
            if (txnTellerResponse7 == null) {
                subscribeReservationRescheduleEvent.e("");
                txnTellerResponse8 = null;
            }
            txnTellerResponse8.getTxnDataOutput().getDescriptionList().get(0).getKey();
        }
        TxnTellerResponse txnTellerResponse9 = this.W;
        TxnTellerResponse txnTellerResponse10 = txnTellerResponse9;
        if (txnTellerResponse9 == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerResponse10 = null;
        }
        if (txnTellerResponse10.getTxnDataOutput().getDescriptionList() != null) {
            TxnTellerResponse txnTellerResponse11 = this.W;
            TxnTellerResponse txnTellerResponse12 = txnTellerResponse11;
            if (txnTellerResponse11 == null) {
                subscribeReservationRescheduleEvent.e("");
                txnTellerResponse12 = null;
            }
            txnTellerResponse12.getTxnDataOutput().getDescriptionList().get(0).getValue();
        }
        TxnTellerResponse txnTellerResponse13 = this.W;
        TxnTellerResponse txnTellerResponse14 = txnTellerResponse13;
        if (txnTellerResponse13 == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerResponse14 = null;
        }
        txnTellerResponse14.getTxnDataOutput().getNote();
        if (J() != null) {
            str2 = J().getEmail();
        } else {
            ListFormTeller listFormTeller = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller);
            Setoran setoran = listFormTeller.getSetoranList().get(0);
            subscribeReservationRescheduleEvent.c(setoran);
            str2 = setoran.getSenderEmail();
        }
        H().executeTransaction(new Realm.Transaction() { // from class: o.BN7PengambilanActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ubahData.d(ubahData.this, realm);
            }
        });
        if (this.R) {
            DraftBerhasilDialog draftBerhasilDialog = new DraftBerhasilDialog();
            draftBerhasilDialog.a = "transaction_teller";
            draftBerhasilDialog.show(l(), "DraftBerhasilDialog");
        } else if (this.Q) {
            Reservation reservation = new Reservation();
            reservation.setTypeTransaction("Transaksi Teller");
            reservation.setTypeReservation("NEW_RESERVATION");
            reservation.setTxnType("Transaksi CS");
            reservation.setNoReff(noReff);
            reservation.setTnxStatus("8");
            reservation.setTransactionCode(this.X);
            Intent intent = new Intent(this, BranchMapActivity.class);
            intent.putExtra("reff_no", reservation.getNoReff());
            intent.putExtra("type_transaksi", reservation.getTypeTransaction());
            intent.putExtra("type_reservation", reservation.getTypeReservation());
            intent.putExtra("reservation_data", ListUtil.OneItemImmutableList.e(reservation));
            txnTellerResponse3 = this.W;
            if (txnTellerResponse3 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            intent.putExtra("txn_data", ListUtil.OneItemImmutableList.e(txnTellerResponse3.getTxnDataOutput()));
            intent.putExtra("is_tartun_jumbes", this.O);
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) this);
        } else {
            Intent intent2 = new Intent(this, DetailOpenTellerActivity.class);
            txnTellerResponse2 = this.W;
            if (txnTellerResponse2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            intent2.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(txnTellerResponse2.getTxnDataOutput()));
            intent2.putExtra("email", str2);
            intent2.putExtra("no_reff", noReff);
            startActivity(intent2);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    public static /* synthetic */ void b(ubahData ubahdata, Realm realm) {
        subscribeReservationRescheduleEvent.e(ubahdata, "");
        RealmQuery where = ubahdata.H().where(BankTransfer.class);
        BankTransfer bankTransfer = ubahdata.f296o;
        if (bankTransfer == null) {
            subscribeReservationRescheduleEvent.e("");
            bankTransfer = null;
        }
        BankTransfer bankTransfer2 = (BankTransfer) where.equalTo("id", Long.valueOf(bankTransfer.getId())).findFirst();
        if (bankTransfer2 != null) {
            bankTransfer2.deleteFromRealm();
        }
        ubahdata.startActivity(new Intent(ubahdata, MainActivity.class));
        ubahdata.overridePendingTransition(17432578, 17432579);
    }

    public static /* synthetic */ int c(TxnTellerRequest.TxnDataInput txnDataInput, TxnTellerRequest.TxnDataInput txnDataInput2) {
        subscribeReservationRescheduleEvent.e(txnDataInput, "");
        subscribeReservationRescheduleEvent.e(txnDataInput2, "");
        long longValue = txnDataInput.getCreatedAt().longValue();
        Long createdAt = txnDataInput2.getCreatedAt();
        subscribeReservationRescheduleEvent.d(createdAt, "");
        return subscribeReservationRescheduleEvent.a(longValue, createdAt.longValue());
    }

    private void d(int i, Fragment fragment, String str) {
        subscribeReservationRescheduleEvent.e(fragment, "");
        subscribeReservationRescheduleEvent.e(str, "");
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        subscribeReservationRescheduleEvent.d(getuservisiblehint, "");
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    public static /* synthetic */ void d(ubahData ubahdata, Realm realm) {
        subscribeReservationRescheduleEvent.e(ubahdata, "");
        ListFormTeller listFormTeller = ubahdata.y;
        if (listFormTeller != null) {
            subscribeReservationRescheduleEvent.c(listFormTeller);
            if (listFormTeller.getSetoranList() != null) {
                ListFormTeller listFormTeller2 = ubahdata.y;
                subscribeReservationRescheduleEvent.c(listFormTeller2);
                if (listFormTeller2.getSetoranList().isValid()) {
                    ListFormTeller listFormTeller3 = ubahdata.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller3);
                    listFormTeller3.getSetoranList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller4 = ubahdata.y;
            subscribeReservationRescheduleEvent.c(listFormTeller4);
            if (listFormTeller4.getTarikanList() != null) {
                ListFormTeller listFormTeller5 = ubahdata.y;
                subscribeReservationRescheduleEvent.c(listFormTeller5);
                if (listFormTeller5.getTarikanList().isValid()) {
                    ListFormTeller listFormTeller6 = ubahdata.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller6);
                    listFormTeller6.getTarikanList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller7 = ubahdata.y;
            subscribeReservationRescheduleEvent.c(listFormTeller7);
            if (listFormTeller7.getKirimanUangList() != null) {
                ListFormTeller listFormTeller8 = ubahdata.y;
                subscribeReservationRescheduleEvent.c(listFormTeller8);
                if (listFormTeller8.getKirimanUangList().isValid()) {
                    ListFormTeller listFormTeller9 = ubahdata.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller9);
                    listFormTeller9.getKirimanUangList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller10 = ubahdata.y;
            subscribeReservationRescheduleEvent.c(listFormTeller10);
            if (listFormTeller10.getKliringList() != null) {
                ListFormTeller listFormTeller11 = ubahdata.y;
                subscribeReservationRescheduleEvent.c(listFormTeller11);
                if (listFormTeller11.getKliringList().isValid()) {
                    ListFormTeller listFormTeller12 = ubahdata.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller12);
                    listFormTeller12.getKliringList().deleteAllFromRealm();
                }
            }
            ListFormTeller listFormTeller13 = ubahdata.y;
            if (listFormTeller13 != null) {
                subscribeReservationRescheduleEvent.c(listFormTeller13);
                if (listFormTeller13.isValid()) {
                    ListFormTeller listFormTeller14 = ubahdata.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller14);
                    listFormTeller14.deleteFromRealm();
                }
            }
        }
    }

    public static /* synthetic */ void e(ubahData ubahdata, Realm realm) {
        subscribeReservationRescheduleEvent.e(ubahdata, "");
        ListFormTeller listFormTeller = (ListFormTeller) realm.where(ListFormTeller.class).findFirst();
        ubahdata.y = listFormTeller;
        if (listFormTeller == null) {
            ubahdata.y = (ListFormTeller) realm.createObject(ListFormTeller.class, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final LinearLayout B() {
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = this.m;
        if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = null;
        }
        LinearLayout linearLayout = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding.j;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    public final View C() {
        RelativeLayout relativeLayout = ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).b.e;
        subscribeReservationRescheduleEvent.d(relativeLayout, "");
        return relativeLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final View D() {
        LinearLayout linearLayout = ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).e;
        subscribeReservationRescheduleEvent.d(linearLayout, "");
        return linearLayout;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void G() {
        setCardSlogan.e().b = this.K;
        h(this.K);
    }

    public final boolean I() {
        if (this.q) {
            return true;
        }
        ListFormTeller listFormTeller = this.y;
        RealmList<BankTransfer> bankTransferList = listFormTeller != null ? listFormTeller.getBankTransferList() : null;
        if (bankTransferList == null) {
            return false;
        }
        int size = bankTransferList.size();
        for (int i = 0; i < size; i++) {
            BankTransfer bankTransfer = bankTransferList.get(i);
            if (bankTransfer != null && bankTransfer.isHasManyPenerima()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        subscribeReservationRescheduleEvent.c((Object) str);
        a(false, str);
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        E();
        if (this.W == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        a(false, "");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(TxnTellerResponse txnTellerResponse) {
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", J().getImei());
        bundle.putString("email", J().getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0326  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(boolean r8) {
        /*
        // Method dump skipped, instructions count: 5146
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ubahData.b(boolean):void");
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void b_(String str) {
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
        Parcelable parcelable;
        c(bundle);
        this.T = getResources().getString(2131820574);
        BankTransfer bankTransfer = null;
        Drawable drawable = getResources().getDrawable(2131231203, null);
        subscribeReservationRescheduleEvent.d(drawable, "");
        subscribeReservationRescheduleEvent.e(drawable, "");
        this.r = drawable;
        Drawable drawable2 = getResources().getDrawable(2131231202, null);
        subscribeReservationRescheduleEvent.d(drawable2, "");
        subscribeReservationRescheduleEvent.e(drawable2, "");
        this.t = drawable2;
        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).d;
        subscribeReservationRescheduleEvent.d(listKodePosAdapter$ListKodePosAdapterVH_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(listKodePosAdapter$ListKodePosAdapterVH_ViewBinding, "");
        this.m = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding;
        b(((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).b.b);
        subscribeReservationRescheduleEvent.c(i());
        setBackgroundResource i = i();
        subscribeReservationRescheduleEvent.c(i);
        i.d(true);
        setBackgroundResource i2 = i();
        subscribeReservationRescheduleEvent.c(i2);
        i2.d("");
        ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).b.c.setText(Html.fromHtml(this.T));
        if (J().getVerified().equals("Y")) {
            this.p = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("ListAcct"));
        }
        H().executeTransaction(new Realm.Transaction() { // from class: o.inputChange
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ubahData.e(ubahData.this, realm);
            }
        });
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        subscribeReservationRescheduleEvent.e(getHBPresenter, "");
        this.w = getHBPresenter;
        if (getHBPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            getHBPresenter = null;
        }
        getHBPresenter.e = this;
        TxnTellerPresenter txnTellerPresenter = new TxnTellerPresenter();
        this.V = txnTellerPresenter;
        txnTellerPresenter.d = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.P = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        Bundle extras = getIntent().getExtras();
        subscribeReservationRescheduleEvent.c(extras);
        this.q = extras.getBoolean(F, false);
        this.s = extras.getLong(E, 0);
        if (subscribeReservationRescheduleEvent.b((Object) J().getVerified(), (Object) "Y") && (parcelable = extras.getParcelable(H)) != null) {
            this.p = (GetCustAcctListResponse) ListUtil.OneItemImmutableList.a(parcelable);
        }
        Parcelable parcelable2 = extras.getParcelable(z);
        if (parcelable2 != null) {
            this.l = (List) ListUtil.OneItemImmutableList.a(parcelable2);
        }
        Parcelable parcelable3 = extras.getParcelable(A);
        if (parcelable3 != null) {
            Object a = ListUtil.OneItemImmutableList.a(parcelable3);
            subscribeReservationRescheduleEvent.d(a, "");
            this.n = (List) a;
        }
        Parcelable parcelable4 = extras.getParcelable(I);
        if (parcelable4 != null) {
            Object a2 = ListUtil.OneItemImmutableList.a(parcelable4);
            subscribeReservationRescheduleEvent.d(a2, "");
            this.u = (List) a2;
        }
        Parcelable parcelable5 = extras.getParcelable(L);
        if (parcelable5 != null) {
            Object a3 = ListUtil.OneItemImmutableList.a(parcelable5);
            subscribeReservationRescheduleEvent.d(a3, "");
            this.v = (List) a3;
        }
        if (extras.getBoolean(G, false)) {
            this.S = Long.valueOf(extras.getLong(J, 0));
            BankTransfer bankTransfer2 = (BankTransfer) H().where(BankTransfer.class).equalTo("id", this.S).findFirst();
            subscribeReservationRescheduleEvent.c(bankTransfer2);
            BankTransfer bankTransfer3 = new BankTransfer();
            subscribeReservationRescheduleEvent.e(bankTransfer3, "");
            this.f296o = bankTransfer3;
            if (bankTransfer3 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer3 = null;
            }
            bankTransfer3.setId(bankTransfer2.getId());
            BankTransfer bankTransfer4 = this.f296o;
            if (bankTransfer4 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer4 = null;
            }
            bankTransfer4.setCurrentPage(bankTransfer2.getCurrentPage());
            BankTransfer bankTransfer5 = this.f296o;
            if (bankTransfer5 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer5 = null;
            }
            bankTransfer5.setCreatedAt(bankTransfer2.getCreatedAt());
            BankTransfer bankTransfer6 = this.f296o;
            if (bankTransfer6 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer6 = null;
            }
            bankTransfer6.setNamaPengirim(bankTransfer2.getNamaPengirim());
            BankTransfer bankTransfer7 = this.f296o;
            if (bankTransfer7 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer7 = null;
            }
            bankTransfer7.setNorekPengirim(bankTransfer2.getNorekPengirim());
            BankTransfer bankTransfer8 = this.f296o;
            if (bankTransfer8 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer8 = null;
            }
            bankTransfer8.setAlamatPengirim(bankTransfer2.getAlamatPengirim());
            BankTransfer bankTransfer9 = this.f296o;
            if (bankTransfer9 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer9 = null;
            }
            bankTransfer9.setTipeNasabahPengirim(bankTransfer2.getTipeNasabahPengirim());
            BankTransfer bankTransfer10 = this.f296o;
            if (bankTransfer10 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer10 = null;
            }
            bankTransfer10.setTipeNasabahPengirimId(bankTransfer2.getTipeNasabahPengirimId());
            BankTransfer bankTransfer11 = this.f296o;
            if (bankTransfer11 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer11 = null;
            }
            bankTransfer11.setStatusPendudukPengirim(bankTransfer2.getStatusPendudukPengirim());
            BankTransfer bankTransfer12 = this.f296o;
            if (bankTransfer12 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer12 = null;
            }
            bankTransfer12.setStatusKewarganegaraanPengirim(bankTransfer2.getStatusKewarganegaraanPengirim());
            BankTransfer bankTransfer13 = this.f296o;
            if (bankTransfer13 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer13 = null;
            }
            bankTransfer13.setNamaKontakPengirim(bankTransfer2.getNamaKontakPengirim());
            BankTransfer bankTransfer14 = this.f296o;
            if (bankTransfer14 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer14 = null;
            }
            bankTransfer14.setNoHpKontakPengirim(bankTransfer2.getNoHpKontakPengirim());
            BankTransfer bankTransfer15 = this.f296o;
            if (bankTransfer15 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer15 = null;
            }
            bankTransfer15.setNoTelpKontakPengirim(bankTransfer2.getNoTelpKontakPengirim());
            Iterator<BankTransferPenerima> it = bankTransfer2.getPenerimaList().iterator();
            while (it.hasNext()) {
                BankTransferPenerima next = it.next();
                subscribeReservationRescheduleEvent.d(next, "");
                BankTransferPenerima bankTransferPenerima = next;
                BankTransferPenerima bankTransferPenerima2 = new BankTransferPenerima();
                bankTransferPenerima2.setId(bankTransferPenerima.getId());
                bankTransferPenerima2.setNamaPenerima(bankTransferPenerima.getNamaPenerima());
                bankTransferPenerima2.setNorekPenerima(bankTransferPenerima.getNorekPenerima());
                bankTransferPenerima2.setBankTujuanPenerima(bankTransferPenerima.getBankTujuanPenerima());
                bankTransferPenerima2.setBankTujuanCode(bankTransferPenerima.getBankTujuanCode());
                bankTransferPenerima2.setBankTujuanOfficeCode(bankTransferPenerima.getBankTujuanOfficeCode());
                bankTransferPenerima2.setBankTujuanBIC(bankTransferPenerima.getBankTujuanBIC());
                bankTransferPenerima2.setNominalPenerima(bankTransferPenerima.getNominalPenerima());
                bankTransferPenerima2.setBeritaPenerima(bankTransferPenerima.getBeritaPenerima());
                bankTransferPenerima2.setAlamatPenerima(bankTransferPenerima.getAlamatPenerima());
                bankTransferPenerima2.setTipeNasabahPenerima(bankTransferPenerima.getTipeNasabahPenerima());
                bankTransferPenerima2.setTipeNasabahPenerimaId(bankTransferPenerima.getTipeNasabahPenerimaId());
                bankTransferPenerima2.setStatusPendudukPenerima(bankTransferPenerima.getStatusPendudukPenerima());
                bankTransferPenerima2.setStatusKewarganegaraanPenerima(bankTransferPenerima.getStatusKewarganegaraanPenerima());
                bankTransferPenerima2.setMetodePengirimanPenerima(bankTransferPenerima.getMetodePengirimanPenerima());
                bankTransferPenerima2.setBiayaTransfer(bankTransferPenerima.getBiayaTransfer());
                bankTransferPenerima2.setFlagDaftarTransfer(bankTransferPenerima.getFlagDaftarTransfer());
                BankTransfer bankTransfer16 = this.f296o;
                if (bankTransfer16 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    bankTransfer16 = null;
                }
                bankTransfer16.getPenerimaList().add(bankTransferPenerima2);
            }
            BankTransfer bankTransfer17 = this.f296o;
            if (bankTransfer17 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer17 = null;
            }
            bankTransfer17.setTotalPembayaran(bankTransfer2.getTotalPembayaran());
            BankTransfer bankTransfer18 = this.f296o;
            if (bankTransfer18 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer18 = null;
            }
            bankTransfer18.setTotalNominal(bankTransfer2.getTotalNominal());
            BankTransfer bankTransfer19 = this.f296o;
            if (bankTransfer19 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer19 = null;
            }
            bankTransfer19.setTotalBiayaTransfer(bankTransfer2.getTotalBiayaTransfer());
            BankTransfer bankTransfer20 = this.f296o;
            if (bankTransfer20 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer20 = null;
            }
            bankTransfer20.setSaranaPembayaranPengirim(bankTransfer2.getSaranaPembayaranPengirim());
            BankTransfer bankTransfer21 = this.f296o;
            if (bankTransfer21 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer21 = null;
            }
            bankTransfer21.setSumberDanaTransaksi(bankTransfer2.getSumberDanaTransaksi());
            BankTransfer bankTransfer22 = this.f296o;
            if (bankTransfer22 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer22 = null;
            }
            bankTransfer22.setSumberDanaTransaksiCode(bankTransfer2.getSumberDanaTransaksiCode());
            BankTransfer bankTransfer23 = this.f296o;
            if (bankTransfer23 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer23 = null;
            }
            bankTransfer23.setTujuanTransaksi(bankTransfer2.getTujuanTransaksi());
            BankTransfer bankTransfer24 = this.f296o;
            if (bankTransfer24 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer24 = null;
            }
            bankTransfer24.setTujuanTransaksiCode(bankTransfer2.getTujuanTransaksiCode());
            BankTransfer bankTransfer25 = this.f296o;
            if (bankTransfer25 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer25 = null;
            }
            bankTransfer25.setJenisWarkatTransaksi(bankTransfer2.getJenisWarkatTransaksi());
            BankTransfer bankTransfer26 = this.f296o;
            if (bankTransfer26 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer26 = null;
            }
            bankTransfer26.setNoWarkatTransaksi(bankTransfer2.getNoWarkatTransaksi());
            BankTransfer bankTransfer27 = this.f296o;
            if (bankTransfer27 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer27 = null;
            }
            bankTransfer27.setWaktuPengirimanTransaksi(bankTransfer2.getWaktuPengirimanTransaksi());
            BankTransfer bankTransfer28 = this.f296o;
            if (bankTransfer28 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer28 = null;
            }
            bankTransfer28.setTanggalJatuhTempoTransaksi(bankTransfer2.getTanggalJatuhTempoTransaksi());
            BankTransfer bankTransfer29 = this.f296o;
            if (bankTransfer29 == null) {
                subscribeReservationRescheduleEvent.e("");
                bankTransfer29 = null;
            }
            bankTransfer29.setAccType(bankTransfer2.getAccType());
        } else {
            BankTransfer bankTransfer30 = new BankTransfer();
            subscribeReservationRescheduleEvent.e(bankTransfer30, "");
            this.f296o = bankTransfer30;
            if (this.q) {
                BankTransfer bankTransfer31 = (BankTransfer) H().where(BankTransfer.class).equalTo("id", Long.valueOf(this.s)).findFirst();
                if (bankTransfer31 != null) {
                    BankTransfer bankTransfer32 = this.f296o;
                    if (bankTransfer32 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer32 = null;
                    }
                    bankTransfer32.setId(this.s);
                    BankTransfer bankTransfer33 = this.f296o;
                    if (bankTransfer33 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer33 = null;
                    }
                    bankTransfer33.setCurrentPage("BankTransferReview");
                    BankTransfer bankTransfer34 = this.f296o;
                    if (bankTransfer34 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer34 = null;
                    }
                    bankTransfer34.setCreatedAt(bankTransfer31.getCreatedAt());
                    BankTransfer bankTransfer35 = this.f296o;
                    if (bankTransfer35 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer35 = null;
                    }
                    bankTransfer35.setNamaPengirim(bankTransfer31.getNamaPengirim());
                    BankTransfer bankTransfer36 = this.f296o;
                    if (bankTransfer36 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer36 = null;
                    }
                    bankTransfer36.setNorekPengirim(bankTransfer31.getNorekPengirim());
                    BankTransfer bankTransfer37 = this.f296o;
                    if (bankTransfer37 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer37 = null;
                    }
                    bankTransfer37.setAlamatPengirim(bankTransfer31.getAlamatPengirim());
                    BankTransfer bankTransfer38 = this.f296o;
                    if (bankTransfer38 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer38 = null;
                    }
                    bankTransfer38.setTipeNasabahPengirim(bankTransfer31.getTipeNasabahPengirim());
                    BankTransfer bankTransfer39 = this.f296o;
                    if (bankTransfer39 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer39 = null;
                    }
                    bankTransfer39.setTipeNasabahPengirimId(bankTransfer31.getTipeNasabahPengirimId());
                    BankTransfer bankTransfer40 = this.f296o;
                    if (bankTransfer40 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer40 = null;
                    }
                    bankTransfer40.setStatusPendudukPengirim(bankTransfer31.getStatusPendudukPengirim());
                    BankTransfer bankTransfer41 = this.f296o;
                    if (bankTransfer41 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer41 = null;
                    }
                    bankTransfer41.setStatusKewarganegaraanPengirim(bankTransfer31.getStatusKewarganegaraanPengirim());
                    BankTransfer bankTransfer42 = this.f296o;
                    if (bankTransfer42 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer42 = null;
                    }
                    bankTransfer42.setNamaKontakPengirim(bankTransfer31.getNamaKontakPengirim());
                    BankTransfer bankTransfer43 = this.f296o;
                    if (bankTransfer43 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer43 = null;
                    }
                    bankTransfer43.setNoHpKontakPengirim(bankTransfer31.getNoHpKontakPengirim());
                    BankTransfer bankTransfer44 = this.f296o;
                    if (bankTransfer44 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer44 = null;
                    }
                    bankTransfer44.setNoTelpKontakPengirim(bankTransfer31.getNoTelpKontakPengirim());
                    Iterator<BankTransferPenerima> it2 = bankTransfer31.getPenerimaList().iterator();
                    while (it2.hasNext()) {
                        BankTransferPenerima next2 = it2.next();
                        subscribeReservationRescheduleEvent.d(next2, "");
                        BankTransferPenerima bankTransferPenerima3 = next2;
                        BankTransferPenerima bankTransferPenerima4 = new BankTransferPenerima();
                        bankTransferPenerima4.setId(bankTransferPenerima3.getId());
                        bankTransferPenerima4.setNamaPenerima(bankTransferPenerima3.getNamaPenerima());
                        bankTransferPenerima4.setNorekPenerima(bankTransferPenerima3.getNorekPenerima());
                        bankTransferPenerima4.setBankTujuanPenerima(bankTransferPenerima3.getBankTujuanPenerima());
                        bankTransferPenerima4.setBankTujuanCode(bankTransferPenerima3.getBankTujuanCode());
                        bankTransferPenerima4.setBankTujuanOfficeCode(bankTransferPenerima3.getBankTujuanOfficeCode());
                        bankTransferPenerima4.setBankTujuanBIC(bankTransferPenerima3.getBankTujuanBIC());
                        bankTransferPenerima4.setNominalPenerima(bankTransferPenerima3.getNominalPenerima());
                        bankTransferPenerima4.setBeritaPenerima(bankTransferPenerima3.getBeritaPenerima());
                        bankTransferPenerima4.setAlamatPenerima(bankTransferPenerima3.getAlamatPenerima());
                        bankTransferPenerima4.setTipeNasabahPenerima(bankTransferPenerima3.getTipeNasabahPenerima());
                        bankTransferPenerima4.setTipeNasabahPenerimaId(bankTransferPenerima3.getTipeNasabahPenerimaId());
                        bankTransferPenerima4.setStatusPendudukPenerima(bankTransferPenerima3.getStatusPendudukPenerima());
                        bankTransferPenerima4.setStatusKewarganegaraanPenerima(bankTransferPenerima3.getStatusKewarganegaraanPenerima());
                        bankTransferPenerima4.setMetodePengirimanPenerima(bankTransferPenerima3.getMetodePengirimanPenerima());
                        bankTransferPenerima4.setBiayaTransfer(bankTransferPenerima3.getBiayaTransfer());
                        bankTransferPenerima4.setFlagDaftarTransfer(bankTransferPenerima3.getFlagDaftarTransfer());
                        BankTransfer bankTransfer45 = this.f296o;
                        if (bankTransfer45 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            bankTransfer45 = null;
                        }
                        bankTransfer45.getPenerimaList().add(bankTransferPenerima4);
                    }
                    BankTransfer bankTransfer46 = this.f296o;
                    if (bankTransfer46 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer46 = null;
                    }
                    bankTransfer46.setTotalPembayaran(bankTransfer31.getTotalPembayaran());
                    BankTransfer bankTransfer47 = this.f296o;
                    if (bankTransfer47 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer47 = null;
                    }
                    bankTransfer47.setTotalNominal(bankTransfer31.getTotalNominal());
                    BankTransfer bankTransfer48 = this.f296o;
                    if (bankTransfer48 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer48 = null;
                    }
                    bankTransfer48.setTotalBiayaTransfer(bankTransfer31.getTotalBiayaTransfer());
                    BankTransfer bankTransfer49 = this.f296o;
                    if (bankTransfer49 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer49 = null;
                    }
                    bankTransfer49.setSaranaPembayaranPengirim(bankTransfer31.getSaranaPembayaranPengirim());
                    BankTransfer bankTransfer50 = this.f296o;
                    if (bankTransfer50 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer50 = null;
                    }
                    bankTransfer50.setSumberDanaTransaksi(bankTransfer31.getSumberDanaTransaksi());
                    BankTransfer bankTransfer51 = this.f296o;
                    if (bankTransfer51 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer51 = null;
                    }
                    bankTransfer51.setSumberDanaTransaksiCode(bankTransfer31.getSumberDanaTransaksiCode());
                    BankTransfer bankTransfer52 = this.f296o;
                    if (bankTransfer52 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer52 = null;
                    }
                    bankTransfer52.setTujuanTransaksi(bankTransfer31.getTujuanTransaksi());
                    BankTransfer bankTransfer53 = this.f296o;
                    if (bankTransfer53 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer53 = null;
                    }
                    bankTransfer53.setTujuanTransaksiCode(bankTransfer31.getTujuanTransaksiCode());
                    BankTransfer bankTransfer54 = this.f296o;
                    if (bankTransfer54 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer54 = null;
                    }
                    bankTransfer54.setJenisWarkatTransaksi(bankTransfer31.getJenisWarkatTransaksi());
                    BankTransfer bankTransfer55 = this.f296o;
                    if (bankTransfer55 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer55 = null;
                    }
                    bankTransfer55.setNoWarkatTransaksi(bankTransfer31.getNoWarkatTransaksi());
                    BankTransfer bankTransfer56 = this.f296o;
                    if (bankTransfer56 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer56 = null;
                    }
                    bankTransfer56.setWaktuPengirimanTransaksi(bankTransfer31.getWaktuPengirimanTransaksi());
                    BankTransfer bankTransfer57 = this.f296o;
                    if (bankTransfer57 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer57 = null;
                    }
                    bankTransfer57.setTanggalJatuhTempoTransaksi(bankTransfer31.getTanggalJatuhTempoTransaksi());
                    BankTransfer bankTransfer58 = this.f296o;
                    if (bankTransfer58 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer58 = null;
                    }
                    bankTransfer58.setAccType(bankTransfer31.getAccType());
                } else {
                    BankTransfer bankTransfer59 = this.f296o;
                    if (bankTransfer59 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer59 = null;
                    }
                    bankTransfer59.setId(this.s);
                    BankTransfer bankTransfer60 = this.f296o;
                    if (bankTransfer60 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        bankTransfer60 = null;
                    }
                    bankTransfer60.setCreatedAt(this.s);
                }
            } else {
                if (bankTransfer30 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    bankTransfer30 = null;
                }
                bankTransfer30.setId(System.currentTimeMillis());
                BankTransfer bankTransfer61 = this.f296o;
                if (bankTransfer61 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    bankTransfer61 = null;
                }
                bankTransfer61.setCreatedAt(System.currentTimeMillis());
            }
        }
        bankTransfer = this.f296o;
        if (bankTransfer == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        String currentPage = bankTransfer.getCurrentPage();
        if (currentPage != null) {
            switch (currentPage.hashCode()) {
                case -2143134985:
                    if (currentPage.equals("BankTransferDataTransaksi")) {
                        d(2131296811, new UbahMasterCardAdapter$ViewHolder_ViewBinding(), "BankTransferDataTransaksi");
                        return;
                    }
                    break;
                case -1946471307:
                    if (currentPage.equals("BankTransferDataPengirimA")) {
                        d(2131296811, new TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding(), "BankTransferDataPengirimA");
                        return;
                    }
                    break;
                case -1946471306:
                    if (currentPage.equals("BankTransferDataPengirimB")) {
                        d(2131296811, new TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding(), "BankTransferDataPengirimB");
                        return;
                    }
                    break;
                case -580733793:
                    if (currentPage.equals("BankTransferReview")) {
                        d(2131296811, new UbahVisaCardAdapter$ViewHolder_ViewBinding(), "BankTransferReview");
                        return;
                    }
                    break;
                case 1714888068:
                    if (currentPage.equals("BankTransferInputDataPenerima")) {
                        d(2131296811, new UbahSubMasterCardAdapter$ViewHolder(), "BankTransferInputDataPenerima");
                        return;
                    }
                    break;
            }
        }
        d(2131296811, new TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding(), "BankTransferDataPengirimA");
    }

    @Override // o.getView
    public final void c(Fragment fragment) {
        boolean z2;
        subscribeReservationRescheduleEvent.e(fragment, "");
        c(fragment);
        BankTransfer bankTransfer = null;
        BankTransfer bankTransfer2 = null;
        BankTransfer bankTransfer3 = null;
        BankTransfer bankTransfer4 = null;
        BankTransfer bankTransfer5 = null;
        BankTransfer bankTransfer6 = null;
        try {
            String tag = fragment.getTag();
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a;
            boolean z3 = true;
            if (subscribeReservationRescheduleEvent.b((Object) tag, (Object) TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e)) {
                z2 = true;
            } else {
                TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.c;
                z2 = subscribeReservationRescheduleEvent.b((Object) tag, (Object) TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b);
            }
            if (z2) {
                a(1);
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = this.m;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding = null;
                }
                ProgressBar progressBar = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding.g;
                subscribeReservationRescheduleEvent.d(progressBar, "");
                subscribeReservationRescheduleEvent.e(progressBar, "");
                progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = this.m;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2 = null;
                }
                ProgressBar progressBar2 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding2.l;
                subscribeReservationRescheduleEvent.d(progressBar2, "");
                subscribeReservationRescheduleEvent.e(progressBar2, "");
                progressBar2.startAnimation(new getCardName(progressBar2, 0.0f));
                ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = this.m;
                if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3 = null;
                }
                ProgressBar progressBar3 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding3.n;
                subscribeReservationRescheduleEvent.d(progressBar3, "");
                subscribeReservationRescheduleEvent.e(progressBar3, "");
                progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
            } else {
                UbahSubMasterCardAdapter$ViewHolder.write write2 = UbahSubMasterCardAdapter$ViewHolder.e;
                if (!subscribeReservationRescheduleEvent.b((Object) tag, (Object) UbahSubMasterCardAdapter$ViewHolder.d)) {
                    TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.b;
                    z3 = subscribeReservationRescheduleEvent.b((Object) tag, (Object) TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.g);
                }
                if (z3) {
                    a(2);
                    ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = this.m;
                    if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4 = null;
                    }
                    ProgressBar progressBar4 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding4.g;
                    subscribeReservationRescheduleEvent.d(progressBar4, "");
                    subscribeReservationRescheduleEvent.e(progressBar4, "");
                    progressBar4.startAnimation(new getCardName(progressBar4, 100.0f));
                    ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = this.m;
                    if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5 = null;
                    }
                    ProgressBar progressBar5 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding5.l;
                    subscribeReservationRescheduleEvent.d(progressBar5, "");
                    subscribeReservationRescheduleEvent.e(progressBar5, "");
                    progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
                    ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = this.m;
                    if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 == null) {
                        subscribeReservationRescheduleEvent.e("");
                        listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6 = null;
                    }
                    ProgressBar progressBar6 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding6.n;
                    subscribeReservationRescheduleEvent.d(progressBar6, "");
                    subscribeReservationRescheduleEvent.e(progressBar6, "");
                    progressBar6.startAnimation(new getCardName(progressBar6, 0.0f));
                } else {
                    UbahMasterCardAdapter$ViewHolder_ViewBinding.write write3 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
                    if (subscribeReservationRescheduleEvent.b((Object) tag, (Object) UbahMasterCardAdapter$ViewHolder_ViewBinding.g)) {
                        a(3);
                        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = this.m;
                        if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7 = null;
                        }
                        ProgressBar progressBar7 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding7.g;
                        subscribeReservationRescheduleEvent.d(progressBar7, "");
                        subscribeReservationRescheduleEvent.e(progressBar7, "");
                        progressBar7.startAnimation(new getCardName(progressBar7, 100.0f));
                        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = this.m;
                        if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8 = null;
                        }
                        ProgressBar progressBar8 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding8.l;
                        subscribeReservationRescheduleEvent.d(progressBar8, "");
                        subscribeReservationRescheduleEvent.e(progressBar8, "");
                        progressBar8.startAnimation(new getCardName(progressBar8, 100.0f));
                        ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = this.m;
                        if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 == null) {
                            subscribeReservationRescheduleEvent.e("");
                            listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9 = null;
                        }
                        ProgressBar progressBar9 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding9.n;
                        subscribeReservationRescheduleEvent.d(progressBar9, "");
                        subscribeReservationRescheduleEvent.e(progressBar9, "");
                        progressBar9.startAnimation(new getCardName(progressBar9, 0.0f));
                    } else {
                        UbahVisaCardAdapter$ViewHolder_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = UbahVisaCardAdapter$ViewHolder_ViewBinding.a;
                        if (subscribeReservationRescheduleEvent.b((Object) tag, (Object) UbahVisaCardAdapter$ViewHolder_ViewBinding.d)) {
                            a(4);
                            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = this.m;
                            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 == null) {
                                subscribeReservationRescheduleEvent.e("");
                                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10 = null;
                            }
                            ProgressBar progressBar10 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding10.g;
                            subscribeReservationRescheduleEvent.d(progressBar10, "");
                            subscribeReservationRescheduleEvent.e(progressBar10, "");
                            progressBar10.startAnimation(new getCardName(progressBar10, 100.0f));
                            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = this.m;
                            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 == null) {
                                subscribeReservationRescheduleEvent.e("");
                                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11 = null;
                            }
                            ProgressBar progressBar11 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding11.l;
                            subscribeReservationRescheduleEvent.d(progressBar11, "");
                            subscribeReservationRescheduleEvent.e(progressBar11, "");
                            progressBar11.startAnimation(new getCardName(progressBar11, 100.0f));
                            ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = this.m;
                            if (listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 == null) {
                                subscribeReservationRescheduleEvent.e("");
                                listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12 = null;
                            }
                            ProgressBar progressBar12 = listKodePosAdapter$ListKodePosAdapterVH_ViewBinding12.n;
                            subscribeReservationRescheduleEvent.d(progressBar12, "");
                            subscribeReservationRescheduleEvent.e(progressBar12, "");
                            progressBar12.startAnimation(new getCardName(progressBar12, 100.0f));
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("FormActivity : ");
            sb.append(e);
            Log.i("EBRANCH", sb.toString());
        }
        String tag2 = fragment.getTag();
        TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer2 = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e)) {
            bankTransfer6 = this.f296o;
            if (bankTransfer6 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.IconCompatParcelizer iconCompatParcelizer3 = TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.a;
            bankTransfer6.setCurrentPage(TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.e);
            return;
        }
        TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.c;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b)) {
            bankTransfer = this.f296o;
            if (bankTransfer == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver tujuanPemrekAdapter$TujuanPemrekVH_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.c;
            bankTransfer.setCurrentPage(TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.b);
            return;
        }
        UbahSubMasterCardAdapter$ViewHolder.write write4 = UbahSubMasterCardAdapter$ViewHolder.e;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) UbahSubMasterCardAdapter$ViewHolder.d)) {
            bankTransfer2 = this.f296o;
            if (bankTransfer2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            UbahSubMasterCardAdapter$ViewHolder.write write5 = UbahSubMasterCardAdapter$ViewHolder.e;
            bankTransfer2.setCurrentPage(UbahSubMasterCardAdapter$ViewHolder.d);
            return;
        }
        TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.b;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) TransaksiBerhasilWarkatLIstAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.g)) {
            bankTransfer3 = this.f296o;
            if (bankTransfer3 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            UbahSubMasterCardAdapter$ViewHolder.write write6 = UbahSubMasterCardAdapter$ViewHolder.e;
            bankTransfer3.setCurrentPage(UbahSubMasterCardAdapter$ViewHolder.d);
            return;
        }
        UbahMasterCardAdapter$ViewHolder_ViewBinding.write write7 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) UbahMasterCardAdapter$ViewHolder_ViewBinding.g)) {
            bankTransfer4 = this.f296o;
            if (bankTransfer4 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            UbahMasterCardAdapter$ViewHolder_ViewBinding.write write8 = UbahMasterCardAdapter$ViewHolder_ViewBinding.e;
            bankTransfer4.setCurrentPage(UbahMasterCardAdapter$ViewHolder_ViewBinding.g);
            return;
        }
        UbahVisaCardAdapter$ViewHolder_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = UbahVisaCardAdapter$ViewHolder_ViewBinding.a;
        if (subscribeReservationRescheduleEvent.b((Object) tag2, (Object) UbahVisaCardAdapter$ViewHolder_ViewBinding.d)) {
            bankTransfer5 = this.f296o;
            if (bankTransfer5 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            UbahVisaCardAdapter$ViewHolder_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = UbahVisaCardAdapter$ViewHolder_ViewBinding.a;
            bankTransfer5.setCurrentPage(UbahVisaCardAdapter$ViewHolder_ViewBinding.d);
        }
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer
    public final void c(TxnTellerResponse txnTellerResponse) {
        subscribeReservationRescheduleEvent.e(txnTellerResponse, "");
        this.W = txnTellerResponse;
        String email = J().getEmail();
        subscribeReservationRescheduleEvent.d(email, "");
        if (email.length() == 0) {
            ListFormTeller listFormTeller = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller);
            if (!listFormTeller.getSetoranList().isEmpty()) {
                ListFormTeller listFormTeller2 = this.y;
                subscribeReservationRescheduleEvent.c(listFormTeller2);
                Setoran setoran = listFormTeller2.getSetoranList().get(0);
                subscribeReservationRescheduleEvent.c(setoran);
                setoran.getSenderEmail();
            } else {
                ListFormTeller listFormTeller3 = this.y;
                subscribeReservationRescheduleEvent.c(listFormTeller3);
                if (!listFormTeller3.getTarikanList().isEmpty()) {
                    ListFormTeller listFormTeller4 = this.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller4);
                    Tarikan tarikan = listFormTeller4.getTarikanList().get(0);
                    subscribeReservationRescheduleEvent.c(tarikan);
                    tarikan.getEmail();
                }
            }
        }
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.P;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
        if (sendEmailTransactionSuccessPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            sendEmailTransactionSuccessPresenter2 = null;
        }
        sendEmailTransactionSuccessPresenter2.a(getPromotion.e(J()), J().getEmail(), new LoginSessionActivity(txnTellerResponse.getTxnDataOutput().getNoReff()));
    }

    public final void c(boolean z2) {
        e(z2);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        subscribeReservationRescheduleEvent.c((Object) str);
        a(false, str);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        subscribeReservationRescheduleEvent.c((Object) str);
        a(false, str);
    }

    @Override // com.bca.smartbranch.presenter.TxnTellerPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        N();
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
        subscribeReservationRescheduleEvent.c((Object) str);
        KeluarFormReservationDialog_ViewBinding a = KeluarFormReservationDialog_ViewBinding.a(null, ((DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding) this.N.d()).a, str, -1);
        subscribeReservationRescheduleEvent.d(a, "");
        a.g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public final void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueKeluarFormReservation(onUbahFormReservasiEvent onubahformreservasievent) {
        subscribeReservationRescheduleEvent.e(onubahformreservasievent, "");
        if (subscribeReservationRescheduleEvent.b((Object) onubahformreservasievent.b, (Object) "Y")) {
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiSuccessEChannelActivity_ViewBinding, "");
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            H().executeTransaction(new Realm.Transaction() { // from class: o.onChooseJenisId
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ubahData.b(ubahData.this, realm);
                }
            });
            return;
        }
        H().executeTransaction(new Realm.Transaction() { // from class: o.BN7PengambilanNotificationActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ubahData.a(ubahData.this, realm);
            }
        });
        ListFormTeller listFormTeller = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller);
        if (listFormTeller.getCountAll() > 0) {
            b(true);
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
        if (this.q) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin, o.setPadding, o.getView, android.app.Activity
    public final void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.w;
        if (getHBPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            getHBPresenter = null;
        }
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
        TxnTellerPresenter txnTellerPresenter = this.V;
        TxnTellerPresenter txnTellerPresenter2 = txnTellerPresenter;
        if (txnTellerPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            txnTellerPresenter2 = null;
        }
        Call<OpenAccountSuccessActivity<TxnTellerResponse>> call2 = txnTellerPresenter2.e;
        if (call2 != null) {
            call2.cancel();
        }
        txnTellerPresenter2.d = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.P;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter2 = sendEmailTransactionSuccessPresenter;
        if (sendEmailTransactionSuccessPresenter == null) {
            subscribeReservationRescheduleEvent.e("");
            sendEmailTransactionSuccessPresenter2 = null;
        }
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter2.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter2.b = null;
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
        } else if (this.q) {
            new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
        } else {
            ListFormTeller listFormTeller = this.y;
            if (listFormTeller != null) {
                subscribeReservationRescheduleEvent.c(listFormTeller);
                if (listFormTeller.getCountAll() != 0) {
                    SimpanDraftAndHitServiceDialog simpanDraftAndHitServiceDialog = new SimpanDraftAndHitServiceDialog();
                    ListFormTeller listFormTeller2 = this.y;
                    subscribeReservationRescheduleEvent.c(listFormTeller2);
                    simpanDraftAndHitServiceDialog.a = listFormTeller2.getCountAll();
                    simpanDraftAndHitServiceDialog.show(l(), "SimpanDraftAndHitServiceDialog");
                }
            }
            SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
            simpanDraftDialog.b = "transaction_teller";
            simpanDraftDialog.show(l(), "SimpanDraftDialog");
        }
        z2 = true;
        return z2;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onReservasiTellerEvent(BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding branchMapROItemAdapter$BranchMapROItemVH_ViewBinding) {
        subscribeReservationRescheduleEvent.e(branchMapROItemAdapter$BranchMapROItemVH_ViewBinding, "");
        this.Q = branchMapROItemAdapter$BranchMapROItemVH_ViewBinding.d;
        String email = J() != null ? J().getEmail() : "";
        StringBuilder sb = new StringBuilder();
        new ArrayList();
        ListFormTeller listFormTeller = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller);
        if (!listFormTeller.getSetoranList().isEmpty()) {
            ListFormTeller listFormTeller2 = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller2);
            Iterator<Setoran> it = listFormTeller2.getSetoranList().iterator();
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
        ListFormTeller listFormTeller3 = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller3);
        if (!listFormTeller3.getTarikanList().isEmpty()) {
            ListFormTeller listFormTeller4 = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller4);
            Iterator<Tarikan> it2 = listFormTeller4.getTarikanList().iterator();
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
        ListFormTeller listFormTeller5 = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller5);
        if (!listFormTeller5.getKirimanUangList().isEmpty()) {
            ListFormTeller listFormTeller6 = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller6);
            Iterator<KirimanUang> it3 = listFormTeller6.getKirimanUangList().iterator();
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
        ListFormTeller listFormTeller7 = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller7);
        if (!listFormTeller7.getBankTransferList().isEmpty()) {
            ListFormTeller listFormTeller8 = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller8);
            Iterator<BankTransfer> it4 = listFormTeller8.getBankTransferList().iterator();
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
        this.X = sb.toString();
        ListFormTeller listFormTeller9 = this.y;
        subscribeReservationRescheduleEvent.c(listFormTeller9);
        if (listFormTeller9.getTarikanList() != null) {
            ListFormTeller listFormTeller10 = this.y;
            subscribeReservationRescheduleEvent.c(listFormTeller10);
            if (!listFormTeller10.getTarikanList().isEmpty()) {
                ListFormTeller listFormTeller11 = this.y;
                subscribeReservationRescheduleEvent.c(listFormTeller11);
                Iterator<Tarikan> it5 = listFormTeller11.getTarikanList().iterator();
                while (it5.hasNext()) {
                    Tarikan next = it5.next();
                    String jumlah = next.getJumlah();
                    if (!(jumlah == null || jumlah.length() == 0)) {
                        String jumlah2 = next.getJumlah();
                        subscribeReservationRescheduleEvent.d(jumlah2, "");
                        if (Long.parseLong(jumlah2) > 100000000) {
                            this.O = true;
                        }
                    }
                }
            }
        }
        if (!this.O || this.Q) {
            b(false);
            return;
        }
        Intent intent = new Intent(this, BranchMapTarikanActivity.class);
        intent.putExtra("email", email);
        intent.putExtra("no_reff", "");
        startActivity(intent);
    }

    public final void z() {
        if (J() != null) {
            GetHBPresenter getHBPresenter = this.w;
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
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: o.ubahData.z():void, file: classes-dex2jar.jar:o/ubahData.class
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
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.w
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
            throw new UnsupportedOperationException("Method not decompiled: o.ubahData.z():void");
        }
    }
