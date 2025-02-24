package o;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.setRecyclerListener;
/* loaded from: classes-dex2jar.jar:o/setTargetFragment.class */
public final class setTargetFragment implements setScrollingTouchSlop, FragmentManager$6 {
    final setUserVisibleHint b;
    private final setScrollingTouchSlop c;
    private final setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTargetFragment$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Recreator {
        final ArrayList<Object> a = new ArrayList<>();
        private final setUserVisibleHint c;
        final String d;

        public RemoteActionCompatParcelizer(String str, setUserVisibleHint setuservisiblehint) {
            this.d = str;
            this.c = setuservisiblehint;
        }

        private void c(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.a.size()) {
                for (int size = this.a.size(); size <= i2; size++) {
                    this.a.add(null);
                }
            }
            this.a.set(i2, obj);
        }

        @Override // o.setPreserveFocusAfterLayout
        public final void a(int i, String str) {
            c(i, str);
        }

        @Override // o.setPreserveFocusAfterLayout
        public final void b(int i) {
            c(i, null);
        }

        @Override // o.setPreserveFocusAfterLayout
        public final void b(int i, double d) {
            c(i, Double.valueOf(d));
        }

        @Override // o.Recreator
        public final int c() {
            return ((Integer) this.c.a(new toString(this, new startIntentSenderForResult()))).intValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // o.setPreserveFocusAfterLayout
        public final void d(int i, long j) {
            c(i, Long.valueOf(j));
        }

        @Override // o.setPreserveFocusAfterLayout
        public final void d(int i, byte[] bArr) {
            c(i, bArr);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTargetFragment$write.class */
    static final class write implements Cursor {
        private final Cursor b;
        private final setUserVisibleHint c;

        public write(Cursor cursor, setUserVisibleHint setuservisiblehint) {
            this.b = cursor;
            this.c = setuservisiblehint;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
            this.c.c();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.b.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public final void deactivate() {
            this.b.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i) {
            return this.b.getBlob(i);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.b.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.b.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.b.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i) {
            return this.b.getColumnName(i);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.b.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.b.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            return this.b.getDouble(i);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.b.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            return this.b.getFloat(i);
        }

        @Override // android.database.Cursor
        public final int getInt(int i) {
            return this.b.getInt(i);
        }

        @Override // android.database.Cursor
        public final long getLong(int i) {
            return this.b.getLong(i);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            return setRecyclerListener.IconCompatParcelizer.c(this.b);
        }

        @Override // android.database.Cursor
        public final List<Uri> getNotificationUris() {
            return setRecyclerListener.RemoteActionCompatParcelizer.c(this.b);
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.b.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            return this.b.getShort(i);
        }

        @Override // android.database.Cursor
        public final String getString(int i) {
            return this.b.getString(i);
        }

        @Override // android.database.Cursor
        public final int getType(int i) {
            return this.b.getType(i);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.b.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.b.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.b.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.b.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.b.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.b.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            return this.b.isNull(i);
        }

        @Override // android.database.Cursor
        public final boolean move(int i) {
            return this.b.move(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.b.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.b.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.b.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i) {
            return this.b.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.b.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.b.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.b.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public final boolean requery() {
            return this.b.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.b.respond(bundle);
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            setRecyclerListener$MediaBrowserCompat$CustomActionResultReceiver.d(this.b, bundle);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.b.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public final void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            setRecyclerListener.RemoteActionCompatParcelizer.c(this.b, contentResolver, list);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.b.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.b.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public setTargetFragment(setScrollingTouchSlop setscrollingtouchslop, setUserVisibleHint setuservisiblehint) {
        this.c = setscrollingtouchslop;
        this.b = setuservisiblehint;
        if (setuservisiblehint.a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            setuservisiblehint.a = setscrollingtouchslop;
        }
        this.d = new setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver(setuservisiblehint);
    }

    @Override // o.FragmentManager$6
    public final setScrollingTouchSlop a() {
        return this.c;
    }

    @Override // o.setScrollingTouchSlop
    public final String b() {
        return this.c.b();
    }

    @Override // o.setScrollingTouchSlop
    public final void b(boolean z) {
        this.c.b(z);
    }

    @Override // o.setScrollingTouchSlop, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.d.close();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener d() {
        this.d.a.a(new setSharedElementEnterTransition());
        return this.d;
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener e() {
        this.d.a.a(new setSharedElementEnterTransition());
        return this.d;
    }
}
