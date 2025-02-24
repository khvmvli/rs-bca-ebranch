package o;

import android.database.Cursor;
import android.widget.Filter;
/* loaded from: classes-dex2jar.jar:o/getPopDirection.class */
final class getPopDirection extends Filter {
    read b;

    /* loaded from: classes-dex2jar.jar:o/getPopDirection$read.class */
    interface read {
        Cursor a();

        Cursor a(CharSequence charSequence);

        void a(Cursor cursor);

        CharSequence e(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPopDirection(read read2) {
        this.b = read2;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.b.e((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.b.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.b.a();
        if (filterResults.values != null && filterResults.values != a) {
            this.b.a((Cursor) filterResults.values);
        }
    }
}
