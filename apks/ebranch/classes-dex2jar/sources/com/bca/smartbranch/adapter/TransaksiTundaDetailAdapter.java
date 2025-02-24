package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.global.TransaksiTundaDetail;
import com.bca.smartbranch.data.global.TransaksiTundaSubDetail;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import o.ChooseMastercardAdapter$ViewHolder_ViewBinding;
import o.ChooseSubBCACardAdapter$ViewHolder_ViewBinding;
import o.ChooseSubMastercardAdapter$ViewHolder;
import o.documentProvider;
import o.getPromotion;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaDetailAdapter.class */
public final class TransaksiTundaDetailAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public List<TransaksiTundaDetail> b;
    public Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaDetailAdapter$TransaksiTundaDetailAdapterVH.class */
    public class TransaksiTundaDetailAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297410)
        public ImageView ivQuickAction;
        @BindView(2131297411)
        ImageView ivRedLine;
        @BindView(2131298313)
        RelativeLayout rlMain;
        @BindView(2131298340)
        setOnStartEnterTransitionListener rvTxnSubDetail;
        @BindView(2131298828)
        TextView tvAmmount;
        @BindView(2131299672)
        TextView tvTitleTransaksi;
        @BindView(2131299734)
        TextView tvValueTransaksi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransaksiTundaDetailAdapterVH(View view) {
            super(view);
            TransaksiTundaDetailAdapter.this = r4;
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaDetailAdapter$TransaksiTundaDetailAdapterVH_ViewBinding.class */
    public class TransaksiTundaDetailAdapterVH_ViewBinding implements Unbinder {
        private TransaksiTundaDetailAdapterVH e;

        public TransaksiTundaDetailAdapterVH_ViewBinding(TransaksiTundaDetailAdapterVH transaksiTundaDetailAdapterVH, View view) {
            this.e = transaksiTundaDetailAdapterVH;
            transaksiTundaDetailAdapterVH.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
            transaksiTundaDetailAdapterVH.tvValueTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299734, "field 'tvValueTransaksi'", TextView.class);
            transaksiTundaDetailAdapterVH.tvAmmount = (TextView) Utils.findRequiredViewAsType(view, 2131298828, "field 'tvAmmount'", TextView.class);
            transaksiTundaDetailAdapterVH.ivRedLine = (ImageView) Utils.findRequiredViewAsType(view, 2131297411, "field 'ivRedLine'", ImageView.class);
            transaksiTundaDetailAdapterVH.rlMain = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298313, "field 'rlMain'", RelativeLayout.class);
            transaksiTundaDetailAdapterVH.ivQuickAction = (ImageView) Utils.findRequiredViewAsType(view, 2131297410, "field 'ivQuickAction'", ImageView.class);
            transaksiTundaDetailAdapterVH.rvTxnSubDetail = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298340, "field 'rvTxnSubDetail'", setOnStartEnterTransitionListener.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiTundaDetailAdapterVH transaksiTundaDetailAdapterVH = this.e;
            if (transaksiTundaDetailAdapterVH != null) {
                this.e = null;
                transaksiTundaDetailAdapterVH.tvTitleTransaksi = null;
                transaksiTundaDetailAdapterVH.tvValueTransaksi = null;
                transaksiTundaDetailAdapterVH.tvAmmount = null;
                transaksiTundaDetailAdapterVH.ivRedLine = null;
                transaksiTundaDetailAdapterVH.rlMain = null;
                transaksiTundaDetailAdapterVH.ivQuickAction = null;
                transaksiTundaDetailAdapterVH.rvTxnSubDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TransaksiTundaDetailAdapter(Context context, List<TransaksiTundaDetail> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new TransaksiTundaDetailAdapterVH(LayoutInflater.from(this.e).inflate(2131493330, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    public final /* synthetic */ boolean c(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298034) {
            documentProvider.b().d(new ChooseMastercardAdapter$ViewHolder_ViewBinding(this.b.get(i).getTransaksiTunda().getNoReff(), this.b.get(i).getToken(), true));
            return true;
        } else if (itemId != 2131298042) {
            return false;
        } else {
            if (!this.b.get(i).getTxbType().equalsIgnoreCase("Transfer ke Bank Lain") || this.b.get(i).getNoReffAnak() == null) {
                documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(this.b.get(i).getToken(), this.b.get(i).getTransaksiTunda().getNoReff(), this.b.get(i).getTxbType(), Integer.valueOf(i)));
                return true;
            }
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(this.b.get(i).getToken(), this.b.get(i).getNoReffAnak(), this.b.get(i).getTxbType(), Integer.valueOf(i)));
            return true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        TransaksiTundaDetailAdapterVH transaksiTundaDetailAdapterVH = (TransaksiTundaDetailAdapterVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        transaksiTundaDetailAdapterVH.ivRedLine.setVisibility(8);
        if (this.b.get(i).getTxbType().contains("Pembukaan Rekening")) {
            transaksiTundaDetailAdapterVH.tvTitleTransaksi.setText(this.b.get(i).getTxbType().substring(0, 18));
        } else {
            transaksiTundaDetailAdapterVH.tvTitleTransaksi.setText(this.b.get(i).getTxbType());
        }
        if (this.b.get(i).getFlagReservasi().equalsIgnoreCase("Y")) {
            transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(8);
            if ((this.b.get(i).getAmount() == null || !this.b.get(i).getAmount().equalsIgnoreCase("0") || (!(this.b.get(i).getTransaksiTundaSubDetailList() == null || this.b.get(i).getTransaksiTundaSubDetailList().size() == 0) || !this.b.get(i).getTransaksiTunda().getTxnType().equalsIgnoreCase("Transaksi Teller"))) && (this.b.get(i).getAccountNumber() == null || !this.b.get(i).getAccountNumber().equalsIgnoreCase("") || !this.b.get(i).getTransaksiTunda().getTxnType().equalsIgnoreCase("Transaksi CS"))) {
                transaksiTundaDetailAdapterVH.ivQuickAction.setVisibility(0);
                transaksiTundaDetailAdapterVH.ivQuickAction.setOnClickListener(new View.OnClickListener(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i) { // from class: o.onAktivasiUlangEvent
                    public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable d;
                    public final /* synthetic */ int e;

                    {
                        this.d = r5;
                        this.e = r6;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a6: IPUT  
                          (wrap: o.ForgotPassActivity_ViewBinding : 0x00a3: CONSTRUCTOR  (r1v3 o.ForgotPassActivity_ViewBinding A[REMOVE]) = (r0v1 'transaksiTundaDetailAdapter' com.bca.smartbranch.adapter.TransaksiTundaDetailAdapter), (r0v5 'i2' int) call: o.ForgotPassActivity_ViewBinding.<init>(com.bca.smartbranch.adapter.TransaksiTundaDetailAdapter, int):void type: CONSTRUCTOR)
                          (r0v10 'sethoverlistener' o.setHoverListener)
                         o.setHoverListener.c o.setHoverListener$write in method: o.onAktivasiUlangEvent.onClick(android.view.View):void, file: classes-dex2jar.jar:o/onAktivasiUlangEvent.class
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.ForgotPassActivity_ViewBinding, state: NOT_LOADED
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
                        // Method dump skipped, instructions count: 227
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.onAktivasiUlangEvent.onClick(android.view.View):void");
                    }
                });
                if (this.b.get(i).getTransaksiTundaSubDetailList() == null || this.b.get(i).getTransaksiTundaSubDetailList().size() <= 0) {
                    if (!this.b.get(i).getTransaksiTunda().getTxnType().equalsIgnoreCase("Transaksi Teller")) {
                        transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getAccountNumber());
                    } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Transfer ke Bank Lain")) {
                        BigDecimal add = new BigDecimal("0").add(new BigDecimal(this.b.get(i).getAmount())).add(new BigDecimal(this.b.get(i).getFee()));
                        TextView textView = transaksiTundaDetailAdapterVH.tvAmmount;
                        StringBuilder sb = new StringBuilder();
                        sb.append(getPromotion.a(add.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
                        sb.append(" IDR");
                        textView.setText(sb.toString());
                        transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(0);
                        transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
                    } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Setoran Tunai")) {
                        transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(0);
                        TextView textView2 = transaksiTundaDetailAdapterVH.tvAmmount;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getPromotion.a(this.b.get(i).getAmount().replace(".", ",")));
                        sb2.append(" ");
                        sb2.append(this.b.get(i).getCurrency());
                        textView2.setText(sb2.toString());
                        transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
                    } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Kliring")) {
                        transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
                        transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(0);
                        TextView textView3 = transaksiTundaDetailAdapterVH.tvAmmount;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(getPromotion.a(this.b.get(i).getAmount().replace(".", ",")));
                        sb3.append(" ");
                        sb3.append(this.b.get(i).getCurrency());
                        textView3.setText(sb3.toString());
                    } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Tarikan Tunai")) {
                        TextView textView4 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(getPromotion.h(this.b.get(i).getAmount().replace(".", ",")).replace(",", "."));
                        sb4.append(" ");
                        sb4.append(this.b.get(i).getCurrency());
                        textView4.setText(sb4.toString());
                    } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Transfer Valuta Asing")) {
                        TextView textView5 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(getPromotion.j(this.b.get(i).getAmount().replace(".", ",")));
                        sb5.append(" ");
                        sb5.append(this.b.get(i).getCurrency());
                        textView5.setText(sb5.toString());
                    } else {
                        TextView textView6 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(getPromotion.a(this.b.get(i).getAmount().replace(".", ",")));
                        sb6.append(" ");
                        sb6.append(this.b.get(i).getCurrency());
                        textView6.setText(sb6.toString());
                    }
                    transaksiTundaDetailAdapterVH.rvTxnSubDetail.setVisibility(8);
                    return;
                }
                BigDecimal bigDecimal = new BigDecimal("0");
                for (TransaksiTundaSubDetail transaksiTundaSubDetail : this.b.get(i).getTransaksiTundaSubDetailList()) {
                    bigDecimal = bigDecimal.add(new BigDecimal(transaksiTundaSubDetail.getAmount())).add(new BigDecimal(transaksiTundaSubDetail.getFee()));
                }
                TextView textView7 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(this.b.get(i).getTransaksiTundaSubDetailList().size());
                sb7.append(" Penerima");
                textView7.setText(sb7.toString());
                TextView textView8 = transaksiTundaDetailAdapterVH.tvAmmount;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(getPromotion.a(bigDecimal.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
                sb8.append(" IDR");
                textView8.setText(sb8.toString());
                TransaksiTundaSubDetailAdapter transaksiTundaSubDetailAdapter = new TransaksiTundaSubDetailAdapter(this.e, this.b.get(i).getTransaksiTundaSubDetailList());
                transaksiTundaDetailAdapterVH.rvTxnSubDetail.setLayoutManager(new LinearLayoutManager(1, false));
                transaksiTundaDetailAdapterVH.rvTxnSubDetail.setAdapter(transaksiTundaSubDetailAdapter);
                transaksiTundaDetailAdapterVH.rvTxnSubDetail.setVisibility(0);
                return;
            }
            transaksiTundaDetailAdapterVH.tvValueTransaksi.setText("Reservasi");
            transaksiTundaDetailAdapterVH.ivQuickAction.setVisibility(8);
            return;
        }
        transaksiTundaDetailAdapterVH.ivQuickAction.setOnClickListener(new View.OnClickListener(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, i) { // from class: o.ForgotPassActivity
            public final /* synthetic */ setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a;
            public final /* synthetic */ int d;

            {
                this.a = r5;
                this.d = r6;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a6: IPUT  
                  (wrap: o.send : 0x00a3: CONSTRUCTOR  (r1v3 o.send A[REMOVE]) = (r0v1 'transaksiTundaDetailAdapter' com.bca.smartbranch.adapter.TransaksiTundaDetailAdapter), (r0v5 'i2' int) call: o.send.<init>(com.bca.smartbranch.adapter.TransaksiTundaDetailAdapter, int):void type: CONSTRUCTOR)
                  (r0v10 'sethoverlistener' o.setHoverListener)
                 o.setHoverListener.c o.setHoverListener$write in method: o.ForgotPassActivity.onClick(android.view.View):void, file: classes-dex2jar.jar:o/ForgotPassActivity.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.send, state: NOT_LOADED
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
                // Method dump skipped, instructions count: 232
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ForgotPassActivity.onClick(android.view.View):void");
            }
        });
        if (this.b.get(i).getTransaksiTundaSubDetailList() == null || this.b.get(i).getTransaksiTundaSubDetailList().size() <= 0) {
            if (this.b.get(i).getTxbType().equalsIgnoreCase("Transfer ke Bank Lain")) {
                BigDecimal add2 = new BigDecimal("0").add(new BigDecimal(this.b.get(i).getAmount())).add(new BigDecimal(this.b.get(i).getFee()));
                transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
                TextView textView9 = transaksiTundaDetailAdapterVH.tvAmmount;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(getPromotion.a(add2.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
                sb9.append(" IDR");
                textView9.setText(sb9.toString());
            } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Setoran Tunai")) {
                transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(0);
                TextView textView10 = transaksiTundaDetailAdapterVH.tvAmmount;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(getPromotion.a(this.b.get(i).getAmount().replace(".", ",")));
                sb10.append(" ");
                sb10.append(this.b.get(i).getCurrency());
                textView10.setText(sb10.toString());
                transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
            } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Transfer Valuta Asing")) {
                TextView textView11 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(getPromotion.j(this.b.get(i).getAmount().replace(".", ",")));
                sb11.append(" ");
                sb11.append(this.b.get(i).getCurrency());
                textView11.setText(sb11.toString());
            } else {
                TextView textView12 = transaksiTundaDetailAdapterVH.tvAmmount;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(getPromotion.a(this.b.get(i).getAmount()));
                sb12.append(" ");
                sb12.append(this.b.get(i).getCurrency());
                textView12.setText(sb12.toString());
                if (this.b.get(i).getTxbType().equalsIgnoreCase("Setoran Tunai")) {
                    transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getAccountNumber());
                } else if (this.b.get(i).getTxbType().equalsIgnoreCase("Tarikan Tunai")) {
                    TextView textView13 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(getPromotion.h(this.b.get(i).getAmount().replace(".", ",")).replace(",", "."));
                    sb13.append(" ");
                    sb13.append(this.b.get(i).getCurrency());
                    textView13.setText(sb13.toString());
                    transaksiTundaDetailAdapterVH.tvAmmount.setVisibility(8);
                } else if (this.b.get(i).getReceiverName() != null) {
                    transaksiTundaDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
                } else {
                    transaksiTundaDetailAdapterVH.tvValueTransaksi.setText("-");
                }
            }
            transaksiTundaDetailAdapterVH.rvTxnSubDetail.setVisibility(8);
            return;
        }
        BigDecimal bigDecimal2 = new BigDecimal("0");
        for (TransaksiTundaSubDetail transaksiTundaSubDetail2 : this.b.get(i).getTransaksiTundaSubDetailList()) {
            bigDecimal2 = bigDecimal2.add(new BigDecimal(transaksiTundaSubDetail2.getAmount())).add(new BigDecimal(transaksiTundaSubDetail2.getFee()));
        }
        TextView textView14 = transaksiTundaDetailAdapterVH.tvValueTransaksi;
        StringBuilder sb14 = new StringBuilder();
        sb14.append(this.b.get(i).getTransaksiTundaSubDetailList().size());
        sb14.append(" Penerima");
        textView14.setText(sb14.toString());
        TextView textView15 = transaksiTundaDetailAdapterVH.tvAmmount;
        StringBuilder sb15 = new StringBuilder();
        sb15.append(getPromotion.a(bigDecimal2.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
        sb15.append(" IDR");
        textView15.setText(sb15.toString());
        TransaksiTundaSubDetailAdapter transaksiTundaSubDetailAdapter2 = new TransaksiTundaSubDetailAdapter(this.e, this.b.get(i).getTransaksiTundaSubDetailList());
        transaksiTundaDetailAdapterVH.rvTxnSubDetail.setLayoutManager(new LinearLayoutManager(1, false));
        transaksiTundaDetailAdapterVH.rvTxnSubDetail.setAdapter(transaksiTundaSubDetailAdapter2);
        transaksiTundaDetailAdapterVH.rvTxnSubDetail.setVisibility(0);
    }

    public final /* synthetic */ boolean e(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298034) {
            documentProvider.b().d(new ChooseSubMastercardAdapter$ViewHolder(this.b.get(i).getTransaksiTunda().getNoReff(), this.b.get(i).getToken()));
            return true;
        } else if (itemId != 2131298042) {
            return false;
        } else {
            if (!this.b.get(i).getTxbType().equalsIgnoreCase("Transfer ke Bank Lain") || this.b.get(i).getNoReffAnak() == null) {
                documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(this.b.get(i).getToken(), this.b.get(i).getTransaksiTunda().getNoReff(), this.b.get(i).getTxbType(), Integer.valueOf(i)));
                return true;
            }
            documentProvider.b().d(new ChooseSubBCACardAdapter$ViewHolder_ViewBinding(this.b.get(i).getToken(), this.b.get(i).getNoReffAnak(), this.b.get(i).getTxbType(), Integer.valueOf(i)));
            return true;
        }
    }
}
