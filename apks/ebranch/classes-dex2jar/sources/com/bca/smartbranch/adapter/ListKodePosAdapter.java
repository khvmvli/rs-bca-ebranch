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
import o.PilihKodePosActivity;
import o.documentProvider;
import o.onChooseKodePosHome;
import o.onChooseKodePosKantor;
import o.onChooseKodePosRes;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKodePosAdapter.class */
public final class ListKodePosAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListKodePosAdapterVH> {
    public List<String> b;
    private Context e;
    private String g;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKodePosAdapter$ListKodePosAdapterVH.class */
    class ListKodePosAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListKodePosAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            if (ListKodePosAdapter.this.g.equals("HOME")) {
                documentProvider.b().d(new PilihKodePosActivity((String) ListKodePosAdapter.this.b.get(d())));
            } else if (ListKodePosAdapter.this.g.equals("RES")) {
                documentProvider.b().d(new onChooseKodePosKantor((String) ListKodePosAdapter.this.b.get(d())));
            } else if (ListKodePosAdapter.this.g.equals("KANTOR")) {
                documentProvider.b().d(new onChooseKodePosRes((String) ListKodePosAdapter.this.b.get(d())));
            } else {
                documentProvider.b().d(new onChooseKodePosHome((String) ListKodePosAdapter.this.b.get(d())));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKodePosAdapter$ListKodePosAdapterVH_ViewBinding.class */
    public class ListKodePosAdapterVH_ViewBinding implements Unbinder {
        private ListKodePosAdapterVH c;
        private View d;

        public ListKodePosAdapterVH_ViewBinding(final ListKodePosAdapterVH listKodePosAdapterVH, View view) {
            this.c = listKodePosAdapterVH;
            listKodePosAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListKodePosAdapter.ListKodePosAdapterVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listKodePosAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListKodePosAdapterVH listKodePosAdapterVH = this.c;
            if (listKodePosAdapterVH != null) {
                this.c = null;
                listKodePosAdapterVH.tvContent = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListKodePosAdapter(Context context, List<String> list, String str) {
        this.e = context;
        this.b = list;
        this.g = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListKodePosAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListKodePosAdapterVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListKodePosAdapterVH listKodePosAdapterVH, int i) {
        listKodePosAdapterVH.tvContent.setText(this.b.get(i));
    }
}
