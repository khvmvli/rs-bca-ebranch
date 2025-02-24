package com.bca.smartbranch.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import io.realm.RealmResults;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListMultipleReservasiAdapter.class */
public final class ListMultipleReservasiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public static final Integer b = 0;
    public static final Integer e = 1;
    public RealmResults<ReservasiOnline> h;
    public String i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH.class */
    class ListDetailMultiTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298334)
        setOnStartEnterTransitionListener rvPenerima;
        @BindView(2131298372)
        View separator;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299697)
        TextView tvUbah;

        public ListDetailMultiTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.class */
    public class ListDetailMultiTransaksiVH_ViewBinding implements Unbinder {
        private ListDetailMultiTransaksiVH b;

        public ListDetailMultiTransaksiVH_ViewBinding(ListDetailMultiTransaksiVH listDetailMultiTransaksiVH, View view) {
            this.b = listDetailMultiTransaksiVH;
            listDetailMultiTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailMultiTransaksiVH.rvPenerima = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298334, "field 'rvPenerima'", setOnStartEnterTransitionListener.class);
            listDetailMultiTransaksiVH.tvUbah = (TextView) Utils.findRequiredViewAsType(view, 2131299697, "field 'tvUbah'", TextView.class);
            listDetailMultiTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = this.b;
            if (listDetailMultiTransaksiVH != null) {
                this.b = null;
                listDetailMultiTransaksiVH.tvTransaksi = null;
                listDetailMultiTransaksiVH.rvPenerima = null;
                listDetailMultiTransaksiVH.tvUbah = null;
                listDetailMultiTransaksiVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListMultipleReservasiAdapter$ListMultipleReservasiVH.class */
    class ListMultipleReservasiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298372)
        View separator;
        @BindView(2131299518)
        TextView tvBankName;
        @BindView(2131299468)
        TextView tvNorek;
        @BindView(2131299677)
        TextView tvTotal;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299697)
        TextView tvUbah;
        @BindView(2131299732)
        TextView tvValue;

        public ListMultipleReservasiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding.class */
    public class ListMultipleReservasiVH_ViewBinding implements Unbinder {
        private ListMultipleReservasiVH b;

        public ListMultipleReservasiVH_ViewBinding(ListMultipleReservasiVH listMultipleReservasiVH, View view) {
            this.b = listMultipleReservasiVH;
            listMultipleReservasiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listMultipleReservasiVH.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
            listMultipleReservasiVH.tvValue = (TextView) Utils.findRequiredViewAsType(view, 2131299732, "field 'tvValue'", TextView.class);
            listMultipleReservasiVH.tvBankName = (TextView) Utils.findRequiredViewAsType(view, 2131299518, "field 'tvBankName'", TextView.class);
            listMultipleReservasiVH.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
            listMultipleReservasiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            listMultipleReservasiVH.tvUbah = (TextView) Utils.findRequiredViewAsType(view, 2131299697, "field 'tvUbah'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListMultipleReservasiVH listMultipleReservasiVH = this.b;
            if (listMultipleReservasiVH != null) {
                this.b = null;
                listMultipleReservasiVH.tvTransaksi = null;
                listMultipleReservasiVH.tvTotal = null;
                listMultipleReservasiVH.tvValue = null;
                listMultipleReservasiVH.tvBankName = null;
                listMultipleReservasiVH.tvNorek = null;
                listMultipleReservasiVH.separator = null;
                listMultipleReservasiVH.tvUbah = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == e.intValue() ? new ListDetailMultiTransaksiVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131493319, viewGroup, false)) : new ListMultipleReservasiVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131493318, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.h.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        return (this.h.get(i).getPenerimaList().size() <= 0 || !this.i.equalsIgnoreCase("Y")) ? b.intValue() : e.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a2, code lost:
        if (r0.get(r0 == null ? -1 : r0.e(r0)).getNominalTransaksiTeller().contains(".") == false) goto L_0x01a5;
     */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r8, int r9) {
        /*
        // Method dump skipped, instructions count: 1663
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.adapter.ListMultipleReservasiAdapter.e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, int):void");
    }
}
