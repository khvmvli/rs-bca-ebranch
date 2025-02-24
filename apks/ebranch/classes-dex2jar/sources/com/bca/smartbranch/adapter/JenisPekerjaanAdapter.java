package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
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
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisPekerjaanAdapter.class */
public final class JenisPekerjaanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<JenisPekerjaanVH> {
    private Context g;
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> j;
    private RadioButton i = null;
    public int e = 0;
    public String b = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisPekerjaanAdapter$JenisPekerjaanVH.class */
    class JenisPekerjaanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297693)
        LinearLayout llItem;
        @BindView(2131298147)
        RadioButton rbItem;
        @BindView(2131299296)
        TextView tvItem;

        public JenisPekerjaanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.class */
    public class JenisPekerjaanVH_ViewBinding implements Unbinder {
        private JenisPekerjaanVH b;
        private View d;
        private View e;

        public JenisPekerjaanVH_ViewBinding(final JenisPekerjaanVH jenisPekerjaanVH, View view) {
            this.b = jenisPekerjaanVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            jenisPekerjaanVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisPekerjaanAdapter.JenisPekerjaanVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisPekerjaanVH.onClickItem(view2);
                }
            });
            jenisPekerjaanVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            jenisPekerjaanVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.d = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.JenisPekerjaanAdapter.JenisPekerjaanVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    jenisPekerjaanVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            JenisPekerjaanVH jenisPekerjaanVH = this.b;
            if (jenisPekerjaanVH != null) {
                this.b = null;
                jenisPekerjaanVH.rbItem = null;
                jenisPekerjaanVH.tvItem = null;
                jenisPekerjaanVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public JenisPekerjaanAdapter(Context context, List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list) {
        this.g = context;
        this.j = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ JenisPekerjaanVH a(ViewGroup viewGroup, int i) {
        return new JenisPekerjaanVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.j.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(JenisPekerjaanVH jenisPekerjaanVH, int i) {
        JenisPekerjaanVH jenisPekerjaanVH2 = jenisPekerjaanVH;
        jenisPekerjaanVH2.tvItem.setText(this.j.get(i).getDescription());
        jenisPekerjaanVH2.rbItem.setChecked(this.j.get(i).isSelected());
        jenisPekerjaanVH2.rbItem.setTag(Integer.valueOf(i));
        if (jenisPekerjaanVH2.rbItem.isChecked()) {
            this.i = jenisPekerjaanVH2.rbItem;
            this.e = i;
        }
        jenisPekerjaanVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.JenisPekerjaanAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (JenisPekerjaanAdapter.this.i != null) {
                    JenisPekerjaanAdapter.this.i.setChecked(false);
                    ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) JenisPekerjaanAdapter.this.j.get(JenisPekerjaanAdapter.this.e)).setSelected(false);
                }
                JenisPekerjaanAdapter.this.i = radioButton;
                JenisPekerjaanAdapter.this.e = intValue;
                ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) JenisPekerjaanAdapter.this.j.get(intValue)).setSelected(radioButton.isChecked());
            }
        });
    }
}
