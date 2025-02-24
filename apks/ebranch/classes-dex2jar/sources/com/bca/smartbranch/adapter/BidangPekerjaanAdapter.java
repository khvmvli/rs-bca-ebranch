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
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BidangPekerjaanAdapter.class */
public final class BidangPekerjaanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<BidangPekerjaanVH> {
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> f;
    private Context h;
    private RadioButton i = null;
    public int b = 0;
    public String e = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BidangPekerjaanAdapter$BidangPekerjaanVH.class */
    class BidangPekerjaanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public BidangPekerjaanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BidangPekerjaanAdapter$BidangPekerjaanVH_ViewBinding.class */
    public class BidangPekerjaanVH_ViewBinding implements Unbinder {
        private View a;
        private View b;
        private BidangPekerjaanVH d;

        public BidangPekerjaanVH_ViewBinding(final BidangPekerjaanVH bidangPekerjaanVH, View view) {
            this.d = bidangPekerjaanVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            bidangPekerjaanVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BidangPekerjaanAdapter.BidangPekerjaanVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    bidangPekerjaanVH.onClickItem(view2);
                }
            });
            bidangPekerjaanVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            bidangPekerjaanVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            bidangPekerjaanVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            bidangPekerjaanVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.b = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BidangPekerjaanAdapter.BidangPekerjaanVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    bidangPekerjaanVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BidangPekerjaanVH bidangPekerjaanVH = this.d;
            if (bidangPekerjaanVH != null) {
                this.d = null;
                bidangPekerjaanVH.rbItem = null;
                bidangPekerjaanVH.tvItem = null;
                bidangPekerjaanVH.tilItem = null;
                bidangPekerjaanVH.etItem = null;
                bidangPekerjaanVH.llItem = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BidangPekerjaanAdapter(Context context, List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list) {
        this.h = context;
        this.f = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ BidangPekerjaanVH a(ViewGroup viewGroup, int i) {
        return new BidangPekerjaanVH(LayoutInflater.from(this.h).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.f.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(BidangPekerjaanVH bidangPekerjaanVH, int i) {
        BidangPekerjaanVH bidangPekerjaanVH2 = bidangPekerjaanVH;
        bidangPekerjaanVH2.tvItem.setText(this.f.get(i).getDescription());
        bidangPekerjaanVH2.rbItem.setChecked(this.f.get(i).isSelected());
        bidangPekerjaanVH2.rbItem.setTag(Integer.valueOf(i));
        if (bidangPekerjaanVH2.rbItem.isChecked()) {
            this.i = bidangPekerjaanVH2.rbItem;
            this.b = i;
        }
        bidangPekerjaanVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.BidangPekerjaanAdapter.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (BidangPekerjaanAdapter.this.i != null) {
                    BidangPekerjaanAdapter.this.i.setChecked(false);
                    ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) BidangPekerjaanAdapter.this.f.get(BidangPekerjaanAdapter.this.b)).setSelected(false);
                }
                BidangPekerjaanAdapter.this.i = radioButton;
                BidangPekerjaanAdapter.this.b = intValue;
                ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) BidangPekerjaanAdapter.this.f.get(intValue)).setSelected(radioButton.isChecked());
            }
        });
    }
}
