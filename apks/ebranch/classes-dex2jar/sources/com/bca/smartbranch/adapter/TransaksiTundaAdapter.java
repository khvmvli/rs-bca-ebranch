package com.bca.smartbranch.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.activity.BN6PembayaranTundaActivity;
import com.bca.smartbranch.activity.BN7PengambilanActivity;
import com.bca.smartbranch.activity.DetailTundaActivity;
import com.bca.smartbranch.activity.DetailTundaEChannelActivity;
import com.bca.smartbranch.activity.DetailTundaReservasiROActivity;
import com.bca.smartbranch.activity.DetailTundaTellerActivity;
import com.bca.smartbranch.activity.NoAtmEChannelActivity;
import com.bca.smartbranch.adapter.TransaksiTundaAdapter;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.global.TransaksiTunda;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import o.BranchMapROItemAdapter$BranchMapROItemVH;
import o.ChooseMastercardAdapter$ViewHolder_ViewBinding;
import o.ChooseSubBCACardAdapter$ViewHolder;
import o.ChooseSubBCACardAdapter$ViewHolder_ViewBinding;
import o.ListUtil;
import o.documentProvider;
import o.getPromotion;
import o.onChooseMenuCSEvent;
import o.onRefreshListRingkasan;
import o.setMessage;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaAdapter.class */
public final class TransaksiTundaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public Context h;
    public List<TransaksiTunda> g = new ArrayList();
    public SparseBooleanArray e = new SparseBooleanArray();
    public boolean b = false;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaAdapter$HeaderTransaksiTertundaVH.class */
    class HeaderTransaksiTertundaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299269)
        TextView tvHeaderTransaksi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderTransaksiTertundaVH(View view) {
            super(view);
            TransaksiTundaAdapter.this = r4;
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaAdapter$HeaderTransaksiTertundaVH_ViewBinding.class */
    public class HeaderTransaksiTertundaVH_ViewBinding implements Unbinder {
        private HeaderTransaksiTertundaVH b;

        public HeaderTransaksiTertundaVH_ViewBinding(HeaderTransaksiTertundaVH headerTransaksiTertundaVH, View view) {
            this.b = headerTransaksiTertundaVH;
            headerTransaksiTertundaVH.tvHeaderTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299269, "field 'tvHeaderTransaksi'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HeaderTransaksiTertundaVH headerTransaksiTertundaVH = this.b;
            if (headerTransaksiTertundaVH != null) {
                this.b = null;
                headerTransaksiTertundaVH.tvHeaderTransaksi = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaAdapter$TransaksiTertundaVH.class */
    public class TransaksiTertundaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297306)
        public ImageView ivArrowExpand;
        @BindView(2131297410)
        public ImageView ivQuickAction;
        @BindView(2131298313)
        RelativeLayout rlMain;
        @BindView(2131298339)
        public setOnStartEnterTransitionListener rvTxnDetail;
        @BindView(2131299776)
        View separator;
        @BindView(2131298828)
        TextView tvAmmount;
        @BindView(2131299672)
        TextView tvTitleTransaksi;
        @BindView(2131299734)
        TextView tvValueTransaksi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransaksiTertundaVH(View view) {
            super(view);
            TransaksiTundaAdapter.this = r4;
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaAdapter$TransaksiTertundaVH_ViewBinding.class */
    public class TransaksiTertundaVH_ViewBinding implements Unbinder {
        private TransaksiTertundaVH c;

        public TransaksiTertundaVH_ViewBinding(TransaksiTertundaVH transaksiTertundaVH, View view) {
            this.c = transaksiTertundaVH;
            transaksiTertundaVH.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
            transaksiTertundaVH.tvValueTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299734, "field 'tvValueTransaksi'", TextView.class);
            transaksiTertundaVH.tvAmmount = (TextView) Utils.findRequiredViewAsType(view, 2131298828, "field 'tvAmmount'", TextView.class);
            transaksiTertundaVH.rlMain = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298313, "field 'rlMain'", RelativeLayout.class);
            transaksiTertundaVH.ivQuickAction = (ImageView) Utils.findRequiredViewAsType(view, 2131297410, "field 'ivQuickAction'", ImageView.class);
            transaksiTertundaVH.ivArrowExpand = (ImageView) Utils.findRequiredViewAsType(view, 2131297306, "field 'ivArrowExpand'", ImageView.class);
            transaksiTertundaVH.rvTxnDetail = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298339, "field 'rvTxnDetail'", setOnStartEnterTransitionListener.class);
            transaksiTertundaVH.separator = Utils.findRequiredView(view, 2131299776, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiTertundaVH transaksiTertundaVH = this.c;
            if (transaksiTertundaVH != null) {
                this.c = null;
                transaksiTertundaVH.tvTitleTransaksi = null;
                transaksiTertundaVH.tvValueTransaksi = null;
                transaksiTertundaVH.tvAmmount = null;
                transaksiTertundaVH.rlMain = null;
                transaksiTertundaVH.ivQuickAction = null;
                transaksiTertundaVH.ivArrowExpand = null;
                transaksiTertundaVH.rvTxnDetail = null;
                transaksiTertundaVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TransaksiTundaAdapter(Context context) {
        this.h = context;
    }

    public static /* synthetic */ boolean a(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298035) {
            documentProvider.b().d(new onChooseMenuCSEvent("open_draft", i));
            return true;
        } else if (itemId != 2131298037) {
            return false;
        } else {
            documentProvider.b().d(new onChooseMenuCSEvent("delete_draft", i));
            return true;
        }
    }

    public static /* synthetic */ boolean d(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298035) {
            documentProvider.b().d(new onRefreshListRingkasan("open_draft", i));
            return true;
        } else if (itemId != 2131298037) {
            return false;
        } else {
            documentProvider.b().d(new onRefreshListRingkasan("delete_draft", i));
            return true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == 1 ? new TransaksiTertundaVH(LayoutInflater.from(this.h).inflate(2131493332, viewGroup, false)) : i == 0 ? new HeaderTransaksiTertundaVH(LayoutInflater.from(this.h).inflate(2131493472, viewGroup, false)) : i == 2 ? new setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(LayoutInflater.from(this.h).inflate(2131493338, viewGroup, false)) { // from class: com.bca.smartbranch.adapter.TransaksiTundaAdapter$MediaBrowserCompat$CustomActionResultReceiver
            {
                ButterKnife.bind(this, r5);
            }
        } : null;
    }

    public final /* synthetic */ boolean a(int i, Reservation reservation, String str, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 2131298034) {
            switch (itemId) {
                case 2131298040:
                    BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH = new BranchMapROItemAdapter$BranchMapROItemVH(reservation);
                    branchMapROItemAdapter$BranchMapROItemVH.b = str;
                    branchMapROItemAdapter$BranchMapROItemVH.d = this.g.get(i).getType();
                    documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH);
                    return true;
                case 2131298041:
                    BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH2 = new BranchMapROItemAdapter$BranchMapROItemVH(reservation);
                    branchMapROItemAdapter$BranchMapROItemVH2.b = str;
                    branchMapROItemAdapter$BranchMapROItemVH2.d = this.g.get(i).getType();
                    documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH2);
                    return true;
                case 2131298042:
                    documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(str, this.g.get(i).getNoReff(), this.g.get(i).getTxnType(), Integer.valueOf(i)));
                    return true;
                default:
                    return false;
            }
        } else {
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder(this.g.get(i).getFlagBooking(), reservation.getNoReff(), this.g.get(i).getTxnType(), this.g.get(i).getToken()));
            return true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.g.size();
    }

    public final /* synthetic */ boolean c(int i, String str, Reservation reservation, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298034) {
            documentProvider.b().d(new ChooseMastercardAdapter$ViewHolder_ViewBinding(this.g.get(i).getNoReff(), str, false));
            return true;
        } else if (itemId == 2131298040) {
            BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH = new BranchMapROItemAdapter$BranchMapROItemVH(reservation);
            branchMapROItemAdapter$BranchMapROItemVH.b = str;
            branchMapROItemAdapter$BranchMapROItemVH.d = this.g.get(i).getType();
            documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH);
            return true;
        } else if (itemId != 2131298042) {
            return false;
        } else {
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(str, this.g.get(i).getNoReff(), this.g.get(i).getTxnType(), Integer.valueOf(i)));
            return true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        if (!this.b || i != this.g.size() - 1) {
            return this.g.get(i).isHeader() ? 0 : 1;
        }
        return 2;
    }

    public final void d() {
        this.b = false;
        int size = this.g.size() - 1;
        if (size >= 0 && this.g.get(size) != null) {
            this.g.remove(size);
            b(size);
        }
    }

    public final /* synthetic */ boolean d(Reservation reservation, int i, String str, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298034) {
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder(this.g.get(i).getFlagBooking(), reservation.getNoReff(), this.g.get(i).getTxnType(), this.g.get(i).getToken()));
            return true;
        } else if (itemId != 2131298040) {
            return false;
        } else {
            BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH = new BranchMapROItemAdapter$BranchMapROItemVH(reservation);
            branchMapROItemAdapter$BranchMapROItemVH.d = this.g.get(i).getType();
            branchMapROItemAdapter$BranchMapROItemVH.b = str;
            documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH);
            return true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof TransaksiTertundaVH) {
            if (this.g.get(i).isDraft()) {
                TransaksiTertundaVH transaksiTertundaVH = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                transaksiTertundaVH.tvTitleTransaksi.setText(this.g.get(i).getTxnType());
                transaksiTertundaVH.tvValueTransaksi.setText("Draft");
                transaksiTertundaVH.tvAmmount.setVisibility(8);
                transaksiTertundaVH.ivQuickAction.setVisibility(0);
                transaksiTertundaVH.ivArrowExpand.setVisibility(8);
                transaksiTertundaVH.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.EditDaftarTransferORActivity
                    public final /* synthetic */ int b;

                    {
                        this.b = r5;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TransaksiTundaAdapter transaksiTundaAdapter = TransaksiTundaAdapter.this;
                        int i2 = this.b;
                        if ("PEMREK".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new tujuanTransaksiEvent(transaksiTundaAdapter.g.get(i2).getDataId()));
                        } else if ("SETORAN".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new TransactionActivity());
                            documentProvider.b().d(new updateDaftarTransfer(transaksiTundaAdapter.g.get(i2).getDataId()));
                        } else if ("TARIKAN".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new TransactionActivity());
                            documentProvider.b().d(new TxnBerkalaDetailActivity_ViewBinding(transaksiTundaAdapter.g.get(i2).getDataId()));
                        } else if ("KIRIMANUANG".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new showDataPengirim(transaksiTundaAdapter.g.get(i2).getDataId()));
                        } else if ("KLIRING".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new showDataTransaksiBerkala(transaksiTundaAdapter.g.get(i2).getDataId(), false));
                        } else if ("CC".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new showDataPenerima(transaksiTundaAdapter.g.get(i2).getDataId()));
                        } else if ("ECHANNEL".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            Intent intent = new Intent(transaksiTundaAdapter.h, NoAtmEChannelActivity.class);
                            intent.putExtra("is_draft", true);
                            intent.putExtra("draft_id", transaksiTundaAdapter.g.get(i2).getDataId());
                            transaksiTundaAdapter.h.startActivity(intent);
                        } else if ("BANKTRANSFER".equals(transaksiTundaAdapter.g.get(i2).getTypeDraft())) {
                            documentProvider.b().d(new TransactionActivity());
                            documentProvider.b().d(new subsriberChooseValueHariEvent(transaksiTundaAdapter.g.get(i2).getDataId()));
                        }
                    }
                });
                transaksiTertundaVH.ivQuickAction.setOnClickListener(new View.OnClickListener(i, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) { // from class: o.EditTransaksiBerkalaActivity_ViewBinding
                    public final /* synthetic */ int b;
                    public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c;

                    {
                        this.b = r5;
                        this.c = r6;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0109: IPUT  
                          (wrap: o.pilihStatusPenduduk : 0x0106: CONSTRUCTOR  (r1v8 o.pilihStatusPenduduk A[REMOVE]) = (r0v3 'i2' int) call: o.pilihStatusPenduduk.<init>(int):void type: CONSTRUCTOR)
                          (r0v12 'sethoverlistener' o.setHoverListener)
                         o.setHoverListener.c o.setHoverListener$write in method: o.EditTransaksiBerkalaActivity_ViewBinding.onClick(android.view.View):void, file: classes-dex2jar.jar:o/EditTransaksiBerkalaActivity_ViewBinding.class
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.pilihStatusPenduduk, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 18 more
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r10) {
                        /*
                        // Method dump skipped, instructions count: 331
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.EditTransaksiBerkalaActivity_ViewBinding.onClick(android.view.View):void");
                    }
                });
            } else if ("TLTXNBERKALA".equals(this.g.get(i).getServiceType())) {
                TransaksiTertundaVH transaksiTertundaVH2 = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                transaksiTertundaVH2.tvTitleTransaksi.setText(this.g.get(i).getTxnType());
                transaksiTertundaVH2.tvValueTransaksi.setText("Draft - Transaksi Berkala");
                transaksiTertundaVH2.tvAmmount.setVisibility(8);
                transaksiTertundaVH2.ivArrowExpand.setVisibility(8);
                transaksiTertundaVH2.ivQuickAction.setVisibility(0);
                transaksiTertundaVH2.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.onChooseStatusPenduduk
                    public final /* synthetic */ int c;

                    {
                        this.c = r4;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        documentProvider.b().d(new inputChangePenerima(this.c));
                    }
                });
                transaksiTertundaVH2.ivQuickAction.setOnClickListener(new View.OnClickListener(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i) { // from class: o.FingerprintActivity
                    public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a;
                    public final /* synthetic */ int c;

                    {
                        this.a = r5;
                        this.c = r6;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: IPUT  
                          (wrap: o.onChooseTipeNasabahPenerima : 0x0046: CONSTRUCTOR  (r1v3 o.onChooseTipeNasabahPenerima A[REMOVE]) = (r0v5 'i2' int) call: o.onChooseTipeNasabahPenerima.<init>(int):void type: CONSTRUCTOR)
                          (r0v10 'sethoverlistener' o.setHoverListener)
                         o.setHoverListener.c o.setHoverListener$write in method: o.FingerprintActivity.onClick(android.view.View):void, file: classes-dex2jar.jar:o/FingerprintActivity.class
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.onChooseTipeNasabahPenerima, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 10 more
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r10) {
                        /*
                            r9 = this;
                            r0 = r9
                            com.bca.smartbranch.adapter.TransaksiTundaAdapter r0 = com.bca.smartbranch.adapter.TransaksiTundaAdapter.this
                            r10 = r0
                            r0 = r9
                            o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.a
                            r11 = r0
                            r0 = r9
                            int r0 = r0.c
                            r12 = r0
                            r0 = r10
                            android.content.Context r0 = r0.h
                            r13 = r0
                            r0 = r11
                            com.bca.smartbranch.adapter.TransaksiTundaAdapter$TransaksiTertundaVH r0 = (com.bca.smartbranch.adapter.TransaksiTundaAdapter.TransaksiTertundaVH) r0
                            r11 = r0
                            o.setHoverListener r0 = new o.setHoverListener
                            r1 = r0
                            r2 = r13
                            r3 = r11
                            android.widget.ImageView r3 = r3.ivQuickAction
                            r1.<init>(r2, r3)
                            r13 = r0
                            o.setUiOptions r0 = new o.setUiOptions
                            r1 = r0
                            r2 = r13
                            android.content.Context r2 = r2.b
                            r1.<init>(r2)
                            r1 = 2131558407(0x7f0d0007, float:1.8742129E38)
                            r2 = r13
                            o.setOnDismissListener r2 = r2.a
                            r0.inflate(r1, r2)
                            r0 = r13
                            o.onChooseTipeNasabahPenerima r1 = new o.onChooseTipeNasabahPenerima
                            r2 = r1
                            r3 = r12
                            r2.<init>(r3)
                            r0.c = r1
                            o.setBackgroundDrawable r0 = new o.setBackgroundDrawable
                            r1 = r0
                            r2 = r10
                            android.content.Context r2 = r2.h
                            r3 = r13
                            o.setOnDismissListener r3 = r3.a
                            o.setOnDismissListener r3 = (o.setOnDismissListener) r3
                            r4 = r11
                            android.widget.ImageView r4 = r4.ivQuickAction
                            r5 = 0
                            r6 = 0
                            r7 = 2131886355(0x7f120113, float:1.9407287E38)
                            r1.<init>(r2, r3, r4, r5, r6, r7)
                            r10 = r0
                            r0 = r10
                            r1 = 1
                            r0.e = r1
                            r0 = r10
                            o.setInitialActivityCount r0 = r0.c
                            r13 = r0
                            r0 = r13
                            if (r0 == 0) goto L_0x007e
                            r0 = r13
                            r1 = 1
                            r0.d(r1)
                        L_0x007e:
                            r0 = r10
                            r1 = 8388613(0x800005, float:1.175495E-38)
                            r0.b = r1
                            r0 = r10
                            r0.c()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.FingerprintActivity.onClick(android.view.View):void");
                    }
                });
            } else {
                if ("BN".equals(this.g.get(i).getServiceType())) {
                    TransaksiTertundaVH transaksiTertundaVH3 = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    transaksiTertundaVH3.tvTitleTransaksi.setText(this.g.get(i).getTxnType());
                    transaksiTertundaVH3.tvValueTransaksi.setText(this.g.get(i).getStatus());
                    transaksiTertundaVH3.tvAmmount.setVisibility(0);
                    if (!this.g.get(i).getCurrencyCode().equalsIgnoreCase("USD")) {
                        TextView textView = transaksiTertundaVH3.tvAmmount;
                        StringBuilder sb = new StringBuilder();
                        sb.append(getPromotion.a(this.g.get(i).getAmount()));
                        sb.append(" ");
                        sb.append(this.g.get(i).getCurrencyCode());
                        textView.setText(sb.toString());
                    } else if (this.g.get(i).getBanknoteCondition().equals("M")) {
                        TextView textView2 = transaksiTertundaVH3.tvAmmount;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getPromotion.a(this.g.get(i).getAmount()));
                        sb2.append(" ");
                        sb2.append(this.g.get(i).getCurrencyCode());
                        sb2.append(" Mulus");
                        textView2.setText(sb2.toString());
                    } else if (this.g.get(i).getBanknoteCondition().equals("C")) {
                        TextView textView3 = transaksiTertundaVH3.tvAmmount;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(getPromotion.a(this.g.get(i).getAmount()));
                        sb3.append(" ");
                        sb3.append(this.g.get(i).getCurrencyCode());
                        sb3.append(" Cap");
                        textView3.setText(sb3.toString());
                    }
                    transaksiTertundaVH3.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.EditTransaksiBerkalaActivity
                        public final /* synthetic */ int d;

                        {
                            this.d = r5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TransaksiTundaAdapter transaksiTundaAdapter = TransaksiTundaAdapter.this;
                            int i2 = this.d;
                            String statusType = transaksiTundaAdapter.g.get(i2).getStatusType();
                            statusType.hashCode();
                            if (statusType.equals("3")) {
                                Intent intent = new Intent(transaksiTundaAdapter.h, BN6PembayaranTundaActivity.class);
                                intent.putExtra("no_reff", transaksiTundaAdapter.g.get(i2).getNoReff());
                                intent.putExtra("token", transaksiTundaAdapter.g.get(i2).getToken());
                                intent.putExtra("TYPE", transaksiTundaAdapter.g.get(i2).getType());
                                transaksiTundaAdapter.h.startActivity(intent);
                            } else if (statusType.equals("4")) {
                                Intent intent2 = new Intent(transaksiTundaAdapter.h, BN7PengambilanActivity.class);
                                intent2.putExtra("no_reff", transaksiTundaAdapter.g.get(i2).getNoReff());
                                intent2.putExtra("token", transaksiTundaAdapter.g.get(i2).getToken());
                                intent2.putExtra("TYPE", transaksiTundaAdapter.g.get(i2).getType());
                                transaksiTundaAdapter.h.startActivity(intent2);
                            }
                        }
                    });
                } else {
                    TransaksiTertundaVH transaksiTertundaVH4 = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    transaksiTertundaVH4.tvAmmount.setVisibility(8);
                    if (this.g.get(i).getTxnType().contains("Pembukaan Rekening")) {
                        transaksiTertundaVH4.tvTitleTransaksi.setText(this.g.get(i).getTxnType().substring(0, 18));
                        if (this.g.get(i).getFlagBooking().equals("Y")) {
                            TextView textView4 = transaksiTertundaVH4.tvValueTransaksi;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this.g.get(i).getTxnType().substring(19));
                            sb4.append(" - Reservasi");
                            textView4.setText(sb4.toString());
                        } else {
                            transaksiTertundaVH4.tvValueTransaksi.setText(this.g.get(i).getTxnType().substring(19));
                        }
                    } else {
                        transaksiTertundaVH4.tvTitleTransaksi.setText(this.g.get(i).getTxnType());
                        if (this.g.get(i).getTxnType().equals("Internet/Mobile Banking")) {
                            if (this.g.get(i).getFlagBooking().equals("Y")) {
                                transaksiTertundaVH4.tvValueTransaksi.setText("Reservasi");
                            } else {
                                transaksiTertundaVH4.tvValueTransaksi.setText("");
                            }
                        } else if (!this.g.get(i).getTxnType().equals("Setoran Tunai") && !this.g.get(i).getTxnType().equals("Tarikan Tunai") && !this.g.get(i).getTxnType().equals("Transfer ke Bank Lain")) {
                            if (this.g.get(i).getTxnType().equalsIgnoreCase("Transfer Valuta Asing")) {
                                TextView textView5 = transaksiTertundaVH4.tvValueTransaksi;
                                StringBuilder sb5 = new StringBuilder("No Ref: ");
                                sb5.append(this.g.get(i).getNoReff());
                                textView5.setText(sb5.toString());
                                transaksiTertundaVH4.tvAmmount.setVisibility(8);
                            } else {
                                transaksiTertundaVH4.tvValueTransaksi.setText(this.g.get(i).getReceiverName());
                                transaksiTertundaVH4.tvAmmount.setVisibility(0);
                            }
                            if (this.g.get(i).getAmount() != null) {
                                TextView textView6 = transaksiTertundaVH4.tvAmmount;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(getPromotion.a(this.g.get(i).getAmount()));
                                sb6.append(" IDR");
                                textView6.setText(sb6.toString());
                            } else {
                                transaksiTertundaVH4.tvAmmount.setText("- IDR");
                            }
                        } else if (this.g.get(i).getFlagBooking().equals("Y")) {
                            TextView textView7 = transaksiTertundaVH4.tvValueTransaksi;
                            StringBuilder sb7 = new StringBuilder("No. Ref: ");
                            sb7.append(this.g.get(i).getNoReff());
                            sb7.append(" - Reservasi");
                            textView7.setText(sb7.toString());
                        } else if (this.g.get(i).getAmount() == null) {
                            TextView textView8 = transaksiTertundaVH4.tvValueTransaksi;
                            StringBuilder sb8 = new StringBuilder("No. Ref: ");
                            sb8.append(this.g.get(i).getNoReff());
                            textView8.setText(sb8.toString());
                        } else if (this.g.get(i).getTxnType().equals("Transfer ke Bank Lain")) {
                            BigDecimal bigDecimal = new BigDecimal(this.g.get(i).getAmount());
                            BigDecimal bigDecimal2 = bigDecimal;
                            if (this.g.get(i).getFee() != null) {
                                bigDecimal2 = bigDecimal.add(new BigDecimal(this.g.get(i).getFee()));
                            }
                            transaksiTertundaVH4.tvAmmount.setVisibility(0);
                            transaksiTertundaVH4.tvValueTransaksi.setText(this.g.get(i).getReceiverName());
                            TextView textView9 = transaksiTertundaVH4.tvAmmount;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(getPromotion.j(bigDecimal2.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
                            sb9.append(" IDR");
                            textView9.setText(sb9.toString());
                        } else if (this.g.get(i).getTxnType().equals("Setoran Tunai")) {
                            transaksiTertundaVH4.tvAmmount.setVisibility(0);
                            transaksiTertundaVH4.tvValueTransaksi.setText(this.g.get(i).getReceiverName());
                            TextView textView10 = transaksiTertundaVH4.tvAmmount;
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(getPromotion.g(this.g.get(i).getAmount()));
                            sb10.append(" ");
                            sb10.append(this.g.get(i).getCurrencyCode());
                            textView10.setText(sb10.toString());
                        } else if (this.g.get(i).getTxnType().equalsIgnoreCase("Tarikan Tunai")) {
                            transaksiTertundaVH4.tvAmmount.setVisibility(8);
                            TextView textView11 = transaksiTertundaVH4.tvValueTransaksi;
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(getPromotion.h(this.g.get(i).getAmount()).replace(",", "."));
                            sb11.append(" IDR");
                            textView11.setText(sb11.toString());
                        } else {
                            transaksiTertundaVH4.tvAmmount.setVisibility(8);
                            TextView textView12 = transaksiTertundaVH4.tvValueTransaksi;
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(getPromotion.a(this.g.get(i).getAmount()));
                            sb12.append(" IDR");
                            textView12.setText(sb12.toString());
                        }
                    }
                    transaksiTertundaVH4.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.onDeleteTxnBerkala
                        public final /* synthetic */ int b;

                        {
                            this.b = r5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TransaksiTundaAdapter transaksiTundaAdapter = TransaksiTundaAdapter.this;
                            int i2 = this.b;
                            if (transaksiTundaAdapter.g.get(i2).getTxnType().equals("Internet/Mobile Banking")) {
                                Intent intent = new Intent(transaksiTundaAdapter.h, DetailTundaEChannelActivity.class);
                                intent.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                transaksiTundaAdapter.h.startActivity(intent);
                            } else if (transaksiTundaAdapter.g.get(i2).getTxnType().equals("Setoran Tunai") || transaksiTundaAdapter.g.get(i2).getTxnType().equals("Tarikan Tunai") || transaksiTundaAdapter.g.get(i2).getTxnType().equals("Transfer Valuta Asing") || transaksiTundaAdapter.g.get(i2).getTxnType().equals("Transfer ke Bank Lain") || transaksiTundaAdapter.g.get(i2).getTxnType().equals("Kliring")) {
                                Intent intent2 = new Intent(transaksiTundaAdapter.h, DetailTundaTellerActivity.class);
                                intent2.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                intent2.putExtra("data_position", 0);
                                intent2.putExtra("is_multiple", false);
                                transaksiTundaAdapter.h.startActivity(intent2);
                            } else {
                                Intent intent3 = new Intent(transaksiTundaAdapter.h, DetailTundaActivity.class);
                                intent3.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                transaksiTundaAdapter.h.startActivity(intent3);
                            }
                        }
                    });
                }
                TransaksiTertundaVH transaksiTertundaVH5 = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                transaksiTertundaVH5.ivQuickAction.setOnClickListener(new View.OnClickListener(i, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) { // from class: o.clickedTidak
                    public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c;
                    public final /* synthetic */ int e;

                    {
                        this.e = r5;
                        this.c = r6;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02e3: IPUT  
                          (wrap: o.onFocusChange : 0x02e0: CONSTRUCTOR  (r1v80 o.onFocusChange A[REMOVE]) = 
                          (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter)
                          (r0v3 'i2' int)
                          (r0v87 'reservation' com.bca.smartbranch.data.global.Reservation)
                          (wrap: java.lang.String : ?: TERNARY(r10v7 java.lang.String A[REMOVE]) = ((wrap: java.lang.String : 0x02aa: INVOKE  (r0v125 java.lang.String A[REMOVE]) = 
                          (wrap: com.bca.smartbranch.data.global.TransaksiTunda : 0x02a2: INVOKE  (r0v123 com.bca.smartbranch.data.global.TransaksiTunda A[REMOVE]) = 
                          (wrap: java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> : 0x029e: IGET  (r0v122 java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> A[REMOVE]) = (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter) com.bca.smartbranch.adapter.TransaksiTundaAdapter.g java.util.List)
                          (r0v3 'i2' int)
                         type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                         type: VIRTUAL call: com.bca.smartbranch.data.global.TransaksiTunda.getSubToken():java.lang.String) == (null java.lang.String)) ? (wrap: java.lang.String : 0x02bd: INVOKE  (r10v10 java.lang.String A[REMOVE]) = 
                          (wrap: com.bca.smartbranch.data.global.TransaksiTunda : 0x02b5: INVOKE  (r0v142 com.bca.smartbranch.data.global.TransaksiTunda A[REMOVE]) = 
                          (wrap: java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> : 0x02b1: IGET  (r0v141 java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> A[REMOVE]) = (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter) com.bca.smartbranch.adapter.TransaksiTundaAdapter.g java.util.List)
                          (r0v3 'i2' int)
                         type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                         type: VIRTUAL call: com.bca.smartbranch.data.global.TransaksiTunda.getToken():java.lang.String) : (wrap: java.lang.String : 0x02d1: INVOKE  (r10v9 java.lang.String A[REMOVE]) = 
                          (wrap: com.bca.smartbranch.data.global.TransaksiTunda : 0x02c9: INVOKE  (r0v137 com.bca.smartbranch.data.global.TransaksiTunda A[REMOVE]) = 
                          (wrap: java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> : 0x02c5: IGET  (r0v136 java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> A[REMOVE]) = (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter) com.bca.smartbranch.adapter.TransaksiTundaAdapter.g java.util.List)
                          (r0v3 'i2' int)
                         type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                         type: VIRTUAL call: com.bca.smartbranch.data.global.TransaksiTunda.getSubToken():java.lang.String))
                         call: o.onFocusChange.<init>(com.bca.smartbranch.adapter.TransaksiTundaAdapter, int, com.bca.smartbranch.data.global.Reservation, java.lang.String):void type: CONSTRUCTOR)
                          (r0v108 'sethoverlistener' o.setHoverListener)
                         o.setHoverListener.c o.setHoverListener$write in method: o.clickedTidak.onClick(android.view.View):void, file: classes-dex2jar.jar:o/clickedTidak.class
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.onFocusChange, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 18 more
                        */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View r10) {
                        /*
                        // Method dump skipped, instructions count: 1323
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.clickedTidak.onClick(android.view.View):void");
                    }
                });
                if (this.g.get(i).getTransaksiTundaDetailList() == null || this.g.get(i).getTransaksiTundaDetailList().size() <= 0) {
                    transaksiTertundaVH5.ivQuickAction.setVisibility(0);
                    transaksiTertundaVH5.ivArrowExpand.setVisibility(8);
                } else if (!this.g.get(i).getTxnType().equalsIgnoreCase("Transaksi Teller") || !this.g.get(i).getFlagBooking().equalsIgnoreCase("N")) {
                    transaksiTertundaVH5.tvAmmount.setVisibility(8);
                    if (this.g.get(i).getTransaksiTundaDetailList().size() > 1 || (this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTundaSubDetailList() != null && this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTundaSubDetailList().size() > 0)) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
                        TextView textView13 = transaksiTertundaVH5.tvValueTransaksi;
                        StringBuilder sb13 = new StringBuilder("No. Ref: ");
                        sb13.append(this.g.get(i).getNoReff());
                        sb13.append(" - Reservasi");
                        textView13.setText(sb13.toString());
                        TransaksiTundaDetailAdapter transaksiTundaDetailAdapter = new TransaksiTundaDetailAdapter(this.h, this.g.get(i).getTransaksiTundaDetailList());
                        transaksiTertundaVH5.rvTxnDetail.setLayoutManager(new LinearLayoutManager(1, false));
                        transaksiTertundaVH5.rvTxnDetail.setAdapter(transaksiTundaDetailAdapter);
                        setMessage setmessage = new setMessage();
                        if (this.e.get(i, false)) {
                            transaksiTertundaVH5.rvTxnDetail.setVisibility(0);
                            ImageView imageView = transaksiTertundaVH5.ivArrowExpand;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                        } else {
                            transaksiTertundaVH5.rvTxnDetail.setVisibility(8);
                            ImageView imageView2 = transaksiTertundaVH5.ivArrowExpand;
                            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView2);
                        }
                        transaksiTertundaVH5.ivArrowExpand.setOnClickListener(new View.OnClickListener(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setmessage, i) { // from class: o.clickedYa
                            public final /* synthetic */ setMessage c;
                            public final /* synthetic */ int d;
                            public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e;

                            {
                                this.e = r5;
                                this.c = r6;
                                this.d = r7;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: IPUT  
                                  (wrap: o.setMessage$1 : 0x003b: CONSTRUCTOR  (r1v7 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage2' o.setMessage), (r0v21 'setonstartentertransitionlistener' o.setOnStartEnterTransitionListener) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                                  (r0v5 'setmessage2' o.setMessage)
                                 o.setMessage.b android.view.animation.Animation in method: o.clickedYa.onClick(android.view.View):void, file: classes-dex2jar.jar:o/clickedYa.class
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                                	... 18 more
                                */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View r11) {
                                /*
                                    r10 = this;
                                    r0 = r10
                                    com.bca.smartbranch.adapter.TransaksiTundaAdapter r0 = com.bca.smartbranch.adapter.TransaksiTundaAdapter.this
                                    r12 = r0
                                    r0 = r10
                                    o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.e
                                    r13 = r0
                                    r0 = r10
                                    o.setMessage r0 = r0.c
                                    r11 = r0
                                    r0 = r10
                                    int r0 = r0.d
                                    r14 = r0
                                    r0 = r13
                                    com.bca.smartbranch.adapter.TransaksiTundaAdapter$TransaksiTertundaVH r0 = (com.bca.smartbranch.adapter.TransaksiTundaAdapter.TransaksiTertundaVH) r0
                                    r15 = r0
                                    r0 = r15
                                    o.setOnStartEnterTransitionListener r0 = r0.rvTxnDetail
                                    int r0 = r0.getVisibility()
                                    if (r0 != 0) goto L_0x0070
                                    r0 = r15
                                    o.setOnStartEnterTransitionListener r0 = r0.rvTxnDetail
                                    r13 = r0
                                    r0 = r11
                                    r1 = r13
                                    int r1 = r1.getMeasuredHeight()
                                    r0.a = r1
                                    r0 = r11
                                    o.setMessage$1 r1 = new o.setMessage$1
                                    r2 = r1
                                    r3 = r11
                                    r4 = r13
                                    r2.<init>(r4)
                                    r0.b = r1
                                    r0 = r11
                                    r1 = r13
                                    r0.b(r1)
                                    r0 = r15
                                    android.widget.ImageView r0 = r0.ivArrowExpand
                                    r13 = r0
                                    r0 = r11
                                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                                    r2 = r1
                                    r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                                    r4 = 0
                                    r5 = 1
                                    r6 = 1056964608(0x3f000000, float:0.5)
                                    r7 = 1
                                    r8 = 1056964608(0x3f000000, float:0.5)
                                    r2.<init>(r3, r4, r5, r6, r7, r8)
                                    r0.c = r1
                                    r0 = r11
                                    r1 = r13
                                    r0.e(r1)
                                    r0 = r12
                                    android.util.SparseBooleanArray r0 = r0.e
                                    r1 = r14
                                    r2 = 0
                                    r0.put(r1, r2)
                                    return
                                L_0x0070:
                                    r0 = r11
                                    r1 = r15
                                    o.setOnStartEnterTransitionListener r1 = r1.rvTxnDetail
                                    r0.c(r1)
                                    r0 = r15
                                    android.widget.ImageView r0 = r0.ivArrowExpand
                                    r13 = r0
                                    r0 = r11
                                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                                    r2 = r1
                                    r3 = 0
                                    r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                                    r5 = 1
                                    r6 = 1056964608(0x3f000000, float:0.5)
                                    r7 = 1
                                    r8 = 1056964608(0x3f000000, float:0.5)
                                    r2.<init>(r3, r4, r5, r6, r7, r8)
                                    r0.c = r1
                                    r0 = r11
                                    r1 = r13
                                    r0.e(r1)
                                    r0 = r12
                                    android.util.SparseBooleanArray r0 = r0.e
                                    r1 = r14
                                    r2 = 1
                                    r0.put(r1, r2)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.clickedYa.onClick(android.view.View):void");
                            }
                        });
                        transaksiTertundaVH5.ivQuickAction.setVisibility(8);
                        transaksiTertundaVH5.ivArrowExpand.setVisibility(0);
                    } else {
                        if (((this.g.get(i).getTransaksiTundaDetailList().get(0).getAmount() == null || !this.g.get(i).getTransaksiTundaDetailList().get(0).getAmount().equalsIgnoreCase("0") || (!(this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTundaSubDetailList() == null || this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTundaSubDetailList().size() == 0) || !this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTunda().getTxnType().equalsIgnoreCase("Transaksi Teller"))) && (this.g.get(i).getTransaksiTundaDetailList().get(0).getAccountNumber() == null || !this.g.get(i).getTransaksiTundaDetailList().get(0).getAccountNumber().equalsIgnoreCase("") || !this.g.get(i).getTransaksiTundaDetailList().get(0).getTransaksiTunda().getTxnType().equalsIgnoreCase("Transaksi CS"))) || this.g.get(i).getType() == null || this.g.get(i).getType().equals("SBTxnTeller")) {
                            TextView textView14 = transaksiTertundaVH5.tvValueTransaksi;
                            StringBuilder sb14 = new StringBuilder("No. Ref: ");
                            sb14.append(this.g.get(i).getNoReff());
                            sb14.append(" - Reservasi");
                            textView14.setText(sb14.toString());
                        } else {
                            transaksiTertundaVH5.tvValueTransaksi.setText("Reservasi");
                        }
                        if (this.g.get(i).getTransaksiTundaDetailList().get(0).getTxbType().contains("Pembukaan Rekening")) {
                            transaksiTertundaVH5.tvTitleTransaksi.setText(this.g.get(i).getTransaksiTundaDetailList().get(0).getTxbType().substring(0, 18));
                        } else {
                            transaksiTertundaVH5.tvTitleTransaksi.setText(this.g.get(i).getTransaksiTundaDetailList().get(0).getTxbType());
                        }
                        transaksiTertundaVH5.ivQuickAction.setVisibility(0);
                        transaksiTertundaVH5.ivArrowExpand.setVisibility(8);
                        transaksiTertundaVH5.ivQuickAction.setOnClickListener(new View.OnClickListener(i, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) { // from class: o.EditDaftarTransferBTActivity_ViewBinding
                            public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c;
                            public final /* synthetic */ int d;

                            {
                                this.d = r5;
                                this.c = r6;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02c0: IPUT  
                                  (wrap: o.pilihTipeNasabahPenerima : 0x02bd: CONSTRUCTOR  (r1v12 o.pilihTipeNasabahPenerima A[REMOVE]) = 
                                  (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter)
                                  (r0v3 'i2' int)
                                  (wrap: java.lang.String : 0x02b8: INVOKE  (r5v7 java.lang.String A[REMOVE]) = 
                                  (wrap: com.bca.smartbranch.data.global.TransaksiTundaDetail : 0x02b0: INVOKE  (r5v5 com.bca.smartbranch.data.global.TransaksiTundaDetail A[REMOVE]) = 
                                  (wrap: java.util.List<com.bca.smartbranch.data.global.TransaksiTundaDetail> : 0x02ac: INVOKE  (r5v4 java.util.List<com.bca.smartbranch.data.global.TransaksiTundaDetail> A[REMOVE]) = 
                                  (wrap: com.bca.smartbranch.data.global.TransaksiTunda : 0x02a4: INVOKE  (r5v2 com.bca.smartbranch.data.global.TransaksiTunda A[REMOVE]) = 
                                  (wrap: java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> : 0x02a0: IGET  (r5v1 java.util.List<com.bca.smartbranch.data.global.TransaksiTunda> A[REMOVE]) = (r0v1 'transaksiTundaAdapter' com.bca.smartbranch.adapter.TransaksiTundaAdapter) com.bca.smartbranch.adapter.TransaksiTundaAdapter.g java.util.List)
                                  (r0v3 'i2' int)
                                 type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                                 type: VIRTUAL call: com.bca.smartbranch.data.global.TransaksiTunda.getTransaksiTundaDetailList():java.util.List)
                                  (0 int)
                                 type: INTERFACE call: java.util.List.get(int):java.lang.Object)
                                 type: VIRTUAL call: com.bca.smartbranch.data.global.TransaksiTundaDetail.getToken():java.lang.String)
                                  (r0v6 'reservation' com.bca.smartbranch.data.global.Reservation)
                                 call: o.pilihTipeNasabahPenerima.<init>(com.bca.smartbranch.adapter.TransaksiTundaAdapter, int, java.lang.String, com.bca.smartbranch.data.global.Reservation):void type: CONSTRUCTOR)
                                  (r0v24 'sethoverlistener' o.setHoverListener)
                                 o.setHoverListener.c o.setHoverListener$write in method: o.EditDaftarTransferBTActivity_ViewBinding.onClick(android.view.View):void, file: classes-dex2jar.jar:o/EditDaftarTransferBTActivity_ViewBinding.class
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.pilihTipeNasabahPenerima, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                                	... 10 more
                                */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View r10) {
                                /*
                                // Method dump skipped, instructions count: 768
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.EditDaftarTransferBTActivity_ViewBinding.onClick(android.view.View):void");
                            }
                        });
                    }
                    transaksiTertundaVH5.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.EditDaftarTransferORActivity_ViewBinding
                        public final /* synthetic */ int d;

                        {
                            this.d = r5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            char c;
                            TransaksiTundaAdapter transaksiTundaAdapter = TransaksiTundaAdapter.this;
                            int i2 = this.d;
                            String type = transaksiTundaAdapter.g.get(i2).getType();
                            type.hashCode();
                            int hashCode = type.hashCode();
                            if (hashCode == -383967847) {
                                if (type.equals("SBTxnTeller")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else if (hashCode != 1395764460) {
                                if (hashCode == 1421302209 && type.equals("SBActEChannel")) {
                                    c = 2;
                                }
                                c = 65535;
                            } else {
                                if (type.equals("SBOpenAcct")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                Intent intent = new Intent(transaksiTundaAdapter.h, DetailTundaTellerActivity.class);
                                intent.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                intent.putExtra("data_position", 0);
                                intent.putExtra("is_multiple", true);
                                transaksiTundaAdapter.h.startActivity(intent);
                            } else if (c == 1) {
                                Intent intent2 = new Intent(transaksiTundaAdapter.h, DetailTundaActivity.class);
                                intent2.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                transaksiTundaAdapter.h.startActivity(intent2);
                            } else if (c != 2) {
                                Intent intent3 = new Intent(transaksiTundaAdapter.h, DetailTundaReservasiROActivity.class);
                                intent3.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                intent3.putExtra("data_position", 0);
                                transaksiTundaAdapter.h.startActivity(intent3);
                            } else {
                                Intent intent4 = new Intent(transaksiTundaAdapter.h, DetailTundaEChannelActivity.class);
                                intent4.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                                transaksiTundaAdapter.h.startActivity(intent4);
                            }
                        }
                    });
                } else {
                    TextView textView15 = transaksiTertundaVH5.tvValueTransaksi;
                    StringBuilder sb15 = new StringBuilder("No. Ref: ");
                    sb15.append(this.g.get(i).getNoReff());
                    textView15.setText(sb15.toString());
                    transaksiTertundaVH5.tvAmmount.setVisibility(8);
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
                    transaksiTertundaVH5.ivQuickAction.setVisibility(8);
                    transaksiTertundaVH5.ivArrowExpand.setVisibility(0);
                    TransaksiTundaDetailAdapter transaksiTundaDetailAdapter2 = new TransaksiTundaDetailAdapter(this.h, this.g.get(i).getTransaksiTundaDetailList());
                    transaksiTertundaVH5.rvTxnDetail.setLayoutManager(new LinearLayoutManager(1, false));
                    transaksiTertundaVH5.rvTxnDetail.setAdapter(transaksiTundaDetailAdapter2);
                    setMessage setmessage2 = new setMessage();
                    if (this.e.get(i, false)) {
                        transaksiTertundaVH5.rvTxnDetail.setVisibility(0);
                        ImageView imageView3 = transaksiTertundaVH5.ivArrowExpand;
                        setmessage2.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage2.e(imageView3);
                    } else {
                        transaksiTertundaVH5.rvTxnDetail.setVisibility(8);
                        ImageView imageView4 = transaksiTertundaVH5.ivArrowExpand;
                        setmessage2.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                        setmessage2.e(imageView4);
                    }
                    transaksiTertundaVH5.rlMain.setOnClickListener(new View.OnClickListener(i) { // from class: o.fingerprintStatusSubscribe
                        public final /* synthetic */ int e;

                        {
                            this.e = r5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TransaksiTundaAdapter transaksiTundaAdapter = TransaksiTundaAdapter.this;
                            int i2 = this.e;
                            Intent intent = new Intent(transaksiTundaAdapter.h, DetailTundaTellerActivity.class);
                            intent.putExtra("transaksi_tunda", ListUtil.OneItemImmutableList.e(transaksiTundaAdapter.g.get(i2)));
                            intent.putExtra("data_position", 0);
                            intent.putExtra("is_multiple", true);
                            transaksiTundaAdapter.h.startActivity(intent);
                        }
                    });
                    transaksiTertundaVH5.ivArrowExpand.setOnClickListener(new View.OnClickListener(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setmessage2, i) { // from class: o.FingerprintActivity_ViewBinding
                        public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a;
                        public final /* synthetic */ setMessage c;
                        public final /* synthetic */ int e;

                        {
                            this.a = r5;
                            this.c = r6;
                            this.e = r7;
                        }

                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: IPUT  
                              (wrap: o.setMessage$1 : 0x003b: CONSTRUCTOR  (r1v7 o.setMessage$1 A[REMOVE]) = (r0v5 'setmessage3' o.setMessage), (r0v21 'setonstartentertransitionlistener' o.setOnStartEnterTransitionListener) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v5 'setmessage3' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: o.FingerprintActivity_ViewBinding.onClick(android.view.View):void, file: classes-dex2jar.jar:o/FingerprintActivity_ViewBinding.class
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 18 more
                            */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View r11) {
                            /*
                                r10 = this;
                                r0 = r10
                                com.bca.smartbranch.adapter.TransaksiTundaAdapter r0 = com.bca.smartbranch.adapter.TransaksiTundaAdapter.this
                                r12 = r0
                                r0 = r10
                                o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.a
                                r13 = r0
                                r0 = r10
                                o.setMessage r0 = r0.c
                                r11 = r0
                                r0 = r10
                                int r0 = r0.e
                                r14 = r0
                                r0 = r13
                                com.bca.smartbranch.adapter.TransaksiTundaAdapter$TransaksiTertundaVH r0 = (com.bca.smartbranch.adapter.TransaksiTundaAdapter.TransaksiTertundaVH) r0
                                r15 = r0
                                r0 = r15
                                o.setOnStartEnterTransitionListener r0 = r0.rvTxnDetail
                                int r0 = r0.getVisibility()
                                if (r0 != 0) goto L_0x0070
                                r0 = r15
                                o.setOnStartEnterTransitionListener r0 = r0.rvTxnDetail
                                r13 = r0
                                r0 = r11
                                r1 = r13
                                int r1 = r1.getMeasuredHeight()
                                r0.a = r1
                                r0 = r11
                                o.setMessage$1 r1 = new o.setMessage$1
                                r2 = r1
                                r3 = r11
                                r4 = r13
                                r2.<init>(r4)
                                r0.b = r1
                                r0 = r11
                                r1 = r13
                                r0.b(r1)
                                r0 = r15
                                android.widget.ImageView r0 = r0.ivArrowExpand
                                r13 = r0
                                r0 = r11
                                android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                                r2 = r1
                                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                                r4 = 0
                                r5 = 1
                                r6 = 1056964608(0x3f000000, float:0.5)
                                r7 = 1
                                r8 = 1056964608(0x3f000000, float:0.5)
                                r2.<init>(r3, r4, r5, r6, r7, r8)
                                r0.c = r1
                                r0 = r11
                                r1 = r13
                                r0.e(r1)
                                r0 = r12
                                android.util.SparseBooleanArray r0 = r0.e
                                r1 = r14
                                r2 = 0
                                r0.put(r1, r2)
                                return
                            L_0x0070:
                                r0 = r11
                                r1 = r15
                                o.setOnStartEnterTransitionListener r1 = r1.rvTxnDetail
                                r0.c(r1)
                                r0 = r15
                                android.widget.ImageView r0 = r0.ivArrowExpand
                                r13 = r0
                                r0 = r11
                                android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                                r2 = r1
                                r3 = 0
                                r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                                r5 = 1
                                r6 = 1056964608(0x3f000000, float:0.5)
                                r7 = 1
                                r8 = 1056964608(0x3f000000, float:0.5)
                                r2.<init>(r3, r4, r5, r6, r7, r8)
                                r0.c = r1
                                r0 = r11
                                r1 = r13
                                r0.e(r1)
                                r0 = r12
                                android.util.SparseBooleanArray r0 = r0.e
                                r1 = r14
                                r2 = 1
                                r0.put(r1, r2)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.FingerprintActivity_ViewBinding.onClick(android.view.View):void");
                        }
                    });
                }
                if ("BN".equals(this.g.get(i).getServiceType())) {
                    transaksiTertundaVH5.ivQuickAction.setVisibility(8);
                    transaksiTertundaVH5.ivArrowExpand.setVisibility(8);
                }
            }
            if (i <= 0 || this.g.get(i - 1).isHeader()) {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).separator.setVisibility(0);
            } else {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).separator.setVisibility(0);
            }
        } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof HeaderTransaksiTertundaVH) {
            ((HeaderTransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvHeaderTransaksi.setText(this.g.get(i).getTxbDateFormatted());
        }
    }

    public final /* synthetic */ boolean e(Reservation reservation, int i, String str, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298034) {
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder(this.g.get(i).getFlagBooking(), reservation.getNoReff(), this.g.get(i).getTxnType(), this.g.get(i).getToken()));
            return true;
        } else if (itemId != 2131298041) {
            return false;
        } else {
            BranchMapROItemAdapter$BranchMapROItemVH branchMapROItemAdapter$BranchMapROItemVH = new BranchMapROItemAdapter$BranchMapROItemVH(reservation);
            branchMapROItemAdapter$BranchMapROItemVH.d = this.g.get(i).getType();
            branchMapROItemAdapter$BranchMapROItemVH.b = str;
            documentProvider.b().d(branchMapROItemAdapter$BranchMapROItemVH);
            return true;
        }
    }
}
