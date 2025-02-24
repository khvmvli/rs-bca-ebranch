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
import o.ivfotoProfil;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorRekeningBNAdapter.class */
public final class NomorRekeningBNAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<NomorRekeningBNVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context g;
    private RadioButton i = null;
    public int e = -1;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorRekeningBNAdapter$NomorRekeningBNVH.class */
    class NomorRekeningBNVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298147)
        RadioButton rbItem;

        public NomorRekeningBNVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/NomorRekeningBNAdapter$NomorRekeningBNVH_ViewBinding.class */
    public class NomorRekeningBNVH_ViewBinding implements Unbinder {
        private NomorRekeningBNVH b;

        public NomorRekeningBNVH_ViewBinding(NomorRekeningBNVH nomorRekeningBNVH, View view) {
            this.b = nomorRekeningBNVH;
            nomorRekeningBNVH.rbItem = (RadioButton) Utils.findRequiredViewAsType(view, 2131298147, "field 'rbItem'", RadioButton.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            NomorRekeningBNVH nomorRekeningBNVH = this.b;
            if (nomorRekeningBNVH != null) {
                this.b = null;
                nomorRekeningBNVH.rbItem = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public NomorRekeningBNAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ NomorRekeningBNVH a(ViewGroup viewGroup, int i) {
        return new NomorRekeningBNVH(LayoutInflater.from(this.g).inflate(2131493326, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(NomorRekeningBNVH nomorRekeningBNVH, int i) {
        NomorRekeningBNVH nomorRekeningBNVH2 = nomorRekeningBNVH;
        nomorRekeningBNVH2.rbItem.setText(this.b.get(i).e);
        nomorRekeningBNVH2.rbItem.setChecked(this.b.get(i).d);
        nomorRekeningBNVH2.rbItem.setTag(Integer.valueOf(i));
        if (nomorRekeningBNVH2.rbItem.isChecked()) {
            this.i = nomorRekeningBNVH2.rbItem;
            this.e = i;
        }
        nomorRekeningBNVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.NomorRekeningBNAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (NomorRekeningBNAdapter.this.i != null) {
                    NomorRekeningBNAdapter.this.i.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) NomorRekeningBNAdapter.this.b.get(NomorRekeningBNAdapter.this.e)).d = false;
                }
                NomorRekeningBNAdapter.this.i = radioButton;
                NomorRekeningBNAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) NomorRekeningBNAdapter.this.b.get(intValue)).d = radioButton.isChecked();
                documentProvider.b().d(new ivfotoProfil());
            }
        });
    }
}
