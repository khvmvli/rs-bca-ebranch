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
import com.bca.smartbranch.data.global.DaftarTransfer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity.class */
public final class DetailTundaEChannelActivity extends BaseAdapter implements Filterable {
    private Context a;
    List<DaftarTransfer> b;
    int c;
    String e;
    public List<IconCompatParcelizer> d = new ArrayList();
    private Filter g = new read(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity$IconCompatParcelizer.class */
    public final class IconCompatParcelizer {
        String a;
        public String b;
        public String d;

        public IconCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity$read.class */
    final class read extends Filter {
        private read() {
        }

        /* synthetic */ read(DetailTundaEChannelActivity detailTundaEChannelActivity, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            String str;
            DetailTundaEChannelActivity.this.e = charSequence.toString();
            DetailTundaEChannelActivity.this.d.clear();
            if (DetailTundaEChannelActivity.this.b != null) {
                for (int i = 0; i < DetailTundaEChannelActivity.this.b.size(); i++) {
                    if (DetailTundaEChannelActivity.this.c == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(DetailTundaEChannelActivity.this.b.get(i).getAccountName());
                        sb.append(" (");
                        sb.append(DetailTundaEChannelActivity.this.b.get(i).getAliasName());
                        sb.append(")");
                        str = sb.toString();
                    } else {
                        str = DetailTundaEChannelActivity.this.b.get(i).getAccountNumber();
                    }
                    if (str.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
                        iconCompatParcelizer.d = DetailTundaEChannelActivity.this.b.get(i).getAccountName();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(DetailTundaEChannelActivity.this.b.get(i).getAccountName());
                        sb2.append(" (");
                        sb2.append(DetailTundaEChannelActivity.this.b.get(i).getAliasName());
                        sb2.append(")");
                        iconCompatParcelizer.a = sb2.toString();
                        iconCompatParcelizer.b = DetailTundaEChannelActivity.this.b.get(i).getAccountNumber();
                        DetailTundaEChannelActivity.this.d.add(iconCompatParcelizer);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = DetailTundaEChannelActivity.this.d;
            filterResults.count = DetailTundaEChannelActivity.this.d.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.count > 0) {
                DetailTundaEChannelActivity.this.notifyDataSetChanged();
            } else {
                DetailTundaEChannelActivity.this.notifyDataSetInvalidated();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelActivity$write.class */
    static final class write {
        TextView d;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }
    }

    public DetailTundaEChannelActivity(Context context, List<DaftarTransfer> list, int i) {
        this.a = context;
        this.b = list;
        this.c = i;
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
        write write2;
        LayoutInflater from = LayoutInflater.from(this.a);
        if (view == null) {
            view = from.inflate(2131493297, viewGroup, false);
            write2 = new write((byte) 0);
            write2.d = (TextView) view.findViewById(2131296826);
            view.setTag(write2);
        } else {
            write2 = (write) view.getTag();
        }
        if (this.c == 0) {
            TextView textView = write2.d;
            StringBuilder sb = new StringBuilder();
            String str = this.d.get(i).a;
            StringBuilder sb2 = new StringBuilder("(?i)(");
            sb2.append(this.e);
            sb2.append(")");
            sb.append(str.replaceAll(sb2.toString(), "<b>$1</b>"));
            sb.append("<br/>");
            sb.append(this.d.get(i).b);
            textView.setText(Html.fromHtml(sb.toString()));
        } else {
            TextView textView2 = write2.d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.d.get(i).a);
            sb3.append("<br/>");
            String str2 = this.d.get(i).b;
            StringBuilder sb4 = new StringBuilder("(?i)(");
            sb4.append(this.e);
            sb4.append(")");
            sb3.append(str2.replaceAll(sb4.toString(), "<b>$1</b>"));
            textView2.setText(Html.fromHtml(sb3.toString()));
        }
        return view;
    }
}
