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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisIdAdapter.class */
public final class JenisIdAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<JenisIdVH> {
    private RadioButton b;
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private int f;
    private Context h;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisIdAdapter$JenisIdVH.class */
    class JenisIdVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public JenisIdVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisIdAdapter$JenisIdVH_ViewBinding.class */
    public class JenisIdVH_ViewBinding implements Unbinder {
        private JenisIdVH b;
        private View c;
        private View e;

        public JenisIdVH_ViewBinding(final JenisIdVH jenisIdVH, View view) {
            this.b = jenisIdVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            jenisIdVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisIdAdapter.JenisIdVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisIdVH.onClickItem(view2);
                }
            });
            jenisIdVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            jenisIdVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            jenisIdVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            jenisIdVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisIdAdapter.JenisIdVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisIdVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            JenisIdVH jenisIdVH = this.b;
            if (jenisIdVH != null) {
                this.b = null;
                jenisIdVH.rbItem = null;
                jenisIdVH.tvItem = null;
                jenisIdVH.tilItem = null;
                jenisIdVH.etItem = null;
                jenisIdVH.llItem = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ JenisIdVH a(ViewGroup viewGroup, int i) {
        return new JenisIdVH(LayoutInflater.from(this.h).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(JenisIdVH jenisIdVH, int i) {
        JenisIdVH jenisIdVH2 = jenisIdVH;
        jenisIdVH2.tvItem.setText(this.e.get(i).e);
        jenisIdVH2.rbItem.setChecked(this.e.get(i).d);
        jenisIdVH2.rbItem.setTag(Integer.valueOf(i));
        if (jenisIdVH2.rbItem.isChecked()) {
            this.b = jenisIdVH2.rbItem;
            this.f = i;
        }
        jenisIdVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.JenisIdAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (JenisIdAdapter.this.b != null) {
                    JenisIdAdapter.this.b.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) JenisIdAdapter.this.e.get(JenisIdAdapter.this.f)).d = false;
                }
                JenisIdAdapter.this.b = radioButton;
                JenisIdAdapter.this.f = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) JenisIdAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
