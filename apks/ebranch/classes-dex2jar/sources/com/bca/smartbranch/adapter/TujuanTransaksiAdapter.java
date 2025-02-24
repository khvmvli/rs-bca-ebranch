package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.LogoutDialog_ViewBinding;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanTransaksiAdapter.class */
public final class TujuanTransaksiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<TujuanTransaksiVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context h;
    private RadioButton g = null;
    public int e = -1;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanTransaksiAdapter$TujuanTransaksiVH.class */
    class TujuanTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296991)
        EditText etItem;
        @BindView(2131297693)
        LinearLayout llItem;
        @BindView(2131298147)
        RadioButton rbItem;
        @BindView(2131298540)
        LogoutDialog_ViewBinding tilItem;
        @BindView(2131299296)
        TextView tvItem;

        public TujuanTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanTransaksiAdapter$TujuanTransaksiVH_ViewBinding.class */
    public class TujuanTransaksiVH_ViewBinding implements Unbinder {
        private TujuanTransaksiVH a;
        private View c;
        private View d;

        public TujuanTransaksiVH_ViewBinding(final TujuanTransaksiVH tujuanTransaksiVH, View view) {
            this.a = tujuanTransaksiVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            tujuanTransaksiVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanTransaksiAdapter.TujuanTransaksiVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanTransaksiVH.onClickItem(view2);
                }
            });
            tujuanTransaksiVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            tujuanTransaksiVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            tujuanTransaksiVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            tujuanTransaksiVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanTransaksiAdapter.TujuanTransaksiVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanTransaksiVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TujuanTransaksiVH tujuanTransaksiVH = this.a;
            if (tujuanTransaksiVH != null) {
                this.a = null;
                tujuanTransaksiVH.rbItem = null;
                tujuanTransaksiVH.tvItem = null;
                tujuanTransaksiVH.tilItem = null;
                tujuanTransaksiVH.etItem = null;
                tujuanTransaksiVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TujuanTransaksiAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.h = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ TujuanTransaksiVH a(ViewGroup viewGroup, int i) {
        return new TujuanTransaksiVH(LayoutInflater.from(this.h).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(TujuanTransaksiVH tujuanTransaksiVH, int i) {
        TujuanTransaksiVH tujuanTransaksiVH2 = tujuanTransaksiVH;
        tujuanTransaksiVH2.tvItem.setText(this.b.get(i).e);
        tujuanTransaksiVH2.rbItem.setChecked(this.b.get(i).d);
        tujuanTransaksiVH2.rbItem.setTag(Integer.valueOf(i));
        if (tujuanTransaksiVH2.rbItem.isChecked()) {
            this.g = tujuanTransaksiVH2.rbItem;
            this.e = i;
        }
        tujuanTransaksiVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.TujuanTransaksiAdapter.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (TujuanTransaksiAdapter.this.g != null) {
                    TujuanTransaksiAdapter.this.g.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) TujuanTransaksiAdapter.this.b.get(TujuanTransaksiAdapter.this.e)).d = false;
                }
                TujuanTransaksiAdapter.this.g = radioButton;
                TujuanTransaksiAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) TujuanTransaksiAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
