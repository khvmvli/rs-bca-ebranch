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
import java.util.ArrayList;
import java.util.List;
import o.detailBCAFullPayment;
/* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity_ViewBinding.class */
public final class DetailTundaEChannelActivity_ViewBinding extends BaseAdapter implements Filterable {
    private Context a;
    int c;
    String d;
    public ArrayList<detailBCAFullPayment.read> e = new ArrayList<>();
    List<write> b = new ArrayList();
    private Filter f = new IconCompatParcelizer(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity_ViewBinding$IconCompatParcelizer.class */
    final class IconCompatParcelizer extends Filter {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(DetailTundaEChannelActivity_ViewBinding detailTundaEChannelActivity_ViewBinding, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            DetailTundaEChannelActivity_ViewBinding.this.d = charSequence.toString();
            DetailTundaEChannelActivity_ViewBinding.this.b.clear();
            if (DetailTundaEChannelActivity_ViewBinding.this.e != null && !DetailTundaEChannelActivity_ViewBinding.this.e.isEmpty()) {
                for (int i = 0; i < DetailTundaEChannelActivity_ViewBinding.this.e.size(); i++) {
                    detailBCAFullPayment.read read = DetailTundaEChannelActivity_ViewBinding.this.e.get(i);
                    if ((DetailTundaEChannelActivity_ViewBinding.this.c == 0 ? read.e : read.c).toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        write write = new write();
                        write.i = read.h;
                        write.d = read.e;
                        write.c = read.a;
                        write.a = read.c;
                        write.e = read.d;
                        write.b = read.b;
                        DetailTundaEChannelActivity_ViewBinding.this.b.add(write);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = DetailTundaEChannelActivity_ViewBinding.this.b;
            filterResults.count = DetailTundaEChannelActivity_ViewBinding.this.b.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.count > 0) {
                DetailTundaEChannelActivity_ViewBinding.this.notifyDataSetChanged();
            } else {
                DetailTundaEChannelActivity_ViewBinding.this.notifyDataSetInvalidated();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity_ViewBinding$read.class */
    static final class read {
        TextView c;

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity_ViewBinding$write.class */
    public final class write {
        public String a;
        public String b;
        String c;
        public String d;
        public String e;
        String i;

        public write() {
        }
    }

    public DetailTundaEChannelActivity_ViewBinding(Context context, int i) {
        this.a = context;
        this.c = i;
        this.e.clear();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.f;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        read read2;
        LayoutInflater from = LayoutInflater.from(this.a);
        if (view == null) {
            view = from.inflate(2131493297, viewGroup, false);
            read2 = new read((byte) 0);
            read2.c = (TextView) view.findViewById(2131296826);
            view.setTag(read2);
        } else {
            read2 = (read) view.getTag();
        }
        if (this.c == 0) {
            TextView textView = read2.c;
            StringBuilder sb = new StringBuilder();
            String str = this.b.get(i).d;
            StringBuilder sb2 = new StringBuilder("(?i)(");
            sb2.append(this.d);
            sb2.append(")");
            sb.append(str.replaceAll(sb2.toString(), "<b>$1</b>"));
            sb.append("<br/>");
            sb.append(this.b.get(i).a);
            textView.setText(Html.fromHtml(sb.toString()));
        } else {
            TextView textView2 = read2.c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.b.get(i).d);
            sb3.append("<br/>");
            String str2 = this.b.get(i).a;
            StringBuilder sb4 = new StringBuilder("(?i)(");
            sb4.append(this.d);
            sb4.append(")");
            sb3.append(str2.replaceAll(sb4.toString(), "<b>$1</b>"));
            textView2.setText(Html.fromHtml(sb3.toString()));
        }
        return view;
    }
}
