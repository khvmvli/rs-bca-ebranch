package com.bca.smartbranch.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import o.ConfirmSubVisaAdapter$ViewHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver extends ArrayAdapter<ConfirmSubVisaAdapter$ViewHolder> {
    final /* synthetic */ BN2PembelianFragment c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver(BN2PembelianFragment bN2PembelianFragment, Context context, List<ConfirmSubVisaAdapter$ViewHolder> list) {
        super(context, 0, list);
        this.c = bN2PembelianFragment;
    }

    @Override // android.widget.ArrayAdapter, android.widget.SpinnerAdapter, android.widget.BaseAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        ConfirmSubVisaAdapter$ViewHolder item = getItem(i);
        View inflate = i == 0 ? LayoutInflater.from(getContext()).inflate(2131493347, viewGroup, false) : LayoutInflater.from(getContext()).inflate(2131493345, viewGroup, false);
        ((TextView) inflate.findViewById(2131299732)).setText(item.f.split("\\(")[0]);
        ((TextView) inflate.findViewById(2131299400)).setText(item.b);
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ConfirmSubVisaAdapter$ViewHolder item = getItem(i);
        View inflate = LayoutInflater.from(getContext()).inflate(2131493348, viewGroup, false);
        ((TextView) inflate.findViewById(2131299732)).setText(item.f.split("\\(")[0]);
        ((TextView) inflate.findViewById(2131299400)).setText(item.b);
        this.c.tvMataUang.setText(item.b);
        return inflate;
    }
}
