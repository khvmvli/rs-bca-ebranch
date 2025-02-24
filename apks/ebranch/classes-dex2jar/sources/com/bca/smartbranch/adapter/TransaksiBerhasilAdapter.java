package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import o.onTakePicture;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter.class */
public final class TransaksiBerhasilAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public List<onTakePicture.write> b = new ArrayList();
    public boolean e = false;
    private Context h;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter$HeaderTransaksiTertundaVH.class */
    class HeaderTransaksiTertundaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299269)
        TextView tvHeaderTransaksi;

        public HeaderTransaksiTertundaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter$HeaderTransaksiTertundaVH_ViewBinding.class */
    public class HeaderTransaksiTertundaVH_ViewBinding implements Unbinder {
        private HeaderTransaksiTertundaVH d;

        public HeaderTransaksiTertundaVH_ViewBinding(HeaderTransaksiTertundaVH headerTransaksiTertundaVH, View view) {
            this.d = headerTransaksiTertundaVH;
            headerTransaksiTertundaVH.tvHeaderTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299269, "field 'tvHeaderTransaksi'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HeaderTransaksiTertundaVH headerTransaksiTertundaVH = this.d;
            if (headerTransaksiTertundaVH != null) {
                this.d = null;
                headerTransaksiTertundaVH.tvHeaderTransaksi = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter$TransaksiTertundaVH.class */
    class TransaksiTertundaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297411)
        ImageView ivRedLine;
        @BindView(2131298313)
        RelativeLayout rlMain;
        @BindView(2131299776)
        View separator;
        @BindView(2131299672)
        TextView tvTitleTransaksi;
        @BindView(2131299734)
        TextView tvValueTransaksi;

        public TransaksiTertundaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter$TransaksiTertundaVH_ViewBinding.class */
    public class TransaksiTertundaVH_ViewBinding implements Unbinder {
        private TransaksiTertundaVH e;

        public TransaksiTertundaVH_ViewBinding(TransaksiTertundaVH transaksiTertundaVH, View view) {
            this.e = transaksiTertundaVH;
            transaksiTertundaVH.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
            transaksiTertundaVH.tvValueTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299734, "field 'tvValueTransaksi'", TextView.class);
            transaksiTertundaVH.ivRedLine = (ImageView) Utils.findRequiredViewAsType(view, 2131297411, "field 'ivRedLine'", ImageView.class);
            transaksiTertundaVH.rlMain = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298313, "field 'rlMain'", RelativeLayout.class);
            transaksiTertundaVH.separator = Utils.findRequiredView(view, 2131299776, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiTertundaVH transaksiTertundaVH = this.e;
            if (transaksiTertundaVH != null) {
                this.e = null;
                transaksiTertundaVH.tvTitleTransaksi = null;
                transaksiTertundaVH.tvValueTransaksi = null;
                transaksiTertundaVH.ivRedLine = null;
                transaksiTertundaVH.rlMain = null;
                transaksiTertundaVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilAdapter$read.class */
    final class read extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        public read(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public TransaksiBerhasilAdapter(Context context) {
        this.h = context;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == 1 ? new TransaksiTertundaVH(LayoutInflater.from(this.h).inflate(2131493329, viewGroup, false)) : i == 0 ? new HeaderTransaksiTertundaVH(LayoutInflater.from(this.h).inflate(2131493472, viewGroup, false)) : i == 2 ? new read(LayoutInflater.from(this.h).inflate(2131493338, viewGroup, false)) : null;
    }

    public final void b() {
        this.e = false;
        int size = this.b.size() - 1;
        if (size >= 0 && this.b.get(size) != null) {
            this.b.remove(size);
            b(size);
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        if (!this.e || i != this.b.size() - 1) {
            return this.b.get(i).g ? 0 : 1;
        }
        return 2;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, final int i) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof TransaksiTertundaVH) {
            if (this.b.get(i).i == null || !this.b.get(i).i.equals("N") || !"0".equals(this.b.get(i).f174o)) {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).ivRedLine.setVisibility(8);
            } else {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).ivRedLine.setVisibility(0);
            }
            if (this.b.get(i).s.contains("Pembukaan Rekening")) {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvTitleTransaksi.setText(2131822000);
            } else {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvTitleTransaksi.setText(this.b.get(i).s);
            }
            if (this.b.get(i).k.equals("CC")) {
                if (this.b.get(i).f174o.equalsIgnoreCase("3")) {
                    ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText("Proses Analisa");
                } else if (this.b.get(i).f174o.equalsIgnoreCase("4")) {
                    ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText("Kartu Diterima");
                } else if (this.b.get(i).f174o.equalsIgnoreCase("5")) {
                    ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText("Pengajuan Ditolak");
                } else if (this.b.get(i).f174o.equalsIgnoreCase("6")) {
                    ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText("Kartu Diretur");
                } else {
                    ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText(this.b.get(i).m);
                }
            } else if (!this.b.get(i).s.equals("Transfer ke Bank Lain") || this.b.get(i).f == null) {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText(this.b.get(i).m);
            } else if (!this.b.get(i).f.substring(0, 3).equalsIgnoreCase("E96") || !this.b.get(i).m.equalsIgnoreCase("Berhasil")) {
                ((TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvValueTransaksi.setText(this.b.get(i).m);
            } else {
                TransaksiTertundaVH transaksiTertundaVH = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                transaksiTertundaVH.tvValueTransaksi.setText("Berhasil - Pendebetan Dana");
                transaksiTertundaVH.ivRedLine.setVisibility(8);
            }
            TransaksiTertundaVH transaksiTertundaVH2 = (TransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            transaksiTertundaVH2.rlMain.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.TransaksiBerhasilAdapter.1
                /* JADX WARN: Removed duplicated region for block: B:82:0x070b  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0841  */
                @Override // android.view.View.OnClickListener
                /* Code decompiled incorrectly, please refer to instructions dump */
                public final void onClick(android.view.View r6) {
                    /*
                    // Method dump skipped, instructions count: 2324
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.adapter.TransaksiBerhasilAdapter.AnonymousClass1.onClick(android.view.View):void");
                }
            });
            if (i <= 0 || this.b.get(i - 1).g) {
                transaksiTertundaVH2.separator.setVisibility(8);
            } else {
                transaksiTertundaVH2.separator.setVisibility(0);
            }
        } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof HeaderTransaksiTertundaVH) {
            ((HeaderTransaksiTertundaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvHeaderTransaksi.setText(this.b.get(i).r);
        }
    }
}
