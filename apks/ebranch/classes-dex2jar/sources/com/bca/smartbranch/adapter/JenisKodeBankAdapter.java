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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKodeBankAdapter.class */
public final class JenisKodeBankAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<JenisKodeBankVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context i;
    private RadioButton j = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKodeBankAdapter$JenisKodeBankVH.class */
    class JenisKodeBankVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public JenisKodeBankVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding.class */
    public class JenisKodeBankVH_ViewBinding implements Unbinder {
        private View a;
        private JenisKodeBankVH c;
        private View d;

        public JenisKodeBankVH_ViewBinding(final JenisKodeBankVH jenisKodeBankVH, View view) {
            this.c = jenisKodeBankVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            jenisKodeBankVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisKodeBankAdapter.JenisKodeBankVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisKodeBankVH.onClickItem(view2);
                }
            });
            jenisKodeBankVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            jenisKodeBankVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            jenisKodeBankVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            jenisKodeBankVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.d = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisKodeBankAdapter.JenisKodeBankVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisKodeBankVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            JenisKodeBankVH jenisKodeBankVH = this.c;
            if (jenisKodeBankVH != null) {
                this.c = null;
                jenisKodeBankVH.rbItem = null;
                jenisKodeBankVH.tvItem = null;
                jenisKodeBankVH.tilItem = null;
                jenisKodeBankVH.etItem = null;
                jenisKodeBankVH.llItem = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public JenisKodeBankAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ JenisKodeBankVH a(ViewGroup viewGroup, int i) {
        return new JenisKodeBankVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(JenisKodeBankVH jenisKodeBankVH, int i) {
        JenisKodeBankVH jenisKodeBankVH2 = jenisKodeBankVH;
        jenisKodeBankVH2.tvItem.setText(this.b.get(i).e);
        jenisKodeBankVH2.rbItem.setChecked(this.b.get(i).d);
        jenisKodeBankVH2.rbItem.setTag(Integer.valueOf(i));
        if (jenisKodeBankVH2.rbItem.isChecked()) {
            this.j = jenisKodeBankVH2.rbItem;
            this.e = i;
        }
        jenisKodeBankVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.JenisKodeBankAdapter.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (JenisKodeBankAdapter.this.j != null) {
                    JenisKodeBankAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) JenisKodeBankAdapter.this.b.get(JenisKodeBankAdapter.this.e)).d = false;
                }
                JenisKodeBankAdapter.this.j = radioButton;
                JenisKodeBankAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) JenisKodeBankAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
