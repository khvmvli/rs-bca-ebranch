package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import o.OpenCCSuccessActivity_ViewBinding;
import o.PilihNegaraBagianActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraPemrekAdapter.class */
public final class ListNegaraPemrekAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListNegaraAdapterVH> {
    private Context b;
    public List<OpenCCSuccessActivity_ViewBinding.read> e;
    private String j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraPemrekAdapter$ListNegaraAdapterVH.class */
    class ListNegaraAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListNegaraAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new PilihNegaraBagianActivity(((OpenCCSuccessActivity_ViewBinding.read) ListNegaraPemrekAdapter.this.e.get(c())).b, ((OpenCCSuccessActivity_ViewBinding.read) ListNegaraPemrekAdapter.this.e.get(d())).c, ListNegaraPemrekAdapter.this.j));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding.class */
    public class ListNegaraAdapterVH_ViewBinding implements Unbinder {
        private ListNegaraAdapterVH a;
        private View c;

        public ListNegaraAdapterVH_ViewBinding(final ListNegaraAdapterVH listNegaraAdapterVH, View view) {
            this.a = listNegaraAdapterVH;
            listNegaraAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListNegaraPemrekAdapter.ListNegaraAdapterVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listNegaraAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListNegaraAdapterVH listNegaraAdapterVH = this.a;
            if (listNegaraAdapterVH != null) {
                this.a = null;
                listNegaraAdapterVH.tvContent = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListNegaraPemrekAdapter(Context context, List<OpenCCSuccessActivity_ViewBinding.read> list, String str) {
        this.b = context;
        this.e = list;
        this.j = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListNegaraAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListNegaraAdapterVH(LayoutInflater.from(this.b).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListNegaraAdapterVH listNegaraAdapterVH, int i) {
        listNegaraAdapterVH.tvContent.setText(this.e.get(i).b);
    }
}
