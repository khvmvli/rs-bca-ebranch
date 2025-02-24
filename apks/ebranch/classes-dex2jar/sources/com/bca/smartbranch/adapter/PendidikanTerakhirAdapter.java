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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PendidikanTerakhirAdapter.class */
public final class PendidikanTerakhirAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<PendidikanTerakhirVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context g;
    private RadioButton j = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PendidikanTerakhirAdapter$PendidikanTerakhirVH.class */
    class PendidikanTerakhirVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public PendidikanTerakhirVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PendidikanTerakhirAdapter$PendidikanTerakhirVH_ViewBinding.class */
    public class PendidikanTerakhirVH_ViewBinding implements Unbinder {
        private View a;
        private View c;
        private PendidikanTerakhirVH d;

        public PendidikanTerakhirVH_ViewBinding(final PendidikanTerakhirVH pendidikanTerakhirVH, View view) {
            this.d = pendidikanTerakhirVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            pendidikanTerakhirVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PendidikanTerakhirAdapter.PendidikanTerakhirVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    pendidikanTerakhirVH.onClickItem(view2);
                }
            });
            pendidikanTerakhirVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            pendidikanTerakhirVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            pendidikanTerakhirVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            pendidikanTerakhirVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PendidikanTerakhirAdapter.PendidikanTerakhirVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    pendidikanTerakhirVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            PendidikanTerakhirVH pendidikanTerakhirVH = this.d;
            if (pendidikanTerakhirVH != null) {
                this.d = null;
                pendidikanTerakhirVH.rbItem = null;
                pendidikanTerakhirVH.tvItem = null;
                pendidikanTerakhirVH.tilItem = null;
                pendidikanTerakhirVH.etItem = null;
                pendidikanTerakhirVH.llItem = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PendidikanTerakhirAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ PendidikanTerakhirVH a(ViewGroup viewGroup, int i) {
        return new PendidikanTerakhirVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(PendidikanTerakhirVH pendidikanTerakhirVH, int i) {
        PendidikanTerakhirVH pendidikanTerakhirVH2 = pendidikanTerakhirVH;
        pendidikanTerakhirVH2.tvItem.setText(this.e.get(i).e);
        pendidikanTerakhirVH2.rbItem.setChecked(this.e.get(i).d);
        pendidikanTerakhirVH2.rbItem.setTag(Integer.valueOf(i));
        if (pendidikanTerakhirVH2.rbItem.isChecked()) {
            this.j = pendidikanTerakhirVH2.rbItem;
            this.b = i;
        }
        pendidikanTerakhirVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.PendidikanTerakhirAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (PendidikanTerakhirAdapter.this.j != null) {
                    PendidikanTerakhirAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) PendidikanTerakhirAdapter.this.e.get(PendidikanTerakhirAdapter.this.b)).d = false;
                }
                PendidikanTerakhirAdapter.this.j = radioButton;
                PendidikanTerakhirAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) PendidikanTerakhirAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
