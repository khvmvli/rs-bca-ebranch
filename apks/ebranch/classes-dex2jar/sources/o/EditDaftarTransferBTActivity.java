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
/* loaded from: classes-dex2jar.jar:o/EditDaftarTransferBTActivity.class */
public final class EditDaftarTransferBTActivity extends BaseAdapter implements Filterable {
    List<String> a;
    String b;
    private Context c;
    List<String> d = new ArrayList();
    private Filter e = new IconCompatParcelizer(this, (byte) 0);

    /* loaded from: classes-dex2jar.jar:o/EditDaftarTransferBTActivity$IconCompatParcelizer.class */
    final class IconCompatParcelizer extends Filter {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(EditDaftarTransferBTActivity editDaftarTransferBTActivity, byte b) {
            this();
        }

        @Override // android.widget.Filter
        protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
            EditDaftarTransferBTActivity.this.b = charSequence.toString();
            EditDaftarTransferBTActivity.this.d.clear();
            if (EditDaftarTransferBTActivity.this.a != null) {
                for (int i = 0; i < EditDaftarTransferBTActivity.this.a.size(); i++) {
                    if (EditDaftarTransferBTActivity.this.a.get(i).toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        EditDaftarTransferBTActivity.this.d.add(EditDaftarTransferBTActivity.this.a.get(i));
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = EditDaftarTransferBTActivity.this.d;
            filterResults.count = EditDaftarTransferBTActivity.this.d.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.count > 0) {
                EditDaftarTransferBTActivity.this.notifyDataSetChanged();
            } else {
                EditDaftarTransferBTActivity.this.notifyDataSetInvalidated();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/EditDaftarTransferBTActivity$write.class */
    static final class write {
        TextView c;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }
    }

    public EditDaftarTransferBTActivity(Context context, List<String> list) {
        this.c = context;
        this.a = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.e;
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
        LayoutInflater from = LayoutInflater.from(this.c);
        if (view == null) {
            view = from.inflate(17367049, viewGroup, false);
            write2 = new write((byte) 0);
            write2.c = (TextView) view.findViewById(16908308);
            view.setTag(write2);
        } else {
            write2 = (write) view.getTag();
        }
        TextView textView = write2.c;
        String str = this.d.get(i);
        StringBuilder sb = new StringBuilder("(?i)(");
        sb.append(this.b);
        sb.append(")");
        textView.setText(Html.fromHtml(str.replaceAll(sb.toString(), "<b>$1</b>")));
        return view;
    }
}
