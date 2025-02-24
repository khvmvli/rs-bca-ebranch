package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.togglePINBaru;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorOTPAdapter.class */
public final class NomorOTPAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<NomorOTPVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context i;
    private RadioButton h = null;
    public int e = -1;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorOTPAdapter$NomorOTPVH.class */
    class NomorOTPVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298147)
        RadioButton rbItem;

        public NomorOTPVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorOTPAdapter$NomorOTPVH_ViewBinding.class */
    public class NomorOTPVH_ViewBinding implements Unbinder {
        private NomorOTPVH e;

        public NomorOTPVH_ViewBinding(NomorOTPVH nomorOTPVH, View view) {
            this.e = nomorOTPVH;
            nomorOTPVH.rbItem = (RadioButton) Utils.findRequiredViewAsType(view, 2131298147, "field 'rbItem'", RadioButton.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            NomorOTPVH nomorOTPVH = this.e;
            if (nomorOTPVH != null) {
                this.e = null;
                nomorOTPVH.rbItem = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public NomorOTPAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ NomorOTPVH a(ViewGroup viewGroup, int i) {
        return new NomorOTPVH(LayoutInflater.from(this.i).inflate(2131493326, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(NomorOTPVH nomorOTPVH, int i) {
        NomorOTPVH nomorOTPVH2 = nomorOTPVH;
        nomorOTPVH2.rbItem.setText(this.b.get(i).e);
        nomorOTPVH2.rbItem.setChecked(this.b.get(i).d);
        nomorOTPVH2.rbItem.setTag(Integer.valueOf(i));
        if (nomorOTPVH2.rbItem.isChecked()) {
            this.h = nomorOTPVH2.rbItem;
            this.e = i;
        }
        nomorOTPVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.NomorOTPAdapter.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (NomorOTPAdapter.this.h != null) {
                    NomorOTPAdapter.this.h.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) NomorOTPAdapter.this.b.get(NomorOTPAdapter.this.e)).d = false;
                }
                NomorOTPAdapter.this.h = radioButton;
                NomorOTPAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) NomorOTPAdapter.this.b.get(intValue)).d = radioButton.isChecked();
                documentProvider.b().d(new togglePINBaru());
            }
        });
    }
}
