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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/WarkatListAdapter.class */
public final class WarkatListAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<JenisWarkat> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context g;
    private RadioButton j = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/WarkatListAdapter$JenisWarkat.class */
    class JenisWarkat extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public JenisWarkat(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/WarkatListAdapter$JenisWarkat_ViewBinding.class */
    public class JenisWarkat_ViewBinding implements Unbinder {
        private View a;
        private JenisWarkat b;
        private View e;

        public JenisWarkat_ViewBinding(final JenisWarkat jenisWarkat, View view) {
            this.b = jenisWarkat;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            jenisWarkat.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.WarkatListAdapter.JenisWarkat_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisWarkat.onClickItem(view2);
                }
            });
            jenisWarkat.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            jenisWarkat.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            jenisWarkat.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            jenisWarkat.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.WarkatListAdapter.JenisWarkat_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisWarkat.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            JenisWarkat jenisWarkat = this.b;
            if (jenisWarkat != null) {
                this.b = null;
                jenisWarkat.rbItem = null;
                jenisWarkat.tvItem = null;
                jenisWarkat.tilItem = null;
                jenisWarkat.etItem = null;
                jenisWarkat.llItem = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public WarkatListAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ JenisWarkat a(ViewGroup viewGroup, int i) {
        return new JenisWarkat(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(JenisWarkat jenisWarkat, int i) {
        JenisWarkat jenisWarkat2 = jenisWarkat;
        jenisWarkat2.tvItem.setText(this.b.get(i).e);
        jenisWarkat2.rbItem.setChecked(this.b.get(i).d);
        jenisWarkat2.rbItem.setTag(Integer.valueOf(i));
        if (jenisWarkat2.rbItem.isChecked()) {
            this.j = jenisWarkat2.rbItem;
            this.e = i;
        }
        jenisWarkat2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.WarkatListAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (WarkatListAdapter.this.j != null) {
                    WarkatListAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) WarkatListAdapter.this.b.get(WarkatListAdapter.this.e)).d = false;
                }
                WarkatListAdapter.this.j = radioButton;
                WarkatListAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) WarkatListAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
