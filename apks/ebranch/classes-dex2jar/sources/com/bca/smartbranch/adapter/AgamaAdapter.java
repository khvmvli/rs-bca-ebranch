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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/AgamaAdapter.class */
public final class AgamaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<AgamaVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context f;
    private RadioButton h = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/AgamaAdapter$AgamaVH.class */
    class AgamaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public AgamaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/AgamaAdapter$AgamaVH_ViewBinding.class */
    public class AgamaVH_ViewBinding implements Unbinder {
        private View b;
        private View d;
        private AgamaVH e;

        public AgamaVH_ViewBinding(final AgamaVH agamaVH, View view) {
            this.e = agamaVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            agamaVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.AgamaAdapter.AgamaVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    agamaVH.onClickItem(view2);
                }
            });
            agamaVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            agamaVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            agamaVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            agamaVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.b = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.AgamaAdapter.AgamaVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    agamaVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            AgamaVH agamaVH = this.e;
            if (agamaVH != null) {
                this.e = null;
                agamaVH.rbItem = null;
                agamaVH.tvItem = null;
                agamaVH.tilItem = null;
                agamaVH.etItem = null;
                agamaVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AgamaAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.f = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ AgamaVH a(ViewGroup viewGroup, int i) {
        return new AgamaVH(LayoutInflater.from(this.f).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(AgamaVH agamaVH, int i) {
        AgamaVH agamaVH2 = agamaVH;
        agamaVH2.tvItem.setText(this.b.get(i).e);
        agamaVH2.rbItem.setChecked(this.b.get(i).d);
        agamaVH2.rbItem.setTag(Integer.valueOf(i));
        if (agamaVH2.rbItem.isChecked()) {
            this.h = agamaVH2.rbItem;
            this.e = i;
        }
        agamaVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.AgamaAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (AgamaAdapter.this.h != null) {
                    AgamaAdapter.this.h.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) AgamaAdapter.this.b.get(AgamaAdapter.this.e)).d = false;
                }
                AgamaAdapter.this.h = radioButton;
                AgamaAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) AgamaAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
