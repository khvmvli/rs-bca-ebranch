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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPembelianBNAdapter.class */
public final class TujuanPembelianBNAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<TujuanPembelianBNVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context f;
    private RadioButton i = null;
    public int e = 0;
    private String j = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPembelianBNAdapter$TujuanPembelianBNVH.class */
    class TujuanPembelianBNVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public TujuanPembelianBNVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPembelianBNAdapter$TujuanPembelianBNVH_ViewBinding.class */
    public class TujuanPembelianBNVH_ViewBinding implements Unbinder {
        private View a;
        private TujuanPembelianBNVH d;
        private View e;

        public TujuanPembelianBNVH_ViewBinding(final TujuanPembelianBNVH tujuanPembelianBNVH, View view) {
            this.d = tujuanPembelianBNVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            tujuanPembelianBNVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanPembelianBNAdapter.TujuanPembelianBNVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanPembelianBNVH.onClickItem(view2);
                }
            });
            tujuanPembelianBNVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            tujuanPembelianBNVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            tujuanPembelianBNVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            tujuanPembelianBNVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanPembelianBNAdapter.TujuanPembelianBNVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanPembelianBNVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TujuanPembelianBNVH tujuanPembelianBNVH = this.d;
            if (tujuanPembelianBNVH != null) {
                this.d = null;
                tujuanPembelianBNVH.rbItem = null;
                tujuanPembelianBNVH.tvItem = null;
                tujuanPembelianBNVH.tilItem = null;
                tujuanPembelianBNVH.etItem = null;
                tujuanPembelianBNVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TujuanPembelianBNAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.f = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ TujuanPembelianBNVH a(ViewGroup viewGroup, int i) {
        return new TujuanPembelianBNVH(LayoutInflater.from(this.f).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(TujuanPembelianBNVH tujuanPembelianBNVH, int i) {
        TujuanPembelianBNVH tujuanPembelianBNVH2 = tujuanPembelianBNVH;
        tujuanPembelianBNVH2.tvItem.setText(this.b.get(i).e);
        tujuanPembelianBNVH2.rbItem.setChecked(this.b.get(i).d);
        tujuanPembelianBNVH2.rbItem.setTag(Integer.valueOf(i));
        if (tujuanPembelianBNVH2.rbItem.isChecked()) {
            this.i = tujuanPembelianBNVH2.rbItem;
            this.e = i;
        }
        tujuanPembelianBNVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.TujuanPembelianBNAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (TujuanPembelianBNAdapter.this.i != null) {
                    TujuanPembelianBNAdapter.this.i.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) TujuanPembelianBNAdapter.this.b.get(TujuanPembelianBNAdapter.this.e)).d = false;
                }
                TujuanPembelianBNAdapter.this.i = radioButton;
                TujuanPembelianBNAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) TujuanPembelianBNAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
