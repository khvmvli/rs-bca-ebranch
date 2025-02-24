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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKartuAdapter.class */
public final class JenisKartuAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<JenisKartuVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context i;
    private RadioButton g = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKartuAdapter$JenisKartuVH.class */
    class JenisKartuVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public JenisKartuVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKartuAdapter$JenisKartuVH_ViewBinding.class */
    public class JenisKartuVH_ViewBinding implements Unbinder {
        private View b;
        private JenisKartuVH c;
        private View d;

        public JenisKartuVH_ViewBinding(final JenisKartuVH jenisKartuVH, View view) {
            this.c = jenisKartuVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            jenisKartuVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisKartuAdapter.JenisKartuVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisKartuVH.onClickItem(view2);
                }
            });
            jenisKartuVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            jenisKartuVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            jenisKartuVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            jenisKartuVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.d = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisKartuAdapter.JenisKartuVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisKartuVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            JenisKartuVH jenisKartuVH = this.c;
            if (jenisKartuVH != null) {
                this.c = null;
                jenisKartuVH.rbItem = null;
                jenisKartuVH.tvItem = null;
                jenisKartuVH.tilItem = null;
                jenisKartuVH.etItem = null;
                jenisKartuVH.llItem = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public JenisKartuAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ JenisKartuVH a(ViewGroup viewGroup, int i) {
        return new JenisKartuVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(JenisKartuVH jenisKartuVH, int i) {
        JenisKartuVH jenisKartuVH2 = jenisKartuVH;
        jenisKartuVH2.tvItem.setText(this.e.get(i).e);
        jenisKartuVH2.rbItem.setChecked(this.e.get(i).d);
        jenisKartuVH2.rbItem.setTag(Integer.valueOf(i));
        if (jenisKartuVH2.rbItem.isChecked()) {
            this.g = jenisKartuVH2.rbItem;
            this.b = i;
        }
        jenisKartuVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.JenisKartuAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (JenisKartuAdapter.this.g != null) {
                    JenisKartuAdapter.this.g.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) JenisKartuAdapter.this.e.get(JenisKartuAdapter.this.b)).d = false;
                }
                JenisKartuAdapter.this.g = radioButton;
                JenisKartuAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) JenisKartuAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
