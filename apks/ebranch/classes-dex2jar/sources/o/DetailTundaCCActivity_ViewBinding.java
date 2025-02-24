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
/* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity_ViewBinding.class */
public final class DetailTundaCCActivity_ViewBinding extends BaseAdapter implements Filterable {
    String a;
    private Context b;
    int c;
    List<DaftarTransferResponse.DaftarTransferOutput> d;
    public List<read> e = new ArrayList();
    private Filter g = new write(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity_ViewBinding$read.class */
    public final class read {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        String j;
        public String k;

        /* renamed from: o  reason: collision with root package name */
        public String f84o;

        public read() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaCCActivity_ViewBinding$write.class */
    final class write extends Filter {
        private write() {
        }

        /* synthetic */ write(DetailTundaCCActivity_ViewBinding detailTundaCCActivity_ViewBinding, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            DetailTundaCCActivity_ViewBinding.this.a = charSequence.toString();
            DetailTundaCCActivity_ViewBinding.this.e.clear();
            if (DetailTundaCCActivity_ViewBinding.this.d != null) {
                for (int i = 0; i < DetailTundaCCActivity_ViewBinding.this.d.size(); i++) {
                    if ((DetailTundaCCActivity_ViewBinding.this.c == 0 ? DetailTundaCCActivity_ViewBinding.this.d.get(i).getAccountName() : DetailTundaCCActivity_ViewBinding.this.d.get(i).getAccountNumber()).toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        read read = new read();
                        read.d = DetailTundaCCActivity_ViewBinding.this.d.get(i).getAccountName();
                        read.b = DetailTundaCCActivity_ViewBinding.this.d.get(i).getAccountNumber();
                        read.f = DetailTundaCCActivity_ViewBinding.this.d.get(i).getReceiverAddress();
                        read.i = DetailTundaCCActivity_ViewBinding.this.d.get(i).getReceiverCity();
                        read.g = DetailTundaCCActivity_ViewBinding.this.d.get(i).getCustomerType();
                        read.j = DetailTundaCCActivity_ViewBinding.this.d.get(i).getIbanFlag();
                        read.f84o = DetailTundaCCActivity_ViewBinding.this.d.get(i).getToken();
                        read.h = DetailTundaCCActivity_ViewBinding.this.d.get(i).getReceiverCountry();
                        read.k = DetailTundaCCActivity_ViewBinding.this.d.get(i).getReceiverCountryName();
                        read.c = DetailTundaCCActivity_ViewBinding.this.d.get(i).getBankCode();
                        read.e = DetailTundaCCActivity_ViewBinding.this.d.get(i).getBankName();
                        DetailTundaCCActivity_ViewBinding.this.e.add(read);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = DetailTundaCCActivity_ViewBinding.this.e;
            filterResults.count = DetailTundaCCActivity_ViewBinding.this.e.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.count > 0) {
                DetailTundaCCActivity_ViewBinding.this.notifyDataSetChanged();
            } else {
                DetailTundaCCActivity_ViewBinding.this.notifyDataSetInvalidated();
            }
        }
    }

    public DetailTundaCCActivity_ViewBinding(Context context, List<DaftarTransferResponse.DaftarTransferOutput> list, int i) {
        this.b = context;
        this.d = list;
        this.c = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.g;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DetailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver;
        LayoutInflater from = LayoutInflater.from(this.b);
        if (view == null) {
            view = from.inflate(2131493297, viewGroup, false);
            detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new DetailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
            detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d = (TextView) view.findViewById(2131296826);
            view.setTag(detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = (DetailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) view.getTag();
        }
        if (this.c == 0) {
            TextView textView = detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d;
            StringBuilder sb = new StringBuilder();
            String str = this.e.get(i).d;
            StringBuilder sb2 = new StringBuilder("(?i)(");
            sb2.append(this.a);
            sb2.append(")");
            sb.append(str.replaceAll(sb2.toString(), "<b>$1</b>"));
            sb.append("<br/>");
            sb.append(this.e.get(i).b);
            textView.setText(Html.fromHtml(sb.toString()));
        } else {
            TextView textView2 = detailTundaCCActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.e.get(i).d);
            sb3.append("<br/>");
            String str2 = this.e.get(i).b;
            StringBuilder sb4 = new StringBuilder("(?i)(");
            sb4.append(this.a);
            sb4.append(")");
            sb3.append(str2.replaceAll(sb4.toString(), "<b>$1</b>"));
            textView2.setText(Html.fromHtml(sb3.toString()));
        }
        return view;
    }
}
