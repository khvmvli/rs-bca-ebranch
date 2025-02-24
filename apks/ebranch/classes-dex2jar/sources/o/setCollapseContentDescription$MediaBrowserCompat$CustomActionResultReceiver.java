package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes-dex2jar.jar:o/setCollapseContentDescription$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setCollapseContentDescription$MediaBrowserCompat$CustomActionResultReceiver<T> implements Iterator<T> {
    int a;
    int b;
    final int c;
    boolean d = false;
    final /* synthetic */ setCollapseContentDescription e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCollapseContentDescription$MediaBrowserCompat$CustomActionResultReceiver(setCollapseContentDescription setcollapsecontentdescription, int i) {
        this.e = setcollapsecontentdescription;
        this.c = i;
        this.b = setcollapsecontentdescription.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t = (T) this.e.d(this.a, this.c);
            this.a++;
            this.d = true;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d) {
            int i = this.a - 1;
            this.a = i;
            this.b--;
            this.d = false;
            this.e.a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
