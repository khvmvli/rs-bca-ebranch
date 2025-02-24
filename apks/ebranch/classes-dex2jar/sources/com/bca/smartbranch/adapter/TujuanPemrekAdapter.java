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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPemrekAdapter.class */
public final class TujuanPemrekAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<TujuanPemrekVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context i;
    private RadioButton f = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPemrekAdapter$TujuanPemrekVH.class */
    class TujuanPemrekVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public TujuanPemrekVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TujuanPemrekAdapter$TujuanPemrekVH_ViewBinding.class */
    public class TujuanPemrekVH_ViewBinding implements Unbinder {
        private View a;
        private View b;
        private TujuanPemrekVH e;

        public TujuanPemrekVH_ViewBinding(final TujuanPemrekVH tujuanPemrekVH, View view) {
            this.e = tujuanPemrekVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            tujuanPemrekVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanPemrekAdapter.TujuanPemrekVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanPemrekVH.onClickItem(view2);
                }
            });
            tujuanPemrekVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            tujuanPemrekVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            tujuanPemrekVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            tujuanPemrekVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TujuanPemrekAdapter.TujuanPemrekVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tujuanPemrekVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TujuanPemrekVH tujuanPemrekVH = this.e;
            if (tujuanPemrekVH != null) {
                this.e = null;
                tujuanPemrekVH.rbItem = null;
                tujuanPemrekVH.tvItem = null;
                tujuanPemrekVH.tilItem = null;
                tujuanPemrekVH.etItem = null;
                tujuanPemrekVH.llItem = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TujuanPemrekAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ TujuanPemrekVH a(ViewGroup viewGroup, int i) {
        return new TujuanPemrekVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(TujuanPemrekVH tujuanPemrekVH, int i) {
        TujuanPemrekVH tujuanPemrekVH2 = tujuanPemrekVH;
        tujuanPemrekVH2.tvItem.setText(this.b.get(i).e);
        tujuanPemrekVH2.rbItem.setChecked(this.b.get(i).d);
        tujuanPemrekVH2.rbItem.setTag(Integer.valueOf(i));
        if (tujuanPemrekVH2.rbItem.isChecked()) {
            this.f = tujuanPemrekVH2.rbItem;
            this.e = i;
        }
        tujuanPemrekVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.TujuanPemrekAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (TujuanPemrekAdapter.this.f != null) {
                    TujuanPemrekAdapter.this.f.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) TujuanPemrekAdapter.this.b.get(TujuanPemrekAdapter.this.e)).d = false;
                }
                TujuanPemrekAdapter.this.f = radioButton;
                TujuanPemrekAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) TujuanPemrekAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
