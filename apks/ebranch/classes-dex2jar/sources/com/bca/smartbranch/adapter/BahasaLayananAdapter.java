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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BahasaLayananAdapter.class */
public final class BahasaLayananAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<BahasaLayananVH> {
    private RadioButton b;
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private int i;
    private Context j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BahasaLayananAdapter$BahasaLayananVH.class */
    class BahasaLayananVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public BahasaLayananVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BahasaLayananAdapter$BahasaLayananVH_ViewBinding.class */
    public class BahasaLayananVH_ViewBinding implements Unbinder {
        private View a;
        private BahasaLayananVH b;
        private View e;

        public BahasaLayananVH_ViewBinding(final BahasaLayananVH bahasaLayananVH, View view) {
            this.b = bahasaLayananVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            bahasaLayananVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BahasaLayananAdapter.BahasaLayananVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    bahasaLayananVH.onClickItem(view2);
                }
            });
            bahasaLayananVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            bahasaLayananVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            bahasaLayananVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            bahasaLayananVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BahasaLayananAdapter.BahasaLayananVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    bahasaLayananVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BahasaLayananVH bahasaLayananVH = this.b;
            if (bahasaLayananVH != null) {
                this.b = null;
                bahasaLayananVH.rbItem = null;
                bahasaLayananVH.tvItem = null;
                bahasaLayananVH.tilItem = null;
                bahasaLayananVH.etItem = null;
                bahasaLayananVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ BahasaLayananVH a(ViewGroup viewGroup, int i) {
        return new BahasaLayananVH(LayoutInflater.from(this.j).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(BahasaLayananVH bahasaLayananVH, int i) {
        BahasaLayananVH bahasaLayananVH2 = bahasaLayananVH;
        bahasaLayananVH2.tvItem.setText(this.e.get(i).e);
        bahasaLayananVH2.rbItem.setChecked(this.e.get(i).d);
        bahasaLayananVH2.rbItem.setTag(Integer.valueOf(i));
        if (bahasaLayananVH2.rbItem.isChecked()) {
            this.b = bahasaLayananVH2.rbItem;
            this.i = i;
        }
        bahasaLayananVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.BahasaLayananAdapter.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (BahasaLayananAdapter.this.b != null) {
                    BahasaLayananAdapter.this.b.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) BahasaLayananAdapter.this.e.get(BahasaLayananAdapter.this.i)).d = false;
                }
                BahasaLayananAdapter.this.b = radioButton;
                BahasaLayananAdapter.this.i = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) BahasaLayananAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
