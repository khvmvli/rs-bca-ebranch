package o;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity.class */
public final class DetailTundaCCActivity extends BaseAdapter implements Filterable {
    int a;
    public String b;
    List<DaftarTransferResponse.DaftarTransferOutput> c;
    String e;
    private Context j;
    public List<DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver> d = new ArrayList();
    private Filter g = new write(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer {
        TextView e;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity$write.class */
    final class write extends Filter {
        private write() {
        }

        /* synthetic */ write(DetailTundaCCActivity detailTundaCCActivity, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            DetailTundaCCActivity.this.e = charSequence.toString();
            DetailTundaCCActivity.this.d.clear();
            if (DetailTundaCCActivity.this.c != null) {
                for (int i = 0; i < DetailTundaCCActivity.this.c.size(); i++) {
                    String accountName = DetailTundaCCActivity.this.a == 0 ? DetailTundaCCActivity.this.c.get(i).getAccountName() : DetailTundaCCActivity.this.c.get(i).getAccountNumber();
                    if (DetailTundaCCActivity.this.c.get(i).getBankCode().equals(DetailTundaCCActivity.this.b) && accountName.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver = new DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.d = DetailTundaCCActivity.this.c.get(i).getAccountName();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.b = DetailTundaCCActivity.this.c.get(i).getAccountNumber();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.i = DetailTundaCCActivity.this.c.get(i).getReceiverAddress();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.j = DetailTundaCCActivity.this.c.get(i).getReceiverCity();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.f = DetailTundaCCActivity.this.c.get(i).getCustomerType();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.g = DetailTundaCCActivity.this.c.get(i).getResidency();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.h = DetailTundaCCActivity.this.c.get(i).getCitizenship();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.a = DetailTundaCCActivity.this.c.get(i).getBankName();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.c = DetailTundaCCActivity.this.c.get(i).getBankCode();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.e = DetailTundaCCActivity.this.c.get(i).getBankOfficeCode();
                        detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver.l = DetailTundaCCActivity.this.c.get(i).getToken();
                        DetailTundaCCActivity.this.d.add(detailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = DetailTundaCCActivity.this.d;
            filterResults.count = DetailTundaCCActivity.this.d.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.count > 0) {
                DetailTundaCCActivity.this.notifyDataSetChanged();
            } else {
                DetailTundaCCActivity.this.notifyDataSetInvalidated();
            }
        }
    }

    public DetailTundaCCActivity(Context context, List<DaftarTransferResponse.DaftarTransferOutput> list, int i) {
        this.j = context;
        this.c = list;
        this.a = i;
    }

    public final DetailTundaCCActivity$MediaBrowserCompat$CustomActionResultReceiver d(int i) {
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.g;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        LayoutInflater from = LayoutInflater.from(this.j);
        if (view == null) {
            view = from.inflate(2131493297, viewGroup, false);
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer((byte) 0);
            remoteActionCompatParcelizer.e = (TextView) view.findViewById(2131296826);
            view.setTag(remoteActionCompatParcelizer);
        } else {
            remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getTag();
        }
        if (this.a == 0) {
            TextView textView = remoteActionCompatParcelizer.e;
            StringBuilder sb = new StringBuilder();
            String str = this.d.get(i).d;
            StringBuilder sb2 = new StringBuilder("(?i)(");
            sb2.append(this.e);
            sb2.append(")");
            sb.append(str.replaceAll(sb2.toString(), "<b>$1</b>"));
            sb.append("<br/>");
            sb.append(this.d.get(i).b);
            sb.append("<br/>");
            sb.append(this.d.get(i).a);
            textView.setText(Html.fromHtml(sb.toString()));
        } else {
            TextView textView2 = remoteActionCompatParcelizer.e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.d.get(i).d);
            sb3.append("<br/>");
            String str2 = this.d.get(i).b;
            StringBuilder sb4 = new StringBuilder("(?i)(");
            sb4.append(this.e);
            sb4.append(")");
            sb3.append(str2.replaceAll(sb4.toString(), "<b>$1</b>"));
            sb3.append("<br/>");
            sb3.append(this.d.get(i).a);
            textView2.setText(Html.fromHtml(sb3.toString()));
        }
        return view;
    }
}
