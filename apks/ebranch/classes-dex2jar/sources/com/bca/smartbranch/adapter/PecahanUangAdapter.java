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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PecahanUangAdapter.class */
public final class PecahanUangAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<PecahanUangVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private RadioButton e;
    private Context g;
    private int j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PecahanUangAdapter$PecahanUangVH.class */
    class PecahanUangVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public PecahanUangVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PecahanUangAdapter$PecahanUangVH_ViewBinding.class */
    public class PecahanUangVH_ViewBinding implements Unbinder {
        private View a;
        private PecahanUangVH b;
        private View d;

        public PecahanUangVH_ViewBinding(final PecahanUangVH pecahanUangVH, View view) {
            this.b = pecahanUangVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            pecahanUangVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PecahanUangAdapter.PecahanUangVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    pecahanUangVH.onClickItem(view2);
                }
            });
            pecahanUangVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            pecahanUangVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            pecahanUangVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            pecahanUangVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PecahanUangAdapter.PecahanUangVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    pecahanUangVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            PecahanUangVH pecahanUangVH = this.b;
            if (pecahanUangVH != null) {
                this.b = null;
                pecahanUangVH.rbItem = null;
                pecahanUangVH.tvItem = null;
                pecahanUangVH.tilItem = null;
                pecahanUangVH.etItem = null;
                pecahanUangVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ PecahanUangVH a(ViewGroup viewGroup, int i) {
        return new PecahanUangVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(PecahanUangVH pecahanUangVH, int i) {
        PecahanUangVH pecahanUangVH2 = pecahanUangVH;
        pecahanUangVH2.tvItem.setText(this.b.get(i).e);
        pecahanUangVH2.rbItem.setChecked(this.b.get(i).d);
        pecahanUangVH2.rbItem.setTag(Integer.valueOf(i));
        if (pecahanUangVH2.rbItem.isChecked()) {
            this.e = pecahanUangVH2.rbItem;
            this.j = i;
        }
        pecahanUangVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.PecahanUangAdapter.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (PecahanUangAdapter.this.e != null) {
                    PecahanUangAdapter.this.e.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) PecahanUangAdapter.this.b.get(PecahanUangAdapter.this.j)).d = false;
                }
                PecahanUangAdapter.this.e = radioButton;
                PecahanUangAdapter.this.j = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) PecahanUangAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
