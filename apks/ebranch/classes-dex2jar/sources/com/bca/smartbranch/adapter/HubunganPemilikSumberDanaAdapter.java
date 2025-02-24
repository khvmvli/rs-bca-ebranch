package com.bca.smartbranch.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.LogoutDialog_ViewBinding;
import o.PilihNegaraBagianActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HubunganPemilikSumberDanaAdapter.class */
public final class HubunganPemilikSumberDanaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<HubunganPemilikSumberDanaVH> {
    public List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context h;
    private RadioButton i = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH.class */
    class HubunganPemilikSumberDanaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296991)
        EditText etItem;
        @BindString(2131821778)
        String labelKaryawan;
        @BindView(2131297693)
        LinearLayout llItem;
        @BindView(2131298147)
        RadioButton rbItem;
        @BindString(2131822123)
        String sopirArtDsb;
        @BindView(2131298540)
        LogoutDialog_ViewBinding tilItem;
        @BindView(2131299296)
        TextView tvItem;

        public HubunganPemilikSumberDanaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HubunganPemilikSumberDanaAdapter$HubunganPemilikSumberDanaVH_ViewBinding.class */
    public class HubunganPemilikSumberDanaVH_ViewBinding implements Unbinder {
        private HubunganPemilikSumberDanaVH b;
        private View c;
        private View d;

        public HubunganPemilikSumberDanaVH_ViewBinding(final HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaVH, View view) {
            this.b = hubunganPemilikSumberDanaVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            hubunganPemilikSumberDanaVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.HubunganPemilikSumberDanaAdapter.HubunganPemilikSumberDanaVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    hubunganPemilikSumberDanaVH.onClickItem(view2);
                }
            });
            hubunganPemilikSumberDanaVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            hubunganPemilikSumberDanaVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            hubunganPemilikSumberDanaVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            hubunganPemilikSumberDanaVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.HubunganPemilikSumberDanaAdapter.HubunganPemilikSumberDanaVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    hubunganPemilikSumberDanaVH.onClickItem(view2);
                }
            });
            Resources resources = view.getContext().getResources();
            hubunganPemilikSumberDanaVH.labelKaryawan = resources.getString(2131821778);
            hubunganPemilikSumberDanaVH.sopirArtDsb = resources.getString(2131822123);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaVH = this.b;
            if (hubunganPemilikSumberDanaVH != null) {
                this.b = null;
                hubunganPemilikSumberDanaVH.rbItem = null;
                hubunganPemilikSumberDanaVH.tvItem = null;
                hubunganPemilikSumberDanaVH.tilItem = null;
                hubunganPemilikSumberDanaVH.etItem = null;
                hubunganPemilikSumberDanaVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HubunganPemilikSumberDanaAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.h = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ HubunganPemilikSumberDanaVH a(ViewGroup viewGroup, int i) {
        return new HubunganPemilikSumberDanaVH(LayoutInflater.from(this.h).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaVH, int i) {
        HubunganPemilikSumberDanaVH hubunganPemilikSumberDanaVH2 = hubunganPemilikSumberDanaVH;
        if (this.b.get(i).e.equalsIgnoreCase(hubunganPemilikSumberDanaVH2.labelKaryawan)) {
            TextView textView = hubunganPemilikSumberDanaVH2.tvItem;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.get(i).e);
            sb.append(" ");
            sb.append(hubunganPemilikSumberDanaVH2.sopirArtDsb);
            textView.setText(sb.toString());
        } else {
            hubunganPemilikSumberDanaVH2.tvItem.setText(this.b.get(i).e);
        }
        hubunganPemilikSumberDanaVH2.rbItem.setChecked(this.b.get(i).d);
        hubunganPemilikSumberDanaVH2.rbItem.setTag(Integer.valueOf(i));
        if (hubunganPemilikSumberDanaVH2.rbItem.isChecked()) {
            this.i = hubunganPemilikSumberDanaVH2.rbItem;
            this.e = i;
        }
        hubunganPemilikSumberDanaVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.HubunganPemilikSumberDanaAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (HubunganPemilikSumberDanaAdapter.this.i != null) {
                    HubunganPemilikSumberDanaAdapter.this.i.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) HubunganPemilikSumberDanaAdapter.this.b.get(HubunganPemilikSumberDanaAdapter.this.e)).d = false;
                }
                HubunganPemilikSumberDanaAdapter.this.i = radioButton;
                HubunganPemilikSumberDanaAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) HubunganPemilikSumberDanaAdapter.this.b.get(intValue)).d = radioButton.isChecked();
                documentProvider.b().d(new PilihNegaraBagianActivity_ViewBinding(((DaftarTransferAdapter$DaftarTransferVH) HubunganPemilikSumberDanaAdapter.this.b.get(intValue)).e));
            }
        });
    }
}
