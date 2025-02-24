package o;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import o.getPopDirection;
/* loaded from: classes-dex2jar.jar:o/getPopExitAnim.class */
public abstract class getPopExitAnim extends BaseAdapter implements Filterable, getPopDirection.read {
    protected RemoteActionCompatParcelizer a;
    protected Context b;
    protected Cursor c;
    protected boolean d;
    protected boolean f;
    protected DataSetObserver g;
    protected int h;
    protected FilterQueryProvider i;
    protected getPopDirection j;

    /* loaded from: classes-dex2jar.jar:o/getPopExitAnim$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer() {
            super(new Handler());
            getPopExitAnim.this = r5;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            getPopExitAnim.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getPopExitAnim$write.class */
    public final class write extends DataSetObserver {
        write() {
            getPopExitAnim.this = r4;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            getPopExitAnim.this.f = true;
            getPopExitAnim.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            getPopExitAnim.this.f = false;
            getPopExitAnim.this.notifyDataSetInvalidated();
        }
    }

    public getPopExitAnim(Context context, Cursor cursor, boolean z) {
        boolean z2 = true;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.d = true;
        } else {
            this.d = false;
        }
        if (cursor == null) {
            z2 = false;
        }
        this.c = cursor;
        this.f = z2;
        this.b = context;
        this.h = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.a = new RemoteActionCompatParcelizer();
            this.g = new write();
        } else {
            this.a = null;
            this.g = null;
        }
        if (z2) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
            if (remoteActionCompatParcelizer != null) {
                cursor.registerContentObserver(remoteActionCompatParcelizer);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // o.getPopDirection.read
    public final Cursor a() {
        return this.c;
    }

    @Override // o.getPopDirection.read
    public Cursor a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.c;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return b(context, cursor, viewGroup);
    }

    @Override // o.getPopDirection.read
    public void a(Cursor cursor) {
        Cursor cursor2;
        Cursor cursor3 = this.c;
        if (cursor == cursor3) {
            cursor2 = null;
        } else {
            if (cursor3 != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.a;
                if (remoteActionCompatParcelizer != null) {
                    cursor3.unregisterContentObserver(remoteActionCompatParcelizer);
                }
                DataSetObserver dataSetObserver = this.g;
                if (dataSetObserver != null) {
                    cursor3.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.a;
                if (remoteActionCompatParcelizer2 != null) {
                    cursor.registerContentObserver(remoteActionCompatParcelizer2);
                }
                DataSetObserver dataSetObserver2 = this.g;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.h = cursor.getColumnIndexOrThrow("_id");
                this.f = true;
                notifyDataSetChanged();
                cursor2 = cursor3;
            } else {
                this.h = -1;
                this.f = false;
                notifyDataSetInvalidated();
                cursor2 = cursor3;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void b(View view, Cursor cursor);

    @Override // o.getPopDirection.read
    public CharSequence e(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    protected final void e() {
        Cursor cursor;
        if (this.d && (cursor = this.c) != null && !cursor.isClosed()) {
            this.f = this.c.requery();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            return null;
        }
        this.c.moveToPosition(i);
        View view2 = view;
        if (view == null) {
            view2 = a(this.b, this.c, viewGroup);
        }
        b(view2, this.c);
        return view2;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.j == null) {
            this.j = new getPopDirection(this);
        }
        return this.j;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.h);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            View view2 = view;
            if (view == null) {
                view2 = b(this.b, this.c, viewGroup);
            }
            b(view2, this.c);
            return view2;
        } else {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
